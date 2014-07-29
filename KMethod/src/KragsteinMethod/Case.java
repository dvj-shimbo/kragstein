/**
 */
package KragsteinMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Case#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getRoute <em>Route</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getNextCase <em>Next Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getCase()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Case extends EObject {
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_Route()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Next Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Case</em>' reference.
	 * @see #setNextCase(Case)
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_NextCase()
	 * @model
	 * @generated
	 */
	Case getNextCase();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getNextCase <em>Next Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Case</em>' reference.
	 * @see #getNextCase()
	 * @generated
	 */
	void setNextCase(Case value);

} // Case
