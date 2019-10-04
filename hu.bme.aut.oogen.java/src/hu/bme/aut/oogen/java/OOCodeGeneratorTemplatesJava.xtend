package hu.bme.aut.oogen.java

import hu.bme.aut.oogen.OOAdditionExpression
import hu.bme.aut.oogen.OOAndExpression
import hu.bme.aut.oogen.OOAssignmentExpression
import hu.bme.aut.oogen.OOBaseType
import hu.bme.aut.oogen.OOBitWiseComplement
import hu.bme.aut.oogen.OOBitWiseLeftShift
import hu.bme.aut.oogen.OOBitWiseRightShift
import hu.bme.aut.oogen.OOBitwiseAndExpression
import hu.bme.aut.oogen.OOBitwiseOrExpression
import hu.bme.aut.oogen.OOBitwiseXorExpression
import hu.bme.aut.oogen.OOBoolLiteral
import hu.bme.aut.oogen.OOBracketedExpression
import hu.bme.aut.oogen.OOBreak
import hu.bme.aut.oogen.OOCase
import hu.bme.aut.oogen.OOClass
import hu.bme.aut.oogen.OOCollectionType
import hu.bme.aut.oogen.OOComment
import hu.bme.aut.oogen.OOCompoundStatement
import hu.bme.aut.oogen.OOConstructor
import hu.bme.aut.oogen.OOContinue
import hu.bme.aut.oogen.OODefault
import hu.bme.aut.oogen.OODivisionExpression
import hu.bme.aut.oogen.OODoWhile
import hu.bme.aut.oogen.OODoubleLiteral
import hu.bme.aut.oogen.OOEmptyStatement
import hu.bme.aut.oogen.OOEqualsExpression
import hu.bme.aut.oogen.OOExpression
import hu.bme.aut.oogen.OOFieldReferenceExpression
import hu.bme.aut.oogen.OOFloatLiteral
import hu.bme.aut.oogen.OOFor
import hu.bme.aut.oogen.OOForEach
import hu.bme.aut.oogen.OOFunctionCallExpression
import hu.bme.aut.oogen.OOGreaterEqualsExpression
import hu.bme.aut.oogen.OOGreaterThanExpression
import hu.bme.aut.oogen.OOIf
import hu.bme.aut.oogen.OOIndexing
import hu.bme.aut.oogen.OOInitializerList
import hu.bme.aut.oogen.OOIntegerDivisionExpression
import hu.bme.aut.oogen.OOIntegerLiteral
import hu.bme.aut.oogen.OOLanguage
import hu.bme.aut.oogen.OOLanguageSpecificExpression
import hu.bme.aut.oogen.OOLessEqualsExpression
import hu.bme.aut.oogen.OOLessThanExpression
import hu.bme.aut.oogen.OOLogicalLiteral
import hu.bme.aut.oogen.OOLongLiteral
import hu.bme.aut.oogen.OOMember
import hu.bme.aut.oogen.OOMethod
import hu.bme.aut.oogen.OOMinusExpression
import hu.bme.aut.oogen.OOModuloExpression
import hu.bme.aut.oogen.OOMultiplicationExpression
import hu.bme.aut.oogen.OONewArray
import hu.bme.aut.oogen.OONewClass
import hu.bme.aut.oogen.OONotEqualsExpression
import hu.bme.aut.oogen.OONotExpression
import hu.bme.aut.oogen.OONullLiteral
import hu.bme.aut.oogen.OOOrExpression
import hu.bme.aut.oogen.OOPlusExpression
import hu.bme.aut.oogen.OOPostfixDecrementExpression
import hu.bme.aut.oogen.OOPostfixIncrementExpression
import hu.bme.aut.oogen.OOPowerExpression
import hu.bme.aut.oogen.OOPrefixDecrementExpression
import hu.bme.aut.oogen.OOPrefixIncrementExpression
import hu.bme.aut.oogen.OOReturn
import hu.bme.aut.oogen.OORootExpression
import hu.bme.aut.oogen.OOStatement
import hu.bme.aut.oogen.OOStringLiteral
import hu.bme.aut.oogen.OOSubtractionExpression
import hu.bme.aut.oogen.OOSwitch
import hu.bme.aut.oogen.OOTernaryOperator
import hu.bme.aut.oogen.OOThisLiteral
import hu.bme.aut.oogen.OOType
import hu.bme.aut.oogen.OOTypeCast
import hu.bme.aut.oogen.OOVariable
import hu.bme.aut.oogen.OOVariableDeclarationList
import hu.bme.aut.oogen.OOVariableReferenceExpression
import hu.bme.aut.oogen.OOVisibility
import hu.bme.aut.oogen.OOWhile
import hu.bme.aut.oogen.general.OOCodeGeneratorTemplates
import java.util.List
import hu.bme.aut.oogen.OOEnumeration

class OOCodeGeneratorTemplatesJava implements OOCodeGeneratorTemplates {

	static OOCodeGeneratorTemplatesJava instance;

	def static OOCodeGeneratorTemplatesJava getInstance() {
		if (instance === null)
			instance = new OOCodeGeneratorTemplatesJava();
		return instance;
	}

	override String generate(OOEnumeration e) '''
package «e.package.name»;

«FOR c : e.beforeComments»
«c.generateComment»
«ENDFOR»	
public enum «e.name» {
	«FOR option : e.options SEPARATOR ', '»
		«option»
	«ENDFOR»
}
«FOR c : e.afterComments»
«c.generateComment»
«ENDFOR»	
	'''

	override String generate(OOClass cl) '''
package «cl.package.name»;

«FOR c : cl.beforeComments»
«c.generateComment»
«ENDFOR»	
public class «cl.name» {
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
	
	«FOR c : cl.constructors»
	«c.generate»
	«ENDFOR»
	
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
}
«FOR c : cl.afterComments»
«c.generateComment»
«ENDFOR»	
	'''

	def String generate(OOMember m) '''
«m.visibility.generate»«m.generateStatic»«m.generateTransient» «m.type.generate(false)» «m.name»«m.generateInit»;
'''

	def String generateTransient(OOMember m) {
		if(m.transient) " transient" else ""
	}

	def String generateStatic(OOMember m) {
		if(m.static) " static" else ""
	}

	def String generate(OOVisibility v) {
		switch v {
			case OOVisibility.PRIVATE:
				"private"
			case OOVisibility.PACKAGE:
				""
			case OOVisibility.PROTECTED:
				"protected"
			case OOVisibility.PUBLIC:
				"public"
		}
	}

	def String generateInit(OOMember m) '''
	«val exp = m.initializerExpression»
	«IF exp !== null»
	«IF	!(exp instanceof OOLanguageSpecificExpression) ||
		(exp instanceof OOLanguageSpecificExpression &&
			!((exp as OOLanguageSpecificExpression).snippets.filter[s|s.lang == OOLanguage.JAVA].empty))» = «m.initializerExpression.generateExpression»«ENDIF»«ENDIF»'''

	def String generate(OOType t, boolean shouldGenerateSizeExpressions) {
		var arrayNotation = ""
		for (var i = 0; i < t.arrayDimensions; i++) {
			arrayNotation += "["

			if (shouldGenerateSizeExpressions) {
				val sizeExpression = t.arraySizeExpressions.get(i);
				if (!(sizeExpression instanceof OONullLiteral)) {
					arrayNotation += '''«sizeExpression.generateExpression»'''
				}
			}

			arrayNotation += "]";
		}

		val baseType = if(t.collectionType == OOCollectionType.NONE) t.baseTypeNormal else t.baseTypeObject
		val sb = new StringBuffer

		switch (t.collectionType) {
			case LIST: {
				sb.append("List<")
				sb.append(baseType)
				sb.append(arrayNotation)
				sb.append(">")
			}
			case SET: {
				sb.append("Set<")
				sb.append(baseType)
				sb.append(arrayNotation)
				sb.append(">")
			}
			case NONE: {
				sb.append(baseType)
				sb.append(arrayNotation)
			}
		}
		return sb.toString
	}

	def String baseTypeNormal(OOType t) {
		if (t.arrayDimensions == 0 && t.numberOfIndirections > 0) {
			switch t.baseType {
			case OOBaseType.BOOLEAN:
				"Boolean"
			case OOBaseType.BYTE:
				"Byte"
			case OOBaseType.INT:
				"Integer"
			case OOBaseType.LONG:
				"Long"
			case OOBaseType.DOUBLE:
				"Double"
			case OOBaseType.STRING:
				"String"
			case OOBaseType.OBJECT:
				if(t.classType !== null) t.classType.name else if (t.enumType !== null) t.enumType.name else "Object"
			}
		} else {
			switch t.baseType {
			case OOBaseType.BOOLEAN:
				"boolean"
			case OOBaseType.BYTE:
				"byte"
			case OOBaseType.INT:
				"int"
			case OOBaseType.LONG:
				"long"
			case OOBaseType.DOUBLE:
				"double"
			case OOBaseType.STRING:
				"String"
			case OOBaseType.OBJECT:
				if(t.classType !== null) t.classType.name else if (t.enumType !== null) t.enumType.name else "Object"
			}
		}	
	}

