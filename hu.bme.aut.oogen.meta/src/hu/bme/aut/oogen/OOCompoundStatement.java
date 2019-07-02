/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Compound Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOCompoundStatement#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOCompoundStatement()
 * @model
 * @generated
 */
public interface OOCompoundStatement extends OOStatement {
        /**
         * Returns the value of the '<em><b>Body Statements</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.aut.oogen.OOStatement}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Body Statements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Body Statements</em>' containment reference list.
         * @see hu.bme.aut.oogen.OogenPackage#getOOCompoundStatement_BodyStatements()
         * @model containment="true"
         * @generated
         */
        EList<OOStatement> getBodyStatements();

} // OOCompoundStatement
