/*
 * 
 */
package KragsteinPackage.diagram.providers;

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
public class KragsteinPackageParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser commentName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCommentName_5001Parser() {
		if (commentName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getComment_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			commentName_5001Parser = parser;
		}
		return commentName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser className_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5004Parser() {
		if (className_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getClass_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			className_5004Parser = parser;
		}
		return className_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5002Parser() {
		if (attributeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getAttribute_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			attributeName_5002Parser = parser;
		}
		return attributeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser methodName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMethodName_5003Parser() {
		if (methodName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getMethod_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			methodName_5003Parser = parser;
		}
		return methodName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationName_6001Parser() {
		if (generalizationName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			generalizationName_6001Parser = parser;
		}
		return generalizationName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser realizationName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getRealizationName_6002Parser() {
		if (realizationName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			realizationName_6002Parser = parser;
		}
		return realizationName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser associationName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getAssociationName_6003Parser() {
		if (associationName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			associationName_6003Parser = parser;
		}
		return associationName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationName_6004Parser() {
		if (aggregationName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			aggregationName_6004Parser = parser;
		}
		return aggregationName_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositionName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getCompositionName_6005Parser() {
		if (compositionName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			compositionName_6005Parser = parser;
		}
		return compositionName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_6006Parser() {
		if (dependencyName_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.KragsteinPackagePackage.eINSTANCE
					.getRelationship_Name() };
			KragsteinPackage.diagram.parsers.MessageFormatParser parser = new KragsteinPackage.diagram.parsers.MessageFormatParser(
					features);
			dependencyName_6006Parser = parser;
		}
		return dependencyName_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case KragsteinPackage.diagram.edit.parts.CommentNameEditPart.VISUAL_ID:
			return getCommentName_5001Parser();
		case KragsteinPackage.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5004Parser();
		case KragsteinPackage.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5002Parser();
		case KragsteinPackage.diagram.edit.parts.MethodNameEditPart.VISUAL_ID:
			return getMethodName_5003Parser();
		case KragsteinPackage.diagram.edit.parts.GeneralizationNameEditPart.VISUAL_ID:
			return getGeneralizationName_6001Parser();
		case KragsteinPackage.diagram.edit.parts.RealizationNameEditPart.VISUAL_ID:
			return getRealizationName_6002Parser();
		case KragsteinPackage.diagram.edit.parts.AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case KragsteinPackage.diagram.edit.parts.AggregationNameEditPart.VISUAL_ID:
			return getAggregationName_6004Parser();
		case KragsteinPackage.diagram.edit.parts.CompositionNameEditPart.VISUAL_ID:
			return getCompositionName_6005Parser();
		case KragsteinPackage.diagram.edit.parts.DependencyNameEditPart.VISUAL_ID:
			return getDependencyName_6006Parser();
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
			return getParser(KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(KragsteinPackage.diagram.part.KragsteinPackageVisualIDRegistry
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
			if (KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
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
