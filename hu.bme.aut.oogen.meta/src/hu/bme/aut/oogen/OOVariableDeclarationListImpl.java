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
 * An implementation of the model object '<em><b>OO Variable Declaration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOVariableDeclarationListImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OOVariableDeclarationListImpl extends OOStatementImpl implements OOVariableDeclarationList {
        /**
         * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getVariableDeclarations()
         * @generated
         * @ordered
         */
        protected EList<OOVariable> variableDeclarations;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected OOVariableDeclarationListImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return OogenPackage.Literals.OO_VARIABLE_DECLARATION_LIST;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EList<OOVariable> getVariableDeclarations() {
                if (variableDeclarations == null) {
                        variableDeclarations = new EObjectContainmentEList<OOVariable>(OOVariable.class, this, OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS);
                }
                return variableDeclarations;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS:
                                return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
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
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS:
                                return getVariableDeclarations();
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
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS:
                                getVariableDeclarations().clear();
                                getVariableDeclarations().addAll((Collection<? extends OOVariable>)newValue);
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
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS:
                                getVariableDeclarations().clear();
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
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST__VARIABLE_DECLARATIONS:
                                return variableDeclarations != null && !variableDeclarations.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //OOVariableDeclarationListImpl
