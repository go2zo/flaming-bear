/*****************************************************************************
 * Copyright (c) 2009-2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.edit.parts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.DuplicatePasteEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies.CustomDiagramDragDropEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies.RemoveOrphanViewPolicy;
import org.eclipse.papyrus.uml.diagram.composite.edit.policies.EnumerationEnumerationLiteralCompartmentItemSemanticEditPolicyCN;
import org.eclipse.papyrus.uml.diagram.composite.part.Messages;

/**
 * @generated
 */
public class EnumerationEnumerationLiteralCompartmentEditPartCN

extends ListCompartmentEditPart

{

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7049;

	/**
	 * @generated
	 */
	public EnumerationEnumerationLiteralCompartmentEditPartCN(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.EnumerationEnumerationLiteralCompartmentEditPartCN_title;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new EnumerationEnumerationLiteralCompartmentItemSemanticEditPolicyCN());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(DuplicatePasteEditPolicy.PASTE_ROLE, new DuplicatePasteEditPolicy());
		installEditPolicy("REMOVE_ORPHAN_VIEW", new RemoveOrphanViewPolicy()); //$NON-NLS-1$
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new CustomDiagramDragDropEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if(getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if(NotationPackage.eINSTANCE.getSize_Width().equals(feature) || NotationPackage.eINSTANCE.getSize_Height().equals(feature) || NotationPackage.eINSTANCE.getLocation_X().equals(feature) || NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
		super.handleNotificationEvent(notification);
	}

	/**
	 * @generated
	 */
	protected void refreshBounds() {
		int width = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}
}
