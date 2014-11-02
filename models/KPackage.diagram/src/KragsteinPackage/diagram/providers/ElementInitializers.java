/*
 * 
 */
package KragsteinPackage.diagram.providers;

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
		ElementInitializers cached = KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
