/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getType <em>Type</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getCondition <em>Condition</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getBody <em>Body</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getCompensation()
 * @model
 * @generated
 */
public interface Compensation extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getCompensation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getCompensation_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ActionBody)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getCompensation_Body()
   * @model containment="true"
   * @generated
   */
  ActionBody getBody();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ActionBody value);

  /**
   * Returns the value of the '<em><b>Goal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' attribute.
   * @see #setGoal(String)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getCompensation_Goal()
   * @model
   * @generated
   */
  String getGoal();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Compensation#getGoal <em>Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' attribute.
   * @see #getGoal()
   * @generated
   */
  void setGoal(String value);

} // Compensation
