/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Two Operand Assignable Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOTwoOperandAssignableExpressionImpl#isAssigned <em>Assigned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOTwoOperandAssignableExpressionImpl extends OOTwoOperandArithmeticExpressionImpl implements OOTwoOperandAssignableExpression {
        /**
         * The default value of the '{@link #isAssigned() <em>Assigned</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isAssigned()
         * @generated
         * @ordered
         */
        protected static final boolean ASSIGNED_EDEFAULT = false;

        /**
         * The cached value of the '{@link #isAssigned() <em>Assigned</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isAssigned()
         * @generated
         * @ordered
         */
        protected boolean assigned = ASSIGNED_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOTwoOperandAssignableExpressionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean isAssigned() {
                return assigned;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setAssigned(boolean newAssigned) {
                boolean oldAssigned = assigned;
                assigned = newAssigned;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION__ASSIGNED, oldAssigned, assigned));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION__ASSIGNED:
                                return isAssigned();
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
                        case OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION__ASSIGNED:
                                setAssigned((Boolean)newValue);
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
                        case OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION__ASSIGNED:
                                setAssigned(ASSIGNED_EDEFAULT);
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
                        case OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION__ASSIGNED:
                                return assigned != ASSIGNED_EDEFAULT;
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuilder result = new StringBuilder(super.toString());
                result.append(" (assigned: ");
                result.append(assigned);
                result.append(')');
                return result.toString();
        }

} //OOTwoOperandAssignableExpressionImpl
