/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.MaintenanceController;
import HotelManagementClassDiagram.Room;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.MaintenanceControllerImpl#getRoomStack <em>Room Stack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceControllerImpl extends MinimalEObjectImpl.Container implements MaintenanceController {
	/**
	 * The cached value of the '{@link #getRoomStack() <em>Room Stack</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStack()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> roomStack;

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
	public EList<Room> getRoomStack() {
		if (roomStack == null) {
			roomStack = new EObjectResolvingEList<Room>(Room.class, this, HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_STACK);
		}
		return roomStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToStack(Room room) {
		roomStack.add(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCleanedStatus(Room room, boolean status) {
		for (Room roomInstance : roomStack) {
			if (roomInstance.equals(room)) {
				room.setUnderCleaning(status);
			}
		}
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void notifyWorker(EmployeeType worker) {
		throw new UnsupportedOperationException();
		// TODO
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromStack(Room room) {
		roomStack.remove(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRepairedStatus(Room room, boolean repaired) {
		for (Room roomInstance : roomStack) {
			if (roomInstance.equals(room)) {
				room.setUnderRepair(repaired);
			}
		}
		// TODO error parameters
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getNextRoomToClean() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_STACK:
				return getRoomStack();
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
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_STACK:
				getRoomStack().clear();
				getRoomStack().addAll((Collection<? extends Room>)newValue);
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
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_STACK:
				getRoomStack().clear();
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
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER__ROOM_STACK:
				return roomStack != null && !roomStack.isEmpty();
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
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___ADD_TO_STACK__ROOM:
				addToStack((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___SET_CLEANED_STATUS__ROOM_BOOLEAN:
				setCleanedStatus((Room)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___NOTIFY_WORKER__EMPLOYEETYPE:
				notifyWorker((EmployeeType)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MAINTENANCE_CONTROLLER___REMOVE_FROM_STACK__ROOM:
				removeFromStack((Room)arguments.get(0));
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
