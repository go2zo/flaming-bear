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
package org.eclipse.papyrus.uml.diagram.common.edit.part;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.gmf.diagram.common.edit.policy.LinkLabelDragEditPolicy;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Edit Part for link label showing {@link NamedElement} name.
 */
public class NamedElementLinkLabelNameEditPart extends AbstractElementLabelEditPart {

	/** Constructor */
	public NamedElementLinkLabelNameEditPart(View view) {
		super(view);
		addSnapBackLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new LinkLabelDragEditPolicy());
	}

	/**
	 * {@inheritDoc}
	 */
	public String getLabelRole() {
		return "Name"; //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	public String getIconPathRole() {
		return ""; //$NON-NLS-1$
	}
}
