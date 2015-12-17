/**
 */
package HotelManagementClassDiagram;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getDBInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DBInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' getAllRooms'"
	 * @generated
	 */
	EList<Room> _getAllRooms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<RoomType> getAllRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<RoomType> getAvaliableRoomTypes(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Addon> getAllAddons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" addonNameDataType="org.eclipse.uml2.types.String" addonNameRequired="true" addonNameOrdered="false"
	 * @generated
	 */
	Addon getAddon(String addonName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Discount> getAllDiscounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" discountNameDataType="org.eclipse.uml2.types.String" discountNameRequired="true" discountNameOrdered="false"
	 * @generated
	 */
	Discount getDiscount(String discountName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getAllBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookings(Date fromDate, Date toDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getPastBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getFutureBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Booking> getCurrentBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerNameDataType="org.eclipse.uml2.types.String" customerNameRequired="true" customerNameOrdered="false"
	 * @generated
	 */
	EList<Booking> findBookings(String customerName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Customer> getAllCustomers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerSSNumberDataType="org.eclipse.uml2.types.String" customerSSNumberRequired="true" customerSSNumberOrdered="false"
	 * @generated
	 */
	Customer getCustomer(String customerSSNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" partOfCustomerNameDataType="org.eclipse.uml2.types.String" partOfCustomerNameRequired="true" partOfCustomerNameOrdered="false"
	 * @generated
	 */
	EList<Customer> findCustomers(String partOfCustomerName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Employee> getAllEmployees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" employeeSSNumberDataType="org.eclipse.uml2.types.String" employeeSSNumberRequired="true" employeeSSNumberOrdered="false"
	 * @generated
	 */
	Employee getEmployee(String employeeSSNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Employee> getAllCleaners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Employee> getAllManagers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<Employee> getAllReceptionists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void updateOrAddRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void updateOrAddCustomer(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void updateOrAddBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false"
	 * @generated
	 */
	void updateOrAddDiscount(Discount discount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addonRequired="true" addonOrdered="false"
	 * @generated
	 */
	void updateOrAddAddon(Addon addon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model employeeRequired="true" employeeOrdered="false"
	 * @generated
	 */
	void updateOrAddEmployee(Employee employee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void updateOrAddRoomType(RoomType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void updateOrAddEmployeeType(EmployeeType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extraRequired="true" extraOrdered="false"
	 * @generated
	 */
	void updateOrAddExtra(Extra extra);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(RoomType type, Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	EList<Room> getRooms(RoomType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Booking getBooking(int bookingID);

} // DBInterface
