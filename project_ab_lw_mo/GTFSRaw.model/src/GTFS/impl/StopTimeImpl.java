/**
 */
package GTFS.impl;

import GTFS.GTFSPackage;
import GTFS.Stop;
import GTFS.StopTime;
import GTFS.Trip;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFS.impl.StopTimeImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link GTFS.impl.StopTimeImpl#getDepatureTime <em>Depature Time</em>}</li>
 *   <li>{@link GTFS.impl.StopTimeImpl#getStopSequence <em>Stop Sequence</em>}</li>
 *   <li>{@link GTFS.impl.StopTimeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link GTFS.impl.StopTimeImpl#getTrip <em>Trip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopTimeImpl extends MinimalEObjectImpl.Container implements StopTime {
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
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected Stop stop;

	/**
	 * The cached value of the '{@link #getTrip() <em>Trip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip()
	 * @generated
	 * @ordered
	 */
	protected Trip trip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSPackage.Literals.STOP_TIME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP_TIME__ARRIVAL_TIME, oldArrivalTime, arrivalTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP_TIME__DEPATURE_TIME, oldDepatureTime, depatureTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP_TIME__STOP_SEQUENCE, oldStopSequence, stopSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop getStop() {
		if (stop != null && stop.eIsProxy()) {
			InternalEObject oldStop = (InternalEObject)stop;
			stop = (Stop)eResolveProxy(oldStop);
			if (stop != oldStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GTFSPackage.STOP_TIME__STOP, oldStop, stop));
			}
		}
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop basicGetStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(Stop newStop) {
		Stop oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP_TIME__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip getTrip() {
		if (trip != null && trip.eIsProxy()) {
			InternalEObject oldTrip = (InternalEObject)trip;
			trip = (Trip)eResolveProxy(oldTrip);
			if (trip != oldTrip) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GTFSPackage.STOP_TIME__TRIP, oldTrip, trip));
			}
		}
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trip basicGetTrip() {
		return trip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrip(Trip newTrip) {
		Trip oldTrip = trip;
		trip = newTrip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP_TIME__TRIP, oldTrip, trip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSPackage.STOP_TIME__ARRIVAL_TIME:
				return getArrivalTime();
			case GTFSPackage.STOP_TIME__DEPATURE_TIME:
				return getDepatureTime();
			case GTFSPackage.STOP_TIME__STOP_SEQUENCE:
				return getStopSequence();
			case GTFSPackage.STOP_TIME__STOP:
				if (resolve) return getStop();
				return basicGetStop();
			case GTFSPackage.STOP_TIME__TRIP:
				if (resolve) return getTrip();
				return basicGetTrip();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GTFSPackage.STOP_TIME__ARRIVAL_TIME:
				setArrivalTime((String)newValue);
				return;
			case GTFSPackage.STOP_TIME__DEPATURE_TIME:
				setDepatureTime((String)newValue);
				return;
			case GTFSPackage.STOP_TIME__STOP_SEQUENCE:
				setStopSequence((Integer)newValue);
				return;
			case GTFSPackage.STOP_TIME__STOP:
				setStop((Stop)newValue);
				return;
			case GTFSPackage.STOP_TIME__TRIP:
				setTrip((Trip)newValue);
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
			case GTFSPackage.STOP_TIME__ARRIVAL_TIME:
				setArrivalTime(ARRIVAL_TIME_EDEFAULT);
				return;
			case GTFSPackage.STOP_TIME__DEPATURE_TIME:
				setDepatureTime(DEPATURE_TIME_EDEFAULT);
				return;
			case GTFSPackage.STOP_TIME__STOP_SEQUENCE:
				setStopSequence(STOP_SEQUENCE_EDEFAULT);
				return;
			case GTFSPackage.STOP_TIME__STOP:
				setStop((Stop)null);
				return;
			case GTFSPackage.STOP_TIME__TRIP:
				setTrip((Trip)null);
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
			case GTFSPackage.STOP_TIME__ARRIVAL_TIME:
				return ARRIVAL_TIME_EDEFAULT == null ? arrivalTime != null : !ARRIVAL_TIME_EDEFAULT.equals(arrivalTime);
			case GTFSPackage.STOP_TIME__DEPATURE_TIME:
				return DEPATURE_TIME_EDEFAULT == null ? depatureTime != null : !DEPATURE_TIME_EDEFAULT.equals(depatureTime);
			case GTFSPackage.STOP_TIME__STOP_SEQUENCE:
				return stopSequence != STOP_SEQUENCE_EDEFAULT;
			case GTFSPackage.STOP_TIME__STOP:
				return stop != null;
			case GTFSPackage.STOP_TIME__TRIP:
				return trip != null;
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
		result.append(" (arrivalTime: ");
		result.append(arrivalTime);
		result.append(", depatureTime: ");
		result.append(depatureTime);
		result.append(", stopSequence: ");
		result.append(stopSequence);
		result.append(')');
		return result.toString();
	}

} //StopTimeImpl
