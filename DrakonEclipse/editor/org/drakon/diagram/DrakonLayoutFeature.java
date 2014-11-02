package org.drakon.diagram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
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

public class DrakonLayoutFeature extends AbstractLayoutFeature {
 
    private static final int MIN_HEIGHT = 30;
 
    private static final int MIN_WIDTH = 50;
    DrakonFeatureProvider patternProvider;
    public DrakonLayoutFeature(DrakonFeatureProvider fp) {
        super(fp);
        patternProvider = fp;
    }
 
    public boolean canLayout(ILayoutContext context) {
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
        		
        		PictogramElement el = patternProvider.getPictogramElementForBusinessObject(icon);
        		if (el != null ) {
        			IPattern pat = patternProvider.getPatternForPictogramElement(el);
        			if (pat != null )  {
        				
        				pat.layout(new LayoutContext(el));
        			}
        		}
        		icon = icon.getNextIcon();
        	}
        	while(icon != null);
        	
        	///////////////////
        	//центральная линия для связи икон
        	int xy[] = new int[] { x + Style.IconWidth/2, 40 + Style.HeightInterval, x+ Style.IconWidth/2, y - Style.IconHeight};
    		Polyline polyline = Graphiti.getCreateService().createPlainPolyline(MethodPattern.HeaderShape.getGraphicsAlgorithm(), xy);
    		
    		polyline.setForeground(manageColor(IColorConstant.BLACK));
    		/////////////////
        }
        
        
        //горизонтальная связь между бранчами
    	int xy[] = new int[] { 
    		Style.leftPadding, 
			Style.topPadding + Style.IconFullHeight + Style.IconHeight/2, 
			x,
			Style.topPadding + Style.IconFullHeight + Style.IconHeight/2
			};
		Polyline polyline = Graphiti.getCreateService().createPlainPolyline(MethodPattern.HeaderShape.getGraphicsAlgorithm(), xy);
		
		polyline.setForeground(manageColor(IColorConstant.BLACK));
        /////////////////////
		
           
        return true;
    }
}