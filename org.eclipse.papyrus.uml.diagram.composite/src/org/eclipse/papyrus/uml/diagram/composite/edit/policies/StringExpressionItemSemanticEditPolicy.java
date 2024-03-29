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
package org.eclipse.papyrus.uml.diagram.composite.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.AbstractionCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.ComponentRealizationCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.DependencyCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.DeploymentCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.DurationObservationEventCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.DurationObservationEventReorientCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.InformationFlowCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.InterfaceRealizationCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.ManifestationCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.RealizationCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.RoleBindingCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.RoleBindingReorientCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.SubstitutionCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.TimeObservationEventCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.TimeObservationEventReorientCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.commands.UsageCreateCommand;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.AbstractionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ComponentRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DeploymentEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.DurationObservationEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InformationFlowEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.ManifestationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.RealizationEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.RoleBindingEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.SubstitutionEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.TimeObservationEventEditPart;
import org.eclipse.papyrus.uml.diagram.composite.edit.parts.UsageEditPart;
import org.eclipse.papyrus.uml.diagram.composite.providers.UMLElementTypes;

/**
 * @generated
 */
public class StringExpressionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StringExpressionItemSemanticEditPolicy() {
		super(UMLElementTypes.StringExpression_2100);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		EObject selectedEObject = req.getElementToDestroy();
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(selectedEObject);
		if(provider != null) {
			// Retrieve delete command from the Element Edit service
			ICommand deleteCommand = provider.getEditCommand(req);

			if(deleteCommand != null) {
				return new ICommandProxy(deleteCommand);
			}
		}
		return UnexecutableCommand.INSTANCE;
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
		if(UMLElementTypes.CommentAnnotatedElement_4002 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.ConstraintConstrainedElement_4003 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.ComponentRealization_4004 == req.getElementType()) {
			return getGEFWrapper(new ComponentRealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.InterfaceRealization_4005 == req.getElementType()) {
			return getGEFWrapper(new InterfaceRealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Substitution_4011 == req.getElementType()) {
			return getGEFWrapper(new SubstitutionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Realization_4006 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Manifestation_4012 == req.getElementType()) {
			return getGEFWrapper(new ManifestationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Abstraction_4007 == req.getElementType()) {
			return getGEFWrapper(new AbstractionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Usage_4008 == req.getElementType()) {
			return getGEFWrapper(new UsageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Deployment_4009 == req.getElementType()) {
			return getGEFWrapper(new DeploymentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4017 == req.getElementType()) {
			return getGEFWrapper(new RoleBindingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4010 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.TimeObservationEvent_4018 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.DurationObservationEvent_4019 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.InformationFlow_4021 == req.getElementType()) {
			return getGEFWrapper(new InformationFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if(UMLElementTypes.CommentAnnotatedElement_4002 == req.getElementType()) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ConstraintConstrainedElement_4003 == req.getElementType()) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ComponentRealization_4004 == req.getElementType()) {
			return getGEFWrapper(new ComponentRealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.InterfaceRealization_4005 == req.getElementType()) {
			return getGEFWrapper(new InterfaceRealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Substitution_4011 == req.getElementType()) {
			return getGEFWrapper(new SubstitutionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Realization_4006 == req.getElementType()) {
			return getGEFWrapper(new RealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Manifestation_4012 == req.getElementType()) {
			return getGEFWrapper(new ManifestationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Abstraction_4007 == req.getElementType()) {
			return getGEFWrapper(new AbstractionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Usage_4008 == req.getElementType()) {
			return getGEFWrapper(new UsageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Deployment_4009 == req.getElementType()) {
			return getGEFWrapper(new DeploymentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4017 == req.getElementType()) {
			return getGEFWrapper(new RoleBindingCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4010 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.TimeObservationEvent_4018 == req.getElementType()) {
			return getGEFWrapper(new TimeObservationEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.DurationObservationEvent_4019 == req.getElementType()) {
			return getGEFWrapper(new DurationObservationEventCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.InformationFlow_4021 == req.getElementType()) {
			return getGEFWrapper(new InformationFlowCreateCommand(req, req.getSource(), req.getTarget()));
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
		case ComponentRealizationEditPart.VISUAL_ID:
		case InterfaceRealizationEditPart.VISUAL_ID:
		case SubstitutionEditPart.VISUAL_ID:
		case RealizationEditPart.VISUAL_ID:
		case ManifestationEditPart.VISUAL_ID:
		case AbstractionEditPart.VISUAL_ID:
		case UsageEditPart.VISUAL_ID:
		case DeploymentEditPart.VISUAL_ID:
		case DependencyEditPart.VISUAL_ID:
		case InformationFlowEditPart.VISUAL_ID:
			IElementEditService provider = ElementEditServiceUtils.getCommandProvider(req.getRelationship());
			if(provider == null) {
				return UnexecutableCommand.INSTANCE;
			}
			// Retrieve re-orient command from the Element Edit service
			ICommand reorientCommand = provider.getEditCommand(req);
			if(reorientCommand == null) {
				return UnexecutableCommand.INSTANCE;
			}
			return getGEFWrapper(reorientCommand.reduce());
		case RoleBindingEditPart.VISUAL_ID:
			return getGEFWrapper(new RoleBindingReorientCommand(req));
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
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new ConstraintConstrainedElementReorientCommand(req));
		case TimeObservationEventEditPart.VISUAL_ID:
			return getGEFWrapper(new TimeObservationEventReorientCommand(req));
		case DurationObservationEventEditPart.VISUAL_ID:
			return getGEFWrapper(new DurationObservationEventReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
