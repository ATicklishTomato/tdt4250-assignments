/**
 */
package educationalProgramModelFix.impl;

import educationalProgramModelFix.Course;
import educationalProgramModelFix.EducationalProgramModelFixPackage;
import educationalProgramModelFix.VariantCourse;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.impl.VariantCourseImpl#getCourseChoices <em>Course Choices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantCourseImpl extends MinimalEObjectImpl.Container implements VariantCourse {
	/**
	 * The cached value of the '{@link #getCourseChoices() <em>Course Choices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseChoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courseChoices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelFixPackage.Literals.VARIANT_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourseChoices() {
		if (courseChoices == null) {
			courseChoices = new EObjectResolvingEList<Course>(Course.class, this, EducationalProgramModelFixPackage.VARIANT_COURSE__COURSE_CHOICES);
		}
		return courseChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.VARIANT_COURSE__COURSE_CHOICES:
				return getCourseChoices();
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
			case EducationalProgramModelFixPackage.VARIANT_COURSE__COURSE_CHOICES:
				getCourseChoices().clear();
				getCourseChoices().addAll((Collection<? extends Course>)newValue);
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
			case EducationalProgramModelFixPackage.VARIANT_COURSE__COURSE_CHOICES:
				getCourseChoices().clear();
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
			case EducationalProgramModelFixPackage.VARIANT_COURSE__COURSE_CHOICES:
				return courseChoices != null && !courseChoices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariantCourseImpl
