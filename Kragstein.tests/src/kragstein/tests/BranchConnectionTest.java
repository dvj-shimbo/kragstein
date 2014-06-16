/**
 */
package kragstein.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kragstein.BranchConnection;
import kragstein.KragsteinFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Branch Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BranchConnectionTest extends TestCase {

	/**
	 * The fixture for this Branch Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchConnection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BranchConnectionTest.class);
	}

	/**
	 * Constructs a new Branch Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Branch Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BranchConnection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Branch Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchConnection getFixture() {
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
		setFixture(KragsteinFactory.eINSTANCE.createBranchConnection());
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

} //BranchConnectionTest
