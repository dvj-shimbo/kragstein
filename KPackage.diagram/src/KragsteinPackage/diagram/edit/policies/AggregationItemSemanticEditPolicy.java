/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AggregationItemSemanticEditPolicy
		extends
		KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AggregationItemSemanticEditPolicy() {
		super(
				KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
