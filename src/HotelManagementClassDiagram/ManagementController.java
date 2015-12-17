/**
 */
package HotelManagementClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getManagementController()
 * @model
 * @generated
 */
public interface ManagementController extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costableRequired="true" costableOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" priceChangeRequired="true" priceChangeOrdered="false"
	 * @generated
	 */
	void setDateSpecificPrices(Costable costable, Date startDate, Date endDate, double priceChange);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model employeeRequired="true" employeeOrdered="false"
	 * @generated
	 */
	void updateOrAddEmployee(Employee employee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model employeeTypeRequired="true" employeeTypeOrdered="false"
	 * @generated
	 */
	void updateOrAddEmployeeType(EmployeeType employeeType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void updateOrAddRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void updateOrAddRoomType(RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false"
	 * @generated
	 */
	void updateOrAddDiscount(Discount discount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model addonRequired="true" addonOrdered="false"
	 * @generated
	 */
	void updateOrAddAddon(Addon addon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model extraRequired="true" extraOrdered="false"
	 * @generated
	 */
	void updateOrAddExtra(Extra extra);

} // ManagementController
