package org.drakon.features;
import org.eclipse.emf.ecore.resource.Resource;
import org.drakon.main.Messages;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import KragsteinMethod.KragsteinMethodFactory;

import KragsteinMethod.*;

public class CreateBranchFeature extends AbstractCreateFeature {

	public CreateBranchFeature(IFeatureProvider fp) {
		super(fp, Messages.CreateBranchFeature_name, Messages.CreateBranchFeature_name);
	}

	public boolean canCreate(ICreateContext context) {
		if (context.getTargetContainer() instanceof Diagram) {
			// Add new board only in case of an empty diagram
			return true;
		}
		return false;
	}

	public Object[] create(ICreateContext context) {
		Resource resource = context.getTargetContainer().eResource();

		
		Route route = KragsteinMethodFactory.eINSTANCE.createRoute();
		
		Branch branch = KragsteinMethodFactory.eINSTANCE.createBranch();
		
		branch.setRoute(route);
		resource.getContents().add(branch);
		resource.getContents().add(route);
		branch.setName("branch 1");
		
		Headline head = KragsteinMethodFactory.eINSTANCE.createHeadline();
		head.setName("branch 1");
		route.getIcon().add(head);
		// Delegate to the add feature
		addGraphicalRepresentation(context, head);
		

		return new Object[] { head };
	}
}