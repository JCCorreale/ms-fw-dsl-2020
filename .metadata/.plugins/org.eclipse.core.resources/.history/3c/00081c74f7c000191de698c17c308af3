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
 
fun main() = runBlocking {
	
	val initialState = SystemState(mutableMapOf<Item, Location>(
		BUTLER to TABLE,
		FOOD to FRIDGE,
		DISHES to PANTRY
	), false)
	
	val goalState =  SystemState(mutableMapOf<Item, Location>(
//		BUTLER to TABLE, // If an equality check is used, needs to know also the state of the butler (frame problem...)
//		FOOD to TABLE,
//		DISHES to TABLE
//		DISHES to DISHWASHER
		BUTLER to HOME
	), false)
	
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
	
	val breadthFirstSearch = BreadthFirstSearch();
	println(breadthFirstSearch.findActions(problem));
} 