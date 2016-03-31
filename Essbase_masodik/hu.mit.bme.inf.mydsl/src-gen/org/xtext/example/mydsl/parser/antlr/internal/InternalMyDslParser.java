package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'", "'descendants'", "','", "'dim'", "'group'", "'member'", "'row'", "'{'", "'}'", "'column'", "'link'", "'child'", "'reportOutput'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ruleInitialStatement ( (lv_Statements_1_0= ruleStatement ) )* otherlv_2= '!' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_Statements_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ruleInitialStatement ( (lv_Statements_1_0= ruleStatement ) )* otherlv_2= '!' ) )
            // InternalMyDsl.g:78:2: ( ruleInitialStatement ( (lv_Statements_1_0= ruleStatement ) )* otherlv_2= '!' )
            {
            // InternalMyDsl.g:78:2: ( ruleInitialStatement ( (lv_Statements_1_0= ruleStatement ) )* otherlv_2= '!' )
            // InternalMyDsl.g:79:3: ruleInitialStatement ( (lv_Statements_1_0= ruleStatement ) )* otherlv_2= '!'
            {

            			newCompositeNode(grammarAccess.getModelAccess().getInitialStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleInitialStatement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:86:3: ( (lv_Statements_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==13||(LA1_0>=15 && LA1_0<=18)||(LA1_0>=21 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:87:4: (lv_Statements_1_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:87:4: (lv_Statements_1_0= ruleStatement )
            	    // InternalMyDsl.g:88:5: lv_Statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Statements",
            	    						lv_Statements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getExclamationMarkKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:113:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:113:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:114:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:120:1: ruleStatement returns [EObject current=null] : (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_Report_7= ruleReport ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Column_0 = null;

        EObject this_Row_1 = null;

        EObject this_Descendants_2 = null;

        EObject this_Declaration_3 = null;

        EObject this_Reference_4 = null;

        EObject this_Child_5 = null;

        EObject this_Link_6 = null;

        EObject this_Report_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:126:2: ( (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_Report_7= ruleReport ) )
            // InternalMyDsl.g:127:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_Report_7= ruleReport )
            {
            // InternalMyDsl.g:127:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_Report_7= ruleReport )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 15:
            case 16:
            case 17:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 24:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:128:3: this_Column_0= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getColumnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_0=ruleColumn();

                    state._fsp--;


                    			current = this_Column_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:137:3: this_Row_1= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_1=ruleRow();

                    state._fsp--;


                    			current = this_Row_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:146:3: this_Descendants_2= ruleDescendants
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDescendantsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendants_2=ruleDescendants();

                    state._fsp--;


                    			current = this_Descendants_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:155:3: this_Declaration_3= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_3=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:164:3: this_Reference_4= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_4=ruleReference();

                    state._fsp--;


                    			current = this_Reference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:173:3: this_Child_5= ruleChild
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getChildParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Child_5=ruleChild();

                    state._fsp--;


                    			current = this_Child_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:182:3: this_Link_6= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLinkParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_6=ruleLink();

                    state._fsp--;


                    			current = this_Link_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:191:3: this_Report_7= ruleReport
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getReportParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Report_7=ruleReport();

                    state._fsp--;


                    			current = this_Report_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalMyDsl.g:203:1: entryRuleInitialStatement returns [String current=null] : iv_ruleInitialStatement= ruleInitialStatement EOF ;
    public final String entryRuleInitialStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitialStatement = null;


        try {
            // InternalMyDsl.g:203:56: (iv_ruleInitialStatement= ruleInitialStatement EOF )
            // InternalMyDsl.g:204:2: iv_ruleInitialStatement= ruleInitialStatement EOF
            {
             newCompositeNode(grammarAccess.getInitialStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialStatement=ruleInitialStatement();

            state._fsp--;

             current =iv_ruleInitialStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialStatement"


    // $ANTLR start "ruleInitialStatement"
    // InternalMyDsl.g:210:1: ruleInitialStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ;
    public final AntlrDatatypeRuleToken ruleInitialStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:216:2: (kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            // InternalMyDsl.g:217:2: kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'
            {
            kw=(Token)match(input,12,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInitialStatementAccess().getSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialStatement"


    // $ANTLR start "entryRuleDescendants"
    // InternalMyDsl.g:225:1: entryRuleDescendants returns [EObject current=null] : iv_ruleDescendants= ruleDescendants EOF ;
    public final EObject entryRuleDescendants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendants = null;


        try {
            // InternalMyDsl.g:225:52: (iv_ruleDescendants= ruleDescendants EOF )
            // InternalMyDsl.g:226:2: iv_ruleDescendants= ruleDescendants EOF
            {
             newCompositeNode(grammarAccess.getDescendantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescendants=ruleDescendants();

            state._fsp--;

             current =iv_ruleDescendants; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescendants"


    // $ANTLR start "ruleDescendants"
    // InternalMyDsl.g:232:1: ruleDescendants returns [EObject current=null] : (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) ;
    public final EObject ruleDescendants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        EObject lv_dimension_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:238:2: ( (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) )
            // InternalMyDsl.g:239:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            {
            // InternalMyDsl.g:239:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            // InternalMyDsl.g:240:3: otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendantsAccess().getDescendantsKeyword_0());
            		
            // InternalMyDsl.g:244:3: ( (lv_group_1_0= RULE_ID ) )
            // InternalMyDsl.g:245:4: (lv_group_1_0= RULE_ID )
            {
            // InternalMyDsl.g:245:4: (lv_group_1_0= RULE_ID )
            // InternalMyDsl.g:246:5: lv_group_1_0= RULE_ID
            {
            lv_group_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_group_1_0, grammarAccess.getDescendantsAccess().getGroupIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescendantsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"group",
            						lv_group_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendantsAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:266:3: ( (lv_dimension_3_0= ruleReference ) )
            // InternalMyDsl.g:267:4: (lv_dimension_3_0= ruleReference )
            {
            // InternalMyDsl.g:267:4: (lv_dimension_3_0= ruleReference )
            // InternalMyDsl.g:268:5: lv_dimension_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getDescendantsAccess().getDimensionReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dimension_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendantsRule());
            					}
            					set(
            						current,
            						"dimension",
            						lv_dimension_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescendants"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:289:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:289:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:290:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:296:1: ruleDeclaration returns [EObject current=null] : (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DimensionDeclaration_0 = null;

        EObject this_GroupDeclaration_1 = null;

        EObject this_MemberDeclaration_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:302:2: ( (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) )
            // InternalMyDsl.g:303:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            {
            // InternalMyDsl.g:303:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:304:3: this_DimensionDeclaration_0= ruleDimensionDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDimensionDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DimensionDeclaration_0=ruleDimensionDeclaration();

                    state._fsp--;


                    			current = this_DimensionDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:3: this_GroupDeclaration_1= ruleGroupDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getGroupDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupDeclaration_1=ruleGroupDeclaration();

                    state._fsp--;


                    			current = this_GroupDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:322:3: this_MemberDeclaration_2= ruleMemberDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMemberDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemberDeclaration_2=ruleMemberDeclaration();

                    state._fsp--;


                    			current = this_MemberDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDimensionDeclaration"
    // InternalMyDsl.g:334:1: entryRuleDimensionDeclaration returns [EObject current=null] : iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF ;
    public final EObject entryRuleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionDeclaration = null;


        try {
            // InternalMyDsl.g:334:61: (iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF )
            // InternalMyDsl.g:335:2: iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDimensionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensionDeclaration=ruleDimensionDeclaration();

            state._fsp--;

             current =iv_ruleDimensionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionDeclaration"


    // $ANTLR start "ruleDimensionDeclaration"
    // InternalMyDsl.g:341:1: ruleDimensionDeclaration returns [EObject current=null] : (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:348:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:348:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:349:3: otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0());
            		
            // InternalMyDsl.g:353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDimensionDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:371:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:372:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:372:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:373:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDimensionDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionDeclaration"


    // $ANTLR start "entryRuleGroupDeclaration"
    // InternalMyDsl.g:393:1: entryRuleGroupDeclaration returns [EObject current=null] : iv_ruleGroupDeclaration= ruleGroupDeclaration EOF ;
    public final EObject entryRuleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDeclaration = null;


        try {
            // InternalMyDsl.g:393:57: (iv_ruleGroupDeclaration= ruleGroupDeclaration EOF )
            // InternalMyDsl.g:394:2: iv_ruleGroupDeclaration= ruleGroupDeclaration EOF
            {
             newCompositeNode(grammarAccess.getGroupDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupDeclaration=ruleGroupDeclaration();

            state._fsp--;

             current =iv_ruleGroupDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupDeclaration"


    // $ANTLR start "ruleGroupDeclaration"
    // InternalMyDsl.g:400:1: ruleGroupDeclaration returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:406:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:407:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:407:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:408:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:412:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:413:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:413:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:414:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:430:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:431:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:431:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:432:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getGroupDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupDeclaration"


    // $ANTLR start "entryRuleMemberDeclaration"
    // InternalMyDsl.g:452:1: entryRuleMemberDeclaration returns [EObject current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final EObject entryRuleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDeclaration = null;


        try {
            // InternalMyDsl.g:452:58: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // InternalMyDsl.g:453:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberDeclaration=ruleMemberDeclaration();

            state._fsp--;

             current =iv_ruleMemberDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclaration"


    // $ANTLR start "ruleMemberDeclaration"
    // InternalMyDsl.g:459:1: ruleMemberDeclaration returns [EObject current=null] : (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:465:2: ( (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:466:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:466:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:467:3: otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0());
            		
            // InternalMyDsl.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:473:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:489:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:490:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:490:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:491:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMemberDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclaration"


    // $ANTLR start "entryRuleRow"
    // InternalMyDsl.g:511:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalMyDsl.g:511:44: (iv_ruleRow= ruleRow EOF )
            // InternalMyDsl.g:512:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalMyDsl.g:518:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dimensions_3_0 = null;

        EObject lv_dimensions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:524:2: ( (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:525:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:525:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:526:3: otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalMyDsl.g:530:3: ()
            // InternalMyDsl.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:541:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:542:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:542:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:543:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_dimensions_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowRule());
            					}
            					add(
            						current,
            						"dimensions",
            						lv_dimensions_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:560:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:561:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:565:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:566:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:566:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:567:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dimensions_5_0=ruleReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dimensions",
            	    							lv_dimensions_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Reference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:593:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:593:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:594:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:600:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dimensions_3_0 = null;

        EObject lv_dimensions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:606:2: ( (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:607:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:607:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:608:3: otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:612:3: ()
            // InternalMyDsl.g:613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:623:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:624:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:624:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:625:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_dimensions_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					add(
            						current,
            						"dimensions",
            						lv_dimensions_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:642:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:643:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:647:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:648:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:648:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:649:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dimensions_5_0=ruleReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getColumnRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dimensions",
            	    							lv_dimensions_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Reference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:675:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:675:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:676:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:682:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_desc_3_0 = null;

        EObject lv_lev_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:688:2: ( (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:689:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:689:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            // InternalMyDsl.g:690:3: otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:694:3: ()
            // InternalMyDsl.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:705:3: ( (lv_desc_3_0= ruleReference ) )
            // InternalMyDsl.g:706:4: (lv_desc_3_0= ruleReference )
            {
            // InternalMyDsl.g:706:4: (lv_desc_3_0= ruleReference )
            // InternalMyDsl.g:707:5: lv_desc_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_desc_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:728:3: ( (lv_lev_5_0= ruleReference ) )
            // InternalMyDsl.g:729:4: (lv_lev_5_0= ruleReference )
            {
            // InternalMyDsl.g:729:4: (lv_lev_5_0= ruleReference )
            // InternalMyDsl.g:730:5: lv_lev_5_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getLevReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_lev_5_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkRule());
            					}
            					set(
            						current,
            						"lev",
            						lv_lev_5_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleChild"
    // InternalMyDsl.g:755:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalMyDsl.g:755:46: (iv_ruleChild= ruleChild EOF )
            // InternalMyDsl.g:756:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalMyDsl.g:762:1: ruleChild returns [EObject current=null] : (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_dimensions_3_0 = null;

        EObject lv_dimensions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:768:2: ( (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:769:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:769:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:770:3: otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getChildAccess().getChildKeyword_0());
            		
            // InternalMyDsl.g:774:3: ()
            // InternalMyDsl.g:775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChildAccess().getChildAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:785:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:786:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:786:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:787:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_dimensions_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildRule());
            					}
            					add(
            						current,
            						"dimensions",
            						lv_dimensions_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:804:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:805:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getChildAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:809:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:810:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:810:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:811:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_dimensions_5_0=ruleReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChildRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dimensions",
            	    							lv_dimensions_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Reference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChildAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleReport"
    // InternalMyDsl.g:837:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // InternalMyDsl.g:837:47: (iv_ruleReport= ruleReport EOF )
            // InternalMyDsl.g:838:2: iv_ruleReport= ruleReport EOF
            {
             newCompositeNode(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReport=ruleReport();

            state._fsp--;

             current =iv_ruleReport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // InternalMyDsl.g:844:1: ruleReport returns [EObject current=null] : (otherlv_0= 'reportOutput' () otherlv_2= '{' ( (lv_dimension_3_0= ruleReference ) ) otherlv_4= '}' ) ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dimension_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:850:2: ( (otherlv_0= 'reportOutput' () otherlv_2= '{' ( (lv_dimension_3_0= ruleReference ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:851:2: (otherlv_0= 'reportOutput' () otherlv_2= '{' ( (lv_dimension_3_0= ruleReference ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:851:2: (otherlv_0= 'reportOutput' () otherlv_2= '{' ( (lv_dimension_3_0= ruleReference ) ) otherlv_4= '}' )
            // InternalMyDsl.g:852:3: otherlv_0= 'reportOutput' () otherlv_2= '{' ( (lv_dimension_3_0= ruleReference ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getReportOutputKeyword_0());
            		
            // InternalMyDsl.g:856:3: ()
            // InternalMyDsl.g:857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportAccess().getReportAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getReportAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:867:3: ( (lv_dimension_3_0= ruleReference ) )
            // InternalMyDsl.g:868:4: (lv_dimension_3_0= ruleReference )
            {
            // InternalMyDsl.g:868:4: (lv_dimension_3_0= ruleReference )
            // InternalMyDsl.g:869:5: lv_dimension_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getReportAccess().getDimensionReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_dimension_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReportRule());
            					}
            					set(
            						current,
            						"dimension",
            						lv_dimension_3_0,
            						"org.xtext.example.mydsl.MyDsl.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReportAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleReference"
    // InternalMyDsl.g:894:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMyDsl.g:894:50: (iv_ruleReference= ruleReference EOF )
            // InternalMyDsl.g:895:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMyDsl.g:901:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StringReference_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:907:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) )
            // InternalMyDsl.g:908:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            {
            // InternalMyDsl.g:908:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:909:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:909:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:910:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:910:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:911:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getReferredDeclarationCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:923:3: this_StringReference_1= ruleStringReference
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getStringReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringReference_1=ruleStringReference();

                    state._fsp--;


                    			current = this_StringReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleStringReference"
    // InternalMyDsl.g:935:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalMyDsl.g:935:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalMyDsl.g:936:2: iv_ruleStringReference= ruleStringReference EOF
            {
             newCompositeNode(grammarAccess.getStringReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringReference=ruleStringReference();

            state._fsp--;

             current =iv_ruleStringReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringReference"


    // $ANTLR start "ruleStringReference"
    // InternalMyDsl.g:942:1: ruleStringReference returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:948:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:949:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:949:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:950:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:950:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:951:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringReferenceAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringReferenceRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001E7A830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});

}