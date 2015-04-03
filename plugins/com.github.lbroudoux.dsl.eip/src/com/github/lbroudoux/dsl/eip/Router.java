/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Router#getOwnedRoutes <em>Owned Routes</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Router#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getRouter()
 * @model
 * @generated
 */
public interface Router extends Endpoint {

	/**
	 * Returns the value of the '<em><b>Owned Routes</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.lbroudoux.dsl.eip.ConditionalRoute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Routes</em>' containment reference list.
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getRouter_OwnedRoutes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalRoute> getOwnedRoutes();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.github.lbroudoux.dsl.eip.RoutingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.github.lbroudoux.dsl.eip.RoutingType
	 * @see #setType(RoutingType)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getRouter_Type()
	 * @model
	 * @generated
	 */
	RoutingType getType();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Router#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.github.lbroudoux.dsl.eip.RoutingType
	 * @see #getType()
	 * @generated
	 */
	void setType(RoutingType value);
} // Router
