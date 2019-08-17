package itunibo.jcc.planner.adapter

import itunibo.jcc.planner.framework.Planner
import it.unibo.kactor.ActorBasic

class MovePlannerAdapter : Planner {
	/**
	 * Expects pos(X,Y) as goal
	 */
	override fun planGoal(actor: ActorBasic, goal: String) {
		val regex = """pos\(([0-9]*),([0-9]*)\)""".toRegex()
		val matches = regex.matchEntire(goal)
		val x = matches!!.groups[1]!!.value
		val y = matches!!.groups[2]!!.value
		itunibo.planner.plannerUtil.setGoal(x, y)
  		itunibo.planner.moveUtils.doPlan( actor )
	}
}