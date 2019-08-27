package itunibo.jcc.coap.fridge.test

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import it.unibo.kactor.ActorBasic
import it.unibo.kactor.sysUtil
import it.unibo.kactor.MsgUtil

// RUN MainCtxFridge before

fun main() = runBlocking {
	
	var roomState : ActorBasic?
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestRoomState starting ctxButlermind")
		it.unibo.ctxButlermind.main()
	}
	
	// To see the state of the fidge from COAP
	GlobalScope.launch {
	    println(" %%%%%%% MainTestRoomState starting fridgeObserverCoapClient")
		it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.create( "${it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.fridgeResourceAddr}" )
	}
	
	delay(5000)
	
	roomState = sysUtil.getActor("resourcemodel")
	
	// Put content
//	MsgUtil.sendMsg("put","put(sausage, fridge)", roomState!!)
	
//	delay(3000)
	
	delay(60 * 1000)
}