/**
 */
package kragstein.tests;

import junit.textui.TestRunner;

import kragstein.Headline;
import kragstein.KragsteinFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Headline</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HeadlineTest extends IconTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HeadlineTest.class);
	}

	/**
	 * Constructs a new Headline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadlineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Headline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Headline getFixture() {
		return (Headline)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KragsteinFactory.eINSTANCE.createHeadline());
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

} //HeadlineTest
