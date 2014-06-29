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
public class BranchConnectionReorientCommand extends EditElementCommand {

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
	public BranchConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof KragsteinMethod.BranchConnection) {
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
		if (!(oldEnd instanceof KragsteinMethod.Branch && newEnd instanceof KragsteinMethod.Branch)) {
			return false;
		}
		KragsteinMethod.Branch target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Branch)) {
			return false;
		}
		KragsteinMethod.Branch container = (KragsteinMethod.Branch) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBranchConnection_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof KragsteinMethod.Branch && newEnd instanceof KragsteinMethod.Branch)) {
			return false;
		}
		KragsteinMethod.Branch source = getLink().getSource();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Branch)) {
			return false;
		}
		KragsteinMethod.Branch container = (KragsteinMethod.Branch) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBranchConnection_4001(container,
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
	protected KragsteinMethod.BranchConnection getLink() {
		return (KragsteinMethod.BranchConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Branch getOldSource() {
		return (KragsteinMethod.Branch) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Branch getNewSource() {
		return (KragsteinMethod.Branch) newEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Branch getOldTarget() {
		return (KragsteinMethod.Branch) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Branch getNewTarget() {
		return (KragsteinMethod.Branch) newEnd;
	}
}
