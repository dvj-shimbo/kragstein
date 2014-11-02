/*
 * 
 */
package KragsteinMethod.diagram.part;

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
public class KragsteinMethodDiagramUpdater {

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
	public static List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getSemanticChildren(
			View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_1000SemanticChildren(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID:
			return getChoiceChoiceCaseCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getMethod_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinMethod.Method modelElement = (KragsteinMethod.Method) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIcons().iterator(); it.hasNext();) {
			KragsteinMethod.Icon childElement = (KragsteinMethod.Icon) it
					.next();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getChoiceChoiceCaseCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) containerView
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCase().iterator(); it.hasNext();) {
			KragsteinMethod.Case childElement = (KragsteinMethod.Case) it
					.next();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedLinks(
			View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_1000ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return getTitle_2016ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return getFormalParameters_2015ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2003ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_2004ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_2005ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_2006ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_2007ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_2008ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_2009ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_2010ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_2011ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_2012ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_2013ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_2014ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3018ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingLinks(
			View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return getTitle_2016IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return getFormalParameters_2015IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2003IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_2004IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_2005IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_2006IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_2007IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_2008IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_2009IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_2010IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_2011IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_2012IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_2013IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_2014IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3018IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return getTitle_2016OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return getFormalParameters_2015OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2003OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_2004OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_2005OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_2006OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_2007OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_2008OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_2009OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_2010OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_2011OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_2012OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_2013OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_2014OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3018OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getMethod_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getTitle_2016ContainedLinks(
			View view) {
		KragsteinMethod.Title modelElement = (KragsteinMethod.Title) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getFormalParameters_2015ContainedLinks(
			View view) {
		KragsteinMethod.FormalParameters modelElement = (KragsteinMethod.FormalParameters) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_2003ContainedLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_2004ContainedLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_2005ContainedLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_2006ContainedLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_2007ContainedLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_2008ContainedLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_2009ContainedLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_2010ContainedLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_2011ContainedLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_2012ContainedLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_2013ContainedLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_2014ContainedLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getConnection_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getTitle_2016IncomingLinks(
			View view) {
		KragsteinMethod.Title modelElement = (KragsteinMethod.Title) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getFormalParameters_2015IncomingLinks(
			View view) {
		KragsteinMethod.FormalParameters modelElement = (KragsteinMethod.FormalParameters) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_2003IncomingLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_2004IncomingLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_2005IncomingLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_2006IncomingLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_2007IncomingLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_2008IncomingLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_2009IncomingLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_2010IncomingLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_2011IncomingLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_2012IncomingLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_2013IncomingLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_2014IncomingLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getConnection_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getTitle_2016OutgoingLinks(
			View view) {
		KragsteinMethod.Title modelElement = (KragsteinMethod.Title) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getFormalParameters_2015OutgoingLinks(
			View view) {
		KragsteinMethod.FormalParameters modelElement = (KragsteinMethod.FormalParameters) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_2003OutgoingLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_2004OutgoingLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_2005OutgoingLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_2006OutgoingLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_2007OutgoingLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_2008OutgoingLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_2009OutgoingLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_2010OutgoingLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_2011OutgoingLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_2012OutgoingLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_2013OutgoingLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_2014OutgoingLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getConnection_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4006(
			KragsteinMethod.Icon container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		for (Iterator<?> links = container.getTargetConnection().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinMethod.Connection) {
				continue;
			}
			KragsteinMethod.Connection link = (KragsteinMethod.Connection) linkObject;
			if (KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Icon dst = link.getTarget();
			KragsteinMethod.Icon src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					dst,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006,
					KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4006(
			KragsteinMethod.Icon target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.Connection) {
				continue;
			}
			KragsteinMethod.Connection link = (KragsteinMethod.Connection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Icon src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006,
					KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4006(
			KragsteinMethod.Icon source) {
		KragsteinMethod.Icon container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinMethod.Icon) {
				container = (KragsteinMethod.Icon) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		for (Iterator<?> links = container.getTargetConnection().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof KragsteinMethod.Connection) {
				continue;
			}
			KragsteinMethod.Connection link = (KragsteinMethod.Connection) linkObject;
			if (KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Icon dst = link.getTarget();
			KragsteinMethod.Icon src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					dst,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006,
					KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
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
		public List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getSemanticChildren(
				View view) {
			return KragsteinMethodDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedLinks(
				View view) {
			return KragsteinMethodDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingLinks(
				View view) {
			return KragsteinMethodDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingLinks(
				View view) {
			return KragsteinMethodDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
