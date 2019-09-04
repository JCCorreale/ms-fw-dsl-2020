package itunibo.jcc.planner.adapter

import itunibo.jcc.planner.framework.Planner
import itunibo.jcc.planner.model.*
import it.unibo.kactor.ActorBasic
import aima.core.search.framework.problem.Problem
import aima.core.search.uninformed.BreadthFirstSearch
import aima.core.agent.Action

class GotoPlannerAdapter : Planner {
	
	private lateinit var state: SystemState;
	
	private lateinit var actor: ActorBasic;
	
	fun update(location: String) {
		state = SystemState().withButlerLocation { Location[location] }
	}
	
	/**
	 * Expects goto(L) as goal
	 */
	override fun planGoal(actor: ActorBasic, goal: String) {
		val regex = """goto\(([A-Za-z]*)\)""".toRegex()
		val matches = regex.matchEntire(goal)
		val locationStr = matches!!.groups[1]!!.value
		
		val location = Location[locationStr]
		
		val goalState =  SystemState().withButlerLocation { location }
		
		val problem = Problem(
			state,
			{ state ->
				ActionGoto.getAllApplicable(state as SystemState) union
					ActionTake.getAllApplicable(state) union
						ActionPut.getAllApplicable(state)
			}, 
			{ state, action -> (action as ActionButler).applyTo(state as SystemState) },
			{ state -> state == goalState },
			{ from, action, to -> (action as ActionButler).getCost(from as SystemState, to as SystemState) })
		
		// TODO Agent
		
		val breadthFirstSearch = BreadthFirstSearch();
		
		val actions = breadthFirstSearch.findActions(problem)
		
		// TODO
		println(actions);
		
		actions.forEach({
			
			if (!it.isNoOp())
				actor.solve("assert( move( $it ) )")
		})
		
	}
}