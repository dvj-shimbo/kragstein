/*
 * 
 */
package KragsteinMethod.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		KragsteinMethod.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		KragsteinMethod.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		KragsteinMethod.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		KragsteinMethod.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		KragsteinMethod.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
