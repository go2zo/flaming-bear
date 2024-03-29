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

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Abstract non-diagram specific edit part for node label representing {@link NamedElement}.
 * This class is adapted from edit parts generated by GMF Tooling.
 */
public class NamedElementNodeLabelNameEditPart extends AbstractElementNodeLabelEditPart {

	public NamedElementNodeLabelNameEditPart(View view) {
		super(view);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
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
