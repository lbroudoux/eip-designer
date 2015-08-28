/**
 */
package com.github.lbroudoux.dsl.eip;


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
 *   <li>{@link com.github.lbroudoux.dsl.eip.Channel#isGuaranteed <em>Guaranteed</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Metadatable {

	/**
    * Returns the value of the '<em><b>To Endpoint</b></em>' reference.
    * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Endpoint#getFromChannels <em>From Channels</em>}'.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>To Endpoint</em>' reference.
    * @see #setToEndpoint(Endpoint)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_ToEndpoint()
    * @see com.github.lbroudoux.dsl.eip.Endpoint#getFromChannels
    * @model opposite="fromChannels"
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
    * It is bidirectional and its opposite is '{@link com.github.lbroudoux.dsl.eip.Endpoint#getToChannels <em>To Channels</em>}'.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * @return the value of the '<em>From Endpoint</em>' reference.
    * @see #setFromEndpoint(Endpoint)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_FromEndpoint()
    * @see com.github.lbroudoux.dsl.eip.Endpoint#getToChannels
    * @model opposite="toChannels"
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

	/**
    * Returns the value of the '<em><b>Guaranteed</b></em>' attribute.
    * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guaranteed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Whether channel should guarantee delivery (through a repository or store mechanism for example).
    * <!-- end-model-doc -->
    * @return the value of the '<em>Guaranteed</em>' attribute.
    * @see #setGuaranteed(boolean)
    * @see com.github.lbroudoux.dsl.eip.EipPackage#getChannel_Guaranteed()
    * @model
    * @generated
    */
	boolean isGuaranteed();

	/**
    * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.Channel#isGuaranteed <em>Guaranteed</em>}' attribute.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Guaranteed</em>' attribute.
    * @see #isGuaranteed()
    * @generated
    */
	void setGuaranteed(boolean value);
} // Channel
