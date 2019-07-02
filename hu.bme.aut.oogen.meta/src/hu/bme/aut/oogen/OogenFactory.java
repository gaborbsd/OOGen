/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.oogen.OogenPackage
 * @generated
 */
public interface OogenFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        OogenFactory eINSTANCE = hu.bme.aut.oogen.OogenFactoryImpl.init();

        /**
         * Returns a new object of class '<em>OO Package</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Package</em>'.
         * @generated
         */
        OOPackage createOOPackage();

        /**
         * Returns a new object of class '<em>OO Class</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Class</em>'.
         * @generated
         */
        OOClass createOOClass();

        /**
         * Returns a new object of class '<em>OO Member</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Member</em>'.
         * @generated
         */
        OOMember createOOMember();

        /**
         * Returns a new object of class '<em>OO Variable</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Variable</em>'.
         * @generated
         */
        OOVariable createOOVariable();

        /**
         * Returns a new object of class '<em>OO Type</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Type</em>'.
         * @generated
         */
        OOType createOOType();

        /**
         * Returns a new object of class '<em>OO Method</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Method</em>'.
         * @generated
         */
        OOMethod createOOMethod();

        /**
         * Returns a new object of class '<em>OO Model</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Model</em>'.
         * @generated
         */
        OOModel createOOModel();

        /**
         * Returns a new object of class '<em>OO Statement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Statement</em>'.
         * @generated
         */
        OOStatement createOOStatement();

        /**
         * Returns a new object of class '<em>OO Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Expression</em>'.
         * @generated
         */
        OOExpression createOOExpression();

        /**
         * Returns a new object of class '<em>OO Return</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Return</em>'.
         * @generated
         */
        OOReturn createOOReturn();

        /**
         * Returns a new object of class '<em>OO Arithmetic Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Arithmetic Expression</em>'.
         * @generated
         */
        OOArithmeticExpression createOOArithmeticExpression();

        /**
         * Returns a new object of class '<em>OO Array Indexing</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Array Indexing</em>'.
         * @generated
         */
        OOArrayIndexing createOOArrayIndexing();

        /**
         * Returns a new object of class '<em>OO Assignment Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Assignment Expression</em>'.
         * @generated
         */
        OOAssignmentExpression createOOAssignmentExpression();

        /**
         * Returns a new object of class '<em>OO Two Operand Arithmetic Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Two Operand Arithmetic Expression</em>'.
         * @generated
         */
        OOTwoOperandArithmeticExpression createOOTwoOperandArithmeticExpression();

        /**
         * Returns a new object of class '<em>OO Addition Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Addition Expression</em>'.
         * @generated
         */
        OOAdditionExpression createOOAdditionExpression();

        /**
         * Returns a new object of class '<em>OO Subtraction Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Subtraction Expression</em>'.
         * @generated
         */
        OOSubtractionExpression createOOSubtractionExpression();

        /**
         * Returns a new object of class '<em>OO Division Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Division Expression</em>'.
         * @generated
         */
        OODivisionExpression createOODivisionExpression();

        /**
         * Returns a new object of class '<em>OO Integer Division Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Integer Division Expression</em>'.
         * @generated
         */
        OOIntegerDivisionExpression createOOIntegerDivisionExpression();

        /**
         * Returns a new object of class '<em>OO Multiplication Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Multiplication Expression</em>'.
         * @generated
         */
        OOMultiplicationExpression createOOMultiplicationExpression();

        /**
         * Returns a new object of class '<em>OO Power Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Power Expression</em>'.
         * @generated
         */
        OOPowerExpression createOOPowerExpression();

        /**
         * Returns a new object of class '<em>OO Root Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Root Expression</em>'.
         * @generated
         */
        OORootExpression createOORootExpression();

        /**
         * Returns a new object of class '<em>OO Bitwise Or Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bitwise Or Expression</em>'.
         * @generated
         */
        OOBitwiseOrExpression createOOBitwiseOrExpression();

        /**
         * Returns a new object of class '<em>OO Bitwise Xor Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bitwise Xor Expression</em>'.
         * @generated
         */
        OOBitwiseXorExpression createOOBitwiseXorExpression();

        /**
         * Returns a new object of class '<em>OO Bitwise And Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bitwise And Expression</em>'.
         * @generated
         */
        OOBitwiseAndExpression createOOBitwiseAndExpression();

        /**
         * Returns a new object of class '<em>OO Logical Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Logical Expression</em>'.
         * @generated
         */
        OOLogicalExpression createOOLogicalExpression();

        /**
         * Returns a new object of class '<em>OO And Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO And Expression</em>'.
         * @generated
         */
        OOAndExpression createOOAndExpression();

        /**
         * Returns a new object of class '<em>OO Or Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Or Expression</em>'.
         * @generated
         */
        OOOrExpression createOOOrExpression();

        /**
         * Returns a new object of class '<em>OO Xor Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Xor Expression</em>'.
         * @generated
         */
        OOXorExpression createOOXorExpression();

        /**
         * Returns a new object of class '<em>OO Not Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Not Expression</em>'.
         * @generated
         */
        OONotExpression createOONotExpression();

        /**
         * Returns a new object of class '<em>OO Two Operand Logical Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Two Operand Logical Expression</em>'.
         * @generated
         */
        OOTwoOperandLogicalExpression createOOTwoOperandLogicalExpression();

        /**
         * Returns a new object of class '<em>OO One Operand Logical Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO One Operand Logical Expression</em>'.
         * @generated
         */
        OOOneOperandLogicalExpression createOOOneOperandLogicalExpression();

        /**
         * Returns a new object of class '<em>OO Double Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Double Literal</em>'.
         * @generated
         */
        OODoubleLiteral createOODoubleLiteral();

        /**
         * Returns a new object of class '<em>OO Float Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Float Literal</em>'.
         * @generated
         */
        OOFloatLiteral createOOFloatLiteral();

        /**
         * Returns a new object of class '<em>OO Integer Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Integer Literal</em>'.
         * @generated
         */
        OOIntegerLiteral createOOIntegerLiteral();

        /**
         * Returns a new object of class '<em>OO Long Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Long Literal</em>'.
         * @generated
         */
        OOLongLiteral createOOLongLiteral();

        /**
         * Returns a new object of class '<em>OO If</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO If</em>'.
         * @generated
         */
        OOIf createOOIf();

        /**
         * Returns a new object of class '<em>OO For</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO For</em>'.
         * @generated
         */
        OOFor createOOFor();

        /**
         * Returns a new object of class '<em>OO Conditional Statement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Conditional Statement</em>'.
         * @generated
         */
        OOConditionalStatement createOOConditionalStatement();

        /**
         * Returns a new object of class '<em>OO While</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO While</em>'.
         * @generated
         */
        OOWhile createOOWhile();

        /**
         * Returns a new object of class '<em>OO Do While</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Do While</em>'.
         * @generated
         */
        OODoWhile createOODoWhile();

        /**
         * Returns a new object of class '<em>OO Empty Statement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Empty Statement</em>'.
         * @generated
         */
        OOEmptyStatement createOOEmptyStatement();

        /**
         * Returns a new object of class '<em>OO For Each</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO For Each</em>'.
         * @generated
         */
        OOForEach createOOForEach();

        /**
         * Returns a new object of class '<em>OO Bit Wise Left Shift</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bit Wise Left Shift</em>'.
         * @generated
         */
        OOBitWiseLeftShift createOOBitWiseLeftShift();

        /**
         * Returns a new object of class '<em>OO Bit Wise Right Shift</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bit Wise Right Shift</em>'.
         * @generated
         */
        OOBitWiseRightShift createOOBitWiseRightShift();

        /**
         * Returns a new object of class '<em>OO Bit Wise Complement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bit Wise Complement</em>'.
         * @generated
         */
        OOBitWiseComplement createOOBitWiseComplement();

        /**
         * Returns a new object of class '<em>OO Language Specific Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Language Specific Expression</em>'.
         * @generated
         */
        OOLanguageSpecificExpression createOOLanguageSpecificExpression();

        /**
         * Returns a new object of class '<em>OO Language Specific Snippet</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Language Specific Snippet</em>'.
         * @generated
         */
        OOLanguageSpecificSnippet createOOLanguageSpecificSnippet();

        /**
         * Returns a new object of class '<em>OO Type Cast</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Type Cast</em>'.
         * @generated
         */
        OOTypeCast createOOTypeCast();

        /**
         * Returns a new object of class '<em>OO Bool Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bool Literal</em>'.
         * @generated
         */
        OOBoolLiteral createOOBoolLiteral();

        /**
         * Returns a new object of class '<em>OO New</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO New</em>'.
         * @generated
         */
        OONew createOONew();

        /**
         * Returns a new object of class '<em>OO Equals Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Equals Expression</em>'.
         * @generated
         */
        OOEqualsExpression createOOEqualsExpression();

        /**
         * Returns a new object of class '<em>OO Comparator Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Comparator Expression</em>'.
         * @generated
         */
        OOComparatorExpression createOOComparatorExpression();

        /**
         * Returns a new object of class '<em>OO Logical Literal</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Logical Literal</em>'.
         * @generated
         */
        OOLogicalLiteral createOOLogicalLiteral();

        /**
         * Returns a new object of class '<em>OO Greater Than Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Greater Than Expression</em>'.
         * @generated
         */
        OOGreaterThanExpression createOOGreaterThanExpression();

        /**
         * Returns a new object of class '<em>OO Less Than Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Less Than Expression</em>'.
         * @generated
         */
        OOLessThanExpression createOOLessThanExpression();

        /**
         * Returns a new object of class '<em>OO Not Equals Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Not Equals Expression</em>'.
         * @generated
         */
        OONotEqualsExpression createOONotEqualsExpression();

        /**
         * Returns a new object of class '<em>OO Greater Equals Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Greater Equals Expression</em>'.
         * @generated
         */
        OOGreaterEqualsExpression createOOGreaterEqualsExpression();

        /**
         * Returns a new object of class '<em>OO Less Equals Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Less Equals Expression</em>'.
         * @generated
         */
        OOLessEqualsExpression createOOLessEqualsExpression();

        /**
         * Returns a new object of class '<em>OO Compound Statement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Compound Statement</em>'.
         * @generated
         */
        OOCompoundStatement createOOCompoundStatement();

        /**
         * Returns a new object of class '<em>OO Switch</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Switch</em>'.
         * @generated
         */
        OOSwitch createOOSwitch();

        /**
         * Returns a new object of class '<em>OO Case</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Case</em>'.
         * @generated
         */
        OOCase createOOCase();

        /**
         * Returns a new object of class '<em>OO Break</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Break</em>'.
         * @generated
         */
        OOBreak createOOBreak();

        /**
         * Returns a new object of class '<em>OO Default</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Default</em>'.
         * @generated
         */
        OODefault createOODefault();

        /**
         * Returns a new object of class '<em>OO Two Operand Assignable Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Two Operand Assignable Expression</em>'.
         * @generated
         */
        OOTwoOperandAssignableExpression createOOTwoOperandAssignableExpression();

        /**
         * Returns a new object of class '<em>OO Modulo Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Modulo Expression</em>'.
         * @generated
         */
        OOModuloExpression createOOModuloExpression();

        /**
         * Returns a new object of class '<em>OO Continue</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Continue</em>'.
         * @generated
         */
        OOContinue createOOContinue();

        /**
         * Returns a new object of class '<em>OO Variable Declaration List</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Variable Declaration List</em>'.
         * @generated
         */
        OOVariableDeclarationList createOOVariableDeclarationList();

        /**
         * Returns a new object of class '<em>OO One Operand Arithmetic Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO One Operand Arithmetic Expression</em>'.
         * @generated
         */
        OOOneOperandArithmeticExpression createOOOneOperandArithmeticExpression();

        /**
         * Returns a new object of class '<em>OO Bracketed Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Bracketed Expression</em>'.
         * @generated
         */
        OOBracketedExpression createOOBracketedExpression();

        /**
         * Returns a new object of class '<em>OO Postfix Increment Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Postfix Increment Expression</em>'.
         * @generated
         */
        OOPostfixIncrementExpression createOOPostfixIncrementExpression();

        /**
         * Returns a new object of class '<em>OO Prefix Increment Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Prefix Increment Expression</em>'.
         * @generated
         */
        OOPrefixIncrementExpression createOOPrefixIncrementExpression();

        /**
         * Returns a new object of class '<em>OO Postfix Decrement Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Postfix Decrement Expression</em>'.
         * @generated
         */
        OOPostfixDecrementExpression createOOPostfixDecrementExpression();

        /**
         * Returns a new object of class '<em>OO Prefix Decrement Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Prefix Decrement Expression</em>'.
         * @generated
         */
        OOPrefixDecrementExpression createOOPrefixDecrementExpression();

        /**
         * Returns a new object of class '<em>OO Plus Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Plus Expression</em>'.
         * @generated
         */
        OOPlusExpression createOOPlusExpression();

        /**
         * Returns a new object of class '<em>OO Minus Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Minus Expression</em>'.
         * @generated
         */
        OOMinusExpression createOOMinusExpression();

        /**
         * Returns a new object of class '<em>OO Ternary Operator</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Ternary Operator</em>'.
         * @generated
         */
        OOTernaryOperator createOOTernaryOperator();

        /**
         * Returns a new object of class '<em>OO Field Reference Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Field Reference Expression</em>'.
         * @generated
         */
        OOFieldReferenceExpression createOOFieldReferenceExpression();

        /**
         * Returns a new object of class '<em>OO Variable Reference Expression</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>OO Variable Reference Expression</em>'.
         * @generated
         */
        OOVariableReferenceExpression createOOVariableReferenceExpression();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        OogenPackage getOogenPackage();

} //OogenFactory
