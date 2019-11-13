/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guarded State Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getGuard <em>Guard</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#isSolveGuard <em>Solve Guard</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getAction <em>Action</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getElseaction <em>Elseaction</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getGuardedStateAction()
 * @model
 * @generated
 */
public interface GuardedStateAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute.
   * @see #setGuard(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getGuardedStateAction_Guard()
   * @model
   * @generated
   */
  String getGuard();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getGuard <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' attribute.
   * @see #getGuard()
   * @generated
   */
  void setGuard(String value);

  /**
   * Returns the value of the '<em><b>Solve Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Solve Guard</em>' attribute.
   * @see #setSolveGuard(boolean)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getGuardedStateAction_SolveGuard()
   * @model
   * @generated
   */
  boolean isSolveGuard();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#isSolveGuard <em>Solve Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Solve Guard</em>' attribute.
   * @see #isSolveGuard()
   * @generated
   */
  void setSolveGuard(boolean value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(StateAction)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getGuardedStateAction_Action()
   * @model containment="true"
   * @generated
   */
  StateAction getAction();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(StateAction value);

  /**
   * Returns the value of the '<em><b>Elseaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseaction</em>' containment reference.
   * @see #setElseaction(StateAction)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getGuardedStateAction_Elseaction()
   * @model containment="true"
   * @generated
   */
  StateAction getElseaction();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.GuardedStateAction#getElseaction <em>Elseaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elseaction</em>' containment reference.
   * @see #getElseaction()
   * @generated
   */
  void setElseaction(StateAction value);

} // GuardedStateAction
