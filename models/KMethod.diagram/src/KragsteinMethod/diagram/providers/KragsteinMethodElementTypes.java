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
	public static final IElementType Title_2016 = getElementType("KMethod.diagram.Title_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalParameters_2015 = getElementType("KMethod.diagram.FormalParameters_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_2003 = getElementType("KMethod.diagram.Action_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Question_2004 = getElementType("KMethod.diagram.Question_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choice_2005 = getElementType("KMethod.diagram.Choice_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Headline_2006 = getElementType("KMethod.diagram.Headline_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Adress_2007 = getElementType("KMethod.diagram.Adress_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Insertion_2008 = getElementType("KMethod.diagram.Insertion_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Shelf_2009 = getElementType("KMethod.diagram.Shelf_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BeginLoop_2010 = getElementType("KMethod.diagram.BeginLoop_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EndLoop_2011 = getElementType("KMethod.diagram.EndLoop_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_2012 = getElementType("KMethod.diagram.Output_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_2013 = getElementType("KMethod.diagram.Input_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType End_2014 = getElementType("KMethod.diagram.End_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Case_3018 = getElementType("KMethod.diagram.Case_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_4006 = getElementType("KMethod.diagram.Connection_4006"); //$NON-NLS-1$

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

			elements.put(Title_2016,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getTitle());

			elements.put(FormalParameters_2015,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getFormalParameters());

			elements.put(Action_2003,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getAction());

			elements.put(Question_2004,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getQuestion());

			elements.put(Choice_2005,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getChoice());

			elements.put(Headline_2006,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getHeadline());

			elements.put(Adress_2007,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getAdress());

			elements.put(Insertion_2008,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getInsertion());

			elements.put(Shelf_2009,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getShelf());

			elements.put(BeginLoop_2010,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getBeginLoop());

			elements.put(EndLoop_2011,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getEndLoop());

			elements.put(Output_2012,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getOutput());

			elements.put(Input_2013,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getInput());

			elements.put(End_2014,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getEnd());

			elements.put(Case_3018,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE.getCase());

			elements.put(Connection_4006,
					KragsteinMethod.KragsteinMethodPackage.eINSTANCE
							.getConnection());
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
			KNOWN_ELEMENT_TYPES.add(Title_2016);
			KNOWN_ELEMENT_TYPES.add(FormalParameters_2015);
			KNOWN_ELEMENT_TYPES.add(Action_2003);
			KNOWN_ELEMENT_TYPES.add(Question_2004);
			KNOWN_ELEMENT_TYPES.add(Choice_2005);
			KNOWN_ELEMENT_TYPES.add(Headline_2006);
			KNOWN_ELEMENT_TYPES.add(Adress_2007);
			KNOWN_ELEMENT_TYPES.add(Insertion_2008);
			KNOWN_ELEMENT_TYPES.add(Shelf_2009);
			KNOWN_ELEMENT_TYPES.add(BeginLoop_2010);
			KNOWN_ELEMENT_TYPES.add(EndLoop_2011);
			KNOWN_ELEMENT_TYPES.add(Output_2012);
			KNOWN_ELEMENT_TYPES.add(Input_2013);
			KNOWN_ELEMENT_TYPES.add(End_2014);
			KNOWN_ELEMENT_TYPES.add(Case_3018);
			KNOWN_ELEMENT_TYPES.add(Connection_4006);
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
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return Title_2016;
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return FormalParameters_2015;
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return Action_2003;
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return Question_2004;
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return Choice_2005;
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return Headline_2006;
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return Adress_2007;
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return Insertion_2008;
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return Shelf_2009;
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return BeginLoop_2010;
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return EndLoop_2011;
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return Output_2012;
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return Input_2013;
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return End_2014;
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return Case_3018;
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return Connection_4006;
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
