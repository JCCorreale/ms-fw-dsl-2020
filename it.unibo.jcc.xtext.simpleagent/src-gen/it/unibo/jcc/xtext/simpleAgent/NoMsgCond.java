/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Msg Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.NoMsgCond#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getNoMsgCond()
 * @model
 * @generated
 */
public interface NoMsgCond extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getNoMsgCond_Actions()
   * @model containment="true"
   * @generated
   */
  EList<GuardedStateAction> getActions();

} // NoMsgCond
