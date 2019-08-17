package it.unibo.jcc.sprint1.test

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import it.unibo.kactor.ActorBasic
import it.unibo.kactor.sysUtil
import kotlinx.coroutines.runBlocking
import it.unibo.kactor.MsgUtil


/* REQUIRES A RUNNING ROBOTMIND */

fun main() = runBlocking {

	var worker : ActorBasic?

	it.unibo.jcc.sprint1.test.utils.testUtil.init()
	
//	GlobalScope.launch {
//		it.unibo.jcc.sprint1.test.utils.robotMindObserver.create()
//	}
	
	// TODO Must be run manually!!!
	
//	GlobalScope.launch {
//	    println(" %%%%%%% MainTestGotoAgent starting ctxMovingagent")
//		it.unibo.ctxMovingagent.main()
//	}
	
//	delay(5000)
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestCarrierAgent starting ctxCarrieragent")
		it.unibo.ctxCarrieragent.main()
	}
	delay(5000)		//give the time to start
	worker = sysUtil.getActor("carrierbehavior")
//	println(" %%%%%%% TestRobotmind getActors resource=${worker}")

	// Send goal
	println(" %%%%%%% MainTestCarrierAgent at(dishes, table)")
	MsgUtil.sendMsg("setGoal","setGoal(at(dishes, table))",worker!!)
	
	delay(15000)
	
	// Send goal
	println(" %%%%%%% MainTestCarrierAgent at(food, table)")
	MsgUtil.sendMsg("setGoal","setGoal(at(food, table))",worker!!)
	
	delay(15000)
	
	// Send goal
	println(" %%%%%%% MainTestCarrierAgent at(butler, home)")
	MsgUtil.sendMsg("setGoal","setGoal(at(butler, home))",worker!!)
	
//	// Simulate obstacle
//	GlobalScope.launch{
//		delay( 3000 )
//	    println(" %%%%%%% MainTestObstacle SIMULATES OBSTACLE")
//		// Obstacle for a fixed time
//		val Tobs = 3000
//		val startTime = System.currentTimeMillis()
//		while ((System.currentTimeMillis() - startTime) < Tobs) {
//			worker!!.emit("obstacle", "obstacle(8)")
//			delay( 50 )
//		}
//	}
//	
//	delay(12000)
	
//	// Test Suspend
//	delay(4000)
//	// VERY simplistic check of robot state
//	it.unibo.jcc.sprint1.test.utils.testUtil.doTest("SUSPEND", {
//		it.unibo.jcc.sprint1.test.utils.robotMindObserver.log.last() == "robot( state(stopped) )"
//	})
//	
//	it.unibo.jcc.sprint1.test.utils.testUtil.printResult()
		
	delay(60*1000)

}