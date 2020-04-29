/**
 */
package qualitypatternmodel.adaptionxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Axis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getRelationKind()
 * @model
 * @generated
 */
public enum RelationKind implements Enumerator {
	/**
	 * The '<em><b>CHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(0, "CHILD", "/child::*"),

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT(1, "DESCENDANT", "/descendant::*"),

	/**
	 * The '<em><b>PARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT(2, "PARENT", "/parent::*"),

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR(3, "ANCESTOR", "/ancestor::*"),

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWING(4, "FOLLOWING", "/following::*"),

	/**
	 * The '<em><b>FOLLOWING SIBLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_SIBLING_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWING_SIBLING(5, "FOLLOWING_SIBLING", "/following-sibling::*"),

	/**
	 * The '<em><b>PRECEDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDING(6, "PRECEDING", "/preceding::*"),

	/**
	 * The '<em><b>PRECEDING SIBLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_SIBLING_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDING_SIBLING(7, "PRECEDING_SIBLING", "/preceding-sibling::*"),

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR_OR_SELF(8, "ANCESTOR_OR_SELF", "/ancestor-or-self::*"),

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_OR_SELF_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT_OR_SELF(9, "DESCENDANT_OR_SELF", "/descendant-or-self::*"),

	/**
	 * The '<em><b>SELF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF_VALUE
	 * @generated
	 * @ordered
	 */
	SELF(10, "SELF", "/self::*"),

	/**
	 * The '<em><b>TWOCHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	TWOCHILD(11, "TWOCHILD", "/*/*"),

	/**
	 * The '<em><b>THREECHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREECHILD_VALUE
	 * @generated
	 * @ordered
	 */
	THREECHILD(12, "THREECHILD", "/*/*/*"),

	/**
	 * The '<em><b>FOURCHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOURCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	FOURCHILD(13, "FOURCHILD", "/*/*/*/*"), /**
	 * The '<em><b>FIVECHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVECHILD_VALUE
	 * @generated
	 * @ordered
	 */
	FIVECHILD(14, "FIVECHILD", "/*/*/*/*/*"), /**
	 * The '<em><b>SIXCHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	SIXCHILD(15, "SIXCHILD", "/*/*/*/*/*/*"), /**
	 * The '<em><b>SEVENCHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	SEVENCHILD(16, "SEVENCHILD", "/*/*/*/*/*/*/*"), /**
	 * The '<em><b>EIGHTCHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTCHILD_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHTCHILD(17, "EIGHTCHILD", "/*/*/*/*/*/*/*/*"), /**
	 * The '<em><b>NINECHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINECHILD_VALUE
	 * @generated
	 * @ordered
	 */
	NINECHILD(18, "NINECHILD", "/*/*/*/*/*/*/*/*/*");

	/**
	 * The '<em><b>CHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model literal="/child::*"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 0;

	/**
	 * The '<em><b>DESCENDANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT
	 * @model literal="/descendant::*"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_VALUE = 1;

	/**
	 * The '<em><b>PARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT
	 * @model literal="/parent::*"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_VALUE = 2;

	/**
	 * The '<em><b>ANCESTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR
	 * @model literal="/ancestor::*"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_VALUE = 3;

	/**
	 * The '<em><b>FOLLOWING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING
	 * @model literal="/following::*"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWING_VALUE = 4;

	/**
	 * The '<em><b>FOLLOWING SIBLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWING_SIBLING
	 * @model literal="/following-sibling::*"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWING_SIBLING_VALUE = 5;

	/**
	 * The '<em><b>PRECEDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING
	 * @model literal="/preceding::*"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDING_VALUE = 6;

	/**
	 * The '<em><b>PRECEDING SIBLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDING_SIBLING
	 * @model literal="/preceding-sibling::*"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDING_SIBLING_VALUE = 7;

	/**
	 * The '<em><b>ANCESTOR OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_OR_SELF
	 * @model literal="/ancestor-or-self::*"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_OR_SELF_VALUE = 8;

	/**
	 * The '<em><b>DESCENDANT OR SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_OR_SELF
	 * @model literal="/descendant-or-self::*"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_OR_SELF_VALUE = 9;

	/**
	 * The '<em><b>SELF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELF
	 * @model literal="/self::*"
	 * @generated
	 * @ordered
	 */
	public static final int SELF_VALUE = 10;

	/**
	 * The '<em><b>TWOCHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWOCHILD
	 * @model literal="/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int TWOCHILD_VALUE = 11;

	/**
	 * The '<em><b>THREECHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREECHILD
	 * @model literal="/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int THREECHILD_VALUE = 12;

	/**
	 * The '<em><b>FOURCHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOURCHILD
	 * @model literal="/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int FOURCHILD_VALUE = 13;

	/**
	 * The '<em><b>FIVECHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVECHILD
	 * @model literal="/\052/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int FIVECHILD_VALUE = 14;

	/**
	 * The '<em><b>SIXCHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIXCHILD
	 * @model literal="/\052/\052/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int SIXCHILD_VALUE = 15;

	/**
	 * The '<em><b>SEVENCHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENCHILD
	 * @model literal="/\052/\052/\052/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int SEVENCHILD_VALUE = 16;

	/**
	 * The '<em><b>EIGHTCHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHTCHILD
	 * @model literal="/\052/\052/\052/\052/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int EIGHTCHILD_VALUE = 17;

	/**
	 * The '<em><b>NINECHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINECHILD
	 * @model literal="/\052/\052/\052/\052/\052/\052/\052/\052/*"
	 * @generated
	 * @ordered
	 */
	public static final int NINECHILD_VALUE = 18;

	/**
	 * An array of all the '<em><b>Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationKind[] VALUES_ARRAY =
		new RelationKind[] {
			CHILD,
			DESCENDANT,
			PARENT,
			ANCESTOR,
			FOLLOWING,
			FOLLOWING_SIBLING,
			PRECEDING,
			PRECEDING_SIBLING,
			ANCESTOR_OR_SELF,
			DESCENDANT_OR_SELF,
			SELF,
			TWOCHILD,
			THREECHILD,
			FOURCHILD,
			FIVECHILD,
			SIXCHILD,
			SEVENCHILD,
			EIGHTCHILD,
			NINECHILD,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationKind get(int value) {
		switch (value) {
			case CHILD_VALUE: return CHILD;
			case DESCENDANT_VALUE: return DESCENDANT;
			case PARENT_VALUE: return PARENT;
			case ANCESTOR_VALUE: return ANCESTOR;
			case FOLLOWING_VALUE: return FOLLOWING;
			case FOLLOWING_SIBLING_VALUE: return FOLLOWING_SIBLING;
			case PRECEDING_VALUE: return PRECEDING;
			case PRECEDING_SIBLING_VALUE: return PRECEDING_SIBLING;
			case ANCESTOR_OR_SELF_VALUE: return ANCESTOR_OR_SELF;
			case DESCENDANT_OR_SELF_VALUE: return DESCENDANT_OR_SELF;
			case SELF_VALUE: return SELF;
			case TWOCHILD_VALUE: return TWOCHILD;
			case THREECHILD_VALUE: return THREECHILD;
			case FOURCHILD_VALUE: return FOURCHILD;
			case FIVECHILD_VALUE: return FIVECHILD;
			case SIXCHILD_VALUE: return SIXCHILD;
			case SEVENCHILD_VALUE: return SEVENCHILD;
			case EIGHTCHILD_VALUE: return EIGHTCHILD;
			case NINECHILD_VALUE: return NINECHILD;
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
	private RelationKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //Axis
