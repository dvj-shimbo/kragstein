/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RouteRouteIconCompartmentItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RouteRouteIconCompartmentItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ActionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.QuestionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ChoiceCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.HeadlineCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.AdressCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.InsertionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ShelfCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.BeginLoopCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.EndLoopCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.OutputCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.InputCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.LoopArrowCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.EndCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
