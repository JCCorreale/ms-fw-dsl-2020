/* Generated by AN DISI Unibo */ 
package it.unibo.carrierbehavior

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Carrierbehavior ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		
		
		var Curmove     = "" 
		var suspended = false
		
		var CurGoal = ""
		
		//var CurGoalX = ""
		//var CurGoalY = ""
		
		
		// From Planner declaration
		val planner = itunibo.jcc.planner.adapter.CarrierPlannerAdapter()
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						planner.goto("home")
						planner.put("food", "fridge")
						planner.put("dishes", "pantry")
					}
					 transition( edgeName="goto",targetState="waitGoal", cond=doswitch() )
				}	 
				state("waitGoal") { //this:State
					action { //it:State
						println("Waiting for goal...")
					}
					 transition(edgeName="setGoalT0",targetState="setGoal",cond=whenDispatch("setGoal"))
				}	 
				state("setGoal") { //this:State
					action { //it:State
						println("here in setGoal")
						println("$name in ${currentState.stateName} | $currentMsg")
						if( checkMsgContent( Term.createTerm("setGoal(G)"), Term.createTerm("setGoal(G)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								println("Received setGoal")
								planner.planGoal(myself, payloadArg(0))
								CurGoal = payloadArg(0)
						}
					}
					 transition( edgeName="goto",targetState="suspendOrExecute", cond=doswitch() )
				}	 
				state("suspendOrExecute") { //this:State
					action { //it:State
						stateTimer = TimerActor("timer_suspendOrExecute", 
							scope, context!!, "local_tout_carrierbehavior_suspendOrExecute", 200.toLong() )
					}
					 transition(edgeName="checkSuspend1",targetState="executePlannedActions",cond=whenTimeout("local_tout_carrierbehavior_suspendOrExecute"))   
					transition(edgeName="checkSuspend2",targetState="suspended",cond=whenDispatch("suspend"))
				}	 
				state("suspended") { //this:State
					action { //it:State
					}
					 transition(edgeName="resume3",targetState="resume",cond=whenDispatch("resume"))
				}	 
				state("resume") { //this:State
					action { //it:State
					}
					 transition( edgeName="goto",targetState="executePlannedActions", cond=doswitch() )
				}	 
				state("executePlannedActions") { //this:State
					action { //it:State
						solve("move(M)","") //set resVar	
						if(currentSolution.isSuccess()) { Curmove = getCurSol("M").toString()
						 }
						else
						{ Curmove = ""
						 }
						println("executePlannedActions doing $Curmove")
					}
					 transition( edgeName="goto",targetState="checkAndDoAction", cond=doswitchGuarded({(Curmove.length>0) }) )
					transition( edgeName="goto",targetState="goalOk", cond=doswitchGuarded({! (Curmove.length>0) }) )
				}	 
				state("goalOk") { //this:State
					action { //it:State
						emit("goalReached", "goalReached" ) 
					}
					 transition( edgeName="goto",targetState="waitGoal", cond=doswitch() )
				}	 
				state("checkAndDoAction") { //this:State
					action { //it:State
						solve("assert(curmove($Curmove))","") //set resVar	
						solve("curmove(take(Item))","") //set resVar	
						if(currentSolution.isSuccess()) { forward("take", "$Curmove" ,"carrierbehavior" ) 
						 }
						solve("curmove(put(Item,Location))","") //set resVar	
						if(currentSolution.isSuccess()) { forward("put", "$Curmove" ,"carrierbehavior" ) 
						 }
						solve("curmove(goto(L))","") //set resVar	
						if(currentSolution.isSuccess()) { forward("goto", "$Curmove" ,"carrierbehavior" ) 
						 }
						solve("retract(curmove($Curmove))","") //set resVar	
					}
					 transition(edgeName="t04",targetState="take",cond=whenDispatch("take"))
					transition(edgeName="t05",targetState="put",cond=whenDispatch("put"))
					transition(edgeName="t06",targetState="goto",cond=whenDispatch("goto"))
				}	 
				state("take") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("take(Item)"), Term.createTerm("take(Item)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								println("carrier taking ${payloadArg(0)}")
								planner.take("${payloadArg(0)}")
						}
					}
					 transition( edgeName="goto",targetState="finalizeMove", cond=doswitch() )
				}	 
				state("put") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("put(Item,Location)"), Term.createTerm("put(Item,Location)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								println("carrier putting ${payloadArg(0)} in ${payloadArg(1)}")
								planner.put("${payloadArg(0)}", "${payloadArg(1)}")
						}
					}
					 transition( edgeName="goto",targetState="finalizeMove", cond=doswitch() )
				}	 
				state("goto") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("goto(L)"), Term.createTerm("goto(L)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								forward("setGoal", "setGoal(goto(${payloadArg(0)}))" ,"gotobehavior" ) 
								planner.goto("${payloadArg(0)}")
						}
					}
					 transition(edgeName="t07",targetState="goto_onSuspend",cond=whenDispatch("suspend"))
					transition(edgeName="t08",targetState="goto_onResume",cond=whenDispatch("resume"))
					transition(edgeName="t09",targetState="goto_onGoalReached",cond=whenDispatch("goalReached"))
				}	 
				state("goto_onSuspend") { //this:State
					action { //it:State
						forward("suspend", "suspend" ,"gotobehavior" ) 
						if (true) {
						forward("retry", "retry" ,"carrierbehavior" ) 
						}
					}
					 transition(edgeName="compensation10",targetState="goto_retry",cond=whenDispatch("retry"))
				}	 
				state("goto_onResume") { //this:State
					action { //it:State
						forward("resume", "resume" ,"gotobehavior" ) 
						if (true) {
						forward("retry", "retry" ,"carrierbehavior" ) 
						}
					}
					 transition(edgeName="compensation11",targetState="goto_retry",cond=whenDispatch("retry"))
				}	 
				state("goto_onGoalReached") { //this:State
					action { //it:State
						println("carrier: subgoal reached")
					}
					 transition( edgeName="goto",targetState="finalizeMove", cond=doswitch() )
				}	 
				state("goto_retry") { //this:State
					action { //it:State
					}
					 transition( edgeName="goto",targetState="suspendOrExecute", cond=doswitch() )
				}	 
				state("goto_retry") { //this:State
					action { //it:State
					}
					 transition( edgeName="goto",targetState="suspendOrExecute", cond=doswitch() )
				}	 
				state("finalizeMove") { //this:State
					action { //it:State
						solve("retract(move(M))","") //set resVar	
					}
					 transition( edgeName="goto",targetState="suspendOrExecute", cond=doswitch() )
				}	 
			}
		}
}
