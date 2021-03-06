package itunibo.jcc.coap.fridge.client

import org.eclipse.californium.core.CoapClient
import org.eclipse.californium.core.coap.MediaTypeRegistry

class MyCoapClient(serverAddr: String, port: Int, resourceName: String?) {
	
	private val coapClient: CoapClient
	private val baseUri: String
	
	init {
		baseUri = "coap://$serverAddr:" + port + "/" + resourceName
		coapClient = CoapClient(baseUri)
		println("Client started")
	}
	
	fun setUriParams(vararg params: String) {
		coapClient.setURI(baseUri + "/" + params.joinToString("/"))
		println("MyCoapClient | setUriParams | ${coapClient.getURI()}")
	}
	
	fun clearUriParams() {
		coapClient.setURI(baseUri)
	}
	
	fun synchGet() : String { //Synchronously send the GET message (blocking call)
		println("%%% synchGet ")
	//		CoapResponse coapResp = coapClient.advanced(request);
		val coapResp = coapClient.get()
	//The "CoapResponse" message contains the response.
		//println(Utils.prettyPrint(coapResp))
		println(coapResp.responseText)
		return coapResp.responseText
	}
	
//	fun put(v: String) {
//		val coapResp = coapClient.put(v, MediaTypeRegistry.TEXT_PLAIN)
//	//The "CoapResponse" message contains the response.
//		println("%%% ANSWER put $v:")
//		//println(Utils.prettyPrint(coapResp))
//		println(coapResp.responseText)
//	}
	
//	fun asynchGet() {
//		coapClient.get( AsynchListener );
//	}
	
}
