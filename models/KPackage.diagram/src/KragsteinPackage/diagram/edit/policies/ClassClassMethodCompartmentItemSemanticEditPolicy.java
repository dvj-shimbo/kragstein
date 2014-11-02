/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassClassMethodCompartmentItemSemanticEditPolicy
		extends
		KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassClassMethodCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Method_3002 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.MethodCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
