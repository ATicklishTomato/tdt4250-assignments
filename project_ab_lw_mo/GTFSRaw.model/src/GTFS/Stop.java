/**
 */
package GTFS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFS.Stop#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFS.Stop#getName <em>Name</em>}</li>
 *   <li>{@link GTFS.Stop#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link GTFS.Stop#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link GTFS.Stop#getStopTimesC <em>Stop Times C</em>}</li>
 * </ul>
 *
 * @see GTFS.GTFSPackage#getStop()
 * @model
 * @generated
 */
public interface Stop extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop ID</em>' attribute.
	 * @see #setStopID(String)
	 * @see GTFS.GTFSPackage#getStop_StopID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getStopID();

	/**
	 * Sets the value of the '{@link GTFS.Stop#getStopID <em>Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop ID</em>' attribute.
	 * @see #getStopID()
	 * @generated
	 */
	void setStopID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GTFS.GTFSPackage#getStop_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GTFS.Stop#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see GTFS.GTFSPackage#getStop_Longitude()
	 * @model required="true"
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link GTFS.Stop#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see GTFS.GTFSPackage#getStop_Latitude()
	 * @model required="true"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link GTFS.Stop#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Stop Times C</b></em>' reference list.
	 * The list contents are of type {@link GTFS.StopTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Times C</em>' reference list.
	 * @see GTFS.GTFSPackage#getStop_StopTimesC()
	 * @model
	 * @generated
	 */
	EList<StopTime> getStopTimesC();

} // Stop
