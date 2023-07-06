/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.RouteRaw#getRouteID <em>Route ID</em>}</li>
 *   <li>{@link GTFSRawPackages.RouteRaw#getShortName <em>Short Name</em>}</li>
 *   <li>{@link GTFSRawPackages.RouteRaw#getLongName <em>Long Name</em>}</li>
 *   <li>{@link GTFSRawPackages.RouteRaw#getRouteType <em>Route Type</em>}</li>
 *   <li>{@link GTFSRawPackages.RouteRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw()
 * @model
 * @generated
 */
public interface RouteRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route ID</em>' attribute.
	 * @see #setRouteID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw_RouteID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRouteID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.RouteRaw#getRouteID <em>Route ID</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw_ShortName()
	 * @model required="true"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.RouteRaw#getShortName <em>Short Name</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw_LongName()
	 * @model required="true"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.RouteRaw#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Returns the value of the '<em><b>Route Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Type</em>' attribute.
	 * @see #setRouteType(int)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw_RouteType()
	 * @model required="true"
	 * @generated
	 */
	int getRouteType();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.RouteRaw#getRouteType <em>Route Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Type</em>' attribute.
	 * @see #getRouteType()
	 * @generated
	 */
	void setRouteType(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getRouteRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // RouteRaw
