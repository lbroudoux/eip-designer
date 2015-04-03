/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocable Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.lbroudoux.dsl.eip.InvocableEndpoint#getOwnedServiceInvocations <em>Owned Service Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.lbroudoux.dsl.eip.EipPackage#getInvocableEndpoint()
 * @model
 * @generated
 */
public interface InvocableEndpoint extends Endpoint {
	/**
	 * Returns the value of the '<em><b>Owned Service Invocations</b></em>' containment reference list.
	 * The list contents are of type {@link com.github.lbroudoux.dsl.eip.ServiceInvocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Service Invocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Service Invocations</em>' containment reference list.
	 * @see com.github.lbroudoux.dsl.eip.EipPackage#getInvocableEndpoint_OwnedServiceInvocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceInvocation> getOwnedServiceInvocations();

} // InvocableEndpoint
