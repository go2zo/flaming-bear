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
 *  Patrick Tessier (CEA LIST) Patrick.tessier@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.uml.diagram.common.figure.node;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * this figure is a circle with cross
 */
public class FlowFinalNode extends PapyrusNodeFigure implements IPapyrusNodeUMLElementFigure{
	/**
	 * {@inheritDoc}
	 */
	protected Border getDefaultBorder(Color borderColor) {
		return null;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		return new Dimension(20,20);
	}
	/**
	 * {@inheritDoc}
	 */
	public void paintFigure(Graphics graphics) {
		
		graphics.setForegroundColor(getForegroundColor());
		Rectangle r = getBounds().getCopy().crop(new Insets(0, 0, 1, 1));
		if(isUsingGradient()) {
			graphics.setBackgroundColor(FigureUtilities.integerToColor(getGradientColor2()));
			// graphics.setForegroundColor(FigureUtilities.integerToColor(getGradientColor2()));
		} else {
			graphics.setBackgroundColor(getBackgroundColor());
			// graphics.setForegroundColor(getForegroundColor());
		}
		graphics.setLineWidth(1);
		graphics.drawOval(r);
		// intersection coordinates.
		int x = (int)(r.width / (2 * Math.sqrt(2)));
		int y = (int)(r.height / (2 * Math.sqrt(2)));

		// cross.
		graphics.drawLine(r.getCenter().translate(x, -y), r.getCenter().translate(-x, y));
		graphics.drawLine(r.getCenter().translate(-x, -y), r.getCenter().translate(x, y));
	}
	/**
	 * {@inheritDoc}
	 */
	public void setStereotypeDisplay(String stereotypes, Image image) {
	}
	/**
	 * {@inheritDoc}
	 */
	public void setStereotypePropertiesInBrace(String stereotypeProperties) {
	}
	/**
	 * {@inheritDoc}
	 */
	public void setStereotypePropertiesInCompartment(String stereotypeProperties) {
	}
	/**
	 * {@inheritDoc}
	 */
	public Label getStereotypesLabel() {
		return new Label();
	}
}
