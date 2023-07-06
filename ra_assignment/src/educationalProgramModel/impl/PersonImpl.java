/**
 */
package educationalProgramModel.impl;

import educationalProgramModel.Course;
import educationalProgramModel.EducationalProgramModelPackage;
import educationalProgramModel.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link educationalProgramModel.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link educationalProgramModel.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link educationalProgramModel.impl.PersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link educationalProgramModel.impl.PersonImpl#getAssignedCourses <em>Assigned Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> firstName;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lastName;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedCourses() <em>Assigned Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> assignedCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationalProgramModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFirstName() {
		if (firstName == null) {
			firstName = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelPackage.PERSON__FIRST_NAME);
		}
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLastName() {
		if (lastName == null) {
			lastName = new EDataTypeUniqueEList<String>(String.class, this, EducationalProgramModelPackage.PERSON__LAST_NAME);
		}
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationalProgramModelPackage.PERSON__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getAssignedCourses() {
		if (assignedCourses == null) {
			assignedCourses = new EObjectWithInverseResolvingEList.ManyInverse<Course>(Course.class, this, EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES, EducationalProgramModelPackage.COURSE__STAFF);
		}
		return assignedCourses;
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
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedCourses()).basicAdd(otherEnd, msgs);
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
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				return ((InternalEList<?>)getAssignedCourses()).basicRemove(otherEnd, msgs);
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
			case EducationalProgramModelPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case EducationalProgramModelPackage.PERSON__LAST_NAME:
				return getLastName();
			case EducationalProgramModelPackage.PERSON__EMAIL:
				return getEmail();
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				return getAssignedCourses();
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
			case EducationalProgramModelPackage.PERSON__FIRST_NAME:
				getFirstName().clear();
				getFirstName().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelPackage.PERSON__LAST_NAME:
				getLastName().clear();
				getLastName().addAll((Collection<? extends String>)newValue);
				return;
			case EducationalProgramModelPackage.PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				getAssignedCourses().clear();
				getAssignedCourses().addAll((Collection<? extends Course>)newValue);
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
			case EducationalProgramModelPackage.PERSON__FIRST_NAME:
				getFirstName().clear();
				return;
			case EducationalProgramModelPackage.PERSON__LAST_NAME:
				getLastName().clear();
				return;
			case EducationalProgramModelPackage.PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				getAssignedCourses().clear();
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
			case EducationalProgramModelPackage.PERSON__FIRST_NAME:
				return firstName != null && !firstName.isEmpty();
			case EducationalProgramModelPackage.PERSON__LAST_NAME:
				return lastName != null && !lastName.isEmpty();
			case EducationalProgramModelPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EducationalProgramModelPackage.PERSON__ASSIGNED_COURSES:
				return assignedCourses != null && !assignedCourses.isEmpty();
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
