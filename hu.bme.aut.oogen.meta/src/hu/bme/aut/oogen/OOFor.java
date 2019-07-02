/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOFor#getInitStatement <em>Init Statement</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOFor#getIncrementExpression <em>Increment Expression</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOFor()
 * @model
 * @generated
 */
public interface OOFor extends OOConditionalStatement {
        /**
         * Returns the value of the '<em><b>Init Statement</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Init Statement</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Init Statement</em>' reference.
         * @see #setInitStatement(OOStatement)
         * @see hu.bme.aut.oogen.OogenPackage#getOOFor_InitStatement()
         * @model required="true"
         * @generated
         */
        OOStatement getInitStatement();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOFor#getInitStatement <em>Init Statement</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Init Statement</em>' reference.
         * @see #getInitStatement()
         * @generated
         */
        void setInitStatement(OOStatement value);

        /**
         * Returns the value of the '<em><b>Increment Expression</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Increment Expression</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Increment Expression</em>' containment reference.
         * @see #setIncrementExpression(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOFor_IncrementExpression()
         * @model containment="true" required="true"
         * @generated
         */
        OOExpression getIncrementExpression();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOFor#getIncrementExpression <em>Increment Expression</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Increment Expression</em>' containment reference.
         * @see #getIncrementExpression()
         * @generated
         */
        void setIncrementExpression(OOExpression value);

} // OOFor
