package Main;

import HotelManagementClassDiagram.*;

import java.util.List;

public class Main {

	public static void main(String[] args) {


	}

	public static void generateFakeData(){
		List<Booking> bookings = FakeDB.bookings;
        List<Customer> customers = FakeDB.customers;
        List<Discount> discounts = FakeDB.discounts;
        List<Employee> employees = FakeDB.employees;
        List<Room> rooms = FakeDB.rooms;
	}

}
