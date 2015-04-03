/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getContext <em>Context</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getServiceRef <em>Service Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceInvocation()
 * @model
 * @generated
 */
public interface ServiceInvocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceInvocation_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceInvocation_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Service Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Ref</em>' reference.
	 * @see #setServiceRef(ServiceRef)
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getServiceInvocation_ServiceRef()
	 * @model required="true"
	 * @generated
	 */
	ServiceRef getServiceRef();

	/**
	 * Sets the value of the '{@link com.github.lbroudoux.dsl.eip.ServiceInvocation#getServiceRef <em>Service Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Ref</em>' reference.
	 * @see #getServiceRef()
	 * @generated
	 */
	void setServiceRef(ServiceRef value);

} // ServiceInvocation
