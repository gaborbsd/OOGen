/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOSwitch#getControllerExpression <em>Controller Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOSwitch#getCaseStatements <em>Case Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOSwitch#getDefaultStatement <em>Default Statement</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOSwitch()
 * @model
 * @generated
 */
public interface OOSwitch extends OOStatement {
        /**
         * Returns the value of the '<em><b>Controller Expression</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Controller Expression</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Controller Expression</em>' reference.
         * @see #setControllerExpression(OOExpression)
         * @see hu.bme.aut.oogen.OogenPackage#getOOSwitch_ControllerExpression()
         * @model required="true"
         * @generated
         */
        OOExpression getControllerExpression();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOSwitch#getControllerExpression <em>Controller Expression</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Controller Expression</em>' reference.
         * @see #getControllerExpression()
         * @generated
         */
        void setControllerExpression(OOExpression value);

        /**
         * Returns the value of the '<em><b>Case Statements</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.aut.oogen.OOCase}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Case Statements</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Case Statements</em>' containment reference list.
         * @see hu.bme.aut.oogen.OogenPackage#getOOSwitch_CaseStatements()
         * @model containment="true"
         * @generated
         */
        EList<OOCase> getCaseStatements();

        /**
         * Returns the value of the '<em><b>Default Statement</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Default Statement</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Default Statement</em>' containment reference.
         * @see #setDefaultStatement(OODefault)
         * @see hu.bme.aut.oogen.OogenPackage#getOOSwitch_DefaultStatement()
         * @model containment="true"
         * @generated
         */
        OODefault getDefaultStatement();

        /**
         * Sets the value of the '{@link hu.bme.aut.oogen.OOSwitch#getDefaultStatement <em>Default Statement</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Default Statement</em>' containment reference.
         * @see #getDefaultStatement()
         * @generated
         */
        void setDefaultStatement(OODefault value);

} // OOSwitch
