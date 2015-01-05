/**
 */
package com.github.lbroudoux.dsl.eip;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.lbroudoux.dsl.eip.EipFactory
 * @model kind="package"
 * @generated
 */
public interface EipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eip";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.github.com/lbroudoux/dsl/eip/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eip";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EipPackage eINSTANCE = com.github.lbroudoux.dsl.eip.impl.EipPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.github.lbroudoux.dsl.eip.Endpoint
	 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEndpoint()
	 * @generated
	 */
	int ENDPOINT = 0;

	/**
	 * The number of structural features of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endpoint</em>'.
	 * @see com.github.lbroudoux.dsl.eip.Endpoint
	 * @generated
	 */
	EClass getEndpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EipFactory getEipFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.github.lbroudoux.dsl.eip.Endpoint <em>Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.github.lbroudoux.dsl.eip.Endpoint
		 * @see com.github.lbroudoux.dsl.eip.impl.EipPackageImpl#getEndpoint()
		 * @generated
		 */
		EClass ENDPOINT = eINSTANCE.getEndpoint();

	}

} //EipPackage
