/**
 */
package com.github.lbroudoux.dsl.eip.tests;

import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.InvocableEndpoint;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Invocable Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvocableEndpointTest extends MetadatableTest {

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static void main(String[] args) {
      TestRunner.run(InvocableEndpointTest.class);
   }

	/**
    * Constructs a new Invocable Endpoint test case with the given name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public InvocableEndpointTest(String name) {
      super(name);
   }

	/**
    * Returns the fixture for this Invocable Endpoint test case.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected InvocableEndpoint getFixture() {
      return (InvocableEndpoint)fixture;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#setUp()
    * @generated
    */
	@Override
	protected void setUp() throws Exception {
      setFixture(EipFactory.eINSTANCE.createInvocableEndpoint());
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#tearDown()
    * @generated
    */
	@Override
	protected void tearDown() throws Exception {
      setFixture(null);
   }

} //InvocableEndpointTest
