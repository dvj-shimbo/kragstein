/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.*;

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
public class KragsteinMethodFactoryImpl extends EFactoryImpl implements KragsteinMethodFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KragsteinMethodFactory init() {
		try {
			KragsteinMethodFactory theKragsteinMethodFactory = (KragsteinMethodFactory)EPackage.Registry.INSTANCE.getEFactory(KragsteinMethodPackage.eNS_URI);
			if (theKragsteinMethodFactory != null) {
				return theKragsteinMethodFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KragsteinMethodFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KragsteinMethodFactoryImpl() {
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
			case KragsteinMethodPackage.METHOD: return createMethod();
			case KragsteinMethodPackage.HEADER: return createHeader();
			case KragsteinMethodPackage.PARAMETER: return createParameter();
			case KragsteinMethodPackage.BRANCH: return createBranch();
			case KragsteinMethodPackage.ROUTE: return createRoute();
			case KragsteinMethodPackage.VALENCE_POINT: return createValencePoint();
			case KragsteinMethodPackage.SYNCHRONIZER: return createSynchronizer();
			case KragsteinMethodPackage.RIGHT_COMMENT: return createRightComment();
			case KragsteinMethodPackage.LEFT_COMMENT: return createLeftComment();
			case KragsteinMethodPackage.ACTION: return createAction();
			case KragsteinMethodPackage.QUESTION: return createQuestion();
			case KragsteinMethodPackage.CHOICE: return createChoice();
			case KragsteinMethodPackage.CASE: return createCase();
			case KragsteinMethodPackage.HEADLINE: return createHeadline();
			case KragsteinMethodPackage.ADRESS: return createAdress();
			case KragsteinMethodPackage.INSERTION: return createInsertion();
			case KragsteinMethodPackage.SHELF: return createShelf();
			case KragsteinMethodPackage.BEGIN_LOOP: return createBeginLoop();
			case KragsteinMethodPackage.END_LOOP: return createEndLoop();
			case KragsteinMethodPackage.OUTPUT: return createOutput();
			case KragsteinMethodPackage.PAUSE: return createPause();
			case KragsteinMethodPackage.START_TIMER: return createStartTimer();
			case KragsteinMethodPackage.INPUT: return createInput();
			case KragsteinMethodPackage.END: return createEnd();
			case KragsteinMethodPackage.LOOP_ARROW: return createLoopArrow();
			case KragsteinMethodPackage.PERIOD: return createPeriod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
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
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronizer createSynchronizer() {
		SynchronizerImpl synchronizer = new SynchronizerImpl();
		return synchronizer;
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
	public Pause createPause() {
		PauseImpl pause = new PauseImpl();
		return pause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimer createStartTimer() {
		StartTimerImpl startTimer = new StartTimerImpl();
		return startTimer;
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
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
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
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
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
	public KragsteinMethodPackage getKragsteinMethodPackage() {
		return (KragsteinMethodPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KragsteinMethodPackage getPackage() {
		return KragsteinMethodPackage.eINSTANCE;
	}

} //KragsteinMethodFactoryImpl
