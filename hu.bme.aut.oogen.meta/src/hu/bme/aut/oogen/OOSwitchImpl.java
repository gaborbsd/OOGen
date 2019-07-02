/**
 */
package hu.bme.aut.oogen;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOSwitchImpl#getControllerExpression <em>Controller Expression</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOSwitchImpl#getCaseStatements <em>Case Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOSwitchImpl#getDefaultStatement <em>Default Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOSwitchImpl extends OOStatementImpl implements OOSwitch {
        /**
         * The cached value of the '{@link #getControllerExpression() <em>Controller Expression</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getControllerExpression()
         * @generated
         * @ordered
         */
        protected OOExpression controllerExpression;

        /**
         * The cached value of the '{@link #getCaseStatements() <em>Case Statements</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCaseStatements()
         * @generated
         * @ordered
         */
        protected EList<OOCase> caseStatements;

        /**
         * The cached value of the '{@link #getDefaultStatement() <em>Default Statement</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDefaultStatement()
         * @generated
         * @ordered
         */
        protected OODefault defaultStatement;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOSwitchImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_SWITCH;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getControllerExpression() {
                if (controllerExpression != null && controllerExpression.eIsProxy()) {
                        InternalEObject oldControllerExpression = (InternalEObject)controllerExpression;
                        controllerExpression = (OOExpression)eResolveProxy(oldControllerExpression);
                        if (controllerExpression != oldControllerExpression) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION, oldControllerExpression, controllerExpression));
                        }
                }
                return controllerExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetControllerExpression() {
                return controllerExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setControllerExpression(OOExpression newControllerExpression) {
                OOExpression oldControllerExpression = controllerExpression;
                controllerExpression = newControllerExpression;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION, oldControllerExpression, controllerExpression));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EList<OOCase> getCaseStatements() {
                if (caseStatements == null) {
                        caseStatements = new EObjectContainmentEList<OOCase>(OOCase.class, this, OogenPackage.OO_SWITCH__CASE_STATEMENTS);
                }
                return caseStatements;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OODefault getDefaultStatement() {
                return defaultStatement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetDefaultStatement(OODefault newDefaultStatement, NotificationChain msgs) {
                OODefault oldDefaultStatement = defaultStatement;
                defaultStatement = newDefaultStatement;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OogenPackage.OO_SWITCH__DEFAULT_STATEMENT, oldDefaultStatement, newDefaultStatement);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setDefaultStatement(OODefault newDefaultStatement) {
                if (newDefaultStatement != defaultStatement) {
                        NotificationChain msgs = null;
                        if (defaultStatement != null)
                                msgs = ((InternalEObject)defaultStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_SWITCH__DEFAULT_STATEMENT, null, msgs);
                        if (newDefaultStatement != null)
                                msgs = ((InternalEObject)newDefaultStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OogenPackage.OO_SWITCH__DEFAULT_STATEMENT, null, msgs);
                        msgs = basicSetDefaultStatement(newDefaultStatement, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_SWITCH__DEFAULT_STATEMENT, newDefaultStatement, newDefaultStatement));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case OogenPackage.OO_SWITCH__CASE_STATEMENTS:
                                return ((InternalEList<?>)getCaseStatements()).basicRemove(otherEnd, msgs);
                        case OogenPackage.OO_SWITCH__DEFAULT_STATEMENT:
                                return basicSetDefaultStatement(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION:
                                if (resolve) return getControllerExpression();
                                return basicGetControllerExpression();
                        case OogenPackage.OO_SWITCH__CASE_STATEMENTS:
                                return getCaseStatements();
                        case OogenPackage.OO_SWITCH__DEFAULT_STATEMENT:
                                return getDefaultStatement();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION:
                                setControllerExpression((OOExpression)newValue);
                                return;
                        case OogenPackage.OO_SWITCH__CASE_STATEMENTS:
                                getCaseStatements().clear();
                                getCaseStatements().addAll((Collection<? extends OOCase>)newValue);
                                return;
                        case OogenPackage.OO_SWITCH__DEFAULT_STATEMENT:
                                setDefaultStatement((OODefault)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION:
                                setControllerExpression((OOExpression)null);
                                return;
                        case OogenPackage.OO_SWITCH__CASE_STATEMENTS:
                                getCaseStatements().clear();
                                return;
                        case OogenPackage.OO_SWITCH__DEFAULT_STATEMENT:
                                setDefaultStatement((OODefault)null);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case OogenPackage.OO_SWITCH__CONTROLLER_EXPRESSION:
                                return controllerExpression != null;
                        case OogenPackage.OO_SWITCH__CASE_STATEMENTS:
                                return caseStatements != null && !caseStatements.isEmpty();
                        case OogenPackage.OO_SWITCH__DEFAULT_STATEMENT:
                                return defaultStatement != null;
                }
                return super.eIsSet(featureID);
        }

} //OOSwitchImpl
