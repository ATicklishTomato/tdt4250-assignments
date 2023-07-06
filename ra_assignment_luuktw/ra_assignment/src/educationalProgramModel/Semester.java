/**
 */
package educationalProgramModel;

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
 *   <li>{@link educationalProgramModel.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link educationalProgramModel.Semester#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModel.Semester#getVariantCourses <em>Variant Courses</em>}</li>
 *   <li>{@link educationalProgramModel.Semester#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see educationalProgramModel.EducationalProgramModelPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModel.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getSemester_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getSemester_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variant Courses</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModel.VariantCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Courses</em>' containment reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getSemester_VariantCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariantCourse> getVariantCourses();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getSemester_Credits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getCredits();

} // Semester
