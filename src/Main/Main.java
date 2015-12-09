package main;

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
        // Generate the fake data for testing
		generateFakeData();


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
            String name = "" + i;
            int size = i%2 == 0 ? 2 : 4;
            int maxNbrPeople = size + 2,
                roomNumber = i;
            Room room = new RoomImpl(name, maxNbrPeople, roomNumber, size);
            rooms.add(room);
        }

        // Create 5 employees
        String[] names = {"Arnold Schwarzeneger", "Erland Holmstr�m", "G�ran Andersson", "Dick Hjalmarsson", "Isabella Klarason"};
        String[] ssnumbers = {"851124-3111", "770401-2512", "810312-8181", "891212-9999", "671111-1111"};
        EType[] types = {EType.CLEANER, EType.RECEPTIONIST, EType.MANAGER};
        for (int i = 0; i < 5; i++)
        {
            int id = i+1;
            EmployeeType type = new EmployeeTypeImpl(types[i%3], (i+1)*2);
            double salary = 20000.0 * (i+1)/4,
                workrate = 0.2;
            String name = names[i],
                city = "Trollh�ttan",
                country = "Sweden",
                gender = "Male",
                phoneNumber = "0761-239913",
                postalCode = "711 32",
                ssnumber = ssnumbers[i],
                street = "Kungsgatan 11B",
                title = "Mr.";
            Employee employee = new EmployeeImpl(id, type, salary, workrate, name, city, country, gender, phoneNumber, postalCode, ssnumber, street, title);
            employees.add(employee);
        }

        // Create 4 addons
        String[] addonNames = {"Cheese Burger", "Calzone", "Staropramen", "Fanta Can"};
        for (int i = 0; i < 4; i++)
        {
            String name = addonNames[i],
                    description = "A good piece of costable";
            double price = 20*i;
            Addon addon = new AddonImpl(name, description, price);
            addons.add(addon);
        }

        // Create 3 discounts
        for (int i = 1; i < 4; i++)
        {
            boolean isPercentage = i == 1;
            double price = isPercentage ? 0.1 : 100*i;
            Discount discount = new DiscountImpl(isPercentage, price);
            discounts.add(discount);
        }

        // Create 3 customers
        String[] customerNames = {"Axel Niklasson", "Tim Kerschbaumer", "Simon Takman"};
        for (int i = 0; i < 3; i++)
        {
            int id = i+1;
            String name = customerNames[i],
                    city = "Trollh�ttan",
                    country = "Sweden",
                    gender = "Male",
                    phoneNumber = "0761-239913",
                    postalCode = "711 32",
                    ssnumber = ssnumbers[i],
                    street = "Kungsgatan 11B",
                    title = "Mr.";
            Customer customer = new CustomerImpl(id, name, city, country, gender, phoneNumber, postalCode, ssnumber, street, title);
            customers.add(customer);
        }

        // Create 3 bookings
        for (int i = 0; i < 3; i++)
        {
            BookedRoom bookedRoom = new BookedRoomImpl(rooms.get(i));
            Booking booking = new BookingImpl(i+1, customers.get(i), getDate("25/12/2015"), getDate("29/12/2015"), bookedRoom);
            bookings.add(booking);
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
