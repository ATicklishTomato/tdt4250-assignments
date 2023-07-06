/**
 */
package GTFS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFS.Trip#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFS.Trip#getServiceIDNotCalender <em>Service ID Not Calender</em>}</li>
 *   <li>{@link GTFS.Trip#getRoute <em>Route</em>}</li>
 *   <li>{@link GTFS.Trip#getService <em>Service</em>}</li>
 *   <li>{@link GTFS.Trip#getStopTimesC <em>Stop Times C</em>}</li>
 * </ul>
 *
 * @see GTFS.GTFSPackage#getTrip()
 * @model
 * @generated
 */
public interface Trip extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip ID</em>' attribute.
	 * @see #setTripID(String)
	 * @see GTFS.GTFSPackage#getTrip_TripID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getTripID();

	/**
	 * Sets the value of the '{@link GTFS.Trip#getTripID <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip ID</em>' attribute.
	 * @see #getTripID()
	 * @generated
	 */
	void setTripID(String value);

	/**
	 * Returns the value of the '<em><b>Service ID Not Calender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID Not Calender</em>' attribute.
	 * @see #setServiceIDNotCalender(String)
	 * @see GTFS.GTFSPackage#getTrip_ServiceIDNotCalender()
	 * @model
	 * @generated
	 */
	String getServiceIDNotCalender();

	/**
	 * Sets the value of the '{@link GTFS.Trip#getServiceIDNotCalender <em>Service ID Not Calender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID Not Calender</em>' attribute.
	 * @see #getServiceIDNotCalender()
	 * @generated
	 */
	void setServiceIDNotCalender(String value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see GTFS.GTFSPackage#getTrip_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link GTFS.Trip#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Calender)
	 * @see GTFS.GTFSPackage#getTrip_Service()
	 * @model
	 * @generated
	 */
	Calender getService();

	/**
	 * Sets the value of the '{@link GTFS.Trip#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Calender value);

	/**
	 * Returns the value of the '<em><b>Stop Times C</b></em>' reference list.
	 * The list contents are of type {@link GTFS.StopTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Times C</em>' reference list.
	 * @see GTFS.GTFSPackage#getTrip_StopTimesC()
	 * @model
	 * @generated
	 */
	EList<StopTime> getStopTimesC();

} // Trip
