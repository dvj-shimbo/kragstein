package org.drakon.features;
import org.eclipse.emf.ecore.resource.Resource;
import org.drakon.main.Messages;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import KragsteinMethod.KragsteinMethodFactory;

import KragsteinMethod.*;

public class CreateHeadlineFeature extends AbstractCreateFeature {

	public CreateHeadlineFeature(IFeatureProvider fp) {
		super(fp, Messages.CreateBranchFeature_name, Messages.CreateBranchFeature_name);
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
		resource.getContents().add(header);
		method.setHeader(header);
		
		Route route = KragsteinMethodFactory.eINSTANCE.createRoute();
		
		Branch branch = KragsteinMethodFactory.eINSTANCE.createBranch();
		
		branch.setRoute(route);
		
		branch.setName("branch 1");
		Headline head = KragsteinMethodFactory.eINSTANCE.createHeadline();
		
		head.setName("branch 1");
		Adress addr = KragsteinMethodFactory.eINSTANCE.createAdress();
		
		route.getIcon().add(head);
		route.getIcon().add(addr);
		head.setNextIcon(addr);
		
		// Delegate to the add feature
		addGraphicalRepresentation(context, method);
		

		return new Object[] { method };
	}
}