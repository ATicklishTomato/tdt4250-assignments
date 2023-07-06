/**
 */
package GTFS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFS.Route#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFS.Route#getShortName <em>Short Name</em>}</li>
 *   <li>{@link GTFS.Route#getLongName <em>Long Name</em>}</li>
 *   <li>{@link GTFS.Route#getRouteType <em>Route Type</em>}</li>
 *   <li>{@link GTFS.Route#getTripsC <em>Trips C</em>}</li>
 * </ul>
 *
 * @see GTFS.GTFSPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route ID</em>' attribute.
	 * @see #setRouteID(String)
	 * @see GTFS.GTFSPackage#getRoute_RouteID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRouteID();

	/**
	 * Sets the value of the '{@link GTFS.Route#getRouteID <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route ID</em>' attribute.
	 * @see #getRouteID()
	 * @generated
	 */
	void setRouteID(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see GTFS.GTFSPackage#getRoute_ShortName()
	 * @model required="true"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link GTFS.Route#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #setLongName(String)
	 * @see GTFS.GTFSPackage#getRoute_LongName()
	 * @model required="true"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link GTFS.Route#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Returns the value of the '<em><b>Route Type</b></em>' attribute.
	 * The literals are from the enumeration {@link GTFS.GTFSRouteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Type</em>' attribute.
	 * @see GTFS.GTFSRouteType
	 * @see #setRouteType(GTFSRouteType)
	 * @see GTFS.GTFSPackage#getRoute_RouteType()
	 * @model required="true"
	 * @generated
	 */
	GTFSRouteType getRouteType();

	/**
	 * Sets the value of the '{@link GTFS.Route#getRouteType <em>Route Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Type</em>' attribute.
	 * @see GTFS.GTFSRouteType
	 * @see #getRouteType()
	 * @generated
	 */
	void setRouteType(GTFSRouteType value);

	/**
	 * Returns the value of the '<em><b>Trips C</b></em>' reference list.
	 * The list contents are of type {@link GTFS.Trip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips C</em>' reference list.
	 * @see GTFS.GTFSPackage#getRoute_TripsC()
	 * @model
	 * @generated
	 */
	EList<Trip> getTripsC();

} // Route
