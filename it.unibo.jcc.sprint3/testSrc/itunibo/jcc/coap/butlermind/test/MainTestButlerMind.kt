package itunibo.jcc.coap.butlermind.test

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import it.unibo.kactor.ActorBasic
import it.unibo.kactor.sysUtil
import it.unibo.kactor.MsgUtil

// RUN MainCtxFridge first

// ROOM CLIENT COAP ON PORT 5685

fun main() = runBlocking {
	
	var butlerMind : ActorBasic?
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestButlerMind starting ctxButlermind")
		it.unibo.ctxButlermind.main()
	}
	
	// To see the state of the fidge from COAP
//	GlobalScope.launch {
//	    println(" %%%%%%% MainTestRoomState starting fridgeObserverCoapClient")
//		it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.create( "${it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.fridgeResourceAddr}" )
//	}
	
	// Give time to launch all "agents"
	delay(12000)
	
	butlerMind = sysUtil.getActor("butlermind")
	
	println(" %%%%%%% MainTestButlerMind PREPARE")
	MsgUtil.sendMsg("prepare","prepare", butlerMind!!)
	
	delay(5000)
	
	println(" %%%%%%% MainTestButlerMind STOP")
	MsgUtil.sendMsg("stop","stop", butlerMind!!)
	
	delay(3000)
	
	println(" %%%%%%% MainTestButlerMind REACTIVATE")
	MsgUtil.sendMsg("reactivate","reactivate", butlerMind!!)
	
	delay(15000)
	
	println(" %%%%%%% MainTestButlerMind STOP")
	MsgUtil.sendMsg("stop","stop", butlerMind!!)
	
	delay(3000)
	
	println(" %%%%%%% MainTestButlerMind REACTIVATE")
	MsgUtil.sendMsg("reactivate","reactivate", butlerMind!!)
	
	// TODO Test obstacle
	
	delay(60 * 1000)
}