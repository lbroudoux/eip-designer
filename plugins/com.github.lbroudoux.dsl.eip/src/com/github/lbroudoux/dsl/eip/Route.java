/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Route#getOwnedEndpoints <em>Owned Endpoints</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Route#getOwnedChannels <em>Owned Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Route#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Route#getOwnedServiceRefs <em>Owned Service Refs</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Route#getExchangeType <em>Exchange Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
    * Returns the value of the '<em><b>Owned Endpoints</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Endpoint}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Endpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Endpoints</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute_OwnedEndpoints()
    * @model containment="true"
    * @generated
    */
	EList<Endpoint> getOwnedEndpoints();

	/**
    * Returns the value of the '<em><b>Owned Channels</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Channel}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Channels</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute_OwnedChannels()
    * @model containment="true"
    * @generated
    */
	EList<Channel> getOwnedChannels();

	/**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute_Name()
    * @model required="true"
    * @generated
    */
	String getName();

	/**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Route#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
	void setName(String value);

	/**
    * Returns the value of the '<em><b>Owned Service Refs</b></em>' containment reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.ServiceRef}.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Service Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>Owned Service Refs</em>' containment reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute_OwnedServiceRefs()
    * @model containment="true"
    * @generated
    */
	EList<ServiceRef> getOwnedServiceRefs();

   /**
    * Returns the value of the '<em><b>Exchange Type</b></em>' attribute.
    * The literals are from the enumeration {@link com.github.lbroudoux.dsl.eip.ExchangeType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exchange Type</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Semantic of the exchange supported by the route : InOnly in case of a one-way message (for example, JMS messaging is often one-way messaging) ; InOut in case of a request-response message (for example, HTTP-based transports are often request reply).
    * 
    * 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Exchange Type</em>' attribute.
    * @see com.github.lbroudoux.dsl.eip.ExchangeType
    * @see #setExchangeType(ExchangeType)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getRoute_ExchangeType()
    * @model
    * @generated
    */
   ExchangeType getExchangeType();

   /**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Route#getExchangeType <em>Exchange Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exchange Type</em>' attribute.
    * @see com.github.lbroudoux.dsl.eip.ExchangeType
    * @see #getExchangeType()
    * @generated
    */
   void setExchangeType(ExchangeType value);

} // Route
