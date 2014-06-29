/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class BranchBranchRouteCompartmentItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BranchBranchRouteCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.RouteCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
