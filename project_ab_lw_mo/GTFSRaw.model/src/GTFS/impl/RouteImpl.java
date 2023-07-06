/**
 */
package GTFS.impl;

import GTFS.GTFSPackage;
import GTFS.GTFSRouteType;
import GTFS.Route;
import GTFS.Trip;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFS.impl.RouteImpl#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFS.impl.RouteImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link GTFS.impl.RouteImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link GTFS.impl.RouteImpl#getRouteType <em>Route Type</em>}</li>
 *   <li>{@link GTFS.impl.RouteImpl#getTripsC <em>Trips C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
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
	protected static final GTFSRouteType ROUTE_TYPE_EDEFAULT = GTFSRouteType.TRAM;

	/**
	 * The cached value of the '{@link #getRouteType() <em>Route Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteType()
	 * @generated
	 * @ordered
	 */
	protected GTFSRouteType routeType = ROUTE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTripsC() <em>Trips C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripsC()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> tripsC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSPackage.Literals.ROUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.ROUTE__ROUTE_ID, oldRouteID, routeID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.ROUTE__SHORT_NAME, oldShortName, shortName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.ROUTE__LONG_NAME, oldLongName, longName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRouteType getRouteType() {
		return routeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteType(GTFSRouteType newRouteType) {
		GTFSRouteType oldRouteType = routeType;
		routeType = newRouteType == null ? ROUTE_TYPE_EDEFAULT : newRouteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.ROUTE__ROUTE_TYPE, oldRouteType, routeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTripsC() {
		if (tripsC == null) {
			tripsC = new EObjectResolvingEList<Trip>(Trip.class, this, GTFSPackage.ROUTE__TRIPS_C);
		}
		return tripsC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSPackage.ROUTE__ROUTE_ID:
				return getRouteID();
			case GTFSPackage.ROUTE__SHORT_NAME:
				return getShortName();
			case GTFSPackage.ROUTE__LONG_NAME:
				return getLongName();
			case GTFSPackage.ROUTE__ROUTE_TYPE:
				return getRouteType();
			case GTFSPackage.ROUTE__TRIPS_C:
				return getTripsC();
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
			case GTFSPackage.ROUTE__ROUTE_ID:
				setRouteID((String)newValue);
				return;
			case GTFSPackage.ROUTE__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case GTFSPackage.ROUTE__LONG_NAME:
				setLongName((String)newValue);
				return;
			case GTFSPackage.ROUTE__ROUTE_TYPE:
				setRouteType((GTFSRouteType)newValue);
				return;
			case GTFSPackage.ROUTE__TRIPS_C:
				getTripsC().clear();
				getTripsC().addAll((Collection<? extends Trip>)newValue);
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
			case GTFSPackage.ROUTE__ROUTE_ID:
				setRouteID(ROUTE_ID_EDEFAULT);
				return;
			case GTFSPackage.ROUTE__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case GTFSPackage.ROUTE__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case GTFSPackage.ROUTE__ROUTE_TYPE:
				setRouteType(ROUTE_TYPE_EDEFAULT);
				return;
			case GTFSPackage.ROUTE__TRIPS_C:
				getTripsC().clear();
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
			case GTFSPackage.ROUTE__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeID != null : !ROUTE_ID_EDEFAULT.equals(routeID);
			case GTFSPackage.ROUTE__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case GTFSPackage.ROUTE__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
			case GTFSPackage.ROUTE__ROUTE_TYPE:
				return routeType != ROUTE_TYPE_EDEFAULT;
			case GTFSPackage.ROUTE__TRIPS_C:
				return tripsC != null && !tripsC.isEmpty();
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

} //RouteImpl
