/**
 */
package educationalProgramModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see educationalProgramModel.EducationalProgramModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface EducationalProgramModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "educationalProgramModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.ra/model/educationalProgramModel.ra";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "educationalProgramModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EducationalProgramModelPackage eINSTANCE = educationalProgramModel.impl.EducationalProgramModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.ProgramImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__YEARS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CODE = 2;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STAFF = 3;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.YearImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Variant Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__VARIANT_SEMESTERS = 2;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.SemesterImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Variant Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__VARIANT_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.CourseImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STAFF = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Study Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Responsible Unit</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__RESPONSIBLE_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Assessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ASSESSMENTS = 7;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.PersonImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Assigned Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ASSIGNED_COURSES = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.AssessmentImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DURATION = 4;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.VariantSemesterImpl <em>Variant Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.VariantSemesterImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getVariantSemester()
	 * @generated
	 */
	int VARIANT_SEMESTER = 6;

	/**
	 * The feature id for the '<em><b>Semester Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_SEMESTER__SEMESTER_CHOICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_SEMESTER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variant Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variant Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.impl.VariantCourseImpl <em>Variant Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.impl.VariantCourseImpl
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getVariantCourse()
	 * @generated
	 */
	int VARIANT_COURSE = 7;

	/**
	 * The feature id for the '<em><b>Course Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COURSE__COURSE_CHOICES = 0;

	/**
	 * The number of structural features of the '<em>Variant Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COURSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variant Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link educationalProgramModel.assessmentTypes <em>assessment Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see educationalProgramModel.assessmentTypes
	 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getassessmentTypes()
	 * @generated
	 */
	int ASSESSMENT_TYPES = 8;


	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see educationalProgramModel.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Program#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Years</em>'.
	 * @see educationalProgramModel.Program#getYears()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Years();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see educationalProgramModel.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Program#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see educationalProgramModel.Program#getCode()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Program#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see educationalProgramModel.Program#getStaff()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Staff();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see educationalProgramModel.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see educationalProgramModel.Year#getSemesters()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Year#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see educationalProgramModel.Year#getNumber()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Year#getVariantSemesters <em>Variant Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant Semesters</em>'.
	 * @see educationalProgramModel.Year#getVariantSemesters()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_VariantSemesters();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see educationalProgramModel.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see educationalProgramModel.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Semester#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see educationalProgramModel.Semester#getName()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Semester#getVariantCourses <em>Variant Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant Courses</em>'.
	 * @see educationalProgramModel.Semester#getVariantCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_VariantCourses();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Semester#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see educationalProgramModel.Semester#getCredits()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Credits();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see educationalProgramModel.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see educationalProgramModel.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see educationalProgramModel.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the reference list '{@link educationalProgramModel.Course#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see educationalProgramModel.Course#getStaff()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Staff();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see educationalProgramModel.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Course#getStudyLevel <em>Study Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Level</em>'.
	 * @see educationalProgramModel.Course#getStudyLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_StudyLevel();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Course#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see educationalProgramModel.Course#getLanguage()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Language();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Course#getResponsibleUnit <em>Responsible Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Responsible Unit</em>'.
	 * @see educationalProgramModel.Course#getResponsibleUnit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_ResponsibleUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.Course#getAssessments <em>Assessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessments</em>'.
	 * @see educationalProgramModel.Course#getAssessments()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Assessments();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see educationalProgramModel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>First Name</em>'.
	 * @see educationalProgramModel.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute list '{@link educationalProgramModel.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Last Name</em>'.
	 * @see educationalProgramModel.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see educationalProgramModel.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the reference list '{@link educationalProgramModel.Person#getAssignedCourses <em>Assigned Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned Courses</em>'.
	 * @see educationalProgramModel.Person#getAssignedCourses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_AssignedCourses();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see educationalProgramModel.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Assessment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see educationalProgramModel.Assessment#getType()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Type();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Assessment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see educationalProgramModel.Assessment#getName()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Name();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Assessment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see educationalProgramModel.Assessment#getDate()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Date();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Assessment#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see educationalProgramModel.Assessment#getWeight()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Weight();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.Assessment#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see educationalProgramModel.Assessment#getDuration()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Duration();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.VariantSemester <em>Variant Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Semester</em>'.
	 * @see educationalProgramModel.VariantSemester
	 * @generated
	 */
	EClass getVariantSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.VariantSemester#getSemesterChoices <em>Semester Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester Choices</em>'.
	 * @see educationalProgramModel.VariantSemester#getSemesterChoices()
	 * @see #getVariantSemester()
	 * @generated
	 */
	EReference getVariantSemester_SemesterChoices();

	/**
	 * Returns the meta object for the attribute '{@link educationalProgramModel.VariantSemester#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see educationalProgramModel.VariantSemester#getName()
	 * @see #getVariantSemester()
	 * @generated
	 */
	EAttribute getVariantSemester_Name();

	/**
	 * Returns the meta object for class '{@link educationalProgramModel.VariantCourse <em>Variant Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Course</em>'.
	 * @see educationalProgramModel.VariantCourse
	 * @generated
	 */
	EClass getVariantCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link educationalProgramModel.VariantCourse#getCourseChoices <em>Course Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Choices</em>'.
	 * @see educationalProgramModel.VariantCourse#getCourseChoices()
	 * @see #getVariantCourse()
	 * @generated
	 */
	EReference getVariantCourse_CourseChoices();

	/**
	 * Returns the meta object for enum '{@link educationalProgramModel.assessmentTypes <em>assessment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>assessment Types</em>'.
	 * @see educationalProgramModel.assessmentTypes
	 * @generated
	 */
	EEnum getassessmentTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EducationalProgramModelFactory getEducationalProgramModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.ProgramImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__YEARS = eINSTANCE.getProgram_Years();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CODE = eINSTANCE.getProgram_Code();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STAFF = eINSTANCE.getProgram_Staff();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.YearImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SEMESTERS = eINSTANCE.getYear_Semesters();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__NUMBER = eINSTANCE.getYear_Number();

		/**
		 * The meta object literal for the '<em><b>Variant Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__VARIANT_SEMESTERS = eINSTANCE.getYear_VariantSemesters();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.SemesterImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NAME = eINSTANCE.getSemester_Name();

		/**
		 * The meta object literal for the '<em><b>Variant Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__VARIANT_COURSES = eINSTANCE.getSemester_VariantCourses();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__CREDITS = eINSTANCE.getSemester_Credits();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.CourseImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STAFF = eINSTANCE.getCourse_Staff();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Study Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDY_LEVEL = eINSTANCE.getCourse_StudyLevel();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LANGUAGE = eINSTANCE.getCourse_Language();

		/**
		 * The meta object literal for the '<em><b>Responsible Unit</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__RESPONSIBLE_UNIT = eINSTANCE.getCourse_ResponsibleUnit();

		/**
		 * The meta object literal for the '<em><b>Assessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ASSESSMENTS = eINSTANCE.getCourse_Assessments();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.PersonImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Assigned Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ASSIGNED_COURSES = eINSTANCE.getPerson_AssignedCourses();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.AssessmentImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__TYPE = eINSTANCE.getAssessment_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__NAME = eINSTANCE.getAssessment_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__DATE = eINSTANCE.getAssessment_Date();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__WEIGHT = eINSTANCE.getAssessment_Weight();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__DURATION = eINSTANCE.getAssessment_Duration();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.VariantSemesterImpl <em>Variant Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.VariantSemesterImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getVariantSemester()
		 * @generated
		 */
		EClass VARIANT_SEMESTER = eINSTANCE.getVariantSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_SEMESTER__SEMESTER_CHOICES = eINSTANCE.getVariantSemester_SemesterChoices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_SEMESTER__NAME = eINSTANCE.getVariantSemester_Name();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.impl.VariantCourseImpl <em>Variant Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.impl.VariantCourseImpl
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getVariantCourse()
		 * @generated
		 */
		EClass VARIANT_COURSE = eINSTANCE.getVariantCourse();

		/**
		 * The meta object literal for the '<em><b>Course Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_COURSE__COURSE_CHOICES = eINSTANCE.getVariantCourse_CourseChoices();

		/**
		 * The meta object literal for the '{@link educationalProgramModel.assessmentTypes <em>assessment Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see educationalProgramModel.assessmentTypes
		 * @see educationalProgramModel.impl.EducationalProgramModelPackageImpl#getassessmentTypes()
		 * @generated
		 */
		EEnum ASSESSMENT_TYPES = eINSTANCE.getassessmentTypes();

	}

} //EducationalProgramModelPackage
