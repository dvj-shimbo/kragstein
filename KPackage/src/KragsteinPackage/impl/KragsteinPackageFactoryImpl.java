/**
 */
package KragsteinPackage.impl;

import KragsteinPackage.Aggregation;
import KragsteinPackage.Association;
import KragsteinPackage.Attribute;
import KragsteinPackage.Comment;
import KragsteinPackage.Composition;
import KragsteinPackage.Dependency;
import KragsteinPackage.Generalization;
import KragsteinPackage.ImportedPackage;
import KragsteinPackage.KragsteinPackageFactory;
import KragsteinPackage.KragsteinPackagePackage;
import KragsteinPackage.Link;
import KragsteinPackage.Method;
import KragsteinPackage.Parameter;
import KragsteinPackage.Realization;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KragsteinPackageFactoryImpl extends EFactoryImpl implements KragsteinPackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KragsteinPackageFactory init() {
		try {
			KragsteinPackageFactory theKragsteinPackageFactory = (KragsteinPackageFactory)EPackage.Registry.INSTANCE.getEFactory(KragsteinPackagePackage.eNS_URI);
			if (theKragsteinPackageFactory != null) {
				return theKragsteinPackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KragsteinPackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinPackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KragsteinPackagePackage.PACKAGE: return createPackage();
			case KragsteinPackagePackage.GENERALIZATION: return createGeneralization();
			case KragsteinPackagePackage.REALIZATION: return createRealization();
			case KragsteinPackagePackage.ASSOCIATION: return createAssociation();
			case KragsteinPackagePackage.AGGREGATION: return createAggregation();
			case KragsteinPackagePackage.COMPOSITION: return createComposition();
			case KragsteinPackagePackage.DEPENDENCY: return createDependency();
			case KragsteinPackagePackage.COMMENT: return createComment();
			case KragsteinPackagePackage.CLASS: return createClass();
			case KragsteinPackagePackage.IMPORTED_PACKAGE: return createImportedPackage();
			case KragsteinPackagePackage.ATTRIBUTE: return createAttribute();
			case KragsteinPackagePackage.METHOD: return createMethod();
			case KragsteinPackagePackage.PARAMETER: return createParameter();
			case KragsteinPackagePackage.LINK: return createLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinPackage.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realization createRealization() {
		RealizationImpl realization = new RealizationImpl();
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinPackage.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedPackage createImportedPackage() {
		ImportedPackageImpl importedPackage = new ImportedPackageImpl();
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinPackagePackage getKragsteinPackagePackage() {
		return (KragsteinPackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KragsteinPackagePackage getPackage() {
		return KragsteinPackagePackage.eINSTANCE;
	}

} //KragsteinPackageFactoryImpl
