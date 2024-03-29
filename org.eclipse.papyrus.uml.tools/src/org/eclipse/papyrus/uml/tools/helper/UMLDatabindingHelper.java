package org.eclipse.papyrus.uml.tools.helper;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.papyrus.uml.tools.databinding.PapyrusObservableValue;


public class UMLDatabindingHelper {

	/**
	 * Returns an IObservableValue for the given feature and EObject
	 * 
	 * If the EditingDomain is set, the IObservableValue will use the Papyrus ServiceEdit ;
	 * otherwise, a standard EMFObservableValue will be used
	 * 
	 * @param source
	 *        The EObject to observe
	 * @param feature
	 *        The feature to observe
	 * @param domain
	 *        The editing domain on which the commands will be executed. If null, direct
	 *        object modifications will be used.
	 * @return
	 *         The IObservableValue
	 */
	public static IObservableValue getObservableValue(EObject source, EStructuralFeature feature, EditingDomain domain) {
		return domain == null ? EMFProperties.value(feature).observe(source) : new PapyrusObservableValue(source, feature, domain);
	}
}
