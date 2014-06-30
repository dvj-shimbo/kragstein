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
public class KragsteinMethodModelingAssistantProviderOfCaseEditPart
		extends
		KragsteinMethod.diagram.providers.KragsteinMethodModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((KragsteinMethod.diagram.edit.parts.CaseEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			KragsteinMethod.diagram.edit.parts.CaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006);
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
				(KragsteinMethod.diagram.edit.parts.CaseEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			KragsteinMethod.diagram.edit.parts.CaseEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.CaseEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005);
		}
		if (targetEditPart instanceof KragsteinMethod.diagram.edit.parts.CaseEditPart) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006);
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
				(KragsteinMethod.diagram.edit.parts.CaseEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			KragsteinMethod.diagram.edit.parts.CaseEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018);
		} else if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018);
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
		return doGetRelTypesOnTarget((KragsteinMethod.diagram.edit.parts.CaseEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			KragsteinMethod.diagram.edit.parts.CaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006);
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
				(KragsteinMethod.diagram.edit.parts.CaseEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			KragsteinMethod.diagram.edit.parts.CaseEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018);
		} else if (relationshipType == KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006) {
			types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018);
		}
		return types;
	}

}
