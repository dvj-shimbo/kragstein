package project.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import project.diagram.providers.ProjectElementTypes;

/**
 * @generated
 */
public class ProjectPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createProject1Group());
	}

	/**
	 * Creates "project" palette tool group
	 * @generated
	 */
	private PaletteContainer createProject1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Project1Group_title);
		paletteContainer.setId("createProject1Group"); //$NON-NLS-1$
		paletteContainer.add(createPackage1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Package1CreationTool_title,
				Messages.Package1CreationTool_desc,
				Collections.singletonList(ProjectElementTypes.Package_2001));
		entry.setId("createPackage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProjectElementTypes
				.getImageDescriptor(ProjectElementTypes.Package_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
