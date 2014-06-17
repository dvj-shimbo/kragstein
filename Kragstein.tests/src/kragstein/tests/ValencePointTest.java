/**
 */
package kragstein.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kragstein.KragsteinFactory;
import kragstein.ValencePoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valence Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValencePointTest extends TestCase {

	/**
	 * The fixture for this Valence Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValencePoint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValencePointTest.class);
	}

	/**
	 * Constructs a new Valence Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValencePointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Valence Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ValencePoint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Valence Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValencePoint getFixture() {
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
		setFixture(KragsteinFactory.eINSTANCE.createValencePoint());
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

} //ValencePointTest
