package itunibo.jcc.coap.fridge.test

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import it.unibo.kactor.ActorBasic
import it.unibo.kactor.sysUtil
import it.unibo.kactor.MsgUtil

fun main() = runBlocking {
	
	var fridgeResourceModel : ActorBasic?
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestFridge starting ctxFridge")
		it.unibo.ctxFridge.main()
		
	}
	
	GlobalScope.launch {
	    println(" %%%%%%% MainTestFridge starting fridgeObserverCoapClient")
		it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.create( "${it.unibo.jcc.coap.fridge.client.fridgeObserverCoapClient.fridgeResourceAddr}" )
	}
	
	delay(5000)
	
	fridgeResourceModel = sysUtil.getActor("fridgeresourcemodel")
	
	// Put content
	MsgUtil.sendMsg("put","put(sausage)",fridgeResourceModel!!)
	
	delay(3000)
	
	// Put content
	MsgUtil.sendMsg("put","put(pizza)",fridgeResourceModel!!)
	
	delay(3000)
	
	// Take content
	MsgUtil.sendMsg("take","take(pasta)",fridgeResourceModel!!)
	
	delay(3000)
	
	// Take content
	MsgUtil.sendMsg("take","take(caviar)",fridgeResourceModel!!)
	
	delay(3000)
	
	// ERROR HERE (Can't take non existing content!)
	MsgUtil.sendMsg("take","take(caviar)",fridgeResourceModel!!)
	
	delay(60 * 1000)
}