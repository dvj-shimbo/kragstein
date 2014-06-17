package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.DependencyItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DependencyEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public DependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DependencyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DependencyNameEditPart) {
			((DependencyNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDependencyNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DependencyNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new DependencyFigure();
	}

	/**
	 * @generated
	 */
	public DependencyFigure getPrimaryShape() {
		return (DependencyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DependencyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDependencyNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDependencyLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDependencyUpperBoundFigure;

		/**
		 * @generated
		 */
		public DependencyFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDependencyNameFigure = new WrappingLabel();

			fFigureDependencyNameFigure.setText("<...>");

			this.add(fFigureDependencyNameFigure);

			fFigureDependencyLowerBoundFigure = new WrappingLabel();

			fFigureDependencyLowerBoundFigure.setText("<...>");

			this.add(fFigureDependencyLowerBoundFigure);

			fFigureDependencyUpperBoundFigure = new WrappingLabel();

			fFigureDependencyUpperBoundFigure.setText("<...>");

			this.add(fFigureDependencyUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDependencyNameFigure() {
			return fFigureDependencyNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDependencyLowerBoundFigure() {
			return fFigureDependencyLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDependencyUpperBoundFigure() {
			return fFigureDependencyUpperBoundFigure;
		}

	}

}
