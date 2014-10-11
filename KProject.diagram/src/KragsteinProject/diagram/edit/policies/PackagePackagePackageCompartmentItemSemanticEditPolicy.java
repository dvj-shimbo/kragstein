/*
 * 
 */
package KragsteinProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackagePackagePackageCompartmentItemSemanticEditPolicy
		extends
		KragsteinProject.diagram.edit.policies.KragsteinProjectBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackagePackagePackageCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_3001 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinProject.diagram.edit.commands.Package2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
