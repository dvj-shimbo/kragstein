/*
 * 
 */
package KragsteinPackage.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinPackageModelingAssistantProviderOfNoteEditPart
		extends
		KragsteinPackage.diagram.providers.KragsteinPackageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((KragsteinPackage.diagram.edit.parts.NoteEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			KragsteinPackage.diagram.edit.parts.NoteEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014);
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
				(KragsteinPackage.diagram.edit.parts.NoteEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			KragsteinPackage.diagram.edit.parts.NoteEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.NoteEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.NoteEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014);
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
				(KragsteinPackage.diagram.edit.parts.NoteEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			KragsteinPackage.diagram.edit.parts.NoteEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
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
		return doGetRelTypesOnTarget((KragsteinPackage.diagram.edit.parts.NoteEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			KragsteinPackage.diagram.edit.parts.NoteEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014);
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
				(KragsteinPackage.diagram.edit.parts.NoteEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			KragsteinPackage.diagram.edit.parts.NoteEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		}
		return types;
	}

}
