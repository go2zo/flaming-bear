/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.groupcontainment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActivityPartitionActivityPartitionContentCompartmentEditPart;
import org.eclipse.papyrus.uml.diagram.common.groups.groupcontainment.AbstractContainerNodeDescriptor;
import org.eclipse.papyrus.uml.diagram.common.util.DiagramEditPartsUtil;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * The descriptor for ActivityPartition node used by org.eclipse.papyrus.uml.diagram.common.groups.groupcontainment extension point.
 * 
 * @author vhemery
 */
public class ActivityPartitionContainment extends AbstractContainerNodeDescriptor {

	/**
	 * Get the eclass of the model eobject represented by the node
	 * 
	 * @return ActivityPartition eclass
	 */
	public EClass getContainerEClass() {
		return UMLPackage.eINSTANCE.getActivityPartition();
	}

	/**
	 * Get the area in which contained children are located.
	 * 
	 * @param containerPart
	 *        the ActivityPartition part
	 * @return the rectangle in which nodes are considered as children of this part
	 */
	public Rectangle getContentArea(IGraphicalEditPart containerPart) {
		Rectangle bounds = containerPart.getContentPane().getBounds().getCopy();
		containerPart.getContentPane().translateToAbsolute(bounds);
		return bounds;
	}

	/**
	 * Get the list of references linking the ActivityPartition to children element.
	 * 
	 * @return the references to contained elements
	 */
	public List<EReference> getChildrenReferences() {
		List<EReference> references = new ArrayList<EReference>(3);
		references.add(UMLPackage.eINSTANCE.getActivityPartition_Node());
		references.add(UMLPackage.eINSTANCE.getActivityPartition_Edge());
		references.add(UMLPackage.eINSTANCE.getActivityPartition_Subpartition());
		return references;
	}

	/**
	 * Get the activity partition content compartment edit part from a view of the activity partition.
	 * 
	 * @param nodeView
	 *        a view of the node, which can be either the compartment's view or the primary view of the containing node
	 * @param diagramPart
	 *        the diagram edit part (used to recover parts from views)
	 * @return the activity partition content compartment edit part
	 */
	public IGraphicalEditPart getPartFromView(View nodeView, DiagramEditPart diagramPart) {
		EditPart part = DiagramEditPartsUtil.getEditPartFromView(nodeView, diagramPart);
		if(part instanceof GraphicalEditPart) {
			String hint = "" + ActivityPartitionActivityPartitionContentCompartmentEditPart.VISUAL_ID;
			return ((GraphicalEditPart)part).getChildBySemanticHintOnPrimaryView(hint);
		}
		return null;
	}

}
