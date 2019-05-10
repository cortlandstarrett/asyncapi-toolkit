/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ReferenceImpl#getRefname <em>Refname</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ReferenceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends AbstractMessageImpl implements Reference
{
  /**
	 * The default value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
  protected static final String REFNAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
  protected String refname = REFNAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
  protected static final String URI_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
  protected String uri = URI_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ReferenceImpl()
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
		return AsyncApiPackage.Literals.REFERENCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getRefname()
  {
		return refname;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setRefname(String newRefname)
  {
		String oldRefname = refname;
		refname = newRefname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.REFERENCE__REFNAME, oldRefname, refname));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getUri()
  {
		return uri;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setUri(String newUri)
  {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.REFERENCE__URI, oldUri, uri));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case AsyncApiPackage.REFERENCE__REFNAME:
				return getRefname();
			case AsyncApiPackage.REFERENCE__URI:
				return getUri();
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
		switch (featureID) {
			case AsyncApiPackage.REFERENCE__REFNAME:
				setRefname((String)newValue);
				return;
			case AsyncApiPackage.REFERENCE__URI:
				setUri((String)newValue);
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
		switch (featureID) {
			case AsyncApiPackage.REFERENCE__REFNAME:
				setRefname(REFNAME_EDEFAULT);
				return;
			case AsyncApiPackage.REFERENCE__URI:
				setUri(URI_EDEFAULT);
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
		switch (featureID) {
			case AsyncApiPackage.REFERENCE__REFNAME:
				return REFNAME_EDEFAULT == null ? refname != null : !REFNAME_EDEFAULT.equals(refname);
			case AsyncApiPackage.REFERENCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (refname: ");
		result.append(refname);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
