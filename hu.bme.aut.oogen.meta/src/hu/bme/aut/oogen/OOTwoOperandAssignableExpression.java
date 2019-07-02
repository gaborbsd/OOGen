/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Two Operand Assignable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandAssignableExpression#isAssigned <em>Assigned</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOTwoOperandAssignableExpression()
 * @model
 * @generated
 */
public interface OOTwoOperandAssignableExpression extends OOTwoOperandArithmeticExpression {
        /**
         * Returns the value of the '<em><b>Assigned</b></em>' attribute.
         * The default value is <code>"false"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Assigned</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Assigned</em>' attribute.
         * @see #setAssigned(boolean)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTwoOperandAssignableExpression_Assigned()
         * @model default="false" required="true"
         * @generated
         */
        boolean isAssigned();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTwoOperandAssignableExpression#isAssigned <em>Assigned</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Assigned</em>' attribute.
         * @see #isAssigned()
         * @generated
         */
        void setAssigned(boolean value);

} // OOTwoOperandAssignableExpression
