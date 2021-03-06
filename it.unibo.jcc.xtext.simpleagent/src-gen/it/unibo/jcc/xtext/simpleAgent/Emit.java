/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Emit#getMsgref <em>Msgref</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.Emit#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getEmit()
 * @model
 * @generated
 */
public interface Emit extends StateAction
{
  /**
   * Returns the value of the '<em><b>Msgref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msgref</em>' reference.
   * @see #setMsgref(Event)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getEmit_Msgref()
   * @model
   * @generated
   */
  Event getMsgref();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Emit#getMsgref <em>Msgref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msgref</em>' reference.
   * @see #getMsgref()
   * @generated
   */
  void setMsgref(Event value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(PHead)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getEmit_Val()
   * @model containment="true"
   * @generated
   */
  PHead getVal();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.Emit#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(PHead value);

} // Emit
