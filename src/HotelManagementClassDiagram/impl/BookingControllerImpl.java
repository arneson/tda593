/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.BookingController;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

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
		EList<RoomType> r = FakeDBContextImpl.getInstance().getAvaliableRoomTypes(fromDate, toDate);
		return r;
		// TODO filter skit
	}

	/**
	 * <!-- begin-user-doc -->
	 *     This method should be used to send an email to a customer
	 *     but this is not done, it just illustrates what could be done.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean sendConfirmation(Booking booking) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Booking getBooking(int bookingId) {
		return FakeDBContextImpl.getInstance().getBooking(bookingId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkIn(Booking booking) {
		booking.checkIn();
		FakeDBContextImpl.getInstance().updateOrAddBooking(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void checkOut(Booking booking) {
		booking.checkOut();
		FakeDBContextImpl.getInstance().updateOrAddBooking(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void saveCustomer(Customer customer) {
		FakeDBContextImpl.getInstance().updateOrAddCustomer(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findCustomer(String ssNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Customer getCustomer(String SSN) {
		return FakeDBContextImpl.getInstance().getCustomer(SSN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddCustomer(Customer customer) {
		FakeDBContextImpl.getInstance().updateOrAddCustomer(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddBooking(Booking booking) {
		FakeDBContextImpl.getInstance().updateOrAddBooking(booking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking> getAllBookings() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getAllCustomers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___SEND_CONFIRMATION__BOOKING:
				return sendConfirmation((Booking)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___GET_BOOKING__INT:
				return getBooking((Integer)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___CHECK_IN__BOOKING:
				checkIn((Booking)arguments.get(0));
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
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___GET_CUSTOMER__STRING:
				return getCustomer((String)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___UPDATE_OR_ADD_CUSTOMER__CUSTOMER:
				updateOrAddCustomer((Customer)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___UPDATE_OR_ADD_BOOKING__BOOKING:
				updateOrAddBooking((Booking)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___GET_ALL_BOOKINGS:
				return getAllBookings();
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER___GET_ALL_CUSTOMERS:
				return getAllCustomers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingControllerImpl