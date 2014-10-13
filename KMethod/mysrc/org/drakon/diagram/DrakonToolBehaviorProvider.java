/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2011, 2012 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *    mwenz - Bug 358255 - Add Border/Background decorators
 *
 * </copyright>
 *
 *******************************************************************************/
package org.drakon.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;


import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.tb.BorderDecorator;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.util.IColorConstant;

public class DrakonToolBehaviorProvider extends DefaultToolBehaviorProvider {

	
	public DrakonToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}
	
	@Override
	public GraphicsAlgorithm[] getClickArea(PictogramElement pe) {
		if (pe instanceof ContainerShape) {
			GraphicsAlgorithm[] graphicsAlgorithmsList = new GraphicsAlgorithm[100];
			int i =0;
			for (Shape shape : ((ContainerShape) pe).getChildren()) {
				if(shape.getGraphicsAlgorithm().getLineVisible()){
				graphicsAlgorithmsList[i++]=shape.getGraphicsAlgorithm();
				}
			}
		return graphicsAlgorithmsList;
		}
		return super.getClickArea(pe);
	}

	@Override
	public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {
	    if (pe instanceof ContainerShape) {
	        GraphicsAlgorithm invisible = pe.getGraphicsAlgorithm();
	        if (!invisible.getLineVisible()) {
	            EList<GraphicsAlgorithm> graphicsAlgorithmChildren =
	                invisible.getGraphicsAlgorithmChildren();
	            if (!graphicsAlgorithmChildren.isEmpty()) {
	                return graphicsAlgorithmChildren.get(0);
	            }
	         }
	    }
	    return super.getSelectionBorder(pe);
	}
	
	@Override
	public boolean isShowGuides() {
		return false;
	}

	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
		Object object = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		// Check if the business object of the given pictogram element (the
		// square) is one of the allowed squares (see CreateChessMoveFeature)
		// for a move in progress
		
		return super.getDecorators(pe);
	}


}
