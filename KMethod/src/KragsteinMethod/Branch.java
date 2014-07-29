/**
 */
package KragsteinMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Branch#getRoute <em>Route</em>}</li>
 *   <li>{@link KragsteinMethod.Branch#getNextBranch <em>Next Branch</em>}</li>
 *   <li>{@link KragsteinMethod.Branch#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getBranch()
 * @model annotation="gmf.node label.placement='none'"
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference.
	 * @see #setRoute(Route)
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_Route()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Next Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Branch</em>' reference.
	 * @see #setNextBranch(Branch)
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_NextBranch()
	 * @model
	 * @generated
	 */
	Branch getNextBranch();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getNextBranch <em>Next Branch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Branch</em>' reference.
	 * @see #getNextBranch()
	 * @generated
	 */
	void setNextBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Branch
