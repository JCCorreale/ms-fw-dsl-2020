/* Generated by AN DISI Unibo */ 
package it.unibo.gotobehavior

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Gotobehavior ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
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
		val planner = itunibo.jcc.planner.adapter.GotoPlannerAdapter()
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						solve("consult('locations.pl')","") //set resVar	
						planner.update("home")
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
							scope, context!!, "local_tout_gotobehavior_suspendOrExecute", 200.toLong() )
					}
					 transition(edgeName="checkSuspend1",targetState="executePlannedActions",cond=whenTimeout("local_tout_gotobehavior_suspendOrExecute"))   
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
						solve("curmove(goto(L))","") //set resVar	
						if(currentSolution.isSuccess()) { forward("goto", "$Curmove" ,"gotobehavior" ) 
						 }
						solve("retract(curmove($Curmove))","") //set resVar	
					}
					 transition(edgeName="t04",targetState="goto",cond=whenDispatch("goto"))
				}	 
				state("goto") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("goto(L)"), Term.createTerm("goto(L)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								println("gotobehavior: ${payloadArg(0)}")
								println("location( ${payloadArg(0)}, Pos )")
								solve("location(${payloadArg(0)},Pos)","") //set resVar	
								println("after solve ${getCurSol("Pos")}")
								forward("setGoal", "setGoal(${getCurSol("Pos").toString()})" ,"movebehavior" ) 
						}
					}
					 transition(edgeName="t05",targetState="goto_onSuspend",cond=whenDispatch("suspend"))
					transition(edgeName="t06",targetState="goto_onResume",cond=whenDispatch("resume"))
					transition(edgeName="t07",targetState="goto_onGoalReached",cond=whenDispatch("goalReached"))
				}	 
				state("goto_onSuspend") { //this:State
					action { //it:State
						forward("suspend", "suspend" ,"movebehavior" ) 
						if (true) {
						forward("retry", "retry" ,"gotobehavior" ) 
						}
					}
					 transition(edgeName="compensation8",targetState="goto_retry",cond=whenDispatch("retry"))
				}	 
				state("goto_onResume") { //this:State
					action { //it:State
						forward("resume", "resume" ,"movebehavior" ) 
						if (true) {
						forward("retry", "retry" ,"gotobehavior" ) 
						}
					}
					 transition(edgeName="compensation9",targetState="goto_retry",cond=whenDispatch("retry"))
				}	 
				state("goto_onGoalReached") { //this:State
					action { //it:State
						println("gotobehavior: subgoal reached")
						planner.update("${payloadArg(0)}")
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
