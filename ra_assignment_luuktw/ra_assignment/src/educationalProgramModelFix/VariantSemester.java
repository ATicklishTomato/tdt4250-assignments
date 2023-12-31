/**
 */
package educationalProgramModelFix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.VariantSemester#getSemesterChoices <em>Semester Choices</em>}</li>
 *   <li>{@link educationalProgramModelFix.VariantSemester#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getVariantSemester()
 * @model
 * @generated
 */
public interface VariantSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Choices</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModelFix.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Choices</em>' containment reference list.
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getVariantSemester_SemesterChoices()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Semester> getSemesterChoices();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getVariantSemester_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.VariantSemester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariantSemester
