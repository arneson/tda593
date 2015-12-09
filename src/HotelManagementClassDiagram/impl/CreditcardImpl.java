/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Creditcard;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creditcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.CreditcardImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CreditcardImpl#getCvc <em>Cvc</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CreditcardImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CreditcardImpl#getExpirationMonth <em>Expiration Month</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CreditcardImpl#getExpirationDay <em>Expiration Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditcardImpl extends MinimalEObjectImpl.Container implements Creditcard {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected long number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCvc() <em>Cvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvc()
	 * @generated
	 * @ordered
	 */
	protected static final int CVC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCvc() <em>Cvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvc()
	 * @generated
	 * @ordered
	 */
	protected int cvc = CVC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationMonth() <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpirationMonth() <em>Expiration Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationMonth()
	 * @generated
	 * @ordered
	 */
	protected int expirationMonth = EXPIRATION_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDay() <em>Expiration Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDay()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpirationDay() <em>Expiration Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDay()
	 * @generated
	 * @ordered
	 */
	protected int expirationDay = EXPIRATION_DAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditcardImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CreditcardImpl(long number, int cvc, int expirationMonth, int expirationYear, String owner) {
		super();
		this.number = number;
		this.cvc = cvc;
		this.expirationMonth = expirationMonth;
		this.expirationDay = expirationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.CREDITCARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(long newNumber) {
		long oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CREDITCARD__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCvc() {
		return cvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvc(int newCvc) {
		int oldCvc = cvc;
		cvc = newCvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CREDITCARD__CVC, oldCvc, cvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CREDITCARD__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpirationMonth() {
		return expirationMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationMonth(int newExpirationMonth) {
		int oldExpirationMonth = expirationMonth;
		expirationMonth = newExpirationMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_MONTH, oldExpirationMonth, expirationMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpirationDay() {
		return expirationDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDay(int newExpirationDay) {
		int oldExpirationDay = expirationDay;
		expirationDay = newExpirationDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_DAY, oldExpirationDay, expirationDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.CREDITCARD__NUMBER:
				return getNumber();
			case HotelManagementClassDiagramPackage.CREDITCARD__CVC:
				return getCvc();
			case HotelManagementClassDiagramPackage.CREDITCARD__OWNER:
				return getOwner();
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_MONTH:
				return getExpirationMonth();
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_DAY:
				return getExpirationDay();
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
			case HotelManagementClassDiagramPackage.CREDITCARD__NUMBER:
				setNumber((Long)newValue);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__CVC:
				setCvc((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__OWNER:
				setOwner((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_MONTH:
				setExpirationMonth((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_DAY:
				setExpirationDay((Integer)newValue);
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
			case HotelManagementClassDiagramPackage.CREDITCARD__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__CVC:
				setCvc(CVC_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_MONTH:
				setExpirationMonth(EXPIRATION_MONTH_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_DAY:
				setExpirationDay(EXPIRATION_DAY_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.CREDITCARD__NUMBER:
				return number != NUMBER_EDEFAULT;
			case HotelManagementClassDiagramPackage.CREDITCARD__CVC:
				return cvc != CVC_EDEFAULT;
			case HotelManagementClassDiagramPackage.CREDITCARD__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_MONTH:
				return expirationMonth != EXPIRATION_MONTH_EDEFAULT;
			case HotelManagementClassDiagramPackage.CREDITCARD__EXPIRATION_DAY:
				return expirationDay != EXPIRATION_DAY_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", cvc: ");
		result.append(cvc);
		result.append(", owner: ");
		result.append(owner);
		result.append(", expirationMonth: ");
		result.append(expirationMonth);
		result.append(", expirationDay: ");
		result.append(expirationDay);
		result.append(')');
		return result.toString();
	}

} //CreditcardImpl
