/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Two Operand Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOTwoOperandLogicalExpression()
 * @model
 * @generated
 */
public interface OOTwoOperandLogicalExpression extends OOLogicalExpression {
        /**
         * Returns the value of the '<em><b>Left Side</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Left Side</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Left Side</em>' reference.
         * @see #setLeftSide(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTwoOperandLogicalExpression_LeftSide()
         * @model required="true"
         * @generated
         */
        OOExpression getLeftSide();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getLeftSide <em>Left Side</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Left Side</em>' reference.
         * @see #getLeftSide()
         * @generated
         */
        void setLeftSide(OOExpression value);

        /**
         * Returns the value of the '<em><b>Right Side</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Right Side</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Right Side</em>' reference.
         * @see #setRightSide(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTwoOperandLogicalExpression_RightSide()
         * @model required="true"
         * @generated
         */
        OOExpression getRightSide();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTwoOperandLogicalExpression#getRightSide <em>Right Side</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Right Side</em>' reference.
         * @see #getRightSide()
         * @generated
         */
        void setRightSide(OOExpression value);

} // OOTwoOperandLogicalExpression
