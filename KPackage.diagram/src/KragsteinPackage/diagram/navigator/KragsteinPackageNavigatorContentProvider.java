/*
 * 
 */
package KragsteinPackage.diagram.navigator;

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
public class KragsteinPackageNavigatorContentProvider implements
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
	public KragsteinPackageNavigatorContentProvider() {
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
			ArrayList<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem> result = new ArrayList<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem>();
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
							KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup group = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem navigatorItem = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) parentElement;
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
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {

		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup links = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Package_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup incominglinks = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Comment_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup outgoinglinks = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Comment_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Node sv = (Node) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup incominglinks = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Class_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup outgoinglinks = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Class_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassClassAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassClassMethodCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Generalization_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Generalization_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Generalization_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Generalization_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Realization_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Realization_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Realization_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Realization_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Association_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Association_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Association_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Association_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Aggregation_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Aggregation_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Aggregation_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Aggregation_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Composition_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Composition_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Composition_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Composition_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Dependency_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Dependency_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Dependency_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Dependency_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Link_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Link_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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

		case KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID: {
			LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem> result = new LinkedList<KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup target = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Link_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup source = new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup(
					KragsteinPackage.diagram.part.Messages.NavigatorGroupName_Link_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.CommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
							.getType(KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID));
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
		return KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem> result = new ArrayList<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem> getForeignShortcuts(
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
		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem) {
			KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem abstractNavigatorItem = (KragsteinPackage.diagram.navigator.KragsteinPackageAbstractNavigatorItem) element;
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
