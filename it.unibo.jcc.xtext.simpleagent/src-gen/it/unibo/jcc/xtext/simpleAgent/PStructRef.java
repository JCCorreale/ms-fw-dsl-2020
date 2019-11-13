/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PStruct Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.PStructRef#getStruct <em>Struct</em>}</li>
 * </ul>
 *
 * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getPStructRef()
 * @model
 * @generated
 */
public interface PStructRef extends PHead
{
  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(PStruct)
   * @see it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage#getPStructRef_Struct()
   * @model containment="true"
   * @generated
   */
  PStruct getStruct();

  /**
   * Sets the value of the '{@link it.unibo.jcc.xtext.simpleAgent.PStructRef#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(PStruct value);

} // PStructRef
