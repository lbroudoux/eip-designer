/**
 */
package com.github.lbroudoux.dsl.eip.tests;

import com.github.lbroudoux.dsl.eip.EipFactory;
import com.github.lbroudoux.dsl.eip.Filter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterTest extends MetadatableTest {

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static void main(String[] args) {
      TestRunner.run(FilterTest.class);
   }

	/**
    * Constructs a new Filter test case with the given name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public FilterTest(String name) {
      super(name);
   }

	/**
    * Returns the fixture for this Filter test case.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected Filter getFixture() {
      return (Filter)fixture;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#setUp()
    * @generated
    */
	@Override
	protected void setUp() throws Exception {
      setFixture(EipFactory.eINSTANCE.createFilter());
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

} //FilterTest
