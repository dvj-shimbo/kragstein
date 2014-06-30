/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CaseItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaseItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(node)) {
			case KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getVisualID(cnode)) {
					case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnection2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnection2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnectionReorientCommand(
					req));
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseConnection2ReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
