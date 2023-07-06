/**
 */
package educationalProgramModelFix;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.Assessment#getType <em>Type</em>}</li>
 *   <li>{@link educationalProgramModelFix.Assessment#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModelFix.Assessment#getDate <em>Date</em>}</li>
 *   <li>{@link educationalProgramModelFix.Assessment#getWeight <em>Weight</em>}</li>
 *   <li>{@link educationalProgramModelFix.Assessment#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link educationalProgramModelFix.assessmentTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see educationalProgramModelFix.assessmentTypes
	 * @see #setType(assessmentTypes)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment_Type()
	 * @model required="true"
	 * @generated
	 */
	assessmentTypes getType();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Assessment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see educationalProgramModelFix.assessmentTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(assessmentTypes value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Assessment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Assessment#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment_Weight()
	 * @model required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Assessment#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see educationalProgramModelFix.EducationalProgramModelFixPackage#getAssessment_Duration()
	 * @model
	 * @generated
	 */
	double getDuration();

	/**
	 * Sets the value of the '{@link educationalProgramModelFix.Assessment#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // Assessment
