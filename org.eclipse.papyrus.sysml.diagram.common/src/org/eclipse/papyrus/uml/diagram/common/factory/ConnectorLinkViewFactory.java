/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		
 *		CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.factory;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.gmf.diagram.common.factory.ConnectorViewFactory;
import org.eclipse.papyrus.uml.diagram.common.utils.UMLGraphicalTypes;

/**
 * View factory for Connector.
 */
public class ConnectorLinkViewFactory extends ConnectorViewFactory {

	/**
	 * Creates Connector view and add Label nodes
	 */
	@Override
	protected void decorateView(View containerView, View view, IAdaptable element, String semanticHint, int index, boolean persisted) {

		getViewService().createNode(element, view, UMLGraphicalTypes.LINKLABEL_UML_APPLIEDSTEREOTYPE_ID, ViewUtil.APPEND, persisted, getPreferencesHint());
		getViewService().createNode(element, view, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_LABEL_ID, ViewUtil.APPEND, persisted, getPreferencesHint());
		getViewService().createNode(element, view, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_SOURCE_MULTIPLICITY_ID, ViewUtil.APPEND, persisted, getPreferencesHint());
		getViewService().createNode(element, view, UMLGraphicalTypes.LINKLABEL_UML_CONNECTOR_TARGET_MULTIPLICITY_ID, ViewUtil.APPEND, persisted, getPreferencesHint());

		super.decorateView(containerView, view, element, semanticHint, index, persisted);
	}
}
