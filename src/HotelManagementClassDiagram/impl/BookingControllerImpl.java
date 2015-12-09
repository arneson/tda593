/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.*;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import HotelManagementClassDiagram.exceptions.NoSuchBookingException;
import main.FakeDB;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BookingControllerImpl extends MinimalEObjectImpl.Container implements BookingController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.BOOKING_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomType> searchAvailableRoomTypes(Date fromDate, Date toDate, int nbrOfAdults, int nbrOfChildren) {
		EList<RoomType> types = new BasicEList<>();
		List<Room> rooms = getAvailableRooms(fromDate, toDate);
		for (Room r : rooms) {
			if (r.getMaxNbrPeople() >= (nbrOfAdults + nbrOfChildren)) {
				for (RoomType rt : r.getTypes()) {
					if (!types.contains(rt)) {
						types.add(rt);
					}
				}
			}
		}
		return types;
	}

	private List<Room> getAvailableRooms(Date fromDate, Date toDate) {
		List<Room> rooms = new ArrayList<>(FakeDB.rooms);
		List<Booking> booking = FakeDB.bookings;
		for (Booking b : booking) {
			if (fromDate.before(b.getEndDate()) || toDate.after(b.getStartDate())) {
				for (BookedRoom br : b.getBookedRooms()) {
					rooms.remove(br);
				}
			}
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createBooking(EList<RoomType> roomTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sendConfirmation(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean updateBooking(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(int bookingId) {
		for (Booking booking : FakeDB.bookings) {
			if (bookingId == booking.getBookingId()) {
				return booking;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean confirm(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(Booking booking) {
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createKeyCard(Room room) {
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(Booking booking) {
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void saveCustomer(Customer customer) {
		FakeDB.customers.add(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findCustomer(String ssNumber) {
		for (Customer customer : FakeDB.customers) {
			if (customer.getSSNumber() == ssNumber) {
				// TODO return customer;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignRoom(Room room) {
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT:
				return searchAvailableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CREATE_BOOKING__ELIST:
				return createBooking((EList<RoomType>)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___SEND_CONFIRMATION__BOOKING:
				return sendConfirmation((Booking)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___UPDATE_BOOKING__BOOKING:
				return updateBooking((Booking)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CONFIRM__BOOKING:
				return confirm((Booking)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CHECK_IN__BOOKING:
				checkIn((Booking)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CREATE_KEY_CARD__ROOM:
				createKeyCard((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CHECK_OUT__BOOKING:
				checkOut((Booking)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___SAVE_CUSTOMER__CUSTOMER:
				saveCustomer((Customer)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___FIND_CUSTOMER__STRING:
				findCustomer((String)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___ASSIGN_ROOM__ROOM:
				assignRoom((Room)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl