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
 *****************************************************************************/
package org.eclipse.papyrus.uml.importt.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.uml.extensionpoints.library.FilteredRegisteredLibrariesSelectionDialog;
import org.eclipse.papyrus.uml.extensionpoints.library.RegisteredLibrary;
import org.eclipse.papyrus.uml.extensionpoints.utils.Util;
import org.eclipse.papyrus.uml.profile.ui.dialogs.PackageImportTreeSelectionDialog;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.papyrus.views.modelexplorer.handler.AbstractCommandHandler;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.UMLFactory;


public class ImportRegisteredPackageHandler extends AbstractCommandHandler {

	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	protected Command getCommand() {
		return new ImportLibraryFromRepositoryCommand(getEditingDomain());
	}

	/**
	 * Apply the result of the dialog, i.e. it adds package imports to libraries
	 * 
	 * @param librariesToImport
	 *        the array of Libraries to import
	 */
	protected void importLibraries(RegisteredLibrary[] librariesToImport) {
		// retrieve the current resource set
		ResourceSet resourceSet = Util.getResourceSet(getSelectedElement());

		for(int i = 0; i < librariesToImport.length; i++) {
			RegisteredLibrary currentLibrary = (librariesToImport[i]);
			URI modelUri = currentLibrary.uri;

			Resource modelResource = resourceSet.getResource(modelUri, true);
			PackageImportTreeSelectionDialog eisd = new PackageImportTreeSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), ((Package)modelResource.getContents().get(0)));
			int ret = eisd.open();

			if(ret == Window.OK) {
				ArrayList<?> result = eisd.getResult();
				Iterator<?> resultIter = result.iterator();
				while(resultIter.hasNext()) {
					Element element = (Element)resultIter.next();
					PackageImport ei = UMLFactory.eINSTANCE.createPackageImport();
					ei.setImportedPackage((Package)element);
					((Package)getSelectedElement()).getPackageImports().add(ei);
				}
			}
		}
	}

	/**
	 * Returns the array of available libraries for the currently selected package.
	 * <p>
	 * It returns all registered libraries except the already imported ones.
	 * </p>
	 * 
	 * @return the array of available libraries for the currently selected package
	 */
	protected RegisteredLibrary[] getAvailableLibraries() {
		List<RegisteredLibrary> libraries = new ArrayList<RegisteredLibrary>();
		RegisteredLibrary[] allLibraries = RegisteredLibrary.getRegisteredLibraries();
		for(int i = 0; i < allLibraries.length; i++) {
			RegisteredLibrary registeredLibrary = allLibraries[i];
			List<String> importedPackageNames = PackageUtil.getImportedPackagesNames((Package)getSelectedElement());
			if(!(importedPackageNames.contains(registeredLibrary.getName()))) {
				libraries.add(registeredLibrary);
			}
		}
		return libraries.toArray(new RegisteredLibrary[libraries.size()]);
	}

	/**
	 * Returns the array of already selected libraries for the currently selected package.
	 * <p>
	 * It returns all already imported libraries.
	 * </p>
	 * 
	 * @return the array of already selected libraries for the currently selected package
	 */
	protected Collection<RegisteredLibrary> getImportedLibraries() {
		List<RegisteredLibrary> libraries = new ArrayList<RegisteredLibrary>();
		RegisteredLibrary[] allLibraries = RegisteredLibrary.getRegisteredLibraries();
		for(int i = 0; i < allLibraries.length; i++) {
			RegisteredLibrary registeredLibrary = allLibraries[i];
			List<String> importedPackageNames = PackageUtil.getImportedPackagesNames((Package)getSelectedElement());
			// problem: name of library might be different from name of top-level package
			if(importedPackageNames.contains(registeredLibrary.getName())) {
				libraries.add(registeredLibrary);
			}
		}
		return libraries;
	}

	/**
	 * Specific {@link ChangeCommand} that imports libraries from repository
	 */
	public class ImportLibraryFromRepositoryCommand extends ChangeCommand {

		/**
		 * Creates a new ImportLibraryFromRepositoryCommand
		 * 
		 * @param editingDomain
		 *        editing domain that manages the changed objects
		 * @param runnable
		 *        process that executes the modifications
		 * @param label
		 *        the label of the command
		 * @param description
		 *        description of the command
		 */
		public ImportLibraryFromRepositoryCommand(EditingDomain editingDomain) {
			super(editingDomain, new Runnable() {

				public void run() {
					// Retrieve shell instance
					Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

					// get the set of registered libraries available
					RegisteredLibrary[] allLibraries = RegisteredLibrary.getRegisteredLibraries();

					// Open Registered ModelLibrary selection dialog
					FilteredRegisteredLibrariesSelectionDialog dialog = new FilteredRegisteredLibrariesSelectionDialog(shell, true, allLibraries, getImportedLibraries());
					dialog.open();
					if(Dialog.OK == dialog.getReturnCode()) {
						// get the result, which is the set of libraries to import
						List<Object> librariesToImport = Arrays.asList(dialog.getResult());
						importLibraries(librariesToImport.toArray(new RegisteredLibrary[librariesToImport.size()]));
					}
				}
			}, "Import Libraries", "Import Libraries from Repository"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		/**
		 * 
		 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
		 * 
		 * @return
		 */
		@Override
		public boolean canExecute() {
			if(getSelectedElements().size() == 1) {
				return (getSelectedElement() instanceof Package);
			}
			return false;
		}
	}
}
