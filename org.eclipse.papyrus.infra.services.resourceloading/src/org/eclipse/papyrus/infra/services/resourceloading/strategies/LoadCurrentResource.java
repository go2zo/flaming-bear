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
 *  Emilien Perico (Atos Origin) emilien.perico@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.infra.services.resourceloading.strategies;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.services.resourceloading.ILoadingStrategy;


public class LoadCurrentResource implements ILoadingStrategy {

	/**
	 * {@inheritDoc} Only loads additional resources (types, profiles, etc) and the current opened resource
	 * Controlled resources from the current one are not loaded
	 */
	public boolean loadResource(ModelSet modelSet, URI uri) {
		return (!uri.isPlatform() && !uri.isFile());
	}

}
