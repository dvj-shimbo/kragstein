/**
 */
package KragsteinMethod;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinMethod.Case#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getSourceCaseConnection <em>Source Case Connection</em>}</li>
 *   <li>{@link KragsteinMethod.Case#getTargetCaseConnection <em>Target Case Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinMethod.KragsteinMethodPackage#getCase()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Case extends Icon {
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getName <em>Name</em>}' attribute.
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
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Source Case Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Case Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Case Connection</em>' containment reference.
	 * @see #setSourceCaseConnection(CaseConnection)
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_SourceCaseConnection()
	 * @model containment="true"
	 * @generated
	 */
	CaseConnection getSourceCaseConnection();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getSourceCaseConnection <em>Source Case Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Case Connection</em>' containment reference.
	 * @see #getSourceCaseConnection()
	 * @generated
	 */
	void setSourceCaseConnection(CaseConnection value);

	/**
	 * Returns the value of the '<em><b>Target Case Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Case Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Case Connection</em>' containment reference.
	 * @see #setTargetCaseConnection(CaseConnection)
	 * @see KragsteinMethod.KragsteinMethodPackage#getCase_TargetCaseConnection()
	 * @model containment="true"
	 * @generated
	 */
	CaseConnection getTargetCaseConnection();

	/**
	 * Sets the value of the '{@link KragsteinMethod.Case#getTargetCaseConnection <em>Target Case Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Case Connection</em>' containment reference.
	 * @see #getTargetCaseConnection()
	 * @generated
	 */
	void setTargetCaseConnection(CaseConnection value);

} // Case
