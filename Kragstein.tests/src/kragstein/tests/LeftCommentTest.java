/**
 */
package kragstein.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import kragstein.KragsteinFactory;
import kragstein.LeftComment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Left Comment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeftCommentTest extends TestCase {

	/**
	 * The fixture for this Left Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftComment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeftCommentTest.class);
	}

	/**
	 * Constructs a new Left Comment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftCommentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Left Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LeftComment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Left Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftComment getFixture() {
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
		setFixture(KragsteinFactory.eINSTANCE.createLeftComment());
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

} //LeftCommentTest
