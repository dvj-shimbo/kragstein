/*
 * 
 */
package KragsteinPackage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinPackageModelingAssistantProviderOfPackageEditPart
		extends
		KragsteinPackage.diagram.providers.KragsteinPackageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		return types;
	}

}
