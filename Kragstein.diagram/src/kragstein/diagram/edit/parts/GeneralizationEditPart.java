package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.GeneralizationItemSemanticEditPolicy;

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
public class GeneralizationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public GeneralizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GeneralizationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof GeneralizationNameEditPart) {
			((GeneralizationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureGeneralizationNameFigure());
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
		if (childEditPart instanceof GeneralizationNameEditPart) {
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
		return new GeneralizationFigure();
	}

	/**
	 * @generated
	 */
	public GeneralizationFigure getPrimaryShape() {
		return (GeneralizationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class GeneralizationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneralizationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneralizationLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneralizationUpperBoundFigure;

		/**
		 * @generated
		 */
		public GeneralizationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureGeneralizationNameFigure = new WrappingLabel();

			fFigureGeneralizationNameFigure.setText("<...>");

			this.add(fFigureGeneralizationNameFigure);

			fFigureGeneralizationLowerBoundFigure = new WrappingLabel();

			fFigureGeneralizationLowerBoundFigure.setText("<...>");

			this.add(fFigureGeneralizationLowerBoundFigure);

			fFigureGeneralizationUpperBoundFigure = new WrappingLabel();

			fFigureGeneralizationUpperBoundFigure.setText("<...>");

			this.add(fFigureGeneralizationUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneralizationNameFigure() {
			return fFigureGeneralizationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneralizationLowerBoundFigure() {
			return fFigureGeneralizationLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneralizationUpperBoundFigure() {
			return fFigureGeneralizationUpperBoundFigure;
		}

	}

}
