package kragstein.diagram.providers;

import kragstein.KragsteinPackage;
import kragstein.diagram.edit.parts.AggregationNameEditPart;
import kragstein.diagram.edit.parts.AssociationNameEditPart;
import kragstein.diagram.edit.parts.ClassNameEditPart;
import kragstein.diagram.edit.parts.CompositionNameEditPart;
import kragstein.diagram.edit.parts.DependencyNameEditPart;
import kragstein.diagram.edit.parts.GeneralizationNameEditPart;
import kragstein.diagram.edit.parts.RealizationNameEditPart;
import kragstein.diagram.parsers.MessageFormatParser;
import kragstein.diagram.part.KragsteinVisualIDRegistry;

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
public class KragsteinParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser className_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5001Parser() {
		if (className_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getClass_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			className_5001Parser = parser;
		}
		return className_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser compositionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getCompositionName_6001Parser() {
		if (compositionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionName_6001Parser = parser;
		}
		return compositionName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyName_6002Parser() {
		if (dependencyName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyName_6002Parser = parser;
		}
		return dependencyName_6002Parser;
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
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			associationName_6003Parser = parser;
		}
		return associationName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser realizationName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getRealizationName_6004Parser() {
		if (realizationName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			realizationName_6004Parser = parser;
		}
		return realizationName_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser generalizationName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getGeneralizationName_6005Parser() {
		if (generalizationName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generalizationName_6005Parser = parser;
		}
		return generalizationName_6005Parser;
	}

	/**
	 * @generated
	 */
	private IParser aggregationName_6006Parser;

	/**
	 * @generated
	 */
	private IParser getAggregationName_6006Parser() {
		if (aggregationName_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { KragsteinPackage.eINSTANCE
					.getRelationship_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationName_6006Parser = parser;
		}
		return aggregationName_6006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClassNameEditPart.VISUAL_ID:
			return getClassName_5001Parser();
		case CompositionNameEditPart.VISUAL_ID:
			return getCompositionName_6001Parser();
		case DependencyNameEditPart.VISUAL_ID:
			return getDependencyName_6002Parser();
		case AssociationNameEditPart.VISUAL_ID:
			return getAssociationName_6003Parser();
		case RealizationNameEditPart.VISUAL_ID:
			return getRealizationName_6004Parser();
		case GeneralizationNameEditPart.VISUAL_ID:
			return getGeneralizationName_6005Parser();
		case AggregationNameEditPart.VISUAL_ID:
			return getAggregationName_6006Parser();
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
			return getParser(KragsteinVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(KragsteinVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (KragsteinElementTypes.getElement(hint) == null) {
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
