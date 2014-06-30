/*
 * 
 */
package KragsteinMethod.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class KragsteinMethodVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "KMethod.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
					.equals(view.getType())) {
				return KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getMethod()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((KragsteinMethod.Method) domainElement)) {
			return KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinMethod".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getHeader()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getBranch()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getRoute()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getQuestion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getChoice()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getHeadline()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAdress()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInsertion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getShelf()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getBeginLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEndLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getLoopArrow()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEnd()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getRoute()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getQuestion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getChoice()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getHeadline()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAdress()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInsertion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getShelf()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getBeginLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEndLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getLoopArrow()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEnd()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getCase()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getRoute()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID:
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAction()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getQuestion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getChoice()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getHeadline()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getAdress()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInsertion()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getShelf()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getBeginLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEndLoop()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getLoopArrow()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID;
			}
			if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEnd()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinMethod".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.HeaderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.BranchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.CaseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID:
			if (KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE
				.getBranchConnection().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE
				.getBranchConnection().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE
				.getIconConnection().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE
				.getCaseConnection().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID;
		}
		if (KragsteinMethod.KragsteinMethodPackage.eINSTANCE
				.getCaseConnection().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(KragsteinMethod.Method element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return false;
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
