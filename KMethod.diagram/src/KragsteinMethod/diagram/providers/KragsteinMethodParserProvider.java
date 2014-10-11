/*
 * 
 */
package KragsteinMethod.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class KragsteinMethodParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser titleName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getTitleName_5027Parser() {
		if (titleName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getTitle_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			titleName_5027Parser = parser;
		}
		return titleName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser actionName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getActionName_5015Parser() {
		if (actionName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getAction_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			actionName_5015Parser = parser;
		}
		return actionName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser questionName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getQuestionName_5016Parser() {
		if (questionName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getQuestion_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			questionName_5016Parser = parser;
		}
		return questionName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser choiceName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getChoiceName_5017Parser() {
		if (choiceName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getChoice_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			choiceName_5017Parser = parser;
		}
		return choiceName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser headlineName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getHeadlineName_5018Parser() {
		if (headlineName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getHeadline_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			headlineName_5018Parser = parser;
		}
		return headlineName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser adressTarget_5019Parser;

	/**
	 * @generated
	 */
	private IParser getAdressTarget_5019Parser() {
		if (adressTarget_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getAdress_Target() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			adressTarget_5019Parser = parser;
		}
		return adressTarget_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser insertionName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getInsertionName_5020Parser() {
		if (insertionName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getInsertion_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			insertionName_5020Parser = parser;
		}
		return insertionName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser shelfName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getShelfName_5021Parser() {
		if (shelfName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getShelf_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			shelfName_5021Parser = parser;
		}
		return shelfName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser beginLoopName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getBeginLoopName_5022Parser() {
		if (beginLoopName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getBeginLoop_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			beginLoopName_5022Parser = parser;
		}
		return beginLoopName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser endLoopName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getEndLoopName_5023Parser() {
		if (endLoopName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getEndLoop_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			endLoopName_5023Parser = parser;
		}
		return endLoopName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5024Parser() {
		if (outputName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getOutput_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			outputName_5024Parser = parser;
		}
		return outputName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5025Parser() {
		if (inputName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getInput_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			inputName_5025Parser = parser;
		}
		return inputName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser caseName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCaseName_5003Parser() {
		if (caseName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getCase_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			caseName_5003Parser = parser;
		}
		return caseName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case KragsteinMethod.diagram.edit.parts.TitleNameEditPart.VISUAL_ID:
			return getTitleName_5027Parser();
		case KragsteinMethod.diagram.edit.parts.ActionNameEditPart.VISUAL_ID:
			return getActionName_5015Parser();
		case KragsteinMethod.diagram.edit.parts.QuestionNameEditPart.VISUAL_ID:
			return getQuestionName_5016Parser();
		case KragsteinMethod.diagram.edit.parts.ChoiceNameEditPart.VISUAL_ID:
			return getChoiceName_5017Parser();
		case KragsteinMethod.diagram.edit.parts.HeadlineNameEditPart.VISUAL_ID:
			return getHeadlineName_5018Parser();
		case KragsteinMethod.diagram.edit.parts.AdressTargetEditPart.VISUAL_ID:
			return getAdressTarget_5019Parser();
		case KragsteinMethod.diagram.edit.parts.InsertionNameEditPart.VISUAL_ID:
			return getInsertionName_5020Parser();
		case KragsteinMethod.diagram.edit.parts.ShelfNameEditPart.VISUAL_ID:
			return getShelfName_5021Parser();
		case KragsteinMethod.diagram.edit.parts.BeginLoopNameEditPart.VISUAL_ID:
			return getBeginLoopName_5022Parser();
		case KragsteinMethod.diagram.edit.parts.EndLoopNameEditPart.VISUAL_ID:
			return getEndLoopName_5023Parser();
		case KragsteinMethod.diagram.edit.parts.OutputNameEditPart.VISUAL_ID:
			return getOutputName_5024Parser();
		case KragsteinMethod.diagram.edit.parts.InputNameEditPart.VISUAL_ID:
			return getInputName_5025Parser();
		case KragsteinMethod.diagram.edit.parts.CaseNameEditPart.VISUAL_ID:
			return getCaseName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(KragsteinMethod.diagram.part.KragsteinMethodVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
