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
		this.addon = new AddonImpl();
	}

	@Test
	public void testGetName() throws Exception {
		assertEquals(null, this.addon.getName());
		this.addon.setName("Food");
		assertEquals("Food", this.addon.getName());
	}

	@Test
	public void testGetDescription() throws Exception {
		assertEquals(null, this.addon.getDescription());
		this.addon.setDescription("Some food");
		assertEquals("Some food", this.addon.getDescription());
	}

	@Test
	public void testToString() throws Exception {
		assertEquals("(name: Food, description: Some food)", this.addon.toString());
	}
}