/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getSize <em>Size</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#isBooked <em>Booked</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getMaxNbrPeople <em>Max Nbr People</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#isUnderCleaning <em>Under Cleaning</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#isUnderRepair <em>Under Repair</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends Costable {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Internal Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Comment</em>' attribute.
	 * @see #setInternalComment(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_InternalComment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInternalComment();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getInternalComment <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Comment</em>' attribute.
	 * @see #getInternalComment()
	 * @generated
	 */
	void setInternalComment(String value);

	/**
	 * Returns the value of the '<em><b>Booked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked</em>' attribute.
	 * @see #setBooked(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_Booked()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBooked();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#isBooked <em>Booked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booked</em>' attribute.
	 * @see #isBooked()
	 * @generated
	 */
	void setBooked(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Nbr People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Nbr People</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Nbr People</em>' attribute.
	 * @see #setMaxNbrPeople(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_MaxNbrPeople()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMaxNbrPeople();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getMaxNbrPeople <em>Max Nbr People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nbr People</em>' attribute.
	 * @see #getMaxNbrPeople()
	 * @generated
	 */
	void setMaxNbrPeople(int value);

	/**
	 * Returns the value of the '<em><b>Under Cleaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Cleaning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Cleaning</em>' attribute.
	 * @see #setUnderCleaning(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_UnderCleaning()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isUnderCleaning();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#isUnderCleaning <em>Under Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under Cleaning</em>' attribute.
	 * @see #isUnderCleaning()
	 * @generated
	 */
	void setUnderCleaning(boolean value);

	/**
	 * Returns the value of the '<em><b>Under Repair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Under Repair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Under Repair</em>' attribute.
	 * @see #setUnderRepair(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_UnderRepair()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isUnderRepair();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#isUnderRepair <em>Under Repair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under Repair</em>' attribute.
	 * @see #isUnderRepair()
	 * @generated
	 */
	void setUnderRepair(boolean value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link HotelManagementClassDiagram.RoomType}.
	 * The literals are from the enumeration {@link HotelManagementClassDiagram.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see HotelManagementClassDiagram.RoomType
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_Types()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomType> getTypes();

} // Room
