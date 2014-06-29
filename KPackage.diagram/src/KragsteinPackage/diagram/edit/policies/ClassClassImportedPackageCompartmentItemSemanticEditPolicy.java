/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassClassImportedPackageCompartmentItemSemanticEditPolicy
		extends
		KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassClassImportedPackageCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.ImportedPackage_3003 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.ImportedPackageCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
