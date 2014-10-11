/*
 * 
 */
package KragsteinProject.diagram.providers;

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
		ElementInitializers cached = KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
