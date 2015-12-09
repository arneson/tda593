/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.ManagementController;
import HotelManagementClassDiagram.Room;
import Main.FakeDB;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	public void registerDiscount(Discount discount) {
		FakeDB.discounts.add(discount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void modifyBooking(Booking booking) {
		for(int b = 0; b<FakeDB.bookings.size(); b++){
			if(FakeDB.bookings.get(b).equals(booking)){
				FakeDB.bookings.set(b,booking);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSpecificPrices(Costable costable, Date startDate, Date endDate, double priceChange) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerRoom(Room room) {
		FakeDB.rooms.add(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerAddon(Addon addon) {
		FakeDB.addons.add(addon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateAddon(Addon addon) {
		for(int a = 0; a<FakeDB.addons.size(); a++){
			if(FakeDB.addons.get(a).equals(addon)){
				FakeDB.addons.set(a,addon);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___REGISTER_DISCOUNT__DISCOUNT:
				registerDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___MODIFY_BOOKING__BOOKING:
				modifyBooking((Booking)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___SET_DATE_SPECIFIC_PRICES__COSTABLE_DATE_DATE_DOUBLE:
				setDateSpecificPrices((Costable)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Double)arguments.get(3));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___REGISTER_ROOM__ROOM:
				registerRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___REGISTER_ADDON__ADDON:
				registerAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_ROOM__ROOM:
				updateRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_ADDON__ADDON:
				updateAddon((Addon)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagementControllerImpl
