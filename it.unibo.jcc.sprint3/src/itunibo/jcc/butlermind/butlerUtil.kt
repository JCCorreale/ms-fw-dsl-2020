package itunibo.jcc.butlermind

import it.unibo.kactor.ActorBasic
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object butlerUtil {
	
	fun setClearGoals(actor: ActorBasic, target: String) {
		val items = getItems().minus("butler") // TODO Workaround
		
		//
		println("setClearGoals | items = $items")
		
		val goals = items.map {
			if (it == "dishes")
				"at(dishes,dishwasher)"
			else
				"at($it,fridge)"
		}.plus("at(butler,home)")
		
		//
		println("setClearGoals | goals = $goals")
		
		GlobalScope.launch {
			goals.forEach {
				actor.forward("setGoal", "setGoal($it)", target)
			}
		}
	}
	
	fun getItems(): List<String> {
		val client = itunibo.jcc.coap.fridge.client.MyCoapClient("localhost", 5685, "roomstate")
		client.setUriParams("table")
		val state = client.synchGet()
		return itemsList(state)
	}
	
	fun itemsList(content: String): List<String> {
		return content.trim().replace("[", "").replace("]", "").split(",")
	}
}