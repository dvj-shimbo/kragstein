/*
 * 
 */
package KragsteinPackage.diagram.navigator;

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
public class KragsteinPackageNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem
				&& !isOwnView(((KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) element)
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
		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup group = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) element;
			return KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem navigatorItem = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) element;
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
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?KragsteinPackage.ecore?Package", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Package_1000); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinPackage.ecore?Note", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinPackage.ecore?Class", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinPackage.ecore?Attribute", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Attribute_3001); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinPackage.ecore?Method", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Method_3002); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.ImportedPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinPackage.ecore?ImportedPackage", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.ImportedPackage_3003); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Generalization", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Generalization", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Realization", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Realization", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Association", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Association", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Aggregation", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Aggregation", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Composition", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Composition", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Dependency", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Dependency", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Link", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013); //$NON-NLS-1$
		case KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinPackage.ecore?Link", KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
						.isKnownElementType(elementType)) {
			image = KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
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
		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup group = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) {
			KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem navigatorItem = (KragsteinPackage.diagram.navigator.KragsteinPackageNavigatorItem) element;
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
		switch (KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
				.getVisualID(view)) {
		case KragsteinPackage.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case KragsteinPackage.diagram.edit.parts.NoteEditPart.VISUAL_ID:
			return getNote_2001Text(view);
		case KragsteinPackage.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2002Text(view);
		case KragsteinPackage.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case KragsteinPackage.diagram.edit.parts.MethodEditPart.VISUAL_ID:
			return getMethod_3002Text(view);
		case KragsteinPackage.diagram.edit.parts.ImportedPackageEditPart.VISUAL_ID:
			return getImportedPackage_3003Text(view);
		case KragsteinPackage.diagram.edit.parts.GeneralizationEditPart.VISUAL_ID:
			return getGeneralization_4001Text(view);
		case KragsteinPackage.diagram.edit.parts.Generalization2EditPart.VISUAL_ID:
			return getGeneralization_4002Text(view);
		case KragsteinPackage.diagram.edit.parts.RealizationEditPart.VISUAL_ID:
			return getRealization_4003Text(view);
		case KragsteinPackage.diagram.edit.parts.Realization2EditPart.VISUAL_ID:
			return getRealization_4004Text(view);
		case KragsteinPackage.diagram.edit.parts.AssociationEditPart.VISUAL_ID:
			return getAssociation_4005Text(view);
		case KragsteinPackage.diagram.edit.parts.Association2EditPart.VISUAL_ID:
			return getAssociation_4006Text(view);
		case KragsteinPackage.diagram.edit.parts.AggregationEditPart.VISUAL_ID:
			return getAggregation_4007Text(view);
		case KragsteinPackage.diagram.edit.parts.Aggregation2EditPart.VISUAL_ID:
			return getAggregation_4008Text(view);
		case KragsteinPackage.diagram.edit.parts.CompositionEditPart.VISUAL_ID:
			return getComposition_4009Text(view);
		case KragsteinPackage.diagram.edit.parts.Composition2EditPart.VISUAL_ID:
			return getComposition_4010Text(view);
		case KragsteinPackage.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_4011Text(view);
		case KragsteinPackage.diagram.edit.parts.Dependency2EditPart.VISUAL_ID:
			return getDependency_4012Text(view);
		case KragsteinPackage.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4013Text(view);
		case KragsteinPackage.diagram.edit.parts.Link2EditPart.VISUAL_ID:
			return getLink_4014Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		KragsteinPackage.Package domainModelElement = (KragsteinPackage.Package) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLang();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNote_2001Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Note_2001,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.NoteNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2002Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Attribute_3001,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_3002Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Method_3002,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.MethodNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImportedPackage_3003Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.ImportedPackage_3003,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.ImportedPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_4001Text(View view) {
		KragsteinPackage.Generalization domainModelElement = (KragsteinPackage.Generalization) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeneralization_4002Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.GeneralizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealization_4003Text(View view) {
		KragsteinPackage.Realization domainModelElement = (KragsteinPackage.Realization) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRealization_4004Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.RealizationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4005Text(View view) {
		KragsteinPackage.Association domainModelElement = (KragsteinPackage.Association) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociation_4006Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_4007Text(View view) {
		KragsteinPackage.Aggregation domainModelElement = (KragsteinPackage.Aggregation) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAggregation_4008Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.AggregationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposition_4009Text(View view) {
		KragsteinPackage.Composition domainModelElement = (KragsteinPackage.Composition) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComposition_4010Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.CompositionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_4011Text(View view) {
		KragsteinPackage.Dependency domainModelElement = (KragsteinPackage.Dependency) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependency_4012Text(View view) {
		IParser parser = KragsteinPackage.diagram.providers.KragsteinPackageParserProvider
				.getParser(
						KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012,
						view.getElement() != null ? view.getElement() : view,
						KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
								.getType(KragsteinPackage.diagram.edit.parts.DependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4013Text(View view) {
		KragsteinPackage.Link domainModelElement = (KragsteinPackage.Link) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetClass();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_4014Text(View view) {
		KragsteinPackage.Link domainModelElement = (KragsteinPackage.Link) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getTargetClass();
		} else {
			KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4014); //$NON-NLS-1$
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
		return KragsteinPackage.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
						.getModelID(view));
	}

}
