/* Generated by AN DISI Unibo */ 
package it.unibo.onecellstep

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Onecellstep ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		 var foundObstacle = false; var StepTime = 0L
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						foundObstacle = false 
					}
					 transition(edgeName="t02",targetState="doMoveForward",cond=whenDispatch("onestep"))
				}	 
				state("doMoveForward") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("onestep(DURATION)"), Term.createTerm("onestep(TIME)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								StepTime = payloadArg(0).toLong()
								forward("modelChange", "modelChange(robot,w)" ,"resourcemodel" ) 
								itunibo.planner.plannerUtil.startTimer(  )
						}
						stateTimer = TimerActor("timer_doMoveForward", 
							scope, context!!, "local_tout_onecellstep_doMoveForward", StepTime )
					}
					 transition(edgeName="t03",targetState="endDoMoveForward",cond=whenTimeout("local_tout_onecellstep_doMoveForward"))   
					transition(edgeName="t04",targetState="handleSonarRobot",cond=whenEvent("sonarRobot"))
				}	 
				state("endDoMoveForward") { //this:State
					action { //it:State
						forward("modelChange", "modelChange(robot,h)" ,"resourcemodel" ) 
						forward("stepOk", "stepOk(ok)" ,"roomboudaryexplorer" ) 
					}
					 transition( edgeName="goto",targetState="s0", cond=doswitch() )
				}	 
				state("handleSonarRobot") { //this:State
					action { //it:State
						itunibo.planner.moveUtils.setDuration(myself)
						println("$name in ${currentState.stateName} | $currentMsg")
						if( checkMsgContent( Term.createTerm("sonar(DISTANCE)"), Term.createTerm("sonar(DISTANCE)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								val distance = Integer.parseInt( payloadArg(0) ) 
								              foundObstacle = (distance<20) 
						}
					}
					 transition( edgeName="goto",targetState="stepFail", cond=doswitchGuarded({foundObstacle}) )
					transition( edgeName="goto",targetState="s0", cond=doswitchGuarded({! foundObstacle}) )
				}	 
				state("stepFail") { //this:State
					action { //it:State
						println("&&& onecellstep stepfail ")
						solve("wduration(TIME)","") //set resVar	
						forward("stepFail", "stepFail(obstacle,${getCurSol("TIME").toString()})" ,"roomboudaryexplorer" ) 
					}
					 transition( edgeName="goto",targetState="s0", cond=doswitch() )
				}	 
			}
		}
}
