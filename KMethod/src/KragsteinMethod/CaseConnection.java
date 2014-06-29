/**
 */
package KragsteinMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.CaseConnection#getSource <em>Source</em>}</li>
 *   <li>{@link KragsteinMethod.CaseConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link KragsteinMethod.CaseConnection#getTargetCase <em>Target Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getCaseConnection()
 * @model annotation="gmf.link label.placement='none' source='source' target='target'"
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCaseConnection_Source()
	 * @model
	 * @generated
	 */
	Case getSource();

	/**
	 * Sets the value of the '{@link KragsteinMethod.CaseConnection#getSource <em>Source</em>}' reference.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCaseConnection_Target()
	 * @model
	 * @generated
	 */
	Case getTarget();

	/**
	 * Sets the value of the '{@link KragsteinMethod.CaseConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Case value);

	/**
	 * Returns the value of the '<em><b>Target Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Case</em>' attribute.
	 * @see #setTargetCase(String)
	 * @see KragsteinMethod.KragsteinMethodPackage#getCaseConnection_TargetCase()
	 * @model
	 * @generated
	 */
	String getTargetCase();

	/**
	 * Sets the value of the '{@link KragsteinMethod.CaseConnection#getTargetCase <em>Target Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Case</em>' attribute.
	 * @see #getTargetCase()
	 * @generated
	 */
	void setTargetCase(String value);

} // CaseConnection
