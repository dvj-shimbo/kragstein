/*
 * 
 */
package KragsteinMethod.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class KragsteinMethodNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public KragsteinMethodNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem> result = new ArrayList<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup group = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem navigatorItem = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {

		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup links = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Method_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Branch_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Branch_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchBranchRouteCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Action_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Action_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Question_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Question_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionQuestionRouteCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Choice_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Choice_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceChoiceCaseCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Headline_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Headline_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Adress_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Adress_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Insertion_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Insertion_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Shelf_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Shelf_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BeginLoop_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BeginLoop_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_EndLoop_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_EndLoop_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Output_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Output_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Input_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Input_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_LoopArrow_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_LoopArrow_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_End_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_End_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup incominglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Case_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup outgoinglinks = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_Case_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseCaseRouteCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.RouteRouteIconCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup target = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BranchConnection_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup source = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BranchConnection_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup target = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BranchConnection_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup source = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_BranchConnection_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup target = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_IconConnection_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup source = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_IconConnection_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup target = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_CaseConnection_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup source = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_CaseConnection_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID: {
			LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem> result = new LinkedList<KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup target = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_CaseConnection_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup source = new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup(
					KragsteinMethod.diagram.part.Messages.NavigatorGroupName_CaseConnection_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
							.getType(KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem> result = new ArrayList<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem) {
			KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem abstractNavigatorItem = (KragsteinMethod.diagram.navigator.KragsteinMethodAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
