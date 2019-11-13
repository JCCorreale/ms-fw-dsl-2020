/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent.impl;

import it.unibo.jcc.xtext.simpleAgent.PHead;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage;
import it.unibo.jcc.xtext.simpleAgent.SolveGoal;
import it.unibo.jcc.xtext.simpleAgent.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solve Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.SolveGoalImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.SolveGoalImpl#getResVar <em>Res Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolveGoalImpl extends StateActionImpl implements SolveGoal
{
  /**
   * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoal()
   * @generated
   * @ordered
   */
  protected PHead goal;

  /**
   * The cached value of the '{@link #getResVar() <em>Res Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResVar()
   * @generated
   * @ordered
   */
  protected Variable resVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SolveGoalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleAgentPackage.Literals.SOLVE_GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PHead getGoal()
  {
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoal(PHead newGoal, NotificationChain msgs)
  {
    PHead oldGoal = goal;
    goal = newGoal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.SOLVE_GOAL__GOAL, oldGoal, newGoal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGoal(PHead newGoal)
  {
    if (newGoal != goal)
    {
      NotificationChain msgs = null;
      if (goal != null)
        msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.SOLVE_GOAL__GOAL, null, msgs);
      if (newGoal != null)
        msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.SOLVE_GOAL__GOAL, null, msgs);
      msgs = basicSetGoal(newGoal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.SOLVE_GOAL__GOAL, newGoal, newGoal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getResVar()
  {
    return resVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResVar(Variable newResVar, NotificationChain msgs)
  {
    Variable oldResVar = resVar;
    resVar = newResVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.SOLVE_GOAL__RES_VAR, oldResVar, newResVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResVar(Variable newResVar)
  {
    if (newResVar != resVar)
    {
      NotificationChain msgs = null;
      if (resVar != null)
        msgs = ((InternalEObject)resVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.SOLVE_GOAL__RES_VAR, null, msgs);
      if (newResVar != null)
        msgs = ((InternalEObject)newResVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.SOLVE_GOAL__RES_VAR, null, msgs);
      msgs = basicSetResVar(newResVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.SOLVE_GOAL__RES_VAR, newResVar, newResVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.SOLVE_GOAL__GOAL:
        return basicSetGoal(null, msgs);
      case SimpleAgentPackage.SOLVE_GOAL__RES_VAR:
        return basicSetResVar(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.SOLVE_GOAL__GOAL:
        return getGoal();
      case SimpleAgentPackage.SOLVE_GOAL__RES_VAR:
        return getResVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.SOLVE_GOAL__GOAL:
        setGoal((PHead)newValue);
        return;
      case SimpleAgentPackage.SOLVE_GOAL__RES_VAR:
        setResVar((Variable)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.SOLVE_GOAL__GOAL:
        setGoal((PHead)null);
        return;
      case SimpleAgentPackage.SOLVE_GOAL__RES_VAR:
        setResVar((Variable)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.SOLVE_GOAL__GOAL:
        return goal != null;
      case SimpleAgentPackage.SOLVE_GOAL__RES_VAR:
        return resVar != null;
    }
    return super.eIsSet(featureID);
  }

} //SolveGoalImpl