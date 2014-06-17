/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Class#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link kragstein.Class#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link kragstein.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kragstein.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link kragstein.Class#isIsSingletone <em>Is Singletone</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Unit {
	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.ClassMultipleRelationships}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_TargetConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMultipleRelationships> getTargetConnections();

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.ClassMultipleRelationships}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_SourceConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMultipleRelationships> getSourceConnections();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Is Singletone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Singletone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Singletone</em>' attribute.
	 * @see #setIsSingletone(boolean)
	 * @see kragstein.KragsteinPackage#getClass_IsSingletone()
	 * @model
	 * @generated
	 */
	boolean isIsSingletone();

	/**
	 * Sets the value of the '{@link kragstein.Class#isIsSingletone <em>Is Singletone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Singletone</em>' attribute.
	 * @see #isIsSingletone()
	 * @generated
	 */
	void setIsSingletone(boolean value);

} // Class
