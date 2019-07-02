/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOCaseImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOCaseImpl extends OOCompoundStatementImpl implements OOCase {
        /**
         * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExpression()
         * @generated
         * @ordered
         */
        protected OOExpression expression;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOCaseImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_CASE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getExpression() {
                if (expression != null && expression.eIsProxy()) {
                        InternalEObject oldExpression = (InternalEObject)expression;
                        expression = (OOExpression)eResolveProxy(oldExpression);
                        if (expression != oldExpression) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_CASE__EXPRESSION, oldExpression, expression));
                        }
                }
                return expression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetExpression() {
                return expression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setExpression(OOExpression newExpression) {
                OOExpression oldExpression = expression;
                expression = newExpression;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_CASE__EXPRESSION, oldExpression, expression));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_CASE__EXPRESSION:
                                if (resolve) return getExpression();
                                return basicGetExpression();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case OogenPackage.OO_CASE__EXPRESSION:
                                setExpression((OOExpression)newValue);
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
                        case OogenPackage.OO_CASE__EXPRESSION:
                                setExpression((OOExpression)null);
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
                        case OogenPackage.OO_CASE__EXPRESSION:
                                return expression != null;
                }
                return super.eIsSet(featureID);
        }

} //OOCaseImpl
