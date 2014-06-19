/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.BranchConnection#getSource <em>Source</em>}</li>
 *   <li>{@link kragstein.BranchConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link kragstein.BranchConnection#getTargetBranch <em>Target Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getBranchConnection()
 * @model
 * @generated
 */
public interface BranchConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Branch)
	 * @see kragstein.KragsteinPackage#getBranchConnection_Source()
	 * @model
	 * @generated
	 */
	Branch getSource();

	/**
	 * Sets the value of the '{@link kragstein.BranchConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Branch value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Branch)
	 * @see kragstein.KragsteinPackage#getBranchConnection_Target()
	 * @model
	 * @generated
	 */
	Branch getTarget();

	/**
	 * Sets the value of the '{@link kragstein.BranchConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Branch value);

	/**
	 * Returns the value of the '<em><b>Target Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Branch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Branch</em>' attribute.
	 * @see #setTargetBranch(String)
	 * @see kragstein.KragsteinPackage#getBranchConnection_TargetBranch()
	 * @model
	 * @generated
	 */
	String getTargetBranch();

	/**
	 * Sets the value of the '{@link kragstein.BranchConnection#getTargetBranch <em>Target Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Branch</em>' attribute.
	 * @see #getTargetBranch()
	 * @generated
	 */
	void setTargetBranch(String value);

} // BranchConnection
