/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.BookedRoom;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booked Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.BookedRoomImpl#getAddons <em>Addons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookedRoomImpl extends RoomImpl implements BookedRoom {
	/**
	 * The cached value of the '{@link #getAddons() <em>Addons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddons()
	 * @generated
	 * @ordered
	 */
	protected EList<Addon> addons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookedRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->l
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.BOOKED_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addon> getAddons() {
		if (addons == null) {
			addons = new EObjectResolvingEList<Addon>(Addon.class, this, HotelManagementClassDiagramPackage.BOOKED_ROOM__ADDONS);
		}
		return addons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAddon(Addon addon) {
		if (addon != null) {
			addons.add(addon);
		} else {
			throw new IllegalArgumentException("Addon can't be null.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeAddon(Addon addon) {
		if (addons.contains(addon)) {
			addons.remove(addon);
		} else {
			throw new IllegalArgumentException("Addon does not exist.");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.BOOKED_ROOM__ADDONS:
				return getAddons();
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
			case HotelManagementClassDiagramPackage.BOOKED_ROOM__ADDONS:
				getAddons().clear();
				getAddons().addAll((Collection<? extends Addon>)newValue);
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
			case HotelManagementClassDiagramPackage.BOOKED_ROOM__ADDONS:
				getAddons().clear();
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
			case HotelManagementClassDiagramPackage.BOOKED_ROOM__ADDONS:
				return addons != null && !addons.isEmpty();
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
			case HotelManagementClassDiagramPackage.BOOKED_ROOM___ADD_ADDON__ADDON:
				addAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKED_ROOM___REMOVE_ADDON__ADDON:
				removeAddon((Addon)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookedRoomImpl
