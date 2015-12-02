/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getBonusPoints <em>Bonus Points</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getMiscInfo <em>Misc Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected int customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBonusPoints() <em>Bonus Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonusPoints() <em>Bonus Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusPoints()
	 * @generated
	 * @ordered
	 */
	protected int bonusPoints = BONUS_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiscInfo() <em>Misc Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String MISC_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiscInfo() <em>Misc Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscInfo()
	 * @generated
	 * @ordered
	 */
	protected String miscInfo = MISC_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerId(int newCustomerId) {
		int oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonusPoints() {
		return bonusPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonusPoints(int newBonusPoints) {
		int oldBonusPoints = bonusPoints;
		bonusPoints = newBonusPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS, oldBonusPoints, bonusPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiscInfo() {
		return miscInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiscInfo(String newMiscInfo) {
		String oldMiscInfo = miscInfo;
		miscInfo = newMiscInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO, oldMiscInfo, miscInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBonusPoints(int bonusPoints) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerId();
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				return getBonusPoints();
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				return getMiscInfo();
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				setBonusPoints((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				setMiscInfo((String)newValue);
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				setBonusPoints(BONUS_POINTS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				setMiscInfo(MISC_INFO_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				return customerId != CUSTOMER_ID_EDEFAULT;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				return bonusPoints != BONUS_POINTS_EDEFAULT;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				return MISC_INFO_EDEFAULT == null ? miscInfo != null : !MISC_INFO_EDEFAULT.equals(miscInfo);
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
			case HotelManagementClassDiagramPackage.CUSTOMER___ADD_BONUS_POINTS__INT:
				addBonusPoints((Integer)arguments.get(0));
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
		result.append(" (customerId: ");
		result.append(customerId);
		result.append(", bonusPoints: ");
		result.append(bonusPoints);
		result.append(", miscInfo: ");
		result.append(miscInfo);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
