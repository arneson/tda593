/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Bill;
import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Creditcard;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getTo <em>To</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getCreditcard <em>Creditcard</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getAddons <em>Addons</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getInternalComments <em>Internal Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getExternalComments <em>External Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#isCheckedOut <em>Checked Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingId() <em>Booking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingId()
	 * @generated
	 * @ordered
	 */
	protected int bookingId = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreditcard() <em>Creditcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditcard()
	 * @generated
	 * @ordered
	 */
	protected Creditcard creditcard;

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
	 * The cached value of the '{@link #getAddons() <em>Addons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddons()
	 * @generated
	 * @ordered
	 */
	protected EList<Addon> addons;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The default value of the '{@link #getInternalComments() <em>Internal Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComments()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalComments() <em>Internal Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComments()
	 * @generated
	 * @ordered
	 */
	protected String internalComments = INTERNAL_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalComments() <em>External Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalComments()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalComments() <em>External Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalComments()
	 * @generated
	 * @ordered
	 */
	protected String externalComments = EXTERNAL_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedOut = CHECKED_OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingId(int newBookingId) {
		int oldBookingId = bookingId;
		bookingId = newBookingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__BOOKING_ID, oldBookingId, bookingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creditcard getCreditcard() {
		if (creditcard != null && creditcard.eIsProxy()) {
			InternalEObject oldCreditcard = (InternalEObject)creditcard;
			creditcard = (Creditcard)eResolveProxy(oldCreditcard);
			if (creditcard != oldCreditcard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.BOOKING__CREDITCARD, oldCreditcard, creditcard));
			}
		}
		return creditcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creditcard basicGetCreditcard() {
		return creditcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditcard(Creditcard newCreditcard) {
		Creditcard oldCreditcard = creditcard;
		creditcard = newCreditcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CREDITCARD, oldCreditcard, creditcard));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.BOOKING__CUSTOMER, oldCustomer, customer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Addon> getAddons() {
		if (addons == null) {
			addons = new EObjectResolvingEList<Addon>(Addon.class, this, HotelManagementClassDiagramPackage.BOOKING__ADDONS);
		}
		return addons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectResolvingEList<Room>(Room.class, this, HotelManagementClassDiagramPackage.BOOKING__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalComments() {
		return internalComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalComments(String newInternalComments) {
		String oldInternalComments = internalComments;
		internalComments = newInternalComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS, oldInternalComments, internalComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalComments() {
		return externalComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalComments(String newExternalComments) {
		String oldExternalComments = externalComments;
		externalComments = newExternalComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS, oldExternalComments, externalComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(boolean newCheckedIn) {
		boolean oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedOut() {
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedOut(boolean newCheckedOut) {
		boolean oldCheckedOut = checkedOut;
		checkedOut = newCheckedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT, oldCheckedOut, checkedOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCreditcard(Creditcard creditcard) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAddons(Addon addons) {
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
			case HotelManagementClassDiagramPackage.BOOKING__BOOKING_ID:
				return getBookingId();
			case HotelManagementClassDiagramPackage.BOOKING__FROM:
				return getFrom();
			case HotelManagementClassDiagramPackage.BOOKING__TO:
				return getTo();
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				return getCreated();
			case HotelManagementClassDiagramPackage.BOOKING__CREDITCARD:
				if (resolve) return getCreditcard();
				return basicGetCreditcard();
			case HotelManagementClassDiagramPackage.BOOKING__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				return getAddons();
			case HotelManagementClassDiagramPackage.BOOKING__ROOMS:
				return getRooms();
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				return getInternalComments();
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				return getExternalComments();
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				return isCheckedIn();
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				return isCheckedOut();
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
			case HotelManagementClassDiagramPackage.BOOKING__BOOKING_ID:
				setBookingId((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__FROM:
				setFrom((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__TO:
				setTo((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				setCreated((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREDITCARD:
				setCreditcard((Creditcard)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				getAddons().clear();
				getAddons().addAll((Collection<? extends Addon>)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				setInternalComments((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				setExternalComments((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				setCheckedIn((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				setCheckedOut((Boolean)newValue);
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
			case HotelManagementClassDiagramPackage.BOOKING__BOOKING_ID:
				setBookingId(BOOKING_ID_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__TO:
				setTo(TO_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREDITCARD:
				setCreditcard((Creditcard)null);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				getAddons().clear();
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ROOMS:
				getRooms().clear();
				return;
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				setInternalComments(INTERNAL_COMMENTS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				setExternalComments(EXTERNAL_COMMENTS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				setCheckedOut(CHECKED_OUT_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.BOOKING__BOOKING_ID:
				return bookingId != BOOKING_ID_EDEFAULT;
			case HotelManagementClassDiagramPackage.BOOKING__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case HotelManagementClassDiagramPackage.BOOKING__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HotelManagementClassDiagramPackage.BOOKING__CREDITCARD:
				return creditcard != null;
			case HotelManagementClassDiagramPackage.BOOKING__CUSTOMER:
				return customer != null;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				return addons != null && !addons.isEmpty();
			case HotelManagementClassDiagramPackage.BOOKING__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				return INTERNAL_COMMENTS_EDEFAULT == null ? internalComments != null : !INTERNAL_COMMENTS_EDEFAULT.equals(internalComments);
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				return EXTERNAL_COMMENTS_EDEFAULT == null ? externalComments != null : !EXTERNAL_COMMENTS_EDEFAULT.equals(externalComments);
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				return checkedOut != CHECKED_OUT_EDEFAULT;
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
			case HotelManagementClassDiagramPackage.BOOKING___CREATE_BILL:
				return createBill();
			case HotelManagementClassDiagramPackage.BOOKING___GET_CREDITCARD__CREDITCARD:
				getCreditcard((Creditcard)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___ADD_ADDONS__ADDON:
				addAddons((Addon)arguments.get(0));
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
		result.append(" (bookingId: ");
		result.append(bookingId);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", created: ");
		result.append(created);
		result.append(", internalComments: ");
		result.append(internalComments);
		result.append(", externalComments: ");
		result.append(externalComments);
		result.append(", checkedIn: ");
		result.append(checkedIn);
		result.append(", checkedOut: ");
		result.append(checkedOut);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
