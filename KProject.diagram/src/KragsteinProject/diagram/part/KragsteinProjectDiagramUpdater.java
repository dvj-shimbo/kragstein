/*
 * 
 */
package KragsteinProject.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class KragsteinProjectDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor> getSemanticChildren(
			View view) {
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor> getProject_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinProject.Project modelElement = (KragsteinProject.Project) view
				.getElement();
		LinkedList<KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor> result = new LinkedList<KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackage().iterator(); it
				.hasNext();) {
			KragsteinProject.Package childElement = (KragsteinProject.Package) it
					.next();
			int visualID = KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID) {
				result.add(new KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getContainedLinks(
			View view) {
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getIncomingLinks(
			View view) {
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getProject_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getPackage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getPackage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getPackage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<KragsteinProject.diagram.part.KragsteinProjectNodeDescriptor> getSemanticChildren(
				View view) {
			return KragsteinProjectDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getContainedLinks(
				View view) {
			return KragsteinProjectDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getIncomingLinks(
				View view) {
			return KragsteinProjectDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinProject.diagram.part.KragsteinProjectLinkDescriptor> getOutgoingLinks(
				View view) {
			return KragsteinProjectDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
