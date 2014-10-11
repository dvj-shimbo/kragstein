/*
 * 
 */
package KragsteinPackage.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class KragsteinPackageNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem item = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
