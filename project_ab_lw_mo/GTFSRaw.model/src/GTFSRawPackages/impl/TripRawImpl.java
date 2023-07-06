/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;
import GTFSRawPackages.TripRaw;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.TripRawImpl#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.TripRawImpl#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.TripRawImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.TripRawImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripRawImpl extends MinimalEObjectImpl.Container implements TripRaw {
	/**
	 * The default value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected String tripID = TRIP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected String serviceID = SERVICE_ID_EDEFAULT;

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
	protected TripRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.TRIP_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTripID() {
		return tripID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripID(String newTripID) {
		String oldTripID = tripID;
		tripID = newTripID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.TRIP_RAW__TRIP_ID, oldTripID, tripID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.TRIP_RAW__ROUTE_ID, oldRouteID, routeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceID() {
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(String newServiceID) {
		String oldServiceID = serviceID;
		serviceID = newServiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.TRIP_RAW__SERVICE_ID, oldServiceID, serviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalColumnRaw> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<OptionalColumnRaw>(OptionalColumnRaw.class, this, GTFSRawPackagesPackage.TRIP_RAW__COLUMNS);
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
			case GTFSRawPackagesPackage.TRIP_RAW__TRIP_ID:
				return getTripID();
			case GTFSRawPackagesPackage.TRIP_RAW__ROUTE_ID:
				return getRouteID();
			case GTFSRawPackagesPackage.TRIP_RAW__SERVICE_ID:
				return getServiceID();
			case GTFSRawPackagesPackage.TRIP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.TRIP_RAW__TRIP_ID:
				setTripID((String)newValue);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__ROUTE_ID:
				setRouteID((String)newValue);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__SERVICE_ID:
				setServiceID((String)newValue);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.TRIP_RAW__TRIP_ID:
				setTripID(TRIP_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__ROUTE_ID:
				setRouteID(ROUTE_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__SERVICE_ID:
				setServiceID(SERVICE_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.TRIP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.TRIP_RAW__TRIP_ID:
				return TRIP_ID_EDEFAULT == null ? tripID != null : !TRIP_ID_EDEFAULT.equals(tripID);
			case GTFSRawPackagesPackage.TRIP_RAW__ROUTE_ID:
				return ROUTE_ID_EDEFAULT == null ? routeID != null : !ROUTE_ID_EDEFAULT.equals(routeID);
			case GTFSRawPackagesPackage.TRIP_RAW__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
			case GTFSRawPackagesPackage.TRIP_RAW__COLUMNS:
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
		result.append(" (TripID: ");
		result.append(tripID);
		result.append(", RouteID: ");
		result.append(routeID);
		result.append(", ServiceID: ");
		result.append(serviceID);
		result.append(')');
		return result.toString();
	}

} //TripRawImpl
