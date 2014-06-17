package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.AggregationItemSemanticEditPolicy;

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
public class AggregationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4006;

	/**
	 * @generated
	 */
	public AggregationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AggregationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AggregationNameEditPart) {
			((AggregationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAggregationNameFigure());
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
		if (childEditPart instanceof AggregationNameEditPart) {
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
		return new AggregationFigure();
	}

	/**
	 * @generated
	 */
	public AggregationFigure getPrimaryShape() {
		return (AggregationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AggregationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregationLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAggregationUpperBoundFigure;

		/**
		 * @generated
		 */
		public AggregationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAggregationNameFigure = new WrappingLabel();

			fFigureAggregationNameFigure.setText("<...>");

			this.add(fFigureAggregationNameFigure);

			fFigureAggregationLowerBoundFigure = new WrappingLabel();

			fFigureAggregationLowerBoundFigure.setText("<...>");

			this.add(fFigureAggregationLowerBoundFigure);

			fFigureAggregationUpperBoundFigure = new WrappingLabel();

			fFigureAggregationUpperBoundFigure.setText("<...>");

			this.add(fFigureAggregationUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregationNameFigure() {
			return fFigureAggregationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregationLowerBoundFigure() {
			return fFigureAggregationLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAggregationUpperBoundFigure() {
			return fFigureAggregationUpperBoundFigure;
		}

	}

}
