/**
 */
package HotelManagementClassDiagram.util;

import HotelManagementClassDiagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage
 * @generated
 */
public class HotelManagementClassDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HotelManagementClassDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagementClassDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HotelManagementClassDiagramPackage.eINSTANCE;
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
	protected HotelManagementClassDiagramSwitch<Adapter> modelSwitch =
		new HotelManagementClassDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseEmployeeType(EmployeeType object) {
				return createEmployeeTypeAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseCreditcard(Creditcard object) {
				return createCreditcardAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseAddon(Addon object) {
				return createAddonAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseDiscount(Discount object) {
				return createDiscountAdapter();
			}
			@Override
			public Adapter caseBill(Bill object) {
				return createBillAdapter();
			}
			@Override
			public Adapter caseCostable(Costable object) {
				return createCostableAdapter();
			}
			@Override
			public Adapter caseBookingController(BookingController object) {
				return createBookingControllerAdapter();
			}
			@Override
			public Adapter caseManagementController(ManagementController object) {
				return createManagementControllerAdapter();
			}
			@Override
			public Adapter caseMaintenanceController(MaintenanceController object) {
				return createMaintenanceControllerAdapter();
			}
			@Override
			public Adapter caseHotel(Hotel object) {
				return createHotelAdapter();
			}
			@Override
			public Adapter caseBookedRoom(BookedRoom object) {
				return createBookedRoomAdapter();
			}
			@Override
			public Adapter caseInteraction1(Interaction1 object) {
				return createInteraction1Adapter();
			}
			@Override
			public Adapter caseInteraction2(Interaction2 object) {
				return createInteraction2Adapter();
			}
			@Override
			public Adapter caseInteraction3(Interaction3 object) {
				return createInteraction3Adapter();
			}
			@Override
			public Adapter caseInteraction4(Interaction4 object) {
				return createInteraction4Adapter();
			}
			@Override
			public Adapter caseInteraction5(Interaction5 object) {
				return createInteraction5Adapter();
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
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.EmployeeType <em>Employee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.EmployeeType
	 * @generated
	 */
	public Adapter createEmployeeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Creditcard <em>Creditcard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Creditcard
	 * @generated
	 */
	public Adapter createCreditcardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Addon <em>Addon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Addon
	 * @generated
	 */
	public Adapter createAddonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Costable <em>Costable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Costable
	 * @generated
	 */
	public Adapter createCostableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Discount
	 * @generated
	 */
	public Adapter createDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.BookingController
	 * @generated
	 */
	public Adapter createBookingControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.ManagementController <em>Management Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.ManagementController
	 * @generated
	 */
	public Adapter createManagementControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.MaintenanceController <em>Maintenance Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.MaintenanceController
	 * @generated
	 */
	public Adapter createMaintenanceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Hotel
	 * @generated
	 */
	public Adapter createHotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.BookedRoom <em>Booked Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.BookedRoom
	 * @generated
	 */
	public Adapter createBookedRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Interaction1 <em>Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Interaction1
	 * @generated
	 */
	public Adapter createInteraction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Interaction2 <em>Interaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Interaction2
	 * @generated
	 */
	public Adapter createInteraction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Interaction3 <em>Interaction3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Interaction3
	 * @generated
	 */
	public Adapter createInteraction3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Interaction4 <em>Interaction4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Interaction4
	 * @generated
	 */
	public Adapter createInteraction4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HotelManagementClassDiagram.Interaction5 <em>Interaction5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HotelManagementClassDiagram.Interaction5
	 * @generated
	 */
	public Adapter createInteraction5Adapter() {
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

} //HotelManagementClassDiagramAdapterFactory
