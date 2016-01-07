/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.MaintenanceController;
import HotelManagementClassDiagram.Room;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.MaintenanceControllerImpl#getRoomQueue <em>Room Queue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceControllerImpl extends MinimalEObjectImpl.Container implements MaintenanceController {
	/**
	 * The cached value of the '{@link #getRoomQueue() <em>Room Queue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomQueue()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> roomQueue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.MAINTENANCE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoomQueue() {
		if (roomQueue == null) {
			roomQueue = new EObjectResolvingEList<Room>(Room.class, this, HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_QUEUE);
		}
		return roomQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToQueue(Room room) {
		this.roomQueue.add(roomQueue.size()-1, room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCleanedStatus(Room room, boolean status) {
		for (Room roomInstance : roomQueue) {
			if (roomInstance.equals(room)) {
				room.setUnderCleaning(status);
			}
		}
		FakeDBContextImpl.getInstance().updateOrAddRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromQueue(Room room) {
		Iterator<Room> it = this.roomQueue.iterator();
		while (it.hasNext()) {
			if (room.equals(it.next())) {
				it.remove();
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getNextRoomToClean(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRepairedStatus(Room room, boolean repaired) {
		for (Room roomInstance : roomQueue) {
			if (roomInstance.equals(room)) {
				room.setUnderRepair(repaired);
				break;
			}
		}
		FakeDBContextImpl.getInstance().updateOrAddRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Room getNextRoomToClean() {
		Room m = this.roomQueue.get(0);
		this.roomQueue.remove(0);
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_QUEUE:
				return getRoomQueue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_QUEUE:
				getRoomQueue().clear();
				getRoomQueue().addAll((Collection<? extends Room>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_QUEUE:
				getRoomQueue().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_QUEUE:
				return roomQueue != null && !roomQueue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___ADD_TO_QUEUE__ROOM:
				addToQueue((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___SET_CLEANED_STATUS__ROOM_BOOLEAN:
				setCleanedStatus((Room)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___REMOVE_FROM_QUEUE__ROOM:
				removeFromQueue((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___GET_NEXT_ROOM_TO_CLEAN__ROOM:
				getNextRoomToClean((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___SET_REPAIRED_STATUS__ROOM_BOOLEAN:
				setRepairedStatus((Room)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___GET_NEXT_ROOM_TO_CLEAN:
				return getNextRoomToClean();
		}
		return super.eInvoke(operationID, arguments);
	}


} //MaintenanceControllerImpl
