/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppliedStereotypePropertyFactoryImpl extends EFactoryImpl implements AppliedStereotypePropertyFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AppliedStereotypePropertyFactory init()
  {
    try
    {
      AppliedStereotypePropertyFactory theAppliedStereotypePropertyFactory = (AppliedStereotypePropertyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/papyrus/uml/textedit/property/xtext/StereotypeProperty"); 
      if (theAppliedStereotypePropertyFactory != null)
      {
        return theAppliedStereotypePropertyFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AppliedStereotypePropertyFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedStereotypePropertyFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AppliedStereotypePropertyPackage.APPLIED_STEREOTYPE_PROPERTY_RULE: return createAppliedStereotypePropertyRule();
      case AppliedStereotypePropertyPackage.EXPRESSION_VALUE_RULE: return createExpressionValueRule();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedStereotypePropertyRule createAppliedStereotypePropertyRule()
  {
    AppliedStereotypePropertyRuleImpl appliedStereotypePropertyRule = new AppliedStereotypePropertyRuleImpl();
    return appliedStereotypePropertyRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionValueRule createExpressionValueRule()
  {
    ExpressionValueRuleImpl expressionValueRule = new ExpressionValueRuleImpl();
    return expressionValueRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedStereotypePropertyPackage getAppliedStereotypePropertyPackage()
  {
    return (AppliedStereotypePropertyPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AppliedStereotypePropertyPackage getPackage()
  {
    return AppliedStereotypePropertyPackage.eINSTANCE;
  }

} //AppliedStereotypePropertyFactoryImpl
