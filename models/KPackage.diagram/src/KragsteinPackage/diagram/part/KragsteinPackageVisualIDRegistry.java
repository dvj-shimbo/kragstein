/*
 * 
 */
package KragsteinPackage.diagram.part;

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
public class KragsteinPackageVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "KPackage.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
					.equals(view.getType())) {
				return KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
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
				KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
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
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getPackage()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((KragsteinPackage.Package) domainElement)) {
			return KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID;
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
		String containerModelID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinPackage".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getNote()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID;
			}
			if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getClass_()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getMethod()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getImportedClass().isSuperTypeOf(domainElement.eClass())) {
				return KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinPackage".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.NoteNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.MethodNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.ImportedClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.AggregationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.CompositionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			if (KragsteinPackage.diagram.edit.parts.DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE
				.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getRealization()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getAssociation()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getAggregation()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getComposition()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getDependency()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID;
		}
		if (KragsteinPackage.KragsteinPackagePackage.eINSTANCE.getLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(KragsteinPackage.Package element) {
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
		case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
		case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
		case KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID:
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
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return false;
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
		case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
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
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
