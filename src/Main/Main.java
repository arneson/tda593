package Main;

import HotelManagementClassDiagram.*;
import HotelManagementClassDiagram.impl.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        // Create 20 rooms
        for (int i = 0; i < 20; i++)
        {
            /*Room room = new RoomImpl();
            room.setRoomName("" + i);
            room.setBooked(false);
            room.setMaxNbrPeople(1+(i/5));
            room.setRoomNumber(i);
            room.setSize(i%2 == 0 ? 2 : 4);
            room.setUnderCleaning(false);
            room.setUnderRepair(false);
            rooms.add(room);*/
        }

        // Create 5 employees
        String[] names = {"Arnold Schwarzeneger", "Erland Holmström", "Göran Andersson", "Dick Hjalmarsson", "Isabella Klarason"};
        String[] ssnumbers = {"851124-3111", "770401-2512", "810312-8181", "891212-9999", "671111-1111"};
        for (int i = 0; i < 5; i++)
        {
            /*Employee employee = new EmployeeImpl();
            employee.setEmployeeID(i+1);
            employee.setEmployeeType();
            employee.setSalary(20000.0 * (i+1)/4);
            employee.setWorkRate();
            employee.setName(names[i]);
            employee.setCity("Trollhättan");
            employee.setCountry("Sweden");
            employee.setGender("Male");
            employee.setPhoneNumber("0761-239913");
            employee.setPostalCode("711 32");
            employee.setSSNumber(ssnumbers[i]);
            employee.setStreet("Kungsgatan 11B");
            employee.setTitle("Mr.");
            employees.add(employee);*/
        }

        // Create 4 addons
        String[] addonNames = {"Cheese Burger", "Calzone", "Staropramen", "Fanta Can"};
        for (int i = 0; i < 4; i++)
        {
            /*Addon addon = new AddonImpl(addonNames[i], "A good piece of costable", 20*i);
            addons.add(addon);*/
        }

        // Create 3 discounts
        for (int i = 1; i < 4; i++)
        {
            /*Discount discount = new DiscountImpl(i == 1, i == 1 ? 0.1 : 100 * i);
            discounts.add(discount);*/
        }

        // Create 3 customers
        String[] customerNames = {"Axel Niklasson", "Tim Kerschbaumer", "Simon Takman"};
        for (int i = 0; i < 3; i++)
        {
            //Customer customer = new CustomerImpl(customerNames[i], );
            //customers.add(customer);
        }

        // Create 3 bookings
        for (int i = 0; i < 3; i++)
        {
            /*BookedRoom bookedRoom = new BookedRoomImpl(rooms.get(i));
            Booking booking = new BookingImpl(i+1, customers.get(i), getDate("25/12/2015"), getDate("29/12/2015"), bookedRoom);
            bookings.add(booking);*/
        }

    }

    public static Date getDate(String date){
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

}
