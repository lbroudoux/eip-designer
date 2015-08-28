/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.Filter;
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
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl#getToChannels <em>To Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.FilterImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends MetadatableImpl implements Filter {
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
    * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getExpression()
    * @generated
    * @ordered
    */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
    * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getExpression()
    * @generated
    * @ordered
    */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	protected FilterImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.FILTER;
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
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.FILTER__NAME, oldName, name));
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Channel> getToChannels() {
      if (toChannels == null) {
         toChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.FILTER__TO_CHANNELS, EipPackage.CHANNEL__FROM_ENDPOINT);
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
         fromChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.FILTER__FROM_CHANNELS, EipPackage.CHANNEL__TO_ENDPOINT);
      }
      return fromChannels;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public String getExpression() {
      return expression;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setExpression(String newExpression) {
      String oldExpression = expression;
      expression = newExpression;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.FILTER__EXPRESSION, oldExpression, expression));
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
         case EipPackage.FILTER__TO_CHANNELS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getToChannels()).basicAdd(otherEnd, msgs);
         case EipPackage.FILTER__FROM_CHANNELS:
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
         case EipPackage.FILTER__TO_CHANNELS:
            return ((InternalEList<?>)getToChannels()).basicRemove(otherEnd, msgs);
         case EipPackage.FILTER__FROM_CHANNELS:
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
         case EipPackage.FILTER__NAME:
            return getName();
         case EipPackage.FILTER__TO_CHANNELS:
            return getToChannels();
         case EipPackage.FILTER__FROM_CHANNELS:
            return getFromChannels();
         case EipPackage.FILTER__EXPRESSION:
            return getExpression();
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
         case EipPackage.FILTER__NAME:
            setName((String)newValue);
            return;
         case EipPackage.FILTER__TO_CHANNELS:
            getToChannels().clear();
            getToChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.FILTER__FROM_CHANNELS:
            getFromChannels().clear();
            getFromChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.FILTER__EXPRESSION:
            setExpression((String)newValue);
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
         case EipPackage.FILTER__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EipPackage.FILTER__TO_CHANNELS:
            getToChannels().clear();
            return;
         case EipPackage.FILTER__FROM_CHANNELS:
            getFromChannels().clear();
            return;
         case EipPackage.FILTER__EXPRESSION:
            setExpression(EXPRESSION_EDEFAULT);
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
         case EipPackage.FILTER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EipPackage.FILTER__TO_CHANNELS:
            return toChannels != null && !toChannels.isEmpty();
         case EipPackage.FILTER__FROM_CHANNELS:
            return fromChannels != null && !fromChannels.isEmpty();
         case EipPackage.FILTER__EXPRESSION:
            return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
      result.append(", expression: ");
      result.append(expression);
      result.append(')');
      return result.toString();
   }

} //FilterImpl
