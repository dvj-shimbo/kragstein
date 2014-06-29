/**
 */
package KragsteinPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinPackage.ImportedPackage#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinPackage.ImportedPackage#isIsInternal <em>Is Internal</em>}</li>
 *   <li>{@link KragsteinPackage.ImportedPackage#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinPackage.KragsteinPackagePackage#getImportedPackage()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ImportedPackage extends EObject {
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
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Internal</em>' attribute.
	 * @see #setIsInternal(boolean)
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedPackage_IsInternal()
	 * @model
	 * @generated
	 */
	boolean isIsInternal();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedPackage#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Internal</em>' attribute.
	 * @see #isIsInternal()
	 * @generated
	 */
	void setIsInternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedPackage_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedPackage#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ImportedPackage
