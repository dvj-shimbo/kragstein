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
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.FormalParameters_2015);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_2014);
		return types;
	}

}
