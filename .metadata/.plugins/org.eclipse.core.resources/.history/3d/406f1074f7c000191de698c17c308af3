package itunibo.jcc.planner.model;

public class SystemState(
	val locations: MutableMap<Item, Location>,
    var butlerLoaded: Boolean
	) {

	constructor(other: SystemState) :
		this(other.locations.toMutableMap(), other.butlerLoaded)
	
	fun includes(other: SystemState): Boolean {
		return this.locations.entries.containsAll(other.locations.entries)
	}
	
	override fun equals(other: Any?): Boolean {
		return (other as SystemState).locations == this.locations
	}
}