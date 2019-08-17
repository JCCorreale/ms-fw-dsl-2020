package itunibo.jcc.planner.adapter

import itunibo.jcc.planner.framework.Planner
import itunibo.jcc.planner.model.*import itunibo.jcc.planner.model.Item.BUTLER
import it.unibo.kactor.ActorBasic
import aima.core.search.framework.problem.Problem
import aima.core.search.uninformed.BreadthFirstSearch

class CarrierPlannerAdapter : Planner {
	
	private var state = SystemState(mutableMapOf<Item, Location>(), false);
	
	private lateinit var actor: ActorBasic;
	
	fun update(item: String, location: String) {
		if (location.toUpperCase() == "BUTLER")
			// Butler is not a real location, just remove the item from the map
			state.locations.remove(Item.valueOf(item.toUpperCase()))
		else
			state.locations[Item.valueOf(item.toUpperCase())] = Location.valueOf(location.toUpperCase())
	}
	
	/**
	 * Expects at(Item,Location) as goal
	 */
	override fun planGoal(actor: ActorBasic, goal: String) {
		val regex = """at\(([A-Za-z]*),([A-Za-z]*)\)""".toRegex()
		val matches = regex.matchEntire(goal)
		val itemStr = matches!!.groups[1]!!.value
		val locationStr = matches!!.groups[2]!!.value
		
		val item = Item.valueOf(itemStr.toUpperCase())
		val location = Location.valueOf(locationStr.toUpperCase())
		
		println("CarrierPlannerAdapter | planGoal | item=$item location=$location")
		
		val goalState =  SystemState(mutableMapOf<Item, Location>(
			item to location
		), false)
		
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
		
		val breadthFirstSearch = BreadthFirstSearch();
		
		println("CarrierPlannerAdapter | planGoal | Searching solution...")		
				
		val actions = breadthFirstSearch.findActions(problem)
		
		// TODO
		println("CarrierPlannerAdapter | planGoal | actions=$actions")
		
		actions.forEach({ actor.solve("assert( move( $it ) )") })
	}
}