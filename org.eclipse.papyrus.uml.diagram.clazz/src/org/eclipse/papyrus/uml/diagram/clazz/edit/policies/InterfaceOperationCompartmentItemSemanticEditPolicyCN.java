/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.uml.diagram.clazz.edit.commands.OperationForInterfaceCreateCommand;
import org.eclipse.papyrus.uml.diagram.clazz.providers.UMLElementTypes;

/**
 * @generated
 */
public class InterfaceOperationCompartmentItemSemanticEditPolicyCN extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceOperationCompartmentItemSemanticEditPolicyCN() {
		super(UMLElementTypes.Interface_3023);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if(UMLElementTypes.Operation_3007 == req.getElementType()) {
			return getGEFWrapper(new OperationForInterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
