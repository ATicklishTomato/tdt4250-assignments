/**
 */
package educationalProgramModelFix.impl;

import educationalProgramModelFix.Course;
import educationalProgramModelFix.EducationalProgramModelFixPackage;
import educationalProgramModelFix.Person;
import educationalProgramModelFix.Program;
import educationalProgramModelFix.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.impl.ProgramImpl#getYears <em>Years</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.ProgramImpl#getCode <em>Code</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.ProgramImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.ProgramImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getYears() <em>Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> years;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> staff;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelFixPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentEList<Year>(Year.class, this, EducationalProgramModelFixPackage.PROGRAM__YEARS);
		}
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelFixPackage.PROGRAM__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelFixPackage.PROGRAM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Person>(Person.class, this, EducationalProgramModelFixPackage.PROGRAM__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, EducationalProgramModelFixPackage.PROGRAM__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.PROGRAM__YEARS:
				return ((InternalEList<?>)getYears()).basicRemove(otherEnd, msgs);
			case EducationalProgramModelFixPackage.PROGRAM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case EducationalProgramModelFixPackage.PROGRAM__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
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
			case EducationalProgramModelFixPackage.PROGRAM__YEARS:
				return getYears();
			case EducationalProgramModelFixPackage.PROGRAM__NAME:
				return getName();
			case EducationalProgramModelFixPackage.PROGRAM__CODE:
				return getCode();
			case EducationalProgramModelFixPackage.PROGRAM__STAFF:
				return getStaff();
			case EducationalProgramModelFixPackage.PROGRAM__COURSES:
				return getCourses();
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
			case EducationalProgramModelFixPackage.PROGRAM__YEARS:
				getYears().clear();
				getYears().addAll((Collection<? extends Year>)newValue);
				return;
			case EducationalProgramModelFixPackage.PROGRAM__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelFixPackage.PROGRAM__CODE:
				setCode((String)newValue);
				return;
			case EducationalProgramModelFixPackage.PROGRAM__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Person>)newValue);
				return;
			case EducationalProgramModelFixPackage.PROGRAM__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
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
			case EducationalProgramModelFixPackage.PROGRAM__YEARS:
				getYears().clear();
				return;
			case EducationalProgramModelFixPackage.PROGRAM__NAME:
				getName().clear();
				return;
			case EducationalProgramModelFixPackage.PROGRAM__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case EducationalProgramModelFixPackage.PROGRAM__STAFF:
				getStaff().clear();
				return;
			case EducationalProgramModelFixPackage.PROGRAM__COURSES:
				getCourses().clear();
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
			case EducationalProgramModelFixPackage.PROGRAM__YEARS:
				return years != null && !years.isEmpty();
			case EducationalProgramModelFixPackage.PROGRAM__NAME:
				return name != null && !name.isEmpty();
			case EducationalProgramModelFixPackage.PROGRAM__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case EducationalProgramModelFixPackage.PROGRAM__STAFF:
				return staff != null && !staff.isEmpty();
			case EducationalProgramModelFixPackage.PROGRAM__COURSES:
				return courses != null && !courses.isEmpty();
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
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
