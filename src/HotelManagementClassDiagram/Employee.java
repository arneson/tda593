/**
 */
package HotelManagementClassDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.Employee#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Employee#getEmployeeID <em>Employee ID</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Employee Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Type</em>' reference.
	 * @see #setEmployeeType(EmployeeType)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployee_EmployeeType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EmployeeType getEmployeeType();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Employee#getEmployeeType <em>Employee Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Type</em>' reference.
	 * @see #getEmployeeType()
	 * @generated
	 */
	void setEmployeeType(EmployeeType value);

	/**
	 * Returns the value of the '<em><b>Employee ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee ID</em>' attribute.
	 * @see #setEmployeeID(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployee_EmployeeID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getEmployeeID();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Employee#getEmployeeID <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee ID</em>' attribute.
	 * @see #getEmployeeID()
	 * @generated
	 */
	void setEmployeeID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Booking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Boolean();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void roomTypes();

} // Employee
