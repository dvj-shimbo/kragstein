/**
 */
package KragsteinMethod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Route#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getRoute()
 * @model annotation="gmf.node label.placement='none'"
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link KragsteinMethod.Icon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see KragsteinMethod.KragsteinMethodPackage#getRoute_Icon()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Icon> getIcon();

} // Route
