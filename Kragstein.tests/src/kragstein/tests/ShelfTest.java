/**
 */
package kragstein.tests;

import junit.textui.TestRunner;

import kragstein.KragsteinFactory;
import kragstein.Shelf;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shelf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShelfTest extends IconTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShelfTest.class);
	}

	/**
	 * Constructs a new Shelf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShelfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shelf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Shelf getFixture() {
		return (Shelf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KragsteinFactory.eINSTANCE.createShelf());
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

} //ShelfTest
