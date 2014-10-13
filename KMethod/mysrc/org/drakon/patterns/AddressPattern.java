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

import org.drakon.main.Style;
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

public class AddressPattern extends IdPattern implements IPattern {
	private static final String ID_NAME_TEXT = "nameText";
	private static final String ID_OUTER_RECTANGLE = "outerRectangle";
	private static final String ID_MAIN_RECTANGLE = "mainRectangle";
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
		
		
		
		int height = target.getGraphicsAlgorithm().getY() + target.getGraphicsAlgorithm().getHeight();
		int width = target.getGraphicsAlgorithm().getX() ;

		Adress param = (Adress) context.getNewObject();
		
		ContainerShape shape = createService.createContainerShape(target.getContainer(), true);
		
	
		
		Rectangle outrect = createService.createInvisibleRectangle(shape);
		layoutService.setLocationAndSize(outrect, width, height, 150,  Style.IconFullHeight);
		
		Rectangle rect = createService.createRectangle(outrect);
		rect.setLineWidth(1);
		Text text = createService.createText(rect, param.getTarget());
		rect.setBackground(manageColor(IColorConstant.WHITE));
		layoutService.setLocationAndSize(text, 0, 0, 80, 30);
		layoutService.setLocationAndSize(rect, 0, 0, 100, Style.IconHeight);
		
		
		
		
		link(shape, param);
		
		layoutPictogramElement(MethodPattern.HeaderShape);
		
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
