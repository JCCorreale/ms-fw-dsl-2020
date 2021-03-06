/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getIp <em>Ip</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getMqtt <em>Mqtt</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getSystem <em>System</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent()
 * @model
 * @generated
 */
public interface SimpleAgent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' containment reference.
   * @see #setIp(ComponentIP)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent_Ip()
   * @model containment="true"
   * @generated
   */
  ComponentIP getIp();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getIp <em>Ip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip</em>' containment reference.
   * @see #getIp()
   * @generated
   */
  void setIp(ComponentIP value);

  /**
   * Returns the value of the '<em><b>Mqtt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mqtt</em>' attribute.
   * @see #setMqtt(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent_Mqtt()
   * @model
   * @generated
   */
  String getMqtt();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getMqtt <em>Mqtt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mqtt</em>' attribute.
   * @see #getMqtt()
   * @generated
   */
  void setMqtt(String value);

  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(QActorSystemSpec)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent_System()
   * @model containment="true"
   * @generated
   */
  QActorSystemSpec getSystem();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.SimpleAgent#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(QActorSystemSpec value);

  /**
   * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.jcc.xtext.simpleAgent.BehaviorDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviors</em>' containment reference list.
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getSimpleAgent_Behaviors()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorDeclaration> getBehaviors();

} // SimpleAgent
