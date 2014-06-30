/*
 * 
 */
package KragsteinMethod.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinMethodModelingAssistantProviderOfAdressEditPart
		extends
		KragsteinMethod.diagram.providers.KragsteinMethodModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((KragsteinMethod.diagram.edit.parts.AdressEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			KragsteinMethod.diagram.edit.parts.AdressEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(KragsteinMethod.diagram.edit.parts.AdressEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			KragsteinMethod.diagram.edit.parts.AdressEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.ActionEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.QuestionEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.ChoiceEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.HeadlineEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.AdressEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.InsertionEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.ShelfEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.BeginLoopEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.EndLoopEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.OutputEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.InputEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.LoopArrowEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.EndEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(KragsteinMethod.diagram.edit.parts.AdressEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			KragsteinMethod.diagram.edit.parts.AdressEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((KragsteinMethod.diagram.edit.parts.AdressEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			KragsteinMethod.diagram.edit.parts.AdressEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(KragsteinMethod.diagram.edit.parts.AdressEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			KragsteinMethod.diagram.edit.parts.AdressEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014);
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016);
		}
		return types;
	}

}
