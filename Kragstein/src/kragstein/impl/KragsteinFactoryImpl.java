/**
 */
package kragstein.impl;

import kragstein.Action;
import kragstein.Adress;
import kragstein.Aggregation;
import kragstein.Association;
import kragstein.Attribute;
import kragstein.BeginLoop;
import kragstein.Branch;
import kragstein.BranchConnection;
import kragstein.Case;
import kragstein.Choice;
import kragstein.Comment;
import kragstein.Composition;
import kragstein.Connection;
import kragstein.Dependency;
import kragstein.DrakonDiagramm;
import kragstein.EmptyConnector;
import kragstein.End;
import kragstein.EndLoop;
import kragstein.FormalParameters;
import kragstein.Generalization;
import kragstein.Header;
import kragstein.Headline;
import kragstein.Input;
import kragstein.Insertion;
import kragstein.Interface;
import kragstein.InterfaceMethod;
import kragstein.InterfaceParameter;
import kragstein.KragsteinFactory;
import kragstein.KragsteinPackage;
import kragstein.LeftComment;
import kragstein.LoopArrow;
import kragstein.Method;
import kragstein.Output;
import kragstein.Parameter;
import kragstein.Question;
import kragstein.Realization;
import kragstein.RightComment;
import kragstein.Route;
import kragstein.Shelf;
import kragstein.UMLDiagramm;
import kragstein.ValencePoint;

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
public class KragsteinFactoryImpl extends EFactoryImpl implements KragsteinFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KragsteinFactory init() {
		try {
			KragsteinFactory theKragsteinFactory = (KragsteinFactory)EPackage.Registry.INSTANCE.getEFactory(KragsteinPackage.eNS_URI);
			if (theKragsteinFactory != null) {
				return theKragsteinFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KragsteinFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinFactoryImpl() {
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
			case KragsteinPackage.UML_DIAGRAMM: return createUMLDiagramm();
			case KragsteinPackage.GENERALIZATION: return createGeneralization();
			case KragsteinPackage.REALIZATION: return createRealization();
			case KragsteinPackage.ASSOCIATION: return createAssociation();
			case KragsteinPackage.AGGREGATION: return createAggregation();
			case KragsteinPackage.COMPOSITION: return createComposition();
			case KragsteinPackage.DEPENDENCY: return createDependency();
			case KragsteinPackage.INTERFACE: return createInterface();
			case KragsteinPackage.CLASS: return createClass();
			case KragsteinPackage.ATTRIBUTE: return createAttribute();
			case KragsteinPackage.METHOD: return createMethod();
			case KragsteinPackage.PARAMETER: return createParameter();
			case KragsteinPackage.DRAKON_DIAGRAMM: return createDrakonDiagramm();
			case KragsteinPackage.HEADER: return createHeader();
			case KragsteinPackage.FORMAL_PARAMETERS: return createFormalParameters();
			case KragsteinPackage.BRANCH: return createBranch();
			case KragsteinPackage.BRANCH_CONNECTION: return createBranchConnection();
			case KragsteinPackage.ROUTE: return createRoute();
			case KragsteinPackage.RIGHT_COMMENT: return createRightComment();
			case KragsteinPackage.LEFT_COMMENT: return createLeftComment();
			case KragsteinPackage.VALENCE_POINT: return createValencePoint();
			case KragsteinPackage.CONNECTION: return createConnection();
			case KragsteinPackage.ACTION: return createAction();
			case KragsteinPackage.QUESTION: return createQuestion();
			case KragsteinPackage.CHOICE: return createChoice();
			case KragsteinPackage.CASE: return createCase();
			case KragsteinPackage.HEADLINE: return createHeadline();
			case KragsteinPackage.ADRESS: return createAdress();
			case KragsteinPackage.INSERTION: return createInsertion();
			case KragsteinPackage.SHELF: return createShelf();
			case KragsteinPackage.BEGIN_LOOP: return createBeginLoop();
			case KragsteinPackage.END_LOOP: return createEndLoop();
			case KragsteinPackage.OUTPUT: return createOutput();
			case KragsteinPackage.INPUT: return createInput();
			case KragsteinPackage.COMMENT: return createComment();
			case KragsteinPackage.LOOP_ARROW: return createLoopArrow();
			case KragsteinPackage.EMPTY_CONNECTOR: return createEmptyConnector();
			case KragsteinPackage.END: return createEnd();
			case KragsteinPackage.INTERFACE_METHOD: return createInterfaceMethod();
			case KragsteinPackage.INTERFACE_PARAMETER: return createInterfaceParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDiagramm createUMLDiagramm() {
		UMLDiagrammImpl umlDiagramm = new UMLDiagrammImpl();
		return umlDiagramm;
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
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public kragstein.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
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
	public DrakonDiagramm createDrakonDiagramm() {
		DrakonDiagrammImpl drakonDiagramm = new DrakonDiagrammImpl();
		return drakonDiagramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameters createFormalParameters() {
		FormalParametersImpl formalParameters = new FormalParametersImpl();
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchConnection createBranchConnection() {
		BranchConnectionImpl branchConnection = new BranchConnectionImpl();
		return branchConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightComment createRightComment() {
		RightCommentImpl rightComment = new RightCommentImpl();
		return rightComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftComment createLeftComment() {
		LeftCommentImpl leftComment = new LeftCommentImpl();
		return leftComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValencePoint createValencePoint() {
		ValencePointImpl valencePoint = new ValencePointImpl();
		return valencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Headline createHeadline() {
		HeadlineImpl headline = new HeadlineImpl();
		return headline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adress createAdress() {
		AdressImpl adress = new AdressImpl();
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insertion createInsertion() {
		InsertionImpl insertion = new InsertionImpl();
		return insertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shelf createShelf() {
		ShelfImpl shelf = new ShelfImpl();
		return shelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginLoop createBeginLoop() {
		BeginLoopImpl beginLoop = new BeginLoopImpl();
		return beginLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndLoop createEndLoop() {
		EndLoopImpl endLoop = new EndLoopImpl();
		return endLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
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
	public LoopArrow createLoopArrow() {
		LoopArrowImpl loopArrow = new LoopArrowImpl();
		return loopArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyConnector createEmptyConnector() {
		EmptyConnectorImpl emptyConnector = new EmptyConnectorImpl();
		return emptyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceMethod createInterfaceMethod() {
		InterfaceMethodImpl interfaceMethod = new InterfaceMethodImpl();
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceParameter createInterfaceParameter() {
		InterfaceParameterImpl interfaceParameter = new InterfaceParameterImpl();
		return interfaceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinPackage getKragsteinPackage() {
		return (KragsteinPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KragsteinPackage getPackage() {
		return KragsteinPackage.eINSTANCE;
	}

} //KragsteinFactoryImpl
