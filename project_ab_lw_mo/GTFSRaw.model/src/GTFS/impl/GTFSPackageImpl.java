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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class GTFSPackageImpl extends EPackageImpl implements GTFSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gtfsRouteTypeEEnum = null;

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
	 * @see GTFS.GTFSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GTFSPackageImpl() {
		super(eNS_URI, GTFSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GTFSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GTFSPackage init() {
		if (isInited) return (GTFSPackage)EPackage.Registry.INSTANCE.getEPackage(GTFSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGTFSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GTFSPackageImpl theGTFSPackage = registeredGTFSPackage instanceof GTFSPackageImpl ? (GTFSPackageImpl)registeredGTFSPackage : new GTFSPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGTFSPackage.createPackageContents();

		// Initialize created meta-data
		theGTFSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGTFSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GTFSPackage.eNS_URI, theGTFSPackage);
		return theGTFSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Agency() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Routes() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Trips() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_StopTimes() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Stops() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Calender() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollection__ImportRaw__EObject_boolean() {
		return collectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgency() {
		return agencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgency_Name() {
		return (EAttribute)agencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgency_URL() {
		return (EAttribute)agencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgency_Timezone() {
		return (EAttribute)agencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_RouteID() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_ShortName() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_LongName() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoute_RouteType() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute_TripsC() {
		return (EReference)routeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrip() {
		return tripEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrip_TripID() {
		return (EAttribute)tripEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrip_ServiceIDNotCalender() {
		return (EAttribute)tripEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrip_Route() {
		return (EReference)tripEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrip_Service() {
		return (EReference)tripEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrip_StopTimesC() {
		return (EReference)tripEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopTime() {
		return stopTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTime_ArrivalTime() {
		return (EAttribute)stopTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTime_DepatureTime() {
		return (EAttribute)stopTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopTime_StopSequence() {
		return (EAttribute)stopTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopTime_Stop() {
		return (EReference)stopTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopTime_Trip() {
		return (EReference)stopTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_StopID() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_Name() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_Longitude() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStop_Latitude() {
		return (EAttribute)stopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStop_StopTimesC() {
		return (EReference)stopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalender() {
		return calenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_ServiceID() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_StartDate() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_StopDate() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Monday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Tuesday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Wednesday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Thursday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Friday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Saturday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalender_Sunday() {
		return (EAttribute)calenderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGTFSRouteType() {
		return gtfsRouteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSFactory getGTFSFactory() {
		return (GTFSFactory)getEFactoryInstance();
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
		collectionEClass = createEClass(COLLECTION);
		createEReference(collectionEClass, COLLECTION__AGENCY);
		createEReference(collectionEClass, COLLECTION__ROUTES);
		createEReference(collectionEClass, COLLECTION__TRIPS);
		createEReference(collectionEClass, COLLECTION__STOP_TIMES);
		createEReference(collectionEClass, COLLECTION__STOPS);
		createEReference(collectionEClass, COLLECTION__CALENDER);
		createEOperation(collectionEClass, COLLECTION___IMPORT_RAW__EOBJECT_BOOLEAN);

		agencyEClass = createEClass(AGENCY);
		createEAttribute(agencyEClass, AGENCY__NAME);
		createEAttribute(agencyEClass, AGENCY__URL);
		createEAttribute(agencyEClass, AGENCY__TIMEZONE);

		routeEClass = createEClass(ROUTE);
		createEAttribute(routeEClass, ROUTE__ROUTE_ID);
		createEAttribute(routeEClass, ROUTE__SHORT_NAME);
		createEAttribute(routeEClass, ROUTE__LONG_NAME);
		createEAttribute(routeEClass, ROUTE__ROUTE_TYPE);
		createEReference(routeEClass, ROUTE__TRIPS_C);

		tripEClass = createEClass(TRIP);
		createEAttribute(tripEClass, TRIP__TRIP_ID);
		createEAttribute(tripEClass, TRIP__SERVICE_ID_NOT_CALENDER);
		createEReference(tripEClass, TRIP__ROUTE);
		createEReference(tripEClass, TRIP__SERVICE);
		createEReference(tripEClass, TRIP__STOP_TIMES_C);

		stopTimeEClass = createEClass(STOP_TIME);
		createEAttribute(stopTimeEClass, STOP_TIME__ARRIVAL_TIME);
		createEAttribute(stopTimeEClass, STOP_TIME__DEPATURE_TIME);
		createEAttribute(stopTimeEClass, STOP_TIME__STOP_SEQUENCE);
		createEReference(stopTimeEClass, STOP_TIME__STOP);
		createEReference(stopTimeEClass, STOP_TIME__TRIP);

		stopEClass = createEClass(STOP);
		createEAttribute(stopEClass, STOP__STOP_ID);
		createEAttribute(stopEClass, STOP__NAME);
		createEAttribute(stopEClass, STOP__LONGITUDE);
		createEAttribute(stopEClass, STOP__LATITUDE);
		createEReference(stopEClass, STOP__STOP_TIMES_C);

		calenderEClass = createEClass(CALENDER);
		createEAttribute(calenderEClass, CALENDER__SERVICE_ID);
		createEAttribute(calenderEClass, CALENDER__START_DATE);
		createEAttribute(calenderEClass, CALENDER__STOP_DATE);
		createEAttribute(calenderEClass, CALENDER__MONDAY);
		createEAttribute(calenderEClass, CALENDER__TUESDAY);
		createEAttribute(calenderEClass, CALENDER__WEDNESDAY);
		createEAttribute(calenderEClass, CALENDER__THURSDAY);
		createEAttribute(calenderEClass, CALENDER__FRIDAY);
		createEAttribute(calenderEClass, CALENDER__SATURDAY);
		createEAttribute(calenderEClass, CALENDER__SUNDAY);

		// Create enums
		gtfsRouteTypeEEnum = createEEnum(GTFS_ROUTE_TYPE);
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
		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollection_Agency(), this.getAgency(), null, "agency", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollection_Agency().getEKeys().add(this.getAgency_Name());
		getCollection_Agency().getEKeys().add(this.getAgency_URL());
		getCollection_Agency().getEKeys().add(this.getAgency_Timezone());
		initEReference(getCollection_Routes(), this.getRoute(), null, "routes", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollection_Routes().getEKeys().add(this.getRoute_RouteID());
		initEReference(getCollection_Trips(), this.getTrip(), null, "trips", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollection_Trips().getEKeys().add(this.getTrip_TripID());
		initEReference(getCollection_StopTimes(), this.getStopTime(), null, "stopTimes", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Stops(), this.getStop(), null, "stops", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollection_Stops().getEKeys().add(this.getStop_StopID());
		initEReference(getCollection_Calender(), this.getCalender(), null, "calender", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCollection_Calender().getEKeys().add(this.getCalender_ServiceID());

		EOperation op = initEOperation(getCollection__ImportRaw__EObject_boolean(), null, "importRaw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "RawCollectionInputObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreIrregularCalenderElements", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agencyEClass, Agency.class, "Agency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgency_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Agency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgency_URL(), ecorePackage.getEString(), "URL", null, 1, 1, Agency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgency_Timezone(), ecorePackage.getEString(), "Timezone", null, 1, 1, Agency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoute_RouteID(), ecorePackage.getEString(), "RouteID", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_ShortName(), ecorePackage.getEString(), "ShortName", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_LongName(), ecorePackage.getEString(), "LongName", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoute_RouteType(), this.getGTFSRouteType(), "RouteType", null, 1, 1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_TripsC(), this.getTrip(), null, "TripsC", null, 0, -1, Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tripEClass, Trip.class, "Trip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrip_TripID(), ecorePackage.getEString(), "TripID", null, 1, 1, Trip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrip_ServiceIDNotCalender(), ecorePackage.getEString(), "ServiceIDNotCalender", null, 0, 1, Trip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrip_Route(), this.getRoute(), null, "Route", null, 1, 1, Trip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrip_Service(), this.getCalender(), null, "Service", null, 0, 1, Trip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrip_StopTimesC(), this.getStopTime(), null, "StopTimesC", null, 0, -1, Trip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopTimeEClass, StopTime.class, "StopTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopTime_ArrivalTime(), ecorePackage.getEString(), "arrivalTime", null, 1, 1, StopTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTime_DepatureTime(), ecorePackage.getEString(), "depatureTime", null, 1, 1, StopTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopTime_StopSequence(), ecorePackage.getEInt(), "stopSequence", null, 1, 1, StopTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopTime_Stop(), this.getStop(), null, "Stop", null, 1, 1, StopTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStopTime_Trip(), this.getTrip(), null, "Trip", null, 1, 1, StopTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStop_StopID(), ecorePackage.getEString(), "StopID", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_Longitude(), ecorePackage.getEFloat(), "Longitude", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStop_Latitude(), ecorePackage.getEFloat(), "Latitude", null, 1, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStop_StopTimesC(), this.getStopTime(), null, "StopTimesC", null, 0, -1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calenderEClass, Calender.class, "Calender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalender_ServiceID(), ecorePackage.getEString(), "ServiceID", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_StartDate(), ecorePackage.getEDate(), "StartDate", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_StopDate(), ecorePackage.getEDate(), "StopDate", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Monday(), ecorePackage.getEBoolean(), "Monday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Tuesday(), ecorePackage.getEBoolean(), "Tuesday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Wednesday(), ecorePackage.getEBoolean(), "Wednesday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Thursday(), ecorePackage.getEBoolean(), "Thursday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Friday(), ecorePackage.getEBoolean(), "Friday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Saturday(), ecorePackage.getEBoolean(), "Saturday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalender_Sunday(), ecorePackage.getEBoolean(), "Sunday", null, 1, 1, Calender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gtfsRouteTypeEEnum, GTFSRouteType.class, "GTFSRouteType");
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.TRAM);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.SUBWAY);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.RAIL);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.BUS);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.FERRY);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.CABLE_TRAM);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.AERIAL_LIFT);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.FUNICULAR);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.TROLLEYBUS);
		addEEnumLiteral(gtfsRouteTypeEEnum, GTFSRouteType.MONORAIL);

		// Create resource
		createResource(eNS_URI);
	}

} //GTFSPackageImpl
