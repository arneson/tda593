/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getName <em>Name</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getAddress <em>Address</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getRank <em>Rank</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getBookingController <em>Booking Controller</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getMaintenanceController <em>Maintenance Controller</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Hotel#getManagementController <em>Management Controller</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel()
 * @model
 * @generated
 */
public interface Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel_Rank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getRank();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model kind="operation"
	 * @generated NOT
	 */
	BookingController getBookingController();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getBookingController <em>Booking Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Controller</em>' reference.
	 * @see #getBookingController()
	 * @generated
	 */
	void setBookingController(BookingController value);

	/**
	 * Returns the value of the '<em><b>Management Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Controller</em>' reference.
	 * @see #setManagementController(ManagementController)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel_ManagementController()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ManagementController getManagementController();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getManagementController <em>Management Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management Controller</em>' reference.
	 * @see #getManagementController()
	 * @generated
	 */
	void setManagementController(ManagementController value);

	/**
	 * Returns the value of the '<em><b>Maintenance Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance Controller</em>' reference.
	 * @see #setMaintenanceController(MaintenanceController)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getHotel_MaintenanceController()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MaintenanceController getMaintenanceController();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Hotel#getMaintenanceController <em>Maintenance Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance Controller</em>' reference.
	 * @see #getMaintenanceController()
	 * @generated
	 */
	void setMaintenanceController(MaintenanceController value);

} // Hotel
