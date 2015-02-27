/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Channel#getToEndpoint <em>To Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint <em>From Endpoint</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Channel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject {

	/**
	 * Returns the value of the '<em><b>To Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Endpoint#getFromChannel <em>From Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Endpoint</em>' reference.
	 * @see #setToEndpoint(Endpoint)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_ToEndpoint()
	 * @see com.github.lbroudoux.dsl.eip.Endpoint#getFromChannel
	 * @model opposite="fromChannel"
	 * @generated
	 */
	Endpoint getToEndpoint();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Channel#getToEndpoint <em>To Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Endpoint</em>' reference.
	 * @see #getToEndpoint()
	 * @generated
	 */
	void setToEndpoint(Endpoint value);

	/**
	 * Returns the value of the '<em><b>From Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Endpoint#getToChannel <em>To Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Endpoint</em>' reference.
	 * @see #setFromEndpoint(Endpoint)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_FromEndpoint()
	 * @see com.github.lbroudoux.dsl.eip.Endpoint#getToChannel
	 * @model opposite="toChannel"
	 * @generated
	 */
	Endpoint getFromEndpoint();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint <em>From Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Endpoint</em>' reference.
	 * @see #getFromEndpoint()
	 * @generated
	 */
	void setFromEndpoint(Endpoint value);

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
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Channel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // Channel
