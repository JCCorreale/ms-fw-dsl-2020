/* Generated by AN DISI Unibo */ 
package it.unibo.butlermind

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Butlermind ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
					}
					 transition( edgeName="goto",targetState="waitCommand", cond=doswitch() )
				}	 
				state("waitCommand") { //this:State
					action { //it:State
					}
					 transition(edgeName="t03",targetState="doPrepare",cond=whenDispatch("prepare"))
					transition(edgeName="t04",targetState="doAddFood",cond=whenDispatch("addFood"))
					transition(edgeName="t05",targetState="doClear",cond=whenDispatch("clear"))
					transition(edgeName="t06",targetState="suspend",cond=whenDispatch("stop"))
				}	 
				state("doPrepare") { //this:State
					action { //it:State
						forward("setGoal", "setGoal(at(pizza,table))" ,"carrierbehavior" ) 
						forward("setGoal", "setGoal(at(caviar,table))" ,"carrierbehavior" ) 
						forward("setGoal", "setGoal(at(dishes,table))" ,"carrierbehavior" ) 
						forward("setGoal", "setGoal(at(butler,home))" ,"carrierbehavior" ) 
					}
					 transition( edgeName="goto",targetState="handleSuspendResume", cond=doswitch() )
				}	 
				state("doAddFood") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("addFood(Food)"), Term.createTerm("addFood(Food)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								val client = itunibo.jcc.coap.fridge.client.MyCoapClient("localhost", 5684, "fridgeresource")
								client.setUriParams(payloadArg(0))
								val qty = Integer.parseInt(client.synchGet())
								if (qty == 0)
								{
								println("butlermind | food not present in fridge!")
								}
								else
								{
								forward("setGoal", "setGoal(at(${payloadArg(0)},table))" ,"carrierbehavior" ) 
								forward("setGoal", "setGoal(at(butler,home))" ,"carrierbehavior" ) 
								}
						}
					}
					 transition( edgeName="goto",targetState="handleSuspendResume", cond=doswitch() )
				}	 
				state("doClear") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("clear"), Term.createTerm("clear"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								itunibo.jcc.butlermind.butlerUtil.setClearGoals(myself ,"carrierbehavior" )
						}
					}
					 transition( edgeName="goto",targetState="handleSuspendResume", cond=doswitch() )
				}	 
				state("handleSuspendResume") { //this:State
					action { //it:State
						println("butlermind | handleSuspendResume")
					}
					 transition(edgeName="t07",targetState="waitCommand",cond=whenEvent("goalReached"))
					transition(edgeName="t08",targetState="suspend",cond=whenDispatch("stop"))
				}	 
				state("suspend") { //this:State
					action { //it:State
						println("butlermind | suspend")
						forward("suspend", "suspend" ,"carrierbehavior" ) 
					}
					 transition(edgeName="t09",targetState="resume",cond=whenDispatch("reactivate"))
				}	 
				state("resume") { //this:State
					action { //it:State
						println("butlermind | resume")
						forward("resume", "resume" ,"carrierbehavior" ) 
					}
					 transition( edgeName="goto",targetState="handleSuspendResume", cond=doswitch() )
				}	 
			}
		}
}
