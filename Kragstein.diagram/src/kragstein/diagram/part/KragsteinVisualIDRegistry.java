package kragstein.diagram.part;

import kragstein.KragsteinPackage;
import kragstein.Package;
import kragstein.diagram.edit.parts.AggregationEditPart;
import kragstein.diagram.edit.parts.AggregationNameEditPart;
import kragstein.diagram.edit.parts.AssociationEditPart;
import kragstein.diagram.edit.parts.AssociationNameEditPart;
import kragstein.diagram.edit.parts.ClassEditPart;
import kragstein.diagram.edit.parts.ClassNameEditPart;
import kragstein.diagram.edit.parts.CompositionEditPart;
import kragstein.diagram.edit.parts.CompositionNameEditPart;
import kragstein.diagram.edit.parts.DependencyEditPart;
import kragstein.diagram.edit.parts.DependencyNameEditPart;
import kragstein.diagram.edit.parts.GeneralizationEditPart;
import kragstein.diagram.edit.parts.GeneralizationNameEditPart;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.edit.parts.RealizationEditPart;
import kragstein.diagram.edit.parts.RealizationNameEditPart;

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
public class KragsteinVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Kragstein.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return kragstein.diagram.part.KragsteinVisualIDRegistry
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
				KragsteinDiagramEditorPlugin.getInstance().logError(
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
		if (KragsteinPackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
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
		String containerModelID = kragstein.diagram.part.KragsteinVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = kragstein.diagram.part.KragsteinVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (KragsteinPackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = kragstein.diagram.part.KragsteinVisualIDRegistry
				.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = kragstein.diagram.part.KragsteinVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PackageEditPart.VISUAL_ID:
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassEditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositionEditPart.VISUAL_ID:
			if (CompositionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyEditPart.VISUAL_ID:
			if (DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealizationEditPart.VISUAL_ID:
			if (RealizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeneralizationEditPart.VISUAL_ID:
			if (GeneralizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (KragsteinPackage.eINSTANCE.getComposition().isSuperTypeOf(
				domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.eINSTANCE.getDependency().isSuperTypeOf(
				domainElement.eClass())) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.eINSTANCE.getAssociation().isSuperTypeOf(
				domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.eINSTANCE.getRealization().isSuperTypeOf(
				domainElement.eClass())) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.eINSTANCE.getGeneralization().isSuperTypeOf(
				domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.eINSTANCE.getAggregation().isSuperTypeOf(
				domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return false;
		case ClassEditPart.VISUAL_ID:
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
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return kragstein.diagram.part.KragsteinVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
