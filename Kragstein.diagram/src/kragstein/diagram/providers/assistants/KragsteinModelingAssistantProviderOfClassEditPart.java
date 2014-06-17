package kragstein.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import kragstein.diagram.edit.parts.ClassEditPart;
import kragstein.diagram.providers.KragsteinElementTypes;
import kragstein.diagram.providers.KragsteinModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinModelingAssistantProviderOfClassEditPart extends
		KragsteinModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(KragsteinElementTypes.Composition_4001);
		types.add(KragsteinElementTypes.Dependency_4002);
		types.add(KragsteinElementTypes.Association_4003);
		types.add(KragsteinElementTypes.Realization_4004);
		types.add(KragsteinElementTypes.Generalization_4005);
		types.add(KragsteinElementTypes.Aggregation_4006);
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
		return doGetRelTypesOnSourceAndTarget((ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ClassEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Dependency_4002);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Association_4003);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Realization_4004);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Generalization_4005);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(KragsteinElementTypes.Aggregation_4006);
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
		return doGetTypesForTarget((ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinElementTypes.Composition_4001) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Dependency_4002) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Association_4003) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Realization_4004) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Generalization_4005) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Aggregation_4006) {
			types.add(KragsteinElementTypes.Class_2001);
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
		return doGetRelTypesOnTarget((ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(KragsteinElementTypes.Composition_4001);
		types.add(KragsteinElementTypes.Dependency_4002);
		types.add(KragsteinElementTypes.Association_4003);
		types.add(KragsteinElementTypes.Realization_4004);
		types.add(KragsteinElementTypes.Generalization_4005);
		types.add(KragsteinElementTypes.Aggregation_4006);
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
		return doGetTypesForSource((ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinElementTypes.Composition_4001) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Dependency_4002) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Association_4003) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Realization_4004) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Generalization_4005) {
			types.add(KragsteinElementTypes.Class_2001);
		} else if (relationshipType == KragsteinElementTypes.Aggregation_4006) {
			types.add(KragsteinElementTypes.Class_2001);
		}
		return types;
	}

}
