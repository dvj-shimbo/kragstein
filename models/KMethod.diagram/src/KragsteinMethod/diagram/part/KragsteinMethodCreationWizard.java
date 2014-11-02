/*
 * 
 */
package KragsteinMethod.diagram.part;

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
public class KragsteinMethodCreationWizard extends Wizard implements INewWizard {

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
	protected KragsteinMethod.diagram.part.KragsteinMethodCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected KragsteinMethod.diagram.part.KragsteinMethodCreationWizardPage domainModelFilePage;

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
		setWindowTitle(KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizardTitle);
		setDefaultPageImageDescriptor(KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewKragsteinMethodWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new KragsteinMethod.diagram.part.KragsteinMethodCreationWizardPage(
				"DiagramModelFile", getSelection(), "kragsteinmethod_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new KragsteinMethod.diagram.part.KragsteinMethodCreationWizardPage(
				"DomainModelFile", getSelection(), "kragsteinmethod") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".kragsteinmethod_diagram".length()); //$NON-NLS-1$
					setFileName(KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "kragsteinmethod")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizardOpenEditorError,
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
								KragsteinMethod.diagram.part.Messages.KragsteinMethodCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				KragsteinMethod.diagram.part.KragsteinMethodDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
