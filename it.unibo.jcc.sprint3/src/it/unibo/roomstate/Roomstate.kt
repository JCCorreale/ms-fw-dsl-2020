/* Generated by AN DISI Unibo */ 
package it.unibo.roomstate

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Roomstate ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						solve("consult('roomState.pl')","") //set resVar	
						solve("showContent","") //set resVar	
						delay(2000) 
						forward("put", "put(sausage)" ,"resourcemodel" ) 
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
						if( checkMsgContent( Term.createTerm("take(Item,Location)"), Term.createTerm("take(Item,Location)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								solve("retract(at(${payloadArg(0)},${payloadArg(1)}))","") //set resVar	
								if(currentSolution.isSuccess()) { solve("showContent","") //set resVar	
								 }
								else
								{ println("*** Can't take non-existing content! ***")
								 }
						}
						if( checkMsgContent( Term.createTerm("put(Item,Location)"), Term.createTerm("put(Item,Location)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								solve("assert(at(${payloadArg(0)},${payloadArg(1)}))","") //set resVar	
								if(currentSolution.isSuccess()) { solve("showContent","") //set resVar	
								 }
						}
					}
					 transition( edgeName="goto",targetState="waitModelChange", cond=doswitch() )
				}	 
			}
		}
}
