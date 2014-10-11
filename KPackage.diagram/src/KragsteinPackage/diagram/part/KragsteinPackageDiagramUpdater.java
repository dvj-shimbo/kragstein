/*
 * 
 */
package KragsteinPackage.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class KragsteinPackageDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getSemanticChildren(
			View view) {
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
			return getClassClassAttributeCompartment_7001SemanticChildren(view);
		case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
			return getClassClassMethodCompartment_7002SemanticChildren(view);
		case KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID:
			return getClassClassImportedClassCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinPackage.Package modelElement = (KragsteinPackage.Package) view
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUnit().iterator(); it.hasNext();) {
			KragsteinPackage.Unit childElement = (KragsteinPackage.Unit) it
					.next();
			int visualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID) {
				result.add(new KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getClassClassAttributeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) containerView
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			KragsteinPackage.Attribute childElement = (KragsteinPackage.Attribute) it
					.next();
			int visualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getClassClassMethodCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) containerView
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMethod().iterator(); it.hasNext();) {
			KragsteinPackage.Method childElement = (KragsteinPackage.Method) it
					.next();
			int visualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID) {
				result.add(new KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getClassClassImportedClassCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) containerView
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getImportedClass().iterator(); it
				.hasNext();) {
			KragsteinPackage.ImportedClass childElement = (KragsteinPackage.ImportedClass) it
					.next();
			int visualID = KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID) {
				result.add(new KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedLinks(
			View view) {
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			return getNote_2001ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_3002ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
			return getImportedClass_3004ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getRealization_4003ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4005ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getAggregation_4007ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getComposition_4009ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4011ContainedLinks(view);
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4013ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingLinks(
			View view) {
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			return getNote_2001IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_3002IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
			return getImportedClass_3004IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getRealization_4003IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4005IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getAggregation_4007IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getComposition_4009IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4011IncomingLinks(view);
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4013IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			return getNote_2001OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_3002OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
			return getImportedClass_3004OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getRealization_4003OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4005OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getAggregation_4007OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getComposition_4009OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4011OutgoingLinks(view);
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4013OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getNote_2001ContainedLinks(
			View view) {
		KragsteinPackage.Note modelElement = (KragsteinPackage.Note) view
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getClass_2002ContainedLinks(
			View view) {
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) view
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Realization_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Composition_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Dependency_4011(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getMethod_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getImportedClass_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getGeneralization_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getRealization_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAssociation_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAggregation_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getComposition_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getDependency_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getLink_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getNote_2001IncomingLinks(
			View view) {
		KragsteinPackage.Note modelElement = (KragsteinPackage.Note) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4013(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getClass_2002IncomingLinks(
			View view) {
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Generalization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Realization_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Association_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4013(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getMethod_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getImportedClass_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getGeneralization_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getRealization_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAssociation_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAggregation_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getComposition_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getDependency_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getLink_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getNote_2001OutgoingLinks(
			View view) {
		KragsteinPackage.Note modelElement = (KragsteinPackage.Note) view
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getClass_2002OutgoingLinks(
			View view) {
		KragsteinPackage.Class modelElement = (KragsteinPackage.Class) view
				.getElement();
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Generalization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Realization_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Association_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Dependency_4011(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getMethod_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getImportedClass_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getGeneralization_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getRealization_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAssociation_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getAggregation_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getComposition_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getDependency_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getLink_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Generalization_4001(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Generalization) {
				continue;
			}
			KragsteinPackage.Generalization link = (KragsteinPackage.Generalization) linkObject;
			if (KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001,
					KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Realization_4003(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Realization) {
				continue;
			}
			KragsteinPackage.Realization link = (KragsteinPackage.Realization) linkObject;
			if (KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003,
					KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Association_4005(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Association) {
				continue;
			}
			KragsteinPackage.Association link = (KragsteinPackage.Association) linkObject;
			if (KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005,
					KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4007(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Aggregation) {
				continue;
			}
			KragsteinPackage.Aggregation link = (KragsteinPackage.Aggregation) linkObject;
			if (KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007,
					KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4009(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Composition) {
				continue;
			}
			KragsteinPackage.Composition link = (KragsteinPackage.Composition) linkObject;
			if (KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009,
					KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Dependency_4011(
			KragsteinPackage.Class container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Dependency) {
				continue;
			}
			KragsteinPackage.Dependency link = (KragsteinPackage.Dependency) linkObject;
			if (KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011,
					KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedTypeModelFacetLinks_Link_4013(
			KragsteinPackage.Unit container) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Link) {
				continue;
			}
			KragsteinPackage.Link link = (KragsteinPackage.Link) linkObject;
			if (KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Unit dst = link.getTarget();
			KragsteinPackage.Unit src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013,
					KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Generalization_4001(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Generalization) {
				continue;
			}
			KragsteinPackage.Generalization link = (KragsteinPackage.Generalization) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001,
					KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Realization_4003(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Realization) {
				continue;
			}
			KragsteinPackage.Realization link = (KragsteinPackage.Realization) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003,
					KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Association_4005(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Association) {
				continue;
			}
			KragsteinPackage.Association link = (KragsteinPackage.Association) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005,
					KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4007(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Aggregation) {
				continue;
			}
			KragsteinPackage.Aggregation link = (KragsteinPackage.Aggregation) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007,
					KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4009(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Composition) {
				continue;
			}
			KragsteinPackage.Composition link = (KragsteinPackage.Composition) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009,
					KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Dependency_4011(
			KragsteinPackage.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Dependency) {
				continue;
			}
			KragsteinPackage.Dependency link = (KragsteinPackage.Dependency) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011,
					KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4013(
			KragsteinPackage.Unit target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getLink_Target()
					|| false == setting.getEObject() instanceof KragsteinPackage.Link) {
				continue;
			}
			KragsteinPackage.Link link = (KragsteinPackage.Link) setting
					.getEObject();
			if (KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Unit src = link.getSource();
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					target,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013,
					KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Generalization_4001(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Generalization) {
				continue;
			}
			KragsteinPackage.Generalization link = (KragsteinPackage.Generalization) linkObject;
			if (KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001,
					KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Realization_4003(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Realization) {
				continue;
			}
			KragsteinPackage.Realization link = (KragsteinPackage.Realization) linkObject;
			if (KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003,
					KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Association_4005(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Association) {
				continue;
			}
			KragsteinPackage.Association link = (KragsteinPackage.Association) linkObject;
			if (KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005,
					KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4007(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Aggregation) {
				continue;
			}
			KragsteinPackage.Aggregation link = (KragsteinPackage.Aggregation) linkObject;
			if (KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007,
					KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Composition_4009(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Composition) {
				continue;
			}
			KragsteinPackage.Composition link = (KragsteinPackage.Composition) linkObject;
			if (KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009,
					KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Dependency_4011(
			KragsteinPackage.Class source) {
		KragsteinPackage.Class container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Class) {
				container = (KragsteinPackage.Class) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Dependency) {
				continue;
			}
			KragsteinPackage.Dependency link = (KragsteinPackage.Dependency) linkObject;
			if (KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Class dst = link.getTarget();
			KragsteinPackage.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011,
					KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4013(
			KragsteinPackage.Unit source) {
		KragsteinPackage.Unit container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinPackage.Unit) {
				container = (KragsteinPackage.Unit) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> result = new LinkedList<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor>();
		for (Iterator<?> links = container.getTargetLink().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinPackage.Link) {
				continue;
			}
			KragsteinPackage.Link link = (KragsteinPackage.Link) linkObject;
			if (KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID != KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinPackage.Unit dst = link.getTarget();
			KragsteinPackage.Unit src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor(
					src,
					dst,
					link,
					KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013,
					KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
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
		public List<KragsteinPackage.diagram.part.KragsteinPackageNodeDescriptor> getSemanticChildren(
				View view) {
			return KragsteinPackageDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getContainedLinks(
				View view) {
			return KragsteinPackageDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getIncomingLinks(
				View view) {
			return KragsteinPackageDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinPackage.diagram.part.KragsteinPackageLinkDescriptor> getOutgoingLinks(
				View view) {
			return KragsteinPackageDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
