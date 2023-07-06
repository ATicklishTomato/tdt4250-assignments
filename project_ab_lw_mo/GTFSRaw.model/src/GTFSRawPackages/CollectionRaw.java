/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getAgency <em>Agency</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getRoutes <em>Routes</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getTrips <em>Trips</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getStopTimes <em>Stop Times</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getStops <em>Stops</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getCalender <em>Calender</em>}</li>
 *   <li>{@link GTFSRawPackages.CollectionRaw#getOptionalTable <em>Optional Table</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw()
 * @model
 * @generated
 */
public interface CollectionRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Agency</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.AgencyRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agency</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_Agency()
	 * @model keys="Name URL Timezone"
	 * @generated
	 */
	EList<AgencyRaw> getAgency();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.RouteRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_Routes()
	 * @model keys="RouteID"
	 * @generated
	 */
	EList<RouteRaw> getRoutes();

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.TripRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_Trips()
	 * @model keys="TripID"
	 * @generated
	 */
	EList<TripRaw> getTrips();

	/**
	 * Returns the value of the '<em><b>Stop Times</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.StopTimeRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Times</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_StopTimes()
	 * @model keys="StopID TripID"
	 * @generated
	 */
	EList<StopTimeRaw> getStopTimes();

	/**
	 * Returns the value of the '<em><b>Stops</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.StopRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stops</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_Stops()
	 * @model keys="StopID"
	 * @generated
	 */
	EList<StopRaw> getStops();

	/**
	 * Returns the value of the '<em><b>Calender</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.CalenderRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calender</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_Calender()
	 * @model keys="ServiceID"
	 * @generated
	 */
	EList<CalenderRaw> getCalender();

	/**
	 * Returns the value of the '<em><b>Optional Table</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalTableRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Table</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCollectionRaw_OptionalTable()
	 * @model
	 * @generated
	 */
	EList<OptionalTableRaw> getOptionalTable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathToFolderRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readGTFSFiles(String pathToFolder, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readAgencyFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readRoutesFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readTripsFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readStopTimesFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readStopsFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readCalendarFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model absolutePathToFileRequired="true" csvCommaCharRequired="true"
	 * @generated
	 */
	void readOptionalFile(String absolutePathToFile, String csvCommaChar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model csvCommaCharRequired="true"
	 * @generated
	 */
	String fixSubstrings(String inputString, String csvCommaChar);

} // CollectionRaw
