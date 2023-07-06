/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.TripRaw#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFSRawPackages.TripRaw#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFSRawPackages.TripRaw#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link GTFSRawPackages.TripRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getTripRaw()
 * @model
 * @generated
 */
public interface TripRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Trip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip ID</em>' attribute.
	 * @see #setTripID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getTripRaw_TripID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getTripID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.TripRaw#getTripID <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip ID</em>' attribute.
	 * @see #getTripID()
	 * @generated
	 */
	void setTripID(String value);

	/**
	 * Returns the value of the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route ID</em>' attribute.
	 * @see #setRouteID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getTripRaw_RouteID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRouteID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.TripRaw#getRouteID <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route ID</em>' attribute.
	 * @see #getRouteID()
	 * @generated
	 */
	void setRouteID(String value);

	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getTripRaw_ServiceID()
	 * @model required="true"
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.TripRaw#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getTripRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // TripRaw
