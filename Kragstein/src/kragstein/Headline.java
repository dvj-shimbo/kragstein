/**
 */
package kragstein;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Headline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Headline#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.Headline#isIsLoop <em>Is Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getHeadline()
 * @model
 * @generated
 */
public interface Headline extends Icon {
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
	 * @see kragstein.KragsteinPackage#getHeadline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kragstein.Headline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Loop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Loop</em>' attribute.
	 * @see #setIsLoop(boolean)
	 * @see kragstein.KragsteinPackage#getHeadline_IsLoop()
	 * @model
	 * @generated
	 */
	boolean isIsLoop();

	/**
	 * Sets the value of the '{@link kragstein.Headline#isIsLoop <em>Is Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Loop</em>' attribute.
	 * @see #isIsLoop()
	 * @generated
	 */
	void setIsLoop(boolean value);

} // Headline
