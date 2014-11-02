/*
 * 
 */
package KragsteinProject.diagram.providers;

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
public class KragsteinProjectParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser packageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5001Parser() {
		if (packageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinProject.KragsteinProjectPackage.eINSTANCE
					.getPackage_Name() };
			KragsteinProject.diagram.parsers.MessageFormatParser parser = new KragsteinProject.diagram.parsers.MessageFormatParser(
					features);
			packageName_5001Parser = parser;
		}
		return packageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5002Parser() {
		if (packageName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinProject.KragsteinProjectPackage.eINSTANCE
					.getPackage_Name() };
			KragsteinProject.diagram.parsers.MessageFormatParser parser = new KragsteinProject.diagram.parsers.MessageFormatParser(
					features);
			packageName_5002Parser = parser;
		}
		return packageName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5003Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5003Parser() {
		if (className_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinProject.KragsteinProjectPackage.eINSTANCE
					.getClass_Name() };
			KragsteinProject.diagram.parsers.MessageFormatParser parser = new KragsteinProject.diagram.parsers.MessageFormatParser(
					features);
			className_5003Parser = parser;
		}
		return className_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case KragsteinProject.diagram.edit.parts.PackageNameEditPart.VISUAL_ID:
			return getPackageName_5001Parser();
		case KragsteinProject.diagram.edit.parts.PackageName2EditPart.VISUAL_ID:
			return getPackageName_5002Parser();
		case KragsteinProject.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5003Parser();
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
			return getParser(KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(KragsteinProject.diagram.part.KragsteinProjectVisualIDRegistry
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
			if (KragsteinProject.diagram.providers.KragsteinProjectElementTypes
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
