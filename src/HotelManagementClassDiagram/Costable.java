/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Costable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Costable#getPrice <em>Price</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Costable#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Costable extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Costable#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Discounts</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Discount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounts</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable_Discounts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Discount> getDiscounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDiscount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDiscount();

} // Costable
