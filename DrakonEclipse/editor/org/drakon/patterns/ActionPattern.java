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
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
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
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.IColorConstant;

import KragsteinMethod.*;

public class ActionPattern extends IdPattern implements IPattern {

	private static int counter = 0;
	public ActionPattern() {
		super();
	}

	
	@Override
	public String getCreateName() {
		return "Действие";
	}

	@Override
	public boolean isMainBusinessObjectApplicable(Object mainBusinessObject) {
		return mainBusinessObject instanceof Action;
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return true;
	}


	@Override
	public Object[] create(ICreateContext context) {
		Resource resource = context.getTargetContainer().eResource();
		
		Icon icon;
		
		EObject obj = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(context.getTargetContainer());
		
		
		Action act = KragsteinMethodFactory.eINSTANCE.createAction();
		act.setName( String.format("Action %d", counter));
		counter += 1;
		resource.getContents().add(act);
		
		
		PatternUtils.SetNextIcon(obj,  act, getDiagram() );
		
		
		
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
		 IGaService gaService = Graphiti.getGaService();
		ContainerShape target = context.getTargetContainer();
		
		
		
	
		Action action = (Action) context.getNewObject();
		
		ContainerShape shape = createService.createContainerShape(target.getContainer(), true);
		
		this.setId(shape, "name");
		
		
		Rectangle rect = createService.createRectangle(shape);
		rect.setLineWidth(1);
		Text text = createService.createText(rect, action.getName());
		text.setFont(gaService.manageFont(getDiagram(), "Arial", 14));
		
		rect.setBackground(manageColor(IColorConstant.WHITE));
	
		link(shape, action);

		return shape;
	}
	
	@Override
	public PictogramElement add(IAddContext context) {
		PictogramElement pictogramElement = doAdd(context);
		setPatternType(pictogramElement, PROPERTY_VALUE_PATTERN_TYPE_ID);
		update(new UpdateContext(pictogramElement));	
		return pictogramElement;
	}

	@Override
	protected boolean layout(IdLayoutContext context, String id) {
		
		int curWidth = context.getGraphicsAlgorithm().getWidth();
		Text text = getTextPic(context.getGraphicsAlgorithm());
		int w = GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), text.getFont()).getWidth();
		
		IGaLayoutService layoutService = Graphiti.getGaLayoutService();
		if (curWidth == 0) {
			
			layoutService.setSize( getTextPic(context.getGraphicsAlgorithm()), w , Style.IconHeight);
			layoutService.setSize( context.getGraphicsAlgorithm(), w, Style.IconHeight);
		}
		else {
			int textX = (curWidth - w)/2;
			layoutService.setLocation( getTextPic(context.getGraphicsAlgorithm()), textX , 0);
		}
		
		return true;
	}

	Text getTextPic(GraphicsAlgorithm ga) {
		EList<GraphicsAlgorithm> lst = ga.getGraphicsAlgorithmChildren();
		return (Text)lst.get(0);
	}

	Rectangle getRectPic(GraphicsAlgorithm ga) {
		return (Rectangle)ga;
	}
	
	
	@Override
	protected IReason updateNeeded(IdUpdateContext context, String id) {
		return Reason.createFalseReason();
	}

	@Override
	protected boolean update(IdUpdateContext context, String id) {
		if (id.equals("name")) {
			
			Action domainObject = (Action) context.getDomainObject();
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
		Action act = (Action) getBusinessObjectForPictogramElement(context.getPictogramElement());
		return act.getName();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		return null;
	}

	@Override
	public void setValue(String value, IDirectEditingContext context) {
		Action act = (Action) getBusinessObjectForPictogramElement(context.getPictogramElement());
		act.setName(value);
		updatePictogramElement(context.getPictogramElement());
	}



	

	
}
