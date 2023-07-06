/**
 */
package GTFSRawPackages;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Table Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.OptionalTableRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getOptionalTableRaw()
 * @model
 * @generated
 */
public interface OptionalTableRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getOptionalTableRaw_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // OptionalTableRaw
