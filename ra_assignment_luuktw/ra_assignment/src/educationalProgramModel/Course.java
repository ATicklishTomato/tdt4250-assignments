/**
 */
package educationalProgramModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.Course#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getCode <em>Code</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getStaff <em>Staff</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getStudyLevel <em>Study Level</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getLanguage <em>Language</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getResponsibleUnit <em>Responsible Unit</em>}</li>
 *   <li>{@link educationalProgramModel.Course#getAssessments <em>Assessments</em>}</li>
 * </ul>
 *
 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='assessmentWeightsSumNotGreaterThanOne assessmentWeightsBetweenZeroAndOne'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 assessmentWeightsSumNotGreaterThanOne='(self.assessments-&gt;collect(assessment | assessment.weight))-&gt;sum() &lt;= 1.0001' assessmentWeightsBetweenZeroAndOne='(self.assessments-&gt;collect(assessment | assessment.weight))-&gt;forAll(weight | weight &gt;= 0.0 and weight &lt;= 1.0001)'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link educationalProgramModel.Person}.
	 * It is bidirectional and its opposite is '{@link educationalProgramModel.Person#getAssignedCourses <em>Assigned Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Staff()
	 * @see educationalProgramModel.Person#getAssignedCourses
	 * @model opposite="assignedCourses"
	 * @generated
	 */
	EList<Person> getStaff();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Study Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Level</em>' attribute.
	 * @see #setStudyLevel(String)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_StudyLevel()
	 * @model
	 * @generated
	 */
	String getStudyLevel();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Course#getStudyLevel <em>Study Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Level</em>' attribute.
	 * @see #getStudyLevel()
	 * @generated
	 */
	void setStudyLevel(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Language()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Responsible Unit</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Unit</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_ResponsibleUnit()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getResponsibleUnit();

	/**
	 * Returns the value of the '<em><b>Assessments</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModel.Assessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessments</em>' containment reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getCourse_Assessments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Assessment> getAssessments();

} // Course
