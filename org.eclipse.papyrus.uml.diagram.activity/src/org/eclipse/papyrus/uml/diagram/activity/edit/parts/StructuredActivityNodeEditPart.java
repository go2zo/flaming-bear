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
package org.eclipse.papyrus.uml.diagram.activity.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.draw2d.ui.figures.GravityConstrainedFlowLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.PreferenceConstantHelper;
import org.eclipse.papyrus.uml.diagram.activity.draw2d.FlowLayoutAdvanced;
import org.eclipse.papyrus.uml.diagram.activity.draw2d.FlowLayoutAdvancedConstraint;
import org.eclipse.papyrus.uml.diagram.activity.draw2d.GravityConstrainedFlowLayoutConstraint;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.edit.policies.StructuredActivityNodeItemSemanticEditPolicy;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.papyrus.uml.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.papyrus.uml.diagram.activity.preferences.IActivityPreferenceConstants;
import org.eclipse.papyrus.uml.diagram.activity.providers.UMLElementTypes;
import org.eclipse.papyrus.uml.diagram.common.draw2d.RoundedRectangleDashedBorder;
import org.eclipse.papyrus.infra.gmfdiag.common.editpart.IPapyrusEditPart;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.AppliedStereotypeNodeLabelDisplayEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.ShowHideCompartmentEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure;
import org.eclipse.papyrus.uml.diagram.common.groups.preferences.OpacityFactoryHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.PreferenceInitializerForElementHelper;
import org.eclipse.papyrus.uml.diagram.common.helper.StereotypeFigureHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * @generated NOT Implements IPapyrusEditPart
 */
public class StructuredActivityNodeEditPart extends

