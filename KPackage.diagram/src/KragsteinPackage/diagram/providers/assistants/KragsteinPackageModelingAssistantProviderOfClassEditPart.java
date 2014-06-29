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
public class KragsteinPackageModelingAssistantProviderOfClassEditPart
		extends
		KragsteinPackage.diagram.providers.KragsteinPackageModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((KragsteinPackage.diagram.edit.parts.ClassEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			KragsteinPackage.diagram.edit.parts.ClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012);
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
				(KragsteinPackage.diagram.edit.parts.ClassEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			KragsteinPackage.diagram.edit.parts.ClassEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.CommentEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.ClassEditPart) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		}
		if (targetEditPart instanceof KragsteinPackage.diagram.edit.parts.CommentEditPart) {
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
				(KragsteinPackage.diagram.edit.parts.ClassEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			KragsteinPackage.diagram.edit.parts.ClassEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001);
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
		return doGetRelTypesOnTarget((KragsteinPackage.diagram.edit.parts.ClassEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			KragsteinPackage.diagram.edit.parts.ClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(14);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012);
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
				(KragsteinPackage.diagram.edit.parts.ClassEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			KragsteinPackage.diagram.edit.parts.ClassEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		} else if (relationshipType == KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014) {
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001);
			types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
		}
		return types;
	}

}
