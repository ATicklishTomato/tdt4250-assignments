/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.CalenderRaw;
import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calender Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#getStopDate <em>Stop Date</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isMonday <em>Monday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isTuesday <em>Tuesday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isWednesday <em>Wednesday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isThursday <em>Thursday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isFriday <em>Friday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isSaturday <em>Saturday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#isSunday <em>Sunday</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.CalenderRawImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalenderRawImpl extends MinimalEObjectImpl.Container implements CalenderRaw {
	/**
	 * The default value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceID() <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceID()
	 * @generated
	 * @ordered
	 */
	protected String serviceID = SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopDate() <em>Stop Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STOP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopDate() <em>Stop Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopDate()
	 * @generated
	 * @ordered
	 */
	protected Date stopDate = STOP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonday() <em>Monday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonday() <em>Monday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonday()
	 * @generated
	 * @ordered
	 */
	protected boolean monday = MONDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTuesday() <em>Tuesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTuesday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TUESDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTuesday() <em>Tuesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTuesday()
	 * @generated
	 * @ordered
	 */
	protected boolean tuesday = TUESDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isWednesday() <em>Wednesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWednesday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEDNESDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWednesday() <em>Wednesday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWednesday()
	 * @generated
	 * @ordered
	 */
	protected boolean wednesday = WEDNESDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isThursday() <em>Thursday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThursday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THURSDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThursday() <em>Thursday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThursday()
	 * @generated
	 * @ordered
	 */
	protected boolean thursday = THURSDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFriday() <em>Friday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFriday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRIDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFriday() <em>Friday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFriday()
	 * @generated
	 * @ordered
	 */
	protected boolean friday = FRIDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSaturday() <em>Saturday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSaturday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATURDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSaturday() <em>Saturday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSaturday()
	 * @generated
	 * @ordered
	 */
	protected boolean saturday = SATURDAY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSunday() <em>Sunday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSunday()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUNDAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSunday() <em>Sunday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSunday()
	 * @generated
	 * @ordered
	 */
	protected boolean sunday = SUNDAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionalColumnRaw> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalenderRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.CALENDER_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceID() {
		return serviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(String newServiceID) {
		String oldServiceID = serviceID;
		serviceID = newServiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__SERVICE_ID, oldServiceID, serviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStopDate() {
		return stopDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopDate(Date newStopDate) {
		Date oldStopDate = stopDate;
		stopDate = newStopDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__STOP_DATE, oldStopDate, stopDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonday() {
		return monday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonday(boolean newMonday) {
		boolean oldMonday = monday;
		monday = newMonday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__MONDAY, oldMonday, monday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTuesday() {
		return tuesday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuesday(boolean newTuesday) {
		boolean oldTuesday = tuesday;
		tuesday = newTuesday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__TUESDAY, oldTuesday, tuesday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWednesday() {
		return wednesday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWednesday(boolean newWednesday) {
		boolean oldWednesday = wednesday;
		wednesday = newWednesday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__WEDNESDAY, oldWednesday, wednesday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThursday() {
		return thursday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThursday(boolean newThursday) {
		boolean oldThursday = thursday;
		thursday = newThursday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__THURSDAY, oldThursday, thursday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFriday() {
		return friday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriday(boolean newFriday) {
		boolean oldFriday = friday;
		friday = newFriday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__FRIDAY, oldFriday, friday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSaturday() {
		return saturday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaturday(boolean newSaturday) {
		boolean oldSaturday = saturday;
		saturday = newSaturday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__SATURDAY, oldSaturday, saturday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSunday() {
		return sunday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunday(boolean newSunday) {
		boolean oldSunday = sunday;
		sunday = newSunday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.CALENDER_RAW__SUNDAY, oldSunday, sunday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalColumnRaw> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<OptionalColumnRaw>(OptionalColumnRaw.class, this, GTFSRawPackagesPackage.CALENDER_RAW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSRawPackagesPackage.CALENDER_RAW__SERVICE_ID:
				return getServiceID();
			case GTFSRawPackagesPackage.CALENDER_RAW__START_DATE:
				return getStartDate();
			case GTFSRawPackagesPackage.CALENDER_RAW__STOP_DATE:
				return getStopDate();
			case GTFSRawPackagesPackage.CALENDER_RAW__MONDAY:
				return isMonday();
			case GTFSRawPackagesPackage.CALENDER_RAW__TUESDAY:
				return isTuesday();
			case GTFSRawPackagesPackage.CALENDER_RAW__WEDNESDAY:
				return isWednesday();
			case GTFSRawPackagesPackage.CALENDER_RAW__THURSDAY:
				return isThursday();
			case GTFSRawPackagesPackage.CALENDER_RAW__FRIDAY:
				return isFriday();
			case GTFSRawPackagesPackage.CALENDER_RAW__SATURDAY:
				return isSaturday();
			case GTFSRawPackagesPackage.CALENDER_RAW__SUNDAY:
				return isSunday();
			case GTFSRawPackagesPackage.CALENDER_RAW__COLUMNS:
				return getColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GTFSRawPackagesPackage.CALENDER_RAW__SERVICE_ID:
				setServiceID((String)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__START_DATE:
				setStartDate((Date)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__STOP_DATE:
				setStopDate((Date)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__MONDAY:
				setMonday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__TUESDAY:
				setTuesday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__WEDNESDAY:
				setWednesday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__THURSDAY:
				setThursday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__FRIDAY:
				setFriday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__SATURDAY:
				setSaturday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__SUNDAY:
				setSunday((Boolean)newValue);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends OptionalColumnRaw>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.CALENDER_RAW__SERVICE_ID:
				setServiceID(SERVICE_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__STOP_DATE:
				setStopDate(STOP_DATE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__MONDAY:
				setMonday(MONDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__TUESDAY:
				setTuesday(TUESDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__WEDNESDAY:
				setWednesday(WEDNESDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__THURSDAY:
				setThursday(THURSDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__FRIDAY:
				setFriday(FRIDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__SATURDAY:
				setSaturday(SATURDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__SUNDAY:
				setSunday(SUNDAY_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.CALENDER_RAW__COLUMNS:
				getColumns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GTFSRawPackagesPackage.CALENDER_RAW__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceID != null : !SERVICE_ID_EDEFAULT.equals(serviceID);
			case GTFSRawPackagesPackage.CALENDER_RAW__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case GTFSRawPackagesPackage.CALENDER_RAW__STOP_DATE:
				return STOP_DATE_EDEFAULT == null ? stopDate != null : !STOP_DATE_EDEFAULT.equals(stopDate);
			case GTFSRawPackagesPackage.CALENDER_RAW__MONDAY:
				return monday != MONDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__TUESDAY:
				return tuesday != TUESDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__WEDNESDAY:
				return wednesday != WEDNESDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__THURSDAY:
				return thursday != THURSDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__FRIDAY:
				return friday != FRIDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__SATURDAY:
				return saturday != SATURDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__SUNDAY:
				return sunday != SUNDAY_EDEFAULT;
			case GTFSRawPackagesPackage.CALENDER_RAW__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ServiceID: ");
		result.append(serviceID);
		result.append(", StartDate: ");
		result.append(startDate);
		result.append(", StopDate: ");
		result.append(stopDate);
		result.append(", Monday: ");
		result.append(monday);
		result.append(", Tuesday: ");
		result.append(tuesday);
		result.append(", Wednesday: ");
		result.append(wednesday);
		result.append(", Thursday: ");
		result.append(thursday);
		result.append(", Friday: ");
		result.append(friday);
		result.append(", Saturday: ");
		result.append(saturday);
		result.append(", Sunday: ");
		result.append(sunday);
		result.append(')');
		return result.toString();
	}

} //CalenderRawImpl
