package kragstein.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import kragstein.KragsteinPackage;
import kragstein.diagram.edit.parts.AggregationEditPart;
import kragstein.diagram.edit.parts.AssociationEditPart;
import kragstein.diagram.edit.parts.ClassEditPart;
import kragstein.diagram.edit.parts.CompositionEditPart;
import kragstein.diagram.edit.parts.DependencyEditPart;
import kragstein.diagram.edit.parts.GeneralizationEditPart;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.edit.parts.RealizationEditPart;
import kragstein.diagram.part.KragsteinDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class KragsteinElementTypes {

	/**
	 * @generated
	 */
	private KragsteinElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			KragsteinDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("Kragstein.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2001 = getElementType("Kragstein.diagram.Class_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composition_4001 = getElementType("Kragstein.diagram.Composition_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dependency_4002 = getElementType("Kragstein.diagram.Dependency_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4003 = getElementType("Kragstein.diagram.Association_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Realization_4004 = getElementType("Kragstein.diagram.Realization_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_4005 = getElementType("Kragstein.diagram.Generalization_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_4006 = getElementType("Kragstein.diagram.Aggregation_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Package_1000, KragsteinPackage.eINSTANCE.getPackage());

			elements.put(Class_2001, KragsteinPackage.eINSTANCE.getClass_());

			elements.put(Composition_4001,
					KragsteinPackage.eINSTANCE.getComposition());

			elements.put(Dependency_4002,
					KragsteinPackage.eINSTANCE.getDependency());

			elements.put(Association_4003,
					KragsteinPackage.eINSTANCE.getAssociation());

			elements.put(Realization_4004,
					KragsteinPackage.eINSTANCE.getRealization());

			elements.put(Generalization_4005,
					KragsteinPackage.eINSTANCE.getGeneralization());

			elements.put(Aggregation_4006,
					KragsteinPackage.eINSTANCE.getAggregation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Package_1000);
			KNOWN_ELEMENT_TYPES.add(Class_2001);
			KNOWN_ELEMENT_TYPES.add(Composition_4001);
			KNOWN_ELEMENT_TYPES.add(Dependency_4002);
			KNOWN_ELEMENT_TYPES.add(Association_4003);
			KNOWN_ELEMENT_TYPES.add(Realization_4004);
			KNOWN_ELEMENT_TYPES.add(Generalization_4005);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PackageEditPart.VISUAL_ID:
			return Package_1000;
		case ClassEditPart.VISUAL_ID:
			return Class_2001;
		case CompositionEditPart.VISUAL_ID:
			return Composition_4001;
		case DependencyEditPart.VISUAL_ID:
			return Dependency_4002;
		case AssociationEditPart.VISUAL_ID:
			return Association_4003;
		case RealizationEditPart.VISUAL_ID:
			return Realization_4004;
		case GeneralizationEditPart.VISUAL_ID:
			return Generalization_4005;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4006;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return kragstein.diagram.providers.KragsteinElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return kragstein.diagram.providers.KragsteinElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return kragstein.diagram.providers.KragsteinElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
