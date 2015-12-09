package Main;
import java.util.ArrayList;

import HotelManagementClassDiagram.*;

public class FakeDB {
	public static ArrayList<Booking> bookings;
	public static ArrayList<Room> rooms;
	public static ArrayList<Customer> customers;
	public static ArrayList<Employee> employees;
	public static ArrayList<Discount> discounts;
    public static ArrayList<Addon> addons;

	static {
        bookings = new ArrayList<>();
        rooms = new ArrayList<>();
        customers = new ArrayList<>();
        employees = new ArrayList<>();
        discounts = new ArrayList<>();
        addons = new ArrayList<>();
    }
}
