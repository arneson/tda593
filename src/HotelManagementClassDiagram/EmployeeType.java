/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.EmployeeType#getType <em>Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.EmployeeType#getAcessLevel <em>Acess Level</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.EmployeeType#getWorkRate <em>Work Rate</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployeeType()
 * @model
 * @generated
 */
public interface EmployeeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link HotelManagementClassDiagram.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see HotelManagementClassDiagram.EType
	 * @see #setType(EType)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployeeType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.EmployeeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see HotelManagementClassDiagram.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

	/**
	 * Returns the value of the '<em><b>Acess Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acess Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acess Level</em>' attribute.
	 * @see #setAcessLevel(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployeeType_AcessLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAcessLevel();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.EmployeeType#getAcessLevel <em>Acess Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acess Level</em>' attribute.
	 * @see #getAcessLevel()
	 * @generated
	 */
	void setAcessLevel(int value);

	/**
	 * Returns the value of the '<em><b>Work Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Rate</em>' attribute.
	 * @see #setWorkRate(int)
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getEmployeeType_WorkRate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getWorkRate();

	/**
	 * Sets the value of the '{@link HotelManagementClassDiagram.EmployeeType#getWorkRate <em>Work Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Rate</em>' attribute.
	 * @see #getWorkRate()
	 * @generated
	 */
	void setWorkRate(int value);

} // EmployeeType
