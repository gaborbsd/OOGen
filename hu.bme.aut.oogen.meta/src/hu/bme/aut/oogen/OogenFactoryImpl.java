/**
 */
package hu.bme.aut.oogen;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OogenFactoryImpl extends EFactoryImpl implements OogenFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static OogenFactory init() {
                try {
                        OogenFactory theOogenFactory = (OogenFactory)EPackage.Registry.INSTANCE.getEFactory(OogenPackage.eNS_URI);
                        if (theOogenFactory != null) {
                                return theOogenFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new OogenFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OogenFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case OogenPackage.OO_PACKAGE: return createOOPackage();
                        case OogenPackage.OO_CLASS: return createOOClass();
                        case OogenPackage.OO_MEMBER: return createOOMember();
                        case OogenPackage.OO_VARIABLE: return createOOVariable();
                        case OogenPackage.OO_TYPE: return createOOType();
                        case OogenPackage.OO_METHOD: return createOOMethod();
                        case OogenPackage.OO_MODEL: return createOOModel();
                        case OogenPackage.OO_STATEMENT: return createOOStatement();
                        case OogenPackage.OO_EXPRESSION: return createOOExpression();
                        case OogenPackage.OO_RETURN: return createOOReturn();
                        case OogenPackage.OO_ARITHMETIC_EXPRESSION: return createOOArithmeticExpression();
                        case OogenPackage.OO_ARRAY_INDEXING: return createOOArrayIndexing();
                        case OogenPackage.OO_ASSIGNMENT_EXPRESSION: return createOOAssignmentExpression();
                        case OogenPackage.OO_TWO_OPERAND_ARITHMETIC_EXPRESSION: return createOOTwoOperandArithmeticExpression();
                        case OogenPackage.OO_ADDITION_EXPRESSION: return createOOAdditionExpression();
                        case OogenPackage.OO_SUBTRACTION_EXPRESSION: return createOOSubtractionExpression();
                        case OogenPackage.OO_DIVISION_EXPRESSION: return createOODivisionExpression();
                        case OogenPackage.OO_INTEGER_DIVISION_EXPRESSION: return createOOIntegerDivisionExpression();
                        case OogenPackage.OO_MULTIPLICATION_EXPRESSION: return createOOMultiplicationExpression();
                        case OogenPackage.OO_POWER_EXPRESSION: return createOOPowerExpression();
                        case OogenPackage.OO_ROOT_EXPRESSION: return createOORootExpression();
                        case OogenPackage.OO_BITWISE_OR_EXPRESSION: return createOOBitwiseOrExpression();
                        case OogenPackage.OO_BITWISE_XOR_EXPRESSION: return createOOBitwiseXorExpression();
                        case OogenPackage.OO_BITWISE_AND_EXPRESSION: return createOOBitwiseAndExpression();
                        case OogenPackage.OO_LOGICAL_EXPRESSION: return createOOLogicalExpression();
                        case OogenPackage.OO_AND_EXPRESSION: return createOOAndExpression();
                        case OogenPackage.OO_OR_EXPRESSION: return createOOOrExpression();
                        case OogenPackage.OO_XOR_EXPRESSION: return createOOXorExpression();
                        case OogenPackage.OO_NOT_EXPRESSION: return createOONotExpression();
                        case OogenPackage.OO_TWO_OPERAND_LOGICAL_EXPRESSION: return createOOTwoOperandLogicalExpression();
                        case OogenPackage.OO_ONE_OPERAND_LOGICAL_EXPRESSION: return createOOOneOperandLogicalExpression();
                        case OogenPackage.OO_DOUBLE_LITERAL: return createOODoubleLiteral();
                        case OogenPackage.OO_FLOAT_LITERAL: return createOOFloatLiteral();
                        case OogenPackage.OO_INTEGER_LITERAL: return createOOIntegerLiteral();
                        case OogenPackage.OO_LONG_LITERAL: return createOOLongLiteral();
                        case OogenPackage.OO_IF: return createOOIf();
                        case OogenPackage.OO_FOR: return createOOFor();
                        case OogenPackage.OO_CONDITIONAL_STATEMENT: return createOOConditionalStatement();
                        case OogenPackage.OO_WHILE: return createOOWhile();
                        case OogenPackage.OO_DO_WHILE: return createOODoWhile();
                        case OogenPackage.OO_EMPTY_STATEMENT: return createOOEmptyStatement();
                        case OogenPackage.OO_FOR_EACH: return createOOForEach();
                        case OogenPackage.OO_BIT_WISE_LEFT_SHIFT: return createOOBitWiseLeftShift();
                        case OogenPackage.OO_BIT_WISE_RIGHT_SHIFT: return createOOBitWiseRightShift();
                        case OogenPackage.OO_BIT_WISE_COMPLEMENT: return createOOBitWiseComplement();
                        case OogenPackage.OO_LANGUAGE_SPECIFIC_EXPRESSION: return createOOLanguageSpecificExpression();
                        case OogenPackage.OO_LANGUAGE_SPECIFIC_SNIPPET: return createOOLanguageSpecificSnippet();
                        case OogenPackage.OO_TYPE_CAST: return createOOTypeCast();
                        case OogenPackage.OO_BOOL_LITERAL: return createOOBoolLiteral();
                        case OogenPackage.OO_NEW: return createOONew();
                        case OogenPackage.OO_EQUALS_EXPRESSION: return createOOEqualsExpression();
                        case OogenPackage.OO_COMPARATOR_EXPRESSION: return createOOComparatorExpression();
                        case OogenPackage.OO_LOGICAL_LITERAL: return createOOLogicalLiteral();
                        case OogenPackage.OO_GREATER_THAN_EXPRESSION: return createOOGreaterThanExpression();
                        case OogenPackage.OO_LESS_THAN_EXPRESSION: return createOOLessThanExpression();
                        case OogenPackage.OO_NOT_EQUALS_EXPRESSION: return createOONotEqualsExpression();
                        case OogenPackage.OO_GREATER_EQUALS_EXPRESSION: return createOOGreaterEqualsExpression();
                        case OogenPackage.OO_LESS_EQUALS_EXPRESSION: return createOOLessEqualsExpression();
                        case OogenPackage.OO_COMPOUND_STATEMENT: return createOOCompoundStatement();
                        case OogenPackage.OO_SWITCH: return createOOSwitch();
                        case OogenPackage.OO_CASE: return createOOCase();
                        case OogenPackage.OO_BREAK: return createOOBreak();
                        case OogenPackage.OO_DEFAULT: return createOODefault();
                        case OogenPackage.OO_TWO_OPERAND_ASSIGNABLE_EXPRESSION: return createOOTwoOperandAssignableExpression();
                        case OogenPackage.OO_MODULO_EXPRESSION: return createOOModuloExpression();
                        case OogenPackage.OO_CONTINUE: return createOOContinue();
                        case OogenPackage.OO_VARIABLE_DECLARATION_LIST: return createOOVariableDeclarationList();
                        case OogenPackage.OO_ONE_OPERAND_ARITHMETIC_EXPRESSION: return createOOOneOperandArithmeticExpression();
                        case OogenPackage.OO_BRACKETED_EXPRESSION: return createOOBracketedExpression();
                        case OogenPackage.OO_POSTFIX_INCREMENT_EXPRESSION: return createOOPostfixIncrementExpression();
                        case OogenPackage.OO_PREFIX_INCREMENT_EXPRESSION: return createOOPrefixIncrementExpression();
                        case OogenPackage.OO_POSTFIX_DECREMENT_EXPRESSION: return createOOPostfixDecrementExpression();
                        case OogenPackage.OO_PREFIX_DECREMENT_EXPRESSION: return createOOPrefixDecrementExpression();
                        case OogenPackage.OO_PLUS_EXPRESSION: return createOOPlusExpression();
                        case OogenPackage.OO_MINUS_EXPRESSION: return createOOMinusExpression();
                        case OogenPackage.OO_TERNARY_OPERATOR: return createOOTernaryOperator();
                        case OogenPackage.OO_FIELD_REFERENCE_EXPRESSION: return createOOFieldReferenceExpression();
                        case OogenPackage.OO_VARIABLE_REFERENCE_EXPRESSION: return createOOVariableReferenceExpression();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case OogenPackage.OO_BASE_TYPE:
                                return createOOBaseTypeFromString(eDataType, initialValue);
                        case OogenPackage.OO_VISIBILITY:
                                return createOOVisibilityFromString(eDataType, initialValue);
                        case OogenPackage.OO_COLLECTION_TYPE:
                                return createOOCollectionTypeFromString(eDataType, initialValue);
                        case OogenPackage.OO_LANGUAGE:
                                return createOOLanguageFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case OogenPackage.OO_BASE_TYPE:
                                return convertOOBaseTypeToString(eDataType, instanceValue);
                        case OogenPackage.OO_VISIBILITY:
                                return convertOOVisibilityToString(eDataType, instanceValue);
                        case OogenPackage.OO_COLLECTION_TYPE:
                                return convertOOCollectionTypeToString(eDataType, instanceValue);
                        case OogenPackage.OO_LANGUAGE:
                                return convertOOLanguageToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPackage createOOPackage() {
                OOPackageImpl ooPackage = new OOPackageImpl();
                return ooPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOClass createOOClass() {
                OOClassImpl ooClass = new OOClassImpl();
                return ooClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOMember createOOMember() {
                OOMemberImpl ooMember = new OOMemberImpl();
                return ooMember;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOVariable createOOVariable() {
                OOVariableImpl ooVariable = new OOVariableImpl();
                return ooVariable;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOType createOOType() {
                OOTypeImpl ooType = new OOTypeImpl();
                return ooType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOMethod createOOMethod() {
                OOMethodImpl ooMethod = new OOMethodImpl();
                return ooMethod;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOModel createOOModel() {
                OOModelImpl ooModel = new OOModelImpl();
                return ooModel;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOStatement createOOStatement() {
                OOStatementImpl ooStatement = new OOStatementImpl();
                return ooStatement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOExpression createOOExpression() {
                OOExpressionImpl ooExpression = new OOExpressionImpl();
                return ooExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOReturn createOOReturn() {
                OOReturnImpl ooReturn = new OOReturnImpl();
                return ooReturn;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOArithmeticExpression createOOArithmeticExpression() {
                OOArithmeticExpressionImpl ooArithmeticExpression = new OOArithmeticExpressionImpl();
                return ooArithmeticExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOArrayIndexing createOOArrayIndexing() {
                OOArrayIndexingImpl ooArrayIndexing = new OOArrayIndexingImpl();
                return ooArrayIndexing;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOAssignmentExpression createOOAssignmentExpression() {
                OOAssignmentExpressionImpl ooAssignmentExpression = new OOAssignmentExpressionImpl();
                return ooAssignmentExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOTwoOperandArithmeticExpression createOOTwoOperandArithmeticExpression() {
                OOTwoOperandArithmeticExpressionImpl ooTwoOperandArithmeticExpression = new OOTwoOperandArithmeticExpressionImpl();
                return ooTwoOperandArithmeticExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOAdditionExpression createOOAdditionExpression() {
                OOAdditionExpressionImpl ooAdditionExpression = new OOAdditionExpressionImpl();
                return ooAdditionExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOSubtractionExpression createOOSubtractionExpression() {
                OOSubtractionExpressionImpl ooSubtractionExpression = new OOSubtractionExpressionImpl();
                return ooSubtractionExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OODivisionExpression createOODivisionExpression() {
                OODivisionExpressionImpl ooDivisionExpression = new OODivisionExpressionImpl();
                return ooDivisionExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOIntegerDivisionExpression createOOIntegerDivisionExpression() {
                OOIntegerDivisionExpressionImpl ooIntegerDivisionExpression = new OOIntegerDivisionExpressionImpl();
                return ooIntegerDivisionExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOMultiplicationExpression createOOMultiplicationExpression() {
                OOMultiplicationExpressionImpl ooMultiplicationExpression = new OOMultiplicationExpressionImpl();
                return ooMultiplicationExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPowerExpression createOOPowerExpression() {
                OOPowerExpressionImpl ooPowerExpression = new OOPowerExpressionImpl();
                return ooPowerExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OORootExpression createOORootExpression() {
                OORootExpressionImpl ooRootExpression = new OORootExpressionImpl();
                return ooRootExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitwiseOrExpression createOOBitwiseOrExpression() {
                OOBitwiseOrExpressionImpl ooBitwiseOrExpression = new OOBitwiseOrExpressionImpl();
                return ooBitwiseOrExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitwiseXorExpression createOOBitwiseXorExpression() {
                OOBitwiseXorExpressionImpl ooBitwiseXorExpression = new OOBitwiseXorExpressionImpl();
                return ooBitwiseXorExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitwiseAndExpression createOOBitwiseAndExpression() {
                OOBitwiseAndExpressionImpl ooBitwiseAndExpression = new OOBitwiseAndExpressionImpl();
                return ooBitwiseAndExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLogicalExpression createOOLogicalExpression() {
                OOLogicalExpressionImpl ooLogicalExpression = new OOLogicalExpressionImpl();
                return ooLogicalExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOAndExpression createOOAndExpression() {
                OOAndExpressionImpl ooAndExpression = new OOAndExpressionImpl();
                return ooAndExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOOrExpression createOOOrExpression() {
                OOOrExpressionImpl ooOrExpression = new OOOrExpressionImpl();
                return ooOrExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOXorExpression createOOXorExpression() {
                OOXorExpressionImpl ooXorExpression = new OOXorExpressionImpl();
                return ooXorExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OONotExpression createOONotExpression() {
                OONotExpressionImpl ooNotExpression = new OONotExpressionImpl();
                return ooNotExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOTwoOperandLogicalExpression createOOTwoOperandLogicalExpression() {
                OOTwoOperandLogicalExpressionImpl ooTwoOperandLogicalExpression = new OOTwoOperandLogicalExpressionImpl();
                return ooTwoOperandLogicalExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOOneOperandLogicalExpression createOOOneOperandLogicalExpression() {
                OOOneOperandLogicalExpressionImpl ooOneOperandLogicalExpression = new OOOneOperandLogicalExpressionImpl();
                return ooOneOperandLogicalExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OODoubleLiteral createOODoubleLiteral() {
                OODoubleLiteralImpl ooDoubleLiteral = new OODoubleLiteralImpl();
                return ooDoubleLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOFloatLiteral createOOFloatLiteral() {
                OOFloatLiteralImpl ooFloatLiteral = new OOFloatLiteralImpl();
                return ooFloatLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOIntegerLiteral createOOIntegerLiteral() {
                OOIntegerLiteralImpl ooIntegerLiteral = new OOIntegerLiteralImpl();
                return ooIntegerLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLongLiteral createOOLongLiteral() {
                OOLongLiteralImpl ooLongLiteral = new OOLongLiteralImpl();
                return ooLongLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOIf createOOIf() {
                OOIfImpl ooIf = new OOIfImpl();
                return ooIf;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOFor createOOFor() {
                OOForImpl ooFor = new OOForImpl();
                return ooFor;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOConditionalStatement createOOConditionalStatement() {
                OOConditionalStatementImpl ooConditionalStatement = new OOConditionalStatementImpl();
                return ooConditionalStatement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOWhile createOOWhile() {
                OOWhileImpl ooWhile = new OOWhileImpl();
                return ooWhile;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OODoWhile createOODoWhile() {
                OODoWhileImpl ooDoWhile = new OODoWhileImpl();
                return ooDoWhile;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOEmptyStatement createOOEmptyStatement() {
                OOEmptyStatementImpl ooEmptyStatement = new OOEmptyStatementImpl();
                return ooEmptyStatement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOForEach createOOForEach() {
                OOForEachImpl ooForEach = new OOForEachImpl();
                return ooForEach;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitWiseLeftShift createOOBitWiseLeftShift() {
                OOBitWiseLeftShiftImpl ooBitWiseLeftShift = new OOBitWiseLeftShiftImpl();
                return ooBitWiseLeftShift;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitWiseRightShift createOOBitWiseRightShift() {
                OOBitWiseRightShiftImpl ooBitWiseRightShift = new OOBitWiseRightShiftImpl();
                return ooBitWiseRightShift;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBitWiseComplement createOOBitWiseComplement() {
                OOBitWiseComplementImpl ooBitWiseComplement = new OOBitWiseComplementImpl();
                return ooBitWiseComplement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLanguageSpecificExpression createOOLanguageSpecificExpression() {
                OOLanguageSpecificExpressionImpl ooLanguageSpecificExpression = new OOLanguageSpecificExpressionImpl();
                return ooLanguageSpecificExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLanguageSpecificSnippet createOOLanguageSpecificSnippet() {
                OOLanguageSpecificSnippetImpl ooLanguageSpecificSnippet = new OOLanguageSpecificSnippetImpl();
                return ooLanguageSpecificSnippet;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOTypeCast createOOTypeCast() {
                OOTypeCastImpl ooTypeCast = new OOTypeCastImpl();
                return ooTypeCast;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBoolLiteral createOOBoolLiteral() {
                OOBoolLiteralImpl ooBoolLiteral = new OOBoolLiteralImpl();
                return ooBoolLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OONew createOONew() {
                OONewImpl ooNew = new OONewImpl();
                return ooNew;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOEqualsExpression createOOEqualsExpression() {
                OOEqualsExpressionImpl ooEqualsExpression = new OOEqualsExpressionImpl();
                return ooEqualsExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOComparatorExpression createOOComparatorExpression() {
                OOComparatorExpressionImpl ooComparatorExpression = new OOComparatorExpressionImpl();
                return ooComparatorExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLogicalLiteral createOOLogicalLiteral() {
                OOLogicalLiteralImpl ooLogicalLiteral = new OOLogicalLiteralImpl();
                return ooLogicalLiteral;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOGreaterThanExpression createOOGreaterThanExpression() {
                OOGreaterThanExpressionImpl ooGreaterThanExpression = new OOGreaterThanExpressionImpl();
                return ooGreaterThanExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLessThanExpression createOOLessThanExpression() {
                OOLessThanExpressionImpl ooLessThanExpression = new OOLessThanExpressionImpl();
                return ooLessThanExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OONotEqualsExpression createOONotEqualsExpression() {
                OONotEqualsExpressionImpl ooNotEqualsExpression = new OONotEqualsExpressionImpl();
                return ooNotEqualsExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOGreaterEqualsExpression createOOGreaterEqualsExpression() {
                OOGreaterEqualsExpressionImpl ooGreaterEqualsExpression = new OOGreaterEqualsExpressionImpl();
                return ooGreaterEqualsExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOLessEqualsExpression createOOLessEqualsExpression() {
                OOLessEqualsExpressionImpl ooLessEqualsExpression = new OOLessEqualsExpressionImpl();
                return ooLessEqualsExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOCompoundStatement createOOCompoundStatement() {
                OOCompoundStatementImpl ooCompoundStatement = new OOCompoundStatementImpl();
                return ooCompoundStatement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOSwitch createOOSwitch() {
                OOSwitchImpl ooSwitch = new OOSwitchImpl();
                return ooSwitch;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOCase createOOCase() {
                OOCaseImpl ooCase = new OOCaseImpl();
                return ooCase;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBreak createOOBreak() {
                OOBreakImpl ooBreak = new OOBreakImpl();
                return ooBreak;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OODefault createOODefault() {
                OODefaultImpl ooDefault = new OODefaultImpl();
                return ooDefault;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOTwoOperandAssignableExpression createOOTwoOperandAssignableExpression() {
                OOTwoOperandAssignableExpressionImpl ooTwoOperandAssignableExpression = new OOTwoOperandAssignableExpressionImpl();
                return ooTwoOperandAssignableExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOModuloExpression createOOModuloExpression() {
                OOModuloExpressionImpl ooModuloExpression = new OOModuloExpressionImpl();
                return ooModuloExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOContinue createOOContinue() {
                OOContinueImpl ooContinue = new OOContinueImpl();
                return ooContinue;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOVariableDeclarationList createOOVariableDeclarationList() {
                OOVariableDeclarationListImpl ooVariableDeclarationList = new OOVariableDeclarationListImpl();
                return ooVariableDeclarationList;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOOneOperandArithmeticExpression createOOOneOperandArithmeticExpression() {
                OOOneOperandArithmeticExpressionImpl ooOneOperandArithmeticExpression = new OOOneOperandArithmeticExpressionImpl();
                return ooOneOperandArithmeticExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOBracketedExpression createOOBracketedExpression() {
                OOBracketedExpressionImpl ooBracketedExpression = new OOBracketedExpressionImpl();
                return ooBracketedExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPostfixIncrementExpression createOOPostfixIncrementExpression() {
                OOPostfixIncrementExpressionImpl ooPostfixIncrementExpression = new OOPostfixIncrementExpressionImpl();
                return ooPostfixIncrementExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPrefixIncrementExpression createOOPrefixIncrementExpression() {
                OOPrefixIncrementExpressionImpl ooPrefixIncrementExpression = new OOPrefixIncrementExpressionImpl();
                return ooPrefixIncrementExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPostfixDecrementExpression createOOPostfixDecrementExpression() {
                OOPostfixDecrementExpressionImpl ooPostfixDecrementExpression = new OOPostfixDecrementExpressionImpl();
                return ooPostfixDecrementExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPrefixDecrementExpression createOOPrefixDecrementExpression() {
                OOPrefixDecrementExpressionImpl ooPrefixDecrementExpression = new OOPrefixDecrementExpressionImpl();
                return ooPrefixDecrementExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOPlusExpression createOOPlusExpression() {
                OOPlusExpressionImpl ooPlusExpression = new OOPlusExpressionImpl();
                return ooPlusExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOMinusExpression createOOMinusExpression() {
                OOMinusExpressionImpl ooMinusExpression = new OOMinusExpressionImpl();
                return ooMinusExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOTernaryOperator createOOTernaryOperator() {
                OOTernaryOperatorImpl ooTernaryOperator = new OOTernaryOperatorImpl();
                return ooTernaryOperator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOFieldReferenceExpression createOOFieldReferenceExpression() {
                OOFieldReferenceExpressionImpl ooFieldReferenceExpression = new OOFieldReferenceExpressionImpl();
                return ooFieldReferenceExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OOVariableReferenceExpression createOOVariableReferenceExpression() {
                OOVariableReferenceExpressionImpl ooVariableReferenceExpression = new OOVariableReferenceExpressionImpl();
                return ooVariableReferenceExpression;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOBaseType createOOBaseTypeFromString(EDataType eDataType, String initialValue) {
                OOBaseType result = OOBaseType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertOOBaseTypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOVisibility createOOVisibilityFromString(EDataType eDataType, String initialValue) {
                OOVisibility result = OOVisibility.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertOOVisibilityToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOCollectionType createOOCollectionTypeFromString(EDataType eDataType, String initialValue) {
                OOCollectionType result = OOCollectionType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertOOCollectionTypeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public OOLanguage createOOLanguageFromString(EDataType eDataType, String initialValue) {
                OOLanguage result = OOLanguage.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertOOLanguageToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public OogenPackage getOogenPackage() {
                return (OogenPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static OogenPackage getPackage() {
                return OogenPackage.eINSTANCE;
        }

} //OogenFactoryImpl
