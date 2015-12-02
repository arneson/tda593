/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.CleaningStatus;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getSize <em>Size</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getMiscInfo <em>Misc Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CleaningStatus CLEANING_STATUS_EDEFAULT = CleaningStatus.CLEAN;

	/**
	 * The cached value of the '{@link #getCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected CleaningStatus cleaningStatus = CLEANING_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomType;

	/**
	 * The cached value of the '{@link #getMiscInfo() <em>Misc Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> miscInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CleaningStatus getCleaningStatus() {
		return cleaningStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleaningStatus(CleaningStatus newCleaningStatus) {
		CleaningStatus oldCleaningStatus = cleaningStatus;
		cleaningStatus = newCleaningStatus == null ? CLEANING_STATUS_EDEFAULT : newCleaningStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__CLEANING_STATUS, oldCleaningStatus, cleaningStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomType() {
		if (roomType == null) {
			roomType = new EDataTypeUniqueEList<RoomType>(RoomType.class, this, HotelManagementClassDiagramPackage.ROOM__ROOM_TYPE);
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMiscInfo() {
		if (miscInfo == null) {
			miscInfo = new EDataTypeUniqueEList<String>(String.class, this, HotelManagementClassDiagramPackage.ROOM__MISC_INFO);
		}
		return miscInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanedStatus(CleaningStatus status) {
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
			case HotelManagementClassDiagramPackage.ROOM__NUMBER:
				return getNumber();
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return getSize();
			case HotelManagementClassDiagramPackage.ROOM__CLEANING_STATUS:
				return getCleaningStatus();
			case HotelManagementClassDiagramPackage.ROOM__ROOM_TYPE:
				return getRoomType();
			case HotelManagementClassDiagramPackage.ROOM__MISC_INFO:
				return getMiscInfo();
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
			case HotelManagementClassDiagramPackage.ROOM__NUMBER:
				setNumber((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__CLEANING_STATUS:
				setCleaningStatus((CleaningStatus)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_TYPE:
				getRoomType().clear();
				getRoomType().addAll((Collection<? extends RoomType>)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__MISC_INFO:
				getMiscInfo().clear();
				getMiscInfo().addAll((Collection<? extends String>)newValue);
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
			case HotelManagementClassDiagramPackage.ROOM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__CLEANING_STATUS:
				setCleaningStatus(CLEANING_STATUS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_TYPE:
				getRoomType().clear();
				return;
			case HotelManagementClassDiagramPackage.ROOM__MISC_INFO:
				getMiscInfo().clear();
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
			case HotelManagementClassDiagramPackage.ROOM__NUMBER:
				return number != NUMBER_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return size != SIZE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__CLEANING_STATUS:
				return cleaningStatus != CLEANING_STATUS_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_TYPE:
				return roomType != null && !roomType.isEmpty();
			case HotelManagementClassDiagramPackage.ROOM__MISC_INFO:
				return miscInfo != null && !miscInfo.isEmpty();
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
			case HotelManagementClassDiagramPackage.ROOM___SET_CLEANED_STATUS__CLEANINGSTATUS:
				setCleanedStatus((CleaningStatus)arguments.get(0));
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
		result.append(" (number: ");
		result.append(number);
		result.append(", size: ");
		result.append(size);
		result.append(", cleaningStatus: ");
		result.append(cleaningStatus);
		result.append(", roomType: ");
		result.append(roomType);
		result.append(", miscInfo: ");
		result.append(miscInfo);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
