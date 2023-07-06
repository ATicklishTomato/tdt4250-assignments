/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.StopRaw#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFSRawPackages.StopRaw#getName <em>Name</em>}</li>
 *   <li>{@link GTFSRawPackages.StopRaw#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link GTFSRawPackages.StopRaw#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link GTFSRawPackages.StopRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw()
 * @model
 * @generated
 */
public interface StopRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop ID</em>' attribute.
	 * @see #setStopID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw_StopID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getStopID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopRaw#getStopID <em>Stop ID</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopRaw#getName <em>Name</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw_Longitude()
	 * @model required="true"
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopRaw#getLongitude <em>Longitude</em>}' attribute.
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
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw_Latitude()
	 * @model required="true"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.StopRaw#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getStopRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // StopRaw
