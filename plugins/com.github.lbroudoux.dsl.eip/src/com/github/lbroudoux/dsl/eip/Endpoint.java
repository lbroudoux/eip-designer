/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Endpoint#getName <em>Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Endpoint#getToChannels <em>To Channels</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.Endpoint#getFromChannels <em>From Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getEndpoint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Endpoint extends Metadatable {

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
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getEndpoint_Name()
    * @model required="true"
    * @generated
    */
	String getName();

	/**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Endpoint#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
	void setName(String value);

	/**
    * Returns the value of the '<em><b>To Channels</b></em>' reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Channel}.
    * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint <em>From Endpoint</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>To Channels</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>To Channels</em>' reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getEndpoint_ToChannels()
    * @see com.github.lbroudoux.dsl.eip.Channel#getFromEndpoint
    * @model opposite="fromEndpoint"
    * @generated
    */
   EList<Channel> getToChannels();

   /**
    * Returns the value of the '<em><b>From Channels</b></em>' reference list.
    * The list contents are of type {@link com.github.lbroudoux.dsl.eip.Channel}.
    * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Channel#getToEndpoint <em>To Endpoint</em>}'.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Channels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>From Channels</em>' reference list.
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getEndpoint_FromChannels()
    * @see com.github.lbroudoux.dsl.eip.Channel#getToEndpoint
    * @model opposite="toEndpoint"
    * @generated
    */
	EList<Channel> getFromChannels();
} // Endpoint
