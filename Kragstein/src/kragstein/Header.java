/**
 */
package kragstein;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Header#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link kragstein.Header#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference.
	 * @see #setFormalParameters(FormalParameters)
	 * @see kragstein.KragsteinPackage#getHeader_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	FormalParameters getFormalParameters();

	/**
	 * Sets the value of the '{@link kragstein.Header#getFormalParameters <em>Formal Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameters</em>' containment reference.
	 * @see #getFormalParameters()
	 * @generated
	 */
	void setFormalParameters(FormalParameters value);

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
	 * @see kragstein.KragsteinPackage#getHeader_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kragstein.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Header
