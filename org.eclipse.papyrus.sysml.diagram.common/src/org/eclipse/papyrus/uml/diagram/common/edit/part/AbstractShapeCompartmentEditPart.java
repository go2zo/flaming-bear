package org.eclipse.papyrus.uml.diagram.common.edit.part;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.requests.SelectionRequest;
import org.eclipse.gef.tools.DeselectAllTracker;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.tools.RubberbandDragTracker;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.gmf.diagram.common.edit.policy.CompartmentSemanticEditPolicy;
import org.eclipse.papyrus.gmf.diagram.common.edit.policy.DefaultCreationEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.CustomContainerEditPolicy;
import org.eclipse.papyrus.uml.diagram.common.editpolicies.DuplicatePasteEditPolicy;

/**
 * Abstract non-diagram specific edit part for shape compartment.
 * This class is adapted from edit parts generated by GMF Tooling.
 */
public abstract class AbstractShapeCompartmentEditPart extends ShapeCompartmentEditPart {
	
	public AbstractShapeCompartmentEditPart(View view) {
		super(view);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CompartmentSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new DefaultCreationEditPolicy());
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(DuplicatePasteEditPolicy.PASTE_ROLE, new DuplicatePasteEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new CustomContainerEditPolicy());
	}
	
	@Override
	protected void setRatio(Double ratio) {
		if(getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if(NotationPackage.eINSTANCE.getSize_Width().equals(feature) || NotationPackage.eINSTANCE.getSize_Height().equals(feature) || NotationPackage.eINSTANCE.getLocation_X().equals(feature) || NotationPackage.eINSTANCE.getLocation_Y().equals(feature)) {
			refreshBounds();
		}
		super.handleNotificationEvent(notification);
	}

	protected void refreshBounds() {
		int width = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Width())).intValue();
		int height = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getSize_Height())).intValue();
		Dimension size = new Dimension(width, height);
		int x = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_X())).intValue();
		int y = ((Integer)getStructuralFeatureValue(NotationPackage.eINSTANCE.getLocation_Y())).intValue();
		Point loc = new Point(x, y);
		((GraphicalEditPart)getParent()).setLayoutConstraint(this, getFigure(), new Rectangle(loc, size));
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshBounds();
	}
	
	/**
	 * Install a drag tracker supporting double click (necessary for navigation).
	 */
	public DragTracker getDragTracker(Request req) {
		if (!supportsDragSelection())
			return super.getDragTracker(req);

		if (req instanceof SelectionRequest
			&& ((SelectionRequest) req).getLastButtonPressed() == 3)
			return new DeselectAllTracker(this) {

				protected boolean handleButtonDown(int button) {
					getCurrentViewer().select(AbstractShapeCompartmentEditPart.this);
					return true;
				}
			};
		
		return new RubberbandDragTracker() {
			
			/* this method has been respecified in order to allow double click 
			 * on the compartment.
			 * hence it allows the navigation by double click
			 */
			protected boolean handleDoubleClick(int button) {
		        	SelectionRequest request = new SelectionRequest();
		    		request.setLocation(getLocation());
		    		request.setType(RequestConstants.REQ_OPEN);
		    		performRequest(request);
		            return true;
		    }
			
			protected void handleFinished() {
				if (getViewer().getSelectedEditParts().isEmpty())
					getViewer().select(AbstractShapeCompartmentEditPart.this);
			}
			
		};
	}
}
