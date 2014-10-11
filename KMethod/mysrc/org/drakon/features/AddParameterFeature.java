package org.drakon.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.IColorConstant;

import KragsteinMethod.*;
public class AddParameterFeature extends AbstractAddShapeFeature {

	private static final int SQUARE_SIZE = 50;
	private static final int BOARD_SIZE = SQUARE_SIZE * 8;

	private static final int FRAME_WIDTH = 20;
	private static final int FRAME_HEIGHT = 20;

	public AddParameterFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canAdd(IAddContext context) {
		return true;
	}

	public PictogramElement add(IAddContext context) {
		// Get the Graphiti services
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();		
		Parameter param = (Parameter) context.getNewObject();
		ContainerShape shape = createService.createContainerShape(getDiagram(), true);
		
		Rectangle outrect = createService.createInvisibleRectangle(shape);
		layoutService.setLocationAndSize(outrect, 110, 10, 150, 40);
		
		Rectangle rect = createService.createRectangle(outrect);
		rect.setLineWidth(1);
		Text text = createService.createText(rect, param.getName());
		rect.setBackground(manageColor(IColorConstant.WHITE));
		layoutService.setLocationAndSize(text, 10, 10, 80, 30);
		layoutService.setLocationAndSize(rect, 40, 0, 100, 40);
		
		
		int xy[] = new int[] { 0, 20, 40, 20 };
		Polyline polyline = createService.createPlainPolyline(outrect, xy);
		
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		
		return shape;
	}

	private void setLayoutForBorderTexts(IGaLayoutService layoutService, Text text) {
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setForeground(manageColor(IColorConstant.BLACK));
		text.setFont(GraphitiUi.getGaService().manageFont(getDiagram(), IGaService.DEFAULT_FONT, 12, false, true));
	}
}
