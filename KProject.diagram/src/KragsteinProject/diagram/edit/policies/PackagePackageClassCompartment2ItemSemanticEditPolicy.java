/*
 * 
 */
package KragsteinProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackagePackageClassCompartment2ItemSemanticEditPolicy
		extends
		KragsteinProject.diagram.edit.policies.KragsteinProjectBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackagePackageClassCompartment2ItemSemanticEditPolicy() {
		super(
				KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Class_3002 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinProject.diagram.edit.commands.ClassCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
