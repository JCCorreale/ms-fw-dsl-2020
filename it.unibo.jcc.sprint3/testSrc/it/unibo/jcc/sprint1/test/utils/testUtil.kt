package it.unibo.jcc.sprint1.test.utils

import java.util.function.Predicate

object testUtil {
	
	var testCount : Int = 0
	var succCount : Int = 0
	
	fun init() {
		testCount = 0
		succCount = 0
	}
	
	fun doTest(name: String, predicate:  ( ) -> Boolean) {
		val testOk = predicate()
		if (testOk) {
			println ("testUtil \"$name\" OK")
			succCount++
		}
		else {
			println ("testUtil \"$name\" FAILED")
		}
		testCount++
	}
	
	fun printResult() {
		
		println("testUtil $succCount/$testCount OK")
		if (testCount == succCount)
			println("testUtil ALL TESTS OK")
		else 
			println("testUtil SOME TESTS FAILED")
	}
}