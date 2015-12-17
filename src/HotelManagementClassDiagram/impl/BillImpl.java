/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Bill;
import HotelManagementClassDiagram.Costable;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.BillImpl#getCostables <em>Costables</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BillImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BillImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BillImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BillImpl#isPaid <em>Paid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The cached value of the '{@link #getCostables() <em>Costables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostables()
	 * @generated
	 * @ordered
	 */
	protected EList<Costable> costables;

	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected double totalPrice = TOTAL_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean paid = PAID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Costable> getCostables() {
		if (costables == null) {
			costables = new EObjectResolvingEList<Costable>(Costable.class, this, HotelManagementClassDiagramPackage.BILL__COSTABLES);
		}
		return costables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPrice(double newTotalPrice) {
		double oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BILL__TOTAL_PRICE, oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.BILL__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BILL__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BILL__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaid(boolean newPaid) {
		boolean oldPaid = paid;
		paid = newPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BILL__PAID, oldPaid, paid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCostable(Costable costable) {
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
			case HotelManagementClassDiagramPackage.BILL__COSTABLES:
				return getCostables();
			case HotelManagementClassDiagramPackage.BILL__TOTAL_PRICE:
				return getTotalPrice();
			case HotelManagementClassDiagramPackage.BILL__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelManagementClassDiagramPackage.BILL__FINAL:
				return isFinal();
			case HotelManagementClassDiagramPackage.BILL__PAID:
				return isPaid();
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
			case HotelManagementClassDiagramPackage.BILL__COSTABLES:
				getCostables().clear();
				getCostables().addAll((Collection<? extends Costable>)newValue);
				return;
			case HotelManagementClassDiagramPackage.BILL__TOTAL_PRICE:
				setTotalPrice((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.BILL__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case HotelManagementClassDiagramPackage.BILL__FINAL:
				setFinal((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.BILL__PAID:
				setPaid((Boolean)newValue);
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
			case HotelManagementClassDiagramPackage.BILL__COSTABLES:
				getCostables().clear();
				return;
			case HotelManagementClassDiagramPackage.BILL__TOTAL_PRICE:
				setTotalPrice(TOTAL_PRICE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BILL__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case HotelManagementClassDiagramPackage.BILL__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BILL__PAID:
				setPaid(PAID_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.BILL__COSTABLES:
				return costables != null && !costables.isEmpty();
			case HotelManagementClassDiagramPackage.BILL__TOTAL_PRICE:
				return totalPrice != TOTAL_PRICE_EDEFAULT;
			case HotelManagementClassDiagramPackage.BILL__CUSTOMER:
				return customer != null;
			case HotelManagementClassDiagramPackage.BILL__FINAL:
				return final_ != FINAL_EDEFAULT;
			case HotelManagementClassDiagramPackage.BILL__PAID:
				return paid != PAID_EDEFAULT;
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
			case HotelManagementClassDiagramPackage.BILL___ADD_COSTABLE__COSTABLE:
				addCostable((Costable)arguments.get(0));
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
		result.append(" (totalPrice: ");
		result.append(totalPrice);
		result.append(", final: ");
		result.append(final_);
		result.append(", paid: ");
		result.append(paid);
		result.append(')');
		return result.toString();
	}

} //BillImpl
