/**
 */
package HotelManagementClassDiagram.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.Bill;
import HotelManagementClassDiagram.Booking;
import HotelManagementClassDiagram.Creditcard;
import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getBookingId <em>Booking Id</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getAddons <em>Addons</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getBookedRooms <em>Booked Rooms</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getInternalComments <em>Internal Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getExternalComments <em>External Comments</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getPaymentMaster <em>Payment Master</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.BookingImpl#getRoomTypes <em>Room Types</em>}</li>
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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getCreditCard() <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCard()
	 * @generated
	 * @ordered
	 */
	protected Creditcard creditCard;

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
	 * The cached value of the '{@link #getBookedRooms() <em>Booked Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> bookedRooms;

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
	 * The cached value of the '{@link #getPaymentMaster() <em>Payment Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMaster()
	 * @generated
	 * @ordered
	 */
	protected Customer paymentMaster;

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
	 * The cached value of the '{@link #getRoomTypes() <em>Room Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomType> roomTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public BookingImpl(Customer customer, Date startDate, Date endDate, Room... rooms){
		this.paymentMaster = customer;
		this.bookingId = customer.hashCode();
		this.startDate = startDate;
		this.endDate = endDate;
		bookedRooms = new BasicEList<Room>();
		for (Room room : rooms) {
			bookedRooms.add(room);
		}
	}
	
	/**
	 * @generated NOT
	 */
	public BookingImpl(Customer customer, Date startDate, Date endDate, BasicEList<RoomType> types){
		this.paymentMaster = customer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.bookingId = customer.hashCode();
		this.roomTypes = new BasicEList<RoomType>();
		for (RoomType type : types) {
			roomTypes.add(type);
		}
		
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
	 * @generated NOT
	 */
	public void setBookingId(int newBookingId) {
		throw new UnsupportedOperationException("Not a supported operation");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__END_DATE, oldEndDate, endDate));
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
	public Creditcard getCreditCard() {
		if (creditCard != null && creditCard.eIsProxy()) {
			InternalEObject oldCreditCard = (InternalEObject)creditCard;
			creditCard = (Creditcard)eResolveProxy(oldCreditCard);
			if (creditCard != oldCreditCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
			}
		}
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creditcard basicGetCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(Creditcard newCreditCard) {
		Creditcard oldCreditCard = creditCard;
		creditCard = newCreditCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
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
	public EList<Room> getBookedRooms() {
		if (bookedRooms == null) {
			bookedRooms = new EObjectResolvingEList<Room>(Room.class, this, HotelManagementClassDiagramPackage.BOOKING__BOOKED_ROOMS);
		}
		return bookedRooms;
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
	public Customer getPaymentMaster() {
		if (paymentMaster != null && paymentMaster.eIsProxy()) {
			InternalEObject oldPaymentMaster = (InternalEObject)paymentMaster;
			paymentMaster = (Customer)eResolveProxy(oldPaymentMaster);
			if (paymentMaster != oldPaymentMaster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER, oldPaymentMaster, paymentMaster));
			}
		}
		return paymentMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetPaymentMaster() {
		return paymentMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMaster(Customer newPaymentMaster) {
		Customer oldPaymentMaster = paymentMaster;
		paymentMaster = newPaymentMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER, oldPaymentMaster, paymentMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getDiscounts() {
		if (discounts == null) {
			discounts = new EObjectResolvingEList<Discount>(Discount.class, this, HotelManagementClassDiagramPackage.BOOKING__DISCOUNTS);
		}
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomType> getRoomTypes() {
		if (roomTypes == null) {
			roomTypes = new EDataTypeUniqueEList<RoomType>(RoomType.class, this, HotelManagementClassDiagramPackage.BOOKING__ROOM_TYPES);
		}
		return roomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill checkOut() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAddon(Addon addon) {
		this.addons.add(addon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRoom(Room room) {
		this.bookedRooms.add(room);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeAddon(Addon addon) {
		Iterator<Addon> it = this.addons.iterator();
		while (it.hasNext()) {
			if(it.next().equals(addon)) {
				it.remove();
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRoom(Room room) {
		Iterator<Room> it = this.bookedRooms.iterator();
		while (it.hasNext()) {
			if(it.next().equals(room)) {
				it.remove();
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill generateBill() {
		Bill b = new BillImpl();
		for (Room r : this.bookedRooms) {
			b.addCostable(r);
		}
		for (Addon a : this.addons) {
			b.addCostable(a);
		}
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean pay(Bill bill) {
		bill.setPaid(true);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDiscount(Discount discount) {
		this.discounts.add(discount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDiscount(Discount discount) {
		Iterator<Discount> it = this.discounts.iterator();
		while(it.hasNext()) {
			if(discount.equals(it.next())) {
				it.remove();
				break;
			}
		}
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
			case HotelManagementClassDiagramPackage.BOOKING__START_DATE:
				return getStartDate();
			case HotelManagementClassDiagramPackage.BOOKING__END_DATE:
				return getEndDate();
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				return getCreated();
			case HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD:
				if (resolve) return getCreditCard();
				return basicGetCreditCard();
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				return getAddons();
			case HotelManagementClassDiagramPackage.BOOKING__BOOKED_ROOMS:
				return getBookedRooms();
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				return getInternalComments();
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				return getExternalComments();
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				return isCheckedIn();
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				return isCheckedOut();
			case HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER:
				if (resolve) return getPaymentMaster();
				return basicGetPaymentMaster();
			case HotelManagementClassDiagramPackage.BOOKING__DISCOUNTS:
				return getDiscounts();
			case HotelManagementClassDiagramPackage.BOOKING__ROOM_TYPES:
				return getRoomTypes();
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
			case HotelManagementClassDiagramPackage.BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				setCreated((Date)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD:
				setCreditCard((Creditcard)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				getAddons().clear();
				getAddons().addAll((Collection<? extends Addon>)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__BOOKED_ROOMS:
				getBookedRooms().clear();
				getBookedRooms().addAll((Collection<? extends Room>)newValue);
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
			case HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER:
				setPaymentMaster((Customer)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__DISCOUNTS:
				getDiscounts().clear();
				getDiscounts().addAll((Collection<? extends Discount>)newValue);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ROOM_TYPES:
				getRoomTypes().clear();
				getRoomTypes().addAll((Collection<? extends RoomType>)newValue);
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
			case HotelManagementClassDiagramPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD:
				setCreditCard((Creditcard)null);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				getAddons().clear();
				return;
			case HotelManagementClassDiagramPackage.BOOKING__BOOKED_ROOMS:
				getBookedRooms().clear();
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
			case HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER:
				setPaymentMaster((Customer)null);
				return;
			case HotelManagementClassDiagramPackage.BOOKING__DISCOUNTS:
				getDiscounts().clear();
				return;
			case HotelManagementClassDiagramPackage.BOOKING__ROOM_TYPES:
				getRoomTypes().clear();
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
			case HotelManagementClassDiagramPackage.BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelManagementClassDiagramPackage.BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case HotelManagementClassDiagramPackage.BOOKING__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HotelManagementClassDiagramPackage.BOOKING__CREDIT_CARD:
				return creditCard != null;
			case HotelManagementClassDiagramPackage.BOOKING__ADDONS:
				return addons != null && !addons.isEmpty();
			case HotelManagementClassDiagramPackage.BOOKING__BOOKED_ROOMS:
				return bookedRooms != null && !bookedRooms.isEmpty();
			case HotelManagementClassDiagramPackage.BOOKING__INTERNAL_COMMENTS:
				return INTERNAL_COMMENTS_EDEFAULT == null ? internalComments != null : !INTERNAL_COMMENTS_EDEFAULT.equals(internalComments);
			case HotelManagementClassDiagramPackage.BOOKING__EXTERNAL_COMMENTS:
				return EXTERNAL_COMMENTS_EDEFAULT == null ? externalComments != null : !EXTERNAL_COMMENTS_EDEFAULT.equals(externalComments);
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
			case HotelManagementClassDiagramPackage.BOOKING__CHECKED_OUT:
				return checkedOut != CHECKED_OUT_EDEFAULT;
			case HotelManagementClassDiagramPackage.BOOKING__PAYMENT_MASTER:
				return paymentMaster != null;
			case HotelManagementClassDiagramPackage.BOOKING__DISCOUNTS:
				return discounts != null && !discounts.isEmpty();
			case HotelManagementClassDiagramPackage.BOOKING__ROOM_TYPES:
				return roomTypes != null && !roomTypes.isEmpty();
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
			case HotelManagementClassDiagramPackage.BOOKING___CHECK_IN:
				checkIn();
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___CHECK_OUT:
				return checkOut();
			case HotelManagementClassDiagramPackage.BOOKING___ADD_ADDON__ADDON:
				addAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___ADD_ROOM__ROOM:
				addRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___REMOVE_ADDON__ADDON:
				removeAddon((Addon)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___REMOVE_ROOM__ROOM:
				removeRoom((Room)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___GENERATE_BILL:
				return generateBill();
			case HotelManagementClassDiagramPackage.BOOKING___PAY__BILL:
				return pay((Bill)arguments.get(0));
			case HotelManagementClassDiagramPackage.BOOKING___ADD_DISCOUNT__DISCOUNT:
				addDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.BOOKING___REMOVE_DISCOUNT__DISCOUNT:
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
		result.append(" (bookingId: ");
		result.append(bookingId);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
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
		result.append(", roomTypes: ");
		result.append(roomTypes);
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
		result = prime * result + bookingId;
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
		BookingImpl other = (BookingImpl) obj;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}

} //BookingImpl
