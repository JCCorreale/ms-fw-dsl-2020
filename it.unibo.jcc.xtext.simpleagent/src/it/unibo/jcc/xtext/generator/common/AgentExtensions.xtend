package it.unibo.jcc.xtext.generator.common

import org.eclipse.emf.ecore.resource.Resource
import it.unibo.jcc.xtext.simpleAgent.SimpleAgent
import it.unibo.jcc.xtext.simpleAgent.Behavior
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import it.unibo.jcc.xtext.simpleAgent.PHead
import it.unibo.jcc.xtext.simpleAgent.PStruct
import it.unibo.jcc.xtext.simpleAgent.PAtomic
import it.unibo.jcc.xtext.simpleAgent.Message

class AgentExtensions {
	
	def static getStringContent(EObject object) {
		// Workaround: messages built by scope provider don't have a corresponding node so the other way would not work
		
		if (NodeModelUtils.getNode(object) === null) {
			if (object instanceof Message) {
				val content = new StringBuilder
				// TODO Assuming name is same as PHead functor!
				content.append(object.name)
				// TODO Untested
				if (object.msg instanceof PStruct) {
					content.append("(")
					(object.msg as PStruct).msgArg.forEach[arg, i|
						content.append(arg.head)
						if (i < ((object.msg as PStruct).msgArg.size - 1))
							content.append(",")
					]
					content.append(")")
				}
				return content.toString
			}
			else throw new IllegalArgumentException("Unsupported object without corresponding node")
		}
		else {
			// TODO Workaround! Should do a real tree navigation instead of getting text content!
			return NodeModelUtils.getTokenText(NodeModelUtils.getNode(object)).replace("^", "")
		}
	}
	
	def static getAgent(Resource resource) {
		return resource.allContents.filter(SimpleAgent).last
	}
	
	def static getSystemName(Resource resource) {
		return resource.agent.name.toLowerCase + "system"
	}
	
	def static getAgentName(Resource resource) {
		return resource.agent.name.toLowerCase
	}
	
	def static getActorName(Behavior behavior) {
		return behavior.name.toLowerCase + "behavior"
	}
	
	def static getContextName(Resource resource) {
		return "ctx" + resource.agentName.toFirstUpper
	}
	
	def static getBehavior(Resource resource) {
		return resource.allContents.filter(Behavior).last
	}
	
	def static getHost(Resource resource) {
		return resource.agent.ip.host
	}
	
	def static getPort(Resource resource) {
		return resource.agent.ip.port
	}
	
	def static getMqtt(Resource resource) {
		val mqtt = resource.agent.mqtt
		return mqtt === null ? "" : mqtt;
	}
	
	def static getMqttBroker(Resource resource) {
		val mqttBroker = resource.agent.system.mqttBroker
		return mqttBroker === null ? "" : mqttBroker.stringContent;
	}
	
	def static getPlanner(Resource resource) {
		return resource.behavior.planner
	}
	
	def static getHead(PHead phead) {
		if (phead instanceof PStruct) {
			return phead.functor
		}
		else if (phead instanceof PAtomic) {
			return phead.^val
		}
		else throw new IllegalStateException("Unsupported PHead")
	}
}