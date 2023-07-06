/**
 */
package GTFSRawPackages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Column Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.OptionalColumnRaw#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link GTFSRawPackages.OptionalColumnRaw#getColumnValue <em>Column Value</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getOptionalColumnRaw()
 * @model
 * @generated
 */
public interface OptionalColumnRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getOptionalColumnRaw_ColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.OptionalColumnRaw#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Value</em>' attribute.
	 * @see #setColumnValue(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getOptionalColumnRaw_ColumnValue()
	 * @model required="true"
	 * @generated
	 */
	String getColumnValue();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.OptionalColumnRaw#getColumnValue <em>Column Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Value</em>' attribute.
	 * @see #getColumnValue()
	 * @generated
	 */
	void setColumnValue(String value);

} // OptionalColumnRaw
