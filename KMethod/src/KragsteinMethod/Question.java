/**
 */
package KragsteinMethod;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Question#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.Question#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.Question#isYesBelow <em>Yes Below</em>}</li>
 *   <li>{@link KragsteinMethod.Question#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getQuestion()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Question extends Icon {
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getQuestion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Question#getName <em>Name</em>}' attribute.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getQuestion_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Question#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Yes Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes Below</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes Below</em>' attribute.
	 * @see #setYesBelow(boolean)
	 * @see KragsteinMethod.KragsteinMethodPackage#getQuestion_YesBelow()
	 * @model
	 * @generated
	 */
	boolean isYesBelow();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Question#isYesBelow <em>Yes Below</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes Below</em>' attribute.
	 * @see #isYesBelow()
	 * @generated
	 */
	void setYesBelow(boolean value);

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
	 * @see KragsteinMethod.KragsteinMethodPackage#getQuestion_Route()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Question#getRoute <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' containment reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

} // Question
