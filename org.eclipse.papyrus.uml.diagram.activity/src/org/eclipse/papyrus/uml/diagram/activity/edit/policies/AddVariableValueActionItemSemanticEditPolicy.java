package org.eclipse.papyrus.uml.diagram.activity.edit.policies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ActionLocalPostconditionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ActionLocalPostconditionReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ActionLocalPreconditionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ActionLocalPreconditionReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CommentLinkCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CommentLinkReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ControlFlowCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ExceptionHandlerCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ExceptionHandlerReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.InputPinInAddVariableValueActionAsInsertAtCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.InputPinInAddVariableValueActionAsValueCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ObjectFlowCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.CommentLinkEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InputPinInAddVariableValueActionAsInsertAtEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.InputPinInAddVariableValueActionAsValueEditPart;
import org.eclipse.papyrus.uml.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */
public class AddVariableValueActionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AddVariableValueActionItemSemanticEditPolicy() {
		super(UMLElementTypes.AddVariableValueAction_3099);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if(UMLElementTypes.InputPin_3100 == req.getElementType()) {
			return getGEFWrapper(new InputPinInAddVariableValueActionAsInsertAtCreateCommand(req));
		}
		if(UMLElementTypes.InputPin_3101 == req.getElementType()) {
			return getGEFWrapper(new InputPinInAddVariableValueActionAsValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View)getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(true);

		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if(annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			List<EObject> todestroy = new ArrayList<EObject>();
			todestroy.add(req.getElementToDestroy());
			//cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
			cmd.add(new EMFtoGMFCommandWrapper(new DeleteCommand(getEditingDomain(), todestroy)));
		} else {
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View)getHost().getModel();
		for(Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node)nit.next();
			switch(UMLVisualIDRegistry.getVisualID(node)) {
			case InputPinInAddVariableValueActionAsInsertAtEditPart.VISUAL_ID:

				for(Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge)it.next();
					switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentLinkEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					case ObjectFlowEditPart.VISUAL_ID:
					case ControlFlowEditPart.VISUAL_ID:
					case ExceptionHandlerEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				for(Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge)it.next();
					switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					case ObjectFlowEditPart.VISUAL_ID:
					case ControlFlowEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
						break;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case InputPinInAddVariableValueActionAsValueEditPart.VISUAL_ID:

				for(Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge)it.next();
					switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
					case CommentLinkEditPart.VISUAL_ID:
						DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(destroyRefReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					case ObjectFlowEditPart.VISUAL_ID:
					case ControlFlowEditPart.VISUAL_ID:
					case ExceptionHandlerEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
						break;
					}
				}

				for(Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge)it.next();
					switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
					case ObjectFlowEditPart.VISUAL_ID:
					case ControlFlowEditPart.VISUAL_ID:
						DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(destroyEltReq));
						cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
						break;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if(UMLElementTypes.ActionLocalPrecondition_4001 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPreconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ActionLocalPostcondition_4002 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPostconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ObjectFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ControlFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return getGEFWrapper(new ExceptionHandlerCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.CommentAnnotatedElement_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if(UMLElementTypes.ActionLocalPrecondition_4001 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.ActionLocalPostcondition_4002 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.ObjectFlow_4003 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ControlFlow_4004 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.CommentAnnotatedElement_4006 == req.getElementType()) {
			return getGEFWrapper(new CommentLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch(getVisualID(req)) {
		case ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectFlowReorientCommand(req));
		case ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlFlowReorientCommand(req));
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getGEFWrapper(new ExceptionHandlerReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch(getVisualID(req)) {
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPreconditionReorientCommand(req));
		case ActionLocalPostconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPostconditionReorientCommand(req));
		case CommentLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentLinkReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
