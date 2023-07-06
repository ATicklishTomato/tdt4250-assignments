/**
 */
package GTFSRawPackages;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GTFSRawPackages.GTFSRawPackagesPackage
 * @generated
 */
public interface GTFSRawPackagesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GTFSRawPackagesFactory eINSTANCE = GTFSRawPackages.impl.GTFSRawPackagesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collection Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Raw</em>'.
	 * @generated
	 */
	CollectionRaw createCollectionRaw();

	/**
	 * Returns a new object of class '<em>Agency Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agency Raw</em>'.
	 * @generated
	 */
	AgencyRaw createAgencyRaw();

	/**
	 * Returns a new object of class '<em>Route Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Raw</em>'.
	 * @generated
	 */
	RouteRaw createRouteRaw();

	/**
	 * Returns a new object of class '<em>Trip Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trip Raw</em>'.
	 * @generated
	 */
	TripRaw createTripRaw();

	/**
	 * Returns a new object of class '<em>Stop Time Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Time Raw</em>'.
	 * @generated
	 */
	StopTimeRaw createStopTimeRaw();

	/**
	 * Returns a new object of class '<em>Stop Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Raw</em>'.
	 * @generated
	 */
	StopRaw createStopRaw();

	/**
	 * Returns a new object of class '<em>Calender Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calender Raw</em>'.
	 * @generated
	 */
	CalenderRaw createCalenderRaw();

	/**
	 * Returns a new object of class '<em>Optional Table Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Table Raw</em>'.
	 * @generated
	 */
	OptionalTableRaw createOptionalTableRaw();

	/**
	 * Returns a new object of class '<em>Optional Column Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Column Raw</em>'.
	 * @generated
	 */
	OptionalColumnRaw createOptionalColumnRaw();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GTFSRawPackagesPackage getGTFSRawPackagesPackage();

} //GTFSRawPackagesFactory
