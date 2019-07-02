/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Ternary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperatorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperatorImpl#getPositiveBranch <em>Positive Branch</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOTernaryOperatorImpl#getNegativeBranch <em>Negative Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOTernaryOperatorImpl extends OOLogicalExpressionImpl implements OOTernaryOperator {
        /**
         * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCondition()
         * @generated
         * @ordered
         */
        protected OOExpression condition;

        /**
         * The cached value of the '{@link #getPositiveBranch() <em>Positive Branch</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPositiveBranch()
         * @generated
         * @ordered
         */
        protected OOExpression positiveBranch;

        /**
         * The cached value of the '{@link #getNegativeBranch() <em>Negative Branch</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getNegativeBranch()
         * @generated
         * @ordered
         */
        protected OOExpression negativeBranch;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOTernaryOperatorImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_TERNARY_OPERATOR;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getCondition() {
                if (condition != null && condition.eIsProxy()) {
                        InternalEObject oldCondition = (InternalEObject)condition;
                        condition = (OOExpression)eResolveProxy(oldCondition);
                        if (condition != oldCondition) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TERNARY_OPERATOR__CONDITION, oldCondition, condition));
                        }
                }
                return condition;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetCondition() {
                return condition;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setCondition(OOExpression newCondition) {
                OOExpression oldCondition = condition;
                condition = newCondition;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TERNARY_OPERATOR__CONDITION, oldCondition, condition));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getPositiveBranch() {
                if (positiveBranch != null && positiveBranch.eIsProxy()) {
                        InternalEObject oldPositiveBranch = (InternalEObject)positiveBranch;
                        positiveBranch = (OOExpression)eResolveProxy(oldPositiveBranch);
                        if (positiveBranch != oldPositiveBranch) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH, oldPositiveBranch, positiveBranch));
                        }
                }
                return positiveBranch;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetPositiveBranch() {
                return positiveBranch;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setPositiveBranch(OOExpression newPositiveBranch) {
                OOExpression oldPositiveBranch = positiveBranch;
                positiveBranch = newPositiveBranch;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH, oldPositiveBranch, positiveBranch));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getNegativeBranch() {
                if (negativeBranch != null && negativeBranch.eIsProxy()) {
                        InternalEObject oldNegativeBranch = (InternalEObject)negativeBranch;
                        negativeBranch = (OOExpression)eResolveProxy(oldNegativeBranch);
                        if (negativeBranch != oldNegativeBranch) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH, oldNegativeBranch, negativeBranch));
                        }
                }
                return negativeBranch;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetNegativeBranch() {
                return negativeBranch;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setNegativeBranch(OOExpression newNegativeBranch) {
                OOExpression oldNegativeBranch = negativeBranch;
                negativeBranch = newNegativeBranch;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH, oldNegativeBranch, negativeBranch));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_TERNARY_OPERATOR__CONDITION:
                                if (resolve) return getCondition();
                                return basicGetCondition();
                        case OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH:
                                if (resolve) return getPositiveBranch();
                                return basicGetPositiveBranch();
                        case OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH:
                                if (resolve) return getNegativeBranch();
                                return basicGetNegativeBranch();
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
                        case OogenPackage.OO_TERNARY_OPERATOR__CONDITION:
                                setCondition((OOExpression)newValue);
                                return;
                        case OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH:
                                setPositiveBranch((OOExpression)newValue);
                                return;
                        case OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH:
                                setNegativeBranch((OOExpression)newValue);
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
                        case OogenPackage.OO_TERNARY_OPERATOR__CONDITION:
                                setCondition((OOExpression)null);
                                return;
                        case OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH:
                                setPositiveBranch((OOExpression)null);
                                return;
                        case OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH:
                                setNegativeBranch((OOExpression)null);
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
                        case OogenPackage.OO_TERNARY_OPERATOR__CONDITION:
                                return condition != null;
                        case OogenPackage.OO_TERNARY_OPERATOR__POSITIVE_BRANCH:
                                return positiveBranch != null;
                        case OogenPackage.OO_TERNARY_OPERATOR__NEGATIVE_BRANCH:
                                return negativeBranch != null;
                }
                return super.eIsSet(featureID);
        }

} //OOTernaryOperatorImpl
