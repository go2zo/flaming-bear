/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr
 *****************************************************************************/
package org.eclipse.papyrus.uml.tools.providers;

import java.util.Collections;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.providers.EMFEnumeratorContentProvider;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForResource;
import org.eclipse.papyrus.infra.widgets.providers.EncapsulatedContentProvider;
import org.eclipse.papyrus.infra.widgets.providers.IHierarchicContentProvider;
import org.eclipse.papyrus.uml.tools.util.UMLProviderHelper;
import org.eclipse.papyrus.uml.tools.utils.ProfileUtil;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * A global content provider for UML
 */
public class UMLContentProvider extends EncapsulatedContentProvider {

	protected EObject eObject;

	protected EStructuralFeature feature;

	protected Stereotype stereotype;

	/**
	 * Constructor.
	 * 
	 * @param source
	 *        The edited EObject
	 * @param feature
	 *        The edited EStructuralFeature
	 */
	public UMLContentProvider(final EObject source, final EStructuralFeature feature) {
		this(source, feature, null);
	}

	/**
	 * 
	 * @param source
	 *        The edited {@link EObject} (Should be either a UML Element or a StereotypeApplication)
	 * @param feature
	 *        The edited {@link EStructuralFeature}
	 * @param stereotype
	 *        The {@link Stereotype} of the source EObject. May be null if the source is not a StereotypeApplication
	 */
	public UMLContentProvider(final EObject source, final EStructuralFeature feature, final Stereotype stereotype) {
		this.eObject = source;
		this.feature = feature;
		this.stereotype = stereotype;

		IStructuredContentProvider semanticProvider = getSemanticProvider(source, feature, stereotype);

		encapsulated = UMLProviderHelper.encapsulateProvider(semanticProvider, eObject, feature);
	}

	/**
	 * 
	 * @param source
	 *        The edited {@link EObject} (Should be either a UML Element or a StereotypeApplication)
	 * @param feature
	 *        The edited {@link EStructuralFeature}
	 * @param stereotype
	 *        The {@link Stereotype} of the source {@link EObject}. May be null if the source is not a StereotypeApplication
	 * @return
	 */
	protected IStructuredContentProvider getSemanticProvider(final EObject source, final EStructuralFeature feature, final Stereotype stereotype) {
		if(UMLUtil.getBaseElement(source) != null) {
			Property umlReference = ProfileUtil.findStereotypedProperty(stereotype, feature.getName());
			if(umlReference != null) {
				return getStereotypedReferenceContentProvider(source, feature, (Stereotype)umlReference.getType());
			}
		}

		if(feature.getEType() instanceof EEnum) {
			return new EMFEnumeratorContentProvider(feature);
		}

		try {
			ModelSet root = ServiceUtilsForResource.getInstance().getModelSet(eObject.eResource());
			//ModelSet root = ModelUtils.getModelSetChecked(EditorUtils.getServiceRegistry());

			if(feature == UMLPackage.eINSTANCE.getPort_Provided() || feature == UMLPackage.eINSTANCE.getPort_Required()) {
				//TODO : Use a specific content provider here, when it exists
				return new ServiceEditFilteredContentProvider(source, feature, root);
			} else if(feature == UMLPackage.eINSTANCE.getInstanceValue_Instance()) {
				return new InstanceValueContentProvider((InstanceValue)source, feature, root);
			} else {
				return new ServiceEditFilteredContentProvider(source, feature, root);
			}
		} catch (ServiceException ex) {
			throw new RuntimeException("Cannot instantiate the UMLContentProvider", ex);
		}
	}

	/**
	 * Uses the content provider for reference properties typed by a stereotype
	 * 
	 * @param propertyPath
	 *        The name of the property being edited
	 * @return
	 *         The Content Provider for properties typed by a stereotype
	 */
	protected IHierarchicContentProvider getStereotypedReferenceContentProvider(EObject source, EStructuralFeature feature, Stereotype type) {
		ResourceSet root = UMLUtil.getBaseElement(source).eResource().getResourceSet();

		ServiceEditFilteredContentProvider contentProvider = new ServiceEditFilteredContentProvider(source, feature, root);
		contentProvider.setWantedMetaclasses(Collections.singletonList(type));

		return contentProvider;
	}
}
