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
 *  Yann Tanguy (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.composite.custom.edit.policies;

import java.util.Iterator;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.BorderItemResizableEditPolicy;
import org.eclipse.papyrus.uml.diagram.composite.custom.locators.PortPositionLocator;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ClassCompositeEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.PortEditPart;
import org.eclipse.papyrus.uml.diagram.composite.part.UMLVisualIDRegistry;

/**
 * This edit policy replaces the GMF generated edit policy for StructuredClassifier(s).
 * In particular it provides a getCreateCommands that add a ChangeBoundRequest on a created Port
 * in order to locate it at the cursor position.
 * An example of code generated by GMF can be found in {@link ClassCompositeEditPart#createLayoutEditPolicy()}.
 */
public class StructuredClassifierLayoutEditPolicy extends LayoutEditPolicy {

	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		View childView = (View)child.getModel();
		switch(UMLVisualIDRegistry.getVisualID(childView)) {
		case PortEditPart.VISUAL_ID:

			return new BorderItemResizableEditPolicy();

		}
		EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
		if(result == null) {
			result = new NonResizableEditPolicy();
		}
		return result;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		if(request instanceof CreateViewAndElementRequest) {

			CreateViewAndElementRequest req = (CreateViewAndElementRequest)request;

			TransactionalEditingDomain editingDomain = ((IGraphicalEditPart)getHost()).getEditingDomain();

			CompositeTransactionalCommand cc = new CompositeTransactionalCommand(editingDomain, DiagramUIMessages.AddCommand_Label);
			Iterator<?> iter = req.getViewDescriptors().iterator();

			// Retrieve parent location
			Point parentLoc = getHostFigure().getBounds().getLocation().getCopy();

			// Compute relative creation location
			Point requestedLocation = request.getLocation().getCopy();
			getHostFigure().translateToRelative(requestedLocation);

			// Create proposed creation bounds and use the locator to find the expected position
			PortPositionLocator locator = new PortPositionLocator(getHostFigure(), PositionConstants.NONE);
			Rectangle proposedBounds = new Rectangle(requestedLocation, new Dimension(20, 20));
			Rectangle preferredBounds = locator.getPreferredLocation(proposedBounds);

			// Convert the calculated preferred bounds as relative to parent location
			Rectangle creationBounds = preferredBounds.getTranslated(parentLoc.getNegated());

			while(iter.hasNext()) {

				CreateViewRequest.ViewDescriptor viewDescriptor = (CreateViewRequest.ViewDescriptor)iter.next();
				cc.compose(new SetBoundsCommand(editingDomain, DiagramUIMessages.SetLocationCommand_Label_Resize, viewDescriptor, creationBounds));
			}

			if(cc.reduce() == null)
				return null;

			return new ICommandProxy(cc.reduce());
		}
		return null;
	}

	@Override
	protected Command getMoveChildrenCommand(Request request) {
		return null;
	}
}
