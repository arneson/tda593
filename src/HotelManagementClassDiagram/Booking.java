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
 *   <li>{@link HotelManagementClassDiagram.Booking#getFrom <em>From</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getTo <em>To</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCreated <em>Created</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCreditcard <em>Creditcard</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getAddons <em>Addons</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getRooms <em>Rooms</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getInternalComments <em>Internal Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#getExternalComments <em>External Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Booking#isCheckedOut <em>Checked Out</em>}</li>
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
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

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
	 * Returns the value of the '<em><b>Creditcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creditcard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creditcard</em>' reference.
	 * @see #setCreditcard(Creditcard)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_Creditcard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Creditcard getCreditcard();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Booking#getCreditcard <em>Creditcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditcard</em>' reference.
	 * @see #getCreditcard()
	 * @generated
	 */
	void setCreditcard(Creditcard value);

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
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBooking_Rooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bill createBill();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model creditcardRequired="true" creditcardOrdered="false"
	 * @generated
	 */
	void getCreditcard(Creditcard creditcard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addonsRequired="true" addonsOrdered="false"
	 * @generated
	 */
	void addAddons(Addon addons);

} // Booking
