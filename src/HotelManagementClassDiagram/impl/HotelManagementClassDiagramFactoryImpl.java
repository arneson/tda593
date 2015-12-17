/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelManagementClassDiagramFactoryImpl extends EFactoryImpl implements HotelManagementClassDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelManagementClassDiagramFactory init() {
		try {
			HotelManagementClassDiagramFactory theHotelManagementClassDiagramFactory = (HotelManagementClassDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(HotelManagementClassDiagramPackage.eNS_URI);
			if (theHotelManagementClassDiagramFactory != null) {
				return theHotelManagementClassDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HotelManagementClassDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagementClassDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HotelManagementClassDiagramPackage.EMPLOYEE: return createEmployee();
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE: return createEmployeeType();
			case HotelManagementClassDiagramPackage.BOOKING: return createBooking();
			case HotelManagementClassDiagramPackage.CREDITCARD: return createCreditcard();
			case HotelManagementClassDiagramPackage.CUSTOMER: return createCustomer();
			case HotelManagementClassDiagramPackage.ADDON: return createAddon();
			case HotelManagementClassDiagramPackage.EXTRA: return createExtra();
			case HotelManagementClassDiagramPackage.DISCOUNT: return createDiscount();
			case HotelManagementClassDiagramPackage.BOOKED_ROOM: return createBookedRoom();
			case HotelManagementClassDiagramPackage.ROOM: return createRoom();
			case HotelManagementClassDiagramPackage.BILL: return createBill();
			case HotelManagementClassDiagramPackage.BOOKING_CONTROLLER: return createBookingController();
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER: return createManagementController();
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER: return createMaintenanceController();
			case HotelManagementClassDiagramPackage.HOTEL: return createHotel();
			case HotelManagementClassDiagramPackage.INTERACTION1: return createInteraction1();
			case HotelManagementClassDiagramPackage.INTERACTION2: return createInteraction2();
			case HotelManagementClassDiagramPackage.INTERACTION3: return createInteraction3();
			case HotelManagementClassDiagramPackage.INTERACTION4: return createInteraction4();
			case HotelManagementClassDiagramPackage.INTERACTION5: return createInteraction5();
			case HotelManagementClassDiagramPackage.FAKE_DB_CONTEXT: return createFakeDBContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HotelManagementClassDiagramPackage.ETYPE:
				return createETypeFromString(eDataType, initialValue);
			case HotelManagementClassDiagramPackage.ROOM_TYPE:
				return createRoomTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HotelManagementClassDiagramPackage.ETYPE:
				return convertETypeToString(eDataType, instanceValue);
			case HotelManagementClassDiagramPackage.ROOM_TYPE:
				return convertRoomTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeType createEmployeeType() {
		EmployeeTypeImpl employeeType = new EmployeeTypeImpl();
		return employeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creditcard createCreditcard() {
		CreditcardImpl creditcard = new CreditcardImpl();
		return creditcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Addon createAddon() {
		AddonImpl addon = new AddonImpl();
		return addon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extra createExtra() {
		ExtraImpl extra = new ExtraImpl();
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount createDiscount() {
		DiscountImpl discount = new DiscountImpl();
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingController createBookingController() {
		BookingControllerImpl bookingController = new BookingControllerImpl();
		return bookingController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementController createManagementController() {
		ManagementControllerImpl managementController = new ManagementControllerImpl();
		return managementController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceController createMaintenanceController() {
		MaintenanceControllerImpl maintenanceController = new MaintenanceControllerImpl();
		return maintenanceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel createHotel() {
		HotelImpl hotel = new HotelImpl();
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookedRoom createBookedRoom() {
		BookedRoomImpl bookedRoom = new BookedRoomImpl();
		return bookedRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction1 createInteraction1() {
		Interaction1Impl interaction1 = new Interaction1Impl();
		return interaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction2 createInteraction2() {
		Interaction2Impl interaction2 = new Interaction2Impl();
		return interaction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction3 createInteraction3() {
		Interaction3Impl interaction3 = new Interaction3Impl();
		return interaction3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction4 createInteraction4() {
		Interaction4Impl interaction4 = new Interaction4Impl();
		return interaction4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction5 createInteraction5() {
		Interaction5Impl interaction5 = new Interaction5Impl();
		return interaction5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FakeDBContext createFakeDBContext() {
		FakeDBContextImpl fakeDBContext = new FakeDBContextImpl();
		return fakeDBContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createETypeFromString(EDataType eDataType, String initialValue) {
		EType result = EType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomTypeFromString(EDataType eDataType, String initialValue) {
		RoomType result = RoomType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagementClassDiagramPackage getHotelManagementClassDiagramPackage() {
		return (HotelManagementClassDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HotelManagementClassDiagramPackage getPackage() {
		return HotelManagementClassDiagramPackage.eINSTANCE;
	}

} //HotelManagementClassDiagramFactoryImpl
