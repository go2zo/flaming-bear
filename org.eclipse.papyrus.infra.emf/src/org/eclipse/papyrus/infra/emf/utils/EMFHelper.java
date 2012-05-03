/*****************************************************************************
 * Copyright (c) 2010 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.infra.emf.Activator;

/**
 * A Helper class for manipulating EMF Objects
 * 
 * @author Camille Letavernier
 */
//TODO : Check implementations. Most of them are old and don't always match the specification
public class EMFHelper {

	/**
	 * Returns the EClass corresponding to the given nsUri and className
	 * 
	 * @param nsUri
	 *        The NSURI of the EClass' EPackage
	 * @param className
	 *        The EClass' name
	 * @return
	 *         The EClass instance, or null if the EClass couldn't be found
	 */
	public static EClass getEClass(String nsUri, String className) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri);
		if(ePackage == null) {
			Activator.log.warn("Cannot find an EPackage matching the nsURI " + nsUri); //$NON-NLS-1$
			return null;
		}
		return getEClass(ePackage, className);
	}

	/**
	 * Return the EClass corresponding to the given EPackage and className
	 * 
	 * @param metamodel
	 *        The EClass' EPackage
	 * @param className
	 *        The EClass' name
	 * @return
	 *         The EClass instance, or null if the EClass couldn't be found
	 */
	public static EClass getEClass(EPackage metamodel, String className) {
		EClassifier classifier = metamodel.getEClassifier(className);
		if(classifier == null) {
			Activator.log.warn("Classifier " + className + " not found in metamodel " + metamodel.getName() + " (" + metamodel.getNsURI() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}
		if(classifier instanceof EClass) {
			return (EClass)classifier;
		} else {
			Activator.log.warn("Classifier " + className + " in " + metamodel.getName() + " (" + metamodel.getNsURI() + ") is not an EClass"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}

		return null;
	}

	/**
	 * Tests if an Object is an instance of the given EClass
	 * 
	 * @param element
	 *        The EObject to test
	 * @param className
	 *        The name of the EClass
	 * @param metamodel
	 *        The EPackage owning the EClass
	 * @return
	 *         True if the EObject is an instance of the EClass, or of one of the EClass' subtypes
	 */
	public static boolean isInstance(EObject element, String className, EPackage metamodel) {

		EClassifier theClass = metamodel.getEClassifier(className);

		if(theClass == null) {
			Activator.log.warn("Class " + className + " not found in Metamodel : " + metamodel.getName() + " (" + metamodel.getNsURI() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			return false;
		}

		return theClass.isInstance(element);
	}

	/**
	 * Tests if the given eClass is a Subclass of fromClass
	 * 
	 * @param eClass
	 * @param fromClass
	 * @return
	 *         true if eClass is a subclass of fromClass
	 */
	public static boolean isSubclass(EClass eClass, EClass fromClass) {
		//Everything is an EObject
		if(eClass != null && fromClass == EcorePackage.eINSTANCE.getEObject()) {
			return true;
		}

		if(eClass == fromClass) {
			return true;
		}

		List<EClass> superTypes = eClass.getEAllSuperTypes();
		if(superTypes.contains(fromClass)) {
			return true;
		}

		return false;
	}

	/**
	 * Returns the EObject corresponding to the input object
	 * Tests if the input is an EObject, or if it is Adaptable
	 * to an EObject
	 * 
	 * @param source
	 * @return An EObject corresponding to the input source, or null
	 *         if the EObject could not be resolved
	 */
	public static EObject getEObject(Object source) {
		if(source instanceof EObject) {
			return (EObject)source;
		} else if(source instanceof IAdaptable) {
			EObject eObject = (EObject)((IAdaptable)source).getAdapter(EObject.class);
			if(eObject == null) { //EMF Facet
				eObject = (EObject)((IAdaptable)source).getAdapter(EReference.class);
			}
			return eObject;
		}

		return null;
	}

	/**
	 * Retrieve the EditingDomain for the given source object. The object is first
	 * resolved to an EObject through #getEObject when possible.
	 * 
	 * @param source
	 * @return
	 *         The source object's editing domain, or null if it couldn't be found
	 */
	public static EditingDomain resolveEditingDomain(Object source) {
		return resolveEditingDomain(getEObject(source));
	}

	/**
	 * Retrieve the EditingDomain for the given source EObject
	 * 
	 * @param source
	 * @return
	 *         The source eObject's editing domain, or null if it couldn't be found
	 */
	public static EditingDomain resolveEditingDomain(EObject source) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(source);
	}

	/**
	 * Return the eClassifier' qualified name. The qualified name is obtained by the concatenation
	 * of its package hierarchy with the class name, separated by the given separator
	 * 
	 * @param eClassifier
	 * @param separator
	 *        The separator used between each package name
	 * @return
	 *         The EClassifier' qualified name
	 */
	public static String getQualifiedName(EClassifier eClassifier, String separator) {
		return getQualifiedName(eClassifier.getEPackage(), separator) + separator + eClassifier.getName();
	}

	/**
	 * Return the ePackage's qualified name. The qualified name is obtained by the concatenation
	 * of its superPackage hierarchy with the ePackage name, separated by the given separator
	 * 
	 * @param ePackage
	 * @param separator
	 *        The separator used between each package name
	 * @return
	 *         The EPackage's qualified name
	 */
	public static String getQualifiedName(EPackage ePackage, String separator) {
		if(ePackage.getESuperPackage() == null) {
			return ePackage.getName();
		}
		return getQualifiedName(ePackage.getESuperPackage(), separator) + separator + ePackage.getName();
	}


	/**
	 * Loads and returns the first EObject at the given URI.
	 * The EObject is loaded in the given resourceSet.
	 * 
	 * @param resourceSet
	 *        The ResourceSet in which the model will be loaded
	 * @param uri
	 *        The URI describing the location of the model to load
	 * @return
	 *         The first EObject located at the given URI
	 * @throws IOException
	 * 
	 */
	public static EObject loadEMFModel(ResourceSet resourceSet, URI uri) throws IOException {
		if(resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		try {
			Resource resource = resourceSet.getResource(uri, true);
			if(resource != null) {
				if(!resource.getContents().isEmpty()) {
					return resource.getContents().get(0);
				}
			}
		} catch (Exception ex) {
			IOException exception = new IOException(ex.toString());
			exception.initCause(ex);
			throw exception;
		}

		return null;
	}

	/**
	 * Return the root package containing the given package, or the package
	 * itself if it is already the root
	 * 
	 * @param ePackage
	 * @return
	 *         The Root package
	 */
	public static EPackage getRootPackage(EPackage ePackage) {
		if(ePackage == null) {
			return null;
		}

		if(ePackage.getESuperPackage() == null) {
			return ePackage;
		}
		return getRootPackage(ePackage.getESuperPackage());
	}


	/**
	 * Return the list of EClasses that are subtypes
	 * of the given EClass
	 * 
	 * @param type
	 * @param concreteClassesOnly
	 *        If true, only Concrete EClasses will be returned. Abstract and Interface EClasses will be filtered
	 * @return
	 *         The list of EClasses implementing or extending the given EClass
	 */
	public static List<EClass> getSubclassesOf(EClass type, boolean concreteClassesOnly) {
		List<EClass> result = new LinkedList<EClass>();
		if(!concreteClassesOnly || (!type.isAbstract() && !type.isInterface())) {
			result.add(type);
		}

		EPackage ePackage = getRootPackage(type.getEPackage());
		getSubclassesOf(type, ePackage, result, concreteClassesOnly);
		return result;
	}

	private static void getSubclassesOf(EClass type, EPackage fromPackage, List<EClass> result, boolean concreteClassesOnly) {
		for(EClassifier classifier : fromPackage.getEClassifiers()) {
			if(classifier instanceof EClass) {
				EClass eClass = (EClass)classifier;
				if(eClass.getEAllSuperTypes().contains(type)) {
					if(!concreteClassesOnly || (!eClass.isAbstract() && !eClass.isInterface())) {
						result.add(eClass);
					}
				}
			}
		}

		for(EPackage subPackage : fromPackage.getESubpackages()) {
			getSubclassesOf(type, subPackage, result, concreteClassesOnly);
		}
	}

	/**
	 * Tests if an EObject is read only
	 * Delegates to the EObject's editing domain if it can be found
	 * 
	 * @param eObject
	 * @return
	 *         True if the EObject is read only
	 */
	public static boolean isReadOnly(EObject eObject) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		return isReadOnly(eObject, domain);
	}

	/**
	 * Tests if an EObject is read only
	 * Delegates to the given editing domain if it isn't null
	 * 
	 * @param eObject
	 * @param domain
	 * @return
	 *         True if the EObject is read only
	 */
	public static boolean isReadOnly(EObject eObject, EditingDomain domain) {
		return isReadOnly(eObject.eResource(), domain);
	}

	/**
	 * Tests if the Resource is read only
	 * Delegates to the given editing domain if it isn't null
	 * 
	 * @param resource
	 * @param domain
	 * @return
	 *         True if the Resource is read only
	 */
	public static boolean isReadOnly(Resource resource, EditingDomain domain) {
		if(domain instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain)domain).isReadOnly(resource);
		}

		if(resource == null) {
			return false;
		}

		ResourceSet resourceSet = resource.getResourceSet();

		if(resourceSet == null) {
			return false;
		}

		Map<String, ?> attributes = resourceSet.getURIConverter().getAttributes(resource.getURI(), null);
		Boolean readOnly = (Boolean)attributes.get(URIConverter.ATTRIBUTE_READ_ONLY);

		return readOnly == null ? false : readOnly;
	}

	/**
	 * Tests if the given EStructuralFeature is required (ie. should always
	 * have a value)
	 * 
	 * A feature is required if at least of one the following conditions if
	 * true :
	 * 
	 * - It has a defaultValue
	 * - Its lowerBound is at least 1
	 * - It is an enumeration (Enumerations always have a default value)
	 * - It is a Java primitive type, and is not marked as Unsettable
	 * 
	 * @param feature
	 *        the feature to test
	 * @return
	 *         true if the feature is required, false otherwise
	 */
	public static boolean isRequired(EStructuralFeature feature) {
		//EEnums are always required, as an EEnum always has a default value
		if(feature.getEType() instanceof EEnum) {
			return true;
		}

		//At least one value means it is required
		if(feature.getLowerBound() >= 1) {
			return true;
		}

		//Java primitive types cannot have a null value
		//if the feature is not specifically marked as unsettable, then it is required
		if(feature.getEType().getInstanceClass().isPrimitive() && !feature.isUnsettable()) {
			return true;
		}

		//If there is a default value, there is always a value
		if(feature.getDefaultValueLiteral() != null) {
			return true;
		}

		return false; //The property if not required
	}
	
	/**
	 * 
	 * @param resource
	 *        a resource
	 * 
	 * @return
	 *         the list of the metamodel knows by the resource
	 */
	public static Set<EPackage> getMetamodels(final Resource resource) {
		Set<EPackage> metamodels = new HashSet<EPackage>();
		if(resource != null) {
			final List<EObject> contents = new ArrayList<EObject>(resource.getContents());
			for(final EObject current : contents) {
				metamodels.add(current.eClass().getEPackage());
			}
		}
		return metamodels;
	}


}
