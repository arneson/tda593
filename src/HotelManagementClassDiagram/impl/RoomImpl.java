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
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getSize <em>Size</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#isBooked <em>Booked</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getMaxNbrPeople <em>Max Nbr People</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#isUnderCleaning <em>Under Cleaning</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#isUnderRepair <em>Under Repair</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getRoomName <em>Room Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected String internalComment = INTERNAL_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBooked() <em>Booked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBooked() <em>Booked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooked()
	 * @generated
	 * @ordered
	 */
	protected boolean booked = BOOKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaxNbrPeople() <em>Max Nbr People</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrPeople()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> maxNbrPeople;

	/**
	 * The default value of the '{@link #isUnderCleaning() <em>Under Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_CLEANING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderCleaning() <em>Under Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderCleaning()
	 * @generated
	 * @ordered
	 */
	protected boolean underCleaning = UNDER_CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderRepair() <em>Under Repair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderRepair()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_REPAIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderRepair() <em>Under Repair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderRepair()
	 * @generated
	 * @ordered
	 */
	protected boolean underRepair = UNDER_REPAIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> types;

	/**
	 * The default value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected String roomName = ROOM_NAME_EDEFAULT;

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
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalComment() {
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalComment(String newInternalComment) {
		String oldInternalComment = internalComment;
		internalComment = newInternalComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT, oldInternalComment, internalComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooked() {
		return booked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooked(boolean newBooked) {
		boolean oldBooked = booked;
		booked = newBooked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__BOOKED, oldBooked, booked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMaxNbrPeople() {
		if (maxNbrPeople == null) {
			maxNbrPeople = new EDataTypeUniqueEList<Integer>(Integer.class, this, HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE);
		}
		return maxNbrPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderCleaning() {
		return underCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderCleaning(boolean newUnderCleaning) {
		boolean oldUnderCleaning = underCleaning;
		underCleaning = newUnderCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING, oldUnderCleaning, underCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderRepair() {
		return underRepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderRepair(boolean newUnderRepair) {
		boolean oldUnderRepair = underRepair;
		underRepair = newUnderRepair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR, oldUnderRepair, underRepair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getTypes() {
		if (types == null) {
			types = new EDataTypeUniqueEList<RoomType>(RoomType.class, this, HotelManagementClassDiagramPackage.ROOM__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomName(String newRoomName) {
		String oldRoomName = roomName;
		roomName = newRoomName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__ROOM_NAME, oldRoomName, roomName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCleanedStatus(CleaningStatus status) {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException("This method is not implemented and should not be used")
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return getSize();
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				return getInternalComment();
			case HotelManagementClassDiagramPackage.ROOM__BOOKED:
				return isBooked();
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				return getMaxNbrPeople();
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				return isUnderCleaning();
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				return isUnderRepair();
			case HotelManagementClassDiagramPackage.ROOM__TYPES:
				return getTypes();
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NAME:
				return getRoomName();
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
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				setInternalComment((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__BOOKED:
				setBooked((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				getMaxNbrPeople().clear();
				getMaxNbrPeople().addAll((Collection<? extends Integer>)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				setUnderCleaning((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				setUnderRepair((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends RoomType>)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NAME:
				setRoomName((String)newValue);
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
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				setInternalComment(INTERNAL_COMMENT_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__BOOKED:
				setBooked(BOOKED_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				getMaxNbrPeople().clear();
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				setUnderCleaning(UNDER_CLEANING_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				setUnderRepair(UNDER_REPAIR_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__TYPES:
				getTypes().clear();
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NAME:
				setRoomName(ROOM_NAME_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return size != SIZE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				return INTERNAL_COMMENT_EDEFAULT == null ? internalComment != null : !INTERNAL_COMMENT_EDEFAULT.equals(internalComment);
			case HotelManagementClassDiagramPackage.ROOM__BOOKED:
				return booked != BOOKED_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				return maxNbrPeople != null && !maxNbrPeople.isEmpty();
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				return underCleaning != UNDER_CLEANING_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				return underRepair != UNDER_REPAIR_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__TYPES:
				return types != null && !types.isEmpty();
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NAME:
				return ROOM_NAME_EDEFAULT == null ? roomName != null : !ROOM_NAME_EDEFAULT.equals(roomName);
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", size: ");
		result.append(size);
		result.append(", internalComment: ");
		result.append(internalComment);
		result.append(", booked: ");
		result.append(booked);
		result.append(", maxNbrPeople: ");
		result.append(maxNbrPeople);
		result.append(", underCleaning: ");
		result.append(underCleaning);
		result.append(", underRepair: ");
		result.append(underRepair);
		result.append(", types: ");
		result.append(types);
		result.append(", roomName: ");
		result.append(roomName);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
