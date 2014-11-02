package org.drakon.patterns;

import org.eclipse.emf.ecore.EObject;

import KragsteinMethod.Branch;
import KragsteinMethod.Icon;
import KragsteinMethod.Method;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class PatternUtils {
	public  static void SetNextIcon(EObject obj, Icon act, Diagram diagram) {
		if (obj instanceof Icon) {
			Icon icon = (Icon)obj;
			Icon prevIcon  = icon.getNextIcon();
			icon.setNextIcon(act);
			act.setNextIcon(prevIcon);
		}
		else {
			
			 Method method = (Method)diagram.eResource().getContents().get(1);
		     Branch branch = method.getBranch().get(0);
		     branch.getRoute().getIcon().add(act);
		        	
		}
	}
}
