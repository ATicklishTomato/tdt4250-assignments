/**
 */
package educationalProgramModelFix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.VariantCourse#getCourseChoices <em>Course Choices</em>}</li>
 * </ul>
 *
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getVariantCourse()
 * @model
 * @generated
 */
public interface VariantCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Choices</b></em>' reference list.
	 * The list contents are of type {@link educationalProgramModelFix.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Choices</em>' reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getVariantCourse_CourseChoices()
	 * @model lower="2"
	 * @generated
	 */
	EList<Course> getCourseChoices();

} // VariantCourse
