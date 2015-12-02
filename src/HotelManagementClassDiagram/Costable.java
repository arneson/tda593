/**
 */
package HotelManagementClassDiagram;

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
 *   <li>{@link HotelManagementClassDiagram.Costable#getCost <em>Cost</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Costable#getDiscount <em>Discount</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Costable extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable_Cost()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Costable#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' reference.
	 * @see #setDiscount(Discount)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCostable_Discount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Discount getDiscount();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Costable#getDiscount <em>Discount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' reference.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(Discount value);

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
