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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.uml.alf.alf.AlfPackage;

import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.AppliedStereotypePropertyFactory;
import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.AppliedStereotypePropertyPackage;
import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.AppliedStereotypePropertyRule;
import org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.ExpressionValueRule;

import org.eclipse.uml2.uml.UMLPackage;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppliedStereotypePropertyPackageImpl extends EPackageImpl implements AppliedStereotypePropertyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass appliedStereotypePropertyRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionValueRuleEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.appliedStereotypeProperty.AppliedStereotypePropertyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AppliedStereotypePropertyPackageImpl()
  {
    super(eNS_URI, AppliedStereotypePropertyFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AppliedStereotypePropertyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AppliedStereotypePropertyPackage init()
  {
    if (isInited) return (AppliedStereotypePropertyPackage)EPackage.Registry.INSTANCE.getEPackage(AppliedStereotypePropertyPackage.eNS_URI);

    // Obtain or create and register package
    AppliedStereotypePropertyPackageImpl theAppliedStereotypePropertyPackage = (AppliedStereotypePropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppliedStereotypePropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppliedStereotypePropertyPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AlfPackage.eINSTANCE.eClass();
    UMLPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

    // Create package meta-data objects
    theAppliedStereotypePropertyPackage.createPackageContents();
    theTypesPackage.createPackageContents();

    // Initialize created meta-data
    theAppliedStereotypePropertyPackage.initializePackageContents();
    theTypesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAppliedStereotypePropertyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AppliedStereotypePropertyPackage.eNS_URI, theAppliedStereotypePropertyPackage);
    return theAppliedStereotypePropertyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAppliedStereotypePropertyRule()
  {
    return appliedStereotypePropertyRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedStereotypePropertyRule_Property()
  {
    return (EReference)appliedStereotypePropertyRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAppliedStereotypePropertyRule_Value()
  {
    return (EReference)appliedStereotypePropertyRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionValueRule()
  {
    return expressionValueRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionValueRule_Expression()
  {
    return (EReference)expressionValueRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppliedStereotypePropertyFactory getAppliedStereotypePropertyFactory()
  {
    return (AppliedStereotypePropertyFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    appliedStereotypePropertyRuleEClass = createEClass(APPLIED_STEREOTYPE_PROPERTY_RULE);
    createEReference(appliedStereotypePropertyRuleEClass, APPLIED_STEREOTYPE_PROPERTY_RULE__PROPERTY);
    createEReference(appliedStereotypePropertyRuleEClass, APPLIED_STEREOTYPE_PROPERTY_RULE__VALUE);

    expressionValueRuleEClass = createEClass(EXPRESSION_VALUE_RULE);
    createEReference(expressionValueRuleEClass, EXPRESSION_VALUE_RULE__EXPRESSION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
    AlfPackage theAlfPackage = (AlfPackage)EPackage.Registry.INSTANCE.getEPackage(AlfPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(appliedStereotypePropertyRuleEClass, AppliedStereotypePropertyRule.class, "AppliedStereotypePropertyRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAppliedStereotypePropertyRule_Property(), theUMLPackage.getProperty(), null, "property", null, 0, 1, AppliedStereotypePropertyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAppliedStereotypePropertyRule_Value(), this.getExpressionValueRule(), null, "value", null, 0, 1, AppliedStereotypePropertyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionValueRuleEClass, ExpressionValueRule.class, "ExpressionValueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionValueRule_Expression(), theAlfPackage.getSequenceElement(), null, "expression", null, 0, 1, ExpressionValueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AppliedStereotypePropertyPackageImpl
