package org.eclipse.papyrus.uml.diagram.statemachine.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.CommentEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.ConstraintEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.GeneralizationEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateChoiceEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateDeepHistoryEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateEntryPointEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateExitPointEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateForkEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateInitialEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateJoinEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateJunctionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateShallowHistoryEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.PseudostateTerminateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLLinkDescriptor;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLNodeDescriptor;
import org.eclipse.papyrus.uml.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class PackageCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for(int i = 0; i < c.size(); i++) {
			((EditPart)c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	private Collection<UMLLinkDescriptor> collectAllLinks(View view, Map<EObject, View> domain2NotationMap) {
		if(!PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<UMLLinkDescriptor> result = new LinkedList<UMLLinkDescriptor>();
		switch(UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPackage_1000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case StateMachineEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getStateMachine_2000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case RegionEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getRegion_3000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case FinalStateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getFinalState_5000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case StateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getState_6000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateInitialEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_8000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateJoinEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_9000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateForkEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_10000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateChoiceEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_11000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateJunctionEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_12000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateShallowHistoryEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_13000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateDeepHistoryEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_14000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateTerminateEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_15000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateEntryPointEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_16000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PseudostateExitPointEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getPseudostate_17000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ConnectionPointReferenceEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getConnectionPointReference_18000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case CommentEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getComment_666ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case ConstraintEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getConstraint_668ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case TransitionEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getTransition_7000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case GeneralizationEditPart.VISUAL_ID:
		{
			if(!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(UMLDiagramUpdater.getGeneralization_19000ContainedLinks(view));
			}
			if(!domain2NotationMap.containsKey(view.getElement()) || view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for(Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View)children.next(), domain2NotationMap));
		}
		for(Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View)edges.next(), domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(Collection<UMLLinkDescriptor> linkDescriptors, Map<EObject, View> domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for(UMLLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor.getDestination(), domain2NotationMap);
			if(sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), UMLVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), ViewUtil.APPEND, false, ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if(cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable)ccr.getNewObject();
				if(viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View)getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement, Map<EObject, View> domain2NotationMap) {
		View view = (View)domain2NotationMap.get(domainModelElement);
		if(view != null) {
			return (EditPart)getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return UMLPackage.eINSTANCE.getPackage_PackagedElement();
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View)getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<UMLNodeDescriptor> childDescriptors = UMLDiagramUpdater.getPackage_1000SemanticChildren(viewObject);
		for(UMLNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		return StateMachineEditPart.VISUAL_ID == UMLVisualIDRegistry.getVisualID(view);
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Map<EObject, View> domain2NotationMap = new HashMap<EObject, View>();
		Collection<UMLLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for(Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge)linksIterator.next();
			int diagramLinkVisualID = UMLVisualIDRegistry.getVisualID(nextDiagramLink);
			if(diagramLinkVisualID == -1) {
				if(nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for(Iterator<UMLLinkDescriptor> linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
				UMLLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
				if(diagramLinkObject == nextLinkDescriptor.getModelElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination() && diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if(resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<UMLNodeDescriptor> childDescriptors = UMLDiagramUpdater.getPackage_1000SemanticChildren((View)getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for(View v : getViewChildren()) {
			if(isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for(Iterator<UMLNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator.hasNext();) {
			UMLNodeDescriptor next = descriptorsIterator.next();
			String hint = UMLVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for(View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if(next.getModelElement().equals(semanticElement)) {
					if(hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if(perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(childDescriptors.size());
		for(UMLNodeDescriptor next : childDescriptors) {
			String hint = UMLVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter, Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if(cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>)request.getNewObject();
			createdViews.addAll(nl);
		}
		if(changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if(createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}
}
