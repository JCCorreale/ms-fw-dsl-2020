package it.unibo.jcc.xtext.generator.common;

import com.google.common.collect.Iterators;
import it.unibo.jcc.xtext.simpleAgent.Behavior;
import it.unibo.jcc.xtext.simpleAgent.BrokerSpec;
import it.unibo.jcc.xtext.simpleAgent.Message;
import it.unibo.jcc.xtext.simpleAgent.PAtomic;
import it.unibo.jcc.xtext.simpleAgent.PHead;
import it.unibo.jcc.xtext.simpleAgent.PStruct;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AgentExtensions {
  public static String getStringContent(final EObject object) {
    ICompositeNode _node = NodeModelUtils.getNode(object);
    boolean _tripleEquals = (_node == null);
    if (_tripleEquals) {
      if ((object instanceof Message)) {
        final StringBuilder content = new StringBuilder();
        content.append(((Message)object).getName());
        PHead _msg = ((Message)object).getMsg();
        if ((_msg instanceof PStruct)) {
          content.append("(");
          PHead _msg_1 = ((Message)object).getMsg();
          final Procedure2<PHead, Integer> _function = (PHead arg, Integer i) -> {
            content.append(AgentExtensions.getHead(arg));
            PHead _msg_2 = ((Message)object).getMsg();
            int _size = ((PStruct) _msg_2).getMsgArg().size();
            int _minus = (_size - 1);
            boolean _lessThan = ((i).intValue() < _minus);
            if (_lessThan) {
              content.append(",");
            }
          };
          IterableExtensions.<PHead>forEach(((PStruct) _msg_1).getMsgArg(), _function);
          content.append(")");
        }
        return content.toString();
      } else {
        throw new IllegalArgumentException("Unsupported object without corresponding node");
      }
    } else {
      return NodeModelUtils.getTokenText(NodeModelUtils.getNode(object)).replace("^", "");
    }
  }
  
  public static SimpleAgent getAgent(final Resource resource) {
    return IteratorExtensions.<SimpleAgent>last(Iterators.<SimpleAgent>filter(resource.getAllContents(), SimpleAgent.class));
  }
  
  public static String getSystemName(final Resource resource) {
    String _lowerCase = AgentExtensions.getAgent(resource).getName().toLowerCase();
    return (_lowerCase + "system");
  }
  
  public static String getAgentName(final Resource resource) {
    return AgentExtensions.getAgent(resource).getName().toLowerCase();
  }
  
  public static String getActorName(final Behavior behavior) {
    String _lowerCase = behavior.getName().toLowerCase();
    return (_lowerCase + "behavior");
  }
  
  public static String getContextName(final Resource resource) {
    String _firstUpper = StringExtensions.toFirstUpper(AgentExtensions.getAgentName(resource));
    return ("ctx" + _firstUpper);
  }
  
  public static Behavior getBehavior(final Resource resource) {
    return IteratorExtensions.<Behavior>last(Iterators.<Behavior>filter(resource.getAllContents(), Behavior.class));
  }
  
  public static String getHost(final Resource resource) {
    return AgentExtensions.getAgent(resource).getIp().getHost();
  }
  
  public static int getPort(final Resource resource) {
    return AgentExtensions.getAgent(resource).getIp().getPort();
  }
  
  public static String getMqtt(final Resource resource) {
    final String mqtt = AgentExtensions.getAgent(resource).getMqtt();
    String _xifexpression = null;
    if ((mqtt == null)) {
      _xifexpression = "";
    } else {
      _xifexpression = mqtt;
    }
    return _xifexpression;
  }
  
  public static String getMqttBroker(final Resource resource) {
    final BrokerSpec mqttBroker = AgentExtensions.getAgent(resource).getSystem().getMqttBroker();
    String _xifexpression = null;
    if ((mqttBroker == null)) {
      _xifexpression = "";
    } else {
      _xifexpression = AgentExtensions.getStringContent(mqttBroker);
    }
    return _xifexpression;
  }
  
  public static String getPlanner(final Resource resource) {
    return AgentExtensions.getBehavior(resource).getPlanner();
  }
  
  public static String getHead(final PHead phead) {
    if ((phead instanceof PStruct)) {
      return ((PStruct)phead).getFunctor();
    } else {
      if ((phead instanceof PAtomic)) {
        return ((PAtomic)phead).getVal();
      } else {
        throw new IllegalStateException("Unsupported PHead");
      }
    }
  }
}
