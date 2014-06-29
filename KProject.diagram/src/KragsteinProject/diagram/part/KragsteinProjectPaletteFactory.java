/*
 * 
 */
package KragsteinProject.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class KragsteinProjectPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				KragsteinProject.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createPackage1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				KragsteinProject.diagram.part.Messages.Package1CreationTool_title,
				KragsteinProject.diagram.part.Messages.Package1CreationTool_desc,
				Collections
						.singletonList(KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_2001));
		entry.setId("createPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(KragsteinProject.diagram.providers.KragsteinProjectElementTypes
				.getImageDescriptor(KragsteinProject.diagram.providers.KragsteinProjectElementTypes.Package_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
