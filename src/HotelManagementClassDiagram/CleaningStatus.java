/**
 */
package HotelManagementClassDiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cleaning Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getCleaningStatus()
 * @model
 * @generated
 */
public enum CleaningStatus implements Enumerator {
	/**
	 * The '<em><b>Clean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAN(0, "Clean", "Clean"),

	/**
	 * The '<em><b>Needcleaning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDCLEANING_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDCLEANING(1, "Needcleaning", "Needcleaning"),

	/**
	 * The '<em><b>Busy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY(2, "Busy", "Busy");

	/**
	 * The '<em><b>Clean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAN
	 * @model name="Clean"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAN_VALUE = 0;

	/**
	 * The '<em><b>Needcleaning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Needcleaning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEEDCLEANING
	 * @model name="Needcleaning"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Need cleaning'"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDCLEANING_VALUE = 1;

	/**
	 * The '<em><b>Busy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Busy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY
	 * @model name="Busy"
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cleaning Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CleaningStatus[] VALUES_ARRAY =
		new CleaningStatus[] {
			CLEAN,
			NEEDCLEANING,
			BUSY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cleaning Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CleaningStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CleaningStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CleaningStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cleaning Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CleaningStatus get(int value) {
		switch (value) {
			case CLEAN_VALUE: return CLEAN;
			case NEEDCLEANING_VALUE: return NEEDCLEANING;
			case BUSY_VALUE: return BUSY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CleaningStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CleaningStatus
