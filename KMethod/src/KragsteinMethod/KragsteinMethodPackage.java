/**
 */
package KragsteinMethod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see KragsteinMethod.KragsteinMethodFactory
 * @model kind="package"
 * @generated
 */
public interface KragsteinMethodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KragsteinMethod";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "KragsteinMethod.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KragsteinMethod";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KragsteinMethodPackage eINSTANCE = KragsteinMethod.impl.KragsteinMethodPackageImpl.init();

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.MethodImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BRANCH = 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.HeaderImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__IS_CONST = 3;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__IS_VIRTUAL = 4;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__IS_STATIC = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__PARAMETER = 6;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.BranchImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 3;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.RouteImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 4;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.SynchronizerImpl <em>Synchronizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.SynchronizerImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getSynchronizer()
	 * @generated
	 */
	int SYNCHRONIZER = 6;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.RightCommentImpl <em>Right Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.RightCommentImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getRightComment()
	 * @generated
	 */
	int RIGHT_COMMENT = 7;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.LeftCommentImpl <em>Left Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.LeftCommentImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getLeftComment()
	 * @generated
	 */
	int LEFT_COMMENT = 8;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.ValencePointImpl <em>Valence Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.ValencePointImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getValencePoint()
	 * @generated
	 */
	int VALENCE_POINT = 5;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.IconImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 9;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.ActionImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.QuestionImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 11;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.ChoiceImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 12;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.CaseImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 13;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.HeadlineImpl <em>Headline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.HeadlineImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getHeadline()
	 * @generated
	 */
	int HEADLINE = 14;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.AdressImpl <em>Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.AdressImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getAdress()
	 * @generated
	 */
	int ADRESS = 15;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.InsertionImpl <em>Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.InsertionImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getInsertion()
	 * @generated
	 */
	int INSERTION = 16;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.ShelfImpl <em>Shelf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.ShelfImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getShelf()
	 * @generated
	 */
	int SHELF = 17;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.BeginLoopImpl <em>Begin Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.BeginLoopImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getBeginLoop()
	 * @generated
	 */
	int BEGIN_LOOP = 18;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.EndLoopImpl <em>End Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.EndLoopImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getEndLoop()
	 * @generated
	 */
	int END_LOOP = 19;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.OutputImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 20;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.PauseImpl <em>Pause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.PauseImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getPause()
	 * @generated
	 */
	int PAUSE = 21;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.StartTimerImpl <em>Start Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.StartTimerImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getStartTimer()
	 * @generated
	 */
	int START_TIMER = 22;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.InputImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 23;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.EndImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getEnd()
	 * @generated
	 */
	int END = 24;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.LoopArrowImpl <em>Loop Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.LoopArrowImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getLoopArrow()
	 * @generated
	 */
	int LOOP_ARROW = 25;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.PeriodImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 26;

	/**
	 * The meta object id for the '{@link KragsteinMethod.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KragsteinMethod.impl.ParameterImpl
	 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Next Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NEXT_BRANCH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ICON = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Valence Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALENCE_POINT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Synchronizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_COMMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Right Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_COMMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_COMMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Left Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_COMMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VALENCE_POINT = 0;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LEFT_COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__RIGHT_COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__NEXT_ICON = 3;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__SYNCHRONISER = 4;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yes Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__YES_BELOW = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ROUTE = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CASE = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Case Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FIRST_CASE_NAME = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Case Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__FIRST_CASE_VALUE = ICON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = ICON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Next Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NEXT_CASE = 3;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__IS_LOOP = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Headline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__TARGET = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__IS_LOOP = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Begin Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE__VALUE = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAUSE_FEATURE_COUNT = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Next Icon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__NEXT_ICON = ICON__NEXT_ICON;

	/**
	 * The feature id for the '<em><b>Synchroniser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__SYNCHRONISER = ICON__SYNCHRONISER;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__PERIOD = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW_FEATURE_COUNT = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see KragsteinMethod.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Method#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see KragsteinMethod.Method#getHeader()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link KragsteinMethod.Method#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see KragsteinMethod.Method#getBranch()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Branch();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see KragsteinMethod.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see KragsteinMethod.Header#getType()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Type();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see KragsteinMethod.Header#getVisibility()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see KragsteinMethod.Header#isIsConst()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see KragsteinMethod.Header#isIsVirtual()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_IsVirtual();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Header#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see KragsteinMethod.Header#isIsStatic()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_IsStatic();

	/**
	 * Returns the meta object for the containment reference list '{@link KragsteinMethod.Header#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see KragsteinMethod.Header#getParameter()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Parameter();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see KragsteinMethod.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Branch#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see KragsteinMethod.Branch#getRoute()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Route();

	/**
	 * Returns the meta object for the reference '{@link KragsteinMethod.Branch#getNextBranch <em>Next Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Branch</em>'.
	 * @see KragsteinMethod.Branch#getNextBranch()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_NextBranch();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see KragsteinMethod.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link KragsteinMethod.Route#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see KragsteinMethod.Route#getIcon()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Icon();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Synchronizer <em>Synchronizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizer</em>'.
	 * @see KragsteinMethod.Synchronizer
	 * @generated
	 */
	EClass getSynchronizer();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Synchronizer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Synchronizer#getName()
	 * @see #getSynchronizer()
	 * @generated
	 */
	EAttribute getSynchronizer_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Synchronizer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Synchronizer#getValue()
	 * @see #getSynchronizer()
	 * @generated
	 */
	EAttribute getSynchronizer_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.RightComment <em>Right Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Comment</em>'.
	 * @see KragsteinMethod.RightComment
	 * @generated
	 */
	EClass getRightComment();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.RightComment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.RightComment#getValue()
	 * @see #getRightComment()
	 * @generated
	 */
	EAttribute getRightComment_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.LeftComment <em>Left Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Comment</em>'.
	 * @see KragsteinMethod.LeftComment
	 * @generated
	 */
	EClass getLeftComment();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.LeftComment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.LeftComment#getValue()
	 * @see #getLeftComment()
	 * @generated
	 */
	EAttribute getLeftComment_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.ValencePoint <em>Valence Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valence Point</em>'.
	 * @see KragsteinMethod.ValencePoint
	 * @generated
	 */
	EClass getValencePoint();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see KragsteinMethod.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Icon#getValencePoint <em>Valence Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valence Point</em>'.
	 * @see KragsteinMethod.Icon#getValencePoint()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_ValencePoint();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Icon#getLeftComment <em>Left Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Comment</em>'.
	 * @see KragsteinMethod.Icon#getLeftComment()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_LeftComment();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Icon#getRightComment <em>Right Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Comment</em>'.
	 * @see KragsteinMethod.Icon#getRightComment()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_RightComment();

	/**
	 * Returns the meta object for the reference '{@link KragsteinMethod.Icon#getNextIcon <em>Next Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Icon</em>'.
	 * @see KragsteinMethod.Icon#getNextIcon()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_NextIcon();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Icon#getSynchroniser <em>Synchroniser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchroniser</em>'.
	 * @see KragsteinMethod.Icon#getSynchroniser()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_Synchroniser();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see KragsteinMethod.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see KragsteinMethod.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Question#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Question#getValue()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Value();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Question#isYesBelow <em>Yes Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes Below</em>'.
	 * @see KragsteinMethod.Question#isYesBelow()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_YesBelow();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Question#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see KragsteinMethod.Question#getRoute()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Route();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see KragsteinMethod.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Choice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Choice#getName()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Choice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Choice#getValue()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link KragsteinMethod.Choice#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case</em>'.
	 * @see KragsteinMethod.Choice#getCase()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Case();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Choice#getFirstCaseName <em>First Case Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Case Name</em>'.
	 * @see KragsteinMethod.Choice#getFirstCaseName()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_FirstCaseName();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Choice#getFirstCaseValue <em>First Case Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Case Value</em>'.
	 * @see KragsteinMethod.Choice#getFirstCaseValue()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_FirstCaseValue();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see KragsteinMethod.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Case#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Case#getName()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Case#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Case#getValue()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Value();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Case#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see KragsteinMethod.Case#getRoute()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Route();

	/**
	 * Returns the meta object for the reference '{@link KragsteinMethod.Case#getNextCase <em>Next Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Case</em>'.
	 * @see KragsteinMethod.Case#getNextCase()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_NextCase();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Headline <em>Headline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headline</em>'.
	 * @see KragsteinMethod.Headline
	 * @generated
	 */
	EClass getHeadline();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Headline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Headline#getName()
	 * @see #getHeadline()
	 * @generated
	 */
	EAttribute getHeadline_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Headline#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see KragsteinMethod.Headline#isIsLoop()
	 * @see #getHeadline()
	 * @generated
	 */
	EAttribute getHeadline_IsLoop();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Adress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress</em>'.
	 * @see KragsteinMethod.Adress
	 * @generated
	 */
	EClass getAdress();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Adress#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see KragsteinMethod.Adress#getTarget()
	 * @see #getAdress()
	 * @generated
	 */
	EAttribute getAdress_Target();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Adress#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see KragsteinMethod.Adress#isIsLoop()
	 * @see #getAdress()
	 * @generated
	 */
	EAttribute getAdress_IsLoop();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Insertion <em>Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion</em>'.
	 * @see KragsteinMethod.Insertion
	 * @generated
	 */
	EClass getInsertion();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Insertion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Insertion#getName()
	 * @see #getInsertion()
	 * @generated
	 */
	EAttribute getInsertion_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Insertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Insertion#getValue()
	 * @see #getInsertion()
	 * @generated
	 */
	EAttribute getInsertion_Value();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Insertion#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see KragsteinMethod.Insertion#getMethod()
	 * @see #getInsertion()
	 * @generated
	 */
	EReference getInsertion_Method();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Shelf <em>Shelf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shelf</em>'.
	 * @see KragsteinMethod.Shelf
	 * @generated
	 */
	EClass getShelf();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Shelf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Shelf#getName()
	 * @see #getShelf()
	 * @generated
	 */
	EAttribute getShelf_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Shelf#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Shelf#getValue()
	 * @see #getShelf()
	 * @generated
	 */
	EAttribute getShelf_Value();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Shelf#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see KragsteinMethod.Shelf#getMethod()
	 * @see #getShelf()
	 * @generated
	 */
	EReference getShelf_Method();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.BeginLoop <em>Begin Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin Loop</em>'.
	 * @see KragsteinMethod.BeginLoop
	 * @generated
	 */
	EClass getBeginLoop();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.BeginLoop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.BeginLoop#getName()
	 * @see #getBeginLoop()
	 * @generated
	 */
	EAttribute getBeginLoop_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.BeginLoop#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.BeginLoop#getValue()
	 * @see #getBeginLoop()
	 * @generated
	 */
	EAttribute getBeginLoop_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.EndLoop <em>End Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Loop</em>'.
	 * @see KragsteinMethod.EndLoop
	 * @generated
	 */
	EClass getEndLoop();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.EndLoop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.EndLoop#getName()
	 * @see #getEndLoop()
	 * @generated
	 */
	EAttribute getEndLoop_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.EndLoop#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.EndLoop#getValue()
	 * @see #getEndLoop()
	 * @generated
	 */
	EAttribute getEndLoop_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see KragsteinMethod.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Output#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see KragsteinMethod.Output#getMethod()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Method();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Pause <em>Pause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pause</em>'.
	 * @see KragsteinMethod.Pause
	 * @generated
	 */
	EClass getPause();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Pause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Pause#getValue()
	 * @see #getPause()
	 * @generated
	 */
	EAttribute getPause_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.StartTimer <em>Start Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Timer</em>'.
	 * @see KragsteinMethod.StartTimer
	 * @generated
	 */
	EClass getStartTimer();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.StartTimer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.StartTimer#getName()
	 * @see #getStartTimer()
	 * @generated
	 */
	EAttribute getStartTimer_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.StartTimer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.StartTimer#getValue()
	 * @see #getStartTimer()
	 * @generated
	 */
	EAttribute getStartTimer_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see KragsteinMethod.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Value();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.Input#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see KragsteinMethod.Input#getMethod()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Method();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see KragsteinMethod.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.LoopArrow <em>Loop Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Arrow</em>'.
	 * @see KragsteinMethod.LoopArrow
	 * @generated
	 */
	EClass getLoopArrow();

	/**
	 * Returns the meta object for the containment reference '{@link KragsteinMethod.LoopArrow#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see KragsteinMethod.LoopArrow#getPeriod()
	 * @see #getLoopArrow()
	 * @generated
	 */
	EReference getLoopArrow_Period();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see KragsteinMethod.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Period#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Period#getValue()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Value();

	/**
	 * Returns the meta object for class '{@link KragsteinMethod.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see KragsteinMethod.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see KragsteinMethod.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see KragsteinMethod.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link KragsteinMethod.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see KragsteinMethod.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KragsteinMethodFactory getKragsteinMethodFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.MethodImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__HEADER = eINSTANCE.getMethod_Header();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BRANCH = eINSTANCE.getMethod_Branch();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.HeaderImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TYPE = eINSTANCE.getHeader_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__VISIBILITY = eINSTANCE.getHeader_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__IS_CONST = eINSTANCE.getHeader_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__IS_VIRTUAL = eINSTANCE.getHeader_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__IS_STATIC = eINSTANCE.getHeader_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__PARAMETER = eINSTANCE.getHeader_Parameter();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.BranchImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ROUTE = eINSTANCE.getBranch_Route();

		/**
		 * The meta object literal for the '<em><b>Next Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__NEXT_BRANCH = eINSTANCE.getBranch_NextBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.RouteImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ICON = eINSTANCE.getRoute_Icon();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.SynchronizerImpl <em>Synchronizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.SynchronizerImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getSynchronizer()
		 * @generated
		 */
		EClass SYNCHRONIZER = eINSTANCE.getSynchronizer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZER__NAME = eINSTANCE.getSynchronizer_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZER__VALUE = eINSTANCE.getSynchronizer_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.RightCommentImpl <em>Right Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.RightCommentImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getRightComment()
		 * @generated
		 */
		EClass RIGHT_COMMENT = eINSTANCE.getRightComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_COMMENT__VALUE = eINSTANCE.getRightComment_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.LeftCommentImpl <em>Left Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.LeftCommentImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getLeftComment()
		 * @generated
		 */
		EClass LEFT_COMMENT = eINSTANCE.getLeftComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEFT_COMMENT__VALUE = eINSTANCE.getLeftComment_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.ValencePointImpl <em>Valence Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.ValencePointImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getValencePoint()
		 * @generated
		 */
		EClass VALENCE_POINT = eINSTANCE.getValencePoint();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.IconImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Valence Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__VALENCE_POINT = eINSTANCE.getIcon_ValencePoint();

		/**
		 * The meta object literal for the '<em><b>Left Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__LEFT_COMMENT = eINSTANCE.getIcon_LeftComment();

		/**
		 * The meta object literal for the '<em><b>Right Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__RIGHT_COMMENT = eINSTANCE.getIcon_RightComment();

		/**
		 * The meta object literal for the '<em><b>Next Icon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__NEXT_ICON = eINSTANCE.getIcon_NextIcon();

		/**
		 * The meta object literal for the '<em><b>Synchroniser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__SYNCHRONISER = eINSTANCE.getIcon_Synchroniser();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.ActionImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.QuestionImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__VALUE = eINSTANCE.getQuestion_Value();

		/**
		 * The meta object literal for the '<em><b>Yes Below</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__YES_BELOW = eINSTANCE.getQuestion_YesBelow();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ROUTE = eINSTANCE.getQuestion_Route();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.ChoiceImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__VALUE = eINSTANCE.getChoice_Value();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__CASE = eINSTANCE.getChoice_Case();

		/**
		 * The meta object literal for the '<em><b>First Case Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__FIRST_CASE_NAME = eINSTANCE.getChoice_FirstCaseName();

		/**
		 * The meta object literal for the '<em><b>First Case Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__FIRST_CASE_VALUE = eINSTANCE.getChoice_FirstCaseValue();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.CaseImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__NAME = eINSTANCE.getCase_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__VALUE = eINSTANCE.getCase_Value();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ROUTE = eINSTANCE.getCase_Route();

		/**
		 * The meta object literal for the '<em><b>Next Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__NEXT_CASE = eINSTANCE.getCase_NextCase();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.HeadlineImpl <em>Headline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.HeadlineImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getHeadline()
		 * @generated
		 */
		EClass HEADLINE = eINSTANCE.getHeadline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADLINE__NAME = eINSTANCE.getHeadline_Name();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADLINE__IS_LOOP = eINSTANCE.getHeadline_IsLoop();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.AdressImpl <em>Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.AdressImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getAdress()
		 * @generated
		 */
		EClass ADRESS = eINSTANCE.getAdress();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS__TARGET = eINSTANCE.getAdress_Target();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS__IS_LOOP = eINSTANCE.getAdress_IsLoop();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.InsertionImpl <em>Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.InsertionImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getInsertion()
		 * @generated
		 */
		EClass INSERTION = eINSTANCE.getInsertion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION__NAME = eINSTANCE.getInsertion_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION__VALUE = eINSTANCE.getInsertion_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION__METHOD = eINSTANCE.getInsertion_Method();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.ShelfImpl <em>Shelf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.ShelfImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getShelf()
		 * @generated
		 */
		EClass SHELF = eINSTANCE.getShelf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELF__NAME = eINSTANCE.getShelf_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELF__VALUE = eINSTANCE.getShelf_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHELF__METHOD = eINSTANCE.getShelf_Method();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.BeginLoopImpl <em>Begin Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.BeginLoopImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getBeginLoop()
		 * @generated
		 */
		EClass BEGIN_LOOP = eINSTANCE.getBeginLoop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN_LOOP__NAME = eINSTANCE.getBeginLoop_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN_LOOP__VALUE = eINSTANCE.getBeginLoop_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.EndLoopImpl <em>End Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.EndLoopImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getEndLoop()
		 * @generated
		 */
		EClass END_LOOP = eINSTANCE.getEndLoop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_LOOP__NAME = eINSTANCE.getEndLoop_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_LOOP__VALUE = eINSTANCE.getEndLoop_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.OutputImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__METHOD = eINSTANCE.getOutput_Method();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.PauseImpl <em>Pause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.PauseImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getPause()
		 * @generated
		 */
		EClass PAUSE = eINSTANCE.getPause();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAUSE__VALUE = eINSTANCE.getPause_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.StartTimerImpl <em>Start Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.StartTimerImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getStartTimer()
		 * @generated
		 */
		EClass START_TIMER = eINSTANCE.getStartTimer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIMER__NAME = eINSTANCE.getStartTimer_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIMER__VALUE = eINSTANCE.getStartTimer_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.InputImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__METHOD = eINSTANCE.getInput_Method();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.EndImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.LoopArrowImpl <em>Loop Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.LoopArrowImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getLoopArrow()
		 * @generated
		 */
		EClass LOOP_ARROW = eINSTANCE.getLoopArrow();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_ARROW__PERIOD = eINSTANCE.getLoopArrow_Period();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.PeriodImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__VALUE = eINSTANCE.getPeriod_Value();

		/**
		 * The meta object literal for the '{@link KragsteinMethod.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KragsteinMethod.impl.ParameterImpl
		 * @see KragsteinMethod.impl.KragsteinMethodPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

	}

} //KragsteinMethodPackage
