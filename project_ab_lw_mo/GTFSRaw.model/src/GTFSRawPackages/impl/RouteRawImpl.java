/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;
import GTFSRawPackages.RouteRaw;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.RouteRawImpl#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.RouteRawImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.RouteRawImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.RouteRawImpl#getRouteType <em>Route Type</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.RouteRawImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteRawImpl extends MinimalEObjectImpl.Container implements RouteRaw {
	/**
	 * The default value of the '{@link #getRouteID() <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteID() <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteID()
	 * @generated
	 * @ordered
	 */
	protected String routeID = ROUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouteType() <em>Route Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteType()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTE_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRouteType() <em>Route Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteType()
	 * @generated
	 * @ordered
	 */
	protected int routeType = ROUTE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionalColumnRaw> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.ROUTE_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouteID() {
		return routeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteID(String newRouteID) {
		String oldRouteID = routeID;
		routeID = newRouteID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_ID, oldRouteID, routeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.ROUTE_RAW__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.ROUTE_RAW__LONG_NAME, oldLongName, longName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRouteType() {
		return routeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteType(int newRouteType) {
		int oldRouteType = routeType;
		routeType = newRouteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_TYPE, oldRouteType, routeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalColumnRaw> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<OptionalColumnRaw>(OptionalColumnRaw.class, this, GTFSRawPackagesPackage.ROUTE_RAW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_ID:
				return getRouteID();
			case GTFSRawPackagesPackage.ROUTE_RAW__SHORT_NAME:
				return getShortName();
			case GTFSRawPackagesPackage.ROUTE_RAW__LONG_NAME:
				return getLongName();
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_TYPE:
				return getRouteType();
			case GTFSRawPackagesPackage.ROUTE_RAW__COLUMNS:
				return getColumns();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_ID:
				setRouteID((String)newValue);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__LONG_NAME:
				setLongName((String)newValue);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_TYPE:
				setRouteType((Integer)newValue);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends OptionalColumnRaw>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_ID:
				setRouteID(ROUTE_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_TYPE:
				setRouteType(ROUTE_TYPE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.ROUTE_RAW__COLUMNS:
				getColumns().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeID != null : !ROUTE_ID_EDEFAULT.equals(routeID);
			case GTFSRawPackagesPackage.ROUTE_RAW__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case GTFSRawPackagesPackage.ROUTE_RAW__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
			case GTFSRawPackagesPackage.ROUTE_RAW__ROUTE_TYPE:
				return routeType != ROUTE_TYPE_EDEFAULT;
			case GTFSRawPackagesPackage.ROUTE_RAW__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RouteID: ");
		result.append(routeID);
		result.append(", ShortName: ");
		result.append(shortName);
		result.append(", LongName: ");
		result.append(longName);
		result.append(", RouteType: ");
		result.append(routeType);
		result.append(')');
		return result.toString();
	}

} //RouteRawImpl
