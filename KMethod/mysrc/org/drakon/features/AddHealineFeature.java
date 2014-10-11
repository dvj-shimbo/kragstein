package org.drakon.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
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
public class AddHealineFeature extends AbstractAddShapeFeature {

	private static final int SQUARE_SIZE = 50;
	private static final int BOARD_SIZE = SQUARE_SIZE * 8;

	private static final int FRAME_WIDTH = 20;
	private static final int FRAME_HEIGHT = 20;

	public AddHealineFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canAdd(IAddContext context) {
		return true;
	}

	public PictogramElement add(IAddContext context) {
		// Get the Graphiti services
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();

		// Get the board to add
		
		Method method = (Method) context.getNewObject();
		Header header = method.getHeader();
		
		ContainerShape outerContainerShape = createService.createContainerShape(getDiagram(), true);
		
		// Create invisible outer rectangle that holds the rank and file names
		Rectangle outerRectangle = createService.createRectangle(outerContainerShape);
		
		createService.createText(outerRectangle, header.getName());
		
		layoutService.setLocationAndSize(outerRectangle, 10, 10, 100, 40);
		
		header.eContainer();
		Branch branch = method.getBranch().get(0);
		
		Route route = branch.getRoute();
		Headline head = (Headline)route.getIcon().get(0);
		
		
		ContainerShape headlineShape = createService.createContainerShape(getDiagram(), true);
		
		
		Rectangle headlineRect = createService.createRectangle(headlineShape);
		
		createService.createText(headlineRect, head.getName());
		
		layoutService.setLocationAndSize(headlineRect, 10, 100, 100, 40);
				
		// Link the visualisation with the board
		link(outerContainerShape, method);

		
		return outerContainerShape;
	}

	private void setLayoutForBorderTexts(IGaLayoutService layoutService, Text text) {
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setForeground(manageColor(IColorConstant.BLACK));
		text.setFont(GraphitiUi.getGaService().manageFont(getDiagram(), IGaService.DEFAULT_FONT, 12, false, true));
	}
}
