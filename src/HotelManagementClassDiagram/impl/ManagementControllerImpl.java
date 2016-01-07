/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.Extra;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.ManagementController;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManagementControllerImpl extends MinimalEObjectImpl.Container implements ManagementController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.MANAGEMENT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddEmployee(Employee employee) {
		FakeDBContextImpl.getInstance().updateOrAddEmployee(employee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddEmployeeType(EmployeeType employeeType) {
		FakeDBContextImpl.getInstance().updateOrAddEmployeeType(employeeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddRoom(Room room) {
		FakeDBContextImpl.getInstance().updateOrAddRoom(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddRoomType(RoomType roomType) {
		FakeDBContextImpl.getInstance().updateOrAddRoomType(roomType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddDiscount(Discount discount) {
		FakeDBContextImpl.getInstance().updateOrAddDiscount(discount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddAddon(Addon addon) {
		FakeDBContextImpl.getInstance().updateOrAddAddon(addon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateOrAddExtra(Extra extra) {
		FakeDBContextImpl.getInstance().updateOrAddExtra(extra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getAllEmployees() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addon> getAllAddons() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getAllExtras() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getAllDiscounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEmployee(String SSN) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_EMPLOYEE__EMPLOYEE:
				updateOrAddEmployee((Employee)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_EMPLOYEE_TYPE__EMPLOYEETYPE:
				updateOrAddEmployeeType((EmployeeType)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_ROOM__ROOM:
				updateOrAddRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_ROOM_TYPE__ROOMTYPE:
				updateOrAddRoomType((RoomType)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_DISCOUNT__DISCOUNT:
				updateOrAddDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_ADDON__ADDON:
				updateOrAddAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_OR_ADD_EXTRA__EXTRA:
				updateOrAddExtra((Extra)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___GET_ALL_EMPLOYEES:
				return getAllEmployees();
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___GET_ALL_ADDONS:
				return getAllAddons();
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___GET_ALL_EXTRAS:
				return getAllExtras();
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___GET_ALL_DISCOUNTS:
				return getAllDiscounts();
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___GET_EMPLOYEE__STRING:
				return getEmployee((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagementControllerImpl
