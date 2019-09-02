package itunibo.jcc.planner.model;

import java.lang.UnsupportedOperationException

public class SystemState(
		val locationItems: Map<Location, List<Item>>,
	    val butlerLoad: List<Item>,
		val butlerLocation: Location // TODO Frame problem?
	) {
	
	// Constructor
	
	constructor() : this(mapOf<Location, List<Item>>(), listOf<Item>(), Location.UNSPECIFIED) {}
	
//	private constructor(other: SystemState) :
//			this(mutableMapOf<Location, List<Item>>(), other.butlerLoad.toList(), other.butlerLocation) {
//		other.locationItems.forEach({
//			(locationItems as MutableMap<Location, List<Item>>)[it.key] = it.value.toList()
//		})
//	}
	
	// "Builder" pattern
	
	fun withLocationItems(modifier: (MutableMap<Location, MutableList<Item>>) -> Unit): SystemState {
	    val locationItems = locationItems.mapValues { it.value.toMutableList() }.toMutableMap()
		modifier(locationItems)
		return SystemState(
			locationItems.toMap(),
			butlerLoad.toList(),
			butlerLocation
		)
	}
	
	fun withButlerLoad(modifier: (MutableList<Item>) -> Unit): SystemState {
	    val butlerLoad = butlerLoad.toMutableList()
		modifier(butlerLoad)
		return SystemState(
			locationItems.toMap(),
			butlerLoad.toList(),
			butlerLocation
		)
	}

	fun withButlerLocation(producer: () -> Location): SystemState {
		return SystemState(
			locationItems.toMap(),
			butlerLoad.toList(),
			producer()
		)
	}
	
	// FRAME PROBLEM
	fun includes(other: SystemState): Boolean {
		// All "other" locations must be specified and have at least all "other" items
		other.locationItems.forEach({
			if (!locationItems.containsKey(it.key))
				return false
			if (!locationItems[it.key]!!.containsAll(other.locationItems[it.key]!!))
				return false
		})
		// "other" butler load must be included in "this" butler load
		if (!butlerLoad.containsAll(other.butlerLoad))
			return false
		// If "other" butler location in unspecified, any "this" location is ok
		if (other.butlerLocation === Location.UNSPECIFIED)
			return true
		// Otherwise they must be the same
		else
			return other.butlerLocation === butlerLocation
	}
	
	override fun equals(other: Any?): Boolean {
		return (other as SystemState).locationItems == locationItems &&
				other.butlerLoad == butlerLoad &&
				other.butlerLocation == butlerLocation
	}
}