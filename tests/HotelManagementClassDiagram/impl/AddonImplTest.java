package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.HotelManagementClassDiagramFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by: Tim Kerschbaumer
 * Project: tda593
 * Date: 2015-12-09
 * Time: 14:54
 */
public class AddonImplTest {

	Addon addon;
	
	@Before
	public void setUp() throws Exception {
		this.addon = new AddonImpl("Food", "Some food", 10);
	}

	@Test
	public void testGetName() throws Exception {
		assertEquals(null, this.addon.getName());
		assertEquals("Food", this.addon.getName());
	}

	@Test
	public void testGetDescription() throws Exception {
		assertEquals(null, this.addon.getDescription());
		assertEquals("Some food", this.addon.getDescription());
	}
}