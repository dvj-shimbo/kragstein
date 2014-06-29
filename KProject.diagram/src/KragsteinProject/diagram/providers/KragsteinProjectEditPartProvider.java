/*
 * 
 */
package KragsteinProject.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class KragsteinProjectEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public KragsteinProjectEditPartProvider() {
		super(
				new KragsteinProject.diagram.edit.parts.KragsteinProjectEditPartFactory(),
				KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry.TYPED_INSTANCE,
				KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID);
	}

}
