/*
 * 
 */
package KragsteinPackage.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

/**
 * @generated
 */
public class KragsteinPackageBaseItemSemanticEditPolicy extends
		SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected KragsteinPackageBaseItemSemanticEditPolicy(
			IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().setLinkConstraints(
							cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateGeneralization_4001(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistGeneralization_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGeneralization_4002(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistGeneralization_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRealization_4003(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistRealization_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRealization_4004(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistRealization_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAssociation_4005(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistAssociation_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAssociation_4006(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistAssociation_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAggregation_4007(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistAggregation_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAggregation_4008(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistAggregation_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateComposition_4009(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistComposition_4009(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateComposition_4010(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistComposition_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDependency_4011(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistDependency_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDependency_4012(
				KragsteinPackage.Class container,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return canExistDependency_4012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLink_4013(KragsteinPackage.Unit container,
				KragsteinPackage.Unit source, KragsteinPackage.Unit target) {
			return canExistLink_4013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLink_4014(KragsteinPackage.Unit container,
				KragsteinPackage.Unit source, KragsteinPackage.Unit target) {
			return canExistLink_4014(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistGeneralization_4001(
				KragsteinPackage.Class container,
				KragsteinPackage.Generalization linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGeneralization_4002(
				KragsteinPackage.Class container,
				KragsteinPackage.Generalization linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRealization_4003(
				KragsteinPackage.Class container,
				KragsteinPackage.Realization linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRealization_4004(
				KragsteinPackage.Class container,
				KragsteinPackage.Realization linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAssociation_4005(
				KragsteinPackage.Class container,
				KragsteinPackage.Association linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAssociation_4006(
				KragsteinPackage.Class container,
				KragsteinPackage.Association linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAggregation_4007(
				KragsteinPackage.Class container,
				KragsteinPackage.Aggregation linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAggregation_4008(
				KragsteinPackage.Class container,
				KragsteinPackage.Aggregation linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistComposition_4009(
				KragsteinPackage.Class container,
				KragsteinPackage.Composition linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistComposition_4010(
				KragsteinPackage.Class container,
				KragsteinPackage.Composition linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDependency_4011(
				KragsteinPackage.Class container,
				KragsteinPackage.Dependency linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDependency_4012(
				KragsteinPackage.Class container,
				KragsteinPackage.Dependency linkInstance,
				KragsteinPackage.Class source, KragsteinPackage.Class target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLink_4013(KragsteinPackage.Unit container,
				KragsteinPackage.Link linkInstance,
				KragsteinPackage.Unit source, KragsteinPackage.Unit target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLink_4014(KragsteinPackage.Unit container,
				KragsteinPackage.Link linkInstance,
				KragsteinPackage.Unit source, KragsteinPackage.Unit target) {
			return true;
		}
	}

}