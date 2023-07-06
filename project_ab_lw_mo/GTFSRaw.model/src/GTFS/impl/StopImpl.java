/**
 */
package GTFS.impl;

import GTFS.GTFSPackage;
import GTFS.Stop;
import GTFS.StopTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFS.impl.StopImpl#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFS.impl.StopImpl#getName <em>Name</em>}</li>
 *   <li>{@link GTFS.impl.StopImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link GTFS.impl.StopImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link GTFS.impl.StopImpl#getStopTimesC <em>Stop Times C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopImpl extends MinimalEObjectImpl.Container implements Stop {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStopTimesC() <em>Stop Times C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTimesC()
	 * @generated
	 * @ordered
	 */
	protected EList<StopTime> stopTimesC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSPackage.Literals.STOP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP__STOP_ID, oldStopID, stopID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSPackage.STOP__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopTime> getStopTimesC() {
		if (stopTimesC == null) {
			stopTimesC = new EObjectResolvingEList<StopTime>(StopTime.class, this, GTFSPackage.STOP__STOP_TIMES_C);
		}
		return stopTimesC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSPackage.STOP__STOP_ID:
				return getStopID();
			case GTFSPackage.STOP__NAME:
				return getName();
			case GTFSPackage.STOP__LONGITUDE:
				return getLongitude();
			case GTFSPackage.STOP__LATITUDE:
				return getLatitude();
			case GTFSPackage.STOP__STOP_TIMES_C:
				return getStopTimesC();
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
			case GTFSPackage.STOP__STOP_ID:
				setStopID((String)newValue);
				return;
			case GTFSPackage.STOP__NAME:
				setName((String)newValue);
				return;
			case GTFSPackage.STOP__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case GTFSPackage.STOP__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case GTFSPackage.STOP__STOP_TIMES_C:
				getStopTimesC().clear();
				getStopTimesC().addAll((Collection<? extends StopTime>)newValue);
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
			case GTFSPackage.STOP__STOP_ID:
				setStopID(STOP_ID_EDEFAULT);
				return;
			case GTFSPackage.STOP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GTFSPackage.STOP__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case GTFSPackage.STOP__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case GTFSPackage.STOP__STOP_TIMES_C:
				getStopTimesC().clear();
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
			case GTFSPackage.STOP__STOP_ID:
				return STOP_ID_EDEFAULT == null ? stopID != null : !STOP_ID_EDEFAULT.equals(stopID);
			case GTFSPackage.STOP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GTFSPackage.STOP__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case GTFSPackage.STOP__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case GTFSPackage.STOP__STOP_TIMES_C:
				return stopTimesC != null && !stopTimesC.isEmpty();
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
		result.append(", Name: ");
		result.append(name);
		result.append(", Longitude: ");
		result.append(longitude);
		result.append(", Latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //StopImpl
