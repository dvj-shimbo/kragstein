/**
 * <copyright>
 * 
 * Copyright (c) 2011, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 * 
 * </copyright>
 */
package org.drakon.diagram;

import java.util.ArrayList;
import java.util.List;

import org.drakon.features.*;
import org.drakon.patterns.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

import KragsteinMethod.*;

import org.eclipse.graphiti.features.IAddBendpointFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveBendpointFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IAddBendpointContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveBendpointContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.CreateFeatureForPattern;
import org.eclipse.graphiti.pattern.DefaultFeatureProviderWithPatterns;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

public class DrakonFeatureProvider extends DefaultFeatureProviderWithPatterns {

	private boolean programmaticFeatureCallActive = false;

	public DrakonFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		addPattern(new BranchPattern());
		addPattern(new MethodPattern());
		addPattern(new ParameterPattern());
		addPattern( new ActionPattern());
		addPattern( new EndPattern());
		addPattern( new AddressPattern());
		addPattern( new ChoicePattern());
		
		
	}

	public boolean isProgrammaticFeatureCallActive() {
		return programmaticFeatureCallActive;
	}

	public void setProgrammaticFeatureCallActive(boolean programmaticFeatureCallActive) {
		this.programmaticFeatureCallActive = programmaticFeatureCallActive;
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
	    PictogramElement pictogramElement = context.getPictogramElement();
	    Object bo = getBusinessObjectForPictogramElement(pictogramElement);
	    return new RouteLayoutFeature(this);
	    
	}
	

	
	@Override
	public ICreateFeature[] getCreateFeatures() {
		ICreateFeature[] ret = new ICreateFeature[0];
		List<ICreateFeature> retList = new ArrayList<ICreateFeature>();

		for (IPattern pattern : getPatterns()) {
			if (pattern.isPaletteApplicable()) {
				retList.add(new CreateFeatureForPattern(this, pattern));
			}
		}

		ICreateFeature[] a = getCreateFeaturesAdditional();
		for (ICreateFeature element : a) {
			retList.add(element);
		}

		return retList.toArray(ret);
	}

	
	

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return super.getCreateConnectionFeatures();
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		ICustomFeature[] ret = super.getCustomFeatures(context);

		
		return ret;
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object newObject = context.getNewObject();
		
		return super.getAddFeature(context);
	}

	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		
		return super.getRemoveFeature(context);
	}

	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		

		return super.getDeleteFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		

		return super.getResizeShapeFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		

		return super.getMoveShapeFeature(context);
	}

	@Override
	public IReconnectionFeature getReconnectionFeature(IReconnectionContext context) {
		// We only have move connections which we don't want to be reconnected
		return null;
	}

	@Override
	public IAddBendpointFeature getAddBendpointFeature(IAddBendpointContext context) {
		// We only have move connections; for all these connections the used
		// free form connection shall behave like a direct connection
		return null;
	}

	@Override
	public IMoveBendpointFeature getMoveBendpointFeature(IMoveBendpointContext context) {
		// We only have move connections; for all these connections the used
		// free form connection shall behave like a direct connection
		return null;
	}
}
