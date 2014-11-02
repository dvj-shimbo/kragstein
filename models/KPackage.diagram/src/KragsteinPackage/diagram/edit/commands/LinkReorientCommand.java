/*
 * 
 */
package KragsteinPackage.diagram.edit.commands;

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
public class LinkReorientCommand extends EditElementCommand {

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
	public LinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof KragsteinPackage.Link) {
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
		if (!(oldEnd instanceof KragsteinPackage.Unit && newEnd instanceof KragsteinPackage.Unit)) {
			return false;
		}
		KragsteinPackage.Unit target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof KragsteinPackage.Unit)) {
			return false;
		}
		KragsteinPackage.Unit container = (KragsteinPackage.Unit) getLink()
				.eContainer();
		return KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLink_4013(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof KragsteinPackage.Unit && newEnd instanceof KragsteinPackage.Unit)) {
			return false;
		}
		KragsteinPackage.Unit source = getLink().getSource();
		if (!(getLink().eContainer() instanceof KragsteinPackage.Unit)) {
			return false;
		}
		KragsteinPackage.Unit container = (KragsteinPackage.Unit) getLink()
				.eContainer();
		return KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLink_4013(container, getLink(),
						source, getNewTarget());
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
	protected KragsteinPackage.Link getLink() {
		return (KragsteinPackage.Link) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Unit getOldSource() {
		return (KragsteinPackage.Unit) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Unit getNewSource() {
		return (KragsteinPackage.Unit) newEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Unit getOldTarget() {
		return (KragsteinPackage.Unit) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Unit getNewTarget() {
		return (KragsteinPackage.Unit) newEnd;
	}
}
