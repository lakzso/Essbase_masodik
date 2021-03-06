/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Report#getRepout <em>Repout</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Report#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject
{
  /**
   * Returns the value of the '<em><b>Repout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repout</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repout</em>' reference.
   * @see #setRepout(Query)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReport_Repout()
   * @model
   * @generated
   */
  Query getRepout();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Report#getRepout <em>Repout</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repout</em>' reference.
   * @see #getRepout()
   * @generated
   */
  void setRepout(Query value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(database)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReport_From()
   * @model containment="true"
   * @generated
   */
  database getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Report#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(database value);

} // Report
