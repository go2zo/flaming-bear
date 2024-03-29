/*****************************************************************************
 * Copyright (c) 2008 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Chokri Mraidha (CEA LIST) Chokri.Mraidha@cea.fr - Initial API and implementation
 *  Patrick Tessier (CEA LIST) Patrick.Tessier@cea.fr - modification
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.properties.profile.ui.compositeforview;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.papyrus.uml.appearance.helper.AppliedStereotypeHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyComposite.
 */
public class AppliedStereotypePropertyCompositeWithView extends org.eclipse.papyrus.uml.properties.profile.ui.compositesformodel.PropertyComposite implements IViewComposite {

	/**
	 * the current view
	 */
	protected EModelElement currentView;

	/**
	 * The stereotype composite.
	 */
	protected AppliedStereotypeCompositeWithView stereotypeComposite;

	/**
	 * The Constructor.
	 * 
	 * @param stereotypeComposite
	 *        the stereotype composite
	 * @param parent
	 *        the parent
	 */
	public AppliedStereotypePropertyCompositeWithView(Composite parent, AppliedStereotypeCompositeWithView stereotypeComposite) {
		super(parent);

		this.setBackground(JFaceColors.getBannerBackground(parent.getDisplay()));
		this.stereotypeComposite = stereotypeComposite;
	}

	/**
	 * Touch model.
	 * 
	 * 
	 */
	protected void touchModel() {

		// CommandSupport.exec ("update stereotype", /* command)
		if (currentView == null) {
			return;
		}
		
		try {
			getDomain().runExclusive(new Runnable() {
			

				public void run() {

					Display.getCurrent().asyncExec( new Runnable() {

						public void run() {
							String localization = AppliedStereotypeHelper.getAppliedStereotypesPropertiesLocalization(currentView);
							RecordingCommand command = AppliedStereotypeHelper.getSetAppliedStereotypePropertiesLocalizationCommand(getDomain(), currentView, localization);

							getDomain().getCommandStack().execute(command);
				
						}
					});
	
				}
			});

		} catch (Exception e) {
			e.printStackTrace ();
		}
	}

	/**
	 * Adds the button pressed.
	 */
	@Override
	public void addButtonPressed() {
		super.addButtonPressed();
		touchModel();
		stereotypeComposite.refreshTreeViewer ();
	}

	/**
	 * Removes the button pressed.
	 */
	@Override
	public void removeButtonPressed() {
		super.removeButtonPressed();
		touchModel();
		stereotypeComposite.refreshTreeViewer ();
	}

	/**
	 * Up button pressed.
	 */
	@Override
	public void upButtonPressed() {
		super.upButtonPressed();
		touchModel();
		stereotypeComposite.refreshTreeViewer ();
	}

	/**
	 * Down button pressed.
	 */
	@Override
	public void downButtonPressed() {
		super.downButtonPressed();
		touchModel();
		stereotypeComposite.refreshTreeViewer ();
	}

	/**
	 * Creates the prop tree.
	 */
	@Override
	protected void createPropTree() {
		super.createPropTree();
		getTree().addListener(SWT.MouseDoubleClick, new StereotypePropertiesDoubleClickListener (treeViewer, stereotypeComposite, this));
	}

	/**
	 * Sets the stereotype composite.
	 * 
	 * @param stereotypeComposite
	 *        the stereotype composite
	 */
	public void setStereotypeComposite(AppliedStereotypeCompositeWithView stereotypeComposite) {
		this.stereotypeComposite = stereotypeComposite;
	}

	/**
	 * 
	 */
	public void disposeListeners() {
		super.disposeListeners();
		stereotypeComposite.disposeListeners();
	}

	public void setDiagramElement(EModelElement diagramElement) {
		this.currentView = diagramElement;

	}
}
