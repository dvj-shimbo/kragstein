/**
 */
package KragsteinMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Choice#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.Choice#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.Choice#getCase <em>Case</em>}</li>
 *   <li>{@link KragsteinMethod.Choice#getFirstCaseName <em>First Case Name</em>}</li>
 *   <li>{@link KragsteinMethod.Choice#getFirstCaseValue <em>First Case Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getChoice()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Choice extends Icon {
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getChoice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Choice#getName <em>Name</em>}' attribute.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getChoice_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Choice#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference list.
	 * The list contents are of type {@link KragsteinMethod.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference list.
	 * @see KragsteinMethod.KragsteinMethodPackage#getChoice_Case()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Case> getCase();

	/**
	 * Returns the value of the '<em><b>First Case Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Case Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Case Name</em>' attribute.
	 * @see #setFirstCaseName(String)
	 * @see KragsteinMethod.KragsteinMethodPackage#getChoice_FirstCaseName()
	 * @model
	 * @generated
	 */
	String getFirstCaseName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Choice#getFirstCaseName <em>First Case Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Case Name</em>' attribute.
	 * @see #getFirstCaseName()
	 * @generated
	 */
	void setFirstCaseName(String value);

	/**
	 * Returns the value of the '<em><b>First Case Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Case Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Case Value</em>' attribute.
	 * @see #setFirstCaseValue(String)
	 * @see KragsteinMethod.KragsteinMethodPackage#getChoice_FirstCaseValue()
	 * @model
	 * @generated
	 */
	String getFirstCaseValue();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Choice#getFirstCaseValue <em>First Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Case Value</em>' attribute.
	 * @see #getFirstCaseValue()
	 * @generated
	 */
	void setFirstCaseValue(String value);

} // Choice
