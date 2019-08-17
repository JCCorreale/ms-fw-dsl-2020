package itunibo.jcc.planner.model;

import aima.core.agent.Action

import itunibo.jcc.planner.model.Item.*
import kotlinx.coroutines.yield

class ActionGoto(
	private val whereTo: Location
) : ActionButler() {

	override fun applyTo(state: SystemState): SystemState {
		val newState = SystemState(state)
		newState.locations[BUTLER] = whereTo
		return newState
	}

	override fun isApplicableTo(state: SystemState): Boolean {
		return state.locations[BUTLER] != whereTo
	}
	
	override fun getCost(from: SystemState, to: SystemState): Double {
		return 1.0 // TODO Estimate/calculate cost from lower level?
	}
	
	override fun toString(): String {
		//return "${this::class.java.kotlin.simpleName} whereTo=$whereTo"
		return "goto(${whereTo.toString().toLowerCase()})"
	}
	
	companion object {
		fun getAllApplicable(state: SystemState): Set<Action> {
			val actions = mutableSetOf<Action>()
			enumValues<Location>().forEach {
				val action = ActionGoto(it)
				if (action.isApplicableTo(state))
					actions.add(action)
			}
			return actions
		}
	}
}