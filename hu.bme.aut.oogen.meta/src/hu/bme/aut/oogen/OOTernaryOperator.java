/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Ternary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperator#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperator#getPositiveBranch <em>Positive Branch</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperator#getNegativeBranch <em>Negative Branch</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOTernaryOperator()
 * @model
 * @generated
 */
public interface OOTernaryOperator extends OOLogicalExpression {
        /**
         * Returns the value of the '<em><b>Condition</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Condition</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Condition</em>' reference.
         * @see #setCondition(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTernaryOperator_Condition()
         * @model required="true"
         * @generated
         */
        OOExpression getCondition();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTernaryOperator#getCondition <em>Condition</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Condition</em>' reference.
         * @see #getCondition()
         * @generated
         */
        void setCondition(OOExpression value);

        /**
         * Returns the value of the '<em><b>Positive Branch</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Positive Branch</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Positive Branch</em>' reference.
         * @see #setPositiveBranch(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTernaryOperator_PositiveBranch()
         * @model required="true"
         * @generated
         */
        OOExpression getPositiveBranch();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTernaryOperator#getPositiveBranch <em>Positive Branch</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Positive Branch</em>' reference.
         * @see #getPositiveBranch()
         * @generated
         */
        void setPositiveBranch(OOExpression value);

        /**
         * Returns the value of the '<em><b>Negative Branch</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Negative Branch</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Negative Branch</em>' reference.
         * @see #setNegativeBranch(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOTernaryOperator_NegativeBranch()
         * @model required="true"
         * @generated
         */
        OOExpression getNegativeBranch();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOTernaryOperator#getNegativeBranch <em>Negative Branch</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Negative Branch</em>' reference.
         * @see #getNegativeBranch()
         * @generated
         */
        void setNegativeBranch(OOExpression value);

} // OOTernaryOperator
