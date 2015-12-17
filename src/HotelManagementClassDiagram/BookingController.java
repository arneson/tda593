/**
 */
package HotelManagementClassDiagram;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBookingController()
 * @model
 * @generated
 */
public interface BookingController extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false" nbrOfAdultsRequired="true" nbrOfAdultsOrdered="false" nbrOfChildrenRequired="true" nbrOfChildrenOrdered="false"
	 * @generated
	 */
	EList<RoomType> searchAvailableRoomTypes(Date fromDate, Date toDate, int nbrOfAdults, int nbrOfChildren);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean sendConfirmation(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated NOT
	 */
	Booking getBooking(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean confirm(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" _Required="true" _Ordered="false"
	 * @generated
	 */
	void checkIn(Booking booking, boolean _);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void createKeyCard(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkOut(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void saveCustomer(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssNumberRequired="true" ssNumberOrdered="false"
	 * @generated
	 */
	void findCustomer(String ssNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void assignRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" SSNDataType="org.eclipse.uml2.types.String" SSNRequired="true" SSNOrdered="false"
	 * @generated
	 */
	Customer getCustomer(String SSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void updateOrAddCustomer(Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void updateOrAddBooking(Booking booking);

} // BookingController
