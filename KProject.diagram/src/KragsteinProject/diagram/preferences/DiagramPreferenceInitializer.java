/*
 * 
 */
package KragsteinProject.diagram.preferences;

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
		KragsteinProject.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		KragsteinProject.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		KragsteinProject.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		KragsteinProject.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		KragsteinProject.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
