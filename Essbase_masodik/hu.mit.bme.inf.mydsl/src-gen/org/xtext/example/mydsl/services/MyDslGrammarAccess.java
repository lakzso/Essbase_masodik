/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cInitialStatementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cStatementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_1_0 = (RuleCall)cStatementsAssignment_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Model:
		//	InitialStatement
		//	Statements+=Statement*
		//	'!';
		@Override public ParserRule getRule() { return rule; }
		
		//InitialStatement Statements+=Statement* '!'
		public Group getGroup() { return cGroup; }
		
		//InitialStatement
		public RuleCall getInitialStatementParserRuleCall_0() { return cInitialStatementParserRuleCall_0; }
		
		//Statements+=Statement*
		public Assignment getStatementsAssignment_1() { return cStatementsAssignment_1; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_1_0() { return cStatementsStatementParserRuleCall_1_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cColumnParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRowParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDescendantsParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDeclarationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cReferenceParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cChildParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cLinkParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cReportParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Statement:
		//	Column | Row | Descendants | Declaration | Reference | Child | Link | Report;
		@Override public ParserRule getRule() { return rule; }
		
		//Column | Row | Descendants | Declaration | Reference | Child | Link | Report
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Column
		public RuleCall getColumnParserRuleCall_0() { return cColumnParserRuleCall_0; }
		
		//Row
		public RuleCall getRowParserRuleCall_1() { return cRowParserRuleCall_1; }
		
		//Descendants
		public RuleCall getDescendantsParserRuleCall_2() { return cDescendantsParserRuleCall_2; }
		
		//Declaration
		public RuleCall getDeclarationParserRuleCall_3() { return cDeclarationParserRuleCall_3; }
		
		//Reference
		public RuleCall getReferenceParserRuleCall_4() { return cReferenceParserRuleCall_4; }
		
		//Child
		public RuleCall getChildParserRuleCall_5() { return cChildParserRuleCall_5; }
		
		//Link
		public RuleCall getLinkParserRuleCall_6() { return cLinkParserRuleCall_6; }
		
		//Report
		public RuleCall getReportParserRuleCall_7() { return cReportParserRuleCall_7; }
	}
	public class InitialStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.InitialStatement");
		private final Keyword cSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword = (Keyword)rule.eContents().get(1);
		
		//InitialStatement:
		//"{SUPEMPTYROWS}
		//{DECIMAL 10}
		//{TABDELIMIT}
		//{ROWREPEAT}
		//{SUPBRACKETS}
		//{SUPCOMMAS}
		//{NOINDENTGEN}";
		@Override public ParserRule getRule() { return rule; }
		
		//"{SUPEMPTYROWS}
		//{DECIMAL 10}
		//{TABDELIMIT}
		//{ROWREPEAT}
		//{SUPBRACKETS}
		//{SUPCOMMAS}
		//{NOINDENTGEN}"
		public Keyword getSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword() { return cSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword; }
	}
	public class DescendantsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Descendants");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDescendantsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cGroupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGroupIDTerminalRuleCall_1_0 = (RuleCall)cGroupAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionReferenceParserRuleCall_3_0 = (RuleCall)cDimensionAssignment_3.eContents().get(0);
		
		//Descendants:
		//	'descendants' group=ID ',' dimension=Reference;
		@Override public ParserRule getRule() { return rule; }
		
		//'descendants' group=ID ',' dimension=Reference
		public Group getGroup() { return cGroup; }
		
		//'descendants'
		public Keyword getDescendantsKeyword_0() { return cDescendantsKeyword_0; }
		
		//group=ID
		public Assignment getGroupAssignment_1() { return cGroupAssignment_1; }
		
		//ID
		public RuleCall getGroupIDTerminalRuleCall_1_0() { return cGroupIDTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//dimension=Reference
		public Assignment getDimensionAssignment_3() { return cDimensionAssignment_3; }
		
		//Reference
		public RuleCall getDimensionReferenceParserRuleCall_3_0() { return cDimensionReferenceParserRuleCall_3_0; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Declaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDimensionDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGroupDeclarationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMemberDeclarationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Declaration:
		//	DimensionDeclaration | GroupDeclaration | MemberDeclaration;
		@Override public ParserRule getRule() { return rule; }
		
		//DimensionDeclaration | GroupDeclaration | MemberDeclaration
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DimensionDeclaration
		public RuleCall getDimensionDeclarationParserRuleCall_0() { return cDimensionDeclarationParserRuleCall_0; }
		
		//GroupDeclaration
		public RuleCall getGroupDeclarationParserRuleCall_1() { return cGroupDeclarationParserRuleCall_1; }
		
		//MemberDeclaration
		public RuleCall getMemberDeclarationParserRuleCall_2() { return cMemberDeclarationParserRuleCall_2; }
	}
	public class DimensionDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DimensionDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDimKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//DimensionDeclaration:
		//	'dim' name=ID value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'dim' name=ID value=STRING
		public Group getGroup() { return cGroup; }
		
		//'dim'
		public Keyword getDimKeyword_0() { return cDimKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class GroupDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.GroupDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//GroupDeclaration:
		//	'group' name=ID value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'group' name=ID value=STRING
		public Group getGroup() { return cGroup; }
		
		//'group'
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class MemberDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.MemberDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMemberKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//MemberDeclaration:
		//	'member' name=ID value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'member' name=ID value=STRING
		public Group getGroup() { return cGroup; }
		
		//'member'
		public Keyword getMemberKeyword_0() { return cMemberKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class RowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Row");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cRowAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionsReferenceParserRuleCall_3_0 = (RuleCall)cDimensionsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDimensionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDimensionsReferenceParserRuleCall_4_1_0 = (RuleCall)cDimensionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Row:
		//	'row' {Row} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'row' {Row} '{' dimensions+=Reference (',' dimensions+=Reference)* '}'
		public Group getGroup() { return cGroup; }
		
		//'row'
		public Keyword getRowKeyword_0() { return cRowKeyword_0; }
		
		//{Row}
		public Action getRowAction_1() { return cRowAction_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_3() { return cDimensionsAssignment_3; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_3_0() { return cDimensionsReferenceParserRuleCall_3_0; }
		
		//(',' dimensions+=Reference)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_4_1() { return cDimensionsAssignment_4_1; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_4_1_0() { return cDimensionsReferenceParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cColumnAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionsReferenceParserRuleCall_3_0 = (RuleCall)cDimensionsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDimensionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDimensionsReferenceParserRuleCall_4_1_0 = (RuleCall)cDimensionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Column:
		//	'column' {Column} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'column' {Column} '{' dimensions+=Reference (',' dimensions+=Reference)* '}'
		public Group getGroup() { return cGroup; }
		
		//'column'
		public Keyword getColumnKeyword_0() { return cColumnKeyword_0; }
		
		//{Column}
		public Action getColumnAction_1() { return cColumnAction_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_3() { return cDimensionsAssignment_3; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_3_0() { return cDimensionsReferenceParserRuleCall_3_0; }
		
		//(',' dimensions+=Reference)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_4_1() { return cDimensionsAssignment_4_1; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_4_1_0() { return cDimensionsReferenceParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cLinkAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescReferenceParserRuleCall_3_0 = (RuleCall)cDescAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLevAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLevReferenceParserRuleCall_5_0 = (RuleCall)cLevAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Link:
		//	'link' {Link} '{' desc=Reference ',' lev=Reference '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'link' {Link} '{' desc=Reference ',' lev=Reference '}'
		public Group getGroup() { return cGroup; }
		
		//'link'
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }
		
		//{Link}
		public Action getLinkAction_1() { return cLinkAction_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//desc=Reference
		public Assignment getDescAssignment_3() { return cDescAssignment_3; }
		
		//Reference
		public RuleCall getDescReferenceParserRuleCall_3_0() { return cDescReferenceParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//lev=Reference
		public Assignment getLevAssignment_5() { return cLevAssignment_5; }
		
		//Reference
		public RuleCall getLevReferenceParserRuleCall_5_0() { return cLevReferenceParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Child");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChildKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cChildAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDimensionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDimensionsReferenceParserRuleCall_3_0 = (RuleCall)cDimensionsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDimensionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDimensionsReferenceParserRuleCall_4_1_0 = (RuleCall)cDimensionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Child:
		//	'child' {Child} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'child' {Child} '{' dimensions+=Reference (',' dimensions+=Reference)* '}'
		public Group getGroup() { return cGroup; }
		
		//'child'
		public Keyword getChildKeyword_0() { return cChildKeyword_0; }
		
		//{Child}
		public Action getChildAction_1() { return cChildAction_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_3() { return cDimensionsAssignment_3; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_3_0() { return cDimensionsReferenceParserRuleCall_3_0; }
		
		//(',' dimensions+=Reference)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//dimensions+=Reference
		public Assignment getDimensionsAssignment_4_1() { return cDimensionsAssignment_4_1; }
		
		//Reference
		public RuleCall getDimensionsReferenceParserRuleCall_4_1_0() { return cDimensionsReferenceParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ReportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Report");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReportOutputKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cReportAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRepoutAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRepoutStringReferenceParserRuleCall_3_0 = (RuleCall)cRepoutAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Report:
		//	'reportOutput' {Report} '{' repout=StringReference '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'reportOutput' {Report} '{' repout=StringReference '}'
		public Group getGroup() { return cGroup; }
		
		//'reportOutput'
		public Keyword getReportOutputKeyword_0() { return cReportOutputKeyword_0; }
		
		//{Report}
		public Action getReportAction_1() { return cReportAction_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//repout=StringReference
		public Assignment getRepoutAssignment_3() { return cRepoutAssignment_3; }
		
		//StringReference
		public RuleCall getRepoutStringReferenceParserRuleCall_3_0() { return cRepoutStringReferenceParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Reference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cReferredAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cReferredDeclarationCrossReference_0_0 = (CrossReference)cReferredAssignment_0.eContents().get(0);
		private final RuleCall cReferredDeclarationIDTerminalRuleCall_0_0_1 = (RuleCall)cReferredDeclarationCrossReference_0_0.eContents().get(1);
		private final RuleCall cStringReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Reference:
		//	referred=[Declaration] | StringReference;
		@Override public ParserRule getRule() { return rule; }
		
		//referred=[Declaration] | StringReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//referred=[Declaration]
		public Assignment getReferredAssignment_0() { return cReferredAssignment_0; }
		
		//[Declaration]
		public CrossReference getReferredDeclarationCrossReference_0_0() { return cReferredDeclarationCrossReference_0_0; }
		
		//ID
		public RuleCall getReferredDeclarationIDTerminalRuleCall_0_0_1() { return cReferredDeclarationIDTerminalRuleCall_0_0_1; }
		
		//StringReference
		public RuleCall getStringReferenceParserRuleCall_1() { return cStringReferenceParserRuleCall_1; }
	}
	public class StringReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.StringReference");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringReference:
		//	value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final StatementElements pStatement;
	private final InitialStatementElements pInitialStatement;
	private final DescendantsElements pDescendants;
	private final DeclarationElements pDeclaration;
	private final DimensionDeclarationElements pDimensionDeclaration;
	private final GroupDeclarationElements pGroupDeclaration;
	private final MemberDeclarationElements pMemberDeclaration;
	private final RowElements pRow;
	private final ColumnElements pColumn;
	private final LinkElements pLink;
	private final ChildElements pChild;
	private final ReportElements pReport;
	private final ReferenceElements pReference;
	private final StringReferenceElements pStringReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStatement = new StatementElements();
		this.pInitialStatement = new InitialStatementElements();
		this.pDescendants = new DescendantsElements();
		this.pDeclaration = new DeclarationElements();
		this.pDimensionDeclaration = new DimensionDeclarationElements();
		this.pGroupDeclaration = new GroupDeclarationElements();
		this.pMemberDeclaration = new MemberDeclarationElements();
		this.pRow = new RowElements();
		this.pColumn = new ColumnElements();
		this.pLink = new LinkElements();
		this.pChild = new ChildElements();
		this.pReport = new ReportElements();
		this.pReference = new ReferenceElements();
		this.pStringReference = new StringReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	InitialStatement
	//	Statements+=Statement*
	//	'!';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Statement:
	//	Column | Row | Descendants | Declaration | Reference | Child | Link | Report;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//InitialStatement:
	//"{SUPEMPTYROWS}
	//{DECIMAL 10}
	//{TABDELIMIT}
	//{ROWREPEAT}
	//{SUPBRACKETS}
	//{SUPCOMMAS}
	//{NOINDENTGEN}";
	public InitialStatementElements getInitialStatementAccess() {
		return pInitialStatement;
	}
	
	public ParserRule getInitialStatementRule() {
		return getInitialStatementAccess().getRule();
	}
	
	//Descendants:
	//	'descendants' group=ID ',' dimension=Reference;
	public DescendantsElements getDescendantsAccess() {
		return pDescendants;
	}
	
	public ParserRule getDescendantsRule() {
		return getDescendantsAccess().getRule();
	}
	
	//Declaration:
	//	DimensionDeclaration | GroupDeclaration | MemberDeclaration;
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//DimensionDeclaration:
	//	'dim' name=ID value=STRING;
	public DimensionDeclarationElements getDimensionDeclarationAccess() {
		return pDimensionDeclaration;
	}
	
	public ParserRule getDimensionDeclarationRule() {
		return getDimensionDeclarationAccess().getRule();
	}
	
	//GroupDeclaration:
	//	'group' name=ID value=STRING;
	public GroupDeclarationElements getGroupDeclarationAccess() {
		return pGroupDeclaration;
	}
	
	public ParserRule getGroupDeclarationRule() {
		return getGroupDeclarationAccess().getRule();
	}
	
	//MemberDeclaration:
	//	'member' name=ID value=STRING;
	public MemberDeclarationElements getMemberDeclarationAccess() {
		return pMemberDeclaration;
	}
	
	public ParserRule getMemberDeclarationRule() {
		return getMemberDeclarationAccess().getRule();
	}
	
	//Row:
	//	'row' {Row} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
	public RowElements getRowAccess() {
		return pRow;
	}
	
	public ParserRule getRowRule() {
		return getRowAccess().getRule();
	}
	
	//Column:
	//	'column' {Column} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//Link:
	//	'link' {Link} '{' desc=Reference ',' lev=Reference '}';
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//Child:
	//	'child' {Child} '{' dimensions+=Reference (',' dimensions+=Reference)* '}';
	public ChildElements getChildAccess() {
		return pChild;
	}
	
	public ParserRule getChildRule() {
		return getChildAccess().getRule();
	}
	
	//Report:
	//	'reportOutput' {Report} '{' repout=StringReference '}';
	public ReportElements getReportAccess() {
		return pReport;
	}
	
	public ParserRule getReportRule() {
		return getReportAccess().getRule();
	}
	
	//Reference:
	//	referred=[Declaration] | StringReference;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//StringReference:
	//	value=STRING;
	public StringReferenceElements getStringReferenceAccess() {
		return pStringReference;
	}
	
	public ParserRule getStringReferenceRule() {
		return getStringReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
