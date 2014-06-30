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
	private IParser headerName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getHeaderName_5001Parser() {
		if (headerName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getHeader_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			headerName_5001Parser = parser;
		}
		return headerName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser branchName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getBranchName_5002Parser() {
		if (branchName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinMethod.KragsteinMethodPackage.eINSTANCE
					.getBranch_Name() };
			KragsteinMethod.diagram.parsers.MessageFormatParser parser = new KragsteinMethod.diagram.parsers.MessageFormatParser(
					features);
			branchName_5002Parser = parser;
		}
		return branchName_5002Parser;
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
		case KragsteinMethod.diagram.edit.parts.HeaderNameEditPart.VISUAL_ID:
			return getHeaderName_5001Parser();
		case KragsteinMethod.diagram.edit.parts.BranchNameEditPart.VISUAL_ID:
			return getBranchName_5002Parser();
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
