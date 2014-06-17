/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.CaseConnection#getSource <em>Source</em>}</li>
 *   <li>{@link kragstein.CaseConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getCaseConnection()
 * @model
 * @generated
 */
public interface CaseConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Case)
	 * @see kragstein.KragsteinPackage#getCaseConnection_Source()
	 * @model
	 * @generated
	 */
	Case getSource();

	/**
	 * Sets the value of the '{@link kragstein.CaseConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Case value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Case)
	 * @see kragstein.KragsteinPackage#getCaseConnection_Target()
	 * @model
	 * @generated
	 */
	Case getTarget();

	/**
	 * Sets the value of the '{@link kragstein.CaseConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Case value);

} // CaseConnection
