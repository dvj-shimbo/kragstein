/*
 * 
 */
package KragsteinPackage.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class KragsteinPackageEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(view)) {

			case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.PackageEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.CommentEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.CommentNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.CommentNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ClassEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ClassNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AttributeEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AttributeNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.MethodEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.MethodNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ImportedPackageEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ImportedPackageEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ImportedPackageNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ImportedPackageNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.ClassClassImportedPackageCompartmentEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.ClassClassImportedPackageCompartmentEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.GeneralizationEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Generalization2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.GeneralizationNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.GeneralizationNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.RealizationEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Realization2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.RealizationNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.RealizationNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AssociationEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Association2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AssociationNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AggregationEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Aggregation2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.AggregationNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.AggregationNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.CompositionEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Composition2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.CompositionNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.CompositionNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.DependencyEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Dependency2EditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.DependencyNameEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.DependencyNameEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.LinkEditPart(
						view);

			case KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID:
				return new KragsteinPackage.diagram.edit.parts.Link2EditPart(
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
