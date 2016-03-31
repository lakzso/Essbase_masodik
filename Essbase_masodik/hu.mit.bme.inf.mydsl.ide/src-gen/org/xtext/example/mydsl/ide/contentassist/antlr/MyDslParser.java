/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getReferenceAccess().getAlternatives(), "rule__Reference__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDescendantsAccess().getGroup(), "rule__Descendants__Group__0");
					put(grammarAccess.getDimensionDeclarationAccess().getGroup(), "rule__DimensionDeclaration__Group__0");
					put(grammarAccess.getGroupDeclarationAccess().getGroup(), "rule__GroupDeclaration__Group__0");
					put(grammarAccess.getMemberDeclarationAccess().getGroup(), "rule__MemberDeclaration__Group__0");
					put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
					put(grammarAccess.getRowAccess().getGroup_4(), "rule__Row__Group_4__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getColumnAccess().getGroup_4(), "rule__Column__Group_4__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getChildAccess().getGroup(), "rule__Child__Group__0");
					put(grammarAccess.getChildAccess().getGroup_4(), "rule__Child__Group_4__0");
					put(grammarAccess.getReportAccess().getGroup(), "rule__Report__Group__0");
					put(grammarAccess.getModelAccess().getStatementsAssignment_1(), "rule__Model__StatementsAssignment_1");
					put(grammarAccess.getDescendantsAccess().getGroupAssignment_1(), "rule__Descendants__GroupAssignment_1");
					put(grammarAccess.getDescendantsAccess().getDimensionAssignment_3(), "rule__Descendants__DimensionAssignment_3");
					put(grammarAccess.getDimensionDeclarationAccess().getNameAssignment_1(), "rule__DimensionDeclaration__NameAssignment_1");
					put(grammarAccess.getDimensionDeclarationAccess().getValueAssignment_2(), "rule__DimensionDeclaration__ValueAssignment_2");
					put(grammarAccess.getGroupDeclarationAccess().getNameAssignment_1(), "rule__GroupDeclaration__NameAssignment_1");
					put(grammarAccess.getGroupDeclarationAccess().getValueAssignment_2(), "rule__GroupDeclaration__ValueAssignment_2");
					put(grammarAccess.getMemberDeclarationAccess().getNameAssignment_1(), "rule__MemberDeclaration__NameAssignment_1");
					put(grammarAccess.getMemberDeclarationAccess().getValueAssignment_2(), "rule__MemberDeclaration__ValueAssignment_2");
					put(grammarAccess.getRowAccess().getDimensionsAssignment_3(), "rule__Row__DimensionsAssignment_3");
					put(grammarAccess.getRowAccess().getDimensionsAssignment_4_1(), "rule__Row__DimensionsAssignment_4_1");
					put(grammarAccess.getColumnAccess().getDimensionsAssignment_3(), "rule__Column__DimensionsAssignment_3");
					put(grammarAccess.getColumnAccess().getDimensionsAssignment_4_1(), "rule__Column__DimensionsAssignment_4_1");
					put(grammarAccess.getLinkAccess().getDescAssignment_3(), "rule__Link__DescAssignment_3");
					put(grammarAccess.getLinkAccess().getLevAssignment_5(), "rule__Link__LevAssignment_5");
					put(grammarAccess.getChildAccess().getDimensionsAssignment_3(), "rule__Child__DimensionsAssignment_3");
					put(grammarAccess.getChildAccess().getDimensionsAssignment_4_1(), "rule__Child__DimensionsAssignment_4_1");
					put(grammarAccess.getReportAccess().getDimensionAssignment_3(), "rule__Report__DimensionAssignment_3");
					put(grammarAccess.getReferenceAccess().getReferredAssignment_0(), "rule__Reference__ReferredAssignment_0");
					put(grammarAccess.getStringReferenceAccess().getValueAssignment(), "rule__StringReference__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
