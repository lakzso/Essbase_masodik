/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MDXCOlumns;
import org.xtext.example.mydsl.myDsl.MDXFunction;
import org.xtext.example.mydsl.myDsl.MDXRows;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.QueryMDX;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query MDX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.QueryMDXImpl#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.QueryMDXImpl#getFr <em>Fr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.QueryMDXImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.QueryMDXImpl#getFc <em>Fc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryMDXImpl extends QueryImpl implements QueryMDX
{
  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected MDXRows r;

  /**
   * The cached value of the '{@link #getFr() <em>Fr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFr()
   * @generated
   * @ordered
   */
  protected MDXFunction fr;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected MDXCOlumns c;

  /**
   * The cached value of the '{@link #getFc() <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc()
   * @generated
   * @ordered
   */
  protected MDXFunction fc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryMDXImpl()
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
    return MyDslPackage.Literals.QUERY_MDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDXRows getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(MDXRows newR, NotificationChain msgs)
  {
    MDXRows oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__R, oldR, newR);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(MDXRows newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__R, newR, newR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDXFunction getFr()
  {
    return fr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFr(MDXFunction newFr, NotificationChain msgs)
  {
    MDXFunction oldFr = fr;
    fr = newFr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__FR, oldFr, newFr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFr(MDXFunction newFr)
  {
    if (newFr != fr)
    {
      NotificationChain msgs = null;
      if (fr != null)
        msgs = ((InternalEObject)fr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__FR, null, msgs);
      if (newFr != null)
        msgs = ((InternalEObject)newFr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__FR, null, msgs);
      msgs = basicSetFr(newFr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__FR, newFr, newFr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDXCOlumns getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(MDXCOlumns newC, NotificationChain msgs)
  {
    MDXCOlumns oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(MDXCOlumns newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MDXFunction getFc()
  {
    return fc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc(MDXFunction newFc, NotificationChain msgs)
  {
    MDXFunction oldFc = fc;
    fc = newFc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__FC, oldFc, newFc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc(MDXFunction newFc)
  {
    if (newFc != fc)
    {
      NotificationChain msgs = null;
      if (fc != null)
        msgs = ((InternalEObject)fc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__FC, null, msgs);
      if (newFc != null)
        msgs = ((InternalEObject)newFc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.QUERY_MDX__FC, null, msgs);
      msgs = basicSetFc(newFc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.QUERY_MDX__FC, newFc, newFc));
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
      case MyDslPackage.QUERY_MDX__R:
        return basicSetR(null, msgs);
      case MyDslPackage.QUERY_MDX__FR:
        return basicSetFr(null, msgs);
      case MyDslPackage.QUERY_MDX__C:
        return basicSetC(null, msgs);
      case MyDslPackage.QUERY_MDX__FC:
        return basicSetFc(null, msgs);
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
      case MyDslPackage.QUERY_MDX__R:
        return getR();
      case MyDslPackage.QUERY_MDX__FR:
        return getFr();
      case MyDslPackage.QUERY_MDX__C:
        return getC();
      case MyDslPackage.QUERY_MDX__FC:
        return getFc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.QUERY_MDX__R:
        setR((MDXRows)newValue);
        return;
      case MyDslPackage.QUERY_MDX__FR:
        setFr((MDXFunction)newValue);
        return;
      case MyDslPackage.QUERY_MDX__C:
        setC((MDXCOlumns)newValue);
        return;
      case MyDslPackage.QUERY_MDX__FC:
        setFc((MDXFunction)newValue);
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
      case MyDslPackage.QUERY_MDX__R:
        setR((MDXRows)null);
        return;
      case MyDslPackage.QUERY_MDX__FR:
        setFr((MDXFunction)null);
        return;
      case MyDslPackage.QUERY_MDX__C:
        setC((MDXCOlumns)null);
        return;
      case MyDslPackage.QUERY_MDX__FC:
        setFc((MDXFunction)null);
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
      case MyDslPackage.QUERY_MDX__R:
        return r != null;
      case MyDslPackage.QUERY_MDX__FR:
        return fr != null;
      case MyDslPackage.QUERY_MDX__C:
        return c != null;
      case MyDslPackage.QUERY_MDX__FC:
        return fc != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryMDXImpl
