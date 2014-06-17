package kragstein.diagram.providers;

import kragstein.diagram.edit.parts.KragsteinEditPartFactory;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.part.KragsteinVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class KragsteinEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public KragsteinEditPartProvider() {
		super(new KragsteinEditPartFactory(),
				KragsteinVisualIDRegistry.TYPED_INSTANCE,
				PackageEditPart.MODEL_ID);
	}

}
