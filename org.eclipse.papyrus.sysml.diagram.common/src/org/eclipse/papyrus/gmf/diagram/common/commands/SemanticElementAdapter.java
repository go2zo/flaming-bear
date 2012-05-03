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
package org.eclipse.papyrus.gmf.diagram.common.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.uml.diagram.common.commands.SemanticAdapter;

/**
 * An adapter for {@link IElementType}, {@link EObject} or {@link View}.
 */
public class SemanticElementAdapter extends SemanticAdapter {

	/** The elementType. */
	private Object elementType;

	/** Constructor from EObject */
	public SemanticElementAdapter(EObject element) {
		super(element, null);
		this.elementType = null;
	}

	/** Constructor from IElementType */
	public SemanticElementAdapter(IElementType elementType) {
		super(null, null);
		this.elementType = elementType;
	}

	/** Constructor from EObject and IElementType */
	public SemanticElementAdapter(EObject element, IElementType elementType) {
		super(element, null);
		this.elementType = elementType;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if(adapter.equals(IElementType.class)) {
			return elementType;
		}
		return super.getAdapter(adapter);
	}
}
