package itunibo.jcc.coap.butlermind.test

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import it.unibo.kactor.ActorBasic
import it.unibo.kactor.sysUtil
import it.unibo.kactor.MsgUtil
import java.awt.Color

// RUN MainCtxFridge first

// ROOM CLIENT COAP ON PORT 5685

fun main() = runBlocking {
	
	var butlerMind : ActorBasic?
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestButlerMind starting ctxButlermind")
		it.unibo.ctxButlermind.main()
	}
	
	// Monitor room state
	GlobalScope.launch {
	    println(" %%%%%%% MainTestRoomState starting roomModelObserverCoapClient")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.red, 2, 0)
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.white, 0, 0, "fridge")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.cyan, 0, 1, "butler")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color(181, 101, 29), 0, 2, "table")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.green, 1, 0, "dishwasher")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.lightGray, 1, 1, "pantry")
		itunibo.jcc.coap.roomstate.roomModelObserverCoapClient.create(Color.pink, 1, 2, "butlerLocation")
	}
	
	// Give time to launch all "agents"
	delay(5000)
	
	butlerMind = sysUtil.getActor("butlermind")
	
	commandGui.create(butlerMind!!)
	
//	delay(5000)
	
	// PREPARE
	
//	println(" %%%%%%% MainTestButlerMind PREPARE")
//	MsgUtil.sendMsg("prepare","prepare", butlerMind!!)
	
	// ADD FOOD
	
//	println(" %%%%%%% MainTestButlerMind addFood(pizza)")
//	MsgUtil.sendMsg("addFood","addFood(pizza)", butlerMind!!)
	
	// ADD FOOD ERROR
	
//	println(" %%%%%%% MainTestButlerMind addFood(olives)")
//	MsgUtil.sendMsg("addFood","addFood(olives)", butlerMind!!)
	
//	delay(60000)
	
	// CLEAR
	
//	println(" %%%%%%% MainTestButlerMind CLEAR")
//	MsgUtil.sendMsg("clear","clear", butlerMind!!)
	
	// TODO CREATE COMMAND CONSOLE (and simulate consumption)
	
//	delay(5000)
//	
//	println(" %%%%%%% MainTestButlerMind STOP")
//	MsgUtil.sendMsg("stop","stop", butlerMind!!)
//	
//	delay(3000)
//	
//	println(" %%%%%%% MainTestButlerMind REACTIVATE")
//	MsgUtil.sendMsg("reactivate","reactivate", butlerMind!!)
//	
//	delay(15000)
//	
//	println(" %%%%%%% MainTestButlerMind STOP")
//	MsgUtil.sendMsg("stop","stop", butlerMind!!)
//	
//	delay(3000)
//	
//	println(" %%%%%%% MainTestButlerMind REACTIVATE")
//	MsgUtil.sendMsg("reactivate","reactivate", butlerMind!!)
	
	// TODO Test obstacle
	
//	delay(600 * 1000)
}