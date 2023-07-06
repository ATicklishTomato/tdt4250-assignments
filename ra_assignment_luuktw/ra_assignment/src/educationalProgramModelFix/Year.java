/**
 */
package educationalProgramModelFix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link educationalProgramModelFix.Year#getNumber <em>Number</em>}</li>
 *   <li>{@link educationalProgramModelFix.Year#getVariantSemesters <em>Variant Semesters</em>}</li>
 * </ul>
 *
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getYear()
 * @model
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModelFix.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getYear_Semesters()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getYear_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Year#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Variant Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModelFix.VariantSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Semesters</em>' containment reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getYear_VariantSemesters()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<VariantSemester> getVariantSemesters();

} // Year
