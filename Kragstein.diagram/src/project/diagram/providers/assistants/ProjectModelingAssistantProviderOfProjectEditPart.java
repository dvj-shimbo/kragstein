package project.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import project.diagram.providers.ProjectElementTypes;
import project.diagram.providers.ProjectModelingAssistantProvider;

/**
 * @generated
 */
public class ProjectModelingAssistantProviderOfProjectEditPart extends
		ProjectModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ProjectElementTypes.Package_2001);
		return types;
	}

}
