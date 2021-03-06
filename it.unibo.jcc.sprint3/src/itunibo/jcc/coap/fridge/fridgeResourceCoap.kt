package itunibo.jcc.coap.fridge

import org.eclipse.californium.core.CoapResource
import org.eclipse.californium.core.CoapServer
import org.eclipse.californium.core.coap.CoAP.Type
import org.eclipse.californium.core.server.resources.CoapExchange
import org.eclipse.californium.core.coap.CoAP.ResponseCode
import org.eclipse.californium.core.coap.MediaTypeRegistry
import org.eclipse.californium.core.server.resources.Resource
import it.unibo.kactor.ActorBasic

// LISTENS ON PORT 5684 (to allow multiple servers on same host!)

class fridgeResourceCoap (name : String ) : CoapResource(name) {
	
	companion object {
		lateinit var actor : ActorBasic
//		var curmodelval = "unknown"
		lateinit var resourceCoap : fridgeResourceCoap
		
		fun create( a: ActorBasic, name: String  ){
			actor = a
			val server   = CoapServer(5684);		//COAP SERVER
			resourceCoap = fridgeResourceCoap( name )
			server.add( resourceCoap );
			println("--------------------------------------------------")
			println("$name Coap Server started");	
			println("--------------------------------------------------")
			server.start();
//			resourceModelSupport.setCoapResource(resourceCoap)  //Injects a reference
 		}		
	}
	
	init{ 
		println("--------------------------------------------------")
		println("$name modelResourceCoap init")
		println("--------------------------------------------------")
		setObservable(true) 				// enable observing	!!!!!!!!!!!!!!
		setObserveType(Type.CON)			// configure the notification type to CONs
		//getAttributes().setObservable();	// mark observable in the Link-Format			
	}
	
	fun updateState() {
// 		actor.solve("model( actuator, robot, state(STATE) )")
//		curmodelval = actor.getCurSol("STATE").toString()
//		curmodelval = modelitem
		//println("%%%%%%%%%%%%%%%% updateState from $curState to $curmodelval" )
		changed()	// notify all CoAp observers		
        	/*
        	 * Notifies all CoAP clients that have established an observe relation with
        	 * this resource that the state has changed by reprocessing their original
        	 * request that has established the relation. The notification is done by
        	 * the executor of this resource or on the executor of its parent or
        	 * transitively ancestor. If no ancestor defines its own executor, the
        	 * thread that has called this method performs the notification.
        	 */
	}
	 
	override fun handleGET(exchange: CoapExchange?) {
		
		val uriPath = exchange?.getRequestOptions()?.uriPath;
		
		println(uriPath)
		
        // check if there is a sub-resource given, and if so use it for processing
        if (uriPath!!.size > 1) {
			checkContentExists(uriPath.last(), exchange)
        } else {
//            listAllContents(exchange)
			exchange!!.respond(ResponseCode.CONTENT, listAllContents(), MediaTypeRegistry.TEXT_PLAIN)
        }
		
 		//println("%%%%%%%%%%%%%%%% handleGET  curmodelval=$curmodelval  "  )			
//		exchange!!.respond(ResponseCode.CONTENT, curmodelval, MediaTypeRegistry.TEXT_PLAIN)
	}
	
	fun listAllContents(): String {
		actor.solve("findall( Food, content( Food ), Contents )")
		return actor.getCurSol("Contents").toString()
//		exchange!!.respond(ResponseCode.CONTENT, contents, MediaTypeRegistry.TEXT_PLAIN)
	}
	
	fun checkContentExists(content: String, exchange: CoapExchange?) {
		
		println("checkContentExists $content")
		actor.solve("count( content( $content ), Count )")
		println("checkContentExists after solve")
		val count = actor.getCurSol("Count").toString()
		exchange!!.respond(ResponseCode.CONTENT, count, MediaTypeRegistry.TEXT_PLAIN)
	}
	
    override fun getChild(name: String): Resource {
        // even sub-resources will land in the GET of this resource
        return this;
    }
}