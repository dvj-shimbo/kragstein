/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kragstein.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link kragstein.Class#getComments <em>Comments</em>}</li>
 *   <li>{@link kragstein.Class#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link kragstein.Class#getSourceRelationship <em>Source Relationship</em>}</li>
 *   <li>{@link kragstein.Class#getName <em>Name</em>}</li>
 *   <li>{@link kragstein.Class#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link kragstein.Class#isIsSingletone <em>Is Singletone</em>}</li>
 *   <li>{@link kragstein.Class#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link kragstein.Class#getImportedPackages <em>Imported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(Comment)
	 * @see kragstein.KragsteinPackage#getClass_Comments()
	 * @model containment="true"
	 * @generated
	 */
	Comment getComments();

	/**
	 * Sets the value of the '{@link kragstein.Class#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(Comment value);

	/**
	 * Returns the value of the '<em><b>Target Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relationship</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_TargetRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getTargetRelationship();

	/**
	 * Returns the value of the '<em><b>Source Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Relationship</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_SourceRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getSourceRelationship();

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
	 * @see kragstein.KragsteinPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kragstein.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see kragstein.KragsteinPackage#getClass_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link kragstein.Class#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

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

	/**
	 * Returns the value of the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Interface</em>' attribute.
	 * @see #setIsInterface(boolean)
	 * @see kragstein.KragsteinPackage#getClass_IsInterface()
	 * @model
	 * @generated
	 */
	boolean isIsInterface();

	/**
	 * Sets the value of the '{@link kragstein.Class#isIsInterface <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interface</em>' attribute.
	 * @see #isIsInterface()
	 * @generated
	 */
	void setIsInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.ImportedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getClass_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedPackage> getImportedPackages();

} // Class
