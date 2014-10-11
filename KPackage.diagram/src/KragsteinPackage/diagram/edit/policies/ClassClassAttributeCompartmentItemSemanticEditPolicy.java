/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassClassAttributeCompartmentItemSemanticEditPolicy
		extends
		KragsteinPackage.diagram.edit.policies.KragsteinPackageBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassClassAttributeCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Attribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinPackage.diagram.edit.commands.AttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
