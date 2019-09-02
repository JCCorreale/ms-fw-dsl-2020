package itunibo.jcc.planner.model;

import aima.core.agent.Action

import itunibo.jcc.planner.model.Item.*
import kotlinx.coroutines.yield

class ActionTake(
	private val what: Item
) : ActionButler() {
	
//	init {
//		if (what == BUTLER)
//			throw IllegalArgumentException("Butler can't be taken")
//	}

	override fun applyTo(state: SystemState): SystemState {
		// Assuming the state contains the butler location and it is present in the map (otherwise not applicable)
		return state.withLocationItems { it[state.butlerLocation]!!.remove(what) }.withButlerLoad { it.add(what) }
	}

	override fun isApplicableTo(state: SystemState): Boolean {
		return state.locationItems.containsKey(state.butlerLocation) &&
				state.locationItems[state.butlerLocation]!!.contains(what) &&
				// Assuming butler can carry only one item at once!
				state.butlerLoad.isEmpty() // TODO Butler load policy
	}
	
	override fun getCost(from: SystemState, to: SystemState): Double {
		return 1.0 // TODO Estimate/calculate cost from lower level?
	}
	
	override fun toString(): String {
		//return "${this::class.java.kotlin.simpleName} what=$what"
		return "take(${what.toString().toLowerCase()})"
	}
	
	companion object {
		fun getAllApplicable(state: SystemState): Set<Action> {
			val actions = mutableSetOf<Action>()
			Item.items.values.forEach {
				val action = ActionTake(it)
				if (action.isApplicableTo(state))
					actions.add(action)
			}
			return actions
		}
	}
}