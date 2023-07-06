/**
 */
package GTFSRawPackages;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see GTFSRawPackages.GTFSRawPackagesFactory
 * @model kind="package"
 * @generated
 */
public interface GTFSRawPackagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GTFSRawPackages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform://plugin/no.ntnu.tdt4350.TransportWizard/model/GTFSRaw.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GTFSRaw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GTFSRawPackagesPackage eINSTANCE = GTFSRawPackages.impl.GTFSRawPackagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.CollectionRawImpl <em>Collection Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.CollectionRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getCollectionRaw()
	 * @generated
	 */
	int COLLECTION_RAW = 0;

	/**
	 * The feature id for the '<em><b>Agency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__AGENCY = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__ROUTES = 1;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__TRIPS = 2;

	/**
	 * The feature id for the '<em><b>Stop Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__STOP_TIMES = 3;

	/**
	 * The feature id for the '<em><b>Stops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__STOPS = 4;

	/**
	 * The feature id for the '<em><b>Calender</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__CALENDER = 5;

	/**
	 * The feature id for the '<em><b>Optional Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW__OPTIONAL_TABLE = 6;

	/**
	 * The number of structural features of the '<em>Collection Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Read GTFS Files</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_GTFS_FILES__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Read Agency File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_AGENCY_FILE__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Read Routes File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_ROUTES_FILE__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Read Trips File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_TRIPS_FILE__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Read Stop Times File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_STOP_TIMES_FILE__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Read Stops File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_STOPS_FILE__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Read Calendar File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_CALENDAR_FILE__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Read Optional File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___READ_OPTIONAL_FILE__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Fix Substrings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW___FIX_SUBSTRINGS__STRING_STRING = 8;

	/**
	 * The number of operations of the '<em>Collection Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_RAW_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.AgencyRawImpl <em>Agency Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.AgencyRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getAgencyRaw()
	 * @generated
	 */
	int AGENCY_RAW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW__NAME = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW__URL = 1;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW__TIMEZONE = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW__COLUMNS = 3;

	/**
	 * The number of structural features of the '<em>Agency Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Agency Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENCY_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.RouteRawImpl <em>Route Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.RouteRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getRouteRaw()
	 * @generated
	 */
	int ROUTE_RAW = 2;

	/**
	 * The feature id for the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW__ROUTE_ID = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW__LONG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Route Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW__ROUTE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW__COLUMNS = 4;

	/**
	 * The number of structural features of the '<em>Route Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Route Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.TripRawImpl <em>Trip Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.TripRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getTripRaw()
	 * @generated
	 */
	int TRIP_RAW = 3;

	/**
	 * The feature id for the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW__TRIP_ID = 0;

	/**
	 * The feature id for the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW__ROUTE_ID = 1;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW__SERVICE_ID = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW__COLUMNS = 3;

	/**
	 * The number of structural features of the '<em>Trip Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.StopTimeRawImpl <em>Stop Time Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.StopTimeRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getStopTimeRaw()
	 * @generated
	 */
	int STOP_TIME_RAW = 4;

	/**
	 * The feature id for the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__STOP_ID = 0;

	/**
	 * The feature id for the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__TRIP_ID = 1;

	/**
	 * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__ARRIVAL_TIME = 2;

	/**
	 * The feature id for the '<em><b>Depature Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__DEPATURE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Stop Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__STOP_SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW__COLUMNS = 5;

	/**
	 * The number of structural features of the '<em>Stop Time Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stop Time Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIME_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.StopRawImpl <em>Stop Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.StopRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getStopRaw()
	 * @generated
	 */
	int STOP_RAW = 5;

	/**
	 * The feature id for the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW__STOP_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW__NAME = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW__LONGITUDE = 2;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW__LATITUDE = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW__COLUMNS = 4;

	/**
	 * The number of structural features of the '<em>Stop Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stop Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.CalenderRawImpl <em>Calender Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.CalenderRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getCalenderRaw()
	 * @generated
	 */
	int CALENDER_RAW = 6;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__SERVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Stop Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__STOP_DATE = 2;

	/**
	 * The feature id for the '<em><b>Monday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__MONDAY = 3;

	/**
	 * The feature id for the '<em><b>Tuesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__TUESDAY = 4;

	/**
	 * The feature id for the '<em><b>Wednesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__WEDNESDAY = 5;

	/**
	 * The feature id for the '<em><b>Thursday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__THURSDAY = 6;

	/**
	 * The feature id for the '<em><b>Friday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__FRIDAY = 7;

	/**
	 * The feature id for the '<em><b>Saturday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__SATURDAY = 8;

	/**
	 * The feature id for the '<em><b>Sunday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__SUNDAY = 9;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW__COLUMNS = 10;

	/**
	 * The number of structural features of the '<em>Calender Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Calender Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDER_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.OptionalTableRawImpl <em>Optional Table Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.OptionalTableRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getOptionalTableRaw()
	 * @generated
	 */
	int OPTIONAL_TABLE_RAW = 7;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_TABLE_RAW__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Optional Table Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_TABLE_RAW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Optional Table Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_TABLE_RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GTFSRawPackages.impl.OptionalColumnRawImpl <em>Optional Column Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GTFSRawPackages.impl.OptionalColumnRawImpl
	 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getOptionalColumnRaw()
	 * @generated
	 */
	int OPTIONAL_COLUMN_RAW = 8;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COLUMN_RAW__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COLUMN_RAW__COLUMN_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Optional Column Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COLUMN_RAW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Optional Column Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_COLUMN_RAW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.CollectionRaw <em>Collection Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Raw</em>'.
	 * @see GTFSRawPackages.CollectionRaw
	 * @generated
	 */
	EClass getCollectionRaw();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getAgency <em>Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agency</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getAgency()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_Agency();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getRoutes()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_Routes();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getTrips()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_Trips();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getStopTimes <em>Stop Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Times</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getStopTimes()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_StopTimes();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getStops <em>Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stops</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getStops()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_Stops();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getCalender <em>Calender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calender</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getCalender()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_Calender();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CollectionRaw#getOptionalTable <em>Optional Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Table</em>'.
	 * @see GTFSRawPackages.CollectionRaw#getOptionalTable()
	 * @see #getCollectionRaw()
	 * @generated
	 */
	EReference getCollectionRaw_OptionalTable();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readGTFSFiles(java.lang.String, java.lang.String) <em>Read GTFS Files</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read GTFS Files</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readGTFSFiles(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadGTFSFiles__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readAgencyFile(java.lang.String, java.lang.String) <em>Read Agency File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Agency File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readAgencyFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadAgencyFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readRoutesFile(java.lang.String, java.lang.String) <em>Read Routes File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Routes File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readRoutesFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadRoutesFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readTripsFile(java.lang.String, java.lang.String) <em>Read Trips File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Trips File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readTripsFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadTripsFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readStopTimesFile(java.lang.String, java.lang.String) <em>Read Stop Times File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Stop Times File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readStopTimesFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadStopTimesFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readStopsFile(java.lang.String, java.lang.String) <em>Read Stops File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Stops File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readStopsFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadStopsFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readCalendarFile(java.lang.String, java.lang.String) <em>Read Calendar File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Calendar File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readCalendarFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadCalendarFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#readOptionalFile(java.lang.String, java.lang.String) <em>Read Optional File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Optional File</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#readOptionalFile(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__ReadOptionalFile__String_String();

	/**
	 * Returns the meta object for the '{@link GTFSRawPackages.CollectionRaw#fixSubstrings(java.lang.String, java.lang.String) <em>Fix Substrings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fix Substrings</em>' operation.
	 * @see GTFSRawPackages.CollectionRaw#fixSubstrings(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCollectionRaw__FixSubstrings__String_String();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.AgencyRaw <em>Agency Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agency Raw</em>'.
	 * @see GTFSRawPackages.AgencyRaw
	 * @generated
	 */
	EClass getAgencyRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.AgencyRaw#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GTFSRawPackages.AgencyRaw#getName()
	 * @see #getAgencyRaw()
	 * @generated
	 */
	EAttribute getAgencyRaw_Name();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.AgencyRaw#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see GTFSRawPackages.AgencyRaw#getURL()
	 * @see #getAgencyRaw()
	 * @generated
	 */
	EAttribute getAgencyRaw_URL();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.AgencyRaw#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see GTFSRawPackages.AgencyRaw#getTimezone()
	 * @see #getAgencyRaw()
	 * @generated
	 */
	EAttribute getAgencyRaw_Timezone();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.AgencyRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.AgencyRaw#getColumns()
	 * @see #getAgencyRaw()
	 * @generated
	 */
	EReference getAgencyRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.RouteRaw <em>Route Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Raw</em>'.
	 * @see GTFSRawPackages.RouteRaw
	 * @generated
	 */
	EClass getRouteRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.RouteRaw#getRouteID <em>Route ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route ID</em>'.
	 * @see GTFSRawPackages.RouteRaw#getRouteID()
	 * @see #getRouteRaw()
	 * @generated
	 */
	EAttribute getRouteRaw_RouteID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.RouteRaw#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see GTFSRawPackages.RouteRaw#getShortName()
	 * @see #getRouteRaw()
	 * @generated
	 */
	EAttribute getRouteRaw_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.RouteRaw#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Name</em>'.
	 * @see GTFSRawPackages.RouteRaw#getLongName()
	 * @see #getRouteRaw()
	 * @generated
	 */
	EAttribute getRouteRaw_LongName();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.RouteRaw#getRouteType <em>Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Type</em>'.
	 * @see GTFSRawPackages.RouteRaw#getRouteType()
	 * @see #getRouteRaw()
	 * @generated
	 */
	EAttribute getRouteRaw_RouteType();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.RouteRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.RouteRaw#getColumns()
	 * @see #getRouteRaw()
	 * @generated
	 */
	EReference getRouteRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.TripRaw <em>Trip Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip Raw</em>'.
	 * @see GTFSRawPackages.TripRaw
	 * @generated
	 */
	EClass getTripRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.TripRaw#getTripID <em>Trip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip ID</em>'.
	 * @see GTFSRawPackages.TripRaw#getTripID()
	 * @see #getTripRaw()
	 * @generated
	 */
	EAttribute getTripRaw_TripID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.TripRaw#getRouteID <em>Route ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route ID</em>'.
	 * @see GTFSRawPackages.TripRaw#getRouteID()
	 * @see #getTripRaw()
	 * @generated
	 */
	EAttribute getTripRaw_RouteID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.TripRaw#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see GTFSRawPackages.TripRaw#getServiceID()
	 * @see #getTripRaw()
	 * @generated
	 */
	EAttribute getTripRaw_ServiceID();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.TripRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.TripRaw#getColumns()
	 * @see #getTripRaw()
	 * @generated
	 */
	EReference getTripRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.StopTimeRaw <em>Stop Time Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Time Raw</em>'.
	 * @see GTFSRawPackages.StopTimeRaw
	 * @generated
	 */
	EClass getStopTimeRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopTimeRaw#getStopID <em>Stop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop ID</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getStopID()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EAttribute getStopTimeRaw_StopID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopTimeRaw#getTripID <em>Trip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trip ID</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getTripID()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EAttribute getStopTimeRaw_TripID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopTimeRaw#getArrivalTime <em>Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Time</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getArrivalTime()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EAttribute getStopTimeRaw_ArrivalTime();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopTimeRaw#getDepatureTime <em>Depature Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depature Time</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getDepatureTime()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EAttribute getStopTimeRaw_DepatureTime();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopTimeRaw#getStopSequence <em>Stop Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Sequence</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getStopSequence()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EAttribute getStopTimeRaw_StopSequence();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.StopTimeRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.StopTimeRaw#getColumns()
	 * @see #getStopTimeRaw()
	 * @generated
	 */
	EReference getStopTimeRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.StopRaw <em>Stop Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Raw</em>'.
	 * @see GTFSRawPackages.StopRaw
	 * @generated
	 */
	EClass getStopRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopRaw#getStopID <em>Stop ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop ID</em>'.
	 * @see GTFSRawPackages.StopRaw#getStopID()
	 * @see #getStopRaw()
	 * @generated
	 */
	EAttribute getStopRaw_StopID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopRaw#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GTFSRawPackages.StopRaw#getName()
	 * @see #getStopRaw()
	 * @generated
	 */
	EAttribute getStopRaw_Name();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopRaw#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see GTFSRawPackages.StopRaw#getLongitude()
	 * @see #getStopRaw()
	 * @generated
	 */
	EAttribute getStopRaw_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.StopRaw#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see GTFSRawPackages.StopRaw#getLatitude()
	 * @see #getStopRaw()
	 * @generated
	 */
	EAttribute getStopRaw_Latitude();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.StopRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.StopRaw#getColumns()
	 * @see #getStopRaw()
	 * @generated
	 */
	EReference getStopRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.CalenderRaw <em>Calender Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calender Raw</em>'.
	 * @see GTFSRawPackages.CalenderRaw
	 * @generated
	 */
	EClass getCalenderRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see GTFSRawPackages.CalenderRaw#getServiceID()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_ServiceID();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see GTFSRawPackages.CalenderRaw#getStartDate()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#getStopDate <em>Stop Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Date</em>'.
	 * @see GTFSRawPackages.CalenderRaw#getStopDate()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_StopDate();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isMonday <em>Monday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isMonday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Monday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isTuesday <em>Tuesday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuesday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isTuesday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Tuesday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isWednesday <em>Wednesday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wednesday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isWednesday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Wednesday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isThursday <em>Thursday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thursday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isThursday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Thursday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isFriday <em>Friday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isFriday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Friday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isSaturday <em>Saturday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saturday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isSaturday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Saturday();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.CalenderRaw#isSunday <em>Sunday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sunday</em>'.
	 * @see GTFSRawPackages.CalenderRaw#isSunday()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EAttribute getCalenderRaw_Sunday();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.CalenderRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.CalenderRaw#getColumns()
	 * @see #getCalenderRaw()
	 * @generated
	 */
	EReference getCalenderRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.OptionalTableRaw <em>Optional Table Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Table Raw</em>'.
	 * @see GTFSRawPackages.OptionalTableRaw
	 * @generated
	 */
	EClass getOptionalTableRaw();

	/**
	 * Returns the meta object for the reference list '{@link GTFSRawPackages.OptionalTableRaw#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see GTFSRawPackages.OptionalTableRaw#getColumns()
	 * @see #getOptionalTableRaw()
	 * @generated
	 */
	EReference getOptionalTableRaw_Columns();

	/**
	 * Returns the meta object for class '{@link GTFSRawPackages.OptionalColumnRaw <em>Optional Column Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Column Raw</em>'.
	 * @see GTFSRawPackages.OptionalColumnRaw
	 * @generated
	 */
	EClass getOptionalColumnRaw();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.OptionalColumnRaw#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see GTFSRawPackages.OptionalColumnRaw#getColumnName()
	 * @see #getOptionalColumnRaw()
	 * @generated
	 */
	EAttribute getOptionalColumnRaw_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link GTFSRawPackages.OptionalColumnRaw#getColumnValue <em>Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Value</em>'.
	 * @see GTFSRawPackages.OptionalColumnRaw#getColumnValue()
	 * @see #getOptionalColumnRaw()
	 * @generated
	 */
	EAttribute getOptionalColumnRaw_ColumnValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GTFSRawPackagesFactory getGTFSRawPackagesFactory();

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
		 * The meta object literal for the '{@link GTFSRawPackages.impl.CollectionRawImpl <em>Collection Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.CollectionRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getCollectionRaw()
		 * @generated
		 */
		EClass COLLECTION_RAW = eINSTANCE.getCollectionRaw();

		/**
		 * The meta object literal for the '<em><b>Agency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__AGENCY = eINSTANCE.getCollectionRaw_Agency();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__ROUTES = eINSTANCE.getCollectionRaw_Routes();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__TRIPS = eINSTANCE.getCollectionRaw_Trips();

		/**
		 * The meta object literal for the '<em><b>Stop Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__STOP_TIMES = eINSTANCE.getCollectionRaw_StopTimes();

		/**
		 * The meta object literal for the '<em><b>Stops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__STOPS = eINSTANCE.getCollectionRaw_Stops();

		/**
		 * The meta object literal for the '<em><b>Calender</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__CALENDER = eINSTANCE.getCollectionRaw_Calender();

		/**
		 * The meta object literal for the '<em><b>Optional Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_RAW__OPTIONAL_TABLE = eINSTANCE.getCollectionRaw_OptionalTable();

		/**
		 * The meta object literal for the '<em><b>Read GTFS Files</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_GTFS_FILES__STRING_STRING = eINSTANCE.getCollectionRaw__ReadGTFSFiles__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Agency File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_AGENCY_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadAgencyFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Routes File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_ROUTES_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadRoutesFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Trips File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_TRIPS_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadTripsFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Stop Times File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_STOP_TIMES_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadStopTimesFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Stops File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_STOPS_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadStopsFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Calendar File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_CALENDAR_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadCalendarFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Read Optional File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___READ_OPTIONAL_FILE__STRING_STRING = eINSTANCE.getCollectionRaw__ReadOptionalFile__String_String();

		/**
		 * The meta object literal for the '<em><b>Fix Substrings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_RAW___FIX_SUBSTRINGS__STRING_STRING = eINSTANCE.getCollectionRaw__FixSubstrings__String_String();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.AgencyRawImpl <em>Agency Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.AgencyRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getAgencyRaw()
		 * @generated
		 */
		EClass AGENCY_RAW = eINSTANCE.getAgencyRaw();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY_RAW__NAME = eINSTANCE.getAgencyRaw_Name();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY_RAW__URL = eINSTANCE.getAgencyRaw_URL();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENCY_RAW__TIMEZONE = eINSTANCE.getAgencyRaw_Timezone();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENCY_RAW__COLUMNS = eINSTANCE.getAgencyRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.RouteRawImpl <em>Route Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.RouteRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getRouteRaw()
		 * @generated
		 */
		EClass ROUTE_RAW = eINSTANCE.getRouteRaw();

		/**
		 * The meta object literal for the '<em><b>Route ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RAW__ROUTE_ID = eINSTANCE.getRouteRaw_RouteID();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RAW__SHORT_NAME = eINSTANCE.getRouteRaw_ShortName();

		/**
		 * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RAW__LONG_NAME = eINSTANCE.getRouteRaw_LongName();

		/**
		 * The meta object literal for the '<em><b>Route Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_RAW__ROUTE_TYPE = eINSTANCE.getRouteRaw_RouteType();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_RAW__COLUMNS = eINSTANCE.getRouteRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.TripRawImpl <em>Trip Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.TripRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getTripRaw()
		 * @generated
		 */
		EClass TRIP_RAW = eINSTANCE.getTripRaw();

		/**
		 * The meta object literal for the '<em><b>Trip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_RAW__TRIP_ID = eINSTANCE.getTripRaw_TripID();

		/**
		 * The meta object literal for the '<em><b>Route ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_RAW__ROUTE_ID = eINSTANCE.getTripRaw_RouteID();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP_RAW__SERVICE_ID = eINSTANCE.getTripRaw_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIP_RAW__COLUMNS = eINSTANCE.getTripRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.StopTimeRawImpl <em>Stop Time Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.StopTimeRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getStopTimeRaw()
		 * @generated
		 */
		EClass STOP_TIME_RAW = eINSTANCE.getStopTimeRaw();

		/**
		 * The meta object literal for the '<em><b>Stop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME_RAW__STOP_ID = eINSTANCE.getStopTimeRaw_StopID();

		/**
		 * The meta object literal for the '<em><b>Trip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME_RAW__TRIP_ID = eINSTANCE.getStopTimeRaw_TripID();

		/**
		 * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME_RAW__ARRIVAL_TIME = eINSTANCE.getStopTimeRaw_ArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Depature Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME_RAW__DEPATURE_TIME = eINSTANCE.getStopTimeRaw_DepatureTime();

		/**
		 * The meta object literal for the '<em><b>Stop Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_TIME_RAW__STOP_SEQUENCE = eINSTANCE.getStopTimeRaw_StopSequence();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_TIME_RAW__COLUMNS = eINSTANCE.getStopTimeRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.StopRawImpl <em>Stop Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.StopRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getStopRaw()
		 * @generated
		 */
		EClass STOP_RAW = eINSTANCE.getStopRaw();

		/**
		 * The meta object literal for the '<em><b>Stop ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_RAW__STOP_ID = eINSTANCE.getStopRaw_StopID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_RAW__NAME = eINSTANCE.getStopRaw_Name();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_RAW__LONGITUDE = eINSTANCE.getStopRaw_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_RAW__LATITUDE = eINSTANCE.getStopRaw_Latitude();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_RAW__COLUMNS = eINSTANCE.getStopRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.CalenderRawImpl <em>Calender Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.CalenderRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getCalenderRaw()
		 * @generated
		 */
		EClass CALENDER_RAW = eINSTANCE.getCalenderRaw();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__SERVICE_ID = eINSTANCE.getCalenderRaw_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__START_DATE = eINSTANCE.getCalenderRaw_StartDate();

		/**
		 * The meta object literal for the '<em><b>Stop Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__STOP_DATE = eINSTANCE.getCalenderRaw_StopDate();

		/**
		 * The meta object literal for the '<em><b>Monday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__MONDAY = eINSTANCE.getCalenderRaw_Monday();

		/**
		 * The meta object literal for the '<em><b>Tuesday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__TUESDAY = eINSTANCE.getCalenderRaw_Tuesday();

		/**
		 * The meta object literal for the '<em><b>Wednesday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__WEDNESDAY = eINSTANCE.getCalenderRaw_Wednesday();

		/**
		 * The meta object literal for the '<em><b>Thursday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__THURSDAY = eINSTANCE.getCalenderRaw_Thursday();

		/**
		 * The meta object literal for the '<em><b>Friday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__FRIDAY = eINSTANCE.getCalenderRaw_Friday();

		/**
		 * The meta object literal for the '<em><b>Saturday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__SATURDAY = eINSTANCE.getCalenderRaw_Saturday();

		/**
		 * The meta object literal for the '<em><b>Sunday</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDER_RAW__SUNDAY = eINSTANCE.getCalenderRaw_Sunday();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALENDER_RAW__COLUMNS = eINSTANCE.getCalenderRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.OptionalTableRawImpl <em>Optional Table Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.OptionalTableRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getOptionalTableRaw()
		 * @generated
		 */
		EClass OPTIONAL_TABLE_RAW = eINSTANCE.getOptionalTableRaw();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_TABLE_RAW__COLUMNS = eINSTANCE.getOptionalTableRaw_Columns();

		/**
		 * The meta object literal for the '{@link GTFSRawPackages.impl.OptionalColumnRawImpl <em>Optional Column Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GTFSRawPackages.impl.OptionalColumnRawImpl
		 * @see GTFSRawPackages.impl.GTFSRawPackagesPackageImpl#getOptionalColumnRaw()
		 * @generated
		 */
		EClass OPTIONAL_COLUMN_RAW = eINSTANCE.getOptionalColumnRaw();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_COLUMN_RAW__COLUMN_NAME = eINSTANCE.getOptionalColumnRaw_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Column Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONAL_COLUMN_RAW__COLUMN_VALUE = eINSTANCE.getOptionalColumnRaw_ColumnValue();

	}

} //GTFSRawPackagesPackage
