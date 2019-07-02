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
 * An implementation of the model object '<em><b>OO If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOIfImpl#getElseStatements <em>Else Statements</em>}</li>
 *   <li>{@link hu.bme.aut.oogen.OOIfImpl#getElseIf <em>Else If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOIfImpl extends OOConditionalStatementImpl implements OOIf {
        /**
         * The cached value of the '{@link #getElseStatements() <em>Else Statements</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getElseStatements()
         * @generated
         * @ordered
         */
        protected EList<OOStatement> elseStatements;

        /**
         * The cached value of the '{@link #getElseIf() <em>Else If</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getElseIf()
         * @generated
         * @ordered
         */
        protected OOIf elseIf;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOIfImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_IF;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOIf getElseIf() {
                if (elseIf != null && elseIf.eIsProxy()) {
                        InternalEObject oldElseIf = (InternalEObject)elseIf;
                        elseIf = (OOIf)eResolveProxy(oldElseIf);
                        if (elseIf != oldElseIf) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, OogenPackage.OO_IF__ELSE_IF, oldElseIf, elseIf));
                        }
                }
                return elseIf;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOIf basicGetElseIf() {
                return elseIf;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void setElseIf(OOIf newElseIf) {
                OOIf oldElseIf = elseIf;
                elseIf = newElseIf;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, OogenPackage.OO_IF__ELSE_IF, oldElseIf, elseIf));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EList<OOStatement> getElseStatements() {
                if (elseStatements == null) {
                        elseStatements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_IF__ELSE_STATEMENTS);
                }
                return elseStatements;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case OogenPackage.OO_IF__ELSE_STATEMENTS:
                                return ((InternalEList<?>)getElseStatements()).basicRemove(otherEnd, msgs);
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
                        case OogenPackage.OO_IF__ELSE_STATEMENTS:
                                return getElseStatements();
                        case OogenPackage.OO_IF__ELSE_IF:
                                if (resolve) return getElseIf();
                                return basicGetElseIf();
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
                        case OogenPackage.OO_IF__ELSE_STATEMENTS:
                                getElseStatements().clear();
                                getElseStatements().addAll((Collection<? extends OOStatement>)newValue);
                                return;
                        case OogenPackage.OO_IF__ELSE_IF:
                                setElseIf((OOIf)newValue);
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
                        case OogenPackage.OO_IF__ELSE_STATEMENTS:
                                getElseStatements().clear();
                                return;
                        case OogenPackage.OO_IF__ELSE_IF:
                                setElseIf((OOIf)null);
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
                        case OogenPackage.OO_IF__ELSE_STATEMENTS:
                                return elseStatements != null && !elseStatements.isEmpty();
                        case OogenPackage.OO_IF__ELSE_IF:
                                return elseIf != null;
                }
                return super.eIsSet(featureID);
        }

} //OOIfImpl
