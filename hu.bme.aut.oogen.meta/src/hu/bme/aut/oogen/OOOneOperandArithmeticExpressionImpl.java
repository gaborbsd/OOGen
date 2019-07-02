/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO One Operand Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOOneOperandArithmeticExpressionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOOneOperandArithmeticExpressionImpl extends OOArithmeticExpressionImpl implements OOOneOperandArithmeticExpression {
        /**
         * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getOperand()
         * @generated
         * @ordered
         */
        protected OOExpression operand;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOOneOperandArithmeticExpressionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getOperand() {
                if (operand != null && operand.eIsProxy()) {
                        InternalEObject oldOperand = (InternalEObject)operand;
                        operand = (OOExpression)eResolveProxy(oldOperand);
                        if (operand != oldOperand) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND, oldOperand, operand));
                        }
                }
                return operand;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetOperand() {
                return operand;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setOperand(OOExpression newOperand) {
                OOExpression oldOperand = operand;
                operand = newOperand;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND, oldOperand, operand));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND:
                                if (resolve) return getOperand();
                                return basicGetOperand();
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
                        case OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND:
                                setOperand((OOExpression)newValue);
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
                        case OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND:
                                setOperand((OOExpression)null);
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
                        case OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION__OPERAND:
                                return operand != null;
                }
                return super.eIsSet(featureID);
        }

} //OOOneOperandArithmeticExpressionImpl
