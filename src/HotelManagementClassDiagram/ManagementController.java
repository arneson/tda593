/**
 */
package HotelManagementClassDiagram;

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
	 * @model discountRequired="true" discountOrdered="false" costableRequired="true" costableOrdered="false"
	 * @generated
	 */
	void registerDiscount(Discount discount, Costable costable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costableRequired="true" costableOrdered="false"
	 * @generated
	 */
	void registerCostable(Costable costable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costableRequired="true" costableOrdered="false"
	 * @generated
	 */
	void updateCostable(Costable costable);

} // ManagementController
