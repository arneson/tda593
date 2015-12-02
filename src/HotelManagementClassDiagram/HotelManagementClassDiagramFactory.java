/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage
 * @generated
 */
public interface HotelManagementClassDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelManagementClassDiagramFactory eINSTANCE = HotelManagementClassDiagram.impl.HotelManagementClassDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Employee Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Type</em>'.
	 * @generated
	 */
	EmployeeType createEmployeeType();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Creditcard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creditcard</em>'.
	 * @generated
	 */
	Creditcard createCreditcard();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Addon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addon</em>'.
	 * @generated
	 */
	Addon createAddon();

	/**
	 * Returns a new object of class '<em>Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra</em>'.
	 * @generated
	 */
	Extra createExtra();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill</em>'.
	 * @generated
	 */
	Bill createBill();

	/**
	 * Returns a new object of class '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discount</em>'.
	 * @generated
	 */
	Discount createDiscount();

	/**
	 * Returns a new object of class '<em>Booking Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Controller</em>'.
	 * @generated
	 */
	BookingController createBookingController();

	/**
	 * Returns a new object of class '<em>Management Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Controller</em>'.
	 * @generated
	 */
	ManagementController createManagementController();

	/**
	 * Returns a new object of class '<em>Maintenance Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintenance Controller</em>'.
	 * @generated
	 */
	MaintenanceController createMaintenanceController();

	/**
	 * Returns a new object of class '<em>Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel</em>'.
	 * @generated
	 */
	Hotel createHotel();

	/**
	 * Returns a new object of class '<em>DB Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Interface</em>'.
	 * @generated
	 */
	DBInterface createDBInterface();

	/**
	 * Returns a new object of class '<em>Booked Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booked Room</em>'.
	 * @generated
	 */
	BookedRoom createBookedRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HotelManagementClassDiagramPackage getHotelManagementClassDiagramPackage();

} //HotelManagementClassDiagramFactory
