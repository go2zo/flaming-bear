/*****************************************************************************
 * Copyright (c) 2010 Atos Origin.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Atos Origin - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.activity.edit.dialogs;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.infra.core.modelsetquery.ModelSetQuery;
import org.eclipse.papyrus.uml.diagram.activity.part.Messages;
import org.eclipse.papyrus.uml.diagram.activity.preferences.IActivityPreferenceConstants;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.edit.providers.UMLItemPropertyDescriptor;

/**
 * This class provides a dialog to initialize a CallBehaviorAction at its creation.
 */
public class CreateCallBehaviorActionDialog extends CreateCallActionDialog {

	/**
	 * Create a new dialog to initialize a CallBehaviorAction.
	 * 
	 * @param shell
	 *        parent shell
	 * @param owner
	 *        the activity that owns the action
	 */
	public CreateCallBehaviorActionDialog(Shell shell, Activity owner) {
		super(shell, owner);
	}

	/**
	 * Get the id of the preference storing whether selection is the default choice.
	 * 
	 * @return preference id
	 */
	protected String getSelectionIsDefaultPreference() {
		return IActivityPreferenceConstants.PREF_NEW_CALL_BEHAVIOR_ACTION_SELECT_AS_DEFAULT;
	}

	/**
	 * Get the id of the preference storing the last selected owner.
	 * 
	 * @return preference id
	 */
	protected String getCreationDefaultOwnerPreference() {
		return IActivityPreferenceConstants.PREF_NEW_CALL_BEHAVIOR_ACTION_CREATION_OWNER;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateInvocationActionDialog#getInvocationCreationSectionTitle()
	 */
	@Override
	protected String getInvocationCreationSectionTitle() {
		return Messages.CreateCallActionDialog_BehaviorInvocationCreationTitle;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateInvocationActionDialog#getInvocationCreationSectionHelp()
	 */
	@Override
	protected String getInvocationCreationSectionHelp() {
		return Messages.CreateCallActionDialog_BehaviorInvocationCreationHelp;
	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateInvocationActionDialog#getInvocationSelectionSectionTitle()
	 */
	@Override
	protected String getInvocationSelectionSectionTitle() {
		return Messages.CreateCallActionDialog_BehaviorInvocationSelectionTitle;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getTitle()
	 */
	@Override
	protected String getTitle() {
		return Messages.CreateCallActionDialog_BehaviorTitle;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getInvocationFeature()
	 */
	@Override
	protected EReference getInvocationFeature() {
		return UMLPackage.eINSTANCE.getCallBehaviorAction_Behavior();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#hasOutParameters(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected boolean hasOutParameters(EObject invokedObject) {
		if(invokedObject instanceof Behavior) {
			for(Parameter param : ((Behavior)invokedObject).getOwnedParameters()) {
				if(ParameterDirectionKind.INOUT_LITERAL.equals(param.getDirection()) || ParameterDirectionKind.OUT_LITERAL.equals(param.getDirection())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getPossibleInvokedParents()
	 */
	@Override
	protected Set<EObject> getPossibleInvokedParents(EObject actionParent) {
		Collection<EObject> packages = ModelSetQuery.getObjectsOfType(actionParent, UMLPackage.eINSTANCE.getPackage());
		Collection<EObject> behavioredClassifiers = UMLItemPropertyDescriptor.getReachableObjectsOfType(actionParent, UMLPackage.eINSTANCE.getBehavioredClassifier());
		Set<EObject> result = new HashSet<EObject>(packages);
		result.addAll(behavioredClassifiers);
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateInvocationActionDialog#isPossibleInvokedParent(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected boolean isPossibleInvokedParent(EObject parent) {
		return parent instanceof Package || parent instanceof BehavioredClassifier;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getPossibleInvokedTypes()
	 */
	@Override
	protected EClass[] getPossibleInvokedTypes() {
		return new EClass[]{ UMLPackage.eINSTANCE.getActivity(), UMLPackage.eINSTANCE.getInteraction(), UMLPackage.eINSTANCE.getOpaqueBehavior(), UMLPackage.eINSTANCE.getFunctionBehavior(), UMLPackage.eINSTANCE.getStateMachine(), UMLPackage.eINSTANCE.getProtocolStateMachine() };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getCreationLabel()
	 */
	@Override
	protected String getCreationLabel() {
		return Messages.CreateCallActionDialog_CreateBehavior;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getSelectionLabel()
	 */
	@Override
	protected String getSelectionLabel() {
		return Messages.CreateCallActionDialog_SelectBehavior;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.uml.diagram.activity.edit.dialogs.CreateCallActionDialog#getParentImage()
	 */
	@Override
	protected Image getParentImage() {
		return UMLElementTypes.getImage(UMLPackage.eINSTANCE.getPackage());
	}

}
