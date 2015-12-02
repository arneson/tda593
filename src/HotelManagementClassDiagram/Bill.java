/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Bill#getCostables <em>Costables</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Bill#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Bill#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Bill#getValueAddedTax <em>Value Added Tax</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Costables</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Costable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costables</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_Costables()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Costable> getCostables();

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_TotalPrice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotalPrice();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Bill#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(double value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Bill#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Value Added Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Added Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Added Tax</em>' attribute.
	 * @see #setValueAddedTax(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_ValueAddedTax()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getValueAddedTax();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Bill#getValueAddedTax <em>Value Added Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Added Tax</em>' attribute.
	 * @see #getValueAddedTax()
	 * @generated
	 */
	void setValueAddedTax(double value);

} // Bill
