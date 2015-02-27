/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;

import com.github.lbroudoux.dsl.eip.Endpoint;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getToEndpoint <em>To Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getFromEndpoint <em>From Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.ChannelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends MinimalEObjectImpl.Container implements Channel {
	/**
	 * The cached value of the '{@link #getToEndpoint() <em>To Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint toEndpoint;
	/**
	 * The cached value of the '{@link #getFromEndpoint() <em>From Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Endpoint fromEndpoint;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EipPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getToEndpoint() {
		if (toEndpoint != null && toEndpoint.eIsProxy()) {
			InternalEObject oldToEndpoint = (InternalEObject)toEndpoint;
			toEndpoint = (Endpoint)eResolveProxy(oldToEndpoint);
			if (toEndpoint != oldToEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EipPackage.CHANNEL__TO_ENDPOINT, oldToEndpoint, toEndpoint));
			}
		}
		return toEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetToEndpoint() {
		return toEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToEndpoint(Endpoint newToEndpoint, NotificationChain msgs) {
		Endpoint oldToEndpoint = toEndpoint;
		toEndpoint = newToEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EipPackage.CHANNEL__TO_ENDPOINT, oldToEndpoint, newToEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEndpoint(Endpoint newToEndpoint) {
		if (newToEndpoint != toEndpoint) {
			NotificationChain msgs = null;
			if (toEndpoint != null)
				msgs = ((InternalEObject)toEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__FROM_CHANNEL, Endpoint.class, msgs);
			if (newToEndpoint != null)
				msgs = ((InternalEObject)newToEndpoint).eInverseAdd(this, EipPackage.ENDPOINT__FROM_CHANNEL, Endpoint.class, msgs);
			msgs = basicSetToEndpoint(newToEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.CHANNEL__TO_ENDPOINT, newToEndpoint, newToEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint getFromEndpoint() {
		if (fromEndpoint != null && fromEndpoint.eIsProxy()) {
			InternalEObject oldFromEndpoint = (InternalEObject)fromEndpoint;
			fromEndpoint = (Endpoint)eResolveProxy(oldFromEndpoint);
			if (fromEndpoint != oldFromEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EipPackage.CHANNEL__FROM_ENDPOINT, oldFromEndpoint, fromEndpoint));
			}
		}
		return fromEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoint basicGetFromEndpoint() {
		return fromEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromEndpoint(Endpoint newFromEndpoint, NotificationChain msgs) {
		Endpoint oldFromEndpoint = fromEndpoint;
		fromEndpoint = newFromEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EipPackage.CHANNEL__FROM_ENDPOINT, oldFromEndpoint, newFromEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromEndpoint(Endpoint newFromEndpoint) {
		if (newFromEndpoint != fromEndpoint) {
			NotificationChain msgs = null;
			if (fromEndpoint != null)
				msgs = ((InternalEObject)fromEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__TO_CHANNEL, Endpoint.class, msgs);
			if (newFromEndpoint != null)
				msgs = ((InternalEObject)newFromEndpoint).eInverseAdd(this, EipPackage.ENDPOINT__TO_CHANNEL, Endpoint.class, msgs);
			msgs = basicSetFromEndpoint(newFromEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.CHANNEL__FROM_ENDPOINT, newFromEndpoint, newFromEndpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EipPackage.CHANNEL__TO_ENDPOINT:
				if (toEndpoint != null)
					msgs = ((InternalEObject)toEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__FROM_CHANNEL, Endpoint.class, msgs);
				return basicSetToEndpoint((Endpoint)otherEnd, msgs);
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				if (fromEndpoint != null)
					msgs = ((InternalEObject)fromEndpoint).eInverseRemove(this, EipPackage.ENDPOINT__TO_CHANNEL, Endpoint.class, msgs);
				return basicSetFromEndpoint((Endpoint)otherEnd, msgs);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				return basicSetToEndpoint(null, msgs);
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				return basicSetFromEndpoint(null, msgs);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				if (resolve) return getToEndpoint();
				return basicGetToEndpoint();
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				if (resolve) return getFromEndpoint();
				return basicGetFromEndpoint();
			case EipPackage.CHANNEL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EipPackage.CHANNEL__TO_ENDPOINT:
				setToEndpoint((Endpoint)newValue);
				return;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				setFromEndpoint((Endpoint)newValue);
				return;
			case EipPackage.CHANNEL__NAME:
				setName((String)newValue);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				setToEndpoint((Endpoint)null);
				return;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				setFromEndpoint((Endpoint)null);
				return;
			case EipPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
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
			case EipPackage.CHANNEL__TO_ENDPOINT:
				return toEndpoint != null;
			case EipPackage.CHANNEL__FROM_ENDPOINT:
				return fromEndpoint != null;
			case EipPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ChannelImpl
