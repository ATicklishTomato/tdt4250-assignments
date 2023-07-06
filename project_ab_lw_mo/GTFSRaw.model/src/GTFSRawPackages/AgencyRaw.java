/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agency Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.AgencyRaw#getName <em>Name</em>}</li>
 *   <li>{@link GTFSRawPackages.AgencyRaw#getURL <em>URL</em>}</li>
 *   <li>{@link GTFSRawPackages.AgencyRaw#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link GTFSRawPackages.AgencyRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getAgencyRaw()
 * @model
 * @generated
 */
public interface AgencyRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getAgencyRaw_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.AgencyRaw#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getAgencyRaw_URL()
	 * @model required="true"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.AgencyRaw#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getAgencyRaw_Timezone()
	 * @model required="true"
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.AgencyRaw#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getAgencyRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // AgencyRaw
