/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.BookedRoom;
import HotelManagementClassDiagram.Hotel;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import HotelManagementClassDiagram.Room;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getName <em>Name</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final double RANK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected double rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(double newRank) {
		double oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void authenticate(String login, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookingController() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getManagementController() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getMaintenanceController() {
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				return getName();
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				return getAddress();
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				return getRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				setName((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				setAddress((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				setRank((Double)newValue);
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				setRank(RANK_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				return rank != RANK_EDEFAULT;
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
			case HotelManagementClassDiagramPackage.HOTEL___AUTHENTICATE__STRING_STRING:
				authenticate((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case HotelManagementClassDiagramPackage.HOTEL___GET_BOOKING_CONTROLLER:
				getBookingController();
				return null;
			case HotelManagementClassDiagramPackage.HOTEL___GET_MANAGEMENT_CONTROLLER:
				getManagementController();
				return null;
			case HotelManagementClassDiagramPackage.HOTEL___GET_MAINTENANCE_CONTROLLER:
				getMaintenanceController();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

	/* Following methods are for factory purposes */

	/**
	 * @generated NOT
	 */
	public Room createRoom(Room room){
		return new RoomImpl(); //new BookedRoomImpl(room);
	}

	/**
	 * @generated NOT
	 */
	public BookedRoom createBookedRoom(Room room){
		return new BookedRoomImpl(); //new BookedRoomImpl(room);
	}

} //HotelImpl
