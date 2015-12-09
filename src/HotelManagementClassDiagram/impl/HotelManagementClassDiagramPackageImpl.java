/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Bill;
import HotelManagementClassDiagram.BookedRoom;
import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.BookingController;
import HotelManagementClassDiagram.CleaningStatus;
import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Creditcard;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.EType;
import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.Hotel;
import HotelManagementClassDiagram.HotelManagementClassDiagramFactory;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Interaction1;
import HotelManagementClassDiagram.Interaction2;
import HotelManagementClassDiagram.Interaction3;
import HotelManagementClassDiagram.Interaction4;
import HotelManagementClassDiagram.Interaction5;
import HotelManagementClassDiagram.MaintenanceController;
import HotelManagementClassDiagram.ManagementController;
import HotelManagementClassDiagram.Person;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelManagementClassDiagramPackageImpl extends EPackageImpl implements HotelManagementClassDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditcardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookedRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interaction5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roomTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cleaningStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelManagementClassDiagramPackageImpl() {
		super(eNS_URI, HotelManagementClassDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HotelManagementClassDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelManagementClassDiagramPackage init() {
		if (isInited) return (HotelManagementClassDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(HotelManagementClassDiagramPackage.eNS_URI);

		// Obtain or create and register package
		HotelManagementClassDiagramPackageImpl theHotelManagementClassDiagramPackage = (HotelManagementClassDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelManagementClassDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelManagementClassDiagramPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHotelManagementClassDiagramPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theHotelManagementClassDiagramPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHotelManagementClassDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelManagementClassDiagramPackage.eNS_URI, theHotelManagementClassDiagramPackage);
		return theHotelManagementClassDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployee_EmployeeType() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_EmployeeID() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__Booking() {
		return employeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__Boolean() {
		return employeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployee__RoomTypes() {
		return employeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_SSNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PhoneNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Street() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_City() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PostalCode() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Country() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Title() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeeType() {
		return employeeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeType_Type() {
		return (EAttribute)employeeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeType_AcessLevel() {
		return (EAttribute)employeeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeType_WorkRate() {
		return (EAttribute)employeeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployeeType_Salary() {
		return (EAttribute)employeeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingId() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_StartDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_EndDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Created() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_CreditCard() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Addons() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_BookedRooms() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_InternalComments() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_ExternalComments() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckedIn() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckedOut() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_PaymentMaster() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckIn() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CheckOut() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddAddon__Addon() {
		return bookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddRoom__Room() {
		return bookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveAddon__Addon() {
		return bookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveRoom__Room() {
		return bookingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__GenerateBill() {
		return bookingEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__Pay__Bill() {
		return bookingEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddDiscount__Discount() {
		return bookingEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__RemoveDiscount__Discount() {
		return bookingEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditcard() {
		return creditcardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditcard_Number() {
		return (EAttribute)creditcardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditcard_ExpirationDate() {
		return (EAttribute)creditcardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditcard_Cvc() {
		return (EAttribute)creditcardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditcard_Owner() {
		return (EAttribute)creditcardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreditcard__Validate() {
		return creditcardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_CustomerID() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_BonusPoints() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_MiscInfo() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Rank() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddBonusPoints__int() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddon() {
		return addonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Name() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddon_Description() {
		return (EAttribute)addonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNumber() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Size() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_InternalComment() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Booked() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_MaxNbrPeople() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_UnderCleaning() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_UnderRepair() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Types() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomName() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoom__SetCleanedStatus__CleaningStatus() {
		return roomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Costables() {
		return (EReference)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_TotalPrice() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_Customer() {
		return (EReference)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_ValueAddedTax() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Final() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCostable() {
		return costableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCostable_Price() {
		return (EAttribute)costableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCostable_Discount() {
		return (EReference)costableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCostable__AddDiscount() {
		return costableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCostable__RemoveDiscount() {
		return costableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscount() {
		return discountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_IsPercentage() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscount_Amount() {
		return (EAttribute)discountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingController() {
		return bookingControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__SearchAvailableRoomTypes__Date_Date_int_int() {
		return bookingControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__CreateBooking__EList() {
		return bookingControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__SendConfirmation__Booking() {
		return bookingControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__UpdateBooking__Booking() {
		return bookingControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__GetBooking__int() {
		return bookingControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__Confirm__Booking() {
		return bookingControllerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__CheckIn__Booking() {
		return bookingControllerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__CreateKeyCard__Room() {
		return bookingControllerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__CheckOut__Booking() {
		return bookingControllerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__SaveCustomer__Customer() {
		return bookingControllerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__FindCustomer__String() {
		return bookingControllerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingController__AssignRoom__Room() {
		return bookingControllerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementController() {
		return managementControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagementController__RegisterDiscount__Discount_Costable() {
		return managementControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagementController__RegisterCostable__Costable() {
		return managementControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagementController__UpdateCostable__Costable() {
		return managementControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagementController__ModifyBooking__Booking() {
		return managementControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagementController__SetDateSpecificPrices__Costable_Date_Date_double() {
		return managementControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintenanceController() {
		return maintenanceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaintenanceController_RoomStack() {
		return (EReference)maintenanceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceController__AddToStack__Room() {
		return maintenanceControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceController__SetStatus__Room_CleaningStatus() {
		return maintenanceControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceController__NotifyWorker__EmployeeType() {
		return maintenanceControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceController__RemoveFromStack__Room() {
		return maintenanceControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMaintenanceController__GetNextRoomToClean__Room() {
		return maintenanceControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Name() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Address() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Rank() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel__Authenticate__String_String() {
		return hotelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel__GetBookingController() {
		return hotelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel__GetManagementController() {
		return hotelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotel__GetMaintenanceController() {
		return hotelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookedRoom() {
		return bookedRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookedRoom_Addons() {
		return (EReference)bookedRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookedRoom__AddAddon__Addon() {
		return bookedRoomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookedRoom__RemoveAddon__Addon() {
		return bookedRoomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction1() {
		return interaction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction1__() {
		return (EReference)interaction1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction2() {
		return interaction2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction2__() {
		return (EReference)interaction2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction3() {
		return interaction3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction3__() {
		return (EReference)interaction3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction4() {
		return interaction4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction4__() {
		return (EReference)interaction4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction5() {
		return interaction5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction5__() {
		return (EReference)interaction5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEType() {
		return eTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoomType() {
		return roomTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCleaningStatus() {
		return cleaningStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelManagementClassDiagramFactory getHotelManagementClassDiagramFactory() {
		return (HotelManagementClassDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__EMPLOYEE_TYPE);
		createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_ID);
		createEOperation(employeeEClass, EMPLOYEE___BOOKING);
		createEOperation(employeeEClass, EMPLOYEE___BOOLEAN);
		createEOperation(employeeEClass, EMPLOYEE___ROOM_TYPES);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__SS_NUMBER);
		createEAttribute(personEClass, PERSON__PHONE_NUMBER);
		createEAttribute(personEClass, PERSON__STREET);
		createEAttribute(personEClass, PERSON__CITY);
		createEAttribute(personEClass, PERSON__POSTAL_CODE);
		createEAttribute(personEClass, PERSON__COUNTRY);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__TITLE);

		employeeTypeEClass = createEClass(EMPLOYEE_TYPE);
		createEAttribute(employeeTypeEClass, EMPLOYEE_TYPE__TYPE);
		createEAttribute(employeeTypeEClass, EMPLOYEE_TYPE__ACESS_LEVEL);
		createEAttribute(employeeTypeEClass, EMPLOYEE_TYPE__WORK_RATE);
		createEAttribute(employeeTypeEClass, EMPLOYEE_TYPE__SALARY);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__START_DATE);
		createEAttribute(bookingEClass, BOOKING__END_DATE);
		createEAttribute(bookingEClass, BOOKING__CREATED);
		createEReference(bookingEClass, BOOKING__CREDIT_CARD);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__ADDONS);
		createEReference(bookingEClass, BOOKING__BOOKED_ROOMS);
		createEAttribute(bookingEClass, BOOKING__INTERNAL_COMMENTS);
		createEAttribute(bookingEClass, BOOKING__EXTERNAL_COMMENTS);
		createEAttribute(bookingEClass, BOOKING__CHECKED_IN);
		createEAttribute(bookingEClass, BOOKING__CHECKED_OUT);
		createEReference(bookingEClass, BOOKING__PAYMENT_MASTER);
		createEOperation(bookingEClass, BOOKING___CHECK_IN);
		createEOperation(bookingEClass, BOOKING___CHECK_OUT);
		createEOperation(bookingEClass, BOOKING___ADD_ADDON__ADDON);
		createEOperation(bookingEClass, BOOKING___ADD_ROOM__ROOM);
		createEOperation(bookingEClass, BOOKING___REMOVE_ADDON__ADDON);
		createEOperation(bookingEClass, BOOKING___REMOVE_ROOM__ROOM);
		createEOperation(bookingEClass, BOOKING___GENERATE_BILL);
		createEOperation(bookingEClass, BOOKING___PAY__BILL);
		createEOperation(bookingEClass, BOOKING___ADD_DISCOUNT__DISCOUNT);
		createEOperation(bookingEClass, BOOKING___REMOVE_DISCOUNT__DISCOUNT);

		creditcardEClass = createEClass(CREDITCARD);
		createEAttribute(creditcardEClass, CREDITCARD__NUMBER);
		createEAttribute(creditcardEClass, CREDITCARD__EXPIRATION_DATE);
		createEAttribute(creditcardEClass, CREDITCARD__CVC);
		createEAttribute(creditcardEClass, CREDITCARD__OWNER);
		createEOperation(creditcardEClass, CREDITCARD___VALIDATE);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__CUSTOMER_ID);
		createEAttribute(customerEClass, CUSTOMER__BONUS_POINTS);
		createEAttribute(customerEClass, CUSTOMER__MISC_INFO);
		createEAttribute(customerEClass, CUSTOMER__RANK);
		createEOperation(customerEClass, CUSTOMER___ADD_BONUS_POINTS__INT);

		addonEClass = createEClass(ADDON);
		createEAttribute(addonEClass, ADDON__NAME);
		createEAttribute(addonEClass, ADDON__DESCRIPTION);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_NUMBER);
		createEAttribute(roomEClass, ROOM__SIZE);
		createEAttribute(roomEClass, ROOM__INTERNAL_COMMENT);
		createEAttribute(roomEClass, ROOM__BOOKED);
		createEAttribute(roomEClass, ROOM__MAX_NBR_PEOPLE);
		createEAttribute(roomEClass, ROOM__UNDER_CLEANING);
		createEAttribute(roomEClass, ROOM__UNDER_REPAIR);
		createEAttribute(roomEClass, ROOM__TYPES);
		createEAttribute(roomEClass, ROOM__ROOM_NAME);
		createEOperation(roomEClass, ROOM___SET_CLEANED_STATUS__CLEANINGSTATUS);

		billEClass = createEClass(BILL);
		createEReference(billEClass, BILL__COSTABLES);
		createEAttribute(billEClass, BILL__TOTAL_PRICE);
		createEReference(billEClass, BILL__CUSTOMER);
		createEAttribute(billEClass, BILL__VALUE_ADDED_TAX);
		createEAttribute(billEClass, BILL__FINAL);

		costableEClass = createEClass(COSTABLE);
		createEAttribute(costableEClass, COSTABLE__PRICE);
		createEReference(costableEClass, COSTABLE__DISCOUNT);
		createEOperation(costableEClass, COSTABLE___ADD_DISCOUNT);
		createEOperation(costableEClass, COSTABLE___REMOVE_DISCOUNT);

		discountEClass = createEClass(DISCOUNT);
		createEAttribute(discountEClass, DISCOUNT__IS_PERCENTAGE);
		createEAttribute(discountEClass, DISCOUNT__AMOUNT);

		bookingControllerEClass = createEClass(BOOKING_CONTROLLER);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___CREATE_BOOKING__ELIST);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___SEND_CONFIRMATION__BOOKING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___UPDATE_BOOKING__BOOKING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___GET_BOOKING__INT);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___CONFIRM__BOOKING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___CHECK_IN__BOOKING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___CREATE_KEY_CARD__ROOM);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___CHECK_OUT__BOOKING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___SAVE_CUSTOMER__CUSTOMER);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___FIND_CUSTOMER__STRING);
		createEOperation(bookingControllerEClass, BOOKING_CONTROLLER___ASSIGN_ROOM__ROOM);

		managementControllerEClass = createEClass(MANAGEMENT_CONTROLLER);
		createEOperation(managementControllerEClass, MANAGEMENT_CONTROLLER___REGISTER_DISCOUNT__DISCOUNT_COSTABLE);
		createEOperation(managementControllerEClass, MANAGEMENT_CONTROLLER___REGISTER_COSTABLE__COSTABLE);
		createEOperation(managementControllerEClass, MANAGEMENT_CONTROLLER___UPDATE_COSTABLE__COSTABLE);
		createEOperation(managementControllerEClass, MANAGEMENT_CONTROLLER___MODIFY_BOOKING__BOOKING);
		createEOperation(managementControllerEClass, MANAGEMENT_CONTROLLER___SET_DATE_SPECIFIC_PRICES__COSTABLE_DATE_DATE_DOUBLE);

		maintenanceControllerEClass = createEClass(MAINTENANCE_CONTROLLER);
		createEReference(maintenanceControllerEClass, MAINTENANCE_CONTROLLER__ROOM_STACK);
		createEOperation(maintenanceControllerEClass, MAINTENANCE_CONTROLLER___ADD_TO_STACK__ROOM);
		createEOperation(maintenanceControllerEClass, MAINTENANCE_CONTROLLER___SET_STATUS__ROOM_CLEANINGSTATUS);
		createEOperation(maintenanceControllerEClass, MAINTENANCE_CONTROLLER___NOTIFY_WORKER__EMPLOYEETYPE);
		createEOperation(maintenanceControllerEClass, MAINTENANCE_CONTROLLER___REMOVE_FROM_STACK__ROOM);
		createEOperation(maintenanceControllerEClass, MAINTENANCE_CONTROLLER___GET_NEXT_ROOM_TO_CLEAN__ROOM);

		hotelEClass = createEClass(HOTEL);
		createEAttribute(hotelEClass, HOTEL__NAME);
		createEAttribute(hotelEClass, HOTEL__ADDRESS);
		createEAttribute(hotelEClass, HOTEL__RANK);
		createEOperation(hotelEClass, HOTEL___AUTHENTICATE__STRING_STRING);
		createEOperation(hotelEClass, HOTEL___GET_BOOKING_CONTROLLER);
		createEOperation(hotelEClass, HOTEL___GET_MANAGEMENT_CONTROLLER);
		createEOperation(hotelEClass, HOTEL___GET_MAINTENANCE_CONTROLLER);

		bookedRoomEClass = createEClass(BOOKED_ROOM);
		createEReference(bookedRoomEClass, BOOKED_ROOM__ADDONS);
		createEOperation(bookedRoomEClass, BOOKED_ROOM___ADD_ADDON__ADDON);
		createEOperation(bookedRoomEClass, BOOKED_ROOM___REMOVE_ADDON__ADDON);

		interaction1EClass = createEClass(INTERACTION1);
		createEReference(interaction1EClass, INTERACTION1__);

		interaction2EClass = createEClass(INTERACTION2);
		createEReference(interaction2EClass, INTERACTION2__);

		interaction3EClass = createEClass(INTERACTION3);
		createEReference(interaction3EClass, INTERACTION3__);

		interaction4EClass = createEClass(INTERACTION4);
		createEReference(interaction4EClass, INTERACTION4__);

		interaction5EClass = createEClass(INTERACTION5);
		createEReference(interaction5EClass, INTERACTION5__);

		// Create enums
		eTypeEEnum = createEEnum(ETYPE);
		roomTypeEEnum = createEEnum(ROOM_TYPE);
		cleaningStatusEEnum = createEEnum(CLEANING_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		employeeEClass.getESuperTypes().add(this.getPerson());
		customerEClass.getESuperTypes().add(this.getPerson());
		bookedRoomEClass.getESuperTypes().add(this.getRoom());

		// Initialize classes, features, and operations; add parameters
		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_EmployeeType(), this.getEmployeeType(), null, "employeeType", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_EmployeeID(), ecorePackage.getEInt(), "employeeID", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmployee__Booking(), null, "Booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__Boolean(), null, "Boolean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__RoomTypes(), null, "roomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), theTypesPackage.getString(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_SSNumber(), theTypesPackage.getString(), "SSNumber", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_PhoneNumber(), theTypesPackage.getString(), "phoneNumber", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Street(), theTypesPackage.getString(), "street", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_City(), theTypesPackage.getString(), "city", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_PostalCode(), theTypesPackage.getString(), "postalCode", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Country(), theTypesPackage.getString(), "country", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Gender(), theTypesPackage.getString(), "gender", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Title(), theTypesPackage.getString(), "title", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(employeeTypeEClass, EmployeeType.class, "EmployeeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeeType_Type(), this.getEType(), "type", null, 1, 1, EmployeeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployeeType_AcessLevel(), ecorePackage.getEInt(), "acessLevel", null, 1, 1, EmployeeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployeeType_WorkRate(), ecorePackage.getEInt(), "workRate", null, 1, 1, EmployeeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployeeType_Salary(), ecorePackage.getEDouble(), "salary", null, 1, 1, EmployeeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingId(), ecorePackage.getEInt(), "bookingId", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Created(), ecorePackage.getEDate(), "created", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_CreditCard(), this.getCreditcard(), null, "creditCard", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Addons(), this.getAddon(), null, "addons", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_BookedRooms(), this.getRoom(), null, "bookedRooms", null, 1, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_InternalComments(), theTypesPackage.getString(), "internalComments", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_ExternalComments(), theTypesPackage.getString(), "externalComments", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckedIn(), ecorePackage.getEBoolean(), "checkedIn", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckedOut(), ecorePackage.getEBoolean(), "checkedOut", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_PaymentMaster(), this.getCustomer(), null, "paymentMaster", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__CheckIn(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__CheckOut(), this.getBill(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getBooking__AddAddon__Addon(), null, "addAddon", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAddon(), "addon", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__AddRoom__Room(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RemoveAddon__Addon(), null, "removeAddon", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAddon(), "addon", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RemoveRoom__Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__GenerateBill(), this.getBill(), "generateBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__Pay__Bill(), ecorePackage.getEBoolean(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__AddDiscount__Discount(), null, "addDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooking__RemoveDiscount__Discount(), null, "removeDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditcardEClass, Creditcard.class, "Creditcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditcard_Number(), ecorePackage.getELong(), "number", null, 1, 1, Creditcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditcard_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, Creditcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditcard_Cvc(), ecorePackage.getEInt(), "cvc", null, 1, 1, Creditcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditcard_Owner(), theTypesPackage.getString(), "owner", null, 1, 1, Creditcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCreditcard__Validate(), ecorePackage.getEBoolean(), "validate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_CustomerID(), ecorePackage.getEInt(), "customerID", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_BonusPoints(), ecorePackage.getEInt(), "bonusPoints", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_MiscInfo(), theTypesPackage.getString(), "miscInfo", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Rank(), ecorePackage.getEDouble(), "rank", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCustomer__AddBonusPoints__int(), null, "addBonusPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bonusPoints", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(addonEClass, Addon.class, "Addon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddon_Name(), theTypesPackage.getString(), "name", null, 1, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddon_Description(), theTypesPackage.getString(), "description", null, 1, 1, Addon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Size(), ecorePackage.getEDouble(), "size", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_InternalComment(), theTypesPackage.getString(), "internalComment", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Booked(), ecorePackage.getEBoolean(), "booked", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_MaxNbrPeople(), ecorePackage.getEInt(), "maxNbrPeople", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_UnderCleaning(), ecorePackage.getEBoolean(), "underCleaning", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_UnderRepair(), ecorePackage.getEBoolean(), "underRepair", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Types(), this.getRoomType(), "types", null, 1, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomName(), theTypesPackage.getString(), "roomName", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoom__SetCleanedStatus__CleaningStatus(), null, "setCleanedStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCleaningStatus(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBill_Costables(), this.getCostable(), null, "costables", null, 1, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_TotalPrice(), ecorePackage.getEDouble(), "totalPrice", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_ValueAddedTax(), ecorePackage.getEDouble(), "valueAddedTax", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Final(), ecorePackage.getEBoolean(), "final", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(costableEClass, Costable.class, "Costable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCostable_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Costable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCostable_Discount(), this.getDiscount(), null, "discount", null, 1, 1, Costable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCostable__AddDiscount(), null, "addDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCostable__RemoveDiscount(), null, "removeDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(discountEClass, Discount.class, "Discount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscount_IsPercentage(), theTypesPackage.getBoolean(), "isPercentage", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiscount_Amount(), ecorePackage.getEDouble(), "amount", null, 1, 1, Discount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingControllerEClass, BookingController.class, "BookingController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingController__SearchAvailableRoomTypes__Date_Date_int_int(), this.getRoomType(), "searchAvailableRoomTypes", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "fromDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "toDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrOfAdults", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbrOfChildren", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__CreateBooking__EList(), ecorePackage.getEBoolean(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomType(), "roomTypes", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__SendConfirmation__Booking(), ecorePackage.getEBoolean(), "sendConfirmation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__UpdateBooking__Booking(), ecorePackage.getEBoolean(), "updateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__Confirm__Booking(), ecorePackage.getEBoolean(), "confirm", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__CheckIn__Booking(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__CreateKeyCard__Room(), null, "createKeyCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__CheckOut__Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__SaveCustomer__Customer(), null, "saveCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__FindCustomer__String(), null, "findCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingController__AssignRoom__Room(), null, "assignRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(managementControllerEClass, ManagementController.class, "ManagementController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getManagementController__RegisterDiscount__Discount_Costable(), null, "registerDiscount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDiscount(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCostable(), "costable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagementController__RegisterCostable__Costable(), null, "registerCostable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCostable(), "costable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagementController__UpdateCostable__Costable(), null, "updateCostable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCostable(), "costable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagementController__ModifyBooking__Booking(), null, "modifyBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagementController__SetDateSpecificPrices__Costable_Date_Date_double(), null, "setDateSpecificPrices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCostable(), "costable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "startDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "endDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "priceChange", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(maintenanceControllerEClass, MaintenanceController.class, "MaintenanceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaintenanceController_RoomStack(), this.getRoom(), null, "roomStack", null, 0, -1, MaintenanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMaintenanceController__AddToStack__Room(), null, "addToStack", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceController__SetStatus__Room_CleaningStatus(), null, "setStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCleaningStatus(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceController__NotifyWorker__EmployeeType(), null, "notifyWorker", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getEmployeeType(), "worker", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceController__RemoveFromStack__Room(), null, "removeFromStack", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMaintenanceController__GetNextRoomToClean__Room(), null, "getNextRoomToClean", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Name(), theTypesPackage.getString(), "name", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Address(), theTypesPackage.getString(), "address", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Rank(), ecorePackage.getEDouble(), "rank", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHotel__Authenticate__String_String(), null, "authenticate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel__GetBookingController(), null, "getBookingController", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel__GetManagementController(), null, "getManagementController", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getHotel__GetMaintenanceController(), null, "getMaintenanceController", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookedRoomEClass, BookedRoom.class, "BookedRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookedRoom_Addons(), this.getAddon(), null, "addons", null, 0, -1, BookedRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookedRoom__AddAddon__Addon(), null, "addAddon", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAddon(), "addon", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookedRoom__RemoveAddon__Addon(), null, "removeAddon", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAddon(), "addon", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interaction1EClass, Interaction1.class, "Interaction1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction1__(), this.getEmployee(), null, "_", null, 1, 1, Interaction1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interaction2EClass, Interaction2.class, "Interaction2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction2__(), this.getEmployee(), null, "_", null, 1, 1, Interaction2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interaction3EClass, Interaction3.class, "Interaction3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction3__(), this.getMaintenanceController(), null, "_", null, 1, 1, Interaction3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interaction4EClass, Interaction4.class, "Interaction4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction4__(), this.getEmployee(), null, "_", null, 1, 1, Interaction4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interaction5EClass, Interaction5.class, "Interaction5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction5__(), this.getBooking(), null, "_", null, 1, 1, Interaction5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.RECEPTIONIST);
		addEEnumLiteral(eTypeEEnum, EType.CLEANER);
		addEEnumLiteral(eTypeEEnum, EType.MANAGER);

		initEEnum(roomTypeEEnum, RoomType.class, "RoomType");
		addEEnumLiteral(roomTypeEEnum, RoomType.HANDICAPABLE);
		addEEnumLiteral(roomTypeEEnum, RoomType.DOUBLE);
		addEEnumLiteral(roomTypeEEnum, RoomType.SINGLE);
		addEEnumLiteral(roomTypeEEnum, RoomType.SUITE);

		initEEnum(cleaningStatusEEnum, CleaningStatus.class, "CleaningStatus");
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.CLEAN);
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.NEEDCLEANING);
		addEEnumLiteral(cleaningStatusEEnum, CleaningStatus.BUSY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (cleaningStatusEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "originalName", "Need cleaning"
		   });	
		addAnnotation
		  (getInteraction1__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });	
		addAnnotation
		  (getInteraction2__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });	
		addAnnotation
		  (getInteraction3__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });	
		addAnnotation
		  (getInteraction4__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });	
		addAnnotation
		  (getInteraction5__(), 
		   source, 
		   new String[] {
			 "originalName", ""
		   });
	}

} //HotelManagementClassDiagramPackageImpl
