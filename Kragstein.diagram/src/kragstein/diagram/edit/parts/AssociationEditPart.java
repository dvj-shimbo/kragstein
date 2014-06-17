package kragstein.diagram.edit.parts;

import kragstein.diagram.edit.policies.AssociationItemSemanticEditPolicy;

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
public class AssociationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public AssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssociationNameEditPart) {
			((AssociationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssociationNameFigure());
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
		if (childEditPart instanceof AssociationNameEditPart) {
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
		return new AssociationFigure();
	}

	/**
	 * @generated
	 */
	public AssociationFigure getPrimaryShape() {
		return (AssociationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class AssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssociationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssociationLowerBoundFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssociationUpperBoundFigure;

		/**
		 * @generated
		 */
		public AssociationFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAssociationNameFigure = new WrappingLabel();

			fFigureAssociationNameFigure.setText("<...>");

			this.add(fFigureAssociationNameFigure);

			fFigureAssociationLowerBoundFigure = new WrappingLabel();

			fFigureAssociationLowerBoundFigure.setText("<...>");

			this.add(fFigureAssociationLowerBoundFigure);

			fFigureAssociationUpperBoundFigure = new WrappingLabel();

			fFigureAssociationUpperBoundFigure.setText("<...>");

			this.add(fFigureAssociationUpperBoundFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationNameFigure() {
			return fFigureAssociationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationLowerBoundFigure() {
			return fFigureAssociationLowerBoundFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssociationUpperBoundFigure() {
			return fFigureAssociationUpperBoundFigure;
		}

	}

}
