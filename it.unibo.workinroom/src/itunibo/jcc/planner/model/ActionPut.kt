package itunibo.jcc.planner.model;

import aima.core.agent.Action

import itunibo.jcc.planner.model.Item.*
import kotlinx.coroutines.yield

class ActionPut(
	private val what: Item,
	private val where: Location
) : ActionButler() { 
	
//	init {
//		if (what == BUTLER)
//			throw IllegalArgumentException("Butler can't be put")
//	}

	override fun applyTo(state: SystemState): SystemState {
		return state
			.withLocationItems { it.getOrPut(where) { mutableListOf<Item>() }.add(what) }
			.withButlerLoad { it.remove(what) }
		
//		val newState = SystemState(state)
//		newState.locations.put(what, where)
//		newState.butlerLoaded = false
//		return newState
	}

	override fun isApplicableTo(state: SystemState): Boolean {
		return state.butlerLoad.contains(what) &&
				state.butlerLocation == where
	}
	
	override fun getCost(from: SystemState, to: SystemState): Double {
		return 1.0 // TODO Estimate/calculate cost from lower level?
	}
	
	override fun toString(): String {
		//return "${this::class.java.kotlin.simpleName} what=$what where=$where "
		return "put(${what.toString().toLowerCase()},${where.toString().toLowerCase()})"
	}
	
	companion object {
		fun getAllApplicable(state: SystemState): Set<Action> {
			val actions = mutableSetOf<Action>()
			Location.locations.values.forEach { location ->
				Item.items.values.forEach { item ->
					// No need to handle the butler explicitly anymore
					val action = ActionPut(item, location)
					if (action.isApplicableTo(state))
						actions.add(action)
				}
			}
			
			return actions
		}
	}
}