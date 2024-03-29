/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Adapted code from the class diagram
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.profile.custom.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.pages.AbstractPapyrusElementPreferencePage;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.GradientPreferenceConverter;
import org.eclipse.papyrus.infra.gmfdiag.preferences.utils.PreferenceConstantHelper;
import org.eclipse.papyrus.uml.tools.utils.ICustomAppearence;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;

/**
 * Specific {@link Property} preference page
 */
public class PropertyPreferencePage extends AbstractPapyrusElementPreferencePage {

	/**
	 * Listeners for the check buttons that select the display of the {@link Property}
	 */
	private class AppearenceSelectionListener implements SelectionListener {

		/** the constant which refers the element to display or not */
		final private int style;

		/**
		 * Default Constructor.
		 * 
		 * @param style
		 */
		public AppearenceSelectionListener(int style) {
			this.style = style;
		}

		/**
		 * {@inheritDoc}
		 */
		public void widgetDefaultSelected(SelectionEvent e) {

		}

		/**
		 * {@inheritDoc}
		 */
		public void widgetSelected(SelectionEvent e) {
			// add or remove the flag to the display property value (invert the current value)
			propertyValue = propertyValue ^ style;

			// refresh buttons at the end
			refreshButtons();
		}
	}

	/**
	 * @generated
	 */
	public static void initDefaults(IPreferenceStore store) {

		String elementName = "Property"; //$NON-NLS-1$
		PreferenceConverter.setDefault(store, PreferenceConstantHelper.getElementConstant(elementName, PreferenceConstantHelper.COLOR_FILL), new org.eclipse.swt.graphics.RGB(255, 255, 255));
		PreferenceConverter.setDefault(store, PreferenceConstantHelper.getElementConstant(elementName, PreferenceConstantHelper.COLOR_LINE), new org.eclipse.swt.graphics.RGB(177, 207, 229));

		// Set the default for the gradient
		store.setDefault(PreferenceConstantHelper.getElementConstant(elementName, PreferenceConstantHelper.GRADIENT_POLICY), false);
		GradientPreferenceConverter gradientPreferenceConverter = new GradientPreferenceConverter(new org.eclipse.swt.graphics.RGB(255, 255, 255), new org.eclipse.swt.graphics.RGB(177, 207, 229), 0, 0);
		store.setDefault(PreferenceConstantHelper.getElementConstant(elementName, PreferenceConstantHelper.COLOR_GRADIENT), gradientPreferenceConverter.getPreferenceValue());

		// custom code
		store.setDefault(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE, ICustomAppearence.DEFAULT_UML_PROPERTY);

	}

	/** buttons to select the display kind for the label of the {@link Property} */
	protected Button displVisibility, displDerive, displName, displType, displMutliplicity, displDfltValue, displModifiers;

	/** current property display style */
	private int propertyValue = getPreferenceStore().getInt(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE);

	/**
	 * Creates a button with the {@link SWT#CHECK} style.
	 * 
	 * @param parent
	 *        the parent of the button
	 * @param label
	 *        the label of the button
	 * @param mask
	 *        the value controlled by the button
	 * @return the button created
	 */
	protected Button createCheckButton(Composite parent, String label, int mask) {
		Button button = new Button(parent, SWT.CHECK);
		button.setText(label);
		button.addSelectionListener(new AppearenceSelectionListener(mask));
		return button;
	}

