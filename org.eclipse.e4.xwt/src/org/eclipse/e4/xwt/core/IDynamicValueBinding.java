/*******************************************************************************
 * Copyright (c) 2006, 2010 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.xwt.core;

import org.eclipse.e4.xwt.metadata.IProperty;

public interface IDynamicValueBinding extends IDynamicBinding {
	public IProperty getProperty();
	public void setProperty(IProperty property);
	
	public Object getObject();
	public void setObject(Object object);
}
