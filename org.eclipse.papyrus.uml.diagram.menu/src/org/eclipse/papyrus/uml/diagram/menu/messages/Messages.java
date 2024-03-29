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
package org.eclipse.papyrus.uml.diagram.menu.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{

    private static final String BUNDLE_NAME = "org.eclipse.papyrus.uml.diagram.menu.messages.messages"; //$NON-NLS-1$

    public static String ShowHideCompartmentAction_Messages;

    public static String ShowHideCompartmentAction_No_Name;

    public static String ShowHideCompartmentAction_Title;

    public static String ShowHideCompartmentAction_PropagateToSameType;

    public static String ShowHideConnectionLabelsAction_LabelsManager;

    public static String ShowHideConnectionLabelsAction_SelectTheLabelToDisplay;

    public static String ZoomToolbar_Zoom;

    public static String SelectTypeAction_SelectActionName;

    public static String SelectTypeAction_SelectionActionTooltype;

    static
    {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages()
    {
    }
}
