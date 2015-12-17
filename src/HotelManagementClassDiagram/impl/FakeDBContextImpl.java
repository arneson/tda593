/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.Extra;
import HotelManagementClassDiagram.FakeDBContext;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;
import HotelManagementClassDiagram.*;
import main.FakeDB;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
			RoomType rt = r.getType();
			if (!types.contains(rt)) {
				types.add(rt);
			}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
     * Returns types _between_ the from and to dates. Not inclusive!
	 */
	public EList<RoomType> getAvaliableRoomTypes(Date from, Date to) {
        from = addDays(from, -1);
        to = addDays(to, 1);
        EList<RoomType> types = new BasicEList<>();
		for (Booking booking : FakeDB.bookings)
        {
            if (booking.getStartDate().after(from) && booking.getEndDate().before(to))
            {
                for (Room room : booking.getBookedRooms()) {
                    RoomType type = room.getType();
                    if (!types.contains(type))
                        types.add(type);
                }
            }
        }
		return types;
	}

    private Date addDays(Date date, int days)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
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
			if (a.getName().contains((addonName)))
				return a;
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
			if (d.getName().contains(discountName))
				return d;
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
        fromDate = addDays(fromDate, -1);
        toDate = addDays(toDate, 1);
		EList<Booking> bookings = new BasicEList<>();
		for (Booking b : FakeDB.bookings) {
			if(b.getEndDate().before(toDate) && b.getStartDate().after(fromDate))
				bookings.add(b);
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
	 * @generated NOT
	 */
	public EList<Booking> findBookings(String customerName) {
		EList<Booking> bookings = new BasicEList<>();
		customerName = customerName.toLowerCase();
		for (Booking b : FakeDB.bookings) {
			if (b.getPaymentMaster().getName().toLowerCase().contains(customerName))
				bookings.add(b);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getBookedRooms() {
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
			if (c.getSSNumber().equals(customerSSNumber))
				return c;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> findCustomers(String partOfCustomerName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			if(e.getSSNumber().equals(employeeSSNumber))
				return e;
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
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddRoom(Room room) {
        if (!FakeDB.rooms.contains(room))
		    FakeDB.rooms.add(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddCustomer(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddDiscount(Discount discount) {
        if (!FakeDB.discounts.contains(discount))
            FakeDB.discounts.add(discount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddAddon(Addon addon) {
        if (!FakeDB.addons.contains(addon))
            FakeDB.addons.add(addon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddEmployee(Employee employee) {
        if (!FakeDB.employees.contains(employee))
            FakeDB.employees.add(employee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddRoomType(RoomType type) {
        if (!FakeDB.roomTypes.contains(type))
            FakeDB.roomTypes.add(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddEmployeeType(EmployeeType type) {
        if (!FakeDB.employeeTypes.contains(type))
            FakeDB.employeeTypes.add(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddExtra(Extra extra) {
        if (!FakeDB.extras.contains(extra))
            FakeDB.extras.add(extra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room> getAvailableRooms(RoomType type, Date from, Date to) {
		EList<Room> availableRooms = null; //getRooms(type);
        EList<Booking> bookings = getBookings(from, to);
        for (Booking booking : bookings)
            availableRooms.removeAll(booking.getBookedRooms());

        return availableRooms;
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
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ROOM__INT:
				return getRoom((Integer)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_ROOM_TYPES:
				return getAllRoomTypes();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_AVALIABLE_ROOM_TYPES__DATE_DATE:
				return getAvaliableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1));
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
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___FIND_BOOKINGS__STRING:
				return findBookings((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_BOOKED_ROOMS:
				return getBookedRooms();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_ALL_CUSTOMERS:
				return getAllCustomers();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_CUSTOMER__STRING:
				return getCustomer((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___FIND_CUSTOMERS__STRING:
				return findCustomers((String)arguments.get(0));
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
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_ROOM__ROOM:
				updateOrAddRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_CUSTOMER__CUSTOMER:
				updateOrAddCustomer((Customer)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_BOOKING__BOOKING:
				updateOrAddBooking((Booking)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_DISCOUNT__DISCOUNT:
				updateOrAddDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_ADDON__ADDON:
				updateOrAddAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_EMPLOYEE__EMPLOYEE:
				updateOrAddEmployee((Employee)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_ROOM_TYPE__ROOMTYPE:
				updateOrAddRoomType((RoomType)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_EMPLOYEE_TYPE__EMPLOYEETYPE:
				updateOrAddEmployeeType((EmployeeType)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___UPDATE_OR_ADD_EXTRA__EXTRA:
				updateOrAddExtra((Extra)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT___GET_AVAILABLE_ROOMS__ROOMTYPE_DATE_DATE:
				return getAvailableRooms((RoomType)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FakeDBContextImpl
