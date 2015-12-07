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
 *   <li>{@link HotelManagementClassDiagram.Customer#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Customer#getBonusPoints <em>Bonus Points</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Customer#getMiscInfo <em>Misc Info</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Customer#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer ID</em>' attribute.
	 * @see #setCustomerID(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer_CustomerID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCustomerID();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Customer#getCustomerID <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer ID</em>' attribute.
	 * @see #getCustomerID()
	 * @generated
	 */
	void setCustomerID(int value);

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

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCustomer_Rank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getRank();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Customer#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bonusPointsRequired="true" bonusPointsOrdered="false"
	 * @generated
	 */
	void addBonusPoints(int bonusPoints);

} // Customer
