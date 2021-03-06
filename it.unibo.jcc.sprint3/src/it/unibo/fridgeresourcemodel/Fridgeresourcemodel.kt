/* Generated by AN DISI Unibo */ 
package it.unibo.fridgeresourcemodel

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Fridgeresourcemodel ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						solve("consult('fridgeContent.pl')","") //set resVar	
						solve("showFridgeContent","") //set resVar	
						itunibo.jcc.coap.fridge.fridgeResourceCoap.create(myself ,"fridgeresource" )
					}
					 transition( edgeName="goto",targetState="waitModelChange", cond=doswitch() )
				}	 
				state("waitModelChange") { //this:State
					action { //it:State
					}
					 transition(edgeName="t00",targetState="updateModel",cond=whenDispatch("take"))
					transition(edgeName="t01",targetState="updateModel",cond=whenDispatch("put"))
				}	 
				state("updateModel") { //this:State
					action { //it:State
						println("$name in ${currentState.stateName} | $currentMsg")
						if( checkMsgContent( Term.createTerm("take(Food)"), Term.createTerm("take(Food)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								solve("retract(content(${payloadArg(0)}))","") //set resVar	
								if(currentSolution.isSuccess()) { itunibo.jcc.coap.fridge.fridgeResourceCoap.resourceCoap.updateState(  )
								 }
								else
								{ println("*** Can't take non-existing content! ***")
								 }
						}
						if( checkMsgContent( Term.createTerm("put(Food)"), Term.createTerm("put(Food)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								solve("assert(content(${payloadArg(0)}))","") //set resVar	
								if(currentSolution.isSuccess()) { itunibo.jcc.coap.fridge.fridgeResourceCoap.resourceCoap.updateState(  )
								 }
						}
					}
					 transition( edgeName="goto",targetState="waitModelChange", cond=doswitch() )
				}	 
			}
		}
}
