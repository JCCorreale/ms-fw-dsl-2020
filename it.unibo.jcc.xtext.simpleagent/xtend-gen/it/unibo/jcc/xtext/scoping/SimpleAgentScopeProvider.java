/**
 * generated by Xtext 2.17.0
 */
package it.unibo.jcc.xtext.scoping;

import com.google.common.base.Objects;
import it.unibo.jcc.xtext.scoping.AbstractSimpleAgentScopeProvider;
import it.unibo.jcc.xtext.simpleAgent.Dispatch;
import it.unibo.jcc.xtext.simpleAgent.Message;
import it.unibo.jcc.xtext.simpleAgent.PAtomic;
import it.unibo.jcc.xtext.simpleAgent.PHead;
import it.unibo.jcc.xtext.simpleAgent.PStruct;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentFactory;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class SimpleAgentScopeProvider extends AbstractSimpleAgentScopeProvider {
  public IScope getScope(final EObject context, final EReference reference) {
    EClass _eReferenceType = reference.getEReferenceType();
    boolean _equals = Objects.equal(_eReferenceType, SimpleAgentPackage.Literals.MESSAGE);
    if (_equals) {
      ArrayList<Message> builtinMessages = SimpleAgentScopeProvider.builtinMessages();
      final Consumer<Message> _function = new Consumer<Message>() {
        public void accept(final Message it) {
          SimpleAgentScopeProvider.this.addToQActorSystemSpec(context.eResource(), it);
        }
      };
      builtinMessages.forEach(_function);
      return Scopes.scopeFor(builtinMessages, super.getScope(context, reference));
    } else {
      return super.getScope(context, reference);
    }
  }
  
  public boolean addToQActorSystemSpec(final Resource resource, final Message message) {
    return resource.getContents().add(message);
  }
  
  public static ArrayList<Message> builtinMessages() {
    final ArrayList<Message> messages = new ArrayList<Message>();
    messages.add(SimpleAgentScopeProvider.builtinMessage("setGoal", "G"));
    messages.add(SimpleAgentScopeProvider.builtinMessage("suspend"));
    messages.add(SimpleAgentScopeProvider.builtinMessage("resume"));
    messages.add(SimpleAgentScopeProvider.builtinMessage("goalReached"));
    return messages;
  }
  
  public static Dispatch builtinMessage(final String name) {
    final Dispatch msg = SimpleAgentFactory.eINSTANCE.createDispatch();
    msg.setName(name);
    msg.setMsg(SimpleAgentFactory.eINSTANCE.createPAtomic());
    PHead _msg = msg.getMsg();
    ((PAtomic) _msg).setVal(name);
    return msg;
  }
  
  public static Dispatch builtinMessage(final String name, final String... args) {
    final Dispatch msg = SimpleAgentFactory.eINSTANCE.createDispatch();
    msg.setName(name);
    msg.setMsg(SimpleAgentFactory.eINSTANCE.createPStruct());
    PHead _msg = msg.getMsg();
    ((PStruct) _msg).setFunctor(name);
    return msg;
  }
}
