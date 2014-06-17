package kragstein.diagram.edit.policies;

import java.util.Iterator;

import kragstein.diagram.edit.commands.AggregationCreateCommand;
import kragstein.diagram.edit.commands.AggregationReorientCommand;
import kragstein.diagram.edit.commands.AssociationCreateCommand;
import kragstein.diagram.edit.commands.AssociationReorientCommand;
import kragstein.diagram.edit.commands.CompositionCreateCommand;
import kragstein.diagram.edit.commands.CompositionReorientCommand;
import kragstein.diagram.edit.commands.DependencyCreateCommand;
import kragstein.diagram.edit.commands.DependencyReorientCommand;
import kragstein.diagram.edit.commands.GeneralizationCreateCommand;
import kragstein.diagram.edit.commands.GeneralizationReorientCommand;
import kragstein.diagram.edit.commands.RealizationCreateCommand;
import kragstein.diagram.edit.commands.RealizationReorientCommand;
import kragstein.diagram.edit.parts.AggregationEditPart;
import kragstein.diagram.edit.parts.AssociationEditPart;
import kragstein.diagram.edit.parts.CompositionEditPart;
import kragstein.diagram.edit.parts.DependencyEditPart;
import kragstein.diagram.edit.parts.GeneralizationEditPart;
import kragstein.diagram.edit.parts.RealizationEditPart;
import kragstein.diagram.part.KragsteinVisualIDRegistry;
import kragstein.diagram.providers.KragsteinElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassItemSemanticEditPolicy extends
		KragsteinBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassItemSemanticEditPolicy() {
		super(KragsteinElementTypes.Class_2001);
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
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == RealizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == DependencyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == AssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == RealizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == GeneralizationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (KragsteinVisualIDRegistry.getVisualID(outgoingLink) == AggregationEditPart.VISUAL_ID) {
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
		if (KragsteinElementTypes.Composition_4001 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Dependency_4002 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Realization_4004 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Generalization_4005 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Aggregation_4006 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (KragsteinElementTypes.Composition_4001 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Dependency_4002 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Association_4003 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Realization_4004 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Generalization_4005 == req.getElementType()) {
			return getGEFWrapper(new GeneralizationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (KragsteinElementTypes.Aggregation_4006 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case RealizationEditPart.VISUAL_ID:
			return getGEFWrapper(new RealizationReorientCommand(req));
		case GeneralizationEditPart.VISUAL_ID:
			return getGEFWrapper(new GeneralizationReorientCommand(req));
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
