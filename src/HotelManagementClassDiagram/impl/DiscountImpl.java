/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.DiscountImpl#isPercentage <em>Is Percentage</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.DiscountImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.DiscountImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscountImpl extends MinimalEObjectImpl.Container implements Discount {
	/**
	 * The default value of the '{@link #isPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERCENTAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPercentage() <em>Is Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPercentage()
	 * @generated
	 * @ordered
	 */
	protected boolean isPercentage = IS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public DiscountImpl(String name, boolean isPercentage, double amount){
		this.name = name;
		this.isPercentage = isPercentage;
		this.amount = amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPercentage() {
		return isPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPercentage(boolean newIsPercentage) {
		boolean oldIsPercentage = isPercentage;
		isPercentage = newIsPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.DISCOUNT__IS_PERCENTAGE, oldIsPercentage, isPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.DISCOUNT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.DISCOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.DISCOUNT__IS_PERCENTAGE:
				return isPercentage();
			case HotelManagementClassDiagramPackage.DISCOUNT__AMOUNT:
				return getAmount();
			case HotelManagementClassDiagramPackage.DISCOUNT__NAME:
				return getName();
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
			case HotelManagementClassDiagramPackage.DISCOUNT__IS_PERCENTAGE:
				setIsPercentage((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.DISCOUNT__AMOUNT:
				setAmount((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.DISCOUNT__NAME:
				setName((String)newValue);
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
			case HotelManagementClassDiagramPackage.DISCOUNT__IS_PERCENTAGE:
				setIsPercentage(IS_PERCENTAGE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.DISCOUNT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.DISCOUNT__NAME:
				setName(NAME_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.DISCOUNT__IS_PERCENTAGE:
				return isPercentage != IS_PERCENTAGE_EDEFAULT;
			case HotelManagementClassDiagramPackage.DISCOUNT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case HotelManagementClassDiagramPackage.DISCOUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
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
		result.append(" (isPercentage: ");
		result.append(isPercentage);
		result.append(", amount: ");
		result.append(amount);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiscountImpl
