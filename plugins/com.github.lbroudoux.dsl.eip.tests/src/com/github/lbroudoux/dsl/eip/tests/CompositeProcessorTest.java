/**
 */
package com.github.lbroudoux.dsl.eip.tests;

import com.github.lbroudoux.dsl.eip.CompositeProcessor;
import com.github.lbroudoux.dsl.eip.EipFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Processor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeProcessorTest extends MetadatableTest {

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static void main(String[] args) {
      TestRunner.run(CompositeProcessorTest.class);
   }

	/**
    * Constructs a new Composite Processor test case with the given name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public CompositeProcessorTest(String name) {
      super(name);
   }

	/**
    * Returns the fixture for this Composite Processor test case.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected CompositeProcessor getFixture() {
      return (CompositeProcessor)fixture;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#setUp()
    * @generated
    */
	@Override
	protected void setUp() throws Exception {
      setFixture(EipFactory.eINSTANCE.createCompositeProcessor());
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

} //CompositeProcessorTest
