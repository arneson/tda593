/**
 */
package HotelManagementClassDiagram;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Booking#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCreated <em>Created</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getAddons <em>Addons</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getBookedRooms <em>Booked Rooms</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getInternalComments <em>Internal Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getExternalComments <em>External Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getPaymentMaster <em>Payment Master</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Id</em>' attribute.
	 * @see #setBookingId(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_BookingId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingId();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getBookingId <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Id</em>' attribute.
	 * @see #getBookingId()
	 * @generated
	 */
	void setBookingId(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_Created()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card</em>' reference.
	 * @see #setCreditCard(Creditcard)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_CreditCard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Creditcard getCreditCard();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getCreditCard <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card</em>' reference.
	 * @see #getCreditCard()
	 * @generated
	 */
	void setCreditCard(Creditcard value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Addons</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Addon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addons</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_Addons()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Addon> getAddons();

	/**
	 * Returns the value of the '<em><b>Booked Rooms</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booked Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked Rooms</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_BookedRooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getBookedRooms();

	/**
	 * Returns the value of the '<em><b>Internal Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Comments</em>' attribute.
	 * @see #setInternalComments(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_InternalComments()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInternalComments();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getInternalComments <em>Internal Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Comments</em>' attribute.
	 * @see #getInternalComments()
	 * @generated
	 */
	void setInternalComments(String value);

	/**
	 * Returns the value of the '<em><b>External Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Comments</em>' attribute.
	 * @see #setExternalComments(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_ExternalComments()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExternalComments();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getExternalComments <em>External Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Comments</em>' attribute.
	 * @see #getExternalComments()
	 * @generated
	 */
	void setExternalComments(String value);

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_CheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#isCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out</em>' attribute.
	 * @see #setCheckedOut(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_CheckedOut()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedOut();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#isCheckedOut <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Out</em>' attribute.
	 * @see #isCheckedOut()
	 * @generated
	 */
	void setCheckedOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Payment Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Master</em>' reference.
	 * @see #setPaymentMaster(Customer)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_PaymentMaster()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getPaymentMaster();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getPaymentMaster <em>Payment Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Master</em>' reference.
	 * @see #getPaymentMaster()
	 * @generated
	 */
	void setPaymentMaster(Customer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill checkOut();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addonRequired="true" addonOrdered="false"
	 * @generated
	 */
	void addAddon(Addon addon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void addRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addonRequired="true" addonOrdered="false"
	 * @generated
	 */
	void removeAddon(Addon addon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void removeRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill generateBill();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false"
	 * @generated
	 */
	boolean pay(Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false"
	 * @generated
	 */
	void addDiscount(Discount discount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false"
	 * @generated
	 */
	void removeDiscount(Discount discount);

} // Booking
