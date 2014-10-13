/**
 * <copyright>
 * 
 * Copyright (c) 2012, 2012 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *    cbrand - Bug 382928 - Introduce factory method(s) for easier gradient creation
 * 
 * </copyright>
 */
package org.drakon.patterns;
import org.drakon.main.Style;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.AbstractPattern;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.pattern.id.IdLayoutContext;
import org.eclipse.graphiti.pattern.id.IdPattern;
import org.eclipse.graphiti.pattern.id.IdUpdateContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import KragsteinMethod.*;

public class MethodPattern extends IdPattern implements IPattern {

	private static final String ID_NAME_TEXT = "nameText";
	private static final String ID_OUTER_RECTANGLE = "outerRectangle";
	private static final String ID_MAIN_RECTANGLE = "mainRectangle";

	public static ContainerShape MainContainer;
	public static ContainerShape MainRoute;
	public static ContainerShape HeaderShape;
	public MethodPattern() {
		super();
	}

	@Override
	public String getCreateName() {
		return "Метод";
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		return mainBusinessObject instanceof Header;
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return getDiagram().eResource().getContents().size() == 1;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Resource resource = getDiagram().eResource();

		Method method = KragsteinMethodFactory.eINSTANCE.createMethod();
		
		
		// Create a new chess board and add it to an EMF resource
		Header header = KragsteinMethodFactory.eINSTANCE.createHeader();
		header.setName("Method");
		resource.getContents().add(method);
		resource.getContents().add(header);
		method.setHeader(header);
		Route route = KragsteinMethodFactory.eINSTANCE.createRoute();
		Branch branch = KragsteinMethodFactory.eINSTANCE.createBranch();
		
		Headline head = KragsteinMethodFactory.eINSTANCE.createHeadline();
		
		head.setName("branch 1");
		route.getIcon().add(head);
		//resource.getContents().add(route);
		//resource.getContents().add(branch);
		
		//branch.setRoute(route);
		//method.getBranch().add(branch);
		resource.getContents().add(head);
		
		
		
		
		
		branch.setName("branch 1");
		
		
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, header);
		

		
		return new Object[] { header };
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return true;
	}
	
	
	@Override
	public PictogramElement doAdd(IAddContext context) {
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();		
		Header header = (Header) context.getNewObject();
		
		
		
		HeaderShape = createService.createContainerShape(getDiagram(), true);
		
		Rectangle headrect = createService.createInvisibleRectangle(HeaderShape);
		ContainerShape shape = createService.createContainerShape(HeaderShape, true);
		
		layoutService.setLocationAndSize(headrect, Style.leftPadding, Style.topPadding, 1500, 800);
		
		Rectangle outrect = createService.createInvisibleRectangle(shape);
		layoutService.setLocationAndSize(outrect, Style.leftPadding, Style.topPadding, 150, 80);
		RoundedRectangle rect = createService.createRoundedRectangle(outrect, 30, 30);
		
		rect.setLineWidth(1);
		Text text = createService.createText(rect, header.getName());
		rect.setBackground(manageColor(IColorConstant.WHITE));
		layoutService.setLocationAndSize(text, 0, 0, 80, 30);
		layoutService.setLocationAndSize(rect, 0, 0, 100, 40);
		
		
		int xy[] = new int[] { 50, 40, 50, 80 };
		Polyline polyline = createService.createPlainPolyline(outrect, xy);
		
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		
		
		link(HeaderShape, header);
		
		
		return shape;
	}

	@Override
	protected boolean layout(IdLayoutContext context, String id) {
		boolean changesDone = false;

		Rectangle outerRectangle = (Rectangle) context.getRootPictogramElement().getGraphicsAlgorithm();

		if (id.equals(ID_MAIN_RECTANGLE) || id.equals(ID_NAME_TEXT)) {
			GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
			Graphiti.getGaService().setLocationAndSize(ga, 0, 10, outerRectangle.getWidth(),
					outerRectangle.getHeight() - 10);
			changesDone = true;
		}

		return changesDone;
	}

	@Override
	protected IReason updateNeeded(IdUpdateContext context, String id) {
		if (id.equals(ID_NAME_TEXT)) {
			Text nameText = (Text) context.getGraphicsAlgorithm();
			Branch domainObject = (Branch) context.getDomainObject();
			if (domainObject.getName() == null || !domainObject.getName().equals(nameText.getValue())) {
				return Reason.createTrueReason("Name differs. Expected: '" + domainObject.getName() + "'");
			}
		}

		return Reason.createFalseReason();
	}

	@Override
	protected boolean update(IdUpdateContext context, String id) {
		if (id.equals(ID_NAME_TEXT)) {
			Text nameText = (Text) context.getGraphicsAlgorithm();
			Branch domainObject = (Branch) context.getDomainObject();
			nameText.setValue(domainObject.getName());
			return true;
		}
		return false;
	}

	@Override
	public int getEditingType() {
		return TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		Object domainObject = getBusinessObjectForPictogramElement(context.getPictogramElement());
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		if (domainObject instanceof Branch) {
			return true;
		}
		return false;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		Branch file = (Branch) getBusinessObjectForPictogramElement(context.getPictogramElement());
		return file.getName();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value == null || value.length() == 0) {
			return "File name must not be empty";
		}

		return "file";
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		Branch file = (Branch) getBusinessObjectForPictogramElement(context.getPictogramElement());
		file.setName(value);
		updatePictogramElement(context.getPictogramElement());
	}



	

	
}
