/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.ManagementController;

import java.lang.reflect.InvocationTargetException;

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
	 * @generated
	 */
	public void registerDiscount(Discount discount, Costable costable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerCostable(Costable costable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateCostable(Costable costable) {
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
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___REGISTER_DISCOUNT__DISCOUNT_COSTABLE:
				registerDiscount((Discount)arguments.get(0), (Costable)arguments.get(1));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___REGISTER_COSTABLE__COSTABLE:
				registerCostable((Costable)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.MANAGEMENT_CONTROLLER___UPDATE_COSTABLE__COSTABLE:
				updateCostable((Costable)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagementControllerImpl
