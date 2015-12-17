/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Employee;
import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeImpl#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeImpl#getEmployeeID <em>Employee ID</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeImpl#getWorkRate <em>Work Rate</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getEmployeeType() <em>Employee Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeType()
	 * @generated
	 * @ordered
	 */
	protected EmployeeType employeeType;

	/**
	 * The default value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLOYEE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmployeeID() <em>Employee ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeID()
	 * @generated
	 * @ordered
	 */
	protected int employeeID = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkRate() <em>Work Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkRate()
	 * @generated
	 * @ordered
	 */
	protected static final double WORK_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWorkRate() <em>Work Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkRate()
	 * @generated
	 * @ordered
	 */
	protected double workRate = WORK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected double salary = SALARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public EmployeeImpl(EmployeeType type, double salary, double workrate, String name, String city,
						String country, String gender, String phoneNumber, String postalCode, String ssnumber,
						String street, String title){
        super(name, title, gender, ssnumber, phoneNumber, country, city, postalCode, street);
		this.employeeID = name.hashCode();
        this.employeeType = type;
        this.salary = salary;
        this.workRate = workrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeType getEmployeeType() {
		if (employeeType != null && employeeType.eIsProxy()) {
			InternalEObject oldEmployeeType = (InternalEObject)employeeType;
			employeeType = (EmployeeType)eResolveProxy(oldEmployeeType);
			if (employeeType != oldEmployeeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE, oldEmployeeType, employeeType));
			}
		}
		return employeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeType basicGetEmployeeType() {
		return employeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeType(EmployeeType newEmployeeType) {
		EmployeeType oldEmployeeType = employeeType;
		employeeType = newEmployeeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE, oldEmployeeType, employeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeID(int newEmployeeID) {
		int oldEmployeeID = employeeID;
		employeeID = newEmployeeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_ID, oldEmployeeID, employeeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWorkRate() {
		return workRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkRate(double newWorkRate) {
		double oldWorkRate = workRate;
		workRate = newWorkRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE__WORK_RATE, oldWorkRate, workRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Booking() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void Boolean() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void roomTypes() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE:
				if (resolve) return getEmployeeType();
				return basicGetEmployeeType();
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_ID:
				return getEmployeeID();
			case HotelManagementClassDiagramPackage.EMPLOYEE__WORK_RATE:
				return getWorkRate();
			case HotelManagementClassDiagramPackage.EMPLOYEE__SALARY:
				return getSalary();
			case HotelManagementClassDiagramPackage.EMPLOYEE__PASSWORD:
				return getPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE:
				setEmployeeType((EmployeeType)newValue);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeID((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__WORK_RATE:
				setWorkRate((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__SALARY:
				setSalary((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__PASSWORD:
				setPassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE:
				setEmployeeType((EmployeeType)null);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeID(EMPLOYEE_ID_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__WORK_RATE:
				setWorkRate(WORK_RATE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__SALARY:
				setSalary(SALARY_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_TYPE:
				return employeeType != null;
			case HotelManagementClassDiagramPackage.EMPLOYEE__EMPLOYEE_ID:
				return employeeID != EMPLOYEE_ID_EDEFAULT;
			case HotelManagementClassDiagramPackage.EMPLOYEE__WORK_RATE:
				return workRate != WORK_RATE_EDEFAULT;
			case HotelManagementClassDiagramPackage.EMPLOYEE__SALARY:
				return salary != SALARY_EDEFAULT;
			case HotelManagementClassDiagramPackage.EMPLOYEE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE___BOOKING:
				Booking();
				return null;
			case HotelManagementClassDiagramPackage.EMPLOYEE___BOOLEAN:
				Boolean();
				return null;
			case HotelManagementClassDiagramPackage.EMPLOYEE___ROOM_TYPES:
				roomTypes();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (employeeID: ");
		result.append(employeeID);
		result.append(", workRate: ");
		result.append(workRate);
		result.append(", salary: ");
		result.append(salary);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeID;
		return result;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeImpl other = (EmployeeImpl) obj;
		if (employeeID != other.employeeID)
			return false;
		return true;
	}
	

} //EmployeeImpl
