/*
 * 
 */
package KragsteinMethod.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class KragsteinMethodPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				KragsteinMethod.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAction1CreationTool());
		paletteContainer.add(createAdress2CreationTool());
		paletteContainer.add(createBeginLoop3CreationTool());
		paletteContainer.add(createBranch4CreationTool());
		paletteContainer.add(createCase5CreationTool());
		paletteContainer.add(createChoice6CreationTool());
		paletteContainer.add(createEmptyConnector7CreationTool());
		paletteContainer.add(createEnd8CreationTool());
		paletteContainer.add(createEndLoop9CreationTool());
		paletteContainer.add(createHeader10CreationTool());
		paletteContainer.add(createHeadline11CreationTool());
		paletteContainer.add(createInput12CreationTool());
		paletteContainer.add(createInsertion13CreationTool());
		paletteContainer.add(createLeftComment14CreationTool());
		paletteContainer.add(createLoopArrow15CreationTool());
		paletteContainer.add(createOutput16CreationTool());
		paletteContainer.add(createQuestion17CreationTool());
		paletteContainer.add(createRightComment18CreationTool());
		paletteContainer.add(createRoute19CreationTool());
		paletteContainer.add(createShelf20CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				KragsteinMethod.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createBranchConnection1CreationTool());
		paletteContainer.add(createCaseConnection2CreationTool());
		paletteContainer.add(createIconConnection3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Action1CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Action1CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002));
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdress2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Adress2CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Adress2CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007));
		entry.setId("createAdress2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBeginLoop3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.BeginLoop3CreationTool_title,
				KragsteinMethod.diagram.part.Messages.BeginLoop3CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010));
		entry.setId("createBeginLoop3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranch4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Branch4CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Branch4CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002));
		entry.setId("createBranch4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Branch_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCase5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Case5CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Case5CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3005));
		entry.setId("createCase5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Choice6CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Choice6CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004));
		entry.setId("createChoice6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmptyConnector7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.EmptyConnector7CreationTool_title,
				KragsteinMethod.diagram.part.Messages.EmptyConnector7CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EmptyConnector_3015));
		entry.setId("createEmptyConnector7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EmptyConnector_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.End8CreationTool_title,
				KragsteinMethod.diagram.part.Messages.End8CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016));
		entry.setId("createEnd8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndLoop9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.EndLoop9CreationTool_title,
				KragsteinMethod.diagram.part.Messages.EndLoop9CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011));
		entry.setId("createEndLoop9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeader10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Header10CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Header10CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001));
		entry.setId("createHeader10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeadline11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Headline11CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Headline11CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006));
		entry.setId("createHeadline11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Input12CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Input12CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013));
		entry.setId("createInput12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertion13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Insertion13CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Insertion13CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008));
		entry.setId("createInsertion13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLeftComment14CreationTool() {
		ToolEntry entry = new ToolEntry(
				KragsteinMethod.diagram.part.Messages.LeftComment14CreationTool_title,
				KragsteinMethod.diagram.part.Messages.LeftComment14CreationTool_desc,
				null, null) {
		};
		entry.setId("createLeftComment14CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoopArrow15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.LoopArrow15CreationTool_title,
				KragsteinMethod.diagram.part.Messages.LoopArrow15CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014));
		entry.setId("createLoopArrow15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Output16CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Output16CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012));
		entry.setId("createOutput16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestion17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Question17CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Question17CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003));
		entry.setId("createQuestion17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRightComment18CreationTool() {
		ToolEntry entry = new ToolEntry(
				KragsteinMethod.diagram.part.Messages.RightComment18CreationTool_title,
				KragsteinMethod.diagram.part.Messages.RightComment18CreationTool_desc,
				null, null) {
		};
		entry.setId("createRightComment18CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoute19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Route19CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Route19CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001));
		entry.setId("createRoute19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShelf20CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Shelf20CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Shelf20CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009));
		entry.setId("createShelf20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBranchConnection1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4002);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinMethod.diagram.part.Messages.BranchConnection1CreationTool_title,
				KragsteinMethod.diagram.part.Messages.BranchConnection1CreationTool_desc,
				types);
		entry.setId("createBranchConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BranchConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCaseConnection2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4006);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinMethod.diagram.part.Messages.CaseConnection2CreationTool_title,
				KragsteinMethod.diagram.part.Messages.CaseConnection2CreationTool_desc,
				types);
		entry.setId("createCaseConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.CaseConnection_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIconConnection3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4004);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinMethod.diagram.part.Messages.IconConnection3CreationTool_title,
				KragsteinMethod.diagram.part.Messages.IconConnection3CreationTool_desc,
				types);
		entry.setId("createIconConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
