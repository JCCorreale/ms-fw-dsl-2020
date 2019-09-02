package itunibo.jcc.planner.model

interface PlannerPolicy {
	
	fun acceptState(state: SystemState)
}