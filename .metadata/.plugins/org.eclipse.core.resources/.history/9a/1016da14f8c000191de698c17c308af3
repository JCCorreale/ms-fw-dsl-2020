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
	GlobalScope.launch {
	    println(" %%%%%%% MainTestSuspendable starting ")
		it.unibo.ctxStoppableWorker.main()
	}
	delay(10000)		//give the time to start
	worker = sysUtil.getActor("workerinroom")
//	println(" %%%%%%% TestRobotmind getActors resource=${worker}")

	// Send goal
	MsgUtil.sendMsg("setGoal","setGoal(5,3)",worker!!)
	
	// Simulate obstacle
	GlobalScope.launch{
		delay( 4000 )
	    println(" %%%%%%% MainTestObstacle SIMULATES OBSTACLE")
		// Obstacle for a fixed time
		val Tobs = 15000
		val startTime = System.currentTimeMillis()
		while ((System.currentTimeMillis() - startTime) < Tobs) {
			worker!!.emit("obstacle", "obstacle(8)")
			delay( 50 )
		}
	}
	
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