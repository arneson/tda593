package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.BookedRoom;
import HotelManagementClassDiagram.Booking;
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
 * Time: 14:56
 */
public class BookingImplTest {

	Booking b;
	Date sDate = new Date();
	Date eDate = new Date(2016, 11, 2);
	Room r1;
	Customer c;
	
	@Before
	public void setUp() throws Exception {
		c = new CustomerImpl();
		c.setName("Tim");
		r1 = new RoomImpl();
		r1.setRoomName("Room");
		BookedRoom r = new BookedRoomImpl(r1);
		b = new BookingImpl(1, c, sDate, eDate, r);
	}

	@Test
	public void testGetBookingId() throws Exception {
		assertEquals(1, b.getBookingId());
	}

	@Test
	public void testSetBookingId() throws Exception {
		b.setBookingId(2);
		assertEquals(2, b.getBookingId());
	}

	@Test
	public void testGetStartDate() throws Exception {
		assertEquals(sDate, b.getStartDate());
	}

	@Test
	public void testSetStartDate() throws Exception {
		Date newDate = new Date();
		b.setStartDate(newDate);
		assertEquals(newDate, b.getStartDate());
	}

	@Test
	public void testGetEndDate() throws Exception {
		assertEquals(eDate, b.getEndDate());
	}

	@Test
	public void testSetEndDate() throws Exception {
		Date newDate = new Date();
		b.setEndDate(newDate);
		assertEquals(newDate, b.getEndDate());
	}

	@Test
	public void testSetCreditCard() throws Exception {
		b.setCreditCard(new CreditcardImpl(123, 123, 1, 2015, "Tim"));
	}

	@Test
	public void testGetCreditCard() throws Exception {
		assertEquals(b.getCreditCard().getNumber(), 123);
	}

	@Test
	public void testGetCustomer() throws Exception {
		assertEquals(b.getCustomer(), c);
	}

	@Test
	public void testSetCustomer() throws Exception {
		Customer c = new CustomerImpl();
		c.setName("Erik");
		b.setCustomer(c);
		assertEquals(b.getCustomer(), c);
	}

	@Test
	public void testGetAddons() throws Exception {

	}

	@Test
	public void testGetBookedRooms() throws Exception {

	}

	@Test
	public void testGetInternalComments() throws Exception {

	}

	@Test
	public void testSetInternalComments() throws Exception {

	}

	@Test
	public void testGetExternalComments() throws Exception {

	}

	@Test
	public void testSetExternalComments() throws Exception {

	}

	@Test
	public void testIsCheckedIn() throws Exception {

	}

	@Test
	public void testSetCheckedIn() throws Exception {

	}

	@Test
	public void testIsCheckedOut() throws Exception {

	}

	@Test
	public void testSetCheckedOut() throws Exception {

	}

	@Test
	public void testGetPaymentMaster() throws Exception {

	}

	@Test
	public void testBasicGetPaymentMaster() throws Exception {

	}

	@Test
	public void testSetPaymentMaster() throws Exception {

	}

	@Test
	public void testGetDiscounts() throws Exception {

	}

	@Test
	public void testCheckIn() throws Exception {

	}

	@Test
	public void testCheckOut() throws Exception {

	}

	@Test
	public void testAddAddon() throws Exception {

	}

	@Test
	public void testAddRoom() throws Exception {

	}

	@Test
	public void testRemoveAddon() throws Exception {

	}

	@Test
	public void testRemoveRoom() throws Exception {

	}

	@Test
	public void testGenerateBill() throws Exception {

	}

	@Test
	public void testPay() throws Exception {

	}

	@Test
	public void testAddDiscount() throws Exception {

	}

	@Test
	public void testRemoveDiscount() throws Exception {

	}

}