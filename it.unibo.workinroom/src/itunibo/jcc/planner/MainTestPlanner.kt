package itunibo.jcc.planning

import kotlin.collections.*
import kotlinx.coroutines.runBlocking
import itunibo.jcc.planner.model.*
import itunibo.jcc.planner.model.Location.*
import itunibo.jcc.planner.model.Item.*
import aima.core.search.framework.problem.Problem;
import aima.core.agent.Action
import aima.core.search.framework.problem.ActionsFunction
import aima.core.search.uninformed.BreadthFirstSearch
import aima.core.search.uninformed.UniformCostSearch
 
fun main() = runBlocking {
	
	val initialState = SystemState(mapOf<Location, List<Item>>(
//		Location["home"]  to listOf(Item["butler"]),
//		Location["table"]  to listOf(Item["butler"]),
		Location["fridge"] to listOf(Item["pizza"], Item["caviar"]),
		Location["pantry"] to listOf(Item["dishes"])
	), emptyList(), Location["home"])
	
	val goalState =  SystemState(mapOf<Location, List<Item>>(
//		BUTLER to TABLE, // If an equality check is used, needs to know also the state of the butler (frame problem...)
//		Location["home"]  to listOf(Item["butler"]),
		Location["table"] to listOf(Item["dishes"], Item["pizza"]/*, Item["caviar"]*/)
//		FOOD to TABLE,
//		DISHES to TABLE
//		DISHES to DISHWASHER
//		BUTLER to HOME
	), emptyList(), Location["home"])
	
	val problem = Problem(
		initialState,
		{ state ->		
			ActionGoto.getAllApplicable(state as SystemState) union
				ActionTake.getAllApplicable(state) union
					ActionPut.getAllApplicable(state)
		}, 
		{ state, action -> (action as ActionButler).applyTo(state as SystemState) },
//		{ state -> state == goalState },
		{ state -> (state as SystemState).includes(goalState) },
		{ from, action, to -> (action as ActionButler).getCost(from as SystemState, to as SystemState) })
	
	// TODO Agent
	
	val search = BreadthFirstSearch()
	println(search.findActions(problem));
} 