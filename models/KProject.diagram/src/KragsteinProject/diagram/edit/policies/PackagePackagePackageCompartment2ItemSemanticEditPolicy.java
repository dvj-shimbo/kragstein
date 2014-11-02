/*
 * 
 */
package KragsteinProject.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class PackagePackagePackageCompartment2ItemSemanticEditPolicy
		extends
		KragsteinProject.diagram.edit.policies.KragsteinProjectBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PackagePackagePackageCompartment2ItemSemanticEditPolicy() {
		super(
				KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_3001);
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
