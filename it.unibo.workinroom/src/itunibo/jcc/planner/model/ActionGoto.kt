package itunibo.jcc.planner.model;

import aima.core.agent.Action

import itunibo.jcc.planner.model.Item.*
import kotlinx.coroutines.yield

class ActionGoto(
	private val whereTo: Location
) : ActionButler() {

	override fun applyTo(state: SystemState): SystemState {
		return state.withButlerLocation { whereTo }
	}

	override fun isApplicableTo(state: SystemState): Boolean {
		return state.butlerLocation != whereTo
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
			Location.locations.values.forEach {
				val action = ActionGoto(it) 
				if (action.isApplicableTo(state))
					actions.add(action)
			}
			return actions
		}
	}
}