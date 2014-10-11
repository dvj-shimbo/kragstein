/*
 * 
 */
package KragsteinProject.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class KragsteinProjectNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) {
			KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem item = (KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
