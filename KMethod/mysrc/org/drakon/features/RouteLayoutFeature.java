package org.drakon.features;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.drakon.main.Style;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.datatypes.*;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.IFeatureProvider;
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
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.pattern.IPattern;
import org.eclipse.graphiti.pattern.id.IdLayoutContext;
import org.eclipse.graphiti.pattern.id.IdPattern;
import org.eclipse.graphiti.pattern.id.IdUpdateContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.ILayoutService;
import org.eclipse.graphiti.util.IColorConstant;
import org.drakon.patterns.*;

import KragsteinMethod.*;

public class RouteLayoutFeature extends AbstractLayoutFeature {
 
    private static final int MIN_HEIGHT = 30;
 
    private static final int MIN_WIDTH = 50;
 
    public RouteLayoutFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canLayout(ILayoutContext context) {
       // return true, if pictogram element is linked to an EClass
       PictogramElement pe = context.getPictogramElement();
       if (!(pe instanceof ContainerShape))
           return false;
       EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
       return true;
    }
 
    public boolean layout(ILayoutContext context) {
        boolean anythingChanged = false;
        ContainerShape containerShape =
                (ContainerShape) context.getPictogramElement();
   
        IGaService gaService = Graphiti.getGaService();
        ILayoutService layoutService = Graphiti.getLayoutService();
        
        List<GraphicsAlgorithm> delList = new ArrayList();
        for (GraphicsAlgorithm graphicsAlgorithm : containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren()){
        	
        	if (graphicsAlgorithm instanceof Polyline) {
        		delList.add(graphicsAlgorithm);
                
        	}
        }
        containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().removeAll(delList);
        int x = 0 ;
        
        Method method = (Method)getDiagram().eResource().getContents().get(1);
        for(int i = 0;  i <  method.getBranch().size(); ++i ) {
        	
        	Route route =  method.getBranch().get(i).getRoute();
        	x = Style.leftPadding + i * ( Style.IconWidth + Style.WidthInterval);
        	int y = Style.topPadding + Style.IconFullHeight;
        	Icon icon = route.getIcon().get(0);
        	do {
        		List<PictogramElement> elemList = Graphiti.getLinkService().getPictogramElements(getDiagram(), icon);
         
        		layoutService.setLocation(elemList.get(0).getGraphicsAlgorithm(), x, y);
        		y += Style.IconFullHeight;   		
        		icon = icon.getNextIcon();
        	}
        	while(icon != null);
        	
        	//add center line
        	int xy[] = new int[] { x + Style.IconWidth/2, 40, + Style.IconWidth/2, y };
    		Polyline polyline = Graphiti.getCreateService().createPlainPolyline(MethodPattern.HeaderShape.getGraphicsAlgorithm(), xy);
    		
    		polyline.setForeground(manageColor(IColorConstant.BLACK));
        }
        
        
        //add center line
    	int xy[] = new int[] { 
    		Style.leftPadding, 
			Style.topPadding + Style.IconFullHeight + Style.IconFullHeight/2, 
			x,
			Style.topPadding + Style.IconFullHeight + Style.IconFullHeight/2
			};
		Polyline polyline = Graphiti.getCreateService().createPlainPolyline(MethodPattern.HeaderShape.getGraphicsAlgorithm(), xy);
		
		polyline.setForeground(manageColor(IColorConstant.BLACK));
        
           
        return true;
    }
}