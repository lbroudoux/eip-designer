/**
 */
package com.github.lbroudoux.dsl.eip.tests;

import com.github.lbroudoux.dsl.eip.Aggregator;
import com.github.lbroudoux.dsl.eip.EipFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aggregator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregatorTest extends MetadatableTest {

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static void main(String[] args) {
      TestRunner.run(AggregatorTest.class);
   }

	/**
    * Constructs a new Aggregator test case with the given name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public AggregatorTest(String name) {
      super(name);
   }

	/**
    * Returns the fixture for this Aggregator test case.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected Aggregator getFixture() {
      return (Aggregator)fixture;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#setUp()
    * @generated
    */
	@Override
	protected void setUp() throws Exception {
      setFixture(EipFactory.eINSTANCE.createAggregator());
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

} //AggregatorTest
