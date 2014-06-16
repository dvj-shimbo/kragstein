/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Unit#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.Unit#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link kragstein.Unit#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link kragstein.Unit#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends EObject {
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
	 * @see kragstein.KragsteinPackage#getUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kragstein.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connection</em>' containment reference.
	 * @see #setSourceConnection(Generalization)
	 * @see kragstein.KragsteinPackage#getUnit_SourceConnection()
	 * @model containment="true"
	 * @generated
	 */
	Generalization getSourceConnection();

	/**
	 * Sets the value of the '{@link kragstein.Unit#getSourceConnection <em>Source Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Connection</em>' containment reference.
	 * @see #getSourceConnection()
	 * @generated
	 */
	void setSourceConnection(Generalization value);

	/**
	 * Returns the value of the '<em><b>Target Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connection</em>' containment reference.
	 * @see #setTargetConnection(Generalization)
	 * @see kragstein.KragsteinPackage#getUnit_TargetConnection()
	 * @model containment="true"
	 * @generated
	 */
	Generalization getTargetConnection();

	/**
	 * Sets the value of the '{@link kragstein.Unit#getTargetConnection <em>Target Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Connection</em>' containment reference.
	 * @see #getTargetConnection()
	 * @generated
	 */
	void setTargetConnection(Generalization value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see kragstein.KragsteinPackage#getUnit_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link kragstein.Unit#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

} // Unit
