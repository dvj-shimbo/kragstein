/**
 */
package kragstein.tests;

import junit.textui.TestRunner;

import kragstein.BeginLoop;
import kragstein.KragsteinFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Begin Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeginLoopTest extends IconTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BeginLoopTest.class);
	}

	/**
	 * Constructs a new Begin Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginLoopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Begin Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BeginLoop getFixture() {
		return (BeginLoop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KragsteinFactory.eINSTANCE.createBeginLoop());
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

} //BeginLoopTest
