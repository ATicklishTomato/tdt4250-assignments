/**
 */
package GTFSRawPackages.util;

import GTFSRawPackages.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GTFSRawPackages.GTFSRawPackagesPackage
 * @generated
 */
public class GTFSRawPackagesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GTFSRawPackagesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRawPackagesSwitch() {
		if (modelPackage == null) {
			modelPackage = GTFSRawPackagesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GTFSRawPackagesPackage.COLLECTION_RAW: {
				CollectionRaw collectionRaw = (CollectionRaw)theEObject;
				T result = caseCollectionRaw(collectionRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.AGENCY_RAW: {
				AgencyRaw agencyRaw = (AgencyRaw)theEObject;
				T result = caseAgencyRaw(agencyRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.ROUTE_RAW: {
				RouteRaw routeRaw = (RouteRaw)theEObject;
				T result = caseRouteRaw(routeRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.TRIP_RAW: {
				TripRaw tripRaw = (TripRaw)theEObject;
				T result = caseTripRaw(tripRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.STOP_TIME_RAW: {
				StopTimeRaw stopTimeRaw = (StopTimeRaw)theEObject;
				T result = caseStopTimeRaw(stopTimeRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.STOP_RAW: {
				StopRaw stopRaw = (StopRaw)theEObject;
				T result = caseStopRaw(stopRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.CALENDER_RAW: {
				CalenderRaw calenderRaw = (CalenderRaw)theEObject;
				T result = caseCalenderRaw(calenderRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.OPTIONAL_TABLE_RAW: {
				OptionalTableRaw optionalTableRaw = (OptionalTableRaw)theEObject;
				T result = caseOptionalTableRaw(optionalTableRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GTFSRawPackagesPackage.OPTIONAL_COLUMN_RAW: {
				OptionalColumnRaw optionalColumnRaw = (OptionalColumnRaw)theEObject;
				T result = caseOptionalColumnRaw(optionalColumnRaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionRaw(CollectionRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agency Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agency Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgencyRaw(AgencyRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteRaw(RouteRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trip Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trip Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripRaw(TripRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Time Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Time Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopTimeRaw(StopTimeRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopRaw(StopRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calender Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calender Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalenderRaw(CalenderRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Table Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Table Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalTableRaw(OptionalTableRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Column Raw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Column Raw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalColumnRaw(OptionalColumnRaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GTFSRawPackagesSwitch
