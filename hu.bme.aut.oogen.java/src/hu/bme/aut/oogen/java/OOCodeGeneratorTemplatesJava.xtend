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
import hu.bme.aut.oogen.OONew
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

class OOCodeGeneratorTemplatesJava implements OOCodeGeneratorTemplates {

	static OOCodeGeneratorTemplatesJava instance;

	def static OOCodeGeneratorTemplatesJava getInstance() {
		if (instance === null)
			instance = new OOCodeGeneratorTemplatesJava();
		return instance;
	}

	override String generate(OOClass cl) '''
package «cl.package.name»;
	
public class «cl.name» {
	«FOR m : cl.members.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
	
	«FOR m : cl.methods.filter[m|m.languages.empty || m.languages.contains(OOLanguage.JAVA)]»
	«m.generate»
	«ENDFOR»
}
	'''

	def String generate(OOMember m) '''
«m.visibility.generate»«m.generateStatic»«m.generateTransient» «m.type.generate» «m.name»«m.generateInit»;
'''

	def String generateTransient(OOMember m) {
		if(m.transient) " transient" else ""
	}
	
	def String generateStatic(OOMember m) {
		if (m.static) " static" else ""
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

	def String generate(OOType t) {
		var arrayNotation = ""
		for (var i = 0; i < t.arrayDimensions; i++) {
			arrayNotation += "[]"
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
				if(t.classType !== null) t.classType.name else "Object"
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
	
	def String generate(OOConstructor c) '''«c.visibility» «c.className»(«c.parameters.generateMethodParams») {
	«FOR s : c.statements»
		«s.generateStatement»
	«ENDFOR»		
}'''

	def String generate(OOMethod m) '''
«m.visibility.generate»«m.generateStatic» «m.returnType.generateReturnType» «m.name»(«m.parameters.generateMethodParams») {
	«FOR s : m.statements»
		«s.generateStatement»
	«ENDFOR»
}'''

	def String generateStatic(OOMethod m) {
		if(m.static) " static" else ""
	}

	def String generateReturnType(OOType t) {
		return if(t === null) "void" else t.generate
	}

	def generateMethodParams(
		List<OOVariable> vars) '''«FOR v : vars SEPARATOR ', '»«v.type.generate» «v.name»«ENDFOR»'''

	def dispatch String generateStatement(OOStatement s) ''''''

	def dispatch String generateStatement(OOCompoundStatement s) '''
	{ 
		«FOR bs : s.bodyStatements»
			«bs.generateStatement»
		«ENDFOR» 
	}'''

	def dispatch String generateStatement(
		OOVariable s) '''«s.type.generate» «s.name»«IF (s.initializerExpression !== null) » = «s.initializerExpression.generateExpression»«ENDIF»;'''

	def dispatch String generateStatement(OOReturn s) '''return «s.returnedExpresssion.generateExpression»;'''

	def dispatch String generateStatement(OOEmptyStatement s) ''';'''

	def dispatch String generateStatement(OOIf s) '''if («s.condition.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}«IF !s.elseStatements.empty» else {
	«FOR es : s.elseStatements»
		«es.generateStatement»
	«ENDFOR»
}«ENDIF» «IF s.elseIf !== null» else «s.elseIf.generateStatement»«ENDIF»
	'''

	def dispatch String generateStatement(OOWhile s) '''while («s.condition.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}'''

	def dispatch String generateStatement(OODoWhile s) '''do {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
} while («s.condition.generateExpression»);'''

	def dispatch String generateStatement(
		OOFor s) '''for («s.initStatement.generateStatement» «s.condition.generateExpression»; «s.incrementExpression.generateExpression») {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}'''

	def dispatch String generateStatement(OOForEach s) '''for () {
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
}'''

	def dispatch String generateStatement(OOSwitch s) '''switch («s.controllerExpression.generateExpression») {
«FOR cs : s.caseStatements»
		«cs.generateStatement»
«ENDFOR»
«IF s.defaultStatement !== null»
	«s.defaultStatement.generateStatement»
«ENDIF»
}'''

	def dispatch String generateStatement(OOCase s) '''case «s.expression.generateExpression»:
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
	'''

	def dispatch String generateStatement(OODefault s) '''default:
	«FOR bs : s.bodyStatements»
		«bs.generateStatement»
	«ENDFOR»
	'''

	def dispatch String generateStatement(OOBreak s) '''break;'''

	def dispatch String generateStatement(OOContinue s) '''continue;'''

	def dispatch String generateStatement(OOVariableDeclarationList s) '''
		«FOR vd : s.variableDeclarations»
			«vd.generateStatement»
		«ENDFOR»
	'''

	def dispatch String generateStatement(OOExpression s) '''«s.generateExpression»;'''

	def dispatch String generateExpression(OOExpression s) ''''''
	
	def dispatch String generateExpression(OOFunctionCallExpression s) '''«s.ownerExpression.generateExpression».«s.functionName»(«FOR pe : s.argumentExpressions»«pe.generateExpression»«IF s.argumentExpressions.indexOf(pe) !== s.argumentExpressions.size - 1», «ENDIF»«ENDFOR»)'''

	def dispatch String generateExpression(
		OOInitializerList s) '''{«FOR ie : s.initializerExpressions»«ie.generateExpression»«IF s.initializerExpressions.indexOf(ie) !== s.initializerExpressions.size - 1», «ENDIF»«ENDFOR»}'''

	def dispatch String generateExpression(OOFloatLiteral s) '''«s.value»'''

	def dispatch String generateExpression(OODoubleLiteral s) '''«s.value»'''

	def dispatch String generateExpression(OOIntegerLiteral s) '''«s.value»'''

	def dispatch String generateExpression(OOLongLiteral s) '''«s.value»'''

	def dispatch String generateExpression(OOBoolLiteral s) '''«s.value»'''
	
	def dispatch String generateExpression(OOThisLiteral s) '''this'''
	
	def dispatch String generateExpression(OOStringLiteral s) '''«s.value»'''

	def dispatch String generateExpression(OOBracketedExpression s) '''(«s.operand.generateExpression»)'''

	def dispatch String generateExpression(OOPostfixDecrementExpression s) '''«s.operand.generateExpression»--'''

	def dispatch String generateExpression(OOPostfixIncrementExpression s) '''«s.operand.generateExpression»++'''

	def dispatch String generateExpression(OOPrefixDecrementExpression s) '''--«s.operand.generateExpression»'''

	def dispatch String generateExpression(OOPrefixIncrementExpression s) '''++«s.operand.generateExpression»'''

	def dispatch String generateExpression(OOPlusExpression s) '''+«s.operand.generateExpression»'''

	def dispatch String generateExpression(OOMinusExpression s) '''-«s.operand.generateExpression»'''

	def dispatch String generateExpression(OOBitWiseComplement s) '''~«s.operand.generateExpression»'''

	def dispatch String generateExpression(OONotExpression s) '''!«s.operand.generateExpression»'''

	def dispatch String generateExpression(
		OOAssignmentExpression s) '''«s.leftSide.generateExpression» = «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(OOVariableReferenceExpression s) '''«s.variable.name»'''

	def dispatch String generateExpression(
		OOFieldReferenceExpression s) '''«s.fieldOwner.generateExpression».«s.fieldName»'''

	def dispatch String generateExpression(
		OOIndexing s) '''«s.collectionExpression.generateExpression»[«s.indexExpression.generateExpression»]'''

	def dispatch String generateExpression(
		OOAdditionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» += «ELSE» + «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOSubtractionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» -= «ELSE» - «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OODivisionExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» /= «ELSE» / «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOIntegerDivisionExpression s) '''Math.floor(«s.leftSide.generateExpression»«IF s.assigned» /= «ELSE» / «ENDIF»«s.rightSide.generateExpression»)'''

	def dispatch String generateExpression(
		OOMultiplicationExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» *= «ELSE» * «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOModuloExpression s) '''«s.leftSide.generateExpression»«IF s.assigned» %= «ELSE» % «ENDIF»«s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOPowerExpression s) '''Math.pow(«s.leftSide.generateExpression», «s.rightSide.generateExpression»)'''

	def dispatch String generateExpression(
		OORootExpression s) '''Math.pow(«s.leftSide.generateExpression», 1.0 / «s.rightSide.generateExpression»)'''

	def dispatch String generateExpression(OOLogicalLiteral s) '''«IF s.value»true«ELSE»false«ENDIF»'''
	
	def dispatch String generateExpression(OONullLiteral s) '''null'''

	def dispatch String generateExpression(
		OOAndExpression s) '''«s.leftSide.generateExpression» && «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOOrExpression s) '''«s.leftSide.generateExpression» || «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOEqualsExpression s) '''«s.leftSide.generateExpression» == «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OONotEqualsExpression s) '''«s.leftSide.generateExpression» != «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOGreaterThanExpression s) '''«s.leftSide.generateExpression» > «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOGreaterEqualsExpression s) '''«s.leftSide.generateExpression» >= «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOLessThanExpression s) '''«s.leftSide.generateExpression» < «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOLessEqualsExpression s) '''«s.leftSide.generateExpression» <= «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOTernaryOperator s) '''«s.condition.generateExpression» ? «s.positiveBranch.generateExpression» : «s.negativeBranch.generateExpression»'''

	def dispatch String generateExpression(
		OOBitwiseOrExpression s) '''«s.leftSide.generateExpression» |«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOBitwiseXorExpression s) '''«s.leftSide.generateExpression» ^«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOBitwiseAndExpression s) '''«s.leftSide.generateExpression» &«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOBitWiseLeftShift s) '''«s.leftSide.generateExpression» <<«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOBitWiseRightShift s) '''«s.leftSide.generateExpression» >>«IF s.assigned»= «ENDIF» «s.rightSide.generateExpression»'''

	def dispatch String generateExpression(
		OOLanguageSpecificExpression s) '''«var sn = s.snippets.findFirst[e|e.lang == OOLanguage.JAVA]»«if ( sn !== null ) sn.code»'''

	def dispatch String generateExpression(OOTypeCast s) '''(«s.type.generate»)(«s.expression.generateExpression»)'''

	def dispatch String generateExpression(
		OONew s) '''new «s.type.generate»(«FOR v : s.constructorParameters SEPARATOR ', '»«v.name»«ENDFOR»)'''
}
