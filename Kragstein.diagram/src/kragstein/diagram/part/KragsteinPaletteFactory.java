package kragstein.diagram.part;

import java.util.Collections;

import kragstein.diagram.providers.KragsteinElementTypes;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

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
		paletteContainer.add(createDrakonDiagram14CreationTool());
		paletteContainer.add(createHeader15CreationTool());
		paletteContainer.add(createFormalParameters16CreationTool());
		paletteContainer.add(createBranch17CreationTool());
		paletteContainer.add(createBranchConnection18CreationTool());
		paletteContainer.add(createRoute19CreationTool());
		paletteContainer.add(createRightComment20CreationTool());
		paletteContainer.add(createLeftComment21CreationTool());
		paletteContainer.add(createValencePoint22CreationTool());
		paletteContainer.add(createIconConnection23CreationTool());
		paletteContainer.add(createAction24CreationTool());
		paletteContainer.add(createQuestion25CreationTool());
		paletteContainer.add(createChoice26CreationTool());
		paletteContainer.add(createCase27CreationTool());
		paletteContainer.add(createCaseConnection28CreationTool());
		paletteContainer.add(createHeadline29CreationTool());
		paletteContainer.add(createAdress30CreationTool());
		paletteContainer.add(createInsertion31CreationTool());
		paletteContainer.add(createShelf32CreationTool());
		paletteContainer.add(createBeginLoop33CreationTool());
		paletteContainer.add(createEndLoop34CreationTool());
		paletteContainer.add(createOutput35CreationTool());
		paletteContainer.add(createInput36CreationTool());
		paletteContainer.add(createLoopArrow37CreationTool());
		paletteContainer.add(createEmptyConnector38CreationTool());
		paletteContainer.add(createEnd39CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Package1CreationTool_title,
				Messages.Package1CreationTool_desc, null, null) {
		};
		entry.setId("createPackage1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Generalization2CreationTool_title,
				Messages.Generalization2CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Generalization_4005));
		entry.setId("createGeneralization2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Generalization_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Realization3CreationTool_title,
				Messages.Realization3CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Realization_4004));
		entry.setId("createRealization3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Realization_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Association4CreationTool_title,
				Messages.Association4CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Association_4003));
		entry.setId("createAssociation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Association_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Aggregation5CreationTool_title,
				Messages.Aggregation5CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Aggregation_4006));
		entry.setId("createAggregation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Aggregation_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposition6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Composition6CreationTool_title,
				Messages.Composition6CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Composition_4001));
		entry.setId("createComposition6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Composition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Dependency7CreationTool_title,
				Messages.Dependency7CreationTool_desc,
				Collections
						.singletonList(KragsteinElementTypes.Dependency_4002));
		entry.setId("createDependency7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Dependency_4002));
		entry.setLargeIcon(entry.getSmallIcon());
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Class9CreationTool_title,
				Messages.Class9CreationTool_desc,
				Collections.singletonList(KragsteinElementTypes.Class_2001));
		entry.setId("createClass9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinElementTypes
				.getImageDescriptor(KragsteinElementTypes.Class_2001));
		entry.setLargeIcon(entry.getSmallIcon());
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
	private ToolEntry createDrakonDiagram14CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.DrakonDiagram14CreationTool_title,
				Messages.DrakonDiagram14CreationTool_desc, null, null) {
		};
		entry.setId("createDrakonDiagram14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeader15CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Header15CreationTool_title,
				Messages.Header15CreationTool_desc, null, null) {
		};
		entry.setId("createHeader15CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormalParameters16CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.FormalParameters16CreationTool_title,
				Messages.FormalParameters16CreationTool_desc, null, null) {
		};
		entry.setId("createFormalParameters16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranch17CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Branch17CreationTool_title,
				Messages.Branch17CreationTool_desc, null, null) {
		};
		entry.setId("createBranch17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranchConnection18CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.BranchConnection18CreationTool_title,
				Messages.BranchConnection18CreationTool_desc, null, null) {
		};
		entry.setId("createBranchConnection18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoute19CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Route19CreationTool_title,
				Messages.Route19CreationTool_desc, null, null) {
		};
		entry.setId("createRoute19CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRightComment20CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RightComment20CreationTool_title,
				Messages.RightComment20CreationTool_desc, null, null) {
		};
		entry.setId("createRightComment20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeftComment21CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.LeftComment21CreationTool_title,
				Messages.LeftComment21CreationTool_desc, null, null) {
		};
		entry.setId("createLeftComment21CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValencePoint22CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ValencePoint22CreationTool_title,
				Messages.ValencePoint22CreationTool_desc, null, null) {
		};
		entry.setId("createValencePoint22CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIconConnection23CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.IconConnection23CreationTool_title,
				Messages.IconConnection23CreationTool_desc, null, null) {
		};
		entry.setId("createIconConnection23CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction24CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Action24CreationTool_title,
				Messages.Action24CreationTool_desc, null, null) {
		};
		entry.setId("createAction24CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestion25CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Question25CreationTool_title,
				Messages.Question25CreationTool_desc, null, null) {
		};
		entry.setId("createQuestion25CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice26CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Choice26CreationTool_title,
				Messages.Choice26CreationTool_desc, null, null) {
		};
		entry.setId("createChoice26CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCase27CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Case27CreationTool_title,
				Messages.Case27CreationTool_desc, null, null) {
		};
		entry.setId("createCase27CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaseConnection28CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CaseConnection28CreationTool_title,
				Messages.CaseConnection28CreationTool_desc, null, null) {
		};
		entry.setId("createCaseConnection28CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeadline29CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Headline29CreationTool_title,
				Messages.Headline29CreationTool_desc, null, null) {
		};
		entry.setId("createHeadline29CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdress30CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Adress30CreationTool_title,
				Messages.Adress30CreationTool_desc, null, null) {
		};
		entry.setId("createAdress30CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertion31CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Insertion31CreationTool_title,
				Messages.Insertion31CreationTool_desc, null, null) {
		};
		entry.setId("createInsertion31CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShelf32CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Shelf32CreationTool_title,
				Messages.Shelf32CreationTool_desc, null, null) {
		};
		entry.setId("createShelf32CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBeginLoop33CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.BeginLoop33CreationTool_title,
				Messages.BeginLoop33CreationTool_desc, null, null) {
		};
		entry.setId("createBeginLoop33CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndLoop34CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.EndLoop34CreationTool_title,
				Messages.EndLoop34CreationTool_desc, null, null) {
		};
		entry.setId("createEndLoop34CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput35CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Output35CreationTool_title,
				Messages.Output35CreationTool_desc, null, null) {
		};
		entry.setId("createOutput35CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput36CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Input36CreationTool_title,
				Messages.Input36CreationTool_desc, null, null) {
		};
		entry.setId("createInput36CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoopArrow37CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.LoopArrow37CreationTool_title,
				Messages.LoopArrow37CreationTool_desc, null, null) {
		};
		entry.setId("createLoopArrow37CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmptyConnector38CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EmptyConnector38CreationTool_title,
				Messages.EmptyConnector38CreationTool_desc, null, null) {
		};
		entry.setId("createEmptyConnector38CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd39CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.End39CreationTool_title,
				Messages.End39CreationTool_desc, null, null) {
		};
		entry.setId("createEnd39CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
