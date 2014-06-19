package kragstein.diagram.providers;

import kragstein.diagram.part.KragsteinDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = KragsteinDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			KragsteinDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
