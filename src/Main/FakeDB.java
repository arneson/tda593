package Main;
import java.util.ArrayList;

import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.Room;

public class FakeDB {
	public static ArrayList<Booking> bookings;
	public static ArrayList<Room> rooms;
	public static ArrayList<Customer> customers;
	public static ArrayList<Employee> employees;
	public static ArrayList<Discount> discounts;
	public static void init(){
		bookings = new ArrayList<Booking>();
		rooms = new ArrayList<Room>();
		customers = new ArrayList<Customer>();
		employees = new ArrayList<Employee>();
		discounts = new ArrayList<Discount>();
	}
}
