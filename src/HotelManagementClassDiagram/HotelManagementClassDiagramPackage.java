/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface HotelManagementClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HotelManagementClassDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///HotelManagementClassDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HotelManagementClassDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelManagementClassDiagramPackage eINSTANCE = HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.PersonImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SS_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STREET = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CITY = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TITLE = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.EmployeeImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SS_NUMBER = PERSON__SS_NUMBER;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PHONE_NUMBER = PERSON__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__STREET = PERSON__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CITY = PERSON__CITY;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__POSTAL_CODE = PERSON__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TITLE = PERSON__TITLE;

	/**
	 * The feature id for the '<em><b>Employee Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_TYPE = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_ID = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__WORK_RATE = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__SALARY = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___BOOKING = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___BOOLEAN = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ROOM_TYPES = PERSON_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.EmployeeTypeImpl <em>Employee Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.EmployeeTypeImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEmployeeType()
	 * @generated
	 */
	int EMPLOYEE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Acess Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_TYPE__ACESS_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Employee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Employee Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.BookingImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 3;

	/**
	 * The feature id for the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CREDIT_CARD = 4;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ADDONS = 6;

	/**
	 * The feature id for the '<em><b>Booked Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKED_ROOMS = 7;

	/**
	 * The feature id for the '<em><b>Internal Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__INTERNAL_COMMENTS = 8;

	/**
	 * The feature id for the '<em><b>External Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__EXTERNAL_COMMENTS = 9;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_IN = 10;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_OUT = 11;

	/**
	 * The feature id for the '<em><b>Payment Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PAYMENT_MASTER = 12;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DISCOUNTS = 13;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_IN = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_OUT = 1;

	/**
	 * The operation id for the '<em>Add Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_ADDON__ADDON = 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_ROOM__ROOM = 3;

	/**
	 * The operation id for the '<em>Remove Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REMOVE_ADDON__ADDON = 4;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REMOVE_ROOM__ROOM = 5;

	/**
	 * The operation id for the '<em>Generate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GENERATE_BILL = 6;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___PAY__BILL = 7;

	/**
	 * The operation id for the '<em>Add Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_DISCOUNT__DISCOUNT = 8;

	/**
	 * The operation id for the '<em>Remove Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REMOVE_DISCOUNT__DISCOUNT = 9;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.CreditcardImpl <em>Creditcard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.CreditcardImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCreditcard()
	 * @generated
	 */
	int CREDITCARD = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Cvc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD__CVC = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Expiration Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD__EXPIRATION_MONTH = 3;

	/**
	 * The feature id for the '<em><b>Expiration Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD__EXPIRATION_DAY = 4;

	/**
	 * The number of structural features of the '<em>Creditcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Creditcard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDITCARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.CustomerImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>SS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SS_NUMBER = PERSON__SS_NUMBER;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUMBER = PERSON__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__STREET = PERSON__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CITY = PERSON__CITY;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__POSTAL_CODE = PERSON__POSTAL_CODE;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__COUNTRY = PERSON__COUNTRY;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__GENDER = PERSON__GENDER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TITLE = PERSON__TITLE;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bonus Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BONUS_POINTS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Misc Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MISC_INFO = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RANK = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Bonus Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_BONUS_POINTS__INT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.ExtraImpl <em>Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.ExtraImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getExtra()
	 * @generated
	 */
	int EXTRA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.AddonImpl <em>Addon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.AddonImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getAddon()
	 * @generated
	 */
	int ADDON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__NAME = EXTRA__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON__DESCRIPTION = EXTRA__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Addon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON_FEATURE_COUNT = EXTRA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDON_OPERATION_COUNT = EXTRA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.RoomImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 9;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.BillImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 11;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.Costable <em>Costable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.Costable
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCostable()
	 * @generated
	 */
	int COSTABLE = 12;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.DiscountImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 10;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.BookingControllerImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBookingController()
	 * @generated
	 */
	int BOOKING_CONTROLLER = 13;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.ManagementControllerImpl <em>Management Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.ManagementControllerImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getManagementController()
	 * @generated
	 */
	int MANAGEMENT_CONTROLLER = 14;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.MaintenanceControllerImpl <em>Maintenance Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.MaintenanceControllerImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getMaintenanceController()
	 * @generated
	 */
	int MAINTENANCE_CONTROLLER = 15;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.HotelImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getHotel()
	 * @generated
	 */
	int HOTEL = 16;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.BookedRoomImpl <em>Booked Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.BookedRoomImpl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBookedRoom()
	 * @generated
	 */
	int BOOKED_ROOM = 8;

	/**
	 * The feature id for the '<em><b>Addons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM__ADDONS = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM__ROOM = 1;

	/**
	 * The number of structural features of the '<em>Booked Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM___ADD_ADDON__ADDON = 0;

	/**
	 * The operation id for the '<em>Remove Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM___REMOVE_ADDON__ADDON = 1;

	/**
	 * The number of operations of the '<em>Booked Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKED_ROOM_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Internal Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__INTERNAL_COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Booked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BOOKED = 3;

	/**
	 * The feature id for the '<em><b>Max Nbr People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__MAX_NBR_PEOPLE = 4;

	/**
	 * The feature id for the '<em><b>Under Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__UNDER_CLEANING = 5;

	/**
	 * The feature id for the '<em><b>Under Repair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__UNDER_REPAIR = 6;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPES = 7;

	/**
	 * The feature id for the '<em><b>Room Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NAME = 8;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__IS_PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Costables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__COSTABLES = 0;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__TOTAL_PRICE = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Value Added Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__VALUE_ADDED_TAX = 3;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__FINAL = 4;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PAID = 5;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Costable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___ADD_COSTABLE__COSTABLE = 0;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE__DISCOUNTS = 1;

	/**
	 * The number of structural features of the '<em>Costable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE___ADD_DISCOUNT = 0;

	/**
	 * The operation id for the '<em>Remove Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE___REMOVE_DISCOUNT = 1;

	/**
	 * The number of operations of the '<em>Costable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSTABLE_OPERATION_COUNT = 2;

	/**
	 * The number of structural features of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search Available Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CREATE_BOOKING__ELIST = 1;

	/**
	 * The operation id for the '<em>Send Confirmation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___SEND_CONFIRMATION__BOOKING = 2;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___UPDATE_BOOKING__BOOKING = 3;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___GET_BOOKING__INT = 4;

	/**
	 * The operation id for the '<em>Confirm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CONFIRM__BOOKING = 5;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CHECK_IN__BOOKING = 6;

	/**
	 * The operation id for the '<em>Create Key Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CREATE_KEY_CARD__ROOM = 7;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___CHECK_OUT__BOOKING = 8;

	/**
	 * The operation id for the '<em>Save Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___SAVE_CUSTOMER__CUSTOMER = 9;

	/**
	 * The operation id for the '<em>Find Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___FIND_CUSTOMER__STRING = 10;

	/**
	 * The operation id for the '<em>Assign Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER___ASSIGN_ROOM__ROOM = 11;

	/**
	 * The number of operations of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_OPERATION_COUNT = 12;

	/**
	 * The number of structural features of the '<em>Management Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Register Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___REGISTER_DISCOUNT__DISCOUNT = 0;

	/**
	 * The operation id for the '<em>Modify Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___MODIFY_BOOKING__BOOKING = 1;

	/**
	 * The operation id for the '<em>Set Date Specific Prices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___SET_DATE_SPECIFIC_PRICES__COSTABLE_DATE_DATE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Register Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___REGISTER_ROOM__ROOM = 3;

	/**
	 * The operation id for the '<em>Register Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___REGISTER_ADDON__ADDON = 4;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___UPDATE_ROOM__ROOM = 5;

	/**
	 * The operation id for the '<em>Update Addon</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER___UPDATE_ADDON__ADDON = 6;

	/**
	 * The number of operations of the '<em>Management Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_CONTROLLER_OPERATION_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Room Stack</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER__ROOM_STACK = 0;

	/**
	 * The number of structural features of the '<em>Maintenance Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add To Stack</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER___ADD_TO_STACK__ROOM = 0;

	/**
	 * The operation id for the '<em>Set Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER___SET_STATUS__ROOM_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Notify Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER___NOTIFY_WORKER__EMPLOYEETYPE = 2;

	/**
	 * The operation id for the '<em>Remove From Stack</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER___REMOVE_FROM_STACK__ROOM = 3;

	/**
	 * The operation id for the '<em>Get Next Room To Clean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER___GET_NEXT_ROOM_TO_CLEAN__ROOM = 4;

	/**
	 * The number of operations of the '<em>Maintenance Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_CONTROLLER_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL__RANK = 2;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL___AUTHENTICATE__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Get Booking Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL___GET_BOOKING_CONTROLLER = 1;

	/**
	 * The operation id for the '<em>Get Management Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL___GET_MANAGEMENT_CONTROLLER = 2;

	/**
	 * The operation id for the '<em>Get Maintenance Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL___GET_MAINTENANCE_CONTROLLER = 3;

	/**
	 * The number of operations of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.Interaction1Impl <em>Interaction1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.Interaction1Impl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction1()
	 * @generated
	 */
	int INTERACTION1 = 17;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.Interaction2Impl <em>Interaction2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.Interaction2Impl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction2()
	 * @generated
	 */
	int INTERACTION2 = 18;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION2__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.Interaction3Impl <em>Interaction3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.Interaction3Impl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction3()
	 * @generated
	 */
	int INTERACTION3 = 19;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION3__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION3_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.Interaction4Impl <em>Interaction4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.Interaction4Impl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction4()
	 * @generated
	 */
	int INTERACTION4 = 20;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION4__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION4_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION4_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.impl.Interaction5Impl <em>Interaction5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.impl.Interaction5Impl
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction5()
	 * @generated
	 */
	int INTERACTION5 = 21;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION5__ = 0;

	/**
	 * The number of structural features of the '<em>Interaction5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION5_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION5_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.EType
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 22;

	/**
	 * The meta object id for the '{@link HotelManagementClassDiagram.RoomType <em>Room Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HotelManagementClassDiagram.RoomType
	 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 23;

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see HotelManagementClassDiagram.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Employee#getEmployeeType <em>Employee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee Type</em>'.
	 * @see HotelManagementClassDiagram.Employee#getEmployeeType()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_EmployeeType();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Employee#getEmployeeID <em>Employee ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee ID</em>'.
	 * @see HotelManagementClassDiagram.Employee#getEmployeeID()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmployeeID();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Employee#getWorkRate <em>Work Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Rate</em>'.
	 * @see HotelManagementClassDiagram.Employee#getWorkRate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_WorkRate();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Employee#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see HotelManagementClassDiagram.Employee#getSalary()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Salary();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Employee#Booking() <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see HotelManagementClassDiagram.Employee#Booking()
	 * @generated
	 */
	EOperation getEmployee__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Employee#Boolean() <em>Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boolean</em>' operation.
	 * @see HotelManagementClassDiagram.Employee#Boolean()
	 * @generated
	 */
	EOperation getEmployee__Boolean();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Employee#roomTypes() <em>Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Room Types</em>' operation.
	 * @see HotelManagementClassDiagram.Employee#roomTypes()
	 * @generated
	 */
	EOperation getEmployee__RoomTypes();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see HotelManagementClassDiagram.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HotelManagementClassDiagram.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getSSNumber <em>SS Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SS Number</em>'.
	 * @see HotelManagementClassDiagram.Person#getSSNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SSNumber();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see HotelManagementClassDiagram.Person#getPhoneNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see HotelManagementClassDiagram.Person#getStreet()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Street();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see HotelManagementClassDiagram.Person#getCity()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_City();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see HotelManagementClassDiagram.Person#getPostalCode()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see HotelManagementClassDiagram.Person#getCountry()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Country();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see HotelManagementClassDiagram.Person#getGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Person#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see HotelManagementClassDiagram.Person#getTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Title();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.EmployeeType <em>Employee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Type</em>'.
	 * @see HotelManagementClassDiagram.EmployeeType
	 * @generated
	 */
	EClass getEmployeeType();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.EmployeeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see HotelManagementClassDiagram.EmployeeType#getType()
	 * @see #getEmployeeType()
	 * @generated
	 */
	EAttribute getEmployeeType_Type();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.EmployeeType#getAcessLevel <em>Acess Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acess Level</em>'.
	 * @see HotelManagementClassDiagram.EmployeeType#getAcessLevel()
	 * @see #getEmployeeType()
	 * @generated
	 */
	EAttribute getEmployeeType_AcessLevel();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see HotelManagementClassDiagram.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getBookingId <em>Booking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Id</em>'.
	 * @see HotelManagementClassDiagram.Booking#getBookingId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingId();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see HotelManagementClassDiagram.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see HotelManagementClassDiagram.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see HotelManagementClassDiagram.Booking#getCreated()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Created();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Booking#getCreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card</em>'.
	 * @see HotelManagementClassDiagram.Booking#getCreditCard()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_CreditCard();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see HotelManagementClassDiagram.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.Booking#getAddons <em>Addons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addons</em>'.
	 * @see HotelManagementClassDiagram.Booking#getAddons()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Addons();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.Booking#getBookedRooms <em>Booked Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booked Rooms</em>'.
	 * @see HotelManagementClassDiagram.Booking#getBookedRooms()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_BookedRooms();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getInternalComments <em>Internal Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Comments</em>'.
	 * @see HotelManagementClassDiagram.Booking#getInternalComments()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_InternalComments();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#getExternalComments <em>External Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Comments</em>'.
	 * @see HotelManagementClassDiagram.Booking#getExternalComments()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_ExternalComments();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see HotelManagementClassDiagram.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Booking#isCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see HotelManagementClassDiagram.Booking#isCheckedOut()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedOut();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Booking#getPaymentMaster <em>Payment Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Master</em>'.
	 * @see HotelManagementClassDiagram.Booking#getPaymentMaster()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_PaymentMaster();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.Booking#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discounts</em>'.
	 * @see HotelManagementClassDiagram.Booking#getDiscounts()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Discounts();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#checkIn()
	 * @generated
	 */
	EOperation getBooking__CheckIn();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#checkOut()
	 * @generated
	 */
	EOperation getBooking__CheckOut();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#addAddon(HotelManagementClassDiagram.Addon) <em>Add Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Addon</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#addAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getBooking__AddAddon__Addon();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#addRoom(HotelManagementClassDiagram.Room) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#addRoom(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getBooking__AddRoom__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#removeAddon(HotelManagementClassDiagram.Addon) <em>Remove Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Addon</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#removeAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getBooking__RemoveAddon__Addon();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#removeRoom(HotelManagementClassDiagram.Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#removeRoom(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getBooking__RemoveRoom__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#generateBill() <em>Generate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Bill</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#generateBill()
	 * @generated
	 */
	EOperation getBooking__GenerateBill();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#pay(HotelManagementClassDiagram.Bill) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#pay(HotelManagementClassDiagram.Bill)
	 * @generated
	 */
	EOperation getBooking__Pay__Bill();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#addDiscount(HotelManagementClassDiagram.Discount) <em>Add Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discount</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#addDiscount(HotelManagementClassDiagram.Discount)
	 * @generated
	 */
	EOperation getBooking__AddDiscount__Discount();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Booking#removeDiscount(HotelManagementClassDiagram.Discount) <em>Remove Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Discount</em>' operation.
	 * @see HotelManagementClassDiagram.Booking#removeDiscount(HotelManagementClassDiagram.Discount)
	 * @generated
	 */
	EOperation getBooking__RemoveDiscount__Discount();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Creditcard <em>Creditcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creditcard</em>'.
	 * @see HotelManagementClassDiagram.Creditcard
	 * @generated
	 */
	EClass getCreditcard();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Creditcard#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see HotelManagementClassDiagram.Creditcard#getNumber()
	 * @see #getCreditcard()
	 * @generated
	 */
	EAttribute getCreditcard_Number();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Creditcard#getCvc <em>Cvc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvc</em>'.
	 * @see HotelManagementClassDiagram.Creditcard#getCvc()
	 * @see #getCreditcard()
	 * @generated
	 */
	EAttribute getCreditcard_Cvc();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Creditcard#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see HotelManagementClassDiagram.Creditcard#getOwner()
	 * @see #getCreditcard()
	 * @generated
	 */
	EAttribute getCreditcard_Owner();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Creditcard#getExpirationMonth <em>Expiration Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Month</em>'.
	 * @see HotelManagementClassDiagram.Creditcard#getExpirationMonth()
	 * @see #getCreditcard()
	 * @generated
	 */
	EAttribute getCreditcard_ExpirationMonth();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Creditcard#getExpirationDay <em>Expiration Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Day</em>'.
	 * @see HotelManagementClassDiagram.Creditcard#getExpirationDay()
	 * @see #getCreditcard()
	 * @generated
	 */
	EAttribute getCreditcard_ExpirationDay();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see HotelManagementClassDiagram.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Customer#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see HotelManagementClassDiagram.Customer#getCustomerID()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerID();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Customer#getBonusPoints <em>Bonus Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus Points</em>'.
	 * @see HotelManagementClassDiagram.Customer#getBonusPoints()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BonusPoints();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Customer#getMiscInfo <em>Misc Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Misc Info</em>'.
	 * @see HotelManagementClassDiagram.Customer#getMiscInfo()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_MiscInfo();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Customer#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see HotelManagementClassDiagram.Customer#getRank()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Rank();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Customer#addBonusPoints(int) <em>Add Bonus Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Bonus Points</em>' operation.
	 * @see HotelManagementClassDiagram.Customer#addBonusPoints(int)
	 * @generated
	 */
	EOperation getCustomer__AddBonusPoints__int();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Addon <em>Addon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addon</em>'.
	 * @see HotelManagementClassDiagram.Addon
	 * @generated
	 */
	EClass getAddon();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra</em>'.
	 * @see HotelManagementClassDiagram.Extra
	 * @generated
	 */
	EClass getExtra();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Extra#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HotelManagementClassDiagram.Extra#getName()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Name();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Extra#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see HotelManagementClassDiagram.Extra#getDescription()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Description();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see HotelManagementClassDiagram.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see HotelManagementClassDiagram.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see HotelManagementClassDiagram.Room#getSize()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Size();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#getInternalComment <em>Internal Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Comment</em>'.
	 * @see HotelManagementClassDiagram.Room#getInternalComment()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_InternalComment();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#isBooked <em>Booked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booked</em>'.
	 * @see HotelManagementClassDiagram.Room#isBooked()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Booked();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#getMaxNbrPeople <em>Max Nbr People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Nbr People</em>'.
	 * @see HotelManagementClassDiagram.Room#getMaxNbrPeople()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_MaxNbrPeople();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#isUnderCleaning <em>Under Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under Cleaning</em>'.
	 * @see HotelManagementClassDiagram.Room#isUnderCleaning()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_UnderCleaning();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#isUnderRepair <em>Under Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Under Repair</em>'.
	 * @see HotelManagementClassDiagram.Room#isUnderRepair()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_UnderRepair();

	/**
	 * Returns the meta object for the attribute list '{@link HotelManagementClassDiagram.Room#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see HotelManagementClassDiagram.Room#getTypes()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Types();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Room#getRoomName <em>Room Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Name</em>'.
	 * @see HotelManagementClassDiagram.Room#getRoomName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomName();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see HotelManagementClassDiagram.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.Bill#getCostables <em>Costables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Costables</em>'.
	 * @see HotelManagementClassDiagram.Bill#getCostables()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Costables();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Bill#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see HotelManagementClassDiagram.Bill#getTotalPrice()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_TotalPrice();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Bill#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see HotelManagementClassDiagram.Bill#getCustomer()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Customer();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Bill#getValueAddedTax <em>Value Added Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Added Tax</em>'.
	 * @see HotelManagementClassDiagram.Bill#getValueAddedTax()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_ValueAddedTax();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Bill#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see HotelManagementClassDiagram.Bill#isFinal()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Final();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Bill#isPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see HotelManagementClassDiagram.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Paid();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Bill#addCostable(HotelManagementClassDiagram.Costable) <em>Add Costable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Costable</em>' operation.
	 * @see HotelManagementClassDiagram.Bill#addCostable(HotelManagementClassDiagram.Costable)
	 * @generated
	 */
	EOperation getBill__AddCostable__Costable();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Costable <em>Costable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Costable</em>'.
	 * @see HotelManagementClassDiagram.Costable
	 * @generated
	 */
	EClass getCostable();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Costable#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see HotelManagementClassDiagram.Costable#getPrice()
	 * @see #getCostable()
	 * @generated
	 */
	EAttribute getCostable_Price();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.Costable#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discounts</em>'.
	 * @see HotelManagementClassDiagram.Costable#getDiscounts()
	 * @see #getCostable()
	 * @generated
	 */
	EReference getCostable_Discounts();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Costable#addDiscount() <em>Add Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discount</em>' operation.
	 * @see HotelManagementClassDiagram.Costable#addDiscount()
	 * @generated
	 */
	EOperation getCostable__AddDiscount();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Costable#removeDiscount() <em>Remove Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Discount</em>' operation.
	 * @see HotelManagementClassDiagram.Costable#removeDiscount()
	 * @generated
	 */
	EOperation getCostable__RemoveDiscount();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see HotelManagementClassDiagram.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Discount#isPercentage <em>Is Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Percentage</em>'.
	 * @see HotelManagementClassDiagram.Discount#isPercentage()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_IsPercentage();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Discount#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see HotelManagementClassDiagram.Discount#getAmount()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Amount();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Controller</em>'.
	 * @see HotelManagementClassDiagram.BookingController
	 * @generated
	 */
	EClass getBookingController();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#searchAvailableRoomTypes(java.util.Date, java.util.Date, int, int) <em>Search Available Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Available Room Types</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#searchAvailableRoomTypes(java.util.Date, java.util.Date, int, int)
	 * @generated
	 */
	EOperation getBookingController__SearchAvailableRoomTypes__Date_Date_int_int();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#createBooking(org.eclipse.emf.common.util.EList) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#createBooking(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBookingController__CreateBooking__EList();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#sendConfirmation(HotelManagementClassDiagram.Booking) <em>Send Confirmation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Confirmation</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#sendConfirmation(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getBookingController__SendConfirmation__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#updateBooking(HotelManagementClassDiagram.Booking) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#updateBooking(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getBookingController__UpdateBooking__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#getBooking(int)
	 * @generated
	 */
	EOperation getBookingController__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#confirm(HotelManagementClassDiagram.Booking) <em>Confirm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#confirm(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getBookingController__Confirm__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#checkIn(HotelManagementClassDiagram.Booking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#checkIn(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getBookingController__CheckIn__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#createKeyCard(HotelManagementClassDiagram.Room) <em>Create Key Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Key Card</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#createKeyCard(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getBookingController__CreateKeyCard__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#checkOut(HotelManagementClassDiagram.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#checkOut(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getBookingController__CheckOut__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#saveCustomer(HotelManagementClassDiagram.Customer) <em>Save Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Customer</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#saveCustomer(HotelManagementClassDiagram.Customer)
	 * @generated
	 */
	EOperation getBookingController__SaveCustomer__Customer();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#findCustomer(java.lang.String) <em>Find Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Customer</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#findCustomer(java.lang.String)
	 * @generated
	 */
	EOperation getBookingController__FindCustomer__String();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookingController#assignRoom(HotelManagementClassDiagram.Room) <em>Assign Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Room</em>' operation.
	 * @see HotelManagementClassDiagram.BookingController#assignRoom(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getBookingController__AssignRoom__Room();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.ManagementController <em>Management Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Controller</em>'.
	 * @see HotelManagementClassDiagram.ManagementController
	 * @generated
	 */
	EClass getManagementController();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#registerDiscount(HotelManagementClassDiagram.Discount) <em>Register Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Discount</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#registerDiscount(HotelManagementClassDiagram.Discount)
	 * @generated
	 */
	EOperation getManagementController__RegisterDiscount__Discount();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#modifyBooking(HotelManagementClassDiagram.Booking) <em>Modify Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Booking</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#modifyBooking(HotelManagementClassDiagram.Booking)
	 * @generated
	 */
	EOperation getManagementController__ModifyBooking__Booking();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#setDateSpecificPrices(HotelManagementClassDiagram.Costable, java.util.Date, java.util.Date, double) <em>Set Date Specific Prices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date Specific Prices</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#setDateSpecificPrices(HotelManagementClassDiagram.Costable, java.util.Date, java.util.Date, double)
	 * @generated
	 */
	EOperation getManagementController__SetDateSpecificPrices__Costable_Date_Date_double();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#registerRoom(HotelManagementClassDiagram.Room) <em>Register Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Room</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#registerRoom(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getManagementController__RegisterRoom__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#registerAddon(HotelManagementClassDiagram.Addon) <em>Register Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Addon</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#registerAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getManagementController__RegisterAddon__Addon();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#updateRoom(HotelManagementClassDiagram.Room) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#updateRoom(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getManagementController__UpdateRoom__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.ManagementController#updateAddon(HotelManagementClassDiagram.Addon) <em>Update Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Addon</em>' operation.
	 * @see HotelManagementClassDiagram.ManagementController#updateAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getManagementController__UpdateAddon__Addon();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.MaintenanceController <em>Maintenance Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance Controller</em>'.
	 * @see HotelManagementClassDiagram.MaintenanceController
	 * @generated
	 */
	EClass getMaintenanceController();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.MaintenanceController#getRoomStack <em>Room Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Stack</em>'.
	 * @see HotelManagementClassDiagram.MaintenanceController#getRoomStack()
	 * @see #getMaintenanceController()
	 * @generated
	 */
	EReference getMaintenanceController_RoomStack();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.MaintenanceController#addToStack(HotelManagementClassDiagram.Room) <em>Add To Stack</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Stack</em>' operation.
	 * @see HotelManagementClassDiagram.MaintenanceController#addToStack(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getMaintenanceController__AddToStack__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.MaintenanceController#setStatus(HotelManagementClassDiagram.Room, boolean) <em>Set Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Status</em>' operation.
	 * @see HotelManagementClassDiagram.MaintenanceController#setStatus(HotelManagementClassDiagram.Room, boolean)
	 * @generated
	 */
	EOperation getMaintenanceController__SetStatus__Room_boolean();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.MaintenanceController#notifyWorker(HotelManagementClassDiagram.EmployeeType) <em>Notify Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Worker</em>' operation.
	 * @see HotelManagementClassDiagram.MaintenanceController#notifyWorker(HotelManagementClassDiagram.EmployeeType)
	 * @generated
	 */
	EOperation getMaintenanceController__NotifyWorker__EmployeeType();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.MaintenanceController#removeFromStack(HotelManagementClassDiagram.Room) <em>Remove From Stack</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove From Stack</em>' operation.
	 * @see HotelManagementClassDiagram.MaintenanceController#removeFromStack(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getMaintenanceController__RemoveFromStack__Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.MaintenanceController#getNextRoomToClean(HotelManagementClassDiagram.Room) <em>Get Next Room To Clean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next Room To Clean</em>' operation.
	 * @see HotelManagementClassDiagram.MaintenanceController#getNextRoomToClean(HotelManagementClassDiagram.Room)
	 * @generated
	 */
	EOperation getMaintenanceController__GetNextRoomToClean__Room();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see HotelManagementClassDiagram.Hotel
	 * @generated
	 */
	EClass getHotel();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Hotel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see HotelManagementClassDiagram.Hotel#getName()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Name();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Hotel#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see HotelManagementClassDiagram.Hotel#getAddress()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Address();

	/**
	 * Returns the meta object for the attribute '{@link HotelManagementClassDiagram.Hotel#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see HotelManagementClassDiagram.Hotel#getRank()
	 * @see #getHotel()
	 * @generated
	 */
	EAttribute getHotel_Rank();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Hotel#authenticate(java.lang.String, java.lang.String) <em>Authenticate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authenticate</em>' operation.
	 * @see HotelManagementClassDiagram.Hotel#authenticate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getHotel__Authenticate__String_String();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Hotel#getBookingController() <em>Get Booking Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Controller</em>' operation.
	 * @see HotelManagementClassDiagram.Hotel#getBookingController()
	 * @generated
	 */
	EOperation getHotel__GetBookingController();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Hotel#getManagementController() <em>Get Management Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Management Controller</em>' operation.
	 * @see HotelManagementClassDiagram.Hotel#getManagementController()
	 * @generated
	 */
	EOperation getHotel__GetManagementController();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.Hotel#getMaintenanceController() <em>Get Maintenance Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maintenance Controller</em>' operation.
	 * @see HotelManagementClassDiagram.Hotel#getMaintenanceController()
	 * @generated
	 */
	EOperation getHotel__GetMaintenanceController();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.BookedRoom <em>Booked Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booked Room</em>'.
	 * @see HotelManagementClassDiagram.BookedRoom
	 * @generated
	 */
	EClass getBookedRoom();

	/**
	 * Returns the meta object for the reference list '{@link HotelManagementClassDiagram.BookedRoom#getAddons <em>Addons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addons</em>'.
	 * @see HotelManagementClassDiagram.BookedRoom#getAddons()
	 * @see #getBookedRoom()
	 * @generated
	 */
	EReference getBookedRoom_Addons();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.BookedRoom#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see HotelManagementClassDiagram.BookedRoom#getRoom()
	 * @see #getBookedRoom()
	 * @generated
	 */
	EReference getBookedRoom_Room();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookedRoom#addAddon(HotelManagementClassDiagram.Addon) <em>Add Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Addon</em>' operation.
	 * @see HotelManagementClassDiagram.BookedRoom#addAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getBookedRoom__AddAddon__Addon();

	/**
	 * Returns the meta object for the '{@link HotelManagementClassDiagram.BookedRoom#removeAddon(HotelManagementClassDiagram.Addon) <em>Remove Addon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Addon</em>' operation.
	 * @see HotelManagementClassDiagram.BookedRoom#removeAddon(HotelManagementClassDiagram.Addon)
	 * @generated
	 */
	EOperation getBookedRoom__RemoveAddon__Addon();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Interaction1 <em>Interaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction1</em>'.
	 * @see HotelManagementClassDiagram.Interaction1
	 * @generated
	 */
	EClass getInteraction1();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Interaction1#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see HotelManagementClassDiagram.Interaction1#get_()
	 * @see #getInteraction1()
	 * @generated
	 */
	EReference getInteraction1__();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Interaction2 <em>Interaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction2</em>'.
	 * @see HotelManagementClassDiagram.Interaction2
	 * @generated
	 */
	EClass getInteraction2();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Interaction2#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see HotelManagementClassDiagram.Interaction2#get_()
	 * @see #getInteraction2()
	 * @generated
	 */
	EReference getInteraction2__();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Interaction3 <em>Interaction3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction3</em>'.
	 * @see HotelManagementClassDiagram.Interaction3
	 * @generated
	 */
	EClass getInteraction3();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Interaction3#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see HotelManagementClassDiagram.Interaction3#get_()
	 * @see #getInteraction3()
	 * @generated
	 */
	EReference getInteraction3__();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Interaction4 <em>Interaction4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction4</em>'.
	 * @see HotelManagementClassDiagram.Interaction4
	 * @generated
	 */
	EClass getInteraction4();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Interaction4#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see HotelManagementClassDiagram.Interaction4#get_()
	 * @see #getInteraction4()
	 * @generated
	 */
	EReference getInteraction4__();

	/**
	 * Returns the meta object for class '{@link HotelManagementClassDiagram.Interaction5 <em>Interaction5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction5</em>'.
	 * @see HotelManagementClassDiagram.Interaction5
	 * @generated
	 */
	EClass getInteraction5();

	/**
	 * Returns the meta object for the reference '{@link HotelManagementClassDiagram.Interaction5#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see HotelManagementClassDiagram.Interaction5#get_()
	 * @see #getInteraction5()
	 * @generated
	 */
	EReference getInteraction5__();

	/**
	 * Returns the meta object for enum '{@link HotelManagementClassDiagram.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see HotelManagementClassDiagram.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link HotelManagementClassDiagram.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Type</em>'.
	 * @see HotelManagementClassDiagram.RoomType
	 * @generated
	 */
	EEnum getRoomType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelManagementClassDiagramFactory getHotelManagementClassDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.EmployeeImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__EMPLOYEE_TYPE = eINSTANCE.getEmployee_EmployeeType();

		/**
		 * The meta object literal for the '<em><b>Employee ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getEmployee_EmployeeID();

		/**
		 * The meta object literal for the '<em><b>Work Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__WORK_RATE = eINSTANCE.getEmployee_WorkRate();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__SALARY = eINSTANCE.getEmployee_Salary();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___BOOKING = eINSTANCE.getEmployee__Booking();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___BOOLEAN = eINSTANCE.getEmployee__Boolean();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___ROOM_TYPES = eINSTANCE.getEmployee__RoomTypes();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.PersonImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>SS Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SS_NUMBER = eINSTANCE.getPerson_SSNumber();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PHONE_NUMBER = eINSTANCE.getPerson_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__STREET = eINSTANCE.getPerson_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CITY = eINSTANCE.getPerson_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__POSTAL_CODE = eINSTANCE.getPerson_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__COUNTRY = eINSTANCE.getPerson_Country();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TITLE = eINSTANCE.getPerson_Title();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.EmployeeTypeImpl <em>Employee Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.EmployeeTypeImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEmployeeType()
		 * @generated
		 */
		EClass EMPLOYEE_TYPE = eINSTANCE.getEmployeeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_TYPE__TYPE = eINSTANCE.getEmployeeType_Type();

		/**
		 * The meta object literal for the '<em><b>Acess Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_TYPE__ACESS_LEVEL = eINSTANCE.getEmployeeType_AcessLevel();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.BookingImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CREATED = eINSTANCE.getBooking_Created();

		/**
		 * The meta object literal for the '<em><b>Credit Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CREDIT_CARD = eINSTANCE.getBooking_CreditCard();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Addons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ADDONS = eINSTANCE.getBooking_Addons();

		/**
		 * The meta object literal for the '<em><b>Booked Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__BOOKED_ROOMS = eINSTANCE.getBooking_BookedRooms();

		/**
		 * The meta object literal for the '<em><b>Internal Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__INTERNAL_COMMENTS = eINSTANCE.getBooking_InternalComments();

		/**
		 * The meta object literal for the '<em><b>External Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__EXTERNAL_COMMENTS = eINSTANCE.getBooking_ExternalComments();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_IN = eINSTANCE.getBooking_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_OUT = eINSTANCE.getBooking_CheckedOut();

		/**
		 * The meta object literal for the '<em><b>Payment Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__PAYMENT_MASTER = eINSTANCE.getBooking_PaymentMaster();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__DISCOUNTS = eINSTANCE.getBooking_Discounts();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_IN = eINSTANCE.getBooking__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_OUT = eINSTANCE.getBooking__CheckOut();

		/**
		 * The meta object literal for the '<em><b>Add Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___ADD_ADDON__ADDON = eINSTANCE.getBooking__AddAddon__Addon();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___ADD_ROOM__ROOM = eINSTANCE.getBooking__AddRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Remove Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REMOVE_ADDON__ADDON = eINSTANCE.getBooking__RemoveAddon__Addon();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REMOVE_ROOM__ROOM = eINSTANCE.getBooking__RemoveRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Generate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GENERATE_BILL = eINSTANCE.getBooking__GenerateBill();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___PAY__BILL = eINSTANCE.getBooking__Pay__Bill();

		/**
		 * The meta object literal for the '<em><b>Add Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___ADD_DISCOUNT__DISCOUNT = eINSTANCE.getBooking__AddDiscount__Discount();

		/**
		 * The meta object literal for the '<em><b>Remove Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REMOVE_DISCOUNT__DISCOUNT = eINSTANCE.getBooking__RemoveDiscount__Discount();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.CreditcardImpl <em>Creditcard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.CreditcardImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCreditcard()
		 * @generated
		 */
		EClass CREDITCARD = eINSTANCE.getCreditcard();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDITCARD__NUMBER = eINSTANCE.getCreditcard_Number();

		/**
		 * The meta object literal for the '<em><b>Cvc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDITCARD__CVC = eINSTANCE.getCreditcard_Cvc();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDITCARD__OWNER = eINSTANCE.getCreditcard_Owner();

		/**
		 * The meta object literal for the '<em><b>Expiration Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDITCARD__EXPIRATION_MONTH = eINSTANCE.getCreditcard_ExpirationMonth();

		/**
		 * The meta object literal for the '<em><b>Expiration Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDITCARD__EXPIRATION_DAY = eINSTANCE.getCreditcard_ExpirationDay();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.CustomerImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Customer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CUSTOMER_ID = eINSTANCE.getCustomer_CustomerID();

		/**
		 * The meta object literal for the '<em><b>Bonus Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BONUS_POINTS = eINSTANCE.getCustomer_BonusPoints();

		/**
		 * The meta object literal for the '<em><b>Misc Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__MISC_INFO = eINSTANCE.getCustomer_MiscInfo();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__RANK = eINSTANCE.getCustomer_Rank();

		/**
		 * The meta object literal for the '<em><b>Add Bonus Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_BONUS_POINTS__INT = eINSTANCE.getCustomer__AddBonusPoints__int();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.AddonImpl <em>Addon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.AddonImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getAddon()
		 * @generated
		 */
		EClass ADDON = eINSTANCE.getAddon();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.ExtraImpl <em>Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.ExtraImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getExtra()
		 * @generated
		 */
		EClass EXTRA = eINSTANCE.getExtra();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__NAME = eINSTANCE.getExtra_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__DESCRIPTION = eINSTANCE.getExtra_Description();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.RoomImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__SIZE = eINSTANCE.getRoom_Size();

		/**
		 * The meta object literal for the '<em><b>Internal Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__INTERNAL_COMMENT = eINSTANCE.getRoom_InternalComment();

		/**
		 * The meta object literal for the '<em><b>Booked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BOOKED = eINSTANCE.getRoom_Booked();

		/**
		 * The meta object literal for the '<em><b>Max Nbr People</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__MAX_NBR_PEOPLE = eINSTANCE.getRoom_MaxNbrPeople();

		/**
		 * The meta object literal for the '<em><b>Under Cleaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__UNDER_CLEANING = eINSTANCE.getRoom_UnderCleaning();

		/**
		 * The meta object literal for the '<em><b>Under Repair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__UNDER_REPAIR = eINSTANCE.getRoom_UnderRepair();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TYPES = eINSTANCE.getRoom_Types();

		/**
		 * The meta object literal for the '<em><b>Room Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NAME = eINSTANCE.getRoom_RoomName();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.BillImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Costables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__COSTABLES = eINSTANCE.getBill_Costables();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__TOTAL_PRICE = eINSTANCE.getBill_TotalPrice();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CUSTOMER = eINSTANCE.getBill_Customer();

		/**
		 * The meta object literal for the '<em><b>Value Added Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__VALUE_ADDED_TAX = eINSTANCE.getBill_ValueAddedTax();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__FINAL = eINSTANCE.getBill_Final();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__PAID = eINSTANCE.getBill_Paid();

		/**
		 * The meta object literal for the '<em><b>Add Costable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___ADD_COSTABLE__COSTABLE = eINSTANCE.getBill__AddCostable__Costable();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.Costable <em>Costable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.Costable
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getCostable()
		 * @generated
		 */
		EClass COSTABLE = eINSTANCE.getCostable();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSTABLE__PRICE = eINSTANCE.getCostable_Price();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSTABLE__DISCOUNTS = eINSTANCE.getCostable_Discounts();

		/**
		 * The meta object literal for the '<em><b>Add Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COSTABLE___ADD_DISCOUNT = eINSTANCE.getCostable__AddDiscount();

		/**
		 * The meta object literal for the '<em><b>Remove Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COSTABLE___REMOVE_DISCOUNT = eINSTANCE.getCostable__RemoveDiscount();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.DiscountImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Is Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__IS_PERCENTAGE = eINSTANCE.getDiscount_IsPercentage();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__AMOUNT = eINSTANCE.getDiscount_Amount();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.BookingControllerImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBookingController()
		 * @generated
		 */
		EClass BOOKING_CONTROLLER = eINSTANCE.getBookingController();

		/**
		 * The meta object literal for the '<em><b>Search Available Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___SEARCH_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT = eINSTANCE.getBookingController__SearchAvailableRoomTypes__Date_Date_int_int();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___CREATE_BOOKING__ELIST = eINSTANCE.getBookingController__CreateBooking__EList();

		/**
		 * The meta object literal for the '<em><b>Send Confirmation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___SEND_CONFIRMATION__BOOKING = eINSTANCE.getBookingController__SendConfirmation__Booking();

		/**
		 * The meta object literal for the '<em><b>Update Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___UPDATE_BOOKING__BOOKING = eINSTANCE.getBookingController__UpdateBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___GET_BOOKING__INT = eINSTANCE.getBookingController__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Confirm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___CONFIRM__BOOKING = eINSTANCE.getBookingController__Confirm__Booking();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___CHECK_IN__BOOKING = eINSTANCE.getBookingController__CheckIn__Booking();

		/**
		 * The meta object literal for the '<em><b>Create Key Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___CREATE_KEY_CARD__ROOM = eINSTANCE.getBookingController__CreateKeyCard__Room();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___CHECK_OUT__BOOKING = eINSTANCE.getBookingController__CheckOut__Booking();

		/**
		 * The meta object literal for the '<em><b>Save Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___SAVE_CUSTOMER__CUSTOMER = eINSTANCE.getBookingController__SaveCustomer__Customer();

		/**
		 * The meta object literal for the '<em><b>Find Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___FIND_CUSTOMER__STRING = eINSTANCE.getBookingController__FindCustomer__String();

		/**
		 * The meta object literal for the '<em><b>Assign Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_CONTROLLER___ASSIGN_ROOM__ROOM = eINSTANCE.getBookingController__AssignRoom__Room();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.ManagementControllerImpl <em>Management Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.ManagementControllerImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getManagementController()
		 * @generated
		 */
		EClass MANAGEMENT_CONTROLLER = eINSTANCE.getManagementController();

		/**
		 * The meta object literal for the '<em><b>Register Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___REGISTER_DISCOUNT__DISCOUNT = eINSTANCE.getManagementController__RegisterDiscount__Discount();

		/**
		 * The meta object literal for the '<em><b>Modify Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___MODIFY_BOOKING__BOOKING = eINSTANCE.getManagementController__ModifyBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Set Date Specific Prices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___SET_DATE_SPECIFIC_PRICES__COSTABLE_DATE_DATE_DOUBLE = eINSTANCE.getManagementController__SetDateSpecificPrices__Costable_Date_Date_double();

		/**
		 * The meta object literal for the '<em><b>Register Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___REGISTER_ROOM__ROOM = eINSTANCE.getManagementController__RegisterRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Register Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___REGISTER_ADDON__ADDON = eINSTANCE.getManagementController__RegisterAddon__Addon();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___UPDATE_ROOM__ROOM = eINSTANCE.getManagementController__UpdateRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Update Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGEMENT_CONTROLLER___UPDATE_ADDON__ADDON = eINSTANCE.getManagementController__UpdateAddon__Addon();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.MaintenanceControllerImpl <em>Maintenance Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.MaintenanceControllerImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getMaintenanceController()
		 * @generated
		 */
		EClass MAINTENANCE_CONTROLLER = eINSTANCE.getMaintenanceController();

		/**
		 * The meta object literal for the '<em><b>Room Stack</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_CONTROLLER__ROOM_STACK = eINSTANCE.getMaintenanceController_RoomStack();

		/**
		 * The meta object literal for the '<em><b>Add To Stack</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTENANCE_CONTROLLER___ADD_TO_STACK__ROOM = eINSTANCE.getMaintenanceController__AddToStack__Room();

		/**
		 * The meta object literal for the '<em><b>Set Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTENANCE_CONTROLLER___SET_STATUS__ROOM_BOOLEAN = eINSTANCE.getMaintenanceController__SetStatus__Room_boolean();

		/**
		 * The meta object literal for the '<em><b>Notify Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTENANCE_CONTROLLER___NOTIFY_WORKER__EMPLOYEETYPE = eINSTANCE.getMaintenanceController__NotifyWorker__EmployeeType();

		/**
		 * The meta object literal for the '<em><b>Remove From Stack</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTENANCE_CONTROLLER___REMOVE_FROM_STACK__ROOM = eINSTANCE.getMaintenanceController__RemoveFromStack__Room();

		/**
		 * The meta object literal for the '<em><b>Get Next Room To Clean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINTENANCE_CONTROLLER___GET_NEXT_ROOM_TO_CLEAN__ROOM = eINSTANCE.getMaintenanceController__GetNextRoomToClean__Room();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.HotelImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getHotel()
		 * @generated
		 */
		EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__NAME = eINSTANCE.getHotel_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__ADDRESS = eINSTANCE.getHotel_Address();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL__RANK = eINSTANCE.getHotel_Rank();

		/**
		 * The meta object literal for the '<em><b>Authenticate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL___AUTHENTICATE__STRING_STRING = eINSTANCE.getHotel__Authenticate__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Booking Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL___GET_BOOKING_CONTROLLER = eINSTANCE.getHotel__GetBookingController();

		/**
		 * The meta object literal for the '<em><b>Get Management Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL___GET_MANAGEMENT_CONTROLLER = eINSTANCE.getHotel__GetManagementController();

		/**
		 * The meta object literal for the '<em><b>Get Maintenance Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL___GET_MAINTENANCE_CONTROLLER = eINSTANCE.getHotel__GetMaintenanceController();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.BookedRoomImpl <em>Booked Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.BookedRoomImpl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getBookedRoom()
		 * @generated
		 */
		EClass BOOKED_ROOM = eINSTANCE.getBookedRoom();

		/**
		 * The meta object literal for the '<em><b>Addons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKED_ROOM__ADDONS = eINSTANCE.getBookedRoom_Addons();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKED_ROOM__ROOM = eINSTANCE.getBookedRoom_Room();

		/**
		 * The meta object literal for the '<em><b>Add Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKED_ROOM___ADD_ADDON__ADDON = eINSTANCE.getBookedRoom__AddAddon__Addon();

		/**
		 * The meta object literal for the '<em><b>Remove Addon</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKED_ROOM___REMOVE_ADDON__ADDON = eINSTANCE.getBookedRoom__RemoveAddon__Addon();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.Interaction1Impl <em>Interaction1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.Interaction1Impl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction1()
		 * @generated
		 */
		EClass INTERACTION1 = eINSTANCE.getInteraction1();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION1__ = eINSTANCE.getInteraction1__();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.Interaction2Impl <em>Interaction2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.Interaction2Impl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction2()
		 * @generated
		 */
		EClass INTERACTION2 = eINSTANCE.getInteraction2();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION2__ = eINSTANCE.getInteraction2__();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.Interaction3Impl <em>Interaction3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.Interaction3Impl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction3()
		 * @generated
		 */
		EClass INTERACTION3 = eINSTANCE.getInteraction3();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION3__ = eINSTANCE.getInteraction3__();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.Interaction4Impl <em>Interaction4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.Interaction4Impl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction4()
		 * @generated
		 */
		EClass INTERACTION4 = eINSTANCE.getInteraction4();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION4__ = eINSTANCE.getInteraction4__();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.impl.Interaction5Impl <em>Interaction5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.impl.Interaction5Impl
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getInteraction5()
		 * @generated
		 */
		EClass INTERACTION5 = eINSTANCE.getInteraction5();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION5__ = eINSTANCE.getInteraction5__();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.EType
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link HotelManagementClassDiagram.RoomType <em>Room Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HotelManagementClassDiagram.RoomType
		 * @see HotelManagementClassDiagram.impl.HotelManagementClassDiagramPackageImpl#getRoomType()
		 * @generated
		 */
		EEnum ROOM_TYPE = eINSTANCE.getRoomType();

	}

} //HotelManagementClassDiagramPackage
