/* Generated by AN DISI Unibo */ 
package it.unibo.ctxDummy
import it.unibo.kactor.QakContext
import it.unibo.kactor.sysUtil
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	QakContext.createContexts(
	        "otherresourcelocalhost", this, "gotoagentsystem.pl", "sysRules.pl"
	)
}

