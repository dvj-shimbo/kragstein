/*
 * 
 */
package KragsteinMethod.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof KragsteinMethod.Connection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof KragsteinMethod.Icon && newEnd instanceof KragsteinMethod.Icon)) {
			return false;
		}
		KragsteinMethod.Icon target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Icon)) {
			return false;
		}
		KragsteinMethod.Icon container = (KragsteinMethod.Icon) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4006(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof KragsteinMethod.Icon && newEnd instanceof KragsteinMethod.Icon)) {
			return false;
		}
		KragsteinMethod.Icon source = getLink().getSource();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Icon)) {
			return false;
		}
		KragsteinMethod.Icon container = (KragsteinMethod.Icon) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4006(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Connection getLink() {
		return (KragsteinMethod.Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Icon getOldSource() {
		return (KragsteinMethod.Icon) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Icon getNewSource() {
		return (KragsteinMethod.Icon) newEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Icon getOldTarget() {
		return (KragsteinMethod.Icon) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Icon getNewTarget() {
		return (KragsteinMethod.Icon) newEnd;
	}
}
