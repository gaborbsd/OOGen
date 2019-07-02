/**
 */
package hu.bme.aut.oogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Field Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOFieldReferenceExpression#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOFieldReferenceExpression#getFieldOwner <em>Field Owner</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOFieldReferenceExpression()
 * @model
 * @generated
 */
public interface OOFieldReferenceExpression extends OOExpression {
        /**
         * Returns the value of the '<em><b>Field Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Field Name</em>' attribute.
         * @see #setFieldName(String)
         * @see hu.bme.aut.oogen.OogenPackage#getOOFieldReferenceExpression_FieldName()
         * @model required="true"
         * @generated
         */
        String getFieldName();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOFieldReferenceExpression#getFieldName <em>Field Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Field Name</em>' attribute.
         * @see #getFieldName()
         * @generated
         */
        void setFieldName(String value);

        /**
         * Returns the value of the '<em><b>Field Owner</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Field Owner</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Field Owner</em>' reference.
         * @see #setFieldOwner(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOFieldReferenceExpression_FieldOwner()
         * @model required="true"
         * @generated
         */
        OOExpression getFieldOwner();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOFieldReferenceExpression#getFieldOwner <em>Field Owner</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Field Owner</em>' reference.
         * @see #getFieldOwner()
         * @generated
         */
        void setFieldOwner(OOExpression value);

} // OOFieldReferenceExpression
