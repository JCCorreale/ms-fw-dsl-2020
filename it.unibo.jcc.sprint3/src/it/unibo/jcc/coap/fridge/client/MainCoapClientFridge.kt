/*
 MainCoapClientModelRobot.kt
 */
package itunibo.coap.client

import org.eclipse.californium.core.CoapClient
import org.eclipse.californium.core.CoapResponse
import org.eclipse.californium.core.Utils
import org.eclipse.californium.core.coap.MediaTypeRegistry
import itunibo.coap.observer.AsynchListener
	
	// FRIDGE ON PORT 5684 

	fun main() {
		val hostAddr = "localhost" // "192.168.43.67 3"

		val resourceName = "fridgeresource"
		//createClient("localhost", 5684, resourceName)
		val client = it.unibo.jcc.coap.fridge.client.MyCoapClient(hostAddr, 5684, resourceName)

		// List all contents
		client.synchGet()
		
		// 1
		client.setUriParams("caviar")
		client.synchGet()
		
		
		// 2
		client.setUriParams("pizza")
		client.synchGet()	
		
		// 0
		client.setUriParams("sausage")
		client.synchGet()
		
//		put("w")
//		Thread.sleep(1500)
//		synchGet()
//		put("s")
//		synchGet()
//		Thread.sleep(500)
//		put("h")
//		Thread.sleep(10)
//		synchGet()
//		put("a")
//		Thread.sleep(500)
//		synchGet()
//		put("d")
//		Thread.sleep(500)
//		synchGet()
//		put("h")
//		Thread.sleep(100)
//		synchGet()
		 
	}