	/**
	 * Creates the group and check boxes to choose the kind of display
	 * 
	 * @param parent
	 *        the parent composite that holds the group
	 */
	protected void createLabelPreferencesButtons(Composite parent) {
		// create group that host the buttons
		Group group = new Group(parent, SWT.SHADOW_NONE);
		group.setText("Label Display"); //$NON-NLS-1$
		group.setLayout(new FormLayout());

		FormData data;

		displVisibility = createCheckButton(group, "Visibility", ICustomAppearence.DISP_VISIBILITY); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(0, 0);
		displVisibility.setLayoutData(data);

		displDerive = createCheckButton(group, "Derived", ICustomAppearence.DISP_DERIVE); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(displVisibility, 85);
		data.top = new FormAttachment(0, 0);
		displDerive.setLayoutData(data);

		displName = createCheckButton(group, "Name", ICustomAppearence.DISP_NAME); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(displDerive, 85);
		data.top = new FormAttachment(0, 0);
		displName.setLayoutData(data);

		displType = createCheckButton(group, "Type", ICustomAppearence.DISP_TYPE); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(displName, 85);
		data.top = new FormAttachment(0, 0);
		displType.setLayoutData(data);

		displMutliplicity = createCheckButton(group, "Multiplicity", ICustomAppearence.DISP_MULTIPLICITY); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.top = new FormAttachment(displVisibility, ITabbedPropertyConstants.HSPACE);
		displMutliplicity.setLayoutData(data);

		displDfltValue = createCheckButton(group, "Default Value", ICustomAppearence.DISP_DFLT_VALUE); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(displVisibility, 85);
		data.top = new FormAttachment(displVisibility, ITabbedPropertyConstants.HSPACE);
		displDfltValue.setLayoutData(data);

		displModifiers = createCheckButton(group, "Modifiers", ICustomAppearence.DISP_MOFIFIERS); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(displDerive, 85);
		data.top = new FormAttachment(displVisibility, ITabbedPropertyConstants.HSPACE);
		displModifiers.setLayoutData(data);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createPageContents(Composite parent) {
		super.createPageContents(parent);

		// adds the label preferences checkboxes
		createLabelPreferencesButtons(parent);

		refreshButtons();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getBundleId() {
		return org.eclipse.papyrus.uml.diagram.profile.part.UMLDiagramEditorPlugin.ID;
	}

	/**
	 * Load the default preferences of the fields contained in this page
	 */
	protected void loadDefaultPreferences() {
		propertyValue = getPreferenceStore().getInt(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE);
		refreshButtons();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void performDefaults() {
		loadDefaultPreferences();
		super.performDefaults();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performOk() {
		storePreferences();
		return super.performOk();
	}

	/**
	 * Refresh the buttons that manages the display.
	 */
	protected void refreshButtons() {
		// IPreferenceStore store = getPreferenceStore();
		// int displayValue =
		// store.getInt(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE);
		// if (proper == 0) {
		// displayValue = ICustomAppearence.DEFAULT_UML_PROPERTY;
		// }

		displVisibility.setSelection((propertyValue & ICustomAppearence.DISP_VISIBILITY) == ICustomAppearence.DISP_VISIBILITY);
		displDerive.setSelection((propertyValue & ICustomAppearence.DISP_DERIVE) == ICustomAppearence.DISP_DERIVE);
		displName.setSelection((propertyValue & ICustomAppearence.DISP_NAME) == ICustomAppearence.DISP_NAME);
		displType.setSelection((propertyValue & ICustomAppearence.DISP_TYPE) == ICustomAppearence.DISP_TYPE);
		displMutliplicity.setSelection((propertyValue & ICustomAppearence.DISP_MULTIPLICITY) == ICustomAppearence.DISP_MULTIPLICITY);
		displDfltValue.setSelection((propertyValue & ICustomAppearence.DISP_DFLT_VALUE) == ICustomAppearence.DISP_DFLT_VALUE);
		displModifiers.setSelection((propertyValue & ICustomAppearence.DISP_MOFIFIERS) == ICustomAppearence.DISP_MOFIFIERS);
	}

	/**
	 * Stores the values of the fields contained in this page into the preference store.
	 */
	protected void storePreferences() {
		IPreferenceStore store = getPreferenceStore();
		// checks the stored value and the actual one, so does not refresh diagram if it is not
		// needed
		if(propertyValue != store.getInt(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE)) {
			store.setValue(IPapyrusPropertyPreferencesConstant.PROPERTY_LABEL_DISPLAY_PREFERENCE, propertyValue);
		}
	}
}
