/**
 */
package GTFSRawPackages.impl;

import GTFSRawPackages.GTFSRawPackagesPackage;
import GTFSRawPackages.OptionalColumnRaw;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Column Raw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GTFSRawPackages.impl.OptionalColumnRawImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link GTFSRawPackages.impl.OptionalColumnRawImpl#getColumnValue <em>Column Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalColumnRawImpl extends MinimalEObjectImpl.Container implements OptionalColumnRaw {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnValue() <em>Column Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnValue() <em>Column Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnValue()
	 * @generated
	 * @ordered
	 */
	protected String columnValue = COLUMN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalColumnRawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GTFSRawPackagesPackage.Literals.OPTIONAL_COLUMN_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnValue() {
		return columnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnValue(String newColumnValue) {
		String oldColumnValue = columnValue;
		columnValue = newColumnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_VALUE, oldColumnValue, columnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_NAME:
				return getColumnName();
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_VALUE:
				return getColumnValue();
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
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_VALUE:
				setColumnValue((String)newValue);
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
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_VALUE:
				setColumnValue(COLUMN_VALUE_EDEFAULT);
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
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW__COLUMN_VALUE:
				return COLUMN_VALUE_EDEFAULT == null ? columnValue != null : !COLUMN_VALUE_EDEFAULT.equals(columnValue);
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
		result.append(" (ColumnName: ");
		result.append(columnName);
		result.append(", ColumnValue: ");
		result.append(columnValue);
		result.append(')');
		return result.toString();
	}

} //OptionalColumnRawImpl