	def String baseTypeObject(OOType t) {
		switch t.baseType {
			case OOBaseType.BYTE:
				"Byte"
			case OOBaseType.INT:
				"Integer"
			case OOBaseType.LONG:
				"Long"
			case OOBaseType.DOUBLE:
				"Double"
			case OOBaseType.STRING:
				"String"
			case OOBaseType.OBJECT:
				if(t.classType !== null) t.classType.name else "Object"
			case BOOLEAN:
				"Boolean"
		}
	}

	def String generate(OOConstructor c) '''«c.visibility.generate» «c.className»(«c.parameters.generateMethodParams») {
	«FOR s : c.statements»
		«s.generateStatement»
	«ENDFOR»		
}'''

	def String generate(OOMethod m) '''
«FOR c : m.beforeComments»
«c.generateComment»
«ENDFOR»	
«m.visibility.generate»«m.generateStatic» «m.returnType.generateReturnType» «m.name»(«m.parameters.generateMethodParams») {
	«FOR s : m.statements»
		«s.generateStatement»
	«ENDFOR»
}
«FOR c : m.afterComments»
«c.generateComment»
«ENDFOR»	
'''

	def String generateStatic(OOMethod m) {
		if(m.static) " static" else ""
	}

	def String generateReturnType(OOType t) {
		return if(t === null) "void" else t.generate(false)
	}

	def generateMethodParams(
		List<OOVariable> vars) '''«FOR v : vars SEPARATOR ', '»«v.type.generate(false)» «v.name»«ENDFOR»'''

	def generateExpressionListParams(
		List<OOExpression> expressions) '''«FOR e : expressions SEPARATOR ', '»«e.generateExpression»«ENDFOR»'''

	def String generateStatement(OOStatement s) '''«FOR c : s.beforeComments»«c.generateComment»«ENDFOR»«s.generateStatementContent»«FOR c : s.afterComments»«c.generateComment»«ENDFOR»'''

	def dispatch String generateStatementContent(OOCompoundStatement s) '''
	{ 
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR» 
	}'''

	def dispatch String generateStatementContent(
		OOVariable s) '''«s.type.generate(false)» «s.name»«IF (s.initializerExpression !== null) » = «s.initializerExpression.generateExpression»«ENDIF»;'''

	def dispatch String generateStatementContent(OOReturn s) '''return «s.returnedExpresssion.generateExpression»;'''

	def dispatch String generateStatementContent(OOEmptyStatement s) ''';'''

	def dispatch String generateStatementContent(OOIf s) '''if («s.condition.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}«IF !s.elseStatements.empty» else {
		«FOR es : s.elseStatements»
			«es.generateStatement»
		«ENDFOR»
}«ENDIF» «IF s.elseIf !== null» else «s.elseIf.generateStatement»«ENDIF»
	'''

	def dispatch String generateStatementContent(OOWhile s) '''while («s.condition.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}'''

	def dispatch String generateStatementContent(OODoWhile s) '''do {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
} while («s.condition.generateExpression»);'''

	def dispatch String generateStatementContent(
		OOFor s) '''for («s.initStatement.generateStatement» «s.condition.generateExpression»; «s.incrementExpression.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}'''

	def dispatch String generateStatementContent(OOForEach s) '''for () {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
	}'''

	def dispatch String generateStatementContent(OOSwitch s) '''switch («s.controllerExpression.generateExpression») {
«FOR cs : s.caseStatements»
		«cs.generateStatement»
«ENDFOR»
«IF s.defaultStatement !== null»
	«s.defaultStatement.generateStatement»
«ENDIF»
}'''

	def dispatch String generateStatementContent(OOCase s) '''case «s.expression.generateExpression»:
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	'''

	def dispatch String generateStatementContent(OODefault s) '''default:
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR»
	'''

	def dispatch String generateStatementContent(OOBreak s) '''break;'''

	def dispatch String generateStatementContent(OOContinue s) '''continue;'''

	def dispatch String generateStatementContent(OOVariableDeclarationList s) '''
		«FOR vd : s.variableDeclarations»
			«vd.generateStatement»
		«ENDFOR»
	'''

	def dispatch String generateStatementContent(OOExpression s) '''«s.generateExpression»;'''

	def String generateExpression(OOExpression s) '''«FOR c : s.beforeComments»«c.generateComment»«ENDFOR»«s.generateExpressionContent»«FOR c : s.afterComments»«c.generateComment»«ENDFOR»'''

	def dispatch String generateExpressionContent(
		OOFunctionCallExpression s) '''«IF s.ownerExpression !== null»«s.ownerExpression.generateExpression».«ENDIF»«s.functionName»(«s.argumentExpressions.generateExpressionListParams»)'''

