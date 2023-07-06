/**
 */
package GTFS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFS.StopTime#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link GTFS.StopTime#getDepatureTime <em>Depature Time</em>}</li>
 *   <li>{@link GTFS.StopTime#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link GTFS.StopTime#getStop <em>Stop</em>}</li>
 *   <li>{@link GTFS.StopTime#getTrip <em>Trip</em>}</li>
 * </ul>
 *
 * @see GTFS.GTFSPackage#getStopTime()
 * @model
 * @generated
 */
public interface StopTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(String)
	 * @see GTFS.GTFSPackage#getStopTime_ArrivalTime()
	 * @model required="true"
	 * @generated
	 */
	String getArrivalTime();

	/**
	 * Sets the value of the '{@link GTFS.StopTime#getArrivalTime <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Time</em>' attribute.
	 * @see #getArrivalTime()
	 * @generated
	 */
	void setArrivalTime(String value);

	/**
	 * Returns the value of the '<em><b>Depature Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depature Time</em>' attribute.
	 * @see #setDepatureTime(String)
	 * @see GTFS.GTFSPackage#getStopTime_DepatureTime()
	 * @model required="true"
	 * @generated
	 */
	String getDepatureTime();

	/**
	 * Sets the value of the '{@link GTFS.StopTime#getDepatureTime <em>Depature Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depature Time</em>' attribute.
	 * @see #getDepatureTime()
	 * @generated
	 */
	void setDepatureTime(String value);

	/**
	 * Returns the value of the '<em><b>Stop Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Sequence</em>' attribute.
	 * @see #setStopSequence(int)
	 * @see GTFS.GTFSPackage#getStopTime_StopSequence()
	 * @model required="true"
	 * @generated
	 */
	int getStopSequence();

	/**
	 * Sets the value of the '{@link GTFS.StopTime#getStopSequence <em>Stop Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Sequence</em>' attribute.
	 * @see #getStopSequence()
	 * @generated
	 */
	void setStopSequence(int value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' reference.
	 * @see #setStop(Stop)
	 * @see GTFS.GTFSPackage#getStopTime_Stop()
	 * @model required="true"
	 * @generated
	 */
	Stop getStop();

	/**
	 * Sets the value of the '{@link GTFS.StopTime#getStop <em>Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Stop value);

	/**
	 * Returns the value of the '<em><b>Trip</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip</em>' reference.
	 * @see #setTrip(Trip)
	 * @see GTFS.GTFSPackage#getStopTime_Trip()
	 * @model required="true"
	 * @generated
	 */
	Trip getTrip();

	/**
	 * Sets the value of the '{@link GTFS.StopTime#getTrip <em>Trip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip</em>' reference.
	 * @see #getTrip()
	 * @generated
	 */
	void setTrip(Trip value);

} // StopTime
