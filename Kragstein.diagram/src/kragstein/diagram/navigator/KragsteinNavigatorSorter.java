package kragstein.diagram.navigator;

import kragstein.diagram.part.KragsteinVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class KragsteinNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof KragsteinNavigatorItem) {
			KragsteinNavigatorItem item = (KragsteinNavigatorItem) element;
			return KragsteinVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
