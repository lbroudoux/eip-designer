/**
 */
package com.github.lbroudoux.dsl.eip.impl;

import com.github.lbroudoux.dsl.eip.Aggregator;
import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipPackage;
import com.github.lbroudoux.dsl.eip.MessagePart;
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
 * An implementation of the model object '<em><b>Aggregator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getToChannels <em>To Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getFromChannels <em>From Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getPart <em>Part</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.impl.AggregatorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatorImpl extends MetadatableImpl implements Aggregator {
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
    * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPart()
    * @generated
    * @ordered
    */
   protected static final MessagePart PART_EDEFAULT = MessagePart.HEADER;

   /**
    * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPart()
    * @generated
    * @ordered
    */
   protected MessagePart part = PART_EDEFAULT;

   /**
    * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getStrategy()
    * @generated
    * @ordered
    */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
    * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see #getStrategy()
    * @generated
    * @ordered
    */
	protected String strategy = STRATEGY_EDEFAULT;

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
	protected AggregatorImpl() {
      super();
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
	protected EClass eStaticClass() {
      return EipPackage.Literals.AGGREGATOR;
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
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.AGGREGATOR__NAME, oldName, name));
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Channel> getToChannels() {
      if (toChannels == null) {
         toChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.AGGREGATOR__TO_CHANNELS, EipPackage.CHANNEL__FROM_ENDPOINT);
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
         fromChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, EipPackage.AGGREGATOR__FROM_CHANNELS, EipPackage.CHANNEL__TO_ENDPOINT);
      }
      return fromChannels;
   }

	/**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MessagePart getPart() {
      return part;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPart(MessagePart newPart) {
      MessagePart oldPart = part;
      part = newPart == null ? PART_EDEFAULT : newPart;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.AGGREGATOR__PART, oldPart, part));
   }

   /**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public String getStrategy() {
      return strategy;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public void setStrategy(String newStrategy) {
      String oldStrategy = strategy;
      strategy = newStrategy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.AGGREGATOR__STRATEGY, oldStrategy, strategy));
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
         eNotify(new ENotificationImpl(this, Notification.SET, EipPackage.AGGREGATOR__EXPRESSION, oldExpression, expression));
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
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getToChannels()).basicAdd(otherEnd, msgs);
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
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
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            return ((InternalEList<?>)getToChannels()).basicRemove(otherEnd, msgs);
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
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
         case EipPackage.AGGREGATOR__NAME:
            return getName();
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            return getToChannels();
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
            return getFromChannels();
         case EipPackage.AGGREGATOR__PART:
            return getPart();
         case EipPackage.AGGREGATOR__STRATEGY:
            return getStrategy();
         case EipPackage.AGGREGATOR__EXPRESSION:
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
         case EipPackage.AGGREGATOR__NAME:
            setName((String)newValue);
            return;
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            getToChannels().clear();
            getToChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
            getFromChannels().clear();
            getFromChannels().addAll((Collection<? extends Channel>)newValue);
            return;
         case EipPackage.AGGREGATOR__PART:
            setPart((MessagePart)newValue);
            return;
         case EipPackage.AGGREGATOR__STRATEGY:
            setStrategy((String)newValue);
            return;
         case EipPackage.AGGREGATOR__EXPRESSION:
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
         case EipPackage.AGGREGATOR__NAME:
            setName(NAME_EDEFAULT);
            return;
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            getToChannels().clear();
            return;
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
            getFromChannels().clear();
            return;
         case EipPackage.AGGREGATOR__PART:
            setPart(PART_EDEFAULT);
            return;
         case EipPackage.AGGREGATOR__STRATEGY:
            setStrategy(STRATEGY_EDEFAULT);
            return;
         case EipPackage.AGGREGATOR__EXPRESSION:
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
         case EipPackage.AGGREGATOR__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case EipPackage.AGGREGATOR__TO_CHANNELS:
            return toChannels != null && !toChannels.isEmpty();
         case EipPackage.AGGREGATOR__FROM_CHANNELS:
            return fromChannels != null && !fromChannels.isEmpty();
         case EipPackage.AGGREGATOR__PART:
            return part != PART_EDEFAULT;
         case EipPackage.AGGREGATOR__STRATEGY:
            return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
         case EipPackage.AGGREGATOR__EXPRESSION:
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
      result.append(", part: ");
      result.append(part);
      result.append(", strategy: ");
      result.append(strategy);
      result.append(", expression: ");
      result.append(expression);
      result.append(')');
      return result.toString();
   }

} //AggregatorImpl
