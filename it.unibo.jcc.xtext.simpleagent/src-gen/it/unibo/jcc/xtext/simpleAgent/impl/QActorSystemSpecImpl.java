/**
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.simpleAgent.impl;

import it.unibo.jcc.xtext.simpleAgent.BrokerSpec;
import it.unibo.jcc.xtext.simpleAgent.Context;
import it.unibo.jcc.xtext.simpleAgent.Message;
import it.unibo.jcc.xtext.simpleAgent.QActorSystemSpec;
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
 * An implementation of the model object '<em><b>QActor System Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.QActorSystemSpecImpl#getMqttBroker <em>Mqtt Broker</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.QActorSystemSpecImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link it.unibo.jcc.xtext.simpleAgent.impl.QActorSystemSpecImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QActorSystemSpecImpl extends MinimalEObjectImpl.Container implements QActorSystemSpec
{
  /**
   * The cached value of the '{@link #getMqttBroker() <em>Mqtt Broker</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMqttBroker()
   * @generated
   * @ordered
   */
  protected BrokerSpec mqttBroker;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected EList<Message> message;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected EList<Context> context;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QActorSystemSpecImpl()
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
    return SimpleAgentPackage.Literals.QACTOR_SYSTEM_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BrokerSpec getMqttBroker()
  {
    return mqttBroker;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMqttBroker(BrokerSpec newMqttBroker, NotificationChain msgs)
  {
    BrokerSpec oldMqttBroker = mqttBroker;
    mqttBroker = newMqttBroker;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER, oldMqttBroker, newMqttBroker);
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
  public void setMqttBroker(BrokerSpec newMqttBroker)
  {
    if (newMqttBroker != mqttBroker)
    {
      NotificationChain msgs = null;
      if (mqttBroker != null)
        msgs = ((InternalEObject)mqttBroker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER, null, msgs);
      if (newMqttBroker != null)
        msgs = ((InternalEObject)newMqttBroker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER, null, msgs);
      msgs = basicSetMqttBroker(newMqttBroker, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER, newMqttBroker, newMqttBroker));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Message> getMessage()
  {
    if (message == null)
    {
      message = new EObjectContainmentEList<Message>(Message.class, this, SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE);
    }
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Context> getContext()
  {
    if (context == null)
    {
      context = new EObjectContainmentEList<Context>(Context.class, this, SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT);
    }
    return context;
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
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER:
        return basicSetMqttBroker(null, msgs);
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE:
        return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT:
        return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
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
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER:
        return getMqttBroker();
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE:
        return getMessage();
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT:
        return getContext();
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
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER:
        setMqttBroker((BrokerSpec)newValue);
        return;
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE:
        getMessage().clear();
        getMessage().addAll((Collection<? extends Message>)newValue);
        return;
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends Context>)newValue);
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
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER:
        setMqttBroker((BrokerSpec)null);
        return;
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE:
        getMessage().clear();
        return;
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT:
        getContext().clear();
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
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MQTT_BROKER:
        return mqttBroker != null;
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__MESSAGE:
        return message != null && !message.isEmpty();
      case SimpleAgentPackage.QACTOR_SYSTEM_SPEC__CONTEXT:
        return context != null && !context.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QActorSystemSpecImpl