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
 *   <li>{@link HotelManagementClassDiagram.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.Employee#getEmployeeType <em>Employee Type</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployee_Salary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

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

} // Employee
