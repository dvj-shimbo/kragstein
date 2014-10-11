/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ChoiceChoiceCaseCompartmentItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ChoiceChoiceCaseCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.CaseCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
