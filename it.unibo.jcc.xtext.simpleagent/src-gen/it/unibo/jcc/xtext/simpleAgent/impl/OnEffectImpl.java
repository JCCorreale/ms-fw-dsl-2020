/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent.impl;

import it.unibo.jcc.xtext.simpleAgent.ActionBody;
import it.unibo.jcc.xtext.simpleAgent.Compensation;
import it.unibo.jcc.xtext.simpleAgent.Message;
import it.unibo.jcc.xtext.simpleAgent.OnEffect;
import it.unibo.jcc.xtext.simpleAgent.SimpleAgentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.OnEffectImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.OnEffectImpl#getBody <em>Body</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.OnEffectImpl#getCompensations <em>Compensations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnEffectImpl extends MinimalEObjectImpl.Container implements OnEffect
{
  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected Message effect;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ActionBody body;

  /**
   * The cached value of the '{@link #getCompensations() <em>Compensations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompensations()
   * @generated
   * @ordered
   */
  protected EList<Compensation> compensations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OnEffectImpl()
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
    return SimpleAgentPackage.Literals.ON_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Message getEffect()
  {
    if (effect != null && effect.eIsProxy())
    {
      InternalEObject oldEffect = (InternalEObject)effect;
      effect = (Message)eResolveProxy(oldEffect);
      if (effect != oldEffect)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleAgentPackage.ON_EFFECT__EFFECT, oldEffect, effect));
      }
    }
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEffect(Message newEffect)
  {
    Message oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.ON_EFFECT__EFFECT, oldEffect, effect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ActionBody newBody, NotificationChain msgs)
  {
    ActionBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.ON_EFFECT__BODY, oldBody, newBody);
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
  public void setBody(ActionBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.ON_EFFECT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.ON_EFFECT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.ON_EFFECT__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Compensation> getCompensations()
  {
    if (compensations == null)
    {
      compensations = new EObjectContainmentEList<Compensation>(Compensation.class, this, SimpleAgentPackage.ON_EFFECT__COMPENSATIONS);
    }
    return compensations;
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
      case SimpleAgentPackage.ON_EFFECT__BODY:
        return basicSetBody(null, msgs);
      case SimpleAgentPackage.ON_EFFECT__COMPENSATIONS:
        return ((InternalEList<?>)getCompensations()).basicRemove(otherEnd, msgs);
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
      case SimpleAgentPackage.ON_EFFECT__EFFECT:
        if (resolve) return getEffect();
        return basicGetEffect();
      case SimpleAgentPackage.ON_EFFECT__BODY:
        return getBody();
      case SimpleAgentPackage.ON_EFFECT__COMPENSATIONS:
        return getCompensations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleAgentPackage.ON_EFFECT__EFFECT:
        setEffect((Message)newValue);
        return;
      case SimpleAgentPackage.ON_EFFECT__BODY:
        setBody((ActionBody)newValue);
        return;
      case SimpleAgentPackage.ON_EFFECT__COMPENSATIONS:
        getCompensations().clear();
        getCompensations().addAll((Collection<? extends Compensation>)newValue);
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
      case SimpleAgentPackage.ON_EFFECT__EFFECT:
        setEffect((Message)null);
        return;
      case SimpleAgentPackage.ON_EFFECT__BODY:
        setBody((ActionBody)null);
        return;
      case SimpleAgentPackage.ON_EFFECT__COMPENSATIONS:
        getCompensations().clear();
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
      case SimpleAgentPackage.ON_EFFECT__EFFECT:
        return effect != null;
      case SimpleAgentPackage.ON_EFFECT__BODY:
        return body != null;
      case SimpleAgentPackage.ON_EFFECT__COMPENSATIONS:
        return compensations != null && !compensations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OnEffectImpl