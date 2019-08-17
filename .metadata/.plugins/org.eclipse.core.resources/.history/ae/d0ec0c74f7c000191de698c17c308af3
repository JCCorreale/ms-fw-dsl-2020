package itunibo.jcc.planner.model;

import aima.core.agent.Action

import itunibo.jcc.planner.model.Item.*
import kotlinx.coroutines.yield

class ActionTake(
	private val what: Item
) : ActionButler() {
	
	init {
		if (what == BUTLER)
			throw IllegalArgumentException("Butler can't be taken")
	}

	override fun applyTo(state: SystemState): SystemState {
		val newState = SystemState(state)
		newState.locations.remove(what)
		newState.butlerLoaded = true
		return newState
	}

	override fun isApplicableTo(state: SystemState): Boolean {
		return state.locations.contains(what) &&
				state.locations[BUTLER] == state.locations[what] &&
				!state.butlerLoaded
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
			enumValues<Item>().forEach {
				if (it != BUTLER) {
					val action = ActionTake(it)
					if (action.isApplicableTo(state))
						actions.add(action)
				}
			}
			return actions
		}
	}
}