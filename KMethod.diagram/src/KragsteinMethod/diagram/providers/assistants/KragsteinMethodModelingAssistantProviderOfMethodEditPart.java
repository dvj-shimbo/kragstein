/*
 * 
 */
package KragsteinMethod.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinMethodModelingAssistantProviderOfMethodEditPart
		extends
		KragsteinMethod.diagram.providers.KragsteinMethodModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002);
		return types;
	}

}
