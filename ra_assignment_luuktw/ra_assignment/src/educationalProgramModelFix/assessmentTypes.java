/**
 */
package educationalProgramModelFix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>assessment Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getassessmentTypes()
 * @model
 * @generated
 */
public enum assessmentTypes implements Enumerator {
	/**
	 * The '<em><b>Written Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	WRITTEN_EXAM(0, "writtenExam", "Written Exam"),

	/**
	 * The '<em><b>Folder Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FOLDER_ASSESSMENT(1, "folderAssessment", "Folder Assessment"),

	/**
	 * The '<em><b>Assignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(2, "assignment", "Assignment"),

	/**
	 * The '<em><b>Project</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT(3, "project", "Project"),

	/**
	 * The '<em><b>Home Exam</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_EXAM_VALUE
	 * @generated
	 * @ordered
	 */
	HOME_EXAM(4, "homeExam", "Home Exam"),

	/**
	 * The '<em><b>Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	REPORT(5, "report", "Report");

	/**
	 * The '<em><b>Written Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_EXAM
	 * @model name="writtenExam" literal="Written Exam"
	 * @generated
	 * @ordered
	 */
	public static final int WRITTEN_EXAM_VALUE = 0;

	/**
	 * The '<em><b>Folder Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER_ASSESSMENT
	 * @model name="folderAssessment" literal="Folder Assessment"
	 * @generated
	 * @ordered
	 */
	public static final int FOLDER_ASSESSMENT_VALUE = 1;

	/**
	 * The '<em><b>Assignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT
	 * @model name="assignment" literal="Assignment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 2;

	/**
	 * The '<em><b>Project</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT
	 * @model name="project" literal="Project"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_VALUE = 3;

	/**
	 * The '<em><b>Home Exam</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_EXAM
	 * @model name="homeExam" literal="Home Exam"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_EXAM_VALUE = 4;

	/**
	 * The '<em><b>Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPORT
	 * @model name="report" literal="Report"
	 * @generated
	 * @ordered
	 */
	public static final int REPORT_VALUE = 5;

	/**
	 * An array of all the '<em><b>assessment Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final assessmentTypes[] VALUES_ARRAY =
		new assessmentTypes[] {
			WRITTEN_EXAM,
			FOLDER_ASSESSMENT,
			ASSIGNMENT,
			PROJECT,
			HOME_EXAM,
			REPORT,
		};

	/**
	 * A public read-only list of all the '<em><b>assessment Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<assessmentTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>assessment Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static assessmentTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			assessmentTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>assessment Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static assessmentTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			assessmentTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>assessment Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static assessmentTypes get(int value) {
		switch (value) {
			case WRITTEN_EXAM_VALUE: return WRITTEN_EXAM;
			case FOLDER_ASSESSMENT_VALUE: return FOLDER_ASSESSMENT;
			case ASSIGNMENT_VALUE: return ASSIGNMENT;
			case PROJECT_VALUE: return PROJECT;
			case HOME_EXAM_VALUE: return HOME_EXAM;
			case REPORT_VALUE: return REPORT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private assessmentTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //assessmentTypes
