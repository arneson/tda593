/**
 */
package HotelManagementClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creditcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getCvcCode <em>Cvc Code</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard()
 * @model
 * @generated
 */
public interface Creditcard extends EObject {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(long)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_CardNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getCardNumber();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(long value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_ExpirationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cvc Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cvc Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvc Code</em>' attribute.
	 * @see #setCvcCode(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_CvcCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCvcCode();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getCvcCode <em>Cvc Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvc Code</em>' attribute.
	 * @see #getCvcCode()
	 * @generated
	 */
	void setCvcCode(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_Owner()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

} // Creditcard
