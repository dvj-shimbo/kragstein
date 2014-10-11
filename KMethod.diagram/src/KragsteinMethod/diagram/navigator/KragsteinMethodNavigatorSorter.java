/*
 * 
 */
package KragsteinMethod.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class KragsteinMethodNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7010;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7009;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem item = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
