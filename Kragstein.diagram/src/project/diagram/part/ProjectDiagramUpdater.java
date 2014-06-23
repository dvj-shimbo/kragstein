package project.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import project.Package;
import project.Project;
import project.diagram.edit.parts.PackageEditPart;
import project.diagram.edit.parts.ProjectEditPart;

/**
 * @generated
 */
public class ProjectDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ProjectNodeDescriptor> getSemanticChildren(View view) {
		switch (ProjectVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectNodeDescriptor> getProject_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Project modelElement = (Project) view.getElement();
		LinkedList<ProjectNodeDescriptor> result = new LinkedList<ProjectNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPackage().iterator(); it
				.hasNext();) {
			Package childElement = (Package) it.next();
			int visualID = ProjectVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PackageEditPart.VISUAL_ID) {
				result.add(new ProjectNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getContainedLinks(View view) {
		switch (ProjectVisualIDRegistry.getVisualID(view)) {
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
	public static List<ProjectLinkDescriptor> getIncomingLinks(View view) {
		switch (ProjectVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProjectVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getProject_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getPackage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getPackage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProjectLinkDescriptor> getPackage_2001OutgoingLinks(
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
		public List<ProjectNodeDescriptor> getSemanticChildren(View view) {
			return ProjectDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProjectLinkDescriptor> getContainedLinks(View view) {
			return ProjectDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProjectLinkDescriptor> getIncomingLinks(View view) {
			return ProjectDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ProjectLinkDescriptor> getOutgoingLinks(View view) {
			return ProjectDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
