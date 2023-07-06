/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;
import GTFSRawPackages.StopTimeRaw;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Time Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getTripID <em>Trip ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getDepatureTime <em>Depature Time</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopTimeRawImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopTimeRawImpl extends MinimalEObjectImpl.Container implements StopTimeRaw {
	/**
	 * The default value of the '{@link #getStopID() <em>Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopID()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopID() <em>Stop ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopID()
	 * @generated
	 * @ordered
	 */
	protected String stopID = STOP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTripID() <em>Trip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripID()
	 * @generated
	 * @ordered
	 */
	protected String tripID = TRIP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected String arrivalTime = ARRIVAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepatureTime() <em>Depature Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepatureTime()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPATURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepatureTime() <em>Depature Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepatureTime()
	 * @generated
	 * @ordered
	 */
	protected String depatureTime = DEPATURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopSequence() <em>Stop Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int STOP_SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStopSequence() <em>Stop Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSequence()
	 * @generated
	 * @ordered
	 */
	protected int stopSequence = STOP_SEQUENCE_EDEFAULT;

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
	protected StopTimeRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.STOP_TIME_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopID() {
		return stopID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopID(String newStopID) {
		String oldStopID = stopID;
		stopID = newStopID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_ID, oldStopID, stopID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTripID() {
		return tripID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTripID(String newTripID) {
		String oldTripID = tripID;
		tripID = newTripID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_TIME_RAW__TRIP_ID, oldTripID, tripID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalTime(String newArrivalTime) {
		String oldArrivalTime = arrivalTime;
		arrivalTime = newArrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_TIME_RAW__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepatureTime() {
		return depatureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepatureTime(String newDepatureTime) {
		String oldDepatureTime = depatureTime;
		depatureTime = newDepatureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_TIME_RAW__DEPATURE_TIME, oldDepatureTime, depatureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStopSequence() {
		return stopSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopSequence(int newStopSequence) {
		int oldStopSequence = stopSequence;
		stopSequence = newStopSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_SEQUENCE, oldStopSequence, stopSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalColumnRaw> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<OptionalColumnRaw>(OptionalColumnRaw.class, this, GTFSRawPackagesPackage.STOP_TIME_RAW__COLUMNS);
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
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_ID:
				return getStopID();
			case GTFSRawPackagesPackage.STOP_TIME_RAW__TRIP_ID:
				return getTripID();
			case GTFSRawPackagesPackage.STOP_TIME_RAW__ARRIVAL_TIME:
				return getArrivalTime();
			case GTFSRawPackagesPackage.STOP_TIME_RAW__DEPATURE_TIME:
				return getDepatureTime();
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_SEQUENCE:
				return getStopSequence();
			case GTFSRawPackagesPackage.STOP_TIME_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_ID:
				setStopID((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__TRIP_ID:
				setTripID((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__ARRIVAL_TIME:
				setArrivalTime((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__DEPATURE_TIME:
				setDepatureTime((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_SEQUENCE:
				setStopSequence((Integer)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_ID:
				setStopID(STOP_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__TRIP_ID:
				setTripID(TRIP_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__ARRIVAL_TIME:
				setArrivalTime(ARRIVAL_TIME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__DEPATURE_TIME:
				setDepatureTime(DEPATURE_TIME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_SEQUENCE:
				setStopSequence(STOP_SEQUENCE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_ID:
				return STOP_ID_EDEFAULT == null ? stopID != null : !STOP_ID_EDEFAULT.equals(stopID);
			case GTFSRawPackagesPackage.STOP_TIME_RAW__TRIP_ID:
				return TRIP_ID_EDEFAULT == null ? tripID != null : !TRIP_ID_EDEFAULT.equals(tripID);
			case GTFSRawPackagesPackage.STOP_TIME_RAW__ARRIVAL_TIME:
				return ARRIVAL_TIME_EDEFAULT == null ? arrivalTime != null : !ARRIVAL_TIME_EDEFAULT.equals(arrivalTime);
			case GTFSRawPackagesPackage.STOP_TIME_RAW__DEPATURE_TIME:
				return DEPATURE_TIME_EDEFAULT == null ? depatureTime != null : !DEPATURE_TIME_EDEFAULT.equals(depatureTime);
			case GTFSRawPackagesPackage.STOP_TIME_RAW__STOP_SEQUENCE:
				return stopSequence != STOP_SEQUENCE_EDEFAULT;
			case GTFSRawPackagesPackage.STOP_TIME_RAW__COLUMNS:
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
		result.append(" (StopID: ");
		result.append(stopID);
		result.append(", TripID: ");
		result.append(tripID);
		result.append(", arrivalTime: ");
		result.append(arrivalTime);
		result.append(", depatureTime: ");
		result.append(depatureTime);
		result.append(", stopSequence: ");
		result.append(stopSequence);
		result.append(')');
		return result.toString();
	}

} //StopTimeRawImpl
