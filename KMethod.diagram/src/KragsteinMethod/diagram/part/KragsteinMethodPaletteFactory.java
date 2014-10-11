/*
 * 
 */
package KragsteinMethod.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createCase4CreationTool());
		paletteContainer.add(createChoice5CreationTool());
		paletteContainer.add(createEnd6CreationTool());
		paletteContainer.add(createEndLoop7CreationTool());
		paletteContainer.add(createFormalParameters8CreationTool());
		paletteContainer.add(createHeadline9CreationTool());
		paletteContainer.add(createInput10CreationTool());
		paletteContainer.add(createInsertion11CreationTool());
		paletteContainer.add(createOutput12CreationTool());
		paletteContainer.add(createQuestion13CreationTool());
		paletteContainer.add(createShelf14CreationTool());
		paletteContainer.add(createTitle15CreationTool());
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
		paletteContainer.add(createConnection1CreationTool());
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
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003));
		entry.setId("createAction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Action_2003));
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
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007));
		entry.setId("createAdress2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Adress_2007));
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
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010));
		entry.setId("createBeginLoop3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.BeginLoop_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCase4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Case4CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Case4CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018));
		entry.setId("createCase4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Case_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Choice5CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Choice5CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005));
		entry.setId("createChoice5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Choice_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.End6CreationTool_title,
				KragsteinMethod.diagram.part.Messages.End6CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_2014));
		entry.setId("createEnd6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.End_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndLoop7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.EndLoop7CreationTool_title,
				KragsteinMethod.diagram.part.Messages.EndLoop7CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011));
		entry.setId("createEndLoop7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.EndLoop_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFormalParameters8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.FormalParameters8CreationTool_title,
				KragsteinMethod.diagram.part.Messages.FormalParameters8CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.FormalParameters_2015));
		entry.setId("createFormalParameters8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.FormalParameters_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeadline9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Headline9CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Headline9CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006));
		entry.setId("createHeadline9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Headline_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Input10CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Input10CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013));
		entry.setId("createInput10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Input_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInsertion11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Insertion11CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Insertion11CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008));
		entry.setId("createInsertion11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Insertion_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Output12CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Output12CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012));
		entry.setId("createOutput12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Output_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQuestion13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Question13CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Question13CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004));
		entry.setId("createQuestion13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Question_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShelf14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Shelf14CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Shelf14CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009));
		entry.setId("createShelf14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Shelf_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTitle15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinMethod.diagram.part.Messages.Title15CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Title15CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016));
		entry.setId("createTitle15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Title_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinMethod.diagram.part.Messages.Connection1CreationTool_title,
				KragsteinMethod.diagram.part.Messages.Connection1CreationTool_desc,
				Collections
						.singletonList(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006));
		entry.setId("createConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes
				.getImageDescriptor(KragsteinMethod.diagram.providers.KragsteinMethodElementTypes.Connection_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
