/* Generated by AN DISI Unibo */ 
package it.unibo.ctxDummyForCarrier
import it.unibo.kactor.QakContext
import it.unibo.kactor.sysUtil
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	QakContext.createContexts(
	        "localhost", this, "butlermind.pl", "sysRules.pl"
	)
}

