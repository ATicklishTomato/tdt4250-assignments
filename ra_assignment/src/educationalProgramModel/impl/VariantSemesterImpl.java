/**
 */
package educationalProgramModel.impl;

import educationalProgramModel.EducationalProgramModelPackage;
import educationalProgramModel.Semester;
import educationalProgramModel.VariantSemester;

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
 * An implementation of the model object '<em><b>Variant Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.impl.VariantSemesterImpl#getSemesterChoices <em>Semester Choices</em>}</li>
 *   <li>{@link educationalProgramModel.impl.VariantSemesterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantSemesterImpl extends MinimalEObjectImpl.Container implements VariantSemester {
	/**
	 * The cached value of the '{@link #getSemesterChoices() <em>Semester Choices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesterChoices;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelPackage.Literals.VARIANT_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesterChoices() {
		if (semesterChoices == null) {
			semesterChoices = new EObjectContainmentEList<Semester>(Semester.class, this, EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES);
		}
		return semesterChoices;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelPackage.VARIANT_SEMESTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES:
				return ((InternalEList<?>)getSemesterChoices()).basicRemove(otherEnd, msgs);
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
			case EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES:
				return getSemesterChoices();
			case EducationalProgramModelPackage.VARIANT_SEMESTER__NAME:
				return getName();
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
			case EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES:
				getSemesterChoices().clear();
				getSemesterChoices().addAll((Collection<? extends Semester>)newValue);
				return;
			case EducationalProgramModelPackage.VARIANT_SEMESTER__NAME:
				setName((String)newValue);
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
			case EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES:
				getSemesterChoices().clear();
				return;
			case EducationalProgramModelPackage.VARIANT_SEMESTER__NAME:
				setName(NAME_EDEFAULT);
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
			case EducationalProgramModelPackage.VARIANT_SEMESTER__SEMESTER_CHOICES:
				return semesterChoices != null && !semesterChoices.isEmpty();
			case EducationalProgramModelPackage.VARIANT_SEMESTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VariantSemesterImpl
