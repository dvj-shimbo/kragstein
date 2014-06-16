/**
 */
package kragstein.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kragstein.Generalization;
import kragstein.KragsteinFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizationTest extends TestCase {

	/**
	 * The fixture for this Generalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Generalization fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneralizationTest.class);
	}

	/**
	 * Constructs a new Generalization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Generalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Generalization fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Generalization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Generalization getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KragsteinFactory.eINSTANCE.createGeneralization());
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

} //GeneralizationTest
