/*
 * 
 */
package KragsteinPackage.diagram.preferences;

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
		KragsteinPackage.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		KragsteinPackage.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		KragsteinPackage.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		KragsteinPackage.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		KragsteinPackage.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
