/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.infra.emf.providers.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.facet.infra.facet.FacetReference;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.widgets.providers.IAdaptableContentProvider;
import org.eclipse.papyrus.infra.widgets.strategy.ProviderBasedBrowseStrategy;
import org.eclipse.swt.widgets.TreeItem;

/**
 * A TreeBrowseStrategy based on the semantic model.
 * It can also retrieve a semantic element in a MoDisco tree, when the tree structure is close
 * to the semantic one (With optional EReferences).
 * 
 * Container1::Container2::EObject1 can be retrieved in a Tree representing
 * Container1::(Reference1)::Container2::(Reference2)::EObject1
 * 
 * @author Camille Letavernier
 */
public class ContainmentBrowseStrategy extends ProviderBasedBrowseStrategy {

	protected IAdaptableContentProvider adaptableProvider;

	protected TreeViewer viewer;

	public ContainmentBrowseStrategy(ITreeContentProvider provider) {
		if(!(provider instanceof IAdaptableContentProvider)) {
			throw new IllegalArgumentException("The provider must be an IAdaptableContentProvider");
		}

		setProvider(provider);
		this.adaptableProvider = (IAdaptableContentProvider)super.provider;
	}

	//
	//	Elements filtering
	//

	@Override
	protected boolean browseElement(Object containerElement) {
		Object semanticElement = adaptableProvider.getAdaptedValue(containerElement);

		if(semanticElement instanceof EReference && !(semanticElement instanceof FacetReference)) {
			//Only browse Containment references and Facet references
			return ((EReference)semanticElement).isContainment();
		}

		return true;
	}

	//
	//	Elements search
	//

	//	/**
	//	 * {@inheritDoc}
	//	 */
	//	@Override
	//	public TreePath findPath(Object semanticElement, Object[] rootElements) {
	//		List<Object> semanticPath = new LinkedList<Object>();
	//		findSemanticPath(semanticElement, semanticPath);
	//		return searchPath(semanticPath, rootElements);
	//	}

