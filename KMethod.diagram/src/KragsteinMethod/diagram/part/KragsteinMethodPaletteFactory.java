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
		paletteContainer.add(createEnd7CreationTool());
		paletteContainer.add(createEndLoop8CreationTool());
		paletteContainer.add(createHeader9CreationTool());
		paletteContainer.add(createHeadline10CreationTool());
		paletteContainer.add(createInput11CreationTool());
		paletteContainer.add(createInsertion12CreationTool());
		paletteContainer.add(createLoopArrow13CreationTool());
		paletteContainer.add(createOutput14CreationTool());
		paletteContainer.add(createQuestion15CreationTool());
		paletteContainer.add(createRoute16CreationTool());
		paletteContainer.add(createShelf17CreationTool());
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
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018));
		entry.setId("createCase5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018));
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
	private ToolEntry createEnd7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.End7CreationTool_title,
				KragsteinMethod.diagram.part.Messages.End7CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016));
		entry.setId("createEnd7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndLoop8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.EndLoop8CreationTool_title,
				KragsteinMethod.diagram.part.Messages.EndLoop8CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011));
		entry.setId("createEndLoop8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeader9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Header9CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Header9CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001));
		entry.setId("createHeader9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Header_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeadline10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Headline10CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Headline10CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006));
		entry.setId("createHeadline10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Input11CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Input11CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013));
		entry.setId("createInput11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertion12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Insertion12CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Insertion12CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008));
		entry.setId("createInsertion12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoopArrow13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.LoopArrow13CreationTool_title,
				KragsteinMethod.diagram.part.Messages.LoopArrow13CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014));
		entry.setId("createLoopArrow13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.LoopArrow_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Output14CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Output14CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012));
		entry.setId("createOutput14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestion15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Question15CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Question15CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003));
		entry.setId("createQuestion15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoute16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3017);
		types.add(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Route16CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Route16CreationTool_desc,
				types);
		entry.setId("createRoute16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Route_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShelf17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Shelf17CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Shelf17CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_3009));
		entry.setId("createShelf17CreationTool"); //$NON-NLS-1$
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
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinMethod.diagram.part.Messages.IconConnection3CreationTool_title,
				KragsteinMethod.diagram.part.Messages.IconConnection3CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003));
		entry.setId("createIconConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.IconConnection_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
