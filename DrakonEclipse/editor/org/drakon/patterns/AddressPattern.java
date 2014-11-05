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

import java.util.List;

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
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.IColorConstant;

import KragsteinMethod.*;

public class AddressPattern extends IdPattern implements IPattern {
	
	private static int counter = 0;
	public AddressPattern() {
		super();
	}

	
	@Override
	public String getCreateName() {
		return "Адрес";
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		return mainBusinessObject instanceof Adress;
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		return true;
	}
	
	@Override
	public boolean canCreate(ICreateContext context) {
		return true;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Resource resource = getDiagram().eResource();
		
		Icon icon;
		
		EObject obj = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
		
		
		Adress act = KragsteinMethodFactory.eINSTANCE.createAdress();
		act.setTarget( String.format("Branch %d", counter+2));
		counter += 1;
		resource.getContents().add(act);
		
		
		if (obj instanceof Icon) {
			icon = (Icon)obj;
			Icon prevIcon  = icon.getNextIcon();
			icon.setNextIcon(act);
			act.setNextIcon(prevIcon);
		}
		
		
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, act);
		

		return new Object[] { act };
	}

	@Override
	public boolean canAdd(IAddContext context) {
		return true;
	}

	@Override
	public PictogramElement doAdd(IAddContext context) {
		
		ICreateService createService = Graphiti.getCreateService();
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();	
		
		ContainerShape target = context.getTargetContainer();
		

		Adress param = (Adress) context.getNewObject();
		
		ContainerShape shape = createService.createContainerShape(target.getContainer(), true);
		
		this.setId(shape,  "name");
		
		Polygon rect = createService.createPolygon(shape);
		rect.setLineWidth(1);
		Text text = createService.createText(rect, param.getTarget());
		rect.setBackground(manageColor(IColorConstant.WHITE));
		text.setFont(Graphiti.getGaService().manageFont(getDiagram(), "Arial", 14));
		layoutService.setLocationAndSize(text, 0, 0, 80, 30);
		layoutService.setLocationAndSize(rect, 0, 0, 100, Style.IconHeight);
		
		
		
		
		link(shape, param);
		
		
		
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
			Point pt1 = gaService.createPoint(0,height/4);
			Point pt2 = gaService.createPoint(curWidth/2,0);
			
			Point pt3 = gaService.createPoint(curWidth, height/4);
			Point pt4 = gaService.createPoint(curWidth,height);
			Point pt5 = gaService.createPoint(0,height);
			poly.getPoints().add(pt1);
			poly.getPoints().add(pt2);
			poly.getPoints().add(pt3);
			poly.getPoints().add(pt4);
			poly.getPoints().add(pt5);
			
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
			Adress domainObject = (Adress) context.getDomainObject();
			Text nameText = getTextPic(context.getGraphicsAlgorithm());
			nameText.setValue(domainObject.getTarget());
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
		return null;
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		Adress file = (Adress) getBusinessObjectForPictogramElement(context.getPictogramElement());
		file.setTarget(value);
		updatePictogramElement(context.getPictogramElement());
	}



	

	
}
