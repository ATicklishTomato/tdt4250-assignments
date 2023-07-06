/**
 */
package GTFS.impl;

import GTFS.Calender;
import GTFS.GTFSPackage;
import GTFS.Route;
import GTFS.StopTime;
import GTFS.Trip;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFS.impl.TripImpl#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFS.impl.TripImpl#getServiceIDNotCalender <em>Service ID Not Calender</em>}</li>
 *   <li>{@link GTFS.impl.TripImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link GTFS.impl.TripImpl#getService <em>Service</em>}</li>
 *   <li>{@link GTFS.impl.TripImpl#getStopTimesC <em>Stop Times C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripImpl extends MinimalEObjectImpl.Container implements Trip {
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
	 * The default value of the '{@link #getServiceIDNotCalender() <em>Service ID Not Calender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIDNotCalender()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_NOT_CALENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceIDNotCalender() <em>Service ID Not Calender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIDNotCalender()
	 * @generated
	 * @ordered
	 */
	protected String serviceIDNotCalender = SERVICE_ID_NOT_CALENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Calender service;

	/**
	 * The cached value of the '{@link #getStopTimesC() <em>Stop Times C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTimesC()
	 * @generated
	 * @ordered
	 */
	protected EList<StopTime> stopTimesC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSPackage.Literals.TRIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.TRIP__TRIP_ID, oldTripID, tripID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceIDNotCalender() {
		return serviceIDNotCalender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceIDNotCalender(String newServiceIDNotCalender) {
		String oldServiceIDNotCalender = serviceIDNotCalender;
		serviceIDNotCalender = newServiceIDNotCalender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.TRIP__SERVICE_ID_NOT_CALENDER, oldServiceIDNotCalender, serviceIDNotCalender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GTFSPackage.TRIP__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.TRIP__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calender getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Calender)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GTFSPackage.TRIP__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calender basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Calender newService) {
		Calender oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.TRIP__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopTime> getStopTimesC() {
		if (stopTimesC == null) {
			stopTimesC = new EObjectResolvingEList<StopTime>(StopTime.class, this, GTFSPackage.TRIP__STOP_TIMES_C);
		}
		return stopTimesC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSPackage.TRIP__TRIP_ID:
				return getTripID();
			case GTFSPackage.TRIP__SERVICE_ID_NOT_CALENDER:
				return getServiceIDNotCalender();
			case GTFSPackage.TRIP__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case GTFSPackage.TRIP__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case GTFSPackage.TRIP__STOP_TIMES_C:
				return getStopTimesC();
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
			case GTFSPackage.TRIP__TRIP_ID:
				setTripID((String)newValue);
				return;
			case GTFSPackage.TRIP__SERVICE_ID_NOT_CALENDER:
				setServiceIDNotCalender((String)newValue);
				return;
			case GTFSPackage.TRIP__ROUTE:
				setRoute((Route)newValue);
				return;
			case GTFSPackage.TRIP__SERVICE:
				setService((Calender)newValue);
				return;
			case GTFSPackage.TRIP__STOP_TIMES_C:
				getStopTimesC().clear();
				getStopTimesC().addAll((Collection<? extends StopTime>)newValue);
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
			case GTFSPackage.TRIP__TRIP_ID:
				setTripID(TRIP_ID_EDEFAULT);
				return;
			case GTFSPackage.TRIP__SERVICE_ID_NOT_CALENDER:
				setServiceIDNotCalender(SERVICE_ID_NOT_CALENDER_EDEFAULT);
				return;
			case GTFSPackage.TRIP__ROUTE:
				setRoute((Route)null);
				return;
			case GTFSPackage.TRIP__SERVICE:
				setService((Calender)null);
				return;
			case GTFSPackage.TRIP__STOP_TIMES_C:
				getStopTimesC().clear();
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
			case GTFSPackage.TRIP__TRIP_ID:
				return TRIP_ID_EDEFAULT == null ? tripID != null : !TRIP_ID_EDEFAULT.equals(tripID);
			case GTFSPackage.TRIP__SERVICE_ID_NOT_CALENDER:
				return SERVICE_ID_NOT_CALENDER_EDEFAULT == null ? serviceIDNotCalender != null : !SERVICE_ID_NOT_CALENDER_EDEFAULT.equals(serviceIDNotCalender);
			case GTFSPackage.TRIP__ROUTE:
				return route != null;
			case GTFSPackage.TRIP__SERVICE:
				return service != null;
			case GTFSPackage.TRIP__STOP_TIMES_C:
				return stopTimesC != null && !stopTimesC.isEmpty();
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
		result.append(", ServiceIDNotCalender: ");
		result.append(serviceIDNotCalender);
		result.append(')');
		return result.toString();
	}

} //TripImpl
