/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.sysml.diagram.common.edit.part;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.sysml.diagram.common.edit.policy.StructureCompartmentSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.edit.part.AbstractShapeCompartmentEditPart;

public class StructureCompartmentEditPart extends AbstractShapeCompartmentEditPart {

	public final static String COMPARTMENT_NAME = "structure";

	public StructureCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StructureCompartmentSemanticEditPolicy());
		// Start of user code custom edit policies
		// End of user code
	}

	@Override
	public String getCompartmentName() {
		return COMPARTMENT_NAME;
	}
}
