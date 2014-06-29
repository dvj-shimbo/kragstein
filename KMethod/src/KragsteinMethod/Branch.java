/**
 */
package KragsteinMethod;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Branch#getSourceBranchConnection <em>Source Branch Connection</em>}</li>
 *   <li>{@link KragsteinMethod.Branch#getTargetBranchConnection <em>Target Branch Connection</em>}</li>
 *   <li>{@link KragsteinMethod.Branch#getRoute <em>Route</em>}</li>
 *   <li>{@link KragsteinMethod.Branch#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getBranch()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Branch Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Branch Connection</em>' containment reference.
	 * @see #setSourceBranchConnection(BranchConnection)
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_SourceBranchConnection()
	 * @model containment="true"
	 * @generated
	 */
	BranchConnection getSourceBranchConnection();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getSourceBranchConnection <em>Source Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Branch Connection</em>' containment reference.
	 * @see #getSourceBranchConnection()
	 * @generated
	 */
	void setSourceBranchConnection(BranchConnection value);

	/**
	 * Returns the value of the '<em><b>Target Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Branch Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Branch Connection</em>' containment reference.
	 * @see #setTargetBranchConnection(BranchConnection)
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_TargetBranchConnection()
	 * @model containment="true"
	 * @generated
	 */
	BranchConnection getTargetBranchConnection();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getTargetBranchConnection <em>Target Branch Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Branch Connection</em>' containment reference.
	 * @see #getTargetBranchConnection()
	 * @generated
	 */
	void setTargetBranchConnection(BranchConnection value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' containment reference list.
	 * The list contents are of type {@link KragsteinMethod.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' containment reference list.
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_Route()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Route> getRoute();

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
	 * @see KragsteinMethod.KragsteinMethodPackage#getBranch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Branch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Branch
