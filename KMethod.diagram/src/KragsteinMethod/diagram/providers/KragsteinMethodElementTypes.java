/*
 * 
 */
package KragsteinMethod.diagram.providers;

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
public class KragsteinMethodElementTypes {

	/**
	 * @generated
	 */
	private KragsteinMethodElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Method_1000 = getElementType("KMethod.diagram.Method_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Header_2001 = getElementType("KMethod.diagram.Header_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Branch_2002 = getElementType("KMethod.diagram.Branch_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Route_3001 = getElementType("KMethod.diagram.Route_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Action_3002 = getElementType("KMethod.diagram.Action_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Question_3003 = getElementType("KMethod.diagram.Question_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Choice_3004 = getElementType("KMethod.diagram.Choice_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Case_3005 = getElementType("KMethod.diagram.Case_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Headline_3006 = getElementType("KMethod.diagram.Headline_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Adress_3007 = getElementType("KMethod.diagram.Adress_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Insertion_3008 = getElementType("KMethod.diagram.Insertion_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Shelf_3009 = getElementType("KMethod.diagram.Shelf_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BeginLoop_3010 = getElementType("KMethod.diagram.BeginLoop_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndLoop_3011 = getElementType("KMethod.diagram.EndLoop_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Output_3012 = getElementType("KMethod.diagram.Output_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Input_3013 = getElementType("KMethod.diagram.Input_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoopArrow_3014 = getElementType("KMethod.diagram.LoopArrow_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EmptyConnector_3015 = getElementType("KMethod.diagram.EmptyConnector_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType End_3016 = getElementType("KMethod.diagram.End_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BranchConnection_4001 = getElementType("KMethod.diagram.BranchConnection_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BranchConnection_4002 = getElementType("KMethod.diagram.BranchConnection_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IconConnection_4003 = getElementType("KMethod.diagram.IconConnection_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IconConnection_4004 = getElementType("KMethod.diagram.IconConnection_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaseConnection_4005 = getElementType("KMethod.diagram.CaseConnection_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CaseConnection_4006 = getElementType("KMethod.diagram.CaseConnection_4006"); //$NON-NLS-1$

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

			elements.put(Method_1000,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getMethod());

			elements.put(Header_2001,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getHeader());

			elements.put(Branch_2002,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getBranch());

			elements.put(Route_3001,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getRoute());

			elements.put(Action_3002,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getAction());

			elements.put(Question_3003,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getQuestion());

			elements.put(Choice_3004,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getChoice());

			elements.put(Case_3005,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getCase());

			elements.put(Headline_3006,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getHeadline());

			elements.put(Adress_3007,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getAdress());

			elements.put(Insertion_3008,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getInsertion());

			elements.put(Shelf_3009,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getShelf());

			elements.put(BeginLoop_3010,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getBeginLoop());

			elements.put(EndLoop_3011,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getEndLoop());

			elements.put(Output_3012,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getOutput());

			elements.put(Input_3013,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInput());

			elements.put(LoopArrow_3014,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getLoopArrow());

			elements.put(EmptyConnector_3015,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getEmptyConnector());

			elements.put(End_3016,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEnd());

			elements.put(BranchConnection_4001,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getBranchConnection());

			elements.put(BranchConnection_4002,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getBranchConnection());

			elements.put(IconConnection_4003,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getIconConnection());

			elements.put(IconConnection_4004,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getIconConnection());

			elements.put(CaseConnection_4005,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getCaseConnection());

			elements.put(CaseConnection_4006,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getCaseConnection());
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
			KNOWN_ELEMENT_TYPES.add(Method_1000);
			KNOWN_ELEMENT_TYPES.add(Header_2001);
			KNOWN_ELEMENT_TYPES.add(Branch_2002);
			KNOWN_ELEMENT_TYPES.add(Route_3001);
			KNOWN_ELEMENT_TYPES.add(Action_3002);
			KNOWN_ELEMENT_TYPES.add(Question_3003);
			KNOWN_ELEMENT_TYPES.add(Choice_3004);
			KNOWN_ELEMENT_TYPES.add(Case_3005);
			KNOWN_ELEMENT_TYPES.add(Headline_3006);
			KNOWN_ELEMENT_TYPES.add(Adress_3007);
			KNOWN_ELEMENT_TYPES.add(Insertion_3008);
			KNOWN_ELEMENT_TYPES.add(Shelf_3009);
			KNOWN_ELEMENT_TYPES.add(BeginLoop_3010);
			KNOWN_ELEMENT_TYPES.add(EndLoop_3011);
			KNOWN_ELEMENT_TYPES.add(Output_3012);
			KNOWN_ELEMENT_TYPES.add(Input_3013);
			KNOWN_ELEMENT_TYPES.add(LoopArrow_3014);
			KNOWN_ELEMENT_TYPES.add(EmptyConnector_3015);
			KNOWN_ELEMENT_TYPES.add(End_3016);
			KNOWN_ELEMENT_TYPES.add(BranchConnection_4001);
			KNOWN_ELEMENT_TYPES.add(BranchConnection_4002);
			KNOWN_ELEMENT_TYPES.add(IconConnection_4003);
			KNOWN_ELEMENT_TYPES.add(IconConnection_4004);
			KNOWN_ELEMENT_TYPES.add(CaseConnection_4005);
			KNOWN_ELEMENT_TYPES.add(CaseConnection_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return Method_1000;
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return Header_2001;
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return Branch_2002;
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return Route_3001;
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_3002;
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return Question_3003;
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return Choice_3004;
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return Case_3005;
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return Headline_3006;
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return Adress_3007;
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return Insertion_3008;
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return Shelf_3009;
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return BeginLoop_3010;
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return EndLoop_3011;
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return Output_3012;
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return Input_3013;
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return LoopArrow_3014;
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return EmptyConnector_3015;
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return End_3016;
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return BranchConnection_4001;
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return BranchConnection_4002;
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return IconConnection_4003;
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return IconConnection_4004;
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return CaseConnection_4005;
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return CaseConnection_4006;
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
			return KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
