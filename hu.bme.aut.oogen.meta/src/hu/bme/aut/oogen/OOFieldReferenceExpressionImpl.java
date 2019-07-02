/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Field Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOFieldReferenceExpressionImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOFieldReferenceExpressionImpl#getFieldOwner <em>Field Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOFieldReferenceExpressionImpl extends OOExpressionImpl implements OOFieldReferenceExpression {
        /**
         * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFieldName()
         * @generated
         * @ordered
         */
        protected static final String FIELD_NAME_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFieldName()
         * @generated
         * @ordered
         */
        protected String fieldName = FIELD_NAME_EDEFAULT;

        /**
         * The cached value of the '{@link #getFieldOwner() <em>Field Owner</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getFieldOwner()
         * @generated
         * @ordered
         */
        protected OOExpression fieldOwner;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOFieldReferenceExpressionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_FIELD_REFERENCE_EXPRESSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getFieldName() {
                return fieldName;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setFieldName(String newFieldName) {
                String oldFieldName = fieldName;
                fieldName = newFieldName;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_NAME, oldFieldName, fieldName));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression getFieldOwner() {
                if (fieldOwner != null && fieldOwner.eIsProxy()) {
                        InternalEObject oldFieldOwner = (InternalEObject)fieldOwner;
                        fieldOwner = (OOExpression)eResolveProxy(oldFieldOwner);
                        if (fieldOwner != oldFieldOwner) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER, oldFieldOwner, fieldOwner));
                        }
                }
                return fieldOwner;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOExpression basicGetFieldOwner() {
                return fieldOwner;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setFieldOwner(OOExpression newFieldOwner) {
                OOExpression oldFieldOwner = fieldOwner;
                fieldOwner = newFieldOwner;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER, oldFieldOwner, fieldOwner));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_NAME:
                                return getFieldName();
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER:
                                if (resolve) return getFieldOwner();
                                return basicGetFieldOwner();
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
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_NAME:
                                setFieldName((String)newValue);
                                return;
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER:
                                setFieldOwner((OOExpression)newValue);
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
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_NAME:
                                setFieldName(FIELD_NAME_EDEFAULT);
                                return;
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER:
                                setFieldOwner((OOExpression)null);
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
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_NAME:
                                return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION__FIELD_OWNER:
                                return fieldOwner != null;
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
                result.append(" (fieldName: ");
                result.append(fieldName);
                result.append(')');
                return result.toString();
        }

} //OOFieldReferenceExpressionImpl