	def dispatch String generateExpressionContent(
		OOInitializerList s) '''{«s.initializerExpressions.generateExpressionListParams»}'''

	def dispatch String generateExpressionContent(OOFloatLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OODoubleLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OOIntegerLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OOLongLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OOBoolLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OOThisLiteral s) '''this'''

	def dispatch String generateExpressionContent(OOStringLiteral s) '''«s.value»'''

	def dispatch String generateExpressionContent(OOBracketedExpression s) '''(«s.operand.generateExpression»)'''

	def dispatch String generateExpressionContent(OOPostfixDecrementExpression s) '''«s.operand.generateExpression»--'''

	def dispatch String generateExpressionContent(OOPostfixIncrementExpression s) '''«s.operand.generateExpression»++'''

	def dispatch String generateExpressionContent(OOPrefixDecrementExpression s) '''--«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(OOPrefixIncrementExpression s) '''++«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(OOPlusExpression s) '''+«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(OOMinusExpression s) '''-«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(OOBitWiseComplement s) '''~«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(OONotExpression s) '''!«s.operand.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOAssignmentExpression s) '''«s.leftSide.generateExpression» = «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(OOVariableReferenceExpression s) '''«s.variable.name»'''

	def dispatch String generateExpressionContent(
		OOFieldReferenceExpression s) '''«s.fieldOwner.generateExpression».«s.fieldName»'''

	def dispatch String generateExpressionContent(
		OOIndexing s) '''«s.collectionExpression.generateExpression»[«s.indexExpression.generateExpression»]'''

	def dispatch String generateExpressionContent(
		OOAdditionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» += «ELSE» + «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOSubtractionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» -= «ELSE» - «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OODivisionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» /= «ELSE» / «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOIntegerDivisionExpression s) '''Math.floor(«s.leftSide.generateExpression»«IF s.assigned» /= «ELSE» / «ENDIF»«s.rightSide.generateExpression»)'''

	def dispatch String generateExpressionContent(
		OOMultiplicationExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» *= «ELSE» * «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOModuloExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» %= «ELSE» % «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOPowerExpression s) '''Math.pow(«s.leftSide.generateExpression», «s.rightSide.generateExpression»)'''

	def dispatch String generateExpressionContent(
		OORootExpression s) '''Math.pow(«s.leftSide.generateExpression», 1.0 / «s.rightSide.generateExpression»)'''

	def dispatch String generateExpressionContent(OOLogicalLiteral s) '''«IF s.value»true«ELSE»false«ENDIF»'''

	def dispatch String generateExpressionContent(OONullLiteral s) '''null'''

	def dispatch String generateExpressionContent(
		OOAndExpression s) '''«s.leftSide.generateExpression» && «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOOrExpression s) '''«s.leftSide.generateExpression» || «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOEqualsExpression s) '''«s.leftSide.generateExpression» == «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OONotEqualsExpression s) '''«s.leftSide.generateExpression» != «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOGreaterThanExpression s) '''«s.leftSide.generateExpression» > «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOGreaterEqualsExpression s) '''«s.leftSide.generateExpression» >= «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOLessThanExpression s) '''«s.leftSide.generateExpression» < «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOLessEqualsExpression s) '''«s.leftSide.generateExpression» <= «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOTernaryOperator s) '''«s.condition.generateExpression» ? «s.positiveBranch.generateExpression» : «s.negativeBranch.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOBitwiseOrExpression s) '''«s.leftSide.generateExpression» |«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOBitwiseXorExpression s) '''«s.leftSide.generateExpression» ^«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOBitwiseAndExpression s) '''«s.leftSide.generateExpression» &«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOBitWiseLeftShift s) '''«s.leftSide.generateExpression» <<«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOBitWiseRightShift s) '''«s.leftSide.generateExpression» >>«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpressionContent(
		OOLanguageSpecificExpression s) '''«var sn = s.snippets.findFirst[e|e.lang == OOLanguage.JAVA]»«if ( sn !== null ) sn.code»'''

	def dispatch String generateExpressionContent(
		OOTypeCast s) '''(«s.type.generate(false)»)«s.expression.generateExpression»'''

	def dispatch String generateExpressionContent(
		OONewClass s) '''new «s.className»(«s.constructorParameterExpressions.generateExpressionListParams»)'''

	def dispatch String generateExpressionContent(
		OONewArray s) '''new «IF s.initializerList !== null»«s.arrayType.generate(false)»«ELSE»«s.arrayType.generate(true)»«ENDIF»«s.initializerList?.generateExpression»'''
		
	def String generateComment(OOComment s) '''«s.text»'''
}
