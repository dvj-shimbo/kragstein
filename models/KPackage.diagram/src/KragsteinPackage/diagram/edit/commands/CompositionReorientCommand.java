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
public class CompositionReorientCommand extends EditElementCommand {

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
	public CompositionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof KragsteinPackage.Composition) {
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
		if (!(oldEnd instanceof KragsteinPackage.Class && newEnd instanceof KragsteinPackage.Class)) {
			return false;
		}
		KragsteinPackage.Class target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof KragsteinPackage.Class)) {
			return false;
		}
		KragsteinPackage.Class container = (KragsteinPackage.Class) getLink()
				.eContainer();
		return KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistComposition_4009(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof KragsteinPackage.Class && newEnd instanceof KragsteinPackage.Class)) {
			return false;
		}
		KragsteinPackage.Class source = getLink().getSource();
		if (!(getLink().eContainer() instanceof KragsteinPackage.Class)) {
			return false;
		}
		KragsteinPackage.Class container = (KragsteinPackage.Class) getLink()
				.eContainer();
		return KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistComposition_4009(container,
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
	protected KragsteinPackage.Composition getLink() {
		return (KragsteinPackage.Composition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Class getOldSource() {
		return (KragsteinPackage.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Class getNewSource() {
		return (KragsteinPackage.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Class getOldTarget() {
		return (KragsteinPackage.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected KragsteinPackage.Class getNewTarget() {
		return (KragsteinPackage.Class) newEnd;
	}
}
