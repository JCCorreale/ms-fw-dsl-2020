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


object roomMapModelObserverCoapClient : CoapHandler {
	
	val roomModelResourceAddr = "coap://localhost:5683/resourcemodel" // "coap://192.168.43.67:5683"
	
	lateinit var actor: ActorBasic
	
//	var first = true
	var prevContent: String? = null
	
	override fun onLoad(response: CoapResponse?) {
		val content = response!!.getResponseText()
//		println("roomMapModelObserverCoapClient | onLoad | prevContent=$prevContent content=$content")
		if (prevContent != null && content != prevContent && content.startsWith("roomMap")) {
			println("roomMapModelObserverCoapClient | $content")
			// Butler is moving, removes current location // TODO Change state to "moving"?
			actor.solve("retract( at(butler,X) )") // TODO retractall?
			if (actor.solveOk()) {
				// Update COAP resource
				roomModelResourceCoap.updateState()
			}
			prevContent = content
		}
		if (prevContent == null && content.startsWith("roomMap"))
			prevContent = content
		// First 
//		first = false
	}
	
	
	override fun onError() {
		println("roomMapModelObserverCoapClient Error")
	}
	
	fun create(actor: ActorBasic, resourceAddr : String = roomModelResourceAddr){
		val client   = CoapClient( resourceAddr )
		this.actor = actor
		//val relation =
		client.observe(  roomMapModelObserverCoapClient )
		//relation!!.proactiveCancel()   /AT THE END
	}
}
 