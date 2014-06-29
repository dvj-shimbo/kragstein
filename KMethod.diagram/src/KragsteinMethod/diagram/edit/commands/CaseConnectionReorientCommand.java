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
public class CaseConnectionReorientCommand extends EditElementCommand {

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
	public CaseConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof KragsteinMethod.CaseConnection) {
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
		if (!(oldEnd instanceof KragsteinMethod.Case && newEnd instanceof KragsteinMethod.Case)) {
			return false;
		}
		KragsteinMethod.Case target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Case)) {
			return false;
		}
		KragsteinMethod.Case container = (KragsteinMethod.Case) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCaseConnection_4005(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof KragsteinMethod.Case && newEnd instanceof KragsteinMethod.Case)) {
			return false;
		}
		KragsteinMethod.Case source = getLink().getSource();
		if (!(getLink().eContainer() instanceof KragsteinMethod.Case)) {
			return false;
		}
		KragsteinMethod.Case container = (KragsteinMethod.Case) getLink()
				.eContainer();
		return KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCaseConnection_4005(container,
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
	protected KragsteinMethod.CaseConnection getLink() {
		return (KragsteinMethod.CaseConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Case getOldSource() {
		return (KragsteinMethod.Case) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Case getNewSource() {
		return (KragsteinMethod.Case) newEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Case getOldTarget() {
		return (KragsteinMethod.Case) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinMethod.Case getNewTarget() {
		return (KragsteinMethod.Case) newEnd;
	}
}
