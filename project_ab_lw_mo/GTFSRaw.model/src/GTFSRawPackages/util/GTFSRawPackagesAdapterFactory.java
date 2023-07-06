/**
 */
package GTFSRawPackages.util;

import GTFSRawPackages.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see GTFSRawPackages.GTFSRawPackagesPackage
 * @generated
 */
public class GTFSRawPackagesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GTFSRawPackagesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSRawPackagesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GTFSRawPackagesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTFSRawPackagesSwitch<Adapter> modelSwitch =
		new GTFSRawPackagesSwitch<Adapter>() {
			@Override
			public Adapter caseCollectionRaw(CollectionRaw object) {
				return createCollectionRawAdapter();
			}
			@Override
			public Adapter caseAgencyRaw(AgencyRaw object) {
				return createAgencyRawAdapter();
			}
			@Override
			public Adapter caseRouteRaw(RouteRaw object) {
				return createRouteRawAdapter();
			}
			@Override
			public Adapter caseTripRaw(TripRaw object) {
				return createTripRawAdapter();
			}
			@Override
			public Adapter caseStopTimeRaw(StopTimeRaw object) {
				return createStopTimeRawAdapter();
			}
			@Override
			public Adapter caseStopRaw(StopRaw object) {
				return createStopRawAdapter();
			}
			@Override
			public Adapter caseCalenderRaw(CalenderRaw object) {
				return createCalenderRawAdapter();
			}
			@Override
			public Adapter caseOptionalTableRaw(OptionalTableRaw object) {
				return createOptionalTableRawAdapter();
			}
			@Override
			public Adapter caseOptionalColumnRaw(OptionalColumnRaw object) {
				return createOptionalColumnRawAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.CollectionRaw <em>Collection Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.CollectionRaw
	 * @generated
	 */
	public Adapter createCollectionRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.AgencyRaw <em>Agency Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.AgencyRaw
	 * @generated
	 */
	public Adapter createAgencyRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.RouteRaw <em>Route Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.RouteRaw
	 * @generated
	 */
	public Adapter createRouteRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.TripRaw <em>Trip Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.TripRaw
	 * @generated
	 */
	public Adapter createTripRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.StopTimeRaw <em>Stop Time Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.StopTimeRaw
	 * @generated
	 */
	public Adapter createStopTimeRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.StopRaw <em>Stop Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.StopRaw
	 * @generated
	 */
	public Adapter createStopRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.CalenderRaw <em>Calender Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.CalenderRaw
	 * @generated
	 */
	public Adapter createCalenderRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.OptionalTableRaw <em>Optional Table Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.OptionalTableRaw
	 * @generated
	 */
	public Adapter createOptionalTableRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GTFSRawPackages.OptionalColumnRaw <em>Optional Column Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GTFSRawPackages.OptionalColumnRaw
	 * @generated
	 */
	public Adapter createOptionalColumnRawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GTFSRawPackagesAdapterFactory
