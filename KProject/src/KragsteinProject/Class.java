/**
 */
package KragsteinProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinProject.Class#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinProject.Class#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link KragsteinProject.Class#isIsSingletone <em>Is Singletone</em>}</li>
 *   <li>{@link KragsteinProject.Class#isIsInterface <em>Is Interface</em>}</li>
 *   <li>{@link KragsteinProject.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link KragsteinProject.Class#getSupplierElement <em>Supplier Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinProject.KragsteinProjectPackage#getClass_()
 * @model annotation="gmf.node label='name' label.icon='true'"
 * @generated
 */
public interface Class extends EObject {
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
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#getName <em>Name</em>}' attribute.
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
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#getVisibility <em>Visibility</em>}' attribute.
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
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_IsSingletone()
	 * @model
	 * @generated
	 */
	boolean isIsSingletone();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#isIsSingletone <em>Is Singletone</em>}' attribute.
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
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_IsInterface()
	 * @model
	 * @generated
	 */
	boolean isIsInterface();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#isIsInterface <em>Is Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Interface</em>' attribute.
	 * @see #isIsInterface()
	 * @generated
	 */
	void setIsInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' attribute.
	 * @see #setSuperClass(String)
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_SuperClass()
	 * @model
	 * @generated
	 */
	String getSuperClass();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#getSuperClass <em>Super Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' attribute.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Element</em>' attribute.
	 * @see #setSupplierElement(String)
	 * @see KragsteinProject.KragsteinProjectPackage#getClass_SupplierElement()
	 * @model
	 * @generated
	 */
	String getSupplierElement();

	/**
	 * Sets the value of the '{@link KragsteinProject.Class#getSupplierElement <em>Supplier Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Element</em>' attribute.
	 * @see #getSupplierElement()
	 * @generated
	 */
	void setSupplierElement(String value);

} // Class
