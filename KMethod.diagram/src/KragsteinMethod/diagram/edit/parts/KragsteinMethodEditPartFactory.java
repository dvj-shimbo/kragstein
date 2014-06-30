/*
 * 
 */
package KragsteinMethod.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class KragsteinMethodEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(view)) {

			case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.MethodEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.HeaderEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.HeaderNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.HeaderNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BranchEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BranchNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BranchNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.RouteEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ActionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.QuestionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.Route2EditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ChoiceEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseEditPart(view);

			case KragsteinMethod.diagram.edit.parts.CaseNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.Route3EditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.HeadlineEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.AdressEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InsertionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ShelfEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BeginLoopEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.EndLoopEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.OutputEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InputEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.LoopArrowEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.EndEditPart(view);

			case KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.IconConnectionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
