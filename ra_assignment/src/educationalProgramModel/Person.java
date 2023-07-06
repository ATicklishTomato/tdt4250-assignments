/**
 */
package educationalProgramModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link educationalProgramModel.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link educationalProgramModel.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link educationalProgramModel.Person#getAssignedCourses <em>Assigned Courses</em>}</li>
 * </ul>
 *
 * @see educationalProgramModel.EducationalProgramModelPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getPerson_FirstName()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getFirstName();

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getPerson_LastName()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLastName();

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Courses</b></em>' reference list.
	 * The list contents are of type {@link educationalProgramModel.Course}.
	 * It is bidirectional and its opposite is '{@link educationalProgramModel.Course#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Courses</em>' reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getPerson_AssignedCourses()
	 * @see educationalProgramModel.Course#getStaff
	 * @model opposite="staff"
	 * @generated
	 */
	EList<Course> getAssignedCourses();

} // Person
