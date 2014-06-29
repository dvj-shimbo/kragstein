/*
 * 
 */
package KragsteinProject.diagram.part;

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
public class KragsteinProjectCreationWizard extends Wizard implements
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
	protected KragsteinProject.diagram.part.KragsteinProjectCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected KragsteinProject.diagram.part.KragsteinProjectCreationWizardPage domainModelFilePage;

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
		setWindowTitle(KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizardTitle);
		setDefaultPageImageDescriptor(KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewKragsteinProjectWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new KragsteinProject.diagram.part.KragsteinProjectCreationWizardPage(
				"DiagramModelFile", getSelection(), "kragsteinproject_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new KragsteinProject.diagram.part.KragsteinProjectCreationWizardPage(
				"DomainModelFile", getSelection(), "kragsteinproject") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".kragsteinproject_diagram".length()); //$NON-NLS-1$
					setFileName(KragsteinProject.diagram.part.KragsteinProjectDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "kragsteinproject")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = KragsteinProject.diagram.part.KragsteinProjectDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						KragsteinProject.diagram.part.KragsteinProjectDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizardOpenEditorError,
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
								KragsteinProject.diagram.part.Messages.KragsteinProjectCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				KragsteinProject.diagram.part.KragsteinProjectDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
