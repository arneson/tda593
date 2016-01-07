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
 *   <li>{@link HotelManagementClassDiagram.Bill#isFinal <em>Final</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Bill#isPaid <em>Paid</em>}</li>
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
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_Final()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Bill#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid</em>' attribute.
	 * @see #setPaid(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getBill_Paid()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Bill#isPaid <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setPaid(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model costableRequired="true" costableOrdered="false"
	 * @generated
	 */
	void addCostable(Costable costable);

} // Bill
