/**
 */
package HotelManagementClassDiagram;

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
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getNumber <em>Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getCvc <em>Cvc</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getOwner <em>Owner</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getExpirationMonth <em>Expiration Month</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Creditcard#getExpirationYear <em>Expiration Year</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard()
 * @model
 * @generated
 */
public interface Creditcard extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(long)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getNumber();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(long value);

	/**
	 * Returns the value of the '<em><b>Cvc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cvc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvc</em>' attribute.
	 * @see #setCvc(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_Cvc()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCvc();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getCvc <em>Cvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvc</em>' attribute.
	 * @see #getCvc()
	 * @generated
	 */
	void setCvc(int value);

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

	/**
	 * Returns the value of the '<em><b>Expiration Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Month</em>' attribute.
	 * @see #setExpirationMonth(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_ExpirationMonth()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpirationMonth();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getExpirationMonth <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Month</em>' attribute.
	 * @see #getExpirationMonth()
	 * @generated
	 */
	void setExpirationMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiration Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Year</em>' attribute.
	 * @see #setExpirationYear(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCreditcard_ExpirationYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpirationYear();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Creditcard#getExpirationYear <em>Expiration Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Year</em>' attribute.
	 * @see #getExpirationYear()
	 * @generated
	 */
	void setExpirationYear(int value);

} // Creditcard
