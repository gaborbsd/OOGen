/*
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.protokit.parser.antlr;

import com.google.inject.Inject;
import hu.bme.aut.protokit.parser.antlr.internal.InternalProtokitDSLParser;
import hu.bme.aut.protokit.services.ProtokitDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ProtokitDSLParser extends AbstractAntlrParser {

	@Inject
	private ProtokitDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProtokitDSLParser createParser(XtextTokenStream stream) {
		return new InternalProtokitDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ProtocolModel";
	}

	public ProtokitDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProtokitDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