	//	/**
	//	 * Fills the semantic path to the given element
	//	 * 
	//	 * @param element
	//	 *        The element to retrieve
	//	 * @param currentPath
	//	 *        The path to fill (in-out)
	//	 */
	//	protected void findSemanticPath(Object element, List<Object> currentPath) {
	//		if(element != null && element instanceof EObject) {
	//			findSemanticPath(getSemanticParent(element), currentPath);
	//			currentPath.add(element);
	//		}
	//	}
	//
	//	protected Object getSemanticParent(Object element) {
	//		if(element instanceof EObject) {
	//			return ((EObject)element).eContainer();
	//		}
	//		return null;
	//	}
	//
	//	/**
	//	 * Retrieve the graphical TreePath from the given semantic path
	//	 * 
	//	 * @param semanticPath
	//	 * @return
	//	 */
	//	protected TreePath searchPath(List<Object> semanticPath, Object input) {
	//		List<Object> graphicalPath = new LinkedList<Object>();
	//		Object[] graphicalRootObjects = (Object[])input;
	//		if(!searchPath(semanticPath, graphicalPath, graphicalRootObjects)) {
	//			//Object not found
	//			graphicalPath.clear();
	//		}
	//
	//		return new TreePath(graphicalPath.toArray());
	//	}
	//
	//	protected boolean searchPath(List<Object> semanticPath, List<Object> graphicalPath, Object[] graphicalRootObjects) {
	//		if(semanticPath.isEmpty()) {
	//			return true;
	//		}
	//
	//		if(graphicalRootObjects == null) {
	//			return false;
	//		}
	//
	//		Object currentElement = semanticPath.get(0);
	//		for(Object graphicalElement : graphicalRootObjects) {
	//			Object semanticValue = adaptableProvider.getAdaptedValue(graphicalElement);
	//
	//			//Specific case for containment EReference
	//			if(semanticValue instanceof EReference) {
	//				EReference referenceToBrowse = (EReference)semanticValue;
	//				if(referenceToBrowse.isContainment()) {
	//					graphicalPath.add(graphicalElement);
	//
	//					if(searchPath(semanticPath, graphicalPath, provider.getChildren(graphicalElement))) {
	//						//The element has been found
	//						return true;
	//					}
	//
	//					//The element has not been found ; we revert the modifications
	//					graphicalPath.remove(graphicalElement);
	//				}
	//			}
	//
	//			if(semanticValue == currentElement) {
	//				semanticPath.remove(0);
	//				graphicalPath.add(graphicalElement);
	//				if(searchPath(semanticPath, graphicalPath, provider.getChildren(graphicalElement))) {
	//					return true;
	//				}
	//			}
	//		}
	//
	//		return false;
	//	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if(viewer instanceof TreeViewer) {
			this.viewer = (TreeViewer)viewer;
		}
		super.inputChanged(viewer, oldInput, newInput);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void revealSemanticElement(List<?> elementList) {
		//for each element we reveal it
		Iterator<?> elementListIterator = elementList.iterator();
		ArrayList<Object> treeElementToSelect = new ArrayList<Object>();
		while(elementListIterator.hasNext()) {
			Object currentElement = elementListIterator.next();
			//test if the type is an EObject
			if(currentElement instanceof EObject) {
				EObject currentEObject = (EObject)currentElement;
				//the content provider exist?
				if(provider != null) {
					//need the root in order to find all element in the tree
					Object root = provider.getElements(null)[0];
					//look for the path in order to access to this element
					List<Object> path = searchPath(currentEObject, Arrays.asList(provider.getElements(root)));
					if(path.size() > 0) {
						//expand in the common viewer the path
						expandItems(path, viewer.getTree().getItems());
						treeElementToSelect.add(path.get(path.size() - 1));
					}
				}
			}
			selectReveal(new StructuredSelection(treeElementToSelect));
		}
	}

	public void expandItems(List<Object> treeElementList, TreeItem[] list) {
		//the treeElement has more tan one element
		if(treeElementList.size() > 0) {
			for(int i = 0; i < list.length; i++) {
				if(list[i].getData() != null && list[i].getData().equals(treeElementList.get(0))) {
					if(treeElementList.size() > 1) {//Do no expand the last
						Object[] toexpand = { treeElementList.get(0) };
						viewer.setExpandedElements(toexpand);
					}
					ArrayList<Object> tmpList = new ArrayList<Object>();
					tmpList.addAll(treeElementList);
					tmpList.remove(tmpList.get(0));
					expandItems(tmpList, list[i].getItems());
				}
			}
		}
	}

	public void selectReveal(ISelection selection) {
		if(viewer != null) {
			viewer.setSelection(selection, true);
		}
	}


	/**
	 * look for the path the list of element (comes from the content provider) to go the eObject
	 * 
	 * @param eobject
	 *        that we look for.
	 * @param objects
	 *        a list of elements where eobject can be wrapped.
	 * @return the list of modelElementItem ( from the root to the element that wrap the eobject)
	 */
	protected List<Object> searchPath(EObject eobject, List<Object> objects) {
		List<Object> path = new ArrayList<Object>();

		for(Object o : objects) {
			// Search matches in this level
			if(!(o instanceof Diagram) && o instanceof IAdaptable) {
				if(eobject.equals(((IAdaptable)o).getAdapter(EObject.class))) {
					path.add(o);
					return path;
				}
			}

			// Find childs only for feature container
			for(int i = 0; i < provider.getChildren(o).length; i++) {
				Object treeItem = provider.getChildren(o)[i];

				List<Object> tmppath = new ArrayList<Object>();
				Object element = EMFHelper.getEObject(treeItem);
				if(element != null) {
					if(element instanceof EReference) {
						if(((EReference)element).isContainment() && (!((EReference)element).isDerived())) {
							List<Object> childs = new ArrayList<Object>();
							childs.add(treeItem);
							tmppath = searchPath(eobject, childs);
						}
					}

					else {
						if(element instanceof EObject) {
							List<Object> childs = new ArrayList<Object>();
							childs.add(treeItem);
							tmppath = searchPath(eobject, childs);
						}
					}
				}

				// if tmppath contains the wrapped eobject we have find the good path
				if(tmppath.size() > 0) {
					if(tmppath.get(tmppath.size() - 1) instanceof IAdaptable) {
						if(eobject.equals(((IAdaptable)(tmppath.get(tmppath.size() - 1))).getAdapter(EObject.class))) {
							path.add(o);
							path.addAll(tmppath);
							return path;
						}
					}
				}
			}
		}

		return new ArrayList<Object>();
	}

}
