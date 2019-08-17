package itunibo.jcc.planner.model;

import aima.core.agent.Action

abstract class ActionButler : Action {
	
	override fun isNoOp(): Boolean {
		return false;
	}
	
	abstract fun applyTo(state: SystemState): SystemState
	
	abstract fun isApplicableTo(state: SystemState): Boolean
	
	abstract fun getCost(from: SystemState, to: SystemState): Double
}