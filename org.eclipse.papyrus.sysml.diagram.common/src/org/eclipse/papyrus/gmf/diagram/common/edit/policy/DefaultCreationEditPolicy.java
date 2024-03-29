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
package org.eclipse.papyrus.gmf.diagram.common.edit.policy;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.gmf.diagram.common.commands.CreateViewCommand;

/**
 * Default creation edit policy replacement used to replace {@link CreateCommand} by {@link CreateViewCommand},
 * different implementation of the canExecute() method.
 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=346739
 */
public class DefaultCreationEditPolicy extends CreationEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getReparentCommand(ChangeBoundsRequest request) {
		// Forbid re-parent in this edit policy (to be used by compartment)
		// in order to avoid node to be moved in compartments.
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getCreateCommand(CreateViewRequest request) {

		// This overrides getCreatCommand in order to use a specific CreateViewCommand (instead of
		// org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand.
		
		// The original CreateCommand#canExecute() implementation rely on ViewProvider#provides(CreateViewForKindOperation op)
		// method to know if a view can be created. The problem is that this method is incorrectly generated by GMF Tooling and should be avoided.
		
		// CreateViewCommand replace the semantic adapter in its call to ViewService to know if a provider exists.
		
        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
        CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
        
        Iterator<? extends ViewDescriptor> descriptors = request.getViewDescriptors().iterator();
		while (descriptors.hasNext()) {
			
			CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor)descriptors.next();
			CreateCommand createCommand = new CreateViewCommand(editingDomain, descriptor, (View)(getHost().getModel()));
			cc.compose(createCommand);
			
		}
		
		return new ICommandProxy(cc.reduce());

	}

}
