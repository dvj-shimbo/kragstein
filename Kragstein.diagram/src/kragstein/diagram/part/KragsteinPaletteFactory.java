package kragstein.diagram.part;

import java.util.Collections;
import java.util.List;

import kragstein.diagram.providers.KragsteinElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class KragsteinPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createKragstein1Group());
	}

	/**
	 * Creates "kragstein" palette tool group
	 * @generated
	 */
	private PaletteContainer createKragstein1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Kragstein1Group_title);
		paletteContainer.setId("createKragstein1Group"); //$NON-NLS-1$
		paletteContainer.add(createPackage1CreationTool());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createRealization3CreationTool());
		paletteContainer.add(createAssociation4CreationTool());
		paletteContainer.add(createAggregation5CreationTool());
		paletteContainer.add(createComposition6CreationTool());
		paletteContainer.add(createDependency7CreationTool());
		paletteContainer.add(createComment8CreationTool());
		paletteContainer.add(createClass9CreationTool());
		paletteContainer.add(createImportedPackage10CreationTool());
		paletteContainer.add(createAttribute11CreationTool());
		paletteContainer.add(createMethod12CreationTool());
		paletteContainer.add(createParameter13CreationTool());
		paletteContainer.add(createHeader14CreationTool());
		paletteContainer.add(createFormalParameters15CreationTool());
		paletteContainer.add(createBranch16CreationTool());
		paletteContainer.add(createBranchConnection17CreationTool());
		paletteContainer.add(createRoute18CreationTool());
		paletteContainer.add(createRightComment19CreationTool());
		paletteContainer.add(createLeftComment20CreationTool());
		paletteContainer.add(createValencePoint21CreationTool());
		paletteContainer.add(createIconConnection22CreationTool());
		paletteContainer.add(createAction23CreationTool());
		paletteContainer.add(createQuestion24CreationTool());
		paletteContainer.add(createChoice25CreationTool());
		paletteContainer.add(createCase26CreationTool());
		paletteContainer.add(createCaseConnection27CreationTool());
		paletteContainer.add(createHeadline28CreationTool());
		paletteContainer.add(createAdress29CreationTool());
		paletteContainer.add(createInsertion30CreationTool());
		paletteContainer.add(createShelf31CreationTool());
		paletteContainer.add(createBeginLoop32CreationTool());
		paletteContainer.add(createEndLoop33CreationTool());
		paletteContainer.add(createOutput34CreationTool());
		paletteContainer.add(createInput35CreationTool());
		paletteContainer.add(createLoopArrow36CreationTool());
		paletteContainer.add(createEmptyConnector37CreationTool());
		paletteContainer.add(createEnd38CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Package1CreationTool_title,
				Messages.Package1CreationTool_desc,
				Collections.singletonList(KragsteinElementTypes.Package_2001));
		entry.setId("createPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Package_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Generalization2CreationTool_title,
				Messages.Generalization2CreationTool_desc, null, null) {
		};
		entry.setId("createGeneralization2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Realization3CreationTool_title,
				Messages.Realization3CreationTool_desc, null, null) {
		};
		entry.setId("createRealization3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Association4CreationTool_title,
				Messages.Association4CreationTool_desc, null, null) {
		};
		entry.setId("createAssociation4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Aggregation5CreationTool_title,
				Messages.Aggregation5CreationTool_desc, null, null) {
		};
		entry.setId("createAggregation5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposition6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Composition6CreationTool_title,
				Messages.Composition6CreationTool_desc, null, null) {
		};
		entry.setId("createComposition6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Dependency7CreationTool_title,
				Messages.Dependency7CreationTool_desc, null, null) {
		};
		entry.setId("createDependency7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Comment8CreationTool_title,
				Messages.Comment8CreationTool_desc, null, null) {
		};
		entry.setId("createComment8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Class9CreationTool_title,
				Messages.Class9CreationTool_desc, null, null) {
		};
		entry.setId("createClass9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportedPackage10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ImportedPackage10CreationTool_title,
				Messages.ImportedPackage10CreationTool_desc, null, null) {
		};
		entry.setId("createImportedPackage10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute11CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Attribute11CreationTool_title,
				Messages.Attribute11CreationTool_desc, null, null) {
		};
		entry.setId("createAttribute11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethod12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Method12CreationTool_title,
				Messages.Method12CreationTool_desc, null, null) {
		};
		entry.setId("createMethod12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter13CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Parameter13CreationTool_title,
				Messages.Parameter13CreationTool_desc, null, null) {
		};
		entry.setId("createParameter13CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeader14CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Header14CreationTool_title,
				Messages.Header14CreationTool_desc, null, null) {
		};
		entry.setId("createHeader14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormalParameters15CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FormalParameters15CreationTool_title,
				Messages.FormalParameters15CreationTool_desc, null, null) {
		};
		entry.setId("createFormalParameters15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranch16CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Branch16CreationTool_title,
				Messages.Branch16CreationTool_desc, null, null) {
		};
		entry.setId("createBranch16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranchConnection17CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BranchConnection17CreationTool_title,
				Messages.BranchConnection17CreationTool_desc, null, null) {
		};
		entry.setId("createBranchConnection17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoute18CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Route18CreationTool_title,
				Messages.Route18CreationTool_desc, null, null) {
		};
		entry.setId("createRoute18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRightComment19CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RightComment19CreationTool_title,
				Messages.RightComment19CreationTool_desc, null, null) {
		};
		entry.setId("createRightComment19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeftComment20CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.LeftComment20CreationTool_title,
				Messages.LeftComment20CreationTool_desc, null, null) {
		};
		entry.setId("createLeftComment20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValencePoint21CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ValencePoint21CreationTool_title,
				Messages.ValencePoint21CreationTool_desc, null, null) {
		};
		entry.setId("createValencePoint21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIconConnection22CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IconConnection22CreationTool_title,
				Messages.IconConnection22CreationTool_desc, null, null) {
		};
		entry.setId("createIconConnection22CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction23CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Action23CreationTool_title,
				Messages.Action23CreationTool_desc, null, null) {
		};
		entry.setId("createAction23CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestion24CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Question24CreationTool_title,
				Messages.Question24CreationTool_desc, null, null) {
		};
		entry.setId("createQuestion24CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice25CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Choice25CreationTool_title,
				Messages.Choice25CreationTool_desc, null, null) {
		};
		entry.setId("createChoice25CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCase26CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Case26CreationTool_title,
				Messages.Case26CreationTool_desc, null, null) {
		};
		entry.setId("createCase26CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaseConnection27CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CaseConnection27CreationTool_title,
				Messages.CaseConnection27CreationTool_desc, null, null) {
		};
		entry.setId("createCaseConnection27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeadline28CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Headline28CreationTool_title,
				Messages.Headline28CreationTool_desc, null, null) {
		};
		entry.setId("createHeadline28CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdress29CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Adress29CreationTool_title,
				Messages.Adress29CreationTool_desc, null, null) {
		};
		entry.setId("createAdress29CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertion30CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Insertion30CreationTool_title,
				Messages.Insertion30CreationTool_desc, null, null) {
		};
		entry.setId("createInsertion30CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShelf31CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Shelf31CreationTool_title,
				Messages.Shelf31CreationTool_desc, null, null) {
		};
		entry.setId("createShelf31CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBeginLoop32CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.BeginLoop32CreationTool_title,
				Messages.BeginLoop32CreationTool_desc, null, null) {
		};
		entry.setId("createBeginLoop32CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndLoop33CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.EndLoop33CreationTool_title,
				Messages.EndLoop33CreationTool_desc, null, null) {
		};
		entry.setId("createEndLoop33CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput34CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Output34CreationTool_title,
				Messages.Output34CreationTool_desc, null, null) {
		};
		entry.setId("createOutput34CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput35CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Input35CreationTool_title,
				Messages.Input35CreationTool_desc, null, null) {
		};
		entry.setId("createInput35CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoopArrow36CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.LoopArrow36CreationTool_title,
				Messages.LoopArrow36CreationTool_desc, null, null) {
		};
		entry.setId("createLoopArrow36CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmptyConnector37CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EmptyConnector37CreationTool_title,
				Messages.EmptyConnector37CreationTool_desc, null, null) {
		};
		entry.setId("createEmptyConnector37CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd38CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.End38CreationTool_title,
				Messages.End38CreationTool_desc, null, null) {
		};
		entry.setId("createEnd38CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
