/**
 */
package hu.bme.aut.oogen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OO Base Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.oogen.OogenPackage#getOOBaseType()
 * @model
 * @generated
 */
public enum OOBaseType implements Enumerator {
        /**
         * The '<em><b>INT</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #INT_VALUE
         * @generated
         * @ordered
         */
        INT(0, "INT", "INT"),

        /**
         * The '<em><b>LONG</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #LONG_VALUE
         * @generated
         * @ordered
         */
        LONG(1, "LONG", "LONG"),

        /**
         * The '<em><b>DOUBLE</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #DOUBLE_VALUE
         * @generated
         * @ordered
         */
        DOUBLE(2, "DOUBLE", "DOUBLE"),

        /**
         * The '<em><b>STRING</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #STRING_VALUE
         * @generated
         * @ordered
         */
        STRING(3, "STRING", "STRING"),

        /**
         * The '<em><b>OBJECT</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OBJECT_VALUE
         * @generated
         * @ordered
         */
        OBJECT(4, "OBJECT", "OBJECT"),

        /**
         * The '<em><b>BYTE</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #BYTE_VALUE
         * @generated
         * @ordered
         */
        BYTE(5, "BYTE", "BYTE"),

        /**
         * The '<em><b>BOOLEAN</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #BOOLEAN_VALUE
         * @generated
         * @ordered
         */
        BOOLEAN(6, "BOOLEAN", "BOOLEAN");

        /**
         * The '<em><b>INT</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #INT
         * @model
         * @generated
         * @ordered
         */
        public static final int INT_VALUE = 0;

        /**
         * The '<em><b>LONG</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #LONG
         * @model
         * @generated
         * @ordered
         */
        public static final int LONG_VALUE = 1;

        /**
         * The '<em><b>DOUBLE</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #DOUBLE
         * @model
         * @generated
         * @ordered
         */
        public static final int DOUBLE_VALUE = 2;

        /**
         * The '<em><b>STRING</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #STRING
         * @model
         * @generated
         * @ordered
         */
        public static final int STRING_VALUE = 3;

        /**
         * The '<em><b>OBJECT</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OBJECT</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OBJECT
         * @model
         * @generated
         * @ordered
         */
        public static final int OBJECT_VALUE = 4;

        /**
         * The '<em><b>BYTE</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #BYTE
         * @model
         * @generated
         * @ordered
         */
        public static final int BYTE_VALUE = 5;

        /**
         * The '<em><b>BOOLEAN</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #BOOLEAN
         * @model
         * @generated
         * @ordered
         */
        public static final int BOOLEAN_VALUE = 6;

        /**
         * An array of all the '<em><b>OO Base Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final OOBaseType[] VALUES_ARRAY =
                new OOBaseType[] {
                        INT,
                        LONG,
                        DOUBLE,
                        STRING,
                        OBJECT,
                        BYTE,
                        BOOLEAN,
                };

        /**
         * A public read-only list of all the '<em><b>OO Base Type</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<OOBaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>OO Base Type</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param literal the literal.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static OOBaseType get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        OOBaseType result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>OO Base Type</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param name the name.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static OOBaseType getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        OOBaseType result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>OO Base Type</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the integer value.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static OOBaseType get(int value) {
                switch (value) {
                        case INT_VALUE: return INT;
                        case LONG_VALUE: return LONG;
                        case DOUBLE_VALUE: return DOUBLE;
                        case STRING_VALUE: return STRING;
                        case OBJECT_VALUE: return OBJECT;
                        case BYTE_VALUE: return BYTE;
                        case BOOLEAN_VALUE: return BOOLEAN;
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
        private OOBaseType(int value, String name, String literal) {
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
        
} //OOBaseType
