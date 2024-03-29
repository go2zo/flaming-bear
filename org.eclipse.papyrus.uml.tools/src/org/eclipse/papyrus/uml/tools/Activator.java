package org.eclipse.papyrus.uml.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.papyrus.infra.core.log.LogHelper;
import org.eclipse.papyrus.uml.tools.utils.ElementUtil;
import org.eclipse.papyrus.uml.tools.utils.ImageUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.papyrus.uml.tools"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	public static LogHelper log;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		log = new LogHelper(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}




	///////////////////////////////////////////////////////////////////////////
	//
	//	The following code has been extracted from oep.uml.diagram.common during the refactoring,
	//	to avoid cyclic dependencies between this plug-in and oep.uml.diagram.common.
	//	This is temporary code, as the Image service is not yet available.
	//	This code should be removed as soon as the Image service is available.
	//
	///////////////////////////////////////////////////////////////////////////


	private final static String UML_ICONS = "/org.eclipse.uml2.uml.edit/icons/full/obj16/";


	/**
	 * Gets the Image for the given EClass
	 * 
	 * @param eClass
	 * @return
	 * 
	 * @deprecated This class can be used during the refactoring phase, until
	 *             the Image service is written. There is currently no alternative.
	 */
	@Deprecated
	//FIXME : To be refactored. Replace with the Image service when it is available
	public Image getImageForUMLMetaclass(EClass eClass) {
		return org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImageFromPlugin(UML_ICONS + eClass.getName() + ".gif"); //$NON-NLS-1$
	}

	/**
	 * this method returns the icon image that represents the first applied
	 * stereotype.
	 * 
	 * @param element
	 *        the stereotyped element
	 * @return {@link image} of the icon
	 */
	@Deprecated
	public Image getIconElement(Element element) {

		List<Stereotype> stereotypeList = element.getAppliedStereotypes();
		if(stereotypeList == null || stereotypeList.isEmpty()) {
			return null;
		}
		return getIconElement(element, stereotypeList.get(0));
	}

	/**
	 * this method returns the collection of icon images that represents the
	 * applied stereotypes.
	 * 
	 * @param elt
	 *        the stereotyped element
	 * @param stereotypes
	 *        the collection of stereotypes which icon has to be displayed
	 * @param kind
	 *        the kind of display "icon" or "shape"
	 * @return {@link image} of the icon
	 */
	@Deprecated
	public Collection<Image> getIconElements(Element elt, Collection<Stereotype> stereotypes) {
		Collection<Image> images = new ArrayList<Image>();

		// look in each stereotype and get the image for each of them
		for(Stereotype stereotype : stereotypes) {
			// getStereotypeImage can return null
			org.eclipse.uml2.uml.Image icon = ElementUtil.getStereotypeImage(elt, stereotype, "icon");
			if(icon != null) {
				images.add(getImageInRegistry(icon));
			}
		}
		return images;
	}

	/**
	 * this method returns the icon image that represents the first applied
	 * stereotype.
	 * 
	 * @param elt
	 *        the stereotyped element
	 * @param stereotype
	 *        the stereotype which icon has to be displayed
	 * @param kind
	 *        the kind of display "icon" or "shape"
	 * @return {@link image} of the icon
	 */
	@Deprecated
	public static Image getIconElement(Element elt, Stereotype stereotype) {

		// getStereotypeImage can return null
		org.eclipse.uml2.uml.Image icon = ElementUtil.getStereotypeImage(elt, stereotype, "icon");
		if(icon != null) {
			return getImageInRegistry(icon);
		} else {
			return null;
		}
	}

	/**
	 * Find the image (SWT) in registry Store image in registry if it is not
	 * found
	 * 
	 * @param umlImage
	 *        to retrieve as SWT Image in registry
	 * @return the stored SWT image
	 */
	@Deprecated
	public static Image getImageInRegistry(org.eclipse.uml2.uml.Image umlImage) {
		// Retrieve registry
		ImageRegistry papyrusRegistry = getDefault().getImageRegistry();

		// Get image id for registry
		String image_id = ImageUtil.getImageId(umlImage);

		// Get SWT image for shape in the registry
		Image image = papyrusRegistry.get(image_id);

		// If image was not found in registry,
		// try to find an image and to update registry
		if(image == null) {

			try {
				// Try to retrieve image from UML Image content property
				image = ImageUtil.getContent(umlImage);
			} catch (Exception e) {
				// Activator.log.error(e);
			}

			// If no image was found in Content
			// Try to retrieve image from UML Image location property
			if(image == null) {
				image = ImageUtil.getImageFromLocation(umlImage);
			}

			if(image != null) {
				// Store image in registry
				ImageData imdata = image.getImageData();
				papyrusRegistry.put(image_id, ImageDescriptor.createFromImageData(imdata));
				image = papyrusRegistry.get(image_id);
			}
		}

		return image;
	}

}
