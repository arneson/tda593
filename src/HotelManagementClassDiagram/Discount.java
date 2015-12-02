/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Discount#isPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Discount#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getDiscount()
 * @model
 * @generated
 */
public interface Discount extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Percentage</em>' attribute.
	 * @see #setIsPercentage(boolean)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getDiscount_IsPercentage()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPercentage();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Discount#isPercentage <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Percentage</em>' attribute.
	 * @see #isPercentage()
	 * @generated
	 */
	void setIsPercentage(boolean value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getDiscount_Amount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Discount#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // Discount
