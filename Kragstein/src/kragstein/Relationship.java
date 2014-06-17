/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link kragstein.Relationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getRelationship()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Unit)
	 * @see kragstein.KragsteinPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Unit getTarget();

	/**
	 * Sets the value of the '{@link kragstein.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Unit value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Unit)
	 * @see kragstein.KragsteinPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	Unit getSource();

	/**
	 * Sets the value of the '{@link kragstein.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Unit value);

} // Relationship
