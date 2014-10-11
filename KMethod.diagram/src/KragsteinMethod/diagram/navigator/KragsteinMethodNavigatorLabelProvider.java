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
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Action", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Question", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Choice", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Headline", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Adress", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Insertion", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Shelf", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?BeginLoop", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?EndLoop", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Output", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Input", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?End", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_2014); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?FormalParameters", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.FormalParameters_2015); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?KragsteinMethod.ecore?Title", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?KragsteinMethod.ecore?Case", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018); //$NON-NLS-1$
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?KragsteinMethod.ecore?Connection", KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006); //$NON-NLS-1$
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
		case KragsteinMethod.diagram.edit.parts.ActionEditPart.VISUAL_ID:
			return getAction_2003Text(view);
		case KragsteinMethod.diagram.edit.parts.QuestionEditPart.VISUAL_ID:
			return getQuestion_2004Text(view);
		case KragsteinMethod.diagram.edit.parts.ChoiceEditPart.VISUAL_ID:
			return getChoice_2005Text(view);
		case KragsteinMethod.diagram.edit.parts.HeadlineEditPart.VISUAL_ID:
			return getHeadline_2006Text(view);
		case KragsteinMethod.diagram.edit.parts.AdressEditPart.VISUAL_ID:
			return getAdress_2007Text(view);
		case KragsteinMethod.diagram.edit.parts.InsertionEditPart.VISUAL_ID:
			return getInsertion_2008Text(view);
		case KragsteinMethod.diagram.edit.parts.ShelfEditPart.VISUAL_ID:
			return getShelf_2009Text(view);
		case KragsteinMethod.diagram.edit.parts.BeginLoopEditPart.VISUAL_ID:
			return getBeginLoop_2010Text(view);
		case KragsteinMethod.diagram.edit.parts.EndLoopEditPart.VISUAL_ID:
			return getEndLoop_2011Text(view);
		case KragsteinMethod.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_2012Text(view);
		case KragsteinMethod.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_2013Text(view);
		case KragsteinMethod.diagram.edit.parts.EndEditPart.VISUAL_ID:
			return getEnd_2014Text(view);
		case KragsteinMethod.diagram.edit.parts.FormalParametersEditPart.VISUAL_ID:
			return getFormalParameters_2015Text(view);
		case KragsteinMethod.diagram.edit.parts.TitleEditPart.VISUAL_ID:
			return getTitle_2016Text(view);
		case KragsteinMethod.diagram.edit.parts.CaseEditPart.VISUAL_ID:
			return getCase_3018Text(view);
		case KragsteinMethod.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMethod_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAction_2003Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.ActionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestion_2004Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.QuestionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoice_2005Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.ChoiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHeadline_2006Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.HeadlineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdress_2007Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.AdressTargetEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInsertion_2008Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.InsertionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getShelf_2009Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.ShelfNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBeginLoop_2010Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.BeginLoopNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndLoop_2011Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.EndLoopNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_2012Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_2013Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnd_2014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFormalParameters_2015Text(View view) {
		KragsteinMethod.FormalParameters domainModelElement = (KragsteinMethod.FormalParameters) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getType();
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTitle_2016Text(View view) {
		IParser parser = KragsteinMethod.diagram.providers.KragsteinMethodParserProvider
				.getParser(
						KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016,
						view.getElement() != null ? view.getElement() : view,
						KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
								.getType(KragsteinMethod.diagram.edit.parts.TitleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getConnection_4006Text(View view) {
		return ""; //$NON-NLS-1$
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
