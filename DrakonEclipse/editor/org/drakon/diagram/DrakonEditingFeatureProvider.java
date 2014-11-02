package org.drakon.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IAddBendpointFeature;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
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
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveBendpointContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.pattern.CreateFeatureForPattern;
import org.eclipse.graphiti.pattern.DefaultFeatureProviderWithPatterns;
import org.eclipse.graphiti.pattern.IPattern;

import KragsteinMethod.Action;
import KragsteinMethod.Icon;

public class DrakonEditingFeatureProvider extends
	AbstractDirectEditingFeature {
	
	public DrakonEditingFeatureProvider(IFeatureProvider fp) {
	    super(fp);
	}
	
	public int getEditingType() {
	    // there are several possible editor-types supported:
	    // text-field, checkbox, color-chooser, combobox, ...
	    return TYPE_TEXT;
	}
	
	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
	    PictogramElement pe = context.getPictogramElement();
	    Object bo = getBusinessObjectForPictogramElement(pe);
	    GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
	    // support direct editing, if it is a EClass, and the user clicked
	    // directly on the text and not somewhere else in the rectangle
	    return true;
	}
	
	public String getInitialValue(IDirectEditingContext context) {
	    // return the current name of the EClass
	    PictogramElement pe = context.getPictogramElement();
	    Action act = (Action) getBusinessObjectForPictogramElement(pe);
	    
	    return  "New value";
	}
	
	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
	
	    // null means, that the value is valid
	    return null;
	}
	
	public void setValue(String value, IDirectEditingContext context) {
	    // set the new name for the EClass
	    PictogramElement pe = context.getPictogramElement();
	    Action act = (Action) getBusinessObjectForPictogramElement(pe);
	    act.setName(value);
	
	    // Explicitly update the shape to display the new value in the diagram
	    // Note, that this might not be necessary in future versions of Graphiti
	    // (currently in discussion)
	
	    // we know, that pe is the Shape of the Text, so its container is the
	    // main shape of the EClass
	    updatePictogramElement(((Shape) pe).getContainer());
	}
}