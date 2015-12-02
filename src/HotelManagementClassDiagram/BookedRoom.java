/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booked Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.BookedRoom#getAddons <em>Addons</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.BookedRoom#getRoom <em>Room</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.BookedRoom#getExtras <em>Extras</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBookedRoom()
 * @model
 * @generated
 */
public interface BookedRoom extends Room {
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
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBookedRoom_Addons()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Addon> getAddons();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBookedRoom_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.BookedRoom#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Extras</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Extra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extras</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extras</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBookedRoom_Extras()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Extra> getExtras();

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
	 * @model addonRequired="true" addonOrdered="false"
	 * @generated
	 */
	void removeAddon(Addon addon);

} // BookedRoom
