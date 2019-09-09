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


object roomModelObserverCoapClient : CoapHandler {
	val roomModelResourceAddr = "coap://localhost:5685/roomstate" // "coap://192.168.43.67:5683"
	val outDev            = outguiSupport.create("Room model Coap OBSERVER", Color.red)
	
	override fun onLoad(response: CoapResponse?) {
		val content = response!!.getResponseText()
		outguiSupport.output("$content"  )
	}
	override fun onError() {
		outguiSupport.output("roomModelObserverCoapClient Error")
	}
	
	fun create(resourceAddr : String = roomModelResourceAddr){
		val client   = CoapClient( resourceAddr )
		//val relation =
		client.observe(  roomModelObserverCoapClient ) 
		//relation!!.proactiveCancel()   /AT THE END
	}
}
 