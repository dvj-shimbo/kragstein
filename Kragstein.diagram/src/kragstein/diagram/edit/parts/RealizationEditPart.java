package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.RealizationItemSemanticEditPolicy;

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
public class RealizationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public RealizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RealizationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RealizationNameEditPart) {
			((RealizationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRealizationNameFigure());
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
		if (childEditPart instanceof RealizationNameEditPart) {
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
		return new RealizationFigure();
	}

	/**
	 * @generated
	 */
	public RealizationFigure getPrimaryShape() {
		return (RealizationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RealizationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRealizationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRealizationLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRealizationUpperBoundFigure;

		/**
		 * @generated
		 */
		public RealizationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRealizationNameFigure = new WrappingLabel();

			fFigureRealizationNameFigure.setText("<...>");

			this.add(fFigureRealizationNameFigure);

			fFigureRealizationLowerBoundFigure = new WrappingLabel();

			fFigureRealizationLowerBoundFigure.setText("<...>");

			this.add(fFigureRealizationLowerBoundFigure);

			fFigureRealizationUpperBoundFigure = new WrappingLabel();

			fFigureRealizationUpperBoundFigure.setText("<...>");

			this.add(fFigureRealizationUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRealizationNameFigure() {
			return fFigureRealizationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRealizationLowerBoundFigure() {
			return fFigureRealizationLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRealizationUpperBoundFigure() {
			return fFigureRealizationUpperBoundFigure;
		}

	}

}
