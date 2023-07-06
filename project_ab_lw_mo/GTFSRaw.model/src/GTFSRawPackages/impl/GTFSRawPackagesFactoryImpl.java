/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GTFSRawPackagesFactoryImpl extends EFactoryImpl implements GTFSRawPackagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GTFSRawPackagesFactory init() {
		try {
			GTFSRawPackagesFactory theGTFSRawPackagesFactory = (GTFSRawPackagesFactory)EPackage.Registry.INSTANCE.getEFactory(GTFSRawPackagesPackage.eNS_URI);
			if (theGTFSRawPackagesFactory != null) {
				return theGTFSRawPackagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GTFSRawPackagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRawPackagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GTFSRawPackagesPackage.COLLECTION_RAW: return createCollectionRaw();
			case GTFSRawPackagesPackage.AGENCY_RAW: return createAgencyRaw();
			case GTFSRawPackagesPackage.ROUTE_RAW: return createRouteRaw();
			case GTFSRawPackagesPackage.TRIP_RAW: return createTripRaw();
			case GTFSRawPackagesPackage.STOP_TIME_RAW: return createStopTimeRaw();
			case GTFSRawPackagesPackage.STOP_RAW: return createStopRaw();
			case GTFSRawPackagesPackage.CALENDER_RAW: return createCalenderRaw();
			case GTFSRawPackagesPackage.OPTIONAL_TABLE_RAW: return createOptionalTableRaw();
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW: return createOptionalColumnRaw();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionRaw createCollectionRaw() {
		CollectionRawImpl collectionRaw = new CollectionRawImpl();
		return collectionRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgencyRaw createAgencyRaw() {
		AgencyRawImpl agencyRaw = new AgencyRawImpl();
		return agencyRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteRaw createRouteRaw() {
		RouteRawImpl routeRaw = new RouteRawImpl();
		return routeRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripRaw createTripRaw() {
		TripRawImpl tripRaw = new TripRawImpl();
		return tripRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTimeRaw createStopTimeRaw() {
		StopTimeRawImpl stopTimeRaw = new StopTimeRawImpl();
		return stopTimeRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopRaw createStopRaw() {
		StopRawImpl stopRaw = new StopRawImpl();
		return stopRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalenderRaw createCalenderRaw() {
		CalenderRawImpl calenderRaw = new CalenderRawImpl();
		return calenderRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalTableRaw createOptionalTableRaw() {
		OptionalTableRawImpl optionalTableRaw = new OptionalTableRawImpl();
		return optionalTableRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalColumnRaw createOptionalColumnRaw() {
		OptionalColumnRawImpl optionalColumnRaw = new OptionalColumnRawImpl();
		return optionalColumnRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRawPackagesPackage getGTFSRawPackagesPackage() {
		return (GTFSRawPackagesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GTFSRawPackagesPackage getPackage() {
		return GTFSRawPackagesPackage.eINSTANCE;
	}

} //GTFSRawPackagesFactoryImpl
