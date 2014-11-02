/*
 * 
 */
package KragsteinPackage.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class KragsteinPackageCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected KragsteinPackage.diagram.part.KragsteinPackageCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected KragsteinPackage.diagram.part.KragsteinPackageCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizardTitle);
		setDefaultPageImageDescriptor(KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewKragsteinPackageWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new KragsteinPackage.diagram.part.KragsteinPackageCreationWizardPage(
				"DiagramModelFile", getSelection(), "kragsteinpackage_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new KragsteinPackage.diagram.part.KragsteinPackageCreationWizardPage(
				"DomainModelFile", getSelection(), "kragsteinpackage") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".kragsteinpackage_diagram".length()); //$NON-NLS-1$
					setFileName(KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "kragsteinpackage")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								KragsteinPackage.diagram.part.Messages.KragsteinPackageCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				KragsteinPackage.diagram.part.KragsteinPackageDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
