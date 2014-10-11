/*
 * 
 */
package KragsteinMethod.diagram.providers;

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
		ElementInitializers cached = KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
