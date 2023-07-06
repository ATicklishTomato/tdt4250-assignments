/**
 */
package GTFSRawPackages;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calender Raw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.CalenderRaw#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#getStopDate <em>Stop Date</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isMonday <em>Monday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isTuesday <em>Tuesday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isWednesday <em>Wednesday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isThursday <em>Thursday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isFriday <em>Friday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isSaturday <em>Saturday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#isSunday <em>Sunday</em>}</li>
 *   <li>{@link GTFSRawPackages.CalenderRaw#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw()
 * @model
 * @generated
 */
public interface CalenderRaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_ServiceID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Stop Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Date</em>' attribute.
	 * @see #setStopDate(Date)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_StopDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStopDate();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#getStopDate <em>Stop Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Date</em>' attribute.
	 * @see #getStopDate()
	 * @generated
	 */
	void setStopDate(Date value);

	/**
	 * Returns the value of the '<em><b>Monday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monday</em>' attribute.
	 * @see #setMonday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Monday()
	 * @model required="true"
	 * @generated
	 */
	boolean isMonday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isMonday <em>Monday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monday</em>' attribute.
	 * @see #isMonday()
	 * @generated
	 */
	void setMonday(boolean value);

	/**
	 * Returns the value of the '<em><b>Tuesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuesday</em>' attribute.
	 * @see #setTuesday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Tuesday()
	 * @model required="true"
	 * @generated
	 */
	boolean isTuesday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isTuesday <em>Tuesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuesday</em>' attribute.
	 * @see #isTuesday()
	 * @generated
	 */
	void setTuesday(boolean value);

	/**
	 * Returns the value of the '<em><b>Wednesday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wednesday</em>' attribute.
	 * @see #setWednesday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Wednesday()
	 * @model required="true"
	 * @generated
	 */
	boolean isWednesday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isWednesday <em>Wednesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wednesday</em>' attribute.
	 * @see #isWednesday()
	 * @generated
	 */
	void setWednesday(boolean value);

	/**
	 * Returns the value of the '<em><b>Thursday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thursday</em>' attribute.
	 * @see #setThursday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Thursday()
	 * @model required="true"
	 * @generated
	 */
	boolean isThursday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isThursday <em>Thursday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thursday</em>' attribute.
	 * @see #isThursday()
	 * @generated
	 */
	void setThursday(boolean value);

	/**
	 * Returns the value of the '<em><b>Friday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friday</em>' attribute.
	 * @see #setFriday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Friday()
	 * @model required="true"
	 * @generated
	 */
	boolean isFriday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isFriday <em>Friday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friday</em>' attribute.
	 * @see #isFriday()
	 * @generated
	 */
	void setFriday(boolean value);

	/**
	 * Returns the value of the '<em><b>Saturday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturday</em>' attribute.
	 * @see #setSaturday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Saturday()
	 * @model required="true"
	 * @generated
	 */
	boolean isSaturday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isSaturday <em>Saturday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturday</em>' attribute.
	 * @see #isSaturday()
	 * @generated
	 */
	void setSaturday(boolean value);

	/**
	 * Returns the value of the '<em><b>Sunday</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sunday</em>' attribute.
	 * @see #setSunday(boolean)
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Sunday()
	 * @model required="true"
	 * @generated
	 */
	boolean isSunday();

	/**
	 * Sets the value of the '{@link GTFSRawPackages.CalenderRaw#isSunday <em>Sunday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sunday</em>' attribute.
	 * @see #isSunday()
	 * @generated
	 */
	void setSunday(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link GTFSRawPackages.OptionalColumnRaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see GTFSRawPackages.GTFSRawPackagesPackage#getCalenderRaw_Columns()
	 * @model
	 * @generated
	 */
	EList<OptionalColumnRaw> getColumns();

} // CalenderRaw
