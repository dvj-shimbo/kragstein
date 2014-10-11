/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

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
public class ClassItemSemanticEditPolicy
		extends
		KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassItemSemanticEditPolicy() {
		super(
				KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
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
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(incomingLink) == KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(outgoingLink) == KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID) {
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
			switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(node)) {
			case KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getVisualID(cnode)) {
					case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getVisualID(cnode)) {
					case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case KragsteinPackage.diagram.edit.parts.ClassClassImportedClassCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getVisualID(cnode)) {
					case KragsteinPackage.diagram.edit.parts.ImportedClassEditPart.VISUAL_ID:
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
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.GeneralizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.RealizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AggregationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.CompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.LinkCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.GeneralizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.RealizationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AssociationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AggregationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.CompositionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.DependencyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.LinkCreateCommand(
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
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.GeneralizationReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.RealizationReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AssociationReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AggregationReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.CompositionReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.DependencyReorientCommand(
					req));
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.LinkReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
