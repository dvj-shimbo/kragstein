package project.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import project.diagram.edit.parts.ProjectEditPart;
import project.diagram.edit.parts.ProjectEditPartFactory;
import project.diagram.part.ProjectVisualIDRegistry;

/**
 * @generated
 */
public class ProjectEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ProjectEditPartProvider() {
		super(new ProjectEditPartFactory(),
				ProjectVisualIDRegistry.TYPED_INSTANCE,
				ProjectEditPart.MODEL_ID);
	}

}
