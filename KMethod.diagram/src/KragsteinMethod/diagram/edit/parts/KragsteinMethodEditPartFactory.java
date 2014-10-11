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

			case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.TitleEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.TitleNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.TitleNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.FormalParametersEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ActionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ActionNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.QuestionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.QuestionNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.QuestionNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ChoiceEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ChoiceNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ChoiceNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.HeadlineEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.HeadlineNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.HeadlineNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.AdressEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.AdressTargetEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.AdressTargetEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InsertionEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InsertionNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InsertionNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ShelfEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ShelfNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ShelfNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BeginLoopEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.BeginLoopNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.BeginLoopNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.EndLoopEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.EndLoopNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.EndLoopNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.OutputEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.OutputNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.OutputNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InputEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.InputNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.InputNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.EndEditPart(view);

			case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseEditPart(view);

			case KragsteinMethod.diagram.edit.parts.CaseNameEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.CaseNameEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart(
						view);

			case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
				return new KragsteinMethod.diagram.edit.parts.ConnectionEditPart(
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
