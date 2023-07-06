/**
 */
package educationalProgramModelFix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link educationalProgramModelFix.Semester#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModelFix.Semester#getVariantCourses <em>Variant Courses</em>}</li>
 *   <li>{@link educationalProgramModelFix.Semester#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link educationalProgramModelFix.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getSemester_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variant Courses</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModelFix.VariantCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Courses</em>' containment reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getSemester_VariantCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariantCourse> getVariantCourses();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getSemester_Credits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getCredits();

} // Semester
