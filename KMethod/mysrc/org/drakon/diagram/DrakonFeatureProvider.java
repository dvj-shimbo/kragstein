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

import org.drakon.features.*;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import KragsteinMethod.*;
import org.eclipse.graphiti.features.IAddBendpointFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IMoveBendpointFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IReconnectionFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IAddBendpointContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMoveBendpointContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.drakon.features.CreateHeaderFeature;
public class DrakonFeatureProvider extends DefaultFeatureProvider {

	private boolean programmaticFeatureCallActive = false;

	public DrakonFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	public boolean isProgrammaticFeatureCallActive() {
		return programmaticFeatureCallActive;
	}

	public void setProgrammaticFeatureCallActive(boolean programmaticFeatureCallActive) {
		this.programmaticFeatureCallActive = programmaticFeatureCallActive;
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { new CreateHeaderFeature(this) , new CreateBranchFeature(this),
				new CreateParameterFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return super.getCreateConnectionFeatures();
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		Object newObject = context.getNewObject();
		if (newObject instanceof Header) {
			return new AddHeaderFeature(this);
		}
		else if(newObject instanceof Parameter)
			return new AddParameterFeature(this);
		else if(newObject instanceof Headline)
			return new AddBranchFeature(this);
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
