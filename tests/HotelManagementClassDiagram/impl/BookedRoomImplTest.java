package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.BookedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by: Tim Kerschbaumer
 * Project: tda593
 * Date: 2015-12-09
 * Time: 14:55
 */
public class BookedRoomImplTest {

	BookedRoom bookedRoom;
	Addon a = new AddonImpl();
	Addon b = new AddonImpl();
	
	@Before
	public void setUp() throws Exception {
		this.bookedRoom = new BookedRoomImpl();
		this.a = new AddonImpl();
		a.setName("Food");
		this.bookedRoom.addAddon(a);
		this.bookedRoom.addAddon(b);
	}

	@Test
	public void testGetAddons() throws Exception {
		assertEquals(a.getName(), this.bookedRoom.getAddons().get(0).getName());
		assertEquals(b, this.bookedRoom.getAddons().get(1));
	}

	@Test
	public void testRemoveAddon() throws Exception {
		this.bookedRoom.removeAddon(a);
		assertEquals(b, this.bookedRoom.getAddons().get(0));
	}

}