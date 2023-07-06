/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.AgencyRaw;
import GTFSRawPackages.CalenderRaw;
import GTFSRawPackages.CollectionRaw;
import GTFSRawPackages.GTFSRawPackagesFactory;
import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;
import GTFSRawPackages.OptionalTableRaw;
import GTFSRawPackages.RouteRaw;
import GTFSRawPackages.StopRaw;
import GTFSRawPackages.StopTimeRaw;
import GTFSRawPackages.TripRaw;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GTFSRawPackagesPackageImpl extends EPackageImpl implements GTFSRawPackagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agencyRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTimeRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calenderRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalTableRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalColumnRawEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GTFSRawPackagesPackageImpl() {
		super(eNS_URI, GTFSRawPackagesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GTFSRawPackagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GTFSRawPackagesPackage init() {
		if (isInited) return (GTFSRawPackagesPackage)EPackage.Registry.INSTANCE.getEPackage(GTFSRawPackagesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGTFSRawPackagesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GTFSRawPackagesPackageImpl theGTFSRawPackagesPackage = registeredGTFSRawPackagesPackage instanceof GTFSRawPackagesPackageImpl ? (GTFSRawPackagesPackageImpl)registeredGTFSRawPackagesPackage : new GTFSRawPackagesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGTFSRawPackagesPackage.createPackageContents();

		// Initialize created meta-data
		theGTFSRawPackagesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGTFSRawPackagesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GTFSRawPackagesPackage.eNS_URI, theGTFSRawPackagesPackage);
		return theGTFSRawPackagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionRaw() {
		return collectionRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_Agency() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_Routes() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_Trips() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_StopTimes() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_Stops() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_Calender() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionRaw_OptionalTable() {
		return (EReference)collectionRawEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadGTFSFiles__String_String() {
		return collectionRawEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadAgencyFile__String_String() {
		return collectionRawEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadRoutesFile__String_String() {
		return collectionRawEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadTripsFile__String_String() {
		return collectionRawEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadStopTimesFile__String_String() {
		return collectionRawEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadStopsFile__String_String() {
		return collectionRawEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadCalendarFile__String_String() {
		return collectionRawEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__ReadOptionalFile__String_String() {
		return collectionRawEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionRaw__FixSubstrings__String_String() {
		return collectionRawEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgencyRaw() {
		return agencyRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgencyRaw_Name() {
		return (EAttribute)agencyRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgencyRaw_URL() {
		return (EAttribute)agencyRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgencyRaw_Timezone() {
		return (EAttribute)agencyRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgencyRaw_Columns() {
		return (EReference)agencyRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteRaw() {
		return routeRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRaw_RouteID() {
		return (EAttribute)routeRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRaw_ShortName() {
		return (EAttribute)routeRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRaw_LongName() {
		return (EAttribute)routeRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteRaw_RouteType() {
		return (EAttribute)routeRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteRaw_Columns() {
		return (EReference)routeRawEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripRaw() {
		return tripRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripRaw_TripID() {
		return (EAttribute)tripRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripRaw_RouteID() {
		return (EAttribute)tripRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripRaw_ServiceID() {
		return (EAttribute)tripRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripRaw_Columns() {
		return (EReference)tripRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopTimeRaw() {
		return stopTimeRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTimeRaw_StopID() {
		return (EAttribute)stopTimeRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTimeRaw_TripID() {
		return (EAttribute)stopTimeRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTimeRaw_ArrivalTime() {
		return (EAttribute)stopTimeRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTimeRaw_DepatureTime() {
		return (EAttribute)stopTimeRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTimeRaw_StopSequence() {
		return (EAttribute)stopTimeRawEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopTimeRaw_Columns() {
		return (EReference)stopTimeRawEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopRaw() {
		return stopRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRaw_StopID() {
		return (EAttribute)stopRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRaw_Name() {
		return (EAttribute)stopRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRaw_Longitude() {
		return (EAttribute)stopRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRaw_Latitude() {
		return (EAttribute)stopRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopRaw_Columns() {
		return (EReference)stopRawEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalenderRaw() {
		return calenderRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_ServiceID() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_StartDate() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_StopDate() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Monday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Tuesday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Wednesday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Thursday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Friday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Saturday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalenderRaw_Sunday() {
		return (EAttribute)calenderRawEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalenderRaw_Columns() {
		return (EReference)calenderRawEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalTableRaw() {
		return optionalTableRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalTableRaw_Columns() {
		return (EReference)optionalTableRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalColumnRaw() {
		return optionalColumnRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalColumnRaw_ColumnName() {
		return (EAttribute)optionalColumnRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionalColumnRaw_ColumnValue() {
		return (EAttribute)optionalColumnRawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRawPackagesFactory getGTFSRawPackagesFactory() {
		return (GTFSRawPackagesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collectionRawEClass = createEClass(COLLECTION_RAW);
		createEReference(collectionRawEClass, COLLECTION_RAW__AGENCY);
		createEReference(collectionRawEClass, COLLECTION_RAW__ROUTES);
		createEReference(collectionRawEClass, COLLECTION_RAW__TRIPS);
		createEReference(collectionRawEClass, COLLECTION_RAW__STOP_TIMES);
		createEReference(collectionRawEClass, COLLECTION_RAW__STOPS);
		createEReference(collectionRawEClass, COLLECTION_RAW__CALENDER);
		createEReference(collectionRawEClass, COLLECTION_RAW__OPTIONAL_TABLE);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_GTFS_FILES__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_AGENCY_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_ROUTES_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_TRIPS_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_STOP_TIMES_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_STOPS_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_CALENDAR_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___READ_OPTIONAL_FILE__STRING_STRING);
		createEOperation(collectionRawEClass, COLLECTION_RAW___FIX_SUBSTRINGS__STRING_STRING);

		agencyRawEClass = createEClass(AGENCY_RAW);
		createEAttribute(agencyRawEClass, AGENCY_RAW__NAME);
		createEAttribute(agencyRawEClass, AGENCY_RAW__URL);
		createEAttribute(agencyRawEClass, AGENCY_RAW__TIMEZONE);
		createEReference(agencyRawEClass, AGENCY_RAW__COLUMNS);

		routeRawEClass = createEClass(ROUTE_RAW);
		createEAttribute(routeRawEClass, ROUTE_RAW__ROUTE_ID);
		createEAttribute(routeRawEClass, ROUTE_RAW__SHORT_NAME);
		createEAttribute(routeRawEClass, ROUTE_RAW__LONG_NAME);
		createEAttribute(routeRawEClass, ROUTE_RAW__ROUTE_TYPE);
		createEReference(routeRawEClass, ROUTE_RAW__COLUMNS);

		tripRawEClass = createEClass(TRIP_RAW);
		createEAttribute(tripRawEClass, TRIP_RAW__TRIP_ID);
		createEAttribute(tripRawEClass, TRIP_RAW__ROUTE_ID);
		createEAttribute(tripRawEClass, TRIP_RAW__SERVICE_ID);
		createEReference(tripRawEClass, TRIP_RAW__COLUMNS);

		stopTimeRawEClass = createEClass(STOP_TIME_RAW);
		createEAttribute(stopTimeRawEClass, STOP_TIME_RAW__STOP_ID);
		createEAttribute(stopTimeRawEClass, STOP_TIME_RAW__TRIP_ID);
		createEAttribute(stopTimeRawEClass, STOP_TIME_RAW__ARRIVAL_TIME);
		createEAttribute(stopTimeRawEClass, STOP_TIME_RAW__DEPATURE_TIME);
		createEAttribute(stopTimeRawEClass, STOP_TIME_RAW__STOP_SEQUENCE);
		createEReference(stopTimeRawEClass, STOP_TIME_RAW__COLUMNS);

		stopRawEClass = createEClass(STOP_RAW);
		createEAttribute(stopRawEClass, STOP_RAW__STOP_ID);
		createEAttribute(stopRawEClass, STOP_RAW__NAME);
		createEAttribute(stopRawEClass, STOP_RAW__LONGITUDE);
		createEAttribute(stopRawEClass, STOP_RAW__LATITUDE);
		createEReference(stopRawEClass, STOP_RAW__COLUMNS);

		calenderRawEClass = createEClass(CALENDER_RAW);
		createEAttribute(calenderRawEClass, CALENDER_RAW__SERVICE_ID);
		createEAttribute(calenderRawEClass, CALENDER_RAW__START_DATE);
		createEAttribute(calenderRawEClass, CALENDER_RAW__STOP_DATE);
		createEAttribute(calenderRawEClass, CALENDER_RAW__MONDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__TUESDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__WEDNESDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__THURSDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__FRIDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__SATURDAY);
		createEAttribute(calenderRawEClass, CALENDER_RAW__SUNDAY);
		createEReference(calenderRawEClass, CALENDER_RAW__COLUMNS);

		optionalTableRawEClass = createEClass(OPTIONAL_TABLE_RAW);
		createEReference(optionalTableRawEClass, OPTIONAL_TABLE_RAW__COLUMNS);

		optionalColumnRawEClass = createEClass(OPTIONAL_COLUMN_RAW);
		createEAttribute(optionalColumnRawEClass, OPTIONAL_COLUMN_RAW__COLUMN_NAME);
		createEAttribute(optionalColumnRawEClass, OPTIONAL_COLUMN_RAW__COLUMN_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(collectionRawEClass, CollectionRaw.class, "CollectionRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionRaw_Agency(), this.getAgencyRaw(), null, "agency", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_Agency().getEKeys().add(this.getAgencyRaw_Name());
		getCollectionRaw_Agency().getEKeys().add(this.getAgencyRaw_URL());
		getCollectionRaw_Agency().getEKeys().add(this.getAgencyRaw_Timezone());
		initEReference(getCollectionRaw_Routes(), this.getRouteRaw(), null, "routes", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_Routes().getEKeys().add(this.getRouteRaw_RouteID());
		initEReference(getCollectionRaw_Trips(), this.getTripRaw(), null, "trips", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_Trips().getEKeys().add(this.getTripRaw_TripID());
		initEReference(getCollectionRaw_StopTimes(), this.getStopTimeRaw(), null, "stopTimes", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_StopTimes().getEKeys().add(this.getStopTimeRaw_StopID());
		getCollectionRaw_StopTimes().getEKeys().add(this.getStopTimeRaw_TripID());
		initEReference(getCollectionRaw_Stops(), this.getStopRaw(), null, "stops", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_Stops().getEKeys().add(this.getStopRaw_StopID());
		initEReference(getCollectionRaw_Calender(), this.getCalenderRaw(), null, "calender", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollectionRaw_Calender().getEKeys().add(this.getCalenderRaw_ServiceID());
		initEReference(getCollectionRaw_OptionalTable(), this.getOptionalTableRaw(), null, "optionalTable", null, 0, -1, CollectionRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCollectionRaw__ReadGTFSFiles__String_String(), null, "readGTFSFiles", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pathToFolder", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadAgencyFile__String_String(), null, "readAgencyFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadRoutesFile__String_String(), null, "readRoutesFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadTripsFile__String_String(), null, "readTripsFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadStopTimesFile__String_String(), null, "readStopTimesFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadStopsFile__String_String(), null, "readStopsFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadCalendarFile__String_String(), null, "readCalendarFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__ReadOptionalFile__String_String(), null, "readOptionalFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePathToFile", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollectionRaw__FixSubstrings__String_String(), ecorePackage.getEString(), "fixSubstrings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inputString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "csvCommaChar", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agencyRawEClass, AgencyRaw.class, "AgencyRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgencyRaw_Name(), ecorePackage.getEString(), "Name", null, 1, 1, AgencyRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgencyRaw_URL(), ecorePackage.getEString(), "URL", null, 1, 1, AgencyRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgencyRaw_Timezone(), ecorePackage.getEString(), "Timezone", null, 1, 1, AgencyRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgencyRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, AgencyRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeRawEClass, RouteRaw.class, "RouteRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteRaw_RouteID(), ecorePackage.getEString(), "RouteID", null, 1, 1, RouteRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteRaw_ShortName(), ecorePackage.getEString(), "ShortName", null, 1, 1, RouteRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteRaw_LongName(), ecorePackage.getEString(), "LongName", null, 1, 1, RouteRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRouteRaw_RouteType(), ecorePackage.getEInt(), "RouteType", null, 1, 1, RouteRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRouteRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, RouteRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripRawEClass, TripRaw.class, "TripRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTripRaw_TripID(), ecorePackage.getEString(), "TripID", null, 1, 1, TripRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTripRaw_RouteID(), ecorePackage.getEString(), "RouteID", null, 1, 1, TripRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTripRaw_ServiceID(), ecorePackage.getEString(), "ServiceID", null, 1, 1, TripRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, TripRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopTimeRawEClass, StopTimeRaw.class, "StopTimeRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopTimeRaw_StopID(), ecorePackage.getEString(), "StopID", null, 1, 1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTimeRaw_TripID(), ecorePackage.getEString(), "TripID", null, 1, 1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTimeRaw_ArrivalTime(), ecorePackage.getEString(), "arrivalTime", null, 1, 1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTimeRaw_DepatureTime(), ecorePackage.getEString(), "depatureTime", null, 1, 1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTimeRaw_StopSequence(), ecorePackage.getEInt(), "stopSequence", null, 1, 1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopTimeRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, StopTimeRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopRawEClass, StopRaw.class, "StopRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopRaw_StopID(), ecorePackage.getEString(), "StopID", null, 1, 1, StopRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRaw_Name(), ecorePackage.getEString(), "Name", null, 1, 1, StopRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRaw_Longitude(), ecorePackage.getEFloat(), "Longitude", null, 1, 1, StopRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopRaw_Latitude(), ecorePackage.getEFloat(), "Latitude", null, 1, 1, StopRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, StopRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calenderRawEClass, CalenderRaw.class, "CalenderRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalenderRaw_ServiceID(), ecorePackage.getEString(), "ServiceID", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_StartDate(), ecorePackage.getEDate(), "StartDate", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_StopDate(), ecorePackage.getEDate(), "StopDate", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Monday(), ecorePackage.getEBoolean(), "Monday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Tuesday(), ecorePackage.getEBoolean(), "Tuesday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Wednesday(), ecorePackage.getEBoolean(), "Wednesday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Thursday(), ecorePackage.getEBoolean(), "Thursday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Friday(), ecorePackage.getEBoolean(), "Friday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Saturday(), ecorePackage.getEBoolean(), "Saturday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalenderRaw_Sunday(), ecorePackage.getEBoolean(), "Sunday", null, 1, 1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalenderRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 0, -1, CalenderRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalTableRawEClass, OptionalTableRaw.class, "OptionalTableRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalTableRaw_Columns(), this.getOptionalColumnRaw(), null, "Columns", null, 1, -1, OptionalTableRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalColumnRawEClass, OptionalColumnRaw.class, "OptionalColumnRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionalColumnRaw_ColumnName(), ecorePackage.getEString(), "ColumnName", null, 1, 1, OptionalColumnRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionalColumnRaw_ColumnValue(), ecorePackage.getEString(), "ColumnValue", null, 1, 1, OptionalColumnRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GTFSRawPackagesPackageImpl
