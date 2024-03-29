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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.profile.edit.policies;

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
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.commands.wrappers.EMFtoGMFCommandWrapper;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.DependencyBranchCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.DependencyBranchReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.DependencyCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.DependencyReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ElementImportCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ElementImportReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.PackageImportCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.PackageImportReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ProfileApplicationCreateCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.commands.ProfileApplicationReorientCommand;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationBranchEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.AssociationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.CommentEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ConstraintEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DataTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyBranchEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.DependencyEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.EnumerationEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.MetaclassEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ModelEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PackageImportEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.PrimitiveTypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileApplicationEditPart;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfileEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.ProfilePackageableElementCompartmentEditPartTN;
import org.eclipse.papyrus.uml.diagram.profile.edit.parts.StereotypeEditPartCN;
import org.eclipse.papyrus.uml.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class ProfileItemSemanticEditPolicyTN extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProfileItemSemanticEditPolicyTN() {
		super(UMLElementTypes.Profile_1030);
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
			case ProfilePackageableElementCompartmentEditPartTN.VISUAL_ID:
				for(Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node)cit.next();
					switch(UMLVisualIDRegistry.getVisualID(cnode)) {
					case StereotypeEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case ExtensionEditPart.VISUAL_ID:
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ModelEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case ProfileApplicationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ProfileEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case ProfileApplicationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case ProfileApplicationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case PackageEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case ProfileApplicationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ConstraintEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case EnumerationEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case PrimitiveTypeEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case DataTypeEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case CommentEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case MetaclassEditPartCN.VISUAL_ID:


						for(Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(incomingLink)) {
							case CommentAnnotatedElementEditPart.VISUAL_ID:
							case ConstraintConstrainedElementEditPart.VISUAL_ID:
								DestroyReferenceRequest destroyRefReq = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(destroyRefReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							case ExtensionEditPart.VISUAL_ID:
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
								break;
							}
						}

						for(Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge)it.next();
							switch(UMLVisualIDRegistry.getVisualID(outgoingLink)) {
							case AssociationEditPart.VISUAL_ID:
							case AssociationBranchEditPart.VISUAL_ID:
							case GeneralizationEditPart.VISUAL_ID:
							case DependencyEditPart.VISUAL_ID:
							case DependencyBranchEditPart.VISUAL_ID:
							case ElementImportEditPart.VISUAL_ID:
							case PackageImportEditPart.VISUAL_ID:
								DestroyElementRequest destroyEltReq = new DestroyElementRequest(outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(destroyEltReq));
								cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
								break;
							}
						}
						cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
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
		if(UMLElementTypes.ProfileApplication_1045 == req.getElementType()) {
			return getGEFWrapper(new ProfileApplicationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4008 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4018 == req.getElementType()) {
			return getGEFWrapper(new DependencyBranchCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ElementImport_1064 == req.getElementType()) {
			return getGEFWrapper(new ElementImportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.PackageImport_1065 == req.getElementType()) {
			return getGEFWrapper(new PackageImportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.CommentAnnotatedElement_1022 == req.getElementType()) {
			return null;
		}
		if(UMLElementTypes.ConstraintConstrainedElement_4014 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if(UMLElementTypes.ProfileApplication_1045 == req.getElementType()) {
			return getGEFWrapper(new ProfileApplicationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4008 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.Dependency_4018 == req.getElementType()) {
			return getGEFWrapper(new DependencyBranchCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ElementImport_1064 == req.getElementType()) {
			return getGEFWrapper(new ElementImportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.PackageImport_1065 == req.getElementType()) {
			return getGEFWrapper(new PackageImportCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.CommentAnnotatedElement_1022 == req.getElementType()) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if(UMLElementTypes.ConstraintConstrainedElement_4014 == req.getElementType()) {
			return getGEFWrapper(new ConstraintConstrainedElementCreateCommand(req, req.getSource(), req.getTarget()));
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
		case ProfileApplicationEditPart.VISUAL_ID:
			return getGEFWrapper(new ProfileApplicationReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case DependencyBranchEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyBranchReorientCommand(req));
		case ElementImportEditPart.VISUAL_ID:
			return getGEFWrapper(new ElementImportReorientCommand(req));
		case PackageImportEditPart.VISUAL_ID:
			return getGEFWrapper(new PackageImportReorientCommand(req));
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
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
