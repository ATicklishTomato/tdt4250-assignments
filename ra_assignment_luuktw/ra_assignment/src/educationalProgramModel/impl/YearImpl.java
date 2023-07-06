/**
 */
package educationalProgramModel.impl;

import educationalProgramModel.EducationalProgramModelPackage;
import educationalProgramModel.Semester;
import educationalProgramModel.VariantSemester;
import educationalProgramModel.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.impl.YearImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link educationalProgramModel.impl.YearImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link educationalProgramModel.impl.YearImpl#getVariantSemesters <em>Variant Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariantSemesters() <em>Variant Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<VariantSemester> variantSemesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelPackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, EducationalProgramModelPackage.YEAR__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelPackage.YEAR__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariantSemester> getVariantSemesters() {
		if (variantSemesters == null) {
			variantSemesters = new EObjectContainmentEList<VariantSemester>(VariantSemester.class, this, EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS);
		}
		return variantSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelPackage.YEAR__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS:
				return ((InternalEList<?>)getVariantSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationalProgramModelPackage.YEAR__SEMESTERS:
				return getSemesters();
			case EducationalProgramModelPackage.YEAR__NUMBER:
				return getNumber();
			case EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS:
				return getVariantSemesters();
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
			case EducationalProgramModelPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case EducationalProgramModelPackage.YEAR__NUMBER:
				setNumber((Integer)newValue);
				return;
			case EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS:
				getVariantSemesters().clear();
				getVariantSemesters().addAll((Collection<? extends VariantSemester>)newValue);
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
			case EducationalProgramModelPackage.YEAR__SEMESTERS:
				getSemesters().clear();
				return;
			case EducationalProgramModelPackage.YEAR__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS:
				getVariantSemesters().clear();
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
			case EducationalProgramModelPackage.YEAR__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case EducationalProgramModelPackage.YEAR__NUMBER:
				return number != NUMBER_EDEFAULT;
			case EducationalProgramModelPackage.YEAR__VARIANT_SEMESTERS:
				return variantSemesters != null && !variantSemesters.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //YearImpl
