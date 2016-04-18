/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Query;
import org.xtext.example.mydsl.myDsl.Report;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getQueries <em>Queries</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueries()
   * @generated
   * @ordered
   */
  protected EList<Query> queries;

  /**
   * The cached value of the '{@link #getReports() <em>Reports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReports()
   * @generated
   * @ordered
   */
  protected EList<Report> reports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Query> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<Query>(Query.class, this, MyDslPackage.MODEL__QUERIES);
    }
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Report> getReports()
  {
    if (reports == null)
    {
      reports = new EObjectContainmentEList<Report>(Report.class, this, MyDslPackage.MODEL__REPORTS);
    }
    return reports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__QUERIES:
        return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MODEL__REPORTS:
        return ((InternalEList<?>)getReports()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__QUERIES:
        return getQueries();
      case MyDslPackage.MODEL__REPORTS:
        return getReports();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends Query>)newValue);
        return;
      case MyDslPackage.MODEL__REPORTS:
        getReports().clear();
        getReports().addAll((Collection<? extends Report>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__QUERIES:
        getQueries().clear();
        return;
      case MyDslPackage.MODEL__REPORTS:
        getReports().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MODEL__QUERIES:
        return queries != null && !queries.isEmpty();
      case MyDslPackage.MODEL__REPORTS:
        return reports != null && !reports.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
