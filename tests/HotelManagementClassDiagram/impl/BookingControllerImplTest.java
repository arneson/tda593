package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.*;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by: Tim Kerschbaumer
 * Project: tda593
 * Date: 2015-12-09
 * Time: 14:55
 */
public class BookingControllerImplTest {

	BookingController bc;
	BookedRoom r1;
	BookedRoom r2;
	Customer c1;
	Customer c2;
	Date d1;
	Date d2;
	Booking b1;
	Booking b2;
	
	@Before
	public void setUp() throws Exception {
		bc = new BookingControllerImpl();

		r2 = new BookedRoomImpl(new RoomImpl("K", 10, 2, 2));
		r1 = new BookedRoomImpl(new RoomImpl("N", 10, 1, 2));

		c1 = new CustomerImpl(1, "Tim", "Götet", "Sweden", "Male", "073", "41322", "931022", "gata", "Mr");
		c2 = new CustomerImpl(2, "Ti", "gä", "Suded", "Fem", "081", "41321", "931021", "gata2", "Ms");

		d1 = new Date();
		d2 = new Date(2015, 11, 24, 1, 0);

		b1 = new BookingImpl(1, c1, d1, d2, r1);
		b2 = new BookingImpl(2, c2, d1, d2, r2);
	}

	@Test
	public void testSearchAvailableRoomTypes() throws Exception {
		EList<RoomType> list = this.bc.searchAvailableRoomTypes(d1, d2, 2, 0);
		for (RoomType item : list) {
			// assertEquals();
		}
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