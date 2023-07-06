/**
 */
package GTFS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFS.Collection#getAgency <em>Agency</em>}</li>
 *   <li>{@link GTFS.Collection#getRoutes <em>Routes</em>}</li>
 *   <li>{@link GTFS.Collection#getTrips <em>Trips</em>}</li>
 *   <li>{@link GTFS.Collection#getStopTimes <em>Stop Times</em>}</li>
 *   <li>{@link GTFS.Collection#getStops <em>Stops</em>}</li>
 *   <li>{@link GTFS.Collection#getCalender <em>Calender</em>}</li>
 * </ul>
 *
 * @see GTFS.GTFSPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * Returns the value of the '<em><b>Agency</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Agency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agency</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_Agency()
	 * @model keys="Name URL Timezone"
	 * @generated
	 */
	EList<Agency> getAgency();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_Routes()
	 * @model keys="RouteID"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Trip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_Trips()
	 * @model keys="TripID"
	 * @generated
	 */
	EList<Trip> getTrips();

	/**
	 * Returns the value of the '<em><b>Stop Times</b></em>' reference list.
	 * The list contents are of type {@link GTFS.StopTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Times</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_StopTimes()
	 * @model
	 * @generated
	 */
	EList<StopTime> getStopTimes();

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_Stops()
	 * @model keys="StopID"
	 * @generated
	 */
	EList<Stop> getStops();

	/**
	 * Returns the value of the '<em><b>Calender</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Calender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calender</em>' reference list.
	 * @see GTFS.GTFSPackage#getCollection_Calender()
	 * @model keys="ServiceID"
	 * @generated
	 */
	EList<Calender> getCalender();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void importRaw(EObject RawCollectionInputObject, boolean ignoreIrregularCalenderElements) throws Exception;

} // Collection
