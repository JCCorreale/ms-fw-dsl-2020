/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent.impl;

import it.unibo.jcc.xtext.simpleAgent.BehaviorDeclaration;
import it.unibo.jcc.xtext.simpleAgent.Forward;
import it.unibo.jcc.xtext.simpleAgent.Message;
import it.unibo.jcc.xtext.simpleAgent.PHead;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.ForwardImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.ForwardImpl#getMsgref <em>Msgref</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.ForwardImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForwardImpl extends StateActionImpl implements Forward
{
  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected BehaviorDeclaration dest;

  /**
   * The cached value of the '{@link #getMsgref() <em>Msgref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsgref()
   * @generated
   * @ordered
   */
  protected Message msgref;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected PHead val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForwardImpl()
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
    return SimpleAgentPackage.Literals.FORWARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BehaviorDeclaration getDest()
  {
    if (dest != null && dest.eIsProxy())
    {
      InternalEObject oldDest = (InternalEObject)dest;
      dest = (BehaviorDeclaration)eResolveProxy(oldDest);
      if (dest != oldDest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleAgentPackage.FORWARD__DEST, oldDest, dest));
      }
    }
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorDeclaration basicGetDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDest(BehaviorDeclaration newDest)
  {
    BehaviorDeclaration oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.FORWARD__DEST, oldDest, dest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Message getMsgref()
  {
    if (msgref != null && msgref.eIsProxy())
    {
      InternalEObject oldMsgref = (InternalEObject)msgref;
      msgref = (Message)eResolveProxy(oldMsgref);
      if (msgref != oldMsgref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleAgentPackage.FORWARD__MSGREF, oldMsgref, msgref));
      }
    }
    return msgref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetMsgref()
  {
    return msgref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMsgref(Message newMsgref)
  {
    Message oldMsgref = msgref;
    msgref = newMsgref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.FORWARD__MSGREF, oldMsgref, msgref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PHead getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(PHead newVal, NotificationChain msgs)
  {
    PHead oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.FORWARD__VAL, oldVal, newVal);
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
  public void setVal(PHead newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.FORWARD__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.FORWARD__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.FORWARD__VAL, newVal, newVal));
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
      case SimpleAgentPackage.FORWARD__VAL:
        return basicSetVal(null, msgs);
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
      case SimpleAgentPackage.FORWARD__DEST:
        if (resolve) return getDest();
        return basicGetDest();
      case SimpleAgentPackage.FORWARD__MSGREF:
        if (resolve) return getMsgref();
        return basicGetMsgref();
      case SimpleAgentPackage.FORWARD__VAL:
        return getVal();
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
      case SimpleAgentPackage.FORWARD__DEST:
        setDest((BehaviorDeclaration)newValue);
        return;
      case SimpleAgentPackage.FORWARD__MSGREF:
        setMsgref((Message)newValue);
        return;
      case SimpleAgentPackage.FORWARD__VAL:
        setVal((PHead)newValue);
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
      case SimpleAgentPackage.FORWARD__DEST:
        setDest((BehaviorDeclaration)null);
        return;
      case SimpleAgentPackage.FORWARD__MSGREF:
        setMsgref((Message)null);
        return;
      case SimpleAgentPackage.FORWARD__VAL:
        setVal((PHead)null);
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
      case SimpleAgentPackage.FORWARD__DEST:
        return dest != null;
      case SimpleAgentPackage.FORWARD__MSGREF:
        return msgref != null;
      case SimpleAgentPackage.FORWARD__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //ForwardImpl