/**
 */
package GTFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Route Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see GTFS.GTFSPackage#getGTFSRouteType()
 * @model
 * @generated
 */
public enum GTFSRouteType implements Enumerator {
	/**
	 * The '<em><b>Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(0, "Tram", "Tram"),

	/**
	 * The '<em><b>Subway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBWAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBWAY(1, "Subway", "Subway"),

	/**
	 * The '<em><b>Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL(2, "Rail", "Rail"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(3, "Bus", "Bus"),

	/**
	 * The '<em><b>Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	FERRY(4, "Ferry", "Ferry"),

	/**
	 * The '<em><b>Cable Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	CABLE_TRAM(5, "CableTram", "CableTram"),

	/**
	 * The '<em><b>Aerial Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AERIAL_LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	AERIAL_LIFT(6, "AerialLift", "AerialLift"),

	/**
	 * The '<em><b>Funicular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNICULAR_VALUE
	 * @generated
	 * @ordered
	 */
	FUNICULAR(7, "Funicular", "Funicular"),

	/**
	 * The '<em><b>Trolleybus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TROLLEYBUS_VALUE
	 * @generated
	 * @ordered
	 */
	TROLLEYBUS(11, "Trolleybus", "Trolleybus"),

	/**
	 * The '<em><b>Monorail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONORAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MONORAIL(12, "Monorail", "Monorail");

	/**
	 * The '<em><b>Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model name="Tram"
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 0;

	/**
	 * The '<em><b>Subway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBWAY
	 * @model name="Subway"
	 * @generated
	 * @ordered
	 */
	public static final int SUBWAY_VALUE = 1;

	/**
	 * The '<em><b>Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL
	 * @model name="Rail"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_VALUE = 2;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="Bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 3;

	/**
	 * The '<em><b>Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERRY
	 * @model name="Ferry"
	 * @generated
	 * @ordered
	 */
	public static final int FERRY_VALUE = 4;

	/**
	 * The '<em><b>Cable Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABLE_TRAM
	 * @model name="CableTram"
	 * @generated
	 * @ordered
	 */
	public static final int CABLE_TRAM_VALUE = 5;

	/**
	 * The '<em><b>Aerial Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AERIAL_LIFT
	 * @model name="AerialLift"
	 * @generated
	 * @ordered
	 */
	public static final int AERIAL_LIFT_VALUE = 6;

	/**
	 * The '<em><b>Funicular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNICULAR
	 * @model name="Funicular"
	 * @generated
	 * @ordered
	 */
	public static final int FUNICULAR_VALUE = 7;

	/**
	 * The '<em><b>Trolleybus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TROLLEYBUS
	 * @model name="Trolleybus"
	 * @generated
	 * @ordered
	 */
	public static final int TROLLEYBUS_VALUE = 11;

	/**
	 * The '<em><b>Monorail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONORAIL
	 * @model name="Monorail"
	 * @generated
	 * @ordered
	 */
	public static final int MONORAIL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Route Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GTFSRouteType[] VALUES_ARRAY =
		new GTFSRouteType[] {
			TRAM,
			SUBWAY,
			RAIL,
			BUS,
			FERRY,
			CABLE_TRAM,
			AERIAL_LIFT,
			FUNICULAR,
			TROLLEYBUS,
			MONORAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Route Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GTFSRouteType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Route Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GTFSRouteType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GTFSRouteType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Route Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GTFSRouteType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GTFSRouteType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Route Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GTFSRouteType get(int value) {
		switch (value) {
			case TRAM_VALUE: return TRAM;
			case SUBWAY_VALUE: return SUBWAY;
			case RAIL_VALUE: return RAIL;
			case BUS_VALUE: return BUS;
			case FERRY_VALUE: return FERRY;
			case CABLE_TRAM_VALUE: return CABLE_TRAM;
			case AERIAL_LIFT_VALUE: return AERIAL_LIFT;
			case FUNICULAR_VALUE: return FUNICULAR;
			case TROLLEYBUS_VALUE: return TROLLEYBUS;
			case MONORAIL_VALUE: return MONORAIL;
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
	private GTFSRouteType(int value, String name, String literal) {
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
	
} //GTFSRouteType
