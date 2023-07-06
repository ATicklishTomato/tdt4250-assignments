/**
 */
package GTFS.impl;

import GTFS.Agency;
import GTFS.Calender;
import GTFS.Collection;
import GTFS.GTFSFactory;
import GTFS.GTFSPackage;
import GTFS.GTFSRouteType;
import GTFS.Route;
import GTFS.Stop;
import GTFS.StopTime;
import GTFS.Trip;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.RouteRaw;
import GTFSRawPackages.AgencyRaw;
import GTFSRawPackages.CalenderRaw;
import GTFSRawPackages.StopRaw;
import GTFSRawPackages.StopTimeRaw;
import GTFSRawPackages.TripRaw;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFS.impl.CollectionImpl#getAgency <em>Agency</em>}</li>
 *   <li>{@link GTFS.impl.CollectionImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link GTFS.impl.CollectionImpl#getTrips <em>Trips</em>}</li>
 *   <li>{@link GTFS.impl.CollectionImpl#getStopTimes <em>Stop Times</em>}</li>
 *   <li>{@link GTFS.impl.CollectionImpl#getStops <em>Stops</em>}</li>
 *   <li>{@link GTFS.impl.CollectionImpl#getCalender <em>Calender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends MinimalEObjectImpl.Container implements Collection {
	/**
	 * The cached value of the '{@link #getAgency() <em>Agency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgency()
	 * @generated
	 * @ordered
	 */
	protected EList<Agency> agency;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trips;

	/**
	 * The cached value of the '{@link #getStopTimes() <em>Stop Times</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<StopTime> stopTimes;

	/**
	 * The cached value of the '{@link #getStops() <em>Stops</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStops()
	 * @generated
	 * @ordered
	 */
	protected EList<Stop> stops;

	/**
	 * The cached value of the '{@link #getCalender() <em>Calender</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalender()
	 * @generated
	 * @ordered
	 */
	protected EList<Calender> calender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSPackage.Literals.COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agency> getAgency() {
		if (agency == null) {
			agency = new EObjectResolvingEList<Agency>(Agency.class, this, GTFSPackage.COLLECTION__AGENCY);
		}
		return agency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectResolvingEList<Route>(Route.class, this, GTFSPackage.COLLECTION__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectResolvingEList<Trip>(Trip.class, this, GTFSPackage.COLLECTION__TRIPS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopTime> getStopTimes() {
		if (stopTimes == null) {
			stopTimes = new EObjectResolvingEList<StopTime>(StopTime.class, this, GTFSPackage.COLLECTION__STOP_TIMES);
		}
		return stopTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stop> getStops() {
		if (stops == null) {
			stops = new EObjectResolvingEList<Stop>(Stop.class, this, GTFSPackage.COLLECTION__STOPS);
		}
		return stops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calender> getCalender() {
		if (calender == null) {
			calender = new EObjectResolvingEList<Calender>(Calender.class, this, GTFSPackage.COLLECTION__CALENDER);
		}
		return calender;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws Exception 
	 * @generated NOT
	 */
	public void importRaw(EObject RawCollectionInputObject, boolean ignoreIrregularCalenderElements) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		CollectionRaw raw = (CollectionRaw) RawCollectionInputObject;		

		for(AgencyRaw agRaw : raw.getAgency())
		{
			Agency agency = GTFSFactory.eINSTANCE.createAgency();
			agency.setName(agRaw.getName());
			agency.setTimezone(agRaw.getTimezone());
			agency.setURL(agRaw.getTimezone());
			getAgency().add(agency);
		}
		
		
		Map<String, Route> idToRoutes = new HashMap<String, Route>();
		for(RouteRaw routRaw :raw.getRoutes())
		{
			Route route = GTFSFactory.eINSTANCE.createRoute();
			route.setLongName(routRaw.getLongName());
			route.setRouteID(routRaw.getRouteID());
			route.setRouteType(GTFSRouteType.get(routRaw.getRouteType()));
			route.setShortName(routRaw.getShortName());
			
			idToRoutes.put(routRaw.getRouteID(), route);
			getRoutes().add(route);
		}
		
		Map<String, Stop> idToStops = new HashMap<String, Stop>();
		for(StopRaw stopRaw :raw.getStops())
		{
			Stop stop = GTFSFactory.eINSTANCE.createStop();
			stop.setLatitude(stopRaw.getLatitude());
			stop.setLongitude(stopRaw.getLongitude());
			stop.setName(stopRaw.getName());
			stop.setStopID(stopRaw.getStopID());

			
			idToStops.put(stopRaw.getStopID(), stop);
			getStops().add(stop);
		}
		
		Map<String, Calender> idToCalender = new HashMap<String, Calender>();
		for(CalenderRaw calRaw :raw.getCalender())
		{
			Calender cal = GTFSFactory.eINSTANCE.createCalender();
			cal.setServiceID(calRaw.getServiceID());
			cal.setStartDate(calRaw.getStartDate());
			cal.setStopDate(calRaw.getStopDate());
			cal.setMonday(calRaw.isMonday());
			cal.setTuesday(calRaw.isTuesday());
			cal.setWednesday(calRaw.isWednesday());
			cal.setThursday(calRaw.isThursday());
			cal.setFriday(calRaw.isFriday());
			cal.setSaturday(calRaw.isSaturday());
			cal.setSunday(calRaw.isSunday());
			
			idToCalender.put(calRaw.getServiceID(), cal);
			getCalender().add(cal);
		}
		
		Map<String, Trip> idToTrips = new HashMap<String, Trip>();
		for(TripRaw tripRaw :raw.getTrips())
		{
			Trip trip = GTFSFactory.eINSTANCE.createTrip();
			trip.setTripID(tripRaw.getTripID());
			Route route = idToRoutes.get(tripRaw.getRouteID());
			if(route == null)
			{
				throw new Exception("Database error - route not found");
			}
			trip.setRoute(route);
			route.getTripsC().add(trip);
			
			Calender cal = idToCalender.get(tripRaw.getServiceID());
			if(cal == null)
			{
				if(ignoreIrregularCalenderElements)
				{
					continue;
				}
				throw new Exception("Database error - calender regular not found; calender_dates file not implemented");
			}
			trip.setService(cal);
			
			idToTrips.put(trip.getTripID(), trip);
			getTrips().add(trip);
		}
		
		for(StopTimeRaw stopTRaw: raw.getStopTimes())
		{
			StopTime stopT = GTFSFactory.eINSTANCE.createStopTime();
			stopT.setArrivalTime(stopTRaw.getArrivalTime());
			stopT.setDepatureTime(stopTRaw.getDepatureTime());
			stopT.setStopSequence(stopTRaw.getStopSequence());
			
			Stop stop = idToStops.get(stopTRaw.getStopID());
			if(stop == null)
			{
				throw new Exception("Database error - stop not found");
			}
			stopT.setStop(stop);
			stop.getStopTimesC().add(stopT);
			
			Trip trip = idToTrips.get(stopTRaw.getTripID());
			if(trip == null)
			{
				if(ignoreIrregularCalenderElements)
				{
					continue;
				}
				throw new Exception("Database error - stop not found");
			}
			stopT.setTrip(trip);
			trip.getStopTimesC().add(stopT);
			getStopTimes().add(stopT);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSPackage.COLLECTION__AGENCY:
				return getAgency();
			case GTFSPackage.COLLECTION__ROUTES:
				return getRoutes();
			case GTFSPackage.COLLECTION__TRIPS:
				return getTrips();
			case GTFSPackage.COLLECTION__STOP_TIMES:
				return getStopTimes();
			case GTFSPackage.COLLECTION__STOPS:
				return getStops();
			case GTFSPackage.COLLECTION__CALENDER:
				return getCalender();
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
			case GTFSPackage.COLLECTION__AGENCY:
				getAgency().clear();
				getAgency().addAll((java.util.Collection<? extends Agency>)newValue);
				return;
			case GTFSPackage.COLLECTION__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((java.util.Collection<? extends Route>)newValue);
				return;
			case GTFSPackage.COLLECTION__TRIPS:
				getTrips().clear();
				getTrips().addAll((java.util.Collection<? extends Trip>)newValue);
				return;
			case GTFSPackage.COLLECTION__STOP_TIMES:
				getStopTimes().clear();
				getStopTimes().addAll((java.util.Collection<? extends StopTime>)newValue);
				return;
			case GTFSPackage.COLLECTION__STOPS:
				getStops().clear();
				getStops().addAll((java.util.Collection<? extends Stop>)newValue);
				return;
			case GTFSPackage.COLLECTION__CALENDER:
				getCalender().clear();
				getCalender().addAll((java.util.Collection<? extends Calender>)newValue);
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
			case GTFSPackage.COLLECTION__AGENCY:
				getAgency().clear();
				return;
			case GTFSPackage.COLLECTION__ROUTES:
				getRoutes().clear();
				return;
			case GTFSPackage.COLLECTION__TRIPS:
				getTrips().clear();
				return;
			case GTFSPackage.COLLECTION__STOP_TIMES:
				getStopTimes().clear();
				return;
			case GTFSPackage.COLLECTION__STOPS:
				getStops().clear();
				return;
			case GTFSPackage.COLLECTION__CALENDER:
				getCalender().clear();
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
			case GTFSPackage.COLLECTION__AGENCY:
				return agency != null && !agency.isEmpty();
			case GTFSPackage.COLLECTION__ROUTES:
				return routes != null && !routes.isEmpty();
			case GTFSPackage.COLLECTION__TRIPS:
				return trips != null && !trips.isEmpty();
			case GTFSPackage.COLLECTION__STOP_TIMES:
				return stopTimes != null && !stopTimes.isEmpty();
			case GTFSPackage.COLLECTION__STOPS:
				return stops != null && !stops.isEmpty();
			case GTFSPackage.COLLECTION__CALENDER:
				return calender != null && !calender.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GTFSPackage.COLLECTION___IMPORT_RAW__EOBJECT_BOOLEAN:
			try {
				importRaw((EObject)arguments.get(0), (Boolean)arguments.get(1));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CollectionImpl
