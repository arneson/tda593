/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.*;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Iterator;

import main.FakeDB;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fake DB Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FakeDBContextImpl extends MinimalEObjectImpl.Container implements FakeDBContext {

	private static FakeDBContext fdbc = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private FakeDBContextImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public static FakeDBContext getInstance() {
		if (fdbc == null) {
			fdbc = new FakeDBContextImpl();
		}
		return fdbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.FAKE_DB_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> _getAllRooms() {
		return new BasicEList<>(FakeDB.rooms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getAvaliableRooms() {
		EList<Room> freeRooms = new BasicEList<>();
		for (Room room : FakeDB.rooms) {
			if (!room.isBooked()) {
				freeRooms.add(room);
			}
		}
		return freeRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getRoom(int roomNumber) {
		for (Room r : FakeDB.rooms) {
			if (r.getRoomNumber() == roomNumber) {
				return r;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> getAllRoomTypes() {
		EList<RoomType> types = new BasicEList<>();
		for (Room r : FakeDB.rooms) {
			for (RoomType rt : r.getTypes()) {
				if (!types.contains(rt)) {
					types.add(rt);
				}
			}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getAvaliableRoomTypes() {
		EList<RoomType> types = new BasicEList<>();
		for (Room r : getInstance().getAvaliableRooms()) {
			for (RoomType rt : r.getTypes()) {
				if (!types.contains(rt)) {
					types.add(rt);
				}
			}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Addon> getAllAddons() {
		return new BasicEList<>(FakeDB.addons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Addon getAddon(String addonName) {
		for (Addon a : FakeDB.addons) {
			if (a.getName() == addonName) {
				return a;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Discount> getAllDiscounts() {
		return new BasicEList<>(FakeDB.discounts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Discount getDiscount(String discountName) {
		for (Discount d : FakeDB.discounts) {
			// TODO no getName?
			/*if (d.getName().contains(discountName)) {
				return d;
			}*/
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getAllBookings() {
		return new BasicEList<>(FakeDB.bookings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getBookings(Date fromDate, Date toDate) {
		EList<Booking> bookings = new BasicEList<>();
		for (Booking b : FakeDB.bookings) {
			if(b.getEndDate().before(toDate) && b.getStartDate().after(fromDate)) {
				bookings.add(b);
			}
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getPastBookings() {
		EList<Booking> pastBookings = new BasicEList<>();
		Date today = new Date();
		for (Booking b : FakeDB.bookings) {
			if (b.getEndDate().before(today)) {
				pastBookings.add(b);
			}
		}
		return pastBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getFutureBookings() {
		EList<Booking> futureBooking = new BasicEList<>();
		Date today = new Date();
		for (Booking b : FakeDB.bookings) {
			if(b.getStartDate().after(today)) {
				futureBooking.add(b);
			}
		}
		return futureBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> getCurrentBookings() {
		EList<Booking> currentBookings = new BasicEList<>();
		Date today = new Date();
		for (Booking b : FakeDB.bookings) {
			if(b.getStartDate().before(today) && b.getEndDate().after(today)) {
				currentBookings.add(b);
			}
		}
		return currentBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Booking> findBookings(String customerName) {
		EList<Booking> bookings = new BasicEList<>();
		customerName = customerName.toLowerCase();
		for (Booking b : FakeDB.bookings) {
			if (b.getCustomer().getName().toLowerCase().contains(customerName)) {
				bookings.add(b);
			}
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> getAllBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> getBookedRooms(Date fromDate, Date endDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> getPastBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> getFutureBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> getCurrentBookedRooms() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookedRoom> findBookedRooms(String customerName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Customer> getAllCustomers() {
		return new BasicEList<>(FakeDB.customers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Customer getCustomer(String customerSSNumber) {
		for (Customer c : FakeDB.customers) {
			if (c.getSSNumber().equals(customerSSNumber)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Customer> findCustomers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Employee> getAllEmployees() {
		return new BasicEList<>(FakeDB.employees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Employee getEmployee(String employeeSSNumber) {
		for (Employee e : FakeDB.employees) {
			if(e.getSSNumber().equals(employeeSSNumber)) {
				return e;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Employee> getAllCleaners() {
		EList<Employee> cleaners = new BasicEList<>();
		for (Employee e : FakeDB.employees) {
			if (e.getEmployeeType().getType() == EType.CLEANER) {
				cleaners.add(e);
			}
		}
		return cleaners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Employee> getAllManagers() {
		EList<Employee> cleaners = new BasicEList<>();
		for (Employee e : FakeDB.employees) {
			if (e.getEmployeeType().getType() == EType.MANAGER) {
				cleaners.add(e);
			}
		}
		return cleaners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getAllReceptionists() {
		EList<Employee> cleaners = new BasicEList<>();
		for (Employee e : FakeDB.employees) {
			if (e.getEmployeeType().getType() == EType.RECEPTIONIST) {
				cleaners.add(e);
			}
		}
		return cleaners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_ROOMS:
				return _getAllRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_AVALIABLE_ROOMS:
				return getAvaliableRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_AVALIABLE_ROOM_TYPES:
				return getAvaliableRoomTypes();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_ADDONS:
				return getAllAddons();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ADDON__STRING:
				return getAddon((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_DISCOUNTS:
				return getAllDiscounts();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_DISCOUNT__STRING:
				return getDiscount((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_BOOKINGS:
				return getAllBookings();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_BOOKINGS__DATE_DATE:
				return getBookings((Date)arguments.get(0), (Date)arguments.get(1));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_PAST_BOOKINGS:
				return getPastBookings();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_FUTURE_BOOKINGS:
				return getFutureBookings();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_CURRENT_BOOKINGS:
				return getCurrentBookings();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_BOOKING:
				return getBooking();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___FIND_BOOKINGS__STRING:
				return findBookings((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_BOOKED_ROOMS:
				return getAllBookedRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_BOOKED_ROOMS__DATE_DATE:
				return getBookedRooms((Date)arguments.get(0), (Date)arguments.get(1));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_PAST_BOOKED_ROOMS:
				return getPastBookedRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_FUTURE_BOOKED_ROOMS:
				return getFutureBookedRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_CURRENT_BOOKED_ROOMS:
				return getCurrentBookedRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___FIND_BOOKED_ROOMS__STRING:
				return findBookedRooms((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_CUSTOMERS:
				return getAllCustomers();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_CUSTOMER__STRING:
				return getCustomer((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___FIND_CUSTOMERS:
				return findCustomers();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_EMPLOYEES:
				return getAllEmployees();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_EMPLOYEE__STRING:
				return getEmployee((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_CLEANERS:
				return getAllCleaners();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_MANAGERS:
				return getAllManagers();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_RECEPTIONISTS:
				return getAllReceptionists();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FakeDBContextImpl
