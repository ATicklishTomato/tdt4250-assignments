/**
 */
package educationalProgramModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.Program#getYears <em>Years</em>}</li>
 *   <li>{@link educationalProgramModel.Program#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModel.Program#getCode <em>Code</em>}</li>
 *   <li>{@link educationalProgramModel.Program#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see educationalProgramModel.EducationalProgramModelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModel.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getProgram_Years()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Year> getYears();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getProgram_Name()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see educationalProgramModel.EducationalProgramModelPackage#getProgram_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link educationalProgramModel.Program#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link educationalProgramModel.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see educationalProgramModel.EducationalProgramModelPackage#getProgram_Staff()
	 * @model containment="true" keys="email" required="true"
	 * @generated
	 */
	EList<Person> getStaff();

} // Program
