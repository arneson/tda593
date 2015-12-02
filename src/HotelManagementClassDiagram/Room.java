/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getSize <em>Size</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Room#getMiscInfo <em>Misc Info</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Cleaning Status</b></em>' attribute.
	 * The literals are from the enumeration {@link HotelManagementClassDiagram.CleaningStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaning Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaning Status</em>' attribute.
	 * @see HotelManagementClassDiagram.CleaningStatus
	 * @see #setCleaningStatus(CleaningStatus)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_CleaningStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CleaningStatus getCleaningStatus();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Room#getCleaningStatus <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaning Status</em>' attribute.
	 * @see HotelManagementClassDiagram.CleaningStatus
	 * @see #getCleaningStatus()
	 * @generated
	 */
	void setCleaningStatus(CleaningStatus value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute list.
	 * The list contents are of type {@link HotelManagementClassDiagram.RoomType}.
	 * The literals are from the enumeration {@link HotelManagementClassDiagram.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute list.
	 * @see HotelManagementClassDiagram.RoomType
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomType();

	/**
	 * Returns the value of the '<em><b>Misc Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Info</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Info</em>' attribute list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getRoom_MiscInfo()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getMiscInfo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setCleanedStatus(CleaningStatus status);

} // Room
