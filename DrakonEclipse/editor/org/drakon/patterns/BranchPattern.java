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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
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
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.IColorConstant;

import KragsteinMethod.*;

public class BranchPattern extends IdPattern implements IPattern {


	
	public BranchPattern() {
		super();
	}

	@Override
	public String getCreateName() {
		return "Бранч";
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		return mainBusinessObject instanceof Headline;
	}

	
	@Override
	public boolean canCreate(ICreateContext context) {
		return true;
	}

	@Override
	public Object[] create(ICreateContext context) {
		
		Route route = KragsteinMethodFactory.eINSTANCE.createRoute();
		Resource resource = getDiagram().eResource();
		resource.getContents().add(route);
		Method method = (Method) resource.getContents().get(1);
		Branch branch = KragsteinMethodFactory.eINSTANCE.createBranch();
		branch.setName("branch 1");
		branch.setRoute(route);
		resource.getContents().add(branch);
		method.getBranch().add(branch);
		
		
		
		Headline head = KragsteinMethodFactory.eINSTANCE.createHeadline();
		
		head.setName("branch 1");
		resource.getContents().add(head);
		route.getIcon().add(head);
	
		
		addGraphicalRepresentation(context, head);
		return new Object[] { head };
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return true;
	}

	
	@Override
	public PictogramElement doAdd(IAddContext context) {
		
		ICreateService createService = Graphiti.getCreateService();
		 IGaService gaService = Graphiti.getGaService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();
		
		Method method = (Method)getDiagram().eResource().getContents().get(1);
		
		
		int width = 10;
		ContainerShape target = context.getTargetContainer();
		if (method.getBranch().size() > 1)
			width = target.getGraphicsAlgorithm().getX() + target.getGraphicsAlgorithm().getWidth();
		
			
		Headline head = (Headline) context.getNewObject();
		ContainerShape shape = createService.createContainerShape(getDiagram(), true);
		
		this.setId(shape,  "name");
		
		
		Polygon rect = createService.createPolygon(shape);
		
		rect.setLineWidth(1);
		Text text = createService.createText(rect, head.getName());
		rect.setBackground(manageColor(IColorConstant.WHITE));
		text.setFont(gaService.manageFont(getDiagram(), "Arial", 14));
		int x = 0;
		layoutService.setLocationAndSize(text, 0, 0, 80, 30);
		layoutService.setLocationAndSize(rect, 0, 0, Style.IconWidth , Style.IconHeight);
			
		
		
		
		link(shape, head);
		
		
		return shape;
	}

	@Override
	protected boolean layout(IdLayoutContext context, String id) {
		int curWidth = context.getGraphicsAlgorithm().getWidth();
		Text text = getTextPic(context.getGraphicsAlgorithm());
		int w = GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), text.getFont()).getWidth();
		int height = context.getGraphicsAlgorithm().getHeight();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();
		if (curWidth == 0) {
			context.getGraphicsAlgorithm().setHeight(Style.IconHeight);
			layoutService.setSize( getTextPic(context.getGraphicsAlgorithm()), w , Style.IconHeight);
			layoutService.setSize( context.getGraphicsAlgorithm(), w, Style.IconHeight);
		}
		else {
			Polygon poly = (Polygon)context.getGraphicsAlgorithm();
			poly.getPoints().clear();
			IGaService gaService = Graphiti.getGaService();
			Point pt1 = gaService.createPoint(0,0);
			Point pt2 = gaService.createPoint(curWidth,0);
			
			Point pt3 = gaService.createPoint(curWidth,height - height/4);
			Point pt4 = gaService.createPoint(curWidth/2,height);
			Point pt5 = gaService.createPoint(0,height- height/4);
			poly.getPoints().add(pt1);
			poly.getPoints().add(pt2);
			poly.getPoints().add(pt3);
			poly.getPoints().add(pt4);
			poly.getPoints().add(pt5);
			//layoutService.setLocation( getTextPic(context.getGraphicsAlgorithm()), textX , 0);
		}
		
		return true;
	}

	@Override
	protected IReason updateNeeded(IdUpdateContext context, String id) {
	
		return Reason.createFalseReason();
	}
	Text getTextPic(GraphicsAlgorithm ga) {
		EList<GraphicsAlgorithm> lst = ga.getGraphicsAlgorithmChildren();
		return (Text)lst.get(0);
	}

	Rectangle getRectPic(GraphicsAlgorithm ga) {
		return (Rectangle)ga;
	}
	
	@Override
	protected boolean update(IdUpdateContext context, String id) {
		if (id.equals("name")) {
			Headline domainObject = (Headline) context.getDomainObject();
			Text nameText = getTextPic(context.getGraphicsAlgorithm());
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
		return true;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		Headline file = (Headline) getBusinessObjectForPictogramElement(context.getPictogramElement());
		return file.getName();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
	
		return null;
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		Headline file = (Headline) getBusinessObjectForPictogramElement(context.getPictogramElement());
		file.setName(value);
		updatePictogramElement(context.getPictogramElement());
	}



	

	
}
