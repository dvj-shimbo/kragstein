/*
 * 
 */
package KragsteinMethod.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class KragsteinMethodNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem
				&& !isOwnView(((KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup group = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) element;
			return KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem navigatorItem = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?KragsteinMethod.ecore?Method", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Method_1000); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Header", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Branch", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Route", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Action", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Question", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Choice", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Headline", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Adress", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Insertion", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Shelf", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?BeginLoop", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?EndLoop", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Output", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Input", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?LoopArrow", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?EmptyConnector", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EmptyConnector_3015); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?End", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Route", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3017); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Case", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Route", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3019); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?BranchConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?BranchConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4002); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?IconConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?IconConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4004); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?CaseConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?CaseConnection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
						.isKnownElementType(elementType)) {
			image = KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup group = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) {
			KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem navigatorItem = (KragsteinMethod.diagram.navigator.KragsteinMethodNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinMethod.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_1000Text(view);
		case KragsteinMethod.diagram.edit.parts.HeaderEditPart.VISUAL_ID:
			return getHeader_2001Text(view);
		case KragsteinMethod.diagram.edit.parts.BranchEditPart.VISUAL_ID:
			return getBranch_2002Text(view);
		case KragsteinMethod.diagram.edit.parts.RouteEditPart.VISUAL_ID:
			return getRoute_3001Text(view);
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_3002Text(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_3003Text(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_3004Text(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_3006Text(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_3007Text(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_3008Text(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_3009Text(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_3010Text(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_3011Text(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3012Text(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3013Text(view);
		case KragsteinMethod.diagram.edit.parts.LoopArrowEditPart.VISUAL_ID:
			return getLoopArrow_3014Text(view);
		case KragsteinMethod.diagram.edit.parts.EmptyConnectorEditPart.VISUAL_ID:
			return getEmptyConnector_3015Text(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_3016Text(view);
		case KragsteinMethod.diagram.edit.parts.Route2EditPart.VISUAL_ID:
			return getRoute_3017Text(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3018Text(view);
		case KragsteinMethod.diagram.edit.parts.Route3EditPart.VISUAL_ID:
			return getRoute_3019Text(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnectionEditPart.VISUAL_ID:
			return getBranchConnection_4001Text(view);
		case KragsteinMethod.diagram.edit.parts.BranchConnection2EditPart.VISUAL_ID:
			return getBranchConnection_4002Text(view);
		case KragsteinMethod.diagram.edit.parts.IconConnectionEditPart.VISUAL_ID:
			return getIconConnection_4003Text(view);
		case KragsteinMethod.diagram.edit.parts.IconConnection2EditPart.VISUAL_ID:
			return getIconConnection_4004Text(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnectionEditPart.VISUAL_ID:
			return getCaseConnection_4005Text(view);
		case KragsteinMethod.diagram.edit.parts.CaseConnection2EditPart.VISUAL_ID:
			return getCaseConnection_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMethod_1000Text(View view) {
		KragsteinMethod.Method domainModelElement = (KragsteinMethod.Method) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHeader_2001Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.HeaderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBranch_2002Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.BranchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoute_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_3002Text(View view) {
		KragsteinMethod.Action domainModelElement = (KragsteinMethod.Action) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestion_3003Text(View view) {
		KragsteinMethod.Question domainModelElement = (KragsteinMethod.Question) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_3004Text(View view) {
		KragsteinMethod.Choice domainModelElement = (KragsteinMethod.Choice) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHeadline_3006Text(View view) {
		KragsteinMethod.Headline domainModelElement = (KragsteinMethod.Headline) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdress_3007Text(View view) {
		KragsteinMethod.Adress domainModelElement = (KragsteinMethod.Adress) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInsertion_3008Text(View view) {
		KragsteinMethod.Insertion domainModelElement = (KragsteinMethod.Insertion) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getShelf_3009Text(View view) {
		KragsteinMethod.Shelf domainModelElement = (KragsteinMethod.Shelf) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBeginLoop_3010Text(View view) {
		KragsteinMethod.BeginLoop domainModelElement = (KragsteinMethod.BeginLoop) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndLoop_3011Text(View view) {
		KragsteinMethod.EndLoop domainModelElement = (KragsteinMethod.EndLoop) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3012Text(View view) {
		KragsteinMethod.Output domainModelElement = (KragsteinMethod.Output) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3013Text(View view) {
		KragsteinMethod.Input domainModelElement = (KragsteinMethod.Input) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoopArrow_3014Text(View view) {
		KragsteinMethod.LoopArrow domainModelElement = (KragsteinMethod.LoopArrow) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmptyConnector_3015Text(View view) {
		KragsteinMethod.EmptyConnector domainModelElement = (KragsteinMethod.EmptyConnector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnd_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRoute_3017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCase_3018Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.CaseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoute_3019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBranchConnection_4001Text(View view) {
		KragsteinMethod.BranchConnection domainModelElement = (KragsteinMethod.BranchConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetBranch();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBranchConnection_4002Text(View view) {
		KragsteinMethod.BranchConnection domainModelElement = (KragsteinMethod.BranchConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetBranch();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIconConnection_4003Text(View view) {
		KragsteinMethod.IconConnection domainModelElement = (KragsteinMethod.IconConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetIcon();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIconConnection_4004Text(View view) {
		KragsteinMethod.IconConnection domainModelElement = (KragsteinMethod.IconConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetIcon();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaseConnection_4005Text(View view) {
		KragsteinMethod.CaseConnection domainModelElement = (KragsteinMethod.CaseConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetCase();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCaseConnection_4006Text(View view) {
		KragsteinMethod.CaseConnection domainModelElement = (KragsteinMethod.CaseConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetCase();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return KragsteinMethod.diagram.edit.parts.MethodEditPart.MODEL_ID
				.equals(KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
						.getModelID(view));
	}

}
