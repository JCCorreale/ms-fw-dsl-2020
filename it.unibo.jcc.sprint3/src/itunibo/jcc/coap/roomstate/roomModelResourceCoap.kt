package itunibo.jcc.coap.roomstate

import org.eclipse.californium.core.CoapResource
import org.eclipse.californium.core.CoapServer
import org.eclipse.californium.core.coap.CoAP.Type
import org.eclipse.californium.core.server.resources.CoapExchange
import org.eclipse.californium.core.coap.CoAP.ResponseCode
import org.eclipse.californium.core.coap.MediaTypeRegistry
import org.eclipse.californium.core.server.resources.Resource
import it.unibo.kactor.ActorBasic

class roomModelResourceCoap (name : String ) : CoapResource(name) {
	
	// LISTEN ON PORT 5685
	
	companion object {
		lateinit var actor : ActorBasic
//		var curmodelval = "unknown"
		lateinit var resourceCoap : roomModelResourceCoap
		
		fun create( a: ActorBasic, name: String  ){
			actor = a
			val server   = CoapServer(5685);		//COAP SERVER
			resourceCoap = roomModelResourceCoap( name )
			server.add( resourceCoap );
			println("--------------------------------------------------")
			println("$name Coap Server started");	
			println("--------------------------------------------------")
			server.start();
//			resourceModelSupport.setCoapResource(resourceCoap)  //Injects a reference
		}
		
		fun updateState() {
	// 		actor.solve("model( actuator, robot, state(STATE) )")
	//		curmodelval = actor.getCurSol("STATE").toString()
	//		curmodelval = modelitem
			//println("%%%%%%%%%%%%%%%% updateState from $curState to $curmodelval" )
			resourceCoap.changed()	// notify all CoAp observers		
	        	/*
	        	 * Notifies all CoAP clients that have established an observe relation with
	        	 * this resource that the state has changed by reprocessing their original
	        	 * request that has established the relation. The notification is done by
	        	 * the executor of this resource or on the executor of its parent or
	        	 * transitively ancestor. If no ancestor defines its own executor, the
	        	 * thread that has called this method performs the notification.
	        	 */
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
	 
	override fun handleGET(exchange: CoapExchange?) {
		exchange!!.respond(ResponseCode.CONTENT, listAllContents(), MediaTypeRegistry.TEXT_PLAIN)
	}
	
	fun listAllContents(): String {
		actor.solve("findall(at(Item, Location), at(Item, Location), List)")
		return actor.getCurSol("List").toString()
//		exchange!!.respond(ResponseCode.CONTENT, contents, MediaTypeRegistry.TEXT_PLAIN)
	}
	
    override fun getChild(name: String): Resource {
        // even sub-resources will land in the GET of this resource
        return this;
    }
}