package main;
import java.util.ArrayList;
import java.util.List;

import HotelManagementClassDiagram.*;
import HotelManagementClassDiagram.impl.EmployeeTypeImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * @generated NOT
 */
public class FakeDB {
	public static EList<Booking> bookings;
	public static EList<Room> rooms;
	public static EList<Customer> customers;
	public static EList<Employee> employees;
	public static EList<Discount> discounts;
    public static EList<Addon> addons;
    public static EList<Extra> extras;
    public static EList<RoomType> roomTypes;
    public static EList<EmployeeType> employeeTypes;

	static {
        bookings = new BasicEList<>();
        rooms = new BasicEList<>();
        customers = new BasicEList<>();
        employees = new BasicEList<>();
        discounts = new BasicEList<>();
        addons = new BasicEList<>();
        extras = new BasicEList<>();
        roomTypes = new BasicEList<>();
        employeeTypes = new BasicEList<>();
    }
}
