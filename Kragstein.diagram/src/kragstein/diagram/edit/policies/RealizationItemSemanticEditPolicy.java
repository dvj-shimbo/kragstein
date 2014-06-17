package kragstein.diagram.edit.policies;

import kragstein.diagram.providers.KragsteinElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RealizationItemSemanticEditPolicy extends
		KragsteinBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RealizationItemSemanticEditPolicy() {
		super(KragsteinElementTypes.Realization_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
