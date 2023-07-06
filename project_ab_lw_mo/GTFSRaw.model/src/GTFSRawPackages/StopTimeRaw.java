/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Time Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getDepatureTime <em>Depature Time</em>}</li>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link GTFSRawPackages.StopTimeRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw()
 * @model
 * @generated
 */
public interface StopTimeRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop ID</em>' attribute.
	 * @see #setStopID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_StopID()
	 * @model required="true"
	 * @generated
	 */
	String getStopID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopTimeRaw#getStopID <em>Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop ID</em>' attribute.
	 * @see #getStopID()
	 * @generated
	 */
	void setStopID(String value);

	/**
	 * Returns the value of the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip ID</em>' attribute.
	 * @see #setTripID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_TripID()
	 * @model required="true"
	 * @generated
	 */
	String getTripID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopTimeRaw#getTripID <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip ID</em>' attribute.
	 * @see #getTripID()
	 * @generated
	 */
	void setTripID(String value);

	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_ArrivalTime()
	 * @model required="true"
	 * @generated
	 */
	String getArrivalTime();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopTimeRaw#getArrivalTime <em>Arrival Time</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_DepatureTime()
	 * @model required="true"
	 * @generated
	 */
	String getDepatureTime();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopTimeRaw#getDepatureTime <em>Depature Time</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_StopSequence()
	 * @model required="true"
	 * @generated
	 */
	int getStopSequence();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopTimeRaw#getStopSequence <em>Stop Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Sequence</em>' attribute.
	 * @see #getStopSequence()
	 * @generated
	 */
	void setStopSequence(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopTimeRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // StopTimeRaw
