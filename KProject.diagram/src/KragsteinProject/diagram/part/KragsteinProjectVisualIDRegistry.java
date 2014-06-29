/*
 * 
 */
package KragsteinProject.diagram.part;

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
public class KragsteinProjectVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "KProject.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
					.equals(view.getType())) {
				return KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
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
				KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
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
		if (KragsteinProject.KragsteinProjectPackage.eINSTANCE.getProject()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((KragsteinProject.Project) domainElement)) {
			return KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
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
		String containerModelID = KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinProject".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			if (KragsteinProject.KragsteinProjectPackage.eINSTANCE.getPackage()
					.isSuperTypeOf(domainElement.eClass())) {
				return KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getModelID(containerView);
		if (!KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"KragsteinProject".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			if (KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (KragsteinProject.diagram.edit.parts.PackageNameEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(KragsteinProject.Project element) {
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
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return false;
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
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
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
