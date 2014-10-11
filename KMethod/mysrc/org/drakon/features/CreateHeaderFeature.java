package org.drakon.features;
import org.eclipse.emf.ecore.resource.Resource;
import org.drakon.main.Messages;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import KragsteinMethod.KragsteinMethodFactory;

import KragsteinMethod.*;

public class CreateHeaderFeature extends AbstractCreateFeature {

	public CreateHeaderFeature(IFeatureProvider fp) {
		super(fp, Messages.CreateHeaderFeature_name, Messages.CreateHeaderFeature_name);
	}

	public boolean canCreate(ICreateContext context) {
		if (context.getTargetContainer() instanceof Diagram) {
			// Add new board only in case of an empty diagram
			return context.getTargetContainer().getChildren().size() == 0;
		}
		return false;
	}

	public Object[] create(ICreateContext context) {
		Resource resource = context.getTargetContainer().eResource();

		Method method = KragsteinMethodFactory.eINSTANCE.createMethod();
		
		// Create a new chess board and add it to an EMF resource
		Header header = KragsteinMethodFactory.eINSTANCE.createHeader();
		header.setName("Method");
		method.setHeader(header);
		
		resource.getContents().add(method);
		
		resource.getContents().add(header);
	
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, header);
		

		return new Object[] { header };
	}
}