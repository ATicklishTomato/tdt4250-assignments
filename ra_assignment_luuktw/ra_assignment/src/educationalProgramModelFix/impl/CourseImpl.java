/**
 */
package educationalProgramModelFix.impl;

import educationalProgramModelFix.Assessment;
import educationalProgramModelFix.Course;
import educationalProgramModelFix.EducationalProgramModelFixPackage;
import educationalProgramModelFix.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getStudyLevel <em>Study Level</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getResponsibleUnit <em>Responsible Unit</em>}</li>
 *   <li>{@link educationalProgramModelFix.impl.CourseImpl#getAssessments <em>Assessments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> staff;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudyLevel() <em>Study Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyLevel() <em>Study Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyLevel()
	 * @generated
	 * @ordered
	 */
	protected String studyLevel = STUDY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The cached value of the '{@link #getResponsibleUnit() <em>Responsible Unit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<String> responsibleUnit;

	/**
	 * The cached value of the '{@link #getAssessments() <em>Assessments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> assessments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelFixPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelFixPackage.COURSE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelFixPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getStaff() {
		if (staff == null) {
			staff = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, EducationalProgramModelFixPackage.COURSE__STAFF, EducationalProgramModelFixPackage.PERSON__ASSIGNED_COURSES);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelFixPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudyLevel() {
		return studyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyLevel(String newStudyLevel) {
		String oldStudyLevel = studyLevel;
		studyLevel = newStudyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelFixPackage.COURSE__STUDY_LEVEL, oldStudyLevel, studyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelFixPackage.COURSE__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getResponsibleUnit() {
		if (responsibleUnit == null) {
			responsibleUnit = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelFixPackage.COURSE__RESPONSIBLE_UNIT);
		}
		return responsibleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assessment> getAssessments() {
		if (assessments == null) {
			assessments = new EObjectContainmentEList<Assessment>(Assessment.class, this, EducationalProgramModelFixPackage.COURSE__ASSESSMENTS);
		}
		return assessments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStaff()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
			case EducationalProgramModelFixPackage.COURSE__ASSESSMENTS:
				return ((InternalEList<?>)getAssessments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__NAME:
				return getName();
			case EducationalProgramModelFixPackage.COURSE__CODE:
				return getCode();
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				return getStaff();
			case EducationalProgramModelFixPackage.COURSE__CREDITS:
				return getCredits();
			case EducationalProgramModelFixPackage.COURSE__STUDY_LEVEL:
				return getStudyLevel();
			case EducationalProgramModelFixPackage.COURSE__LANGUAGE:
				return getLanguage();
			case EducationalProgramModelFixPackage.COURSE__RESPONSIBLE_UNIT:
				return getResponsibleUnit();
			case EducationalProgramModelFixPackage.COURSE__ASSESSMENTS:
				return getAssessments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Person>)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__STUDY_LEVEL:
				setStudyLevel((String)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__RESPONSIBLE_UNIT:
				getResponsibleUnit().clear();
				getResponsibleUnit().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelFixPackage.COURSE__ASSESSMENTS:
				getAssessments().clear();
				getAssessments().addAll((Collection<? extends Assessment>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__NAME:
				getName().clear();
				return;
			case EducationalProgramModelFixPackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				getStaff().clear();
				return;
			case EducationalProgramModelFixPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case EducationalProgramModelFixPackage.COURSE__STUDY_LEVEL:
				setStudyLevel(STUDY_LEVEL_EDEFAULT);
				return;
			case EducationalProgramModelFixPackage.COURSE__LANGUAGE:
				getLanguage().clear();
				return;
			case EducationalProgramModelFixPackage.COURSE__RESPONSIBLE_UNIT:
				getResponsibleUnit().clear();
				return;
			case EducationalProgramModelFixPackage.COURSE__ASSESSMENTS:
				getAssessments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EducationalProgramModelFixPackage.COURSE__NAME:
				return name != null && !name.isEmpty();
			case EducationalProgramModelFixPackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case EducationalProgramModelFixPackage.COURSE__STAFF:
				return staff != null && !staff.isEmpty();
			case EducationalProgramModelFixPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case EducationalProgramModelFixPackage.COURSE__STUDY_LEVEL:
				return STUDY_LEVEL_EDEFAULT == null ? studyLevel != null : !STUDY_LEVEL_EDEFAULT.equals(studyLevel);
			case EducationalProgramModelFixPackage.COURSE__LANGUAGE:
				return language != null && !language.isEmpty();
			case EducationalProgramModelFixPackage.COURSE__RESPONSIBLE_UNIT:
				return responsibleUnit != null && !responsibleUnit.isEmpty();
			case EducationalProgramModelFixPackage.COURSE__ASSESSMENTS:
				return assessments != null && !assessments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", credits: ");
		result.append(credits);
		result.append(", studyLevel: ");
		result.append(studyLevel);
		result.append(", language: ");
		result.append(language);
		result.append(", responsibleUnit: ");
		result.append(responsibleUnit);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
