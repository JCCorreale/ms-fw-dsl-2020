package itunibo.jcc.coap.roomstate
/*
 resourceObserverCoapClient.kt  
*/
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import org.eclipse.californium.core.CoapClient
import org.eclipse.californium.core.CoapHandler
import org.eclipse.californium.core.CoapObserveRelation
import org.eclipse.californium.core.CoapResponse
import itunibo.outgui.outguiSupport
import java.awt.Color
import it.unibo.kactor.ActorBasic
import java.util.Arrays
import itunibo.jcc.planner.adapter.CarrierPlannerAdapter
 
// ROOM CLIENT COAP ON PORT 5685

object carrierRoomStateClient {
	val roomStateResourceAddr = "coap://localhost:5685/roomstate" // "coap://192.168.43.67:5683"
//	val outDev            = outguiSupport.create("Fridge Coap OBSERVER", Color.yellow)
	
	lateinit var client: CoapClient
	lateinit var actor: ActorBasic
	lateinit var planner: CarrierPlannerAdapter
	
	// INITIALIZATION ONLY
	
	fun initPlanner() {
		
		val response = client.get()
		
		// content = [at(Item, Location), ...]
		val content = response!!.getResponseText().replace(" ", "") // Removes spaces
//		val items = itemsList(content)
		
		val regex = """at\(([A-Za-z]*),([A-Za-z]*)\)""".toRegex()
		var matches = regex.findAll(content)
		
		println("carrierRoomStateObserver | initPlanner $matches")
		
		matches.forEach {
			val term = regex.matchEntire(it.value)
			println("term $term")
			val itemStr = term!!.groups[1]!!.value
			val locationStr = term!!.groups[2]!!.value
			
			if (itemStr != "butler") {
				// Initialization -> only "put"
				planner.put(itemStr, locationStr)
			}
			else planner.goto(locationStr)
		}
	}
	
	fun itemsList(content: String): List<String> {
		return content.trim().replace("[", "").replace("]", "").split(",")
	}
	
	fun create(actor: ActorBasic, planner: CarrierPlannerAdapter, resourceAddr : String = roomStateResourceAddr){
		this.client   = CoapClient( resourceAddr )
		this.actor = actor
		this.planner = planner
	}
}