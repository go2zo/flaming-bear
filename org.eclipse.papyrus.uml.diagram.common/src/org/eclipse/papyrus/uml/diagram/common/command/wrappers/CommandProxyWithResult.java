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
 *   Mathieu Velten (Atos Origin) mathieu.velten@atosorigin.com - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.diagram.common.command.wrappers;

import org.eclipse.gef.commands.Command;

/**
 * This command proxy wraps a GEF command into a GMF one, with result stored in
 * the CommandResult.
 * @author mvelten
 *
 * @deprecated use {@link org.eclipse.papyrus.commands.wrappers.CommandProxyWithResult} instead
 * 
 */
public class CommandProxyWithResult extends org.eclipse.papyrus.commands.wrappers.CommandProxyWithResult {

	public CommandProxyWithResult(Command command, Object result) {
		super(command, result);
	}
}
