package kragstein.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import kragstein.Package;
import kragstein.Project;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.edit.parts.ProjectEditPart;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class KragsteinDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<KragsteinNodeDescriptor> getSemanticChildren(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinNodeDescriptor> getProject_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Project modelElement = (Project) view.getElement();
		LinkedList<KragsteinNodeDescriptor> result = new LinkedList<KragsteinNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackage().iterator(); it
				.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = KragsteinVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new KragsteinNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getContainedLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000ContainedLinks(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getIncomingLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getOutgoingLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getProject_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getPackage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getPackage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getPackage_2001OutgoingLinks(
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
		public List<KragsteinNodeDescriptor> getSemanticChildren(View view) {
			return KragsteinDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getContainedLinks(View view) {
			return KragsteinDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getIncomingLinks(View view) {
			return KragsteinDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getOutgoingLinks(View view) {
			return KragsteinDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
