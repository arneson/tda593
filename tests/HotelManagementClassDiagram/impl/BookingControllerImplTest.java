package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.BookingController;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by: Tim Kerschbaumer
 * Project: tda593
 * Date: 2015-12-09
 * Time: 14:55
 */
public class BookingControllerImplTest {

	BookingController bc;
	Room r1;
	Room r2;
	Customer c1;
	Customer c2;
	Date d1;
	Date d2;
	Booking b1;
	Booking b2;
	
	@Before
	public void setUp() throws Exception {
		bc = new BookingControllerImpl();

		r1 = new RoomImpl();
		r2 = new RoomImpl();

		c1 = new CustomerImpl();
		c2 = new CustomerImpl();

		d1 = new Date();
		d2 = new Date();

		b1 = new BookingImpl();
		b2 = new BookingImpl();
	}

	@Test
	public void testSearchAvailableRoomTypes() throws Exception {

	}

	@Test
	public void testCreateBooking() throws Exception {

	}

	@Test
	public void testSendConfirmation() throws Exception {

	}

	@Test
	public void testUpdateBooking() throws Exception {

	}

	@Test
	public void testGetBooking() throws Exception {

	}

	@Test
	public void testConfirm() throws Exception {

	}

	@Test
	public void testCheckIn() throws Exception {

	}

	@Test
	public void testCreateKeyCard() throws Exception {

	}

	@Test
	public void testCheckOut() throws Exception {

	}

	@Test
	public void testSaveCustomer() throws Exception {

	}

	@Test
	public void testFindCustomer() throws Exception {

	}

	@Test
	public void testAssignRoom() throws Exception {

	}
}