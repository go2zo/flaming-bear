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

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editparts.UMLConnectionNodeEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLinkLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.edge.InterfaceRealizationFigure;
import org.eclipse.papyrus.uml.diagram.composite.edit.policies.ComponentRealizationItemSemanticEditPolicy;

/**
 * @generated
 */
public class ComponentRealizationEditPart extends

UMLConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public ComponentRealizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComponentRealizationItemSemanticEditPolicy());
		installEditPolicy(AppliedStereotypeLinkLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeLinkLabelDisplayEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ComponentRealizationNameEditPart) {
			((ComponentRealizationNameEditPart)childEditPart).setLabel(getPrimaryShape().getNameLabel());
			return true;
		}
		if(childEditPart instanceof ComponentRealizationAppliedStereotypeEditPart) {
			((ComponentRealizationAppliedStereotypeEditPart)childEditPart).setLabel(getPrimaryShape().getAppliedStereotypeLabel());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof ComponentRealizationNameEditPart) {
			return true;
		}
		if(childEditPart instanceof ComponentRealizationAppliedStereotypeEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new InterfaceRealizationFigure();
	}

	/**
	 * @generated
	 */
	public InterfaceRealizationFigure getPrimaryShape() {
		return (InterfaceRealizationFigure)getFigure();
	}

}
