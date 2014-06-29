/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class CaseConnectionItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CaseConnectionItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
