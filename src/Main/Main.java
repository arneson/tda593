package Main;

import HotelManagementClassDiagram.*;
import HotelManagementClassDiagram.impl.RoomImpl;

import java.util.List;

/**
 * @generated NOT
 */
public class Main {

	public static void main(String[] args) {


	}

	public static void generateFakeData(){
		List<Booking> bookings = FakeDB.bookings;
        List<Customer> customers = FakeDB.customers;
        List<Discount> discounts = FakeDB.discounts;
        List<Employee> employees = FakeDB.employees;
        List<Room> rooms = FakeDB.rooms;
        List<Addon> addons = FakeDB.addons;

        for (int i = 0; i < 20; i++)
        {
            Room room = new RoomImpl();
            room.setRoomName("" + i);
        }
	}

}
