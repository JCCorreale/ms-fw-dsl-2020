package itunibo.jcc.planner.adapter

import itunibo.jcc.planner.framework.Planner
import itunibo.jcc.planner.model.*
import it.unibo.kactor.ActorBasic
import aima.core.search.framework.problem.Problem
import aima.core.search.uninformed.BreadthFirstSearch
import aima.core.search.uninformed.UniformCostSearch

class CarrierPlannerAdapter : Planner {
	
	private var state = SystemState();
	
	private lateinit var actor: ActorBasic;
	
	// TODO Single "at" method to be different from actions?!
	
	fun goto(location: String) {
		state = state.withButlerLocation { Location[location] }
	}
	
	fun put(item: String, location: String) {
		state = state.withButlerLoad { it.remove(Item[item]) }
					.withLocationItems { it.getOrPut(Location[location]) { mutableListOf<Item>() }.add(Item[item]) }
	}
	// TODO Implicitly from butler location (unify!!!)
	fun take(item: String/*, location: String*/) {
		state = state.withButlerLoad { it.add(Item[item]) }
					.withLocationItems { it[/*Location[location]*/state.butlerLocation]!!.remove(Item[item]) }
	}
	
	// OLD
//	fun update(item: String, location: String) {
//		if (location.toUpperCase() == "BUTLER")
////			 Butler is not a real location, just remove the item from the map
//			state.locations.remove(Item.valueOf(item.toUpperCase()))
//		else
//			state.locations[Item.valueOf(item.toUpperCase())] = Location.valueOf(location.toUpperCase())
//	}
	
	/**
	 * Expects at(Item,Location) as goal
	 */
	override fun planGoal(actor: ActorBasic, goal: String) {
		val regex = """at\(([A-Za-z]*),([A-Za-z]*)\)""".toRegex()
		val matches = regex.matchEntire(goal)
		val itemStr = matches!!.groups[1]!!.value
		val locationStr = matches!!.groups[2]!!.value
		
		// TODO Multiple items? Butler as special case...
		val goalState = if (itemStr != "butler") SystemState().withLocationItems { it.put(Location[locationStr], mutableListOf(Item[itemStr])) }
						else SystemState().withButlerLocation { Location[locationStr] }
		
		println("CarrierPlannerAdapter | planGoal | item=${Item[itemStr]} location=${Location[locationStr]}")
		
		val problem = Problem(
			state,
			{ state ->
				ActionGoto.getAllApplicable(state as SystemState) union
					ActionTake.getAllApplicable(state) union
						ActionPut.getAllApplicable(state)
			}, 
			{ state, action -> (action as ActionButler).applyTo(state as SystemState) },
			{ state -> (state as SystemState).includes(goalState) },
			{ from, action, to -> (action as ActionButler).getCost(from as SystemState, to as SystemState) })
		
		// TODO Agent
		
		val search = BreadthFirstSearch()
		
		println("CarrierPlannerAdapter | planGoal | Searching solution...")
				
		val actions = search.findActions(problem)
		
		// TODO
		println("CarrierPlannerAdapter | planGoal | actions=$actions")
		
		actions.forEach({ actor.solve("assert( move( $it ) )") })
	}
}