ShapeNodeEditPart implements IPapyrusEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3065;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StructuredActivityNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StructuredActivityNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		installEditPolicy(ShowHideCompartmentEditPolicy.SHOW_HIDE_COMPARTMENT_POLICY, new ShowHideCompartmentEditPolicy());
		installEditPolicy(AppliedStereotypeLabelDisplayEditPolicy.STEREOTYPE_LABEL_POLICY, new AppliedStereotypeNodeLabelDisplayEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if(result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new StructuredActivityNodeDescriptor();
	}

	/**
	 * @generated
	 */
	public StructuredActivityNodeDescriptor getPrimaryShape() {
		return (StructuredActivityNodeDescriptor)primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof StructuredActivityNodeKeywordEditPart) {
			((StructuredActivityNodeKeywordEditPart)childEditPart).setLabel(getPrimaryShape().getKeyword());
			return true;
		}

		if(childEditPart instanceof StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getStructuredActivityNodeCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart)childEditPart).getFigure());
			return true;
		}

		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if(childEditPart instanceof StructuredActivityNodeKeywordEditPart) {
			return true;
		}
		if(childEditPart instanceof StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getStructuredActivityNodeCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart)childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if(addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if(removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if(editPart instanceof StructuredActivityNodeStructuredActivityNodeContentCompartmentEditPart) {
			return getPrimaryShape().getStructuredActivityNodeCompartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		String prefElementId = "StructuredActivityNode";
		IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();
		String preferenceConstantWitdh = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferenceConstantHelper.WIDTH);
		String preferenceConstantHeight = PreferenceInitializerForElementHelper.getpreferenceKey(getNotationView(), prefElementId, PreferenceConstantHelper.HEIGHT);
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(store.getInt(preferenceConstantWitdh), store.getInt(preferenceConstantHeight));

		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *        instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if(nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if(contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if(primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if(primaryShape instanceof Shape) {
			((Shape)primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(StructuredActivityNodeKeywordEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		types.add(UMLElementTypes.ObjectFlow_4003);
		types.add(UMLElementTypes.ControlFlow_4004);
		types.add(UMLElementTypes.ExceptionHandler_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(targetEditPart instanceof DurationConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof DurationConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof TimeConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof TimeConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof IntervalConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof IntervalConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof ConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof ConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4001);
		}
		if(targetEditPart instanceof DurationConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof DurationConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof TimeConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof TimeConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof IntervalConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof IntervalConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof ConstraintAsLocalPrecondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof ConstraintAsLocalPostcondEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4002);
		}
		if(targetEditPart instanceof InitialNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInCallBeActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInCallOpActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof DecisionNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof MergeNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ForkNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof JoinNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof SendObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInSendSigActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValuePinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInAcceptEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInValSpecActEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ExpansionNodeAsInEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ExpansionNodeAsOutEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof LoopNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof SequenceNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.activity.edit.parts.StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ReadSelfActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ReadSelfActionOutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInCreateObjectActionAsResultEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ReadStructuralFeatureActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInReadStructuralFeatureAsObjectEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInReadStructuralFeatureAsResultEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsObjectEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInAddStructuralFeatureValueActionAsResultEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof DestroyObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInDestroyObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof ReadVariableActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof OutputPinInReadVariableActionAsResultEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof AddVariableValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsInsertAtEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof BroadcastSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InputPinInBroadcastSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4003);
		}
		if(targetEditPart instanceof InitialNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInCallBeActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInCallOpActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof DecisionNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof MergeNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ForkNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof JoinNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof SendObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInSendSigActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInAcceptEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInValSpecActEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ExpansionNodeAsInEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ExpansionNodeAsOutEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof LoopNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof SequenceNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof org.eclipse.papyrus.uml.diagram.activity.edit.parts.StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ReadSelfActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ReadSelfActionOutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInCreateObjectActionAsResultEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ReadStructuralFeatureActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInReadStructuralFeatureAsObjectEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInReadStructuralFeatureAsResultEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsObjectEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInAddStructuralFeatureValueActionAsResultEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof DestroyObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInDestroyObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ReadVariableActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof OutputPinInReadVariableActionAsResultEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof AddVariableValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsInsertAtEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof BroadcastSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof InputPinInBroadcastSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4004);
		}
		if(targetEditPart instanceof ValuePinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInOpaqueActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInCallBeActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInCallBeActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInCallOpActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInCallOpActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInCallOpActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsReqEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInSendObjActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInSendSigActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInSendSigActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ValuePinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActionInputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInSendSigActAsTargetEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInAcceptEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInValSpecActEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ExpansionNodeAsInEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ExpansionNodeAsOutEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof ReadSelfActionOutputPinEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInCreateObjectActionAsResultEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInReadStructuralFeatureAsObjectEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInReadStructuralFeatureAsResultEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsObjectEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInAddStructuralFeatureValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInAddStructuralFeatureValueActionAsResultEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInDestroyObjectActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof OutputPinInReadVariableActionAsResultEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsInsertAtEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInAddVariableValueActionAsValueEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof InputPinInBroadcastSignalActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if(targetEditPart instanceof CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.ActionLocalPrecondition_4001) {
			types.add(UMLElementTypes.DurationConstraint_3034);
			types.add(UMLElementTypes.DurationConstraint_3035);
			types.add(UMLElementTypes.TimeConstraint_3036);
			types.add(UMLElementTypes.TimeConstraint_3037);
			types.add(UMLElementTypes.IntervalConstraint_3032);
			types.add(UMLElementTypes.IntervalConstraint_3033);
			types.add(UMLElementTypes.Constraint_3011);
			types.add(UMLElementTypes.Constraint_3012);
		} else if(relationshipType == UMLElementTypes.ActionLocalPostcondition_4002) {
			types.add(UMLElementTypes.DurationConstraint_3034);
			types.add(UMLElementTypes.DurationConstraint_3035);
			types.add(UMLElementTypes.TimeConstraint_3036);
			types.add(UMLElementTypes.TimeConstraint_3037);
			types.add(UMLElementTypes.IntervalConstraint_3032);
			types.add(UMLElementTypes.IntervalConstraint_3033);
			types.add(UMLElementTypes.Constraint_3011);
			types.add(UMLElementTypes.Constraint_3012);
		} else if(relationshipType == UMLElementTypes.ObjectFlow_4003) {
			types.add(UMLElementTypes.InitialNode_3004);
			types.add(UMLElementTypes.ActivityFinalNode_3005);
			types.add(UMLElementTypes.FlowFinalNode_3006);
			types.add(UMLElementTypes.OpaqueAction_3007);
			types.add(UMLElementTypes.ValuePin_3015);
			types.add(UMLElementTypes.ActionInputPin_3016);
			types.add(UMLElementTypes.InputPin_3013);
			types.add(UMLElementTypes.OutputPin_3014);
			types.add(UMLElementTypes.CallBehaviorAction_3008);
			types.add(UMLElementTypes.ValuePin_3017);
			types.add(UMLElementTypes.ActionInputPin_3018);
			types.add(UMLElementTypes.InputPin_3019);
			types.add(UMLElementTypes.OutputPin_3020);
			types.add(UMLElementTypes.CallOperationAction_3010);
			types.add(UMLElementTypes.ActionInputPin_3021);
			types.add(UMLElementTypes.ValuePin_3022);
			types.add(UMLElementTypes.InputPin_3023);
			types.add(UMLElementTypes.OutputPin_3024);
			types.add(UMLElementTypes.ValuePin_3025);
			types.add(UMLElementTypes.ActionInputPin_3026);
			types.add(UMLElementTypes.InputPin_3027);
			types.add(UMLElementTypes.DecisionNode_3038);
			types.add(UMLElementTypes.MergeNode_3039);
			types.add(UMLElementTypes.ForkNode_3040);
			types.add(UMLElementTypes.JoinNode_3041);
			types.add(UMLElementTypes.DataStoreNode_3078);
			types.add(UMLElementTypes.SendObjectAction_3042);
			types.add(UMLElementTypes.ValuePin_3046);
			types.add(UMLElementTypes.ActionInputPin_3047);
			types.add(UMLElementTypes.InputPin_3048);
			types.add(UMLElementTypes.ValuePin_3049);
			types.add(UMLElementTypes.ActionInputPin_3050);
			types.add(UMLElementTypes.InputPin_3051);
			types.add(UMLElementTypes.SendSignalAction_3052);
			types.add(UMLElementTypes.ActionInputPin_3053);
			types.add(UMLElementTypes.ValuePin_3054);
			types.add(UMLElementTypes.InputPin_3055);
			types.add(UMLElementTypes.ValuePin_3060);
			types.add(UMLElementTypes.ActionInputPin_3061);
			types.add(UMLElementTypes.InputPin_3062);
			types.add(UMLElementTypes.ActivityParameterNode_3059);
			types.add(UMLElementTypes.AcceptEventAction_3063);
			types.add(UMLElementTypes.OutputPin_3064);
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
			types.add(UMLElementTypes.OutputPin_3077);
			types.add(UMLElementTypes.ConditionalNode_3069);
			types.add(UMLElementTypes.ExpansionRegion_3070);
			types.add(UMLElementTypes.ExpansionNode_3074);
			types.add(UMLElementTypes.ExpansionNode_3075);
			types.add(UMLElementTypes.LoopNode_3071);
			types.add(UMLElementTypes.SequenceNode_3073);
			types.add(UMLElementTypes.StructuredActivityNode_3065);
			types.add(UMLElementTypes.ReadSelfAction_3081);
			types.add(UMLElementTypes.OutputPin_3084);
			types.add(UMLElementTypes.CreateObjectAction_3086);
			types.add(UMLElementTypes.OutputPin_3087);
			types.add(UMLElementTypes.ReadStructuralFeatureAction_3088);
			types.add(UMLElementTypes.InputPin_3089);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3091);
			types.add(UMLElementTypes.InputPin_3092);
			types.add(UMLElementTypes.InputPin_3093);
			types.add(UMLElementTypes.OutputPin_3094);
			types.add(UMLElementTypes.DestroyObjectAction_3095);
			types.add(UMLElementTypes.InputPin_3096);
			types.add(UMLElementTypes.ReadVariableAction_3097);
			types.add(UMLElementTypes.OutputPin_3098);
			types.add(UMLElementTypes.AddVariableValueAction_3099);
			types.add(UMLElementTypes.InputPin_3100);
			types.add(UMLElementTypes.InputPin_3101);
			types.add(UMLElementTypes.BroadcastSignalAction_3102);
			types.add(UMLElementTypes.InputPin_3103);
			types.add(UMLElementTypes.CentralBufferNode_3104);
		} else if(relationshipType == UMLElementTypes.ControlFlow_4004) {
			types.add(UMLElementTypes.InitialNode_3004);
			types.add(UMLElementTypes.ActivityFinalNode_3005);
			types.add(UMLElementTypes.FlowFinalNode_3006);
			types.add(UMLElementTypes.OpaqueAction_3007);
			types.add(UMLElementTypes.ValuePin_3015);
			types.add(UMLElementTypes.ActionInputPin_3016);
			types.add(UMLElementTypes.InputPin_3013);
			types.add(UMLElementTypes.OutputPin_3014);
			types.add(UMLElementTypes.CallBehaviorAction_3008);
			types.add(UMLElementTypes.ValuePin_3017);
			types.add(UMLElementTypes.ActionInputPin_3018);
			types.add(UMLElementTypes.InputPin_3019);
			types.add(UMLElementTypes.OutputPin_3020);
			types.add(UMLElementTypes.CallOperationAction_3010);
			types.add(UMLElementTypes.ActionInputPin_3021);
			types.add(UMLElementTypes.ValuePin_3022);
			types.add(UMLElementTypes.InputPin_3023);
			types.add(UMLElementTypes.OutputPin_3024);
			types.add(UMLElementTypes.ValuePin_3025);
			types.add(UMLElementTypes.ActionInputPin_3026);
			types.add(UMLElementTypes.InputPin_3027);
			types.add(UMLElementTypes.DecisionNode_3038);
			types.add(UMLElementTypes.MergeNode_3039);
			types.add(UMLElementTypes.ForkNode_3040);
			types.add(UMLElementTypes.JoinNode_3041);
			types.add(UMLElementTypes.DataStoreNode_3078);
			types.add(UMLElementTypes.SendObjectAction_3042);
			types.add(UMLElementTypes.ValuePin_3046);
			types.add(UMLElementTypes.ActionInputPin_3047);
			types.add(UMLElementTypes.InputPin_3048);
			types.add(UMLElementTypes.ValuePin_3049);
			types.add(UMLElementTypes.ActionInputPin_3050);
			types.add(UMLElementTypes.InputPin_3051);
			types.add(UMLElementTypes.SendSignalAction_3052);
			types.add(UMLElementTypes.ActionInputPin_3053);
			types.add(UMLElementTypes.ValuePin_3054);
			types.add(UMLElementTypes.InputPin_3055);
			types.add(UMLElementTypes.ValuePin_3060);
			types.add(UMLElementTypes.ActionInputPin_3061);
			types.add(UMLElementTypes.InputPin_3062);
			types.add(UMLElementTypes.ActivityParameterNode_3059);
			types.add(UMLElementTypes.AcceptEventAction_3063);
			types.add(UMLElementTypes.OutputPin_3064);
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
			types.add(UMLElementTypes.OutputPin_3077);
			types.add(UMLElementTypes.ConditionalNode_3069);
			types.add(UMLElementTypes.ExpansionRegion_3070);
			types.add(UMLElementTypes.ExpansionNode_3074);
			types.add(UMLElementTypes.ExpansionNode_3075);
			types.add(UMLElementTypes.LoopNode_3071);
			types.add(UMLElementTypes.SequenceNode_3073);
			types.add(UMLElementTypes.StructuredActivityNode_3065);
			types.add(UMLElementTypes.ReadSelfAction_3081);
			types.add(UMLElementTypes.OutputPin_3084);
			types.add(UMLElementTypes.CreateObjectAction_3086);
			types.add(UMLElementTypes.OutputPin_3087);
			types.add(UMLElementTypes.ReadStructuralFeatureAction_3088);
			types.add(UMLElementTypes.InputPin_3089);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3091);
			types.add(UMLElementTypes.InputPin_3092);
			types.add(UMLElementTypes.InputPin_3093);
			types.add(UMLElementTypes.OutputPin_3094);
			types.add(UMLElementTypes.DestroyObjectAction_3095);
			types.add(UMLElementTypes.InputPin_3096);
			types.add(UMLElementTypes.ReadVariableAction_3097);
			types.add(UMLElementTypes.OutputPin_3098);
			types.add(UMLElementTypes.AddVariableValueAction_3099);
			types.add(UMLElementTypes.InputPin_3100);
			types.add(UMLElementTypes.InputPin_3101);
			types.add(UMLElementTypes.BroadcastSignalAction_3102);
			types.add(UMLElementTypes.InputPin_3103);
			types.add(UMLElementTypes.CentralBufferNode_3104);
		} else if(relationshipType == UMLElementTypes.ExceptionHandler_4005) {
			types.add(UMLElementTypes.ValuePin_3015);
			types.add(UMLElementTypes.ActionInputPin_3016);
			types.add(UMLElementTypes.InputPin_3013);
			types.add(UMLElementTypes.OutputPin_3014);
			types.add(UMLElementTypes.ValuePin_3017);
			types.add(UMLElementTypes.ActionInputPin_3018);
			types.add(UMLElementTypes.InputPin_3019);
			types.add(UMLElementTypes.OutputPin_3020);
			types.add(UMLElementTypes.ActionInputPin_3021);
			types.add(UMLElementTypes.ValuePin_3022);
			types.add(UMLElementTypes.InputPin_3023);
			types.add(UMLElementTypes.OutputPin_3024);
			types.add(UMLElementTypes.ValuePin_3025);
			types.add(UMLElementTypes.ActionInputPin_3026);
			types.add(UMLElementTypes.InputPin_3027);
			types.add(UMLElementTypes.DataStoreNode_3078);
			types.add(UMLElementTypes.ValuePin_3046);
			types.add(UMLElementTypes.ActionInputPin_3047);
			types.add(UMLElementTypes.InputPin_3048);
			types.add(UMLElementTypes.ValuePin_3049);
			types.add(UMLElementTypes.ActionInputPin_3050);
			types.add(UMLElementTypes.InputPin_3051);
			types.add(UMLElementTypes.ActionInputPin_3053);
			types.add(UMLElementTypes.ValuePin_3054);
			types.add(UMLElementTypes.InputPin_3055);
			types.add(UMLElementTypes.ValuePin_3060);
			types.add(UMLElementTypes.ActionInputPin_3061);
			types.add(UMLElementTypes.InputPin_3062);
			types.add(UMLElementTypes.ActivityParameterNode_3059);
			types.add(UMLElementTypes.OutputPin_3064);
			types.add(UMLElementTypes.OutputPin_3077);
			types.add(UMLElementTypes.ExpansionNode_3074);
			types.add(UMLElementTypes.ExpansionNode_3075);
			types.add(UMLElementTypes.OutputPin_3084);
			types.add(UMLElementTypes.OutputPin_3087);
			types.add(UMLElementTypes.InputPin_3089);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.InputPin_3092);
			types.add(UMLElementTypes.InputPin_3093);
			types.add(UMLElementTypes.OutputPin_3094);
			types.add(UMLElementTypes.InputPin_3096);
			types.add(UMLElementTypes.OutputPin_3098);
			types.add(UMLElementTypes.InputPin_3100);
			types.add(UMLElementTypes.InputPin_3101);
			types.add(UMLElementTypes.InputPin_3103);
			types.add(UMLElementTypes.CentralBufferNode_3104);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(UMLElementTypes.ObjectFlow_4003);
		types.add(UMLElementTypes.ControlFlow_4004);
		types.add(UMLElementTypes.CommentAnnotatedElement_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if(relationshipType == UMLElementTypes.ObjectFlow_4003) {
			types.add(UMLElementTypes.InitialNode_3004);
			types.add(UMLElementTypes.ActivityFinalNode_3005);
			types.add(UMLElementTypes.FlowFinalNode_3006);
			types.add(UMLElementTypes.OpaqueAction_3007);
			types.add(UMLElementTypes.ValuePin_3015);
			types.add(UMLElementTypes.ActionInputPin_3016);
			types.add(UMLElementTypes.InputPin_3013);
			types.add(UMLElementTypes.OutputPin_3014);
			types.add(UMLElementTypes.CallBehaviorAction_3008);
			types.add(UMLElementTypes.ValuePin_3017);
			types.add(UMLElementTypes.ActionInputPin_3018);
			types.add(UMLElementTypes.InputPin_3019);
			types.add(UMLElementTypes.OutputPin_3020);
			types.add(UMLElementTypes.CallOperationAction_3010);
			types.add(UMLElementTypes.ActionInputPin_3021);
			types.add(UMLElementTypes.ValuePin_3022);
			types.add(UMLElementTypes.InputPin_3023);
			types.add(UMLElementTypes.OutputPin_3024);
			types.add(UMLElementTypes.ValuePin_3025);
			types.add(UMLElementTypes.ActionInputPin_3026);
			types.add(UMLElementTypes.InputPin_3027);
			types.add(UMLElementTypes.DecisionNode_3038);
			types.add(UMLElementTypes.MergeNode_3039);
			types.add(UMLElementTypes.ForkNode_3040);
			types.add(UMLElementTypes.JoinNode_3041);
			types.add(UMLElementTypes.DataStoreNode_3078);
			types.add(UMLElementTypes.SendObjectAction_3042);
			types.add(UMLElementTypes.ValuePin_3046);
			types.add(UMLElementTypes.ActionInputPin_3047);
			types.add(UMLElementTypes.InputPin_3048);
			types.add(UMLElementTypes.ValuePin_3049);
			types.add(UMLElementTypes.ActionInputPin_3050);
			types.add(UMLElementTypes.InputPin_3051);
			types.add(UMLElementTypes.SendSignalAction_3052);
			types.add(UMLElementTypes.ActionInputPin_3053);
			types.add(UMLElementTypes.ValuePin_3054);
			types.add(UMLElementTypes.InputPin_3055);
			types.add(UMLElementTypes.ValuePin_3060);
			types.add(UMLElementTypes.ActionInputPin_3061);
			types.add(UMLElementTypes.InputPin_3062);
			types.add(UMLElementTypes.ActivityParameterNode_3059);
			types.add(UMLElementTypes.AcceptEventAction_3063);
			types.add(UMLElementTypes.OutputPin_3064);
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
			types.add(UMLElementTypes.OutputPin_3077);
			types.add(UMLElementTypes.ConditionalNode_3069);
			types.add(UMLElementTypes.ExpansionRegion_3070);
			types.add(UMLElementTypes.ExpansionNode_3074);
			types.add(UMLElementTypes.ExpansionNode_3075);
			types.add(UMLElementTypes.LoopNode_3071);
			types.add(UMLElementTypes.SequenceNode_3073);
			types.add(UMLElementTypes.StructuredActivityNode_3065);
			types.add(UMLElementTypes.ReadSelfAction_3081);
			types.add(UMLElementTypes.OutputPin_3084);
			types.add(UMLElementTypes.CreateObjectAction_3086);
			types.add(UMLElementTypes.OutputPin_3087);
			types.add(UMLElementTypes.ReadStructuralFeatureAction_3088);
			types.add(UMLElementTypes.InputPin_3089);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3091);
			types.add(UMLElementTypes.InputPin_3092);
			types.add(UMLElementTypes.InputPin_3093);
			types.add(UMLElementTypes.OutputPin_3094);
			types.add(UMLElementTypes.DestroyObjectAction_3095);
			types.add(UMLElementTypes.InputPin_3096);
			types.add(UMLElementTypes.ReadVariableAction_3097);
			types.add(UMLElementTypes.OutputPin_3098);
			types.add(UMLElementTypes.AddVariableValueAction_3099);
			types.add(UMLElementTypes.InputPin_3100);
			types.add(UMLElementTypes.InputPin_3101);
			types.add(UMLElementTypes.BroadcastSignalAction_3102);
			types.add(UMLElementTypes.InputPin_3103);
			types.add(UMLElementTypes.CentralBufferNode_3104);
		} else if(relationshipType == UMLElementTypes.ControlFlow_4004) {
			types.add(UMLElementTypes.InitialNode_3004);
			types.add(UMLElementTypes.ActivityFinalNode_3005);
			types.add(UMLElementTypes.FlowFinalNode_3006);
			types.add(UMLElementTypes.OpaqueAction_3007);
			types.add(UMLElementTypes.ValuePin_3015);
			types.add(UMLElementTypes.ActionInputPin_3016);
			types.add(UMLElementTypes.InputPin_3013);
			types.add(UMLElementTypes.OutputPin_3014);
			types.add(UMLElementTypes.CallBehaviorAction_3008);
			types.add(UMLElementTypes.ValuePin_3017);
			types.add(UMLElementTypes.ActionInputPin_3018);
			types.add(UMLElementTypes.InputPin_3019);
			types.add(UMLElementTypes.OutputPin_3020);
			types.add(UMLElementTypes.CallOperationAction_3010);
			types.add(UMLElementTypes.ActionInputPin_3021);
			types.add(UMLElementTypes.ValuePin_3022);
			types.add(UMLElementTypes.InputPin_3023);
			types.add(UMLElementTypes.OutputPin_3024);
			types.add(UMLElementTypes.ValuePin_3025);
			types.add(UMLElementTypes.ActionInputPin_3026);
			types.add(UMLElementTypes.InputPin_3027);
			types.add(UMLElementTypes.DecisionNode_3038);
			types.add(UMLElementTypes.MergeNode_3039);
			types.add(UMLElementTypes.ForkNode_3040);
			types.add(UMLElementTypes.JoinNode_3041);
			types.add(UMLElementTypes.DataStoreNode_3078);
			types.add(UMLElementTypes.SendObjectAction_3042);
			types.add(UMLElementTypes.ValuePin_3046);
			types.add(UMLElementTypes.ActionInputPin_3047);
			types.add(UMLElementTypes.InputPin_3048);
			types.add(UMLElementTypes.ValuePin_3049);
			types.add(UMLElementTypes.ActionInputPin_3050);
			types.add(UMLElementTypes.InputPin_3051);
			types.add(UMLElementTypes.SendSignalAction_3052);
			types.add(UMLElementTypes.ActionInputPin_3053);
			types.add(UMLElementTypes.ValuePin_3054);
			types.add(UMLElementTypes.InputPin_3055);
			types.add(UMLElementTypes.ValuePin_3060);
			types.add(UMLElementTypes.ActionInputPin_3061);
			types.add(UMLElementTypes.InputPin_3062);
			types.add(UMLElementTypes.ActivityParameterNode_3059);
			types.add(UMLElementTypes.AcceptEventAction_3063);
			types.add(UMLElementTypes.OutputPin_3064);
			types.add(UMLElementTypes.ValueSpecificationAction_3076);
			types.add(UMLElementTypes.OutputPin_3077);
			types.add(UMLElementTypes.ConditionalNode_3069);
			types.add(UMLElementTypes.ExpansionRegion_3070);
			types.add(UMLElementTypes.ExpansionNode_3074);
			types.add(UMLElementTypes.ExpansionNode_3075);
			types.add(UMLElementTypes.LoopNode_3071);
			types.add(UMLElementTypes.SequenceNode_3073);
			types.add(UMLElementTypes.StructuredActivityNode_3065);
			types.add(UMLElementTypes.ReadSelfAction_3081);
			types.add(UMLElementTypes.OutputPin_3084);
			types.add(UMLElementTypes.CreateObjectAction_3086);
			types.add(UMLElementTypes.OutputPin_3087);
			types.add(UMLElementTypes.ReadStructuralFeatureAction_3088);
			types.add(UMLElementTypes.InputPin_3089);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3091);
			types.add(UMLElementTypes.InputPin_3092);
			types.add(UMLElementTypes.InputPin_3093);
			types.add(UMLElementTypes.OutputPin_3094);
			types.add(UMLElementTypes.DestroyObjectAction_3095);
			types.add(UMLElementTypes.InputPin_3096);
			types.add(UMLElementTypes.ReadVariableAction_3097);
			types.add(UMLElementTypes.OutputPin_3098);
			types.add(UMLElementTypes.AddVariableValueAction_3099);
			types.add(UMLElementTypes.InputPin_3100);
			types.add(UMLElementTypes.InputPin_3101);
			types.add(UMLElementTypes.BroadcastSignalAction_3102);
			types.add(UMLElementTypes.InputPin_3103);
			types.add(UMLElementTypes.CentralBufferNode_3104);
		} else if(relationshipType == UMLElementTypes.CommentAnnotatedElement_4006) {
			types.add(UMLElementTypes.Comment_3080);
		}
		return types;
	}

	/**
	 * @generated NOT Implements IPapyrusNodeUMLElementFigure (Used to apply stereotype)
	 */
	public class StructuredActivityNodeDescriptor extends RoundedRectangle implements IPapyrusNodeUMLElementFigure {

		/**
		 * @generated
		 */
		private RoundedRectangle fStructuredActivityNodeCompartment;

		/**
		 * @generated
		 */
		private WrappingLabel fKeyword;

		/**
		 * @generated
		 */
		private RoundedRectangle fFigureCompartmentLabelStructuredActivityNode;

		/**
		 * Helper used to display stereotype
		 */
		private StereotypeFigureHelper stereotypeHelper;

		/**
		 * Preferences Store
		 */
		protected IPreferenceStore store = UMLDiagramEditorPlugin.getInstance().getPreferenceStore();

		/**
		 * @generated NOT Instanciate stereotypeHelper
		 */
		public StructuredActivityNodeDescriptor() {

			FlowLayoutAdvanced layoutThis = new FlowLayoutAdvanced();

			layoutThis.setStretchMinorAxis(true);

			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_TOPLEFT);

			layoutThis.setMajorSpacing(0);

			layoutThis.setMinorSpacing(0);

			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setLineWidth(0);
			this.setOutline(false);
			this.setBorder(createBorder0());
			OpacityFactoryHelper.initOpacityPreferences(IActivityPreferenceConstants.PREF_STRUCTURED_NODE_ALPHA, store, this);
			createContents();
			/*
			 * Create the helper which will help to display stereotype
			 */
			stereotypeHelper = new StereotypeFigureHelper(getFigureCompartmentLabelStructuredActivityNode()) {

				@Override
				public IMapMode getMapMode() {
					return StructuredActivityNodeEditPart.this.getMapMode();
				}

				@Override
				public Object getStereotypeRectangleConstraint() {
					return new Integer(GravityConstrainedFlowLayout.ALIGN_CENTER);
				}
			};
			/*
			 * Set all the inset to 0
			 */
			stereotypeHelper.setBottomInset(0);
			stereotypeHelper.setLeftInset(0);
			stereotypeHelper.setTopInset(0);
			stereotypeHelper.setRightInset(0);
		}

		/**
		 * Custom border
		 * (Used to avoid the alpha setting affect the border)
		 * 
		 * @generated NOT
		 * @return
		 */
		private Border createBorder0() {
			RoundedRectangleDashedBorder result = new RoundedRectangleDashedBorder(8, 8);
			result.setWidth(1);
			result.setStyle(Graphics.LINE_DASH);
			return result;
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCompartmentLabelStructuredActivityNode = new RoundedRectangle();
			fFigureCompartmentLabelStructuredActivityNode.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			fFigureCompartmentLabelStructuredActivityNode.setFill(false);
			fFigureCompartmentLabelStructuredActivityNode.setOutline(false);
			fFigureCompartmentLabelStructuredActivityNode.setLineWidth(0);

			FlowLayoutAdvancedConstraint constraintFFigureCompartmentLabelStructuredActivityNode = new FlowLayoutAdvancedConstraint();

			constraintFFigureCompartmentLabelStructuredActivityNode.setHasMinsize(true);

			this.add(fFigureCompartmentLabelStructuredActivityNode, constraintFFigureCompartmentLabelStructuredActivityNode);

			GravityConstrainedFlowLayout layoutFFigureCompartmentLabelStructuredActivityNode = new GravityConstrainedFlowLayout();

			fFigureCompartmentLabelStructuredActivityNode.setLayoutManager(layoutFFigureCompartmentLabelStructuredActivityNode);

			fKeyword = new WrappingLabel();

			fKeyword.setTextJustification(SWT.LEFT);

			fKeyword.setTextAlignment(PositionConstants.LEFT);

			fKeyword.setTextWrap(true);

			fKeyword.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			GravityConstrainedFlowLayoutConstraint constraintFKeyword = new GravityConstrainedFlowLayoutConstraint();

			constraintFKeyword.setAlign(GravityConstrainedFlowLayout.ALIGN_TOPLEFT);

			fFigureCompartmentLabelStructuredActivityNode.add(fKeyword, constraintFKeyword);

			fStructuredActivityNodeCompartment = new RoundedRectangle();
			fStructuredActivityNodeCompartment.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			fStructuredActivityNodeCompartment.setFill(false);
			fStructuredActivityNodeCompartment.setOutline(false);
			fStructuredActivityNodeCompartment.setLineWidth(0);

			FlowLayoutAdvancedConstraint constraintFStructuredActivityNodeCompartment = new FlowLayoutAdvancedConstraint();

			constraintFStructuredActivityNodeCompartment.setFull(true);

			this.add(fStructuredActivityNodeCompartment, constraintFStructuredActivityNodeCompartment);

		}

		/**
		 * @generated
		 */
		public RoundedRectangle getStructuredActivityNodeCompartment() {
			return fStructuredActivityNodeCompartment;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getKeyword() {
			return fKeyword;
		}

		/**
		 * @generated
		 */
		public RoundedRectangle getFigureCompartmentLabelStructuredActivityNode() {
			return fFigureCompartmentLabelStructuredActivityNode;
		}

		/**
		 * 
		 * @see org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusUMLElementFigure#setStereotypeDisplay(java.lang.String,
		 *      org.eclipse.swt.graphics.Image)
		 * 
		 * @param stereotypes
		 * @param image
		 */
		public void setStereotypeDisplay(String stereotypes, Image image) {
			stereotypeHelper.setStereotypeDisplay(stereotypes, image);
			this.layout();
		}

		/**
		 * 
		 * @see org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure#setStereotypePropertiesInBrace(java.lang.String)
		 * 
		 * @param stereotypeProperties
		 */
		public void setStereotypePropertiesInBrace(String stereotypeProperties) {
			stereotypeHelper.setStereotypePropertiesInBrace(stereotypeProperties);
			this.layout();
		}

		/**
		 * 
		 * @see org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure#setStereotypePropertiesInCompartment(java.lang.String)
		 * 
		 * @param stereotypeProperties
		 */
		public void setStereotypePropertiesInCompartment(String stereotypeProperties) {
			stereotypeHelper.setStereotypePropertiesInCompartment(stereotypeProperties);
			this.layout();
		}

		/**
		 * 
		 * @see org.eclipse.papyrus.uml.diagram.common.figure.node.IPapyrusNodeUMLElementFigure#getStereotypesLabel()
		 * 
		 * @return
		 */
		@Deprecated
		public Label getStereotypesLabel() {

			return null;
		}

	}

	/**
	 * @generated
	 */
	@Override
	public Object getPreferredValue(EStructuralFeature feature) {
		IPreferenceStore preferenceStore = (IPreferenceStore)getDiagramPreferencesHint().getPreferenceStore();
		Object result = null;

		if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor() || feature == NotationPackage.eINSTANCE.getFontStyle_FontColor() || feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
			String prefColor = null;
			if(feature == NotationPackage.eINSTANCE.getLineStyle_LineColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("StructuredActivityNode", PreferenceConstantHelper.COLOR_LINE);
			} else if(feature == NotationPackage.eINSTANCE.getFontStyle_FontColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("StructuredActivityNode", PreferenceConstantHelper.COLOR_FONT);
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_FillColor()) {
				prefColor = PreferenceConstantHelper.getElementConstant("StructuredActivityNode", PreferenceConstantHelper.COLOR_FILL);
			}
			result = FigureUtilities.RGBToInteger(PreferenceConverter.getColor((IPreferenceStore)preferenceStore, prefColor));
		} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency() || feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
			String prefGradient = PreferenceConstantHelper.getElementConstant("StructuredActivityNode", PreferenceConstantHelper.COLOR_GRADIENT);
			GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(preferenceStore.getString(prefGradient));
			if(feature == NotationPackage.eINSTANCE.getFillStyle_Transparency()) {
				result = new Integer(gradientPreferenceConverter.getTransparency());
			} else if(feature == NotationPackage.eINSTANCE.getFillStyle_Gradient()) {
				result = gradientPreferenceConverter.getGradientData();
			}
		}

		if(result == null) {
			result = getStructuralFeatureValue(feature);
		}
		return result;
	}
}
