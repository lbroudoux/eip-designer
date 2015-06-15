/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Endpoint;
import com.github.lbroudoux.dsl.eip.ExchangeType;
import com.github.lbroudoux.dsl.eip.Route;

import com.github.lbroudoux.dsl.eip.ServiceRef;
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
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedEndpoints <em>Owned Endpoints</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedChannels <em>Owned Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getOwnedServiceRefs <em>Owned Service Refs</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouteImpl#getExchangeType <em>Exchange Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
    * The cached value of the '{@link #getOwnedEndpoints() <em>Owned Endpoints</em>}' containment reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getOwnedEndpoints()
    * @generated
    * @ordered
    */
	protected EList<Endpoint> ownedEndpoints;

	/**
    * The cached value of the '{@link #getOwnedChannels() <em>Owned Channels</em>}' containment reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getOwnedChannels()
    * @generated
    * @ordered
    */
	protected EList<Channel> ownedChannels;

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
    * The cached value of the '{@link #getOwnedServiceRefs() <em>Owned Service Refs</em>}' containment reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getOwnedServiceRefs()
    * @generated
    * @ordered
    */
	protected EList<ServiceRef> ownedServiceRefs;

	/**
    * The default value of the '{@link #getExchangeType() <em>Exchange Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExchangeType()
    * @generated
    * @ordered
    */
   protected static final ExchangeType EXCHANGE_TYPE_EDEFAULT = ExchangeType.IN_ONLY;

   /**
    * The cached value of the '{@link #getExchangeType() <em>Exchange Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExchangeType()
    * @generated
    * @ordered
    */
   protected ExchangeType exchangeType = EXCHANGE_TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected RouteImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.ROUTE;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<Endpoint> getOwnedEndpoints() {
      if (ownedEndpoints == null) {
         ownedEndpoints = new EObjectContainmentEList<Endpoint>(Endpoint.class, this, EipPackage.ROUTE__OWNED_ENDPOINTS);
      }
      return ownedEndpoints;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<Channel> getOwnedChannels() {
      if (ownedChannels == null) {
         ownedChannels = new EObjectContainmentEList<Channel>(Channel.class, this, EipPackage.ROUTE__OWNED_CHANNELS);
      }
      return ownedChannels;
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
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.ROUTE__NAME, oldName, name));
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<ServiceRef> getOwnedServiceRefs() {
      if (ownedServiceRefs == null) {
         ownedServiceRefs = new EObjectContainmentEList<ServiceRef>(ServiceRef.class, this, EipPackage.ROUTE__OWNED_SERVICE_REFS);
      }
      return ownedServiceRefs;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExchangeType getExchangeType() {
      return exchangeType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExchangeType(ExchangeType newExchangeType) {
      ExchangeType oldExchangeType = exchangeType;
      exchangeType = newExchangeType == null ? EXCHANGE_TYPE_EDEFAULT : newExchangeType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.ROUTE__EXCHANGE_TYPE, oldExchangeType, exchangeType));
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case EipPackage.ROUTE__OWNED_ENDPOINTS:
            return ((InternalEList<?>)getOwnedEndpoints()).basicRemove(otherEnd, msgs);
         case EipPackage.ROUTE__OWNED_CHANNELS:
            return ((InternalEList<?>)getOwnedChannels()).basicRemove(otherEnd, msgs);
         case EipPackage.ROUTE__OWNED_SERVICE_REFS:
            return ((InternalEList<?>)getOwnedServiceRefs()).basicRemove(otherEnd, msgs);
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
         case EipPackage.ROUTE__OWNED_ENDPOINTS:
            return getOwnedEndpoints();
         case EipPackage.ROUTE__OWNED_CHANNELS:
            return getOwnedChannels();
         case EipPackage.ROUTE__NAME:
            return getName();
         case EipPackage.ROUTE__OWNED_SERVICE_REFS:
            return getOwnedServiceRefs();
         case EipPackage.ROUTE__EXCHANGE_TYPE:
            return getExchangeType();
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
         case EipPackage.ROUTE__OWNED_ENDPOINTS:
            getOwnedEndpoints().clear();
            getOwnedEndpoints().addAll((Collection<? extends Endpoint>)newValue);
            return;
         case EipPackage.ROUTE__OWNED_CHANNELS:
            getOwnedChannels().clear();
            getOwnedChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.ROUTE__NAME:
            setName((String)newValue);
            return;
         case EipPackage.ROUTE__OWNED_SERVICE_REFS:
            getOwnedServiceRefs().clear();
            getOwnedServiceRefs().addAll((Collection<? extends ServiceRef>)newValue);
            return;
         case EipPackage.ROUTE__EXCHANGE_TYPE:
            setExchangeType((ExchangeType)newValue);
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
         case EipPackage.ROUTE__OWNED_ENDPOINTS:
            getOwnedEndpoints().clear();
            return;
         case EipPackage.ROUTE__OWNED_CHANNELS:
            getOwnedChannels().clear();
            return;
         case EipPackage.ROUTE__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EipPackage.ROUTE__OWNED_SERVICE_REFS:
            getOwnedServiceRefs().clear();
            return;
         case EipPackage.ROUTE__EXCHANGE_TYPE:
            setExchangeType(EXCHANGE_TYPE_EDEFAULT);
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
         case EipPackage.ROUTE__OWNED_ENDPOINTS:
            return ownedEndpoints != null && !ownedEndpoints.isEmpty();
         case EipPackage.ROUTE__OWNED_CHANNELS:
            return ownedChannels != null && !ownedChannels.isEmpty();
         case EipPackage.ROUTE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EipPackage.ROUTE__OWNED_SERVICE_REFS:
            return ownedServiceRefs != null && !ownedServiceRefs.isEmpty();
         case EipPackage.ROUTE__EXCHANGE_TYPE:
            return exchangeType != EXCHANGE_TYPE_EDEFAULT;
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
      result.append(", exchangeType: ");
      result.append(exchangeType);
      result.append(')');
      return result.toString();
   }

} //RouteImpl
