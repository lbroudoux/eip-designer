/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Gateway;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.GatewayImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.GatewayImpl#getToChannel <em>To Channel</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.GatewayImpl#getFromChannels <em>From Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GatewayImpl extends MetadatableImpl implements Gateway {
	/**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
	protected static final String NAME_EDEFAULT = null;

	/**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getName()
    * @generated
    * @ordered
    */
	protected String name = NAME_EDEFAULT;

	/**
    * The cached value of the '{@link #getToChannel() <em>To Channel</em>}' reference.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getToChannel()
    * @generated
    * @ordered
    */
	protected Channel toChannel;

	/**
    * The cached value of the '{@link #getFromChannels() <em>From Channels</em>}' reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getFromChannels()
    * @generated
    * @ordered
    */
	protected EList<Channel> fromChannels;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected GatewayImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.GATEWAY;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public String getName() {
      return name;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setName(String newName) {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.GATEWAY__NAME, oldName, name));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public Channel getToChannel() {
      if (toChannel != null && toChannel.eIsProxy()) {
         InternalEObject oldToChannel = (InternalEObject)toChannel;
         toChannel = (Channel)eResolveProxy(oldToChannel);
         if (toChannel != oldToChannel) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, EipPackage.GATEWAY__TO_CHANNEL, oldToChannel, toChannel));
         }
      }
      return toChannel;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public Channel basicGetToChannel() {
      return toChannel;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public NotificationChain basicSetToChannel(Channel newToChannel, NotificationChain msgs) {
      Channel oldToChannel = toChannel;
      toChannel = newToChannel;
      if (eNotificationRequired()) {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EipPackage.GATEWAY__TO_CHANNEL, oldToChannel, newToChannel);
         if (msgs == null) msgs = notification; else msgs.add(notification);
      }
      return msgs;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setToChannel(Channel newToChannel) {
      if (newToChannel != toChannel) {
         NotificationChain msgs = null;
         if (toChannel != null)
            msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
         if (newToChannel != null)
            msgs = ((InternalEObject)newToChannel).eInverseAdd(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
         msgs = basicSetToChannel(newToChannel, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.GATEWAY__TO_CHANNEL, newToChannel, newToChannel));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<Channel> getFromChannels() {
      if (fromChannels == null) {
         fromChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.GATEWAY__FROM_CHANNELS, EipPackage.CHANNEL__TO_ENDPOINT);
      }
      return fromChannels;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case EipPackage.GATEWAY__TO_CHANNEL:
            if (toChannel != null)
               msgs = ((InternalEObject)toChannel).eInverseRemove(this, EipPackage.CHANNEL__FROM_ENDPOINT, Channel.class, msgs);
            return basicSetToChannel((Channel)otherEnd, msgs);
         case EipPackage.GATEWAY__FROM_CHANNELS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromChannels()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case EipPackage.GATEWAY__TO_CHANNEL:
            return basicSetToChannel(null, msgs);
         case EipPackage.GATEWAY__FROM_CHANNELS:
            return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case EipPackage.GATEWAY__NAME:
            return getName();
         case EipPackage.GATEWAY__TO_CHANNEL:
            if (resolve) return getToChannel();
            return basicGetToChannel();
         case EipPackage.GATEWAY__FROM_CHANNELS:
            return getFromChannels();
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
	public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case EipPackage.GATEWAY__NAME:
            setName((String)newValue);
            return;
         case EipPackage.GATEWAY__TO_CHANNEL:
            setToChannel((Channel)newValue);
            return;
         case EipPackage.GATEWAY__FROM_CHANNELS:
            getFromChannels().clear();
            getFromChannels().addAll((Collection<? extends Channel>)newValue);
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
	public void eUnset(int featureID) {
      switch (featureID) {
         case EipPackage.GATEWAY__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EipPackage.GATEWAY__TO_CHANNEL:
            setToChannel((Channel)null);
            return;
         case EipPackage.GATEWAY__FROM_CHANNELS:
            getFromChannels().clear();
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
	public boolean eIsSet(int featureID) {
      switch (featureID) {
         case EipPackage.GATEWAY__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EipPackage.GATEWAY__TO_CHANNEL:
            return toChannel != null;
         case EipPackage.GATEWAY__FROM_CHANNELS:
            return fromChannels != null && !fromChannels.isEmpty();
      }
      return super.eIsSet(featureID);
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(')');
      return result.toString();
   }

} //GatewayImpl
