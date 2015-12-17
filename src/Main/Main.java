package main;

import HotelManagementClassDiagram.*;
import HotelManagementClassDiagram.impl.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @generated NOT
 */
public class Main {
	
	static final String CLI_EXIT_COMMAND= "exit";
	static final String CLI_HELP_COMMAND= "help";
	static final String CLI_CHECKIN_COMMAND= "checkin";
	static final String CLI_CHECKOUT_COMMAND= "checkout";
	static final String CLI_NEW_CUSTOMER_COMMAND= "new customer";
	static final String CLI_BOOK_A_ROOM_COMMAND= "book";
	static final String CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND= "browse available";
	
	public static void main(String[] args) {
        // Generate the fake data for testing
		generateFakeData();
		Hotel myHotel = new HotelImpl("C-R-A-P hotel");
		
		Scanner reader = new Scanner(System.in);
		String command ="";
		do{
			System.out.println("Welcome to "+myHotel.getName()+".");
			switch(command){
				case CLI_HELP_COMMAND:
					System.out.println();
					System.out.println("HELP - List of commands.");
					System.out.println("##########################");
					System.out.println("exit - exit the program");
					System.out.println("help - show list of commands");
					System.out.println(CLI_CHECKIN_COMMAND+" - check in a booking");
					System.out.println(CLI_CHECKOUT_COMMAND+" - check out a booking");
					System.out.println(CLI_NEW_CUSTOMER_COMMAND+" - create a new customer");
					System.out.println(CLI_BOOK_A_ROOM_COMMAND+" - book a room");
					System.out.println(CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND+" - browse available room types");
					System.out.println();
					System.out.print("Choose an option: ");
					break;
				case CLI_CHECKIN_COMMAND:
					System.out.println();
					System.out.println("CHECK IN");
					System.out.println("##################");
					int bookingId = -1;
					do{
						System.out.print("Please enter booking number: ");
						bookingId = reader.nextInt();
						Booking b = myHotel.getBookingController().getBooking(bookingId);
						if(b!=null){
							System.out.println("Booking found.");
							System.out.print("Please enter credit card number: ");
							long number = reader.nextLong();
							System.out.print("Please enter cvc code: ");
							int cvc = reader.nextInt();
							System.out.print("Please enter expiration month: ");
							int month = reader.nextInt();
							System.out.print("Please enter expiration year: ");
							int year = reader.nextInt();
							System.out.print("Please cardholder's name: ");
							String owner = reader.nextLine();
							Creditcard card = new CreditcardImpl(number,cvc,month,year,owner);
							b.setCreditCard(card);
							myHotel.getBookingController().updateBooking(b);
							myHotel.getBookingController().checkIn(b, true);
							System.out.print("Booking successfully checked in: ");
							
						}else{
							System.out.println("No booking with bookingId: "+bookingId+" found.");
							bookingId =-1;
						}
						
					}while(bookingId!=-1);
					break;
				case CLI_CHECKOUT_COMMAND:
					break;
				case CLI_NEW_CUSTOMER_COMMAND:
					break;
				case CLI_BOOK_A_ROOM_COMMAND:
					break;
				case CLI_SEARCH_AVAILABLE_ROOM_TYPES_COMMAND:

					break;
				default:
					System.out.println("Enter "+CLI_HELP_COMMAND+" for a list of commands.");
					System.out.println("Enter " + CLI_EXIT_COMMAND + " to exit.");
					System.out.println("Choose an option: ");
					break;
			}
			command = reader.nextLine();
		}while(!command.equalsIgnoreCase(CLI_EXIT_COMMAND));

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
            Employee employee = new EmployeeImpl(type, salary, workrate, name, city, country, gender, phoneNumber,
                    postalCode, ssnumber, street, title);
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
            String name = customerNames[i],
                    city = "Trollh�ttan",
                    country = "Sweden",
                    gender = "Male",
                    phoneNumber = "0761-239913",
                    postalCode = "711 32",
                    ssnumber = ssnumbers[i],
                    street = "Kungsgatan 11B",
                    title = "Mr.";
            Customer customer = new CustomerImpl(name, city, country, gender, phoneNumber, postalCode, ssnumber, street, title);
            customers.add(customer);
        }

        // Create 3 bookings
        for (int i = 0; i < 3; i++)
        {
            Room bookedRoom = rooms.get(i);
            Booking booking = new BookingImpl(customers.get(i), getDate("25/12/2015"), getDate("29/12/2015"), bookedRoom);
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
