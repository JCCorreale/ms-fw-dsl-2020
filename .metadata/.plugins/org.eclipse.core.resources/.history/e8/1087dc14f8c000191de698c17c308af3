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
	
	var worker : ActorBasic? = null

	it.unibo.jcc.sprint1.test.utils.testUtil.init()
	
	GlobalScope.launch {
		it.unibo.jcc.sprint1.test.utils.robotMindObserver.create()
	}
	GlobalScope.launch {
	    println(" %%%%%%% MainTestSuspendable starting ")
		it.unibo.ctxStoppableWorker.main()
	}
	delay(10000)		//give the time to start
	worker = sysUtil.getActor("workerinroom")
	println(" %%%%%%% MainTestSuspendable getActors resource=${worker}")

	// Send goal
	MsgUtil.sendMsg("setGoal","setGoal(6,3)",worker!!)
	
	// Suspend
	delay(5000)
	MsgUtil.sendMsg("suspend","suspend",worker!!)
	
	// Test Suspend
	delay(5000)
	// VERY simplistic check of robot state
	it.unibo.jcc.sprint1.test.utils.testUtil.doTest("SUSPEND", {
		it.unibo.jcc.sprint1.test.utils.robotMindObserver.log.last() == "robot( state(stopped) )"
	})
	
	// Clear previously observed state
	it.unibo.jcc.sprint1.test.utils.robotMindObserver.log.clear()
	
	MsgUtil.sendMsg("resume","resume",worker!!)
	// Test Resume
	delay(2000)
	// VERY simplistic check of robot state
	it.unibo.jcc.sprint1.test.utils.testUtil.doTest("RESUME", {
		it.unibo.jcc.sprint1.test.utils.robotMindObserver.log.filter { it != "robot( state(stopped) )" }.size > 0 
	})
	
	it.unibo.jcc.sprint1.test.utils.testUtil.printResult()
		
	delay(60*1000)

}