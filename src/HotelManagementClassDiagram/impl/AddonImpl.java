/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.AddonImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.AddonImpl#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddonImpl extends ExtraImpl implements Addon {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDiscounts() <em>Discounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Discount> discounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddonImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public AddonImpl(String name, String description, double price){
		this.name = name;
		this.description = description;
		this.price = price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.ADDON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ADDON__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getDiscounts() {
		if (discounts == null) {
			discounts = new EObjectResolvingEList<Discount>(Discount.class, this, HotelManagementClassDiagramPackage.ADDON__DISCOUNTS);
		}
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDiscount(Discount discount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeDiscount(Discount discount) {
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
			case HotelManagementClassDiagramPackage.ADDON__PRICE:
				return getPrice();
			case HotelManagementClassDiagramPackage.ADDON__DISCOUNTS:
				return getDiscounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.ADDON__PRICE:
				setPrice((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.ADDON__DISCOUNTS:
				getDiscounts().clear();
				getDiscounts().addAll((Collection<? extends Discount>)newValue);
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
			case HotelManagementClassDiagramPackage.ADDON__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ADDON__DISCOUNTS:
				getDiscounts().clear();
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
			case HotelManagementClassDiagramPackage.ADDON__PRICE:
				return price != PRICE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ADDON__DISCOUNTS:
				return discounts != null && !discounts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Costable.class) {
			switch (derivedFeatureID) {
				case HotelManagementClassDiagramPackage.ADDON__PRICE: return HotelManagementClassDiagramPackage.COSTABLE__PRICE;
				case HotelManagementClassDiagramPackage.ADDON__DISCOUNTS: return HotelManagementClassDiagramPackage.COSTABLE__DISCOUNTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Costable.class) {
			switch (baseFeatureID) {
				case HotelManagementClassDiagramPackage.COSTABLE__PRICE: return HotelManagementClassDiagramPackage.ADDON__PRICE;
				case HotelManagementClassDiagramPackage.COSTABLE__DISCOUNTS: return HotelManagementClassDiagramPackage.ADDON__DISCOUNTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Costable.class) {
			switch (baseOperationID) {
				case HotelManagementClassDiagramPackage.COSTABLE___ADD_DISCOUNT__DISCOUNT: return HotelManagementClassDiagramPackage.ADDON___ADD_DISCOUNT__DISCOUNT;
				case HotelManagementClassDiagramPackage.COSTABLE___REMOVE_DISCOUNT__DISCOUNT: return HotelManagementClassDiagramPackage.ADDON___REMOVE_DISCOUNT__DISCOUNT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.ADDON___ADD_DISCOUNT__DISCOUNT:
				addDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.ADDON___REMOVE_DISCOUNT__DISCOUNT:
				removeDiscount((Discount)arguments.get(0));
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
		result.append(" (price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //AddonImpl
