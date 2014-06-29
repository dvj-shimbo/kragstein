/*
 * 
 */
package KragsteinProject.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class KragsteinProjectEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(view)) {

			case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
				return new KragsteinProject.diagram.edit.parts.ProjectEditPart(
						view);

			case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
				return new KragsteinProject.diagram.edit.parts.PackageEditPart(
						view);

			case KragsteinProject.diagram.edit.parts.PackageNameEditPart.VISUAL_ID:
				return new KragsteinProject.diagram.edit.parts.PackageNameEditPart(
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
