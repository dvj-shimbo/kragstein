/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.IconConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link kragstein.IconConnection#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getIconConnection()
 * @model
 * @generated
 */
public interface IconConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Icon)
	 * @see kragstein.KragsteinPackage#getIconConnection_Target()
	 * @model
	 * @generated
	 */
	Icon getTarget();

	/**
	 * Sets the value of the '{@link kragstein.IconConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Icon value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Icon)
	 * @see kragstein.KragsteinPackage#getIconConnection_Source()
	 * @model
	 * @generated
	 */
	Icon getSource();

	/**
	 * Sets the value of the '{@link kragstein.IconConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Icon value);

} // IconConnection
