/**
 */
package educationalProgramModelFix.impl;

import educationalProgramModelFix.Course;
import educationalProgramModelFix.EducationalProgramModelFixPackage;
import educationalProgramModelFix.Semester;
import educationalProgramModelFix.VariantCourse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.SemesterImpl#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.SemesterImpl#getVariantCourses <em>Variant Courses</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.SemesterImpl#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

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
	 * The cached value of the '{@link #getVariantCourses() <em>Variant Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<VariantCourse> variantCourses;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelFixPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, EducationalProgramModelFixPackage.SEMESTER__COURSES);
		}
		return courses;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelFixPackage.SEMESTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariantCourse> getVariantCourses() {
		if (variantCourses == null) {
			variantCourses = new EObjectContainmentEList<VariantCourse>(VariantCourse.class, this, EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES);
		}
		return variantCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getCredits() {
		Double creditTotal = 0.0;
		for(Course course : this.getCourses()) {
			creditTotal += course.getCredits();
		}
		EList<VariantCourse> variantCourseSlots = this.getVariantCourses();
		for(VariantCourse variant : variantCourseSlots) {
			Double totalVariantSlotCredits = 0.0;
			for(Course vCourse : variant.getCourseChoices()) {
				totalVariantSlotCredits += vCourse.getCredits();
			}
			creditTotal += totalVariantSlotCredits / (double) variant.getCourseChoices().size();
		}
		return creditTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES:
				return ((InternalEList<?>)getVariantCourses()).basicRemove(otherEnd, msgs);
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
			case EducationalProgramModelFixPackage.SEMESTER__COURSES:
				return getCourses();
			case EducationalProgramModelFixPackage.SEMESTER__NAME:
				return getName();
			case EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES:
				return getVariantCourses();
			case EducationalProgramModelFixPackage.SEMESTER__CREDITS:
				return getCredits();
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
			case EducationalProgramModelFixPackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case EducationalProgramModelFixPackage.SEMESTER__NAME:
				setName((String)newValue);
				return;
			case EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES:
				getVariantCourses().clear();
				getVariantCourses().addAll((Collection<? extends VariantCourse>)newValue);
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
			case EducationalProgramModelFixPackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case EducationalProgramModelFixPackage.SEMESTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES:
				getVariantCourses().clear();
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
			case EducationalProgramModelFixPackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case EducationalProgramModelFixPackage.SEMESTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EducationalProgramModelFixPackage.SEMESTER__VARIANT_COURSES:
				return variantCourses != null && !variantCourses.isEmpty();
			case EducationalProgramModelFixPackage.SEMESTER__CREDITS:
				return getCredits() != CREDITS_EDEFAULT;
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

} //SemesterImpl
