/**
 */
package com.github.lbroudoux.dsl.eip.tests;

import com.github.lbroudoux.dsl.eip.Channel;
import com.github.lbroudoux.dsl.eip.EipFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChannelTest extends MetadatableTest {

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public static void main(String[] args) {
      TestRunner.run(ChannelTest.class);
   }

	/**
    * Constructs a new Channel test case with the given name.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	public ChannelTest(String name) {
      super(name);
   }

	/**
    * Returns the fixture for this Channel test case.
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @generated
    */
	@Override
   protected Channel getFixture() {
      return (Channel)fixture;
   }

	/**
    * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
    * @see junit.framework.TestCase#setUp()
    * @generated
    */
	@Override
	protected void setUp() throws Exception {
      setFixture(EipFactory.eINSTANCE.createChannel());
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

} //ChannelTest
