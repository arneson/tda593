package Main;
import java.util.ArrayList;

import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.Room;

/**
 * @generated NOT
 */
public class FakeDB {
	public static ArrayList<Booking> bookings;
	public static ArrayList<Room> rooms;
	public static ArrayList<Customer> customers;
	public static ArrayList<Employee> employees;
	public static ArrayList<Discount> discounts;
    public static ArrayList<Costable> costables;

	static {
        bookings = new ArrayList<>();
        rooms = new ArrayList<>();
        customers = new ArrayList<>();
        employees = new ArrayList<>();
        discounts = new ArrayList<>();
        costables = new ArrayList<>();
    }
}
