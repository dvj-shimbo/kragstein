package project.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import project.diagram.part.ProjectVisualIDRegistry;

/**
 * @generated
 */
public class ProjectNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ProjectNavigatorItem) {
			ProjectNavigatorItem item = (ProjectNavigatorItem) element;
			return ProjectVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
