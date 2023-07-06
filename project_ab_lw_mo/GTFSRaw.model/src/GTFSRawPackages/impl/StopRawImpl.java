/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;
import GTFSRawPackages.StopRaw;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.StopRawImpl#getStopID <em>Stop ID</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopRawImpl#getName <em>Name</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopRawImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopRawImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.StopRawImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopRawImpl extends MinimalEObjectImpl.Container implements StopRaw {
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
	protected StopRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.STOP_RAW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_RAW__STOP_ID, oldStopID, stopID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_RAW__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_RAW__LONGITUDE, oldLongitude, longitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.STOP_RAW__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionalColumnRaw> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<OptionalColumnRaw>(OptionalColumnRaw.class, this, GTFSRawPackagesPackage.STOP_RAW__COLUMNS);
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
			case GTFSRawPackagesPackage.STOP_RAW__STOP_ID:
				return getStopID();
			case GTFSRawPackagesPackage.STOP_RAW__NAME:
				return getName();
			case GTFSRawPackagesPackage.STOP_RAW__LONGITUDE:
				return getLongitude();
			case GTFSRawPackagesPackage.STOP_RAW__LATITUDE:
				return getLatitude();
			case GTFSRawPackagesPackage.STOP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_RAW__STOP_ID:
				setStopID((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__NAME:
				setName((String)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__LONGITUDE:
				setLongitude((Float)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_RAW__STOP_ID:
				setStopID(STOP_ID_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.STOP_RAW__COLUMNS:
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
			case GTFSRawPackagesPackage.STOP_RAW__STOP_ID:
				return STOP_ID_EDEFAULT == null ? stopID != null : !STOP_ID_EDEFAULT.equals(stopID);
			case GTFSRawPackagesPackage.STOP_RAW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GTFSRawPackagesPackage.STOP_RAW__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case GTFSRawPackagesPackage.STOP_RAW__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case GTFSRawPackagesPackage.STOP_RAW__COLUMNS:
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
		result.append(", Name: ");
		result.append(name);
		result.append(", Longitude: ");
		result.append(longitude);
		result.append(", Latitude: ");
		result.append(latitude);
		result.append(')');
		return result.toString();
	}

} //StopRawImpl
