/*
 * 
 */
package KragsteinPackage.diagram.part;

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
public class KragsteinPackagePaletteFactory {

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
				KragsteinPackage.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createClass2CreationTool());
		paletteContainer.add(createComment3CreationTool());
		paletteContainer.add(createImportedPackage4CreationTool());
		paletteContainer.add(createMethod5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				KragsteinPackage.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createAssociation2CreationTool());
		paletteContainer.add(createComposition3CreationTool());
		paletteContainer.add(createDependency4CreationTool());
		paletteContainer.add(createGeneralization5CreationTool());
		paletteContainer.add(createLink6CreationTool());
		paletteContainer.add(createRealization7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinPackage.diagram.part.Messages.Attribute1CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Attribute1CreationTool_desc,
				Collections
						.singletonList(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Attribute_3001));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinPackage.diagram.part.Messages.Class2CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Class2CreationTool_desc,
				Collections
						.singletonList(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002));
		entry.setId("createClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Class_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinPackage.diagram.part.Messages.Comment3CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Comment3CreationTool_desc,
				Collections
						.singletonList(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001));
		entry.setId("createComment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Comment_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImportedPackage4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinPackage.diagram.part.Messages.ImportedPackage4CreationTool_title,
				KragsteinPackage.diagram.part.Messages.ImportedPackage4CreationTool_desc,
				Collections
						.singletonList(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.ImportedPackage_3003));
		entry.setId("createImportedPackage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.ImportedPackage_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethod5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinPackage.diagram.part.Messages.Method5CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Method5CreationTool_desc,
				Collections
						.singletonList(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Method_3002));
		entry.setId("createMethod5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Method_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregation1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4008);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Aggregation1CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Aggregation1CreationTool_desc,
				types);
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Aggregation_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4006);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Association2CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Association2CreationTool_desc,
				types);
		entry.setId("createAssociation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Association_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposition3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4010);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Composition3CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Composition3CreationTool_desc,
				types);
		entry.setId("createComposition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Composition_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4012);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Dependency4CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Dependency4CreationTool_desc,
				types);
		entry.setId("createDependency4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Dependency_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4002);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Generalization5CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Generalization5CreationTool_desc,
				types);
		entry.setId("createGeneralization5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Generalization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4014);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Link6CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Link6CreationTool_desc,
				types);
		entry.setId("createLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Link_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRealization7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003);
		types.add(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4004);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				KragsteinPackage.diagram.part.Messages.Realization7CreationTool_title,
				KragsteinPackage.diagram.part.Messages.Realization7CreationTool_desc,
				types);
		entry.setId("createRealization7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes
				.getImageDescriptor(KragsteinPackage.diagram.providers.KragsteinPackageElementTypes.Realization_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
