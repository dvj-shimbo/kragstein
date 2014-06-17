package kragstein.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import kragstein.Aggregation;
import kragstein.Association;
import kragstein.Class;
import kragstein.Composition;
import kragstein.Dependency;
import kragstein.Generalization;
import kragstein.KragsteinPackage;
import kragstein.Package;
import kragstein.Realization;
import kragstein.diagram.edit.parts.AggregationEditPart;
import kragstein.diagram.edit.parts.AssociationEditPart;
import kragstein.diagram.edit.parts.ClassEditPart;
import kragstein.diagram.edit.parts.CompositionEditPart;
import kragstein.diagram.edit.parts.DependencyEditPart;
import kragstein.diagram.edit.parts.GeneralizationEditPart;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.edit.parts.RealizationEditPart;
import kragstein.diagram.providers.KragsteinElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class KragsteinDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<KragsteinNodeDescriptor> getSemanticChildren(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Package modelElement = (Package) view.getElement();
		LinkedList<KragsteinNodeDescriptor> result = new LinkedList<KragsteinNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			Class childElement = (Class) it.next();
			int visualID = KragsteinVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new KragsteinNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getContainedLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4002ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003ContainedLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4004ContainedLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4005ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getIncomingLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4002IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003IncomingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4004IncomingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4005IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getOutgoingLinks(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4002OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003OutgoingLinks(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4004OutgoingLinks(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4005OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getComposition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getDependency_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAssociation_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getRealization_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getGeneralization_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAggregation_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getComposition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getDependency_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAssociation_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getRealization_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getGeneralization_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAggregation_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getComposition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getDependency_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAssociation_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getRealization_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getGeneralization_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinLinkDescriptor> getAggregation_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4001(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_4002(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Dependency_4002,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Association_4003(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Realization_4004(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Realization) {
				continue;
			}
			Realization link = (Realization) linkObject;
			if (RealizationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Realization_4004,
					RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4005(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) linkObject;
			if (GeneralizationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Generalization_4005,
					GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4006(
			Class container) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		for (Iterator<?> links = container.getSourceRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getTarget();
			result.add(new KragsteinLinkDescriptor(container, dst, link,
					KragsteinElementTypes.Aggregation_4006,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4001(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_4002(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Dependency_4002,
					DependencyEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4003(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Association_4003,
					AssociationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Realization_4004(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Realization) {
				continue;
			}
			Realization link = (Realization) setting.getEObject();
			if (RealizationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Realization_4004,
					RealizationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4005(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Generalization) {
				continue;
			}
			Generalization link = (Generalization) setting.getEObject();
			if (GeneralizationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Generalization_4005,
					GeneralizationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4006(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinLinkDescriptor> result = new LinkedList<KragsteinLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != KragsteinVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Class) {
				continue;
			}
			Class container = (Class) link.eContainer();
			result.add(new KragsteinLinkDescriptor(container, target, link,
					KragsteinElementTypes.Aggregation_4006,
					AggregationEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<KragsteinNodeDescriptor> getSemanticChildren(View view) {
			return KragsteinDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getContainedLinks(View view) {
			return KragsteinDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getIncomingLinks(View view) {
			return KragsteinDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinLinkDescriptor> getOutgoingLinks(View view) {
			return KragsteinDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
