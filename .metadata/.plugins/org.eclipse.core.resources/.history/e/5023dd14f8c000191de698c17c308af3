package it.unibo.jcc.sprint1.test.utils

import org.eclipse.californium.core.CoapHandler
import org.eclipse.californium.core.CoapResponse
import org.eclipse.californium.core.CoapClient

object robotMindObserver : CoapHandler {
	
	val log = mutableListOf<String>()
	
	val robotResourceAddr = "coap://localhost:5683/resourcemodel"
	
	fun create(resourceAddr : String = robotResourceAddr){
		val client   = CoapClient( resourceAddr )
		client.observe(  robotMindObserver )
		println("RobotMindObserver create")
	}
	
	override fun onLoad(response: CoapResponse?) {
		val content = response!!.getResponseText()
		
		if (content.startsWith("robot")) {
			log.add(content)
			println("RobotMindObserver content ${content}")
		}
		
////		outguiSupport.output("$content"  )
//		try{
//			val rt = Term.createTerm(content) as Struct
//			val map = "${rt.getArg(0)}".replace("'","").replace("@","\n")
//			outguiSupport.output(  map  )
//		}catch( e: Exception){
//			outguiSupport.output( "ERROR = ${e}" )
//		}
//		
		
	}
	override fun onError() {
		println("RobotMindObserver Error")
	}
}