package org.drakon.features;
import org.eclipse.emf.ecore.resource.Resource;
import org.drakon.main.Messages;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import KragsteinMethod.KragsteinMethodFactory;

import KragsteinMethod.*;

public class CreateParameterFeature extends AbstractCreateFeature {

	public CreateParameterFeature(IFeatureProvider fp) {
		super(fp, Messages.CreateParameterFeature_name, Messages.CreateParameterFeature_name);
	}

	public boolean canCreate(ICreateContext context) {
		if (context.getTargetContainer() instanceof Diagram) {
			// Add new board only in case of an empty diagram
			return context.getTargetContainer().eResource().getContents().size() > 0;
		}
		return false;
	}

	public Object[] create(ICreateContext context) {
		Resource resource = context.getTargetContainer().eResource();
		
		Parameter param = KragsteinMethodFactory.eINSTANCE.createParameter();
		param.setName("Param");
		//head.getParameter().add(param);
		resource.getContents().add(param);
		
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, param);
		

		return new Object[] { param };
	}
}