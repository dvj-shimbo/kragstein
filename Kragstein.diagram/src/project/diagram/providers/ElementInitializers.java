package project.diagram.providers;

import project.diagram.part.ProjectDiagramEditorPlugin;

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
		ElementInitializers cached = ProjectDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ProjectDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
