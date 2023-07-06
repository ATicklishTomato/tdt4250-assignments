/**
 */
package GTFS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GTFS.GTFSFactory
 * @model kind="package"
 * @generated
 */
public interface GTFSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GTFS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform://plugin/no.ntnu.tdt4350.TransportWizard/model/GTFS.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GTFS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GTFSPackage eINSTANCE = GTFS.impl.GTFSPackageImpl.init();

	/**
	 * The meta object id for the '{@link GTFS.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.CollectionImpl
	 * @see GTFS.impl.GTFSPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Agency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__AGENCY = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ROUTES = 1;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__TRIPS = 2;

	/**
	 * The feature id for the '<em><b>Stop Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__STOP_TIMES = 3;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__STOPS = 4;

	/**
	 * The feature id for the '<em><b>Calender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CALENDER = 5;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Import Raw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION___IMPORT_RAW__EOBJECT_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link GTFS.impl.AgencyImpl <em>Agency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.AgencyImpl
	 * @see GTFS.impl.GTFSPackageImpl#getAgency()
	 * @generated
	 */
	int AGENCY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY__URL = 1;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY__TIMEZONE = 2;

	/**
	 * The number of structural features of the '<em>Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Agency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFS.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.RouteImpl
	 * @see GTFS.impl.GTFSPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ROUTE_ID = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__LONG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Route Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ROUTE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Trips C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__TRIPS_C = 4;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFS.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.TripImpl
	 * @see GTFS.impl.GTFSPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 3;

	/**
	 * The feature id for the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__TRIP_ID = 0;

	/**
	 * The feature id for the '<em><b>Service ID Not Calender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__SERVICE_ID_NOT_CALENDER = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Stop Times C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__STOP_TIMES_C = 4;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFS.impl.StopTimeImpl <em>Stop Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.StopTimeImpl
	 * @see GTFS.impl.GTFSPackageImpl#getStopTime()
	 * @generated
	 */
	int STOP_TIME = 4;

	/**
	 * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME__ARRIVAL_TIME = 0;

	/**
	 * The feature id for the '<em><b>Depature Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME__DEPATURE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME__STOP_SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME__STOP = 3;

	/**
	 * The feature id for the '<em><b>Trip</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME__TRIP = 4;

	/**
	 * The number of structural features of the '<em>Stop Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stop Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFS.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.StopImpl
	 * @see GTFS.impl.GTFSPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 5;

	/**
	 * The feature id for the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LATITUDE = 3;

	/**
	 * The feature id for the '<em><b>Stop Times C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STOP_TIMES_C = 4;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFS.impl.CalenderImpl <em>Calender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.impl.CalenderImpl
	 * @see GTFS.impl.GTFSPackageImpl#getCalender()
	 * @generated
	 */
	int CALENDER = 6;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__SERVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Stop Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__STOP_DATE = 2;

	/**
	 * The feature id for the '<em><b>Monday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__MONDAY = 3;

	/**
	 * The feature id for the '<em><b>Tuesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__TUESDAY = 4;

	/**
	 * The feature id for the '<em><b>Wednesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__WEDNESDAY = 5;

	/**
	 * The feature id for the '<em><b>Thursday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__THURSDAY = 6;

	/**
	 * The feature id for the '<em><b>Friday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__FRIDAY = 7;

	/**
	 * The feature id for the '<em><b>Saturday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__SATURDAY = 8;

	/**
	 * The feature id for the '<em><b>Sunday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER__SUNDAY = 9;

	/**
	 * The number of structural features of the '<em>Calender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Calender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link GTFS.GTFSRouteType <em>Route Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFS.GTFSRouteType
	 * @see GTFS.impl.GTFSPackageImpl#getGTFSRouteType()
	 * @generated
	 */
	int GTFS_ROUTE_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link GTFS.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see GTFS.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getAgency <em>Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agency</em>'.
	 * @see GTFS.Collection#getAgency()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Agency();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see GTFS.Collection#getRoutes()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Routes();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see GTFS.Collection#getTrips()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Trips();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getStopTimes <em>Stop Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Times</em>'.
	 * @see GTFS.Collection#getStopTimes()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_StopTimes();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stops</em>'.
	 * @see GTFS.Collection#getStops()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Stops();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Collection#getCalender <em>Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calender</em>'.
	 * @see GTFS.Collection#getCalender()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Calender();

	/**
	 * Returns the meta object for the '{@link GTFS.Collection#importRaw(org.eclipse.emf.ecore.EObject, boolean) <em>Import Raw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Raw</em>' operation.
	 * @see GTFS.Collection#importRaw(org.eclipse.emf.ecore.EObject, boolean)
	 * @generated
	 */
	EOperation getCollection__ImportRaw__EObject_boolean();

	/**
	 * Returns the meta object for class '{@link GTFS.Agency <em>Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agency</em>'.
	 * @see GTFS.Agency
	 * @generated
	 */
	EClass getAgency();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Agency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GTFS.Agency#getName()
	 * @see #getAgency()
	 * @generated
	 */
	EAttribute getAgency_Name();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Agency#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see GTFS.Agency#getURL()
	 * @see #getAgency()
	 * @generated
	 */
	EAttribute getAgency_URL();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Agency#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see GTFS.Agency#getTimezone()
	 * @see #getAgency()
	 * @generated
	 */
	EAttribute getAgency_Timezone();

	/**
	 * Returns the meta object for class '{@link GTFS.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see GTFS.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Route#getRouteID <em>Route ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route ID</em>'.
	 * @see GTFS.Route#getRouteID()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_RouteID();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Route#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see GTFS.Route#getShortName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Route#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Name</em>'.
	 * @see GTFS.Route#getLongName()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_LongName();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Route#getRouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Type</em>'.
	 * @see GTFS.Route#getRouteType()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_RouteType();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Route#getTripsC <em>Trips C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips C</em>'.
	 * @see GTFS.Route#getTripsC()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_TripsC();

	/**
	 * Returns the meta object for class '{@link GTFS.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see GTFS.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Trip#getTripID <em>Trip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip ID</em>'.
	 * @see GTFS.Trip#getTripID()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_TripID();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Trip#getServiceIDNotCalender <em>Service ID Not Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID Not Calender</em>'.
	 * @see GTFS.Trip#getServiceIDNotCalender()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_ServiceIDNotCalender();

	/**
	 * Returns the meta object for the reference '{@link GTFS.Trip#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see GTFS.Trip#getRoute()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Route();

	/**
	 * Returns the meta object for the reference '{@link GTFS.Trip#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see GTFS.Trip#getService()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_Service();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Trip#getStopTimesC <em>Stop Times C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Times C</em>'.
	 * @see GTFS.Trip#getStopTimesC()
	 * @see #getTrip()
	 * @generated
	 */
	EReference getTrip_StopTimesC();

	/**
	 * Returns the meta object for class '{@link GTFS.StopTime <em>Stop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Time</em>'.
	 * @see GTFS.StopTime
	 * @generated
	 */
	EClass getStopTime();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.StopTime#getArrivalTime <em>Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Time</em>'.
	 * @see GTFS.StopTime#getArrivalTime()
	 * @see #getStopTime()
	 * @generated
	 */
	EAttribute getStopTime_ArrivalTime();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.StopTime#getDepatureTime <em>Depature Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depature Time</em>'.
	 * @see GTFS.StopTime#getDepatureTime()
	 * @see #getStopTime()
	 * @generated
	 */
	EAttribute getStopTime_DepatureTime();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.StopTime#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Sequence</em>'.
	 * @see GTFS.StopTime#getStopSequence()
	 * @see #getStopTime()
	 * @generated
	 */
	EAttribute getStopTime_StopSequence();

	/**
	 * Returns the meta object for the reference '{@link GTFS.StopTime#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop</em>'.
	 * @see GTFS.StopTime#getStop()
	 * @see #getStopTime()
	 * @generated
	 */
	EReference getStopTime_Stop();

	/**
	 * Returns the meta object for the reference '{@link GTFS.StopTime#getTrip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trip</em>'.
	 * @see GTFS.StopTime#getTrip()
	 * @see #getStopTime()
	 * @generated
	 */
	EReference getStopTime_Trip();

	/**
	 * Returns the meta object for class '{@link GTFS.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see GTFS.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Stop#getStopID <em>Stop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop ID</em>'.
	 * @see GTFS.Stop#getStopID()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_StopID();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Stop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GTFS.Stop#getName()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Name();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Stop#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see GTFS.Stop#getLongitude()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Stop#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see GTFS.Stop#getLatitude()
	 * @see #getStop()
	 * @generated
	 */
	EAttribute getStop_Latitude();

	/**
	 * Returns the meta object for the reference list '{@link GTFS.Stop#getStopTimesC <em>Stop Times C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Times C</em>'.
	 * @see GTFS.Stop#getStopTimesC()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_StopTimesC();

	/**
	 * Returns the meta object for class '{@link GTFS.Calender <em>Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calender</em>'.
	 * @see GTFS.Calender
	 * @generated
	 */
	EClass getCalender();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see GTFS.Calender#getServiceID()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_ServiceID();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see GTFS.Calender#getStartDate()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#getStopDate <em>Stop Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Date</em>'.
	 * @see GTFS.Calender#getStopDate()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_StopDate();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isMonday <em>Monday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monday</em>'.
	 * @see GTFS.Calender#isMonday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Monday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isTuesday <em>Tuesday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuesday</em>'.
	 * @see GTFS.Calender#isTuesday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Tuesday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isWednesday <em>Wednesday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wednesday</em>'.
	 * @see GTFS.Calender#isWednesday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Wednesday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isThursday <em>Thursday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thursday</em>'.
	 * @see GTFS.Calender#isThursday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Thursday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isFriday <em>Friday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friday</em>'.
	 * @see GTFS.Calender#isFriday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Friday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isSaturday <em>Saturday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturday</em>'.
	 * @see GTFS.Calender#isSaturday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Saturday();

	/**
	 * Returns the meta object for the attribute '{@link GTFS.Calender#isSunday <em>Sunday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sunday</em>'.
	 * @see GTFS.Calender#isSunday()
	 * @see #getCalender()
	 * @generated
	 */
	EAttribute getCalender_Sunday();

	/**
	 * Returns the meta object for enum '{@link GTFS.GTFSRouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Route Type</em>'.
	 * @see GTFS.GTFSRouteType
	 * @generated
	 */
	EEnum getGTFSRouteType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GTFSFactory getGTFSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GTFS.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.CollectionImpl
		 * @see GTFS.impl.GTFSPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Agency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__AGENCY = eINSTANCE.getCollection_Agency();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__ROUTES = eINSTANCE.getCollection_Routes();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__TRIPS = eINSTANCE.getCollection_Trips();

		/**
		 * The meta object literal for the '<em><b>Stop Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__STOP_TIMES = eINSTANCE.getCollection_StopTimes();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__STOPS = eINSTANCE.getCollection_Stops();

		/**
		 * The meta object literal for the '<em><b>Calender</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__CALENDER = eINSTANCE.getCollection_Calender();

		/**
		 * The meta object literal for the '<em><b>Import Raw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION___IMPORT_RAW__EOBJECT_BOOLEAN = eINSTANCE.getCollection__ImportRaw__EObject_boolean();

		/**
		 * The meta object literal for the '{@link GTFS.impl.AgencyImpl <em>Agency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.AgencyImpl
		 * @see GTFS.impl.GTFSPackageImpl#getAgency()
		 * @generated
		 */
		EClass AGENCY = eINSTANCE.getAgency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY__NAME = eINSTANCE.getAgency_Name();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY__URL = eINSTANCE.getAgency_URL();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY__TIMEZONE = eINSTANCE.getAgency_Timezone();

		/**
		 * The meta object literal for the '{@link GTFS.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.RouteImpl
		 * @see GTFS.impl.GTFSPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Route ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__ROUTE_ID = eINSTANCE.getRoute_RouteID();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__SHORT_NAME = eINSTANCE.getRoute_ShortName();

		/**
		 * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__LONG_NAME = eINSTANCE.getRoute_LongName();

		/**
		 * The meta object literal for the '<em><b>Route Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__ROUTE_TYPE = eINSTANCE.getRoute_RouteType();

		/**
		 * The meta object literal for the '<em><b>Trips C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__TRIPS_C = eINSTANCE.getRoute_TripsC();

		/**
		 * The meta object literal for the '{@link GTFS.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.TripImpl
		 * @see GTFS.impl.GTFSPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Trip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__TRIP_ID = eINSTANCE.getTrip_TripID();

		/**
		 * The meta object literal for the '<em><b>Service ID Not Calender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__SERVICE_ID_NOT_CALENDER = eINSTANCE.getTrip_ServiceIDNotCalender();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__ROUTE = eINSTANCE.getTrip_Route();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__SERVICE = eINSTANCE.getTrip_Service();

		/**
		 * The meta object literal for the '<em><b>Stop Times C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP__STOP_TIMES_C = eINSTANCE.getTrip_StopTimesC();

		/**
		 * The meta object literal for the '{@link GTFS.impl.StopTimeImpl <em>Stop Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.StopTimeImpl
		 * @see GTFS.impl.GTFSPackageImpl#getStopTime()
		 * @generated
		 */
		EClass STOP_TIME = eINSTANCE.getStopTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME__ARRIVAL_TIME = eINSTANCE.getStopTime_ArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Depature Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME__DEPATURE_TIME = eINSTANCE.getStopTime_DepatureTime();

		/**
		 * The meta object literal for the '<em><b>Stop Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME__STOP_SEQUENCE = eINSTANCE.getStopTime_StopSequence();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_TIME__STOP = eINSTANCE.getStopTime_Stop();

		/**
		 * The meta object literal for the '<em><b>Trip</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_TIME__TRIP = eINSTANCE.getStopTime_Trip();

		/**
		 * The meta object literal for the '{@link GTFS.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.StopImpl
		 * @see GTFS.impl.GTFSPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Stop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__STOP_ID = eINSTANCE.getStop_StopID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__NAME = eINSTANCE.getStop_Name();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__LONGITUDE = eINSTANCE.getStop_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP__LATITUDE = eINSTANCE.getStop_Latitude();

		/**
		 * The meta object literal for the '<em><b>Stop Times C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__STOP_TIMES_C = eINSTANCE.getStop_StopTimesC();

		/**
		 * The meta object literal for the '{@link GTFS.impl.CalenderImpl <em>Calender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.impl.CalenderImpl
		 * @see GTFS.impl.GTFSPackageImpl#getCalender()
		 * @generated
		 */
		EClass CALENDER = eINSTANCE.getCalender();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__SERVICE_ID = eINSTANCE.getCalender_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__START_DATE = eINSTANCE.getCalender_StartDate();

		/**
		 * The meta object literal for the '<em><b>Stop Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__STOP_DATE = eINSTANCE.getCalender_StopDate();

		/**
		 * The meta object literal for the '<em><b>Monday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__MONDAY = eINSTANCE.getCalender_Monday();

		/**
		 * The meta object literal for the '<em><b>Tuesday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__TUESDAY = eINSTANCE.getCalender_Tuesday();

		/**
		 * The meta object literal for the '<em><b>Wednesday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__WEDNESDAY = eINSTANCE.getCalender_Wednesday();

		/**
		 * The meta object literal for the '<em><b>Thursday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__THURSDAY = eINSTANCE.getCalender_Thursday();

		/**
		 * The meta object literal for the '<em><b>Friday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__FRIDAY = eINSTANCE.getCalender_Friday();

		/**
		 * The meta object literal for the '<em><b>Saturday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__SATURDAY = eINSTANCE.getCalender_Saturday();

		/**
		 * The meta object literal for the '<em><b>Sunday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER__SUNDAY = eINSTANCE.getCalender_Sunday();

		/**
		 * The meta object literal for the '{@link GTFS.GTFSRouteType <em>Route Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFS.GTFSRouteType
		 * @see GTFS.impl.GTFSPackageImpl#getGTFSRouteType()
		 * @generated
		 */
		EEnum GTFS_ROUTE_TYPE = eINSTANCE.getGTFSRouteType();

	}

} //GTFSPackage
