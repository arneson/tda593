/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.MaintenanceController#getRoomQueue <em>Room Queue</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getMaintenanceController()
 * @model
 * @generated
 */
public interface MaintenanceController extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Queue</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Queue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Queue</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getMaintenanceController_RoomQueue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Room> getRoomQueue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void addToQueue(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setCleanedStatus(Room room, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void removeFromQueue(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" repairedRequired="true" repairedOrdered="false"
	 * @generated
	 */
	void setRepairedStatus(Room room, boolean repaired);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Room getNextRoomToClean();

} // MaintenanceController
