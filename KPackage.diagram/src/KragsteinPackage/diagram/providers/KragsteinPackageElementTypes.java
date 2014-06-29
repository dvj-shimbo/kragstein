/*
 * 
 */
package KragsteinPackage.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

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
public class KragsteinPackageElementTypes {

	/**
	 * @generated
	 */
	private KragsteinPackageElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Package_1000 = getElementType("KPackage.diagram.Package_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comment_2001 = getElementType("KPackage.diagram.Comment_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2002 = getElementType("KPackage.diagram.Class_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Attribute_3001 = getElementType("KPackage.diagram.Attribute_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Method_3002 = getElementType("KPackage.diagram.Method_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ImportedPackage_3003 = getElementType("KPackage.diagram.ImportedPackage_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Generalization_4001 = getElementType("KPackage.diagram.Generalization_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generalization_4002 = getElementType("KPackage.diagram.Generalization_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Realization_4003 = getElementType("KPackage.diagram.Realization_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Realization_4004 = getElementType("KPackage.diagram.Realization_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4005 = getElementType("KPackage.diagram.Association_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Association_4006 = getElementType("KPackage.diagram.Association_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_4007 = getElementType("KPackage.diagram.Aggregation_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Aggregation_4008 = getElementType("KPackage.diagram.Aggregation_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composition_4009 = getElementType("KPackage.diagram.Composition_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Composition_4010 = getElementType("KPackage.diagram.Composition_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dependency_4011 = getElementType("KPackage.diagram.Dependency_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dependency_4012 = getElementType("KPackage.diagram.Dependency_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_4013 = getElementType("KPackage.diagram.Link_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_4014 = getElementType("KPackage.diagram.Link_4014"); //$NON-NLS-1$

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

			elements.put(Package_1000,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getPackage());

			elements.put(Comment_2001,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getComment());

			elements.put(Class_2002,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getClass_());

			elements.put(Attribute_3001,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getAttribute());

			elements.put(Method_3002,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getMethod());

			elements.put(ImportedPackage_3003,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getImportedPackage());

			elements.put(Generalization_4001,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getGeneralization());

			elements.put(Generalization_4002,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getGeneralization());

			elements.put(Realization_4003,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getRealization());

			elements.put(Realization_4004,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getRealization());

			elements.put(Association_4005,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getAssociation());

			elements.put(Association_4006,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getAssociation());

			elements.put(Aggregation_4007,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getAggregation());

			elements.put(Aggregation_4008,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getAggregation());

			elements.put(Composition_4009,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getComposition());

			elements.put(Composition_4010,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getComposition());

			elements.put(Dependency_4011,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getDependency());

			elements.put(Dependency_4012,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getDependency());

			elements.put(Link_4013,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getLink());

			elements.put(Link_4014,
					KragsteinPackage.KragsteinPackagePackage.eINSTANCE
							.getLink());
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
			KNOWN_ELEMENT_TYPES.add(Comment_2001);
			KNOWN_ELEMENT_TYPES.add(Class_2002);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(Method_3002);
			KNOWN_ELEMENT_TYPES.add(ImportedPackage_3003);
			KNOWN_ELEMENT_TYPES.add(Generalization_4001);
			KNOWN_ELEMENT_TYPES.add(Generalization_4002);
			KNOWN_ELEMENT_TYPES.add(Realization_4003);
			KNOWN_ELEMENT_TYPES.add(Realization_4004);
			KNOWN_ELEMENT_TYPES.add(Association_4005);
			KNOWN_ELEMENT_TYPES.add(Association_4006);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4007);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4008);
			KNOWN_ELEMENT_TYPES.add(Composition_4009);
			KNOWN_ELEMENT_TYPES.add(Composition_4010);
			KNOWN_ELEMENT_TYPES.add(Dependency_4011);
			KNOWN_ELEMENT_TYPES.add(Dependency_4012);
			KNOWN_ELEMENT_TYPES.add(Link_4013);
			KNOWN_ELEMENT_TYPES.add(Link_4014);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return Package_1000;
		case KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID:
			return Comment_2001;
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return Class_2002;
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return Method_3002;
		case KragsteinPackage.diagram.edit.parts.ImportedPackageEditPart.VISUAL_ID:
			return ImportedPackage_3003;
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return Generalization_4001;
		case KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID:
			return Generalization_4002;
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return Realization_4003;
		case KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID:
			return Realization_4004;
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return Association_4005;
		case KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return Association_4006;
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return Aggregation_4007;
		case KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID:
			return Aggregation_4008;
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return Composition_4009;
		case KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID:
			return Composition_4010;
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return Dependency_4011;
		case KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return Dependency_4012;
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_4013;
		case KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return Link_4014;
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
			return KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
