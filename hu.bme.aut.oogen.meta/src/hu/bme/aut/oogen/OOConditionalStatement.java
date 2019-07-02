/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOConditionalStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOConditionalStatement()
 * @model
 * @generated
 */
public interface OOConditionalStatement extends OOStatement, OOCompoundStatement {
        /**
         * Returns the value of the '<em><b>Condition</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Condition</em>' containment reference.
         * @see #setCondition(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOConditionalStatement_Condition()
         * @model containment="true" required="true"
         * @generated
         */
        OOExpression getCondition();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOConditionalStatement#getCondition <em>Condition</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Condition</em>' containment reference.
         * @see #getCondition()
         * @generated
         */
        void setCondition(OOExpression value);

} // OOConditionalStatement
