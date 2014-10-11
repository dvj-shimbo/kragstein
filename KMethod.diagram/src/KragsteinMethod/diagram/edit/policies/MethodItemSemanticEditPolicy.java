/*
 * 
 */
package KragsteinMethod.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class MethodItemSemanticEditPolicy
		extends
		KragsteinMethod.diagram.edit.policies.KragsteinMethodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MethodItemSemanticEditPolicy() {
		super(
				KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Method_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.TitleCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.FormalParameters_2015 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.FormalParametersCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ActionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.QuestionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ChoiceCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.HeadlineCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.AdressCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.InsertionCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.ShelfCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.BeginLoopCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.EndLoopCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.OutputCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.InputCreateCommand(
					req));
		}
		if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_2014 == req
				.getElementType()) {
			return getGEFWrapper(new KragsteinMethod.diagram.edit.commands.EndCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
