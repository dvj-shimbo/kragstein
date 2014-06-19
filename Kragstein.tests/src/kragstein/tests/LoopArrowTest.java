/**
 */
package kragstein.tests;

import junit.textui.TestRunner;

import kragstein.KragsteinFactory;
import kragstein.LoopArrow;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Arrow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopArrowTest extends IconTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopArrowTest.class);
	}

	/**
	 * Constructs a new Loop Arrow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopArrowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Arrow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoopArrow getFixture() {
		return (LoopArrow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KragsteinFactory.eINSTANCE.createLoopArrow());
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

} //LoopArrowTest
