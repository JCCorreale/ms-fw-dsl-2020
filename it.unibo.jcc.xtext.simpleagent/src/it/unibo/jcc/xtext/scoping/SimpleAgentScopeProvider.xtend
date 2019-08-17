/*
 * generated by Xtext 2.17.0
 */
package it.unibo.jcc.xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentFactory
import it.unibo.jcc.xtext.simpleAgent.PAtomic
import it.unibo.jcc.xtext.simpleAgent.PStruct
import java.util.ArrayList
import it.unibo.jcc.xtext.simpleAgent.Message
import it.unibo.jcc.xtext.simpleAgent.QActorSystemSpec
import org.eclipse.emf.ecore.resource.Resource
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage
import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SimpleAgentScopeProvider extends AbstractSimpleAgentScopeProvider {

	override getScope(EObject context, EReference reference) {
		if (reference.EReferenceType == SimpleAgentPackage.Literals.MESSAGE) {
			var builtinMessages = builtinMessages() 
			// Avoid dangling object error
			builtinMessages.forEach[addToQActorSystemSpec(context.eResource, it)]
			return Scopes.scopeFor(builtinMessages, super.getScope(context, reference))
		}
		else return super.getScope(context, reference)
	}
	
	def addToQActorSystemSpec(Resource resource, Message message) {
//		(resource.allContents.filter[it instanceof QActorSystemSpec].last as QActorSystemSpec).message.add(message)
		resource.contents.add(message)
	}

	def static builtinMessages() {
		val messages = new ArrayList<Message>
		messages.add(builtinMessage("setGoal", "G"))
		messages.add(builtinMessage("suspend"))
		messages.add(builtinMessage("resume"))
		messages.add(builtinMessage("goalReached")) // TODO Event
		return messages
	}
	
	def static builtinMessage(String name) {
		val msg = SimpleAgentFactory.eINSTANCE.createDispatch()
		msg.name = name
		msg.msg = SimpleAgentFactory.eINSTANCE.createPAtomic()
		(msg.msg as PAtomic).^val = name
		return msg;
	}
	
	def static builtinMessage(String name, String... args) {
		val msg = SimpleAgentFactory.eINSTANCE.createDispatch()
		msg.name = name
		msg.msg = SimpleAgentFactory.eINSTANCE.createPStruct()
		(msg.msg as PStruct).functor = name
		return msg;
	}
}