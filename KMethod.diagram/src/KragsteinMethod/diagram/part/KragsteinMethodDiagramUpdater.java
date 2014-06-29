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
		case KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID:
			return getBranchBranchRouteCompartment_7001SemanticChildren(view);
		case KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID:
			return getRouteRouteIconCompartment_7002SemanticChildren(view);
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
		{
			KragsteinMethod.Header childElement = modelElement.getHeader();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getBranch().iterator(); it.hasNext();) {
			KragsteinMethod.Branch childElement = (KragsteinMethod.Branch) it
					.next();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID) {
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
	public static List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getBranchBranchRouteCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinMethod.Branch modelElement = (KragsteinMethod.Branch) containerView
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoute().iterator(); it.hasNext();) {
			KragsteinMethod.Route childElement = (KragsteinMethod.Route) it
					.next();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID) {
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
	public static List<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> getRouteRouteIconCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		KragsteinMethod.Route modelElement = (KragsteinMethod.Route) containerView
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIcon().iterator(); it.hasNext();) {
			KragsteinMethod.Icon childElement = (KragsteinMethod.Icon) it
					.next();
			int visualID = KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getNodeVisualID(view, childElement);
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
			if (visualID == KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID) {
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
			if (visualID == KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID) {
				result.add(new KragsteinMethod.diagram.part.KragsteinMethodNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID) {
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
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedLinks(
			View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_1000ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return getHeader_2001ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return getBranch_2002ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return getRoute_3001ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3002ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_3003ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_3004ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3005ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_3006ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_3007ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_3008ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_3009ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_3010ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_3011ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3012ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3013ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return getLoopArrow_3014ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return getEmptyConnector_3015ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_3016ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return getBranchConnection_4001ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return getBranchConnection_4002ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return getIconConnection_4003ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return getIconConnection_4004ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getCaseConnection_4005ContainedLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getCaseConnection_4006ContainedLinks(view);
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
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return getHeader_2001IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return getBranch_2002IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return getRoute_3001IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3002IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_3003IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_3004IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3005IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_3006IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_3007IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_3008IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_3009IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_3010IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_3011IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3012IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3013IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return getLoopArrow_3014IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return getEmptyConnector_3015IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_3016IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return getBranchConnection_4001IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return getBranchConnection_4002IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return getIconConnection_4003IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return getIconConnection_4004IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getCaseConnection_4005IncomingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getCaseConnection_4006IncomingLinks(view);
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
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return getHeader_2001OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return getBranch_2002OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return getRoute_3001OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3002OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_3003OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_3004OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3005OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_3006OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_3007OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_3008OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_3009OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_3010OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_3011OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3012OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3013OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return getLoopArrow_3014OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return getEmptyConnector_3015OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_3016OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return getBranchConnection_4001OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return getBranchConnection_4002OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return getIconConnection_4003OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return getIconConnection_4004OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getCaseConnection_4005OutgoingLinks(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getCaseConnection_4006OutgoingLinks(view);
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
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeader_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranch_2002ContainedLinks(
			View view) {
		KragsteinMethod.Branch modelElement = (KragsteinMethod.Branch) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_BranchConnection_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BranchConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getRoute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_3002ContainedLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_3003ContainedLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_3004ContainedLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3005ContainedLinks(
			View view) {
		KragsteinMethod.Case modelElement = (KragsteinMethod.Case) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CaseConnection_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_CaseConnection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_3006ContainedLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_3007ContainedLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_3008ContainedLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_3009ContainedLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_3010ContainedLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_3011ContainedLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_3012ContainedLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_3013ContainedLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getLoopArrow_3014ContainedLinks(
			View view) {
		KragsteinMethod.LoopArrow modelElement = (KragsteinMethod.LoopArrow) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEmptyConnector_3015ContainedLinks(
			View view) {
		KragsteinMethod.EmptyConnector modelElement = (KragsteinMethod.EmptyConnector) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_3016ContainedLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeader_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranch_2002IncomingLinks(
			View view) {
		KragsteinMethod.Branch modelElement = (KragsteinMethod.Branch) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_BranchConnection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BranchConnection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getRoute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_3002IncomingLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_3003IncomingLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_3004IncomingLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3005IncomingLinks(
			View view) {
		KragsteinMethod.Case modelElement = (KragsteinMethod.Case) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CaseConnection_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CaseConnection_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_3006IncomingLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_3007IncomingLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_3008IncomingLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_3009IncomingLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_3010IncomingLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_3011IncomingLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_3012IncomingLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_3013IncomingLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getLoopArrow_3014IncomingLinks(
			View view) {
		KragsteinMethod.LoopArrow modelElement = (KragsteinMethod.LoopArrow) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEmptyConnector_3015IncomingLinks(
			View view) {
		KragsteinMethod.EmptyConnector modelElement = (KragsteinMethod.EmptyConnector) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_3016IncomingLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IconConnection_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeader_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranch_2002OutgoingLinks(
			View view) {
		KragsteinMethod.Branch modelElement = (KragsteinMethod.Branch) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_BranchConnection_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BranchConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getRoute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAction_3002OutgoingLinks(
			View view) {
		KragsteinMethod.Action modelElement = (KragsteinMethod.Action) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getQuestion_3003OutgoingLinks(
			View view) {
		KragsteinMethod.Question modelElement = (KragsteinMethod.Question) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getChoice_3004OutgoingLinks(
			View view) {
		KragsteinMethod.Choice modelElement = (KragsteinMethod.Choice) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCase_3005OutgoingLinks(
			View view) {
		KragsteinMethod.Case modelElement = (KragsteinMethod.Case) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CaseConnection_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_CaseConnection_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getHeadline_3006OutgoingLinks(
			View view) {
		KragsteinMethod.Headline modelElement = (KragsteinMethod.Headline) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getAdress_3007OutgoingLinks(
			View view) {
		KragsteinMethod.Adress modelElement = (KragsteinMethod.Adress) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInsertion_3008OutgoingLinks(
			View view) {
		KragsteinMethod.Insertion modelElement = (KragsteinMethod.Insertion) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getShelf_3009OutgoingLinks(
			View view) {
		KragsteinMethod.Shelf modelElement = (KragsteinMethod.Shelf) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBeginLoop_3010OutgoingLinks(
			View view) {
		KragsteinMethod.BeginLoop modelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEndLoop_3011OutgoingLinks(
			View view) {
		KragsteinMethod.EndLoop modelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutput_3012OutgoingLinks(
			View view) {
		KragsteinMethod.Output modelElement = (KragsteinMethod.Output) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getInput_3013OutgoingLinks(
			View view) {
		KragsteinMethod.Input modelElement = (KragsteinMethod.Input) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getLoopArrow_3014OutgoingLinks(
			View view) {
		KragsteinMethod.LoopArrow modelElement = (KragsteinMethod.LoopArrow) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEmptyConnector_3015OutgoingLinks(
			View view) {
		KragsteinMethod.EmptyConnector modelElement = (KragsteinMethod.EmptyConnector) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getEnd_3016OutgoingLinks(
			View view) {
		KragsteinMethod.End modelElement = (KragsteinMethod.End) view
				.getElement();
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IconConnection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getBranchConnection_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIconConnection_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getCaseConnection_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_BranchConnection_4001(
			KragsteinMethod.Branch container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.BranchConnection link = container
				.getSourceBranchConnection();
		if (KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Branch dst = link.getTarget();
		KragsteinMethod.Branch src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001,
				KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_BranchConnection_4002(
			KragsteinMethod.Branch container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.BranchConnection link = container
				.getTargetBranchConnection();
		if (KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Branch dst = link.getTarget();
		KragsteinMethod.Branch src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4002,
				KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_IconConnection_4003(
			KragsteinMethod.Icon container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.IconConnection link = container
				.getSourceIconConnection();
		if (KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Icon dst = link.getTarget();
		KragsteinMethod.Icon src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003,
				KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_IconConnection_4004(
			KragsteinMethod.Icon container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.IconConnection link = container
				.getTargetIconConnection();
		if (KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Icon dst = link.getTarget();
		KragsteinMethod.Icon src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4004,
				KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_CaseConnection_4005(
			KragsteinMethod.Case container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.CaseConnection link = container
				.getSourceCaseConnection();
		if (KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Case dst = link.getTarget();
		KragsteinMethod.Case src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005,
				KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getContainedTypeModelFacetLinks_CaseConnection_4006(
			KragsteinMethod.Case container) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.CaseConnection link = container
				.getTargetCaseConnection();
		if (KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Case dst = link.getTarget();
		KragsteinMethod.Case src = link.getSource();
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006,
				KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_BranchConnection_4001(
			KragsteinMethod.Branch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getBranchConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.BranchConnection) {
				continue;
			}
			KragsteinMethod.BranchConnection link = (KragsteinMethod.BranchConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Branch src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001,
					KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_BranchConnection_4002(
			KragsteinMethod.Branch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getBranchConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.BranchConnection) {
				continue;
			}
			KragsteinMethod.BranchConnection link = (KragsteinMethod.BranchConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Branch src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4002,
					KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_IconConnection_4003(
			KragsteinMethod.Icon target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getIconConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.IconConnection) {
				continue;
			}
			KragsteinMethod.IconConnection link = (KragsteinMethod.IconConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Icon src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003,
					KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_IconConnection_4004(
			KragsteinMethod.Icon target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getIconConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.IconConnection) {
				continue;
			}
			KragsteinMethod.IconConnection link = (KragsteinMethod.IconConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Icon src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4004,
					KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_CaseConnection_4005(
			KragsteinMethod.Case target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getCaseConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.CaseConnection) {
				continue;
			}
			KragsteinMethod.CaseConnection link = (KragsteinMethod.CaseConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Case src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005,
					KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getIncomingTypeModelFacetLinks_CaseConnection_4006(
			KragsteinMethod.Case target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getCaseConnection_Target()
					|| false == setting.getEObject() instanceof KragsteinMethod.CaseConnection) {
				continue;
			}
			KragsteinMethod.CaseConnection link = (KragsteinMethod.CaseConnection) setting
					.getEObject();
			if (KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			KragsteinMethod.Case src = link.getSource();
			result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
					src,
					target,
					link,
					KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006,
					KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_BranchConnection_4001(
			KragsteinMethod.Branch source) {
		KragsteinMethod.Branch container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinMethod.Branch) {
				container = (KragsteinMethod.Branch) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.BranchConnection link = container
				.getSourceBranchConnection();
		if (KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Branch dst = link.getTarget();
		KragsteinMethod.Branch src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001,
				KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_BranchConnection_4002(
			KragsteinMethod.Branch source) {
		KragsteinMethod.Branch container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinMethod.Branch) {
				container = (KragsteinMethod.Branch) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.BranchConnection link = container
				.getTargetBranchConnection();
		if (KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Branch dst = link.getTarget();
		KragsteinMethod.Branch src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4002,
				KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_IconConnection_4003(
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
		KragsteinMethod.IconConnection link = container
				.getSourceIconConnection();
		if (KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Icon dst = link.getTarget();
		KragsteinMethod.Icon src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003,
				KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_IconConnection_4004(
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
		KragsteinMethod.IconConnection link = container
				.getTargetIconConnection();
		if (KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Icon dst = link.getTarget();
		KragsteinMethod.Icon src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4004,
				KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_CaseConnection_4005(
			KragsteinMethod.Case source) {
		KragsteinMethod.Case container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinMethod.Case) {
				container = (KragsteinMethod.Case) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.CaseConnection link = container
				.getSourceCaseConnection();
		if (KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Case dst = link.getTarget();
		KragsteinMethod.Case src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005,
				KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> getOutgoingTypeModelFacetLinks_CaseConnection_4006(
			KragsteinMethod.Case source) {
		KragsteinMethod.Case container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof KragsteinMethod.Case) {
				container = (KragsteinMethod.Case) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor> result = new LinkedList<KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor>();
		KragsteinMethod.CaseConnection link = container
				.getTargetCaseConnection();
		if (KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID != KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		KragsteinMethod.Case dst = link.getTarget();
		KragsteinMethod.Case src = link.getSource();
		if (src != source) {
			return result;
		}
		result.add(new KragsteinMethod.diagram.part.KragsteinMethodLinkDescriptor(
				src,
				dst,
				link,
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006,
				KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
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
