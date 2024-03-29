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
package org.eclipse.papyrus.uml.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.AcceptEventActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ActivityFinalNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.AddStructuralFeatureValueActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.AddVariableValueActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.BroadcastSignalActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CallBehaviorActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CallOperationActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CentralBufferNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ConditionalNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.CreateObjectActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.DataStoreNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.DecisionNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.DestroyObjectActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ExpansionRegionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.FlowFinalNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ForkNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.InitialNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.JoinNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.LoopNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.MergeNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.OpaqueActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ReadStructuralFeatureActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ReadVariableActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.SendObjectActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.SendSignalActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.SequenceNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.StructuredActivityNodeCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.edit.commands.ValueSpecificationActionCreateCommand;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */
public class ConditionalNodeStructuredActivityNodeContentCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalNodeStructuredActivityNodeContentCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.ConditionalNode_3069);
	}

	/**
	 * @generated NOT (update at each gmf change) moved local conditions creation commands to {@link CreateActionLocalConditionEditPolicy}
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if(UMLElementTypes.InitialNode_3004 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if(UMLElementTypes.ActivityFinalNode_3005 == req.getElementType()) {
			return getGEFWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		if(UMLElementTypes.FlowFinalNode_3006 == req.getElementType()) {
			return getGEFWrapper(new FlowFinalNodeCreateCommand(req));
		}
		if(UMLElementTypes.OpaqueAction_3007 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActionCreateCommand(req));
		}
		if(UMLElementTypes.CallBehaviorAction_3008 == req.getElementType()) {
			return getGEFWrapper(new CallBehaviorActionCreateCommand(req));
		}
		if(UMLElementTypes.CallOperationAction_3010 == req.getElementType()) {
			return getGEFWrapper(new CallOperationActionCreateCommand(req));
		}
		//		if(UMLElementTypes.DurationConstraint_3034 == req.getElementType()) {
		//			return getGEFWrapper(new DurationConstraintAsLocalPrecondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.DurationConstraint_3035 == req.getElementType()) {
		//			return getGEFWrapper(new DurationConstraintAsLocalPostcondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.TimeConstraint_3036 == req.getElementType()) {
		//			return getGEFWrapper(new TimeConstraintAsLocalPrecondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.TimeConstraint_3037 == req.getElementType()) {
		//			return getGEFWrapper(new TimeConstraintAsLocalPostcondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.InteractionConstraint_3030 == req.getElementType()) {
		//			return getGEFWrapper(new InteractionConstraintAsLocalPrecondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.InteractionConstraint_3031 == req.getElementType()) {
		//			return getGEFWrapper(new InteractionConstraintAsLocalPostcondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.IntervalConstraint_3032 == req.getElementType()) {
		//			return getGEFWrapper(new IntervalConstraintAsLocalPrecondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.IntervalConstraint_3033 == req.getElementType()) {
		//			return getGEFWrapper(new IntervalConstraintAsLocalPostcondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.Constraint_3011 == req.getElementType()) {
		//			return getGEFWrapper(new ConstraintAsLocalPrecondCreateCommand(req));
		//		}
		//		if(UMLElementTypes.Constraint_3012 == req.getElementType()) {
		//			return getGEFWrapper(new ConstraintAsLocalPostcondCreateCommand(req));
		//		}
		if(UMLElementTypes.DecisionNode_3038 == req.getElementType()) {
			return getGEFWrapper(new DecisionNodeCreateCommand(req));
		}
		if(UMLElementTypes.MergeNode_3039 == req.getElementType()) {
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		if(UMLElementTypes.ForkNode_3040 == req.getElementType()) {
			return getGEFWrapper(new ForkNodeCreateCommand(req));
		}
		if(UMLElementTypes.JoinNode_3041 == req.getElementType()) {
			return getGEFWrapper(new JoinNodeCreateCommand(req));
		}
		if(UMLElementTypes.DataStoreNode_3078 == req.getElementType()) {
			return getGEFWrapper(new DataStoreNodeCreateCommand(req));
		}
		if(UMLElementTypes.SendObjectAction_3042 == req.getElementType()) {
			return getGEFWrapper(new SendObjectActionCreateCommand(req));
		}
		if(UMLElementTypes.SendSignalAction_3052 == req.getElementType()) {
			return getGEFWrapper(new SendSignalActionCreateCommand(req));
		}
		if(UMLElementTypes.AcceptEventAction_3063 == req.getElementType()) {
			return getGEFWrapper(new AcceptEventActionCreateCommand(req));
		}
		if(UMLElementTypes.ValueSpecificationAction_3076 == req.getElementType()) {
			return getGEFWrapper(new ValueSpecificationActionCreateCommand(req));
		}
		if(UMLElementTypes.ConditionalNode_3069 == req.getElementType()) {
			return getGEFWrapper(new ConditionalNodeCreateCommand(req));
		}
		if(UMLElementTypes.ExpansionRegion_3070 == req.getElementType()) {
			return getGEFWrapper(new ExpansionRegionCreateCommand(req));
		}
		if(UMLElementTypes.LoopNode_3071 == req.getElementType()) {
			return getGEFWrapper(new LoopNodeCreateCommand(req));
		}
		if(UMLElementTypes.SequenceNode_3073 == req.getElementType()) {
			return getGEFWrapper(new SequenceNodeCreateCommand(req));
		}
		if(UMLElementTypes.StructuredActivityNode_3065 == req.getElementType()) {
			return getGEFWrapper(new StructuredActivityNodeCreateCommand(req));
		}
		if(UMLElementTypes.CreateObjectAction_3086 == req.getElementType()) {
			return getGEFWrapper(new CreateObjectActionCreateCommand(req));
		}
		if(UMLElementTypes.ReadStructuralFeatureAction_3088 == req.getElementType()) {
			return getGEFWrapper(new ReadStructuralFeatureActionCreateCommand(req));
		}
		if(UMLElementTypes.AddStructuralFeatureValueAction_3091 == req.getElementType()) {
			return getGEFWrapper(new AddStructuralFeatureValueActionCreateCommand(req));
		}
		if(UMLElementTypes.DestroyObjectAction_3095 == req.getElementType()) {
			return getGEFWrapper(new DestroyObjectActionCreateCommand(req));
		}
		if(UMLElementTypes.AddVariableValueAction_3099 == req.getElementType()) {
			return getGEFWrapper(new AddVariableValueActionCreateCommand(req));
		}
		if(UMLElementTypes.ReadVariableAction_3097 == req.getElementType()) {
			return getGEFWrapper(new ReadVariableActionCreateCommand(req));
		}
		if(UMLElementTypes.BroadcastSignalAction_3102 == req.getElementType()) {
			return getGEFWrapper(new BroadcastSignalActionCreateCommand(req));
		}
		if(UMLElementTypes.CentralBufferNode_3104 == req.getElementType()) {
			return getGEFWrapper(new CentralBufferNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
