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
import itunibo.outgui.OutDevPanel
import itunibo.outgui.Utils
import java.awt.BorderLayout


class roomModelObserverCoapClient(color: Color, row: Int, col: Int, subresource: String) : CoapHandler {

	companion object {
		fun create(guiColor: Color, row: Int, col: Int, subresource: String = ""){
			val client   = CoapClient( "coap://localhost:5685/roomstate/$subresource" )
			//val relation =
			client.observe(  roomModelObserverCoapClient(guiColor, row, col, subresource) ) 
			//relation!!.proactiveCancel()   /AT THE END
		}
	}
	
	val outDev: OutDevPanel
	
	init {
		val frame = Utils.initFrame()
		outDev = OutDevPanel( 19, 60, color, Color.black )
		frame.add(BorderLayout.CENTER, outDev )
		frame.setTitle("roomstate/$subresource");
		frame.setLocation(col * frame.getWidth(), row * frame.getHeight())
		frame.validate()
		//frame.add(BorderLayout.CENTER,p);
	}
	
	override fun onLoad(response: CoapResponse?) {
		val content = response!!.getResponseText()
		output("$content")
	}
	override fun onError() {
		output("roomModelObserverCoapClient Error")
	}
	
	fun output( msg : String ){
		outDev.println( msg )
	}
}
 