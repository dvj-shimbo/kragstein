/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Branch#getSourceBranchConnection <em>Source Branch Connection</em>}</li>
 *   <li>{@link kragstein.Branch#getTargetBranchConnection <em>Target Branch Connection</em>}</li>
 *   <li>{@link kragstein.Branch#getRoute <em>Route</em>}</li>
 *   <li>{@link kragstein.Branch#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Branch Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Branch Connection</em>' containment reference.
	 * @see #setSourceBranchConnection(BranchConnection)
	 * @see kragstein.KragsteinPackage#getBranch_SourceBranchConnection()
	 * @model containment="true"
	 * @generated
	 */
	BranchConnection getSourceBranchConnection();

	/**
	 * Sets the value of the '{@link kragstein.Branch#getSourceBranchConnection <em>Source Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Branch Connection</em>' containment reference.
	 * @see #getSourceBranchConnection()
	 * @generated
	 */
	void setSourceBranchConnection(BranchConnection value);

	/**
	 * Returns the value of the '<em><b>Target Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Branch Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Branch Connection</em>' containment reference.
	 * @see #setTargetBranchConnection(BranchConnection)
	 * @see kragstein.KragsteinPackage#getBranch_TargetBranchConnection()
	 * @model containment="true"
	 * @generated
	 */
	BranchConnection getTargetBranchConnection();

	/**
	 * Sets the value of the '{@link kragstein.Branch#getTargetBranchConnection <em>Target Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Branch Connection</em>' containment reference.
	 * @see #getTargetBranchConnection()
	 * @generated
	 */
	void setTargetBranchConnection(BranchConnection value);

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
	 * @see kragstein.KragsteinPackage#getBranch_Route()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link kragstein.Branch#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

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
	 * @see kragstein.KragsteinPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kragstein.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Branch
