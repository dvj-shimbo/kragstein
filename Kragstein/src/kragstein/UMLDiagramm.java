/**
 */
package kragstein;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Diagramm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kragstein.UMLDiagramm#getLang <em>Lang</em>}</li>
 *   <li>{@link kragstein.UMLDiagramm#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link kragstein.UMLDiagramm#getClasses <em>Classes</em>}</li>
 *   <li>{@link kragstein.UMLDiagramm#getImportedPackages <em>Imported Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see kragstein.KragsteinPackage#getUMLDiagramm()
 * @model
 * @generated
 */
public interface UMLDiagramm extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see kragstein.KragsteinPackage#getUMLDiagramm_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link kragstein.UMLDiagramm#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see kragstein.KragsteinPackage#getUMLDiagramm_PackageName()
	 * @model
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link kragstein.UMLDiagramm#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getUMLDiagramm_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<kragstein.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link kragstein.importedPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see kragstein.KragsteinPackage#getUMLDiagramm_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<importedPackage> getImportedPackages();

} // UMLDiagramm
