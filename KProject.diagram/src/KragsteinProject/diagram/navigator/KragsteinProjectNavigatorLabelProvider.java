/*
 * 
 */
package KragsteinProject.diagram.navigator;

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
public class KragsteinProjectNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem
				&& !isOwnView(((KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) element)
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
		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup) {
			KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup group = (KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup) element;
			return KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) {
			KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem navigatorItem = (KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) element;
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
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?KragsteinProject.ecore?Project", KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Project_1000); //$NON-NLS-1$
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinProject.ecore?Package", KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_2001); //$NON-NLS-1$
		case KragsteinProject.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinProject.ecore?Package", KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_3001); //$NON-NLS-1$
		case KragsteinProject.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinProject.ecore?Class", KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Class_3002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& KragsteinProject.diagram.providers.KragsteinProjectElementTypes
						.isKnownElementType(elementType)) {
			image = KragsteinProject.diagram.providers.KragsteinProjectElementTypes
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
		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup) {
			KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup group = (KragsteinProject.diagram.navigator.KragsteinProjectNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) {
			KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem navigatorItem = (KragsteinProject.diagram.navigator.KragsteinProjectNavigatorItem) element;
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
		switch (KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinProject.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_1000Text(view);
		case KragsteinProject.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_2001Text(view);
		case KragsteinProject.diagram.edit.parts.Package2EditPart.VISUAL_ID:
			return getPackage_3001Text(view);
		case KragsteinProject.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProject_1000Text(View view) {
		KragsteinProject.Project domainModelElement = (KragsteinProject.Project) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLang();
		} else {
			KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_2001Text(View view) {
		IParser parser = KragsteinProject.diagram.providers.KragsteinProjectParserProvider
				.getParser(
						KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_2001,
						view.getElement() != null ? view.getElement() : view,
						KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
								.getType(KragsteinProject.diagram.edit.parts.PackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_3001Text(View view) {
		IParser parser = KragsteinProject.diagram.providers.KragsteinProjectParserProvider
				.getParser(
						KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_3001,
						view.getElement() != null ? view.getElement() : view,
						KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
								.getType(KragsteinProject.diagram.edit.parts.PackageName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_3002Text(View view) {
		IParser parser = KragsteinProject.diagram.providers.KragsteinProjectParserProvider
				.getParser(
						KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Class_3002,
						view.getElement() != null ? view.getElement() : view,
						KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
								.getType(KragsteinProject.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
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
		return KragsteinProject.diagram.edit.parts.ProjectEditPart.MODEL_ID
				.equals(KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
						.getModelID(view));
	}

}
