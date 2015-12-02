/**
 */
package HotelManagementClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Customer#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Customer#getBonusPoints <em>Bonus Points</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Customer#getMiscInfo <em>Misc Info</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer_CustomerId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCustomerId();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Customer#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(int value);

	/**
	 * Returns the value of the '<em><b>Bonus Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus Points</em>' attribute.
	 * @see #setBonusPoints(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer_BonusPoints()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBonusPoints();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Customer#getBonusPoints <em>Bonus Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus Points</em>' attribute.
	 * @see #getBonusPoints()
	 * @generated
	 */
	void setBonusPoints(int value);

	/**
	 * Returns the value of the '<em><b>Misc Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Info</em>' attribute.
	 * @see #setMiscInfo(String)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer_MiscInfo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMiscInfo();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Customer#getMiscInfo <em>Misc Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Misc Info</em>' attribute.
	 * @see #getMiscInfo()
	 * @generated
	 */
	void setMiscInfo(String value);

} // Customer
