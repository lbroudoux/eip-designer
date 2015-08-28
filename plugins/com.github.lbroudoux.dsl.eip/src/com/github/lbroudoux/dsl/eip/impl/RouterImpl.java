/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.ConditionalRoute;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Router;
import com.github.lbroudoux.dsl.eip.RoutingType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getToChannels <em>To Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getOwnedRoutes <em>Owned Routes</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.RouterImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouterImpl extends MetadatableImpl implements Router {
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
    * The cached value of the '{@link #getToChannels() <em>To Channels</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getToChannels()
    * @generated
    * @ordered
    */
   protected EList<Channel> toChannels;

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
    * The cached value of the '{@link #getOwnedRoutes() <em>Owned Routes</em>}' containment reference list.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getOwnedRoutes()
    * @generated
    * @ordered
    */
	protected EList<ConditionalRoute> ownedRoutes;

	/**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
	protected static final RoutingType TYPE_EDEFAULT = RoutingType.HEADER_VALUE;

	/**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
	protected RoutingType type = TYPE_EDEFAULT;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected RouterImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.ROUTER;
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
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.ROUTER__NAME, oldName, name));
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Channel> getToChannels() {
      if (toChannels == null) {
         toChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.ROUTER__TO_CHANNELS, EipPackage.CHANNEL__FROM_ENDPOINT);
      }
      return toChannels;
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<Channel> getFromChannels() {
      if (fromChannels == null) {
         fromChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.ROUTER__FROM_CHANNELS, EipPackage.CHANNEL__TO_ENDPOINT);
      }
      return fromChannels;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public EList<ConditionalRoute> getOwnedRoutes() {
      if (ownedRoutes == null) {
         ownedRoutes = new EObjectContainmentEList<ConditionalRoute>(ConditionalRoute.class, this, EipPackage.ROUTER__OWNED_ROUTES);
      }
      return ownedRoutes;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public RoutingType getType() {
      return type;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setType(RoutingType newType) {
      RoutingType oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.ROUTER__TYPE, oldType, type));
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
         case EipPackage.ROUTER__TO_CHANNELS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getToChannels()).basicAdd(otherEnd, msgs);
         case EipPackage.ROUTER__FROM_CHANNELS:
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
         case EipPackage.ROUTER__TO_CHANNELS:
            return ((InternalEList<?>)getToChannels()).basicRemove(otherEnd, msgs);
         case EipPackage.ROUTER__FROM_CHANNELS:
            return ((InternalEList<?>)getFromChannels()).basicRemove(otherEnd, msgs);
         case EipPackage.ROUTER__OWNED_ROUTES:
            return ((InternalEList<?>)getOwnedRoutes()).basicRemove(otherEnd, msgs);
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
         case EipPackage.ROUTER__NAME:
            return getName();
         case EipPackage.ROUTER__TO_CHANNELS:
            return getToChannels();
         case EipPackage.ROUTER__FROM_CHANNELS:
            return getFromChannels();
         case EipPackage.ROUTER__OWNED_ROUTES:
            return getOwnedRoutes();
         case EipPackage.ROUTER__TYPE:
            return getType();
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
         case EipPackage.ROUTER__NAME:
            setName((String)newValue);
            return;
         case EipPackage.ROUTER__TO_CHANNELS:
            getToChannels().clear();
            getToChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.ROUTER__FROM_CHANNELS:
            getFromChannels().clear();
            getFromChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.ROUTER__OWNED_ROUTES:
            getOwnedRoutes().clear();
            getOwnedRoutes().addAll((Collection<? extends ConditionalRoute>)newValue);
            return;
         case EipPackage.ROUTER__TYPE:
            setType((RoutingType)newValue);
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
         case EipPackage.ROUTER__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EipPackage.ROUTER__TO_CHANNELS:
            getToChannels().clear();
            return;
         case EipPackage.ROUTER__FROM_CHANNELS:
            getFromChannels().clear();
            return;
         case EipPackage.ROUTER__OWNED_ROUTES:
            getOwnedRoutes().clear();
            return;
         case EipPackage.ROUTER__TYPE:
            setType(TYPE_EDEFAULT);
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
         case EipPackage.ROUTER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EipPackage.ROUTER__TO_CHANNELS:
            return toChannels != null && !toChannels.isEmpty();
         case EipPackage.ROUTER__FROM_CHANNELS:
            return fromChannels != null && !fromChannels.isEmpty();
         case EipPackage.ROUTER__OWNED_ROUTES:
            return ownedRoutes != null && !ownedRoutes.isEmpty();
         case EipPackage.ROUTER__TYPE:
            return type != TYPE_EDEFAULT;
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
      result.append(", type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} //RouterImpl
