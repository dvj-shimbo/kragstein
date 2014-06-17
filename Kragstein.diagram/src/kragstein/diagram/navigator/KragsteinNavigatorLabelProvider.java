package kragstein.diagram.navigator;

import kragstein.Package;
import kragstein.diagram.edit.parts.AggregationEditPart;
import kragstein.diagram.edit.parts.AggregationNameEditPart;
import kragstein.diagram.edit.parts.AssociationEditPart;
import kragstein.diagram.edit.parts.AssociationNameEditPart;
import kragstein.diagram.edit.parts.ClassEditPart;
import kragstein.diagram.edit.parts.ClassNameEditPart;
import kragstein.diagram.edit.parts.CompositionEditPart;
import kragstein.diagram.edit.parts.CompositionNameEditPart;
import kragstein.diagram.edit.parts.DependencyEditPart;
import kragstein.diagram.edit.parts.DependencyNameEditPart;
import kragstein.diagram.edit.parts.GeneralizationEditPart;
import kragstein.diagram.edit.parts.GeneralizationNameEditPart;
import kragstein.diagram.edit.parts.PackageEditPart;
import kragstein.diagram.edit.parts.RealizationEditPart;
import kragstein.diagram.edit.parts.RealizationNameEditPart;
import kragstein.diagram.part.KragsteinDiagramEditorPlugin;
import kragstein.diagram.part.KragsteinVisualIDRegistry;
import kragstein.diagram.providers.KragsteinElementTypes;
import kragstein.diagram.providers.KragsteinParserProvider;

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
public class KragsteinNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		KragsteinDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		KragsteinDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof KragsteinNavigatorItem
				&& !isOwnView(((KragsteinNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof KragsteinNavigatorGroup) {
			KragsteinNavigatorGroup group = (KragsteinNavigatorGroup) element;
			return KragsteinDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof KragsteinNavigatorItem) {
			KragsteinNavigatorItem navigatorItem = (KragsteinNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///kragstein.ecore?Package", KragsteinElementTypes.Package_1000); //$NON-NLS-1$
		case ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///kragstein.ecore?Class", KragsteinElementTypes.Class_2001); //$NON-NLS-1$
		case CompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Composition", KragsteinElementTypes.Composition_4001); //$NON-NLS-1$
		case DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Dependency", KragsteinElementTypes.Dependency_4002); //$NON-NLS-1$
		case AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Association", KragsteinElementTypes.Association_4003); //$NON-NLS-1$
		case RealizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Realization", KragsteinElementTypes.Realization_4004); //$NON-NLS-1$
		case GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Generalization", KragsteinElementTypes.Generalization_4005); //$NON-NLS-1$
		case AggregationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///kragstein.ecore?Aggregation", KragsteinElementTypes.Aggregation_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = KragsteinDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& KragsteinElementTypes.isKnownElementType(elementType)) {
			image = KragsteinElementTypes.getImage(elementType);
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
		if (element instanceof KragsteinNavigatorGroup) {
			KragsteinNavigatorGroup group = (KragsteinNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof KragsteinNavigatorItem) {
			KragsteinNavigatorItem navigatorItem = (KragsteinNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
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
		switch (KragsteinVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001Text(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_4002Text(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_4003Text(view);
		case RealizationEditPart.VISUAL_ID:
			return getRealization_4004Text(view);
		case GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4005Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		Package domainModelElement = (Package) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2001Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Class_2001,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry.getType(ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposition_4001Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Composition_4001,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(CompositionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_4002Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Dependency_4002,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(DependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4003Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Association_4003,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealization_4004Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Realization_4004,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(RealizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_4005Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Generalization_4005,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(GeneralizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_4006Text(View view) {
		IParser parser = KragsteinParserProvider.getParser(
				KragsteinElementTypes.Aggregation_4006,
				view.getElement() != null ? view.getElement() : view,
				KragsteinVisualIDRegistry
						.getType(AggregationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
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
		return PackageEditPart.MODEL_ID.equals(KragsteinVisualIDRegistry
				.getModelID(view));
	}

}
