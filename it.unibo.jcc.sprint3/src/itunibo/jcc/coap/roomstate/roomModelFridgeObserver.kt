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

// FRIDGE ON PORT 5684 
 
object roomModelFridgeObserver : CoapHandler {
	val fridgeResourceAddr = "coap://localhost:5684/fridgeresource" // "coap://192.168.43.67:5683"
//	val outDev            = outguiSupport.create("Fridge Coap OBSERVER", Color.yellow)
	
	lateinit var actor: ActorBasic;
	
	override fun onLoad(response: CoapResponse?) {
		// content = [item1, item2, ..., itemN]
		val content = response!!.getResponseText()
		val items = itemsList(content)
		
		println("roomModelFridgeObserver | onload $items")
//
		var butlerAtFridge = false
		// Preserve butler if present
		actor.solve("at(butler,fridge)")
		if (actor.solveOk()) {
			butlerAtFridge = true
		}
		
		actor.solve(" retractall( at(X, fridge) ) ")
		
		items.forEach({
			actor.solve(" assert( at($it, fridge) ) ")
		})
		
		
		// Preserve butler if present
		if (butlerAtFridge) {
			actor.solve(" assert( at(butler, fridge) ) ")
		}
		
		roomModelResourceCoap.updateState()
	}
	
	fun itemsList(content: String): List<String> {
		return content.trim().replace("[", "").replace("]", "").split(",")
	}
	
	override fun onError() {
//		outguiSupport.output("fridgeObserverCoapClient Error")
	}
	
	fun create(actor: ActorBasic, resourceAddr : String = fridgeResourceAddr){
		val client   = CoapClient( resourceAddr )
		this.actor = actor
		client.observe(  roomModelFridgeObserver )
	}
}