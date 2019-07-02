/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OO Variable Declaration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.oogen.OOVariableDeclarationList#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.oogen.OogenPackage#getOOVariableDeclarationList()
 * @model
 * @generated
 */
public interface OOVariableDeclarationList extends OOStatement {
        /**
         * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.aut.oogen.OOVariable}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Variable Declarations</em>' containment reference list.
         * @see hu.bme.aut.oogen.OogenPackage#getOOVariableDeclarationList_VariableDeclarations()
         * @model containment="true" required="true"
         * @generated
         */
        EList<OOVariable> getVariableDeclarations();

} // OOVariableDeclarationList
