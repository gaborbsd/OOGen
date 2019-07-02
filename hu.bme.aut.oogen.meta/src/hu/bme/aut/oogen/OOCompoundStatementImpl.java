/**
 */
package hu.bme.aut.oogen;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OO Compound Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOCompoundStatementImpl#getBodyStatements <em>Body Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOCompoundStatementImpl extends OOStatementImpl implements OOCompoundStatement {
        /**
         * The cached value of the '{@link #getBodyStatements() <em>Body Statements</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBodyStatements()
         * @generated
         * @ordered
         */
        protected EList<OOStatement> bodyStatements;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOCompoundStatementImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_COMPOUND_STATEMENT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EList<OOStatement> getBodyStatements() {
                if (bodyStatements == null) {
                        bodyStatements = new EObjectContainmentEList<OOStatement>(OOStatement.class, this, OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS);
                }
                return bodyStatements;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS:
                                return ((InternalEList<?>)getBodyStatements()).basicRemove(otherEnd, msgs);
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
                        case OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS:
                                return getBodyStatements();
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
                        case OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS:
                                getBodyStatements().clear();
                                getBodyStatements().addAll((Collection<? extends OOStatement>)newValue);
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
                        case OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS:
                                getBodyStatements().clear();
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
                        case OogenPackage.OO_COMPOUND_STATEMENT__BODY_STATEMENTS:
                                return bodyStatements != null && !bodyStatements.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //OOCompoundStatementImpl
