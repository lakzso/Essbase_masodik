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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'query'", "'{'", "'}'", "'report'", "'{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'", "'descendants'", "','", "'dim'", "'group'", "'member'", "'row'", "'column'", "'link'", "'child'", "'reportParameter'"
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_Queries_0_0= ruleQuery ) )* ( (lv_Reports_1_0= ruleReport ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Queries_0_0 = null;

        EObject lv_Reports_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_Queries_0_0= ruleQuery ) )* ( (lv_Reports_1_0= ruleReport ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_Queries_0_0= ruleQuery ) )* ( (lv_Reports_1_0= ruleReport ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_Queries_0_0= ruleQuery ) )* ( (lv_Reports_1_0= ruleReport ) )* )
            // InternalMyDsl.g:79:3: ( (lv_Queries_0_0= ruleQuery ) )* ( (lv_Reports_1_0= ruleReport ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_Queries_0_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_Queries_0_0= ruleQuery )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_Queries_0_0= ruleQuery )
            	    // InternalMyDsl.g:81:5: lv_Queries_0_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_Queries_0_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Queries",
            	    						lv_Queries_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_Reports_1_0= ruleReport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_Reports_1_0= ruleReport )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_Reports_1_0= ruleReport )
            	    // InternalMyDsl.g:100:5: lv_Reports_1_0= ruleReport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getReportsReportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_Reports_1_0=ruleReport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Reports",
            	    						lv_Reports_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Report");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:121:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalMyDsl.g:121:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalMyDsl.g:122:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:128:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'query' otherlv_3= '{' ruleInitialStatement ( (lv_Query_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_Query_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'query' otherlv_3= '{' ruleInitialStatement ( (lv_Query_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'query' otherlv_3= '{' ruleInitialStatement ( (lv_Query_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:135:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'query' otherlv_3= '{' ruleInitialStatement ( (lv_Query_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            // InternalMyDsl.g:136:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'query' otherlv_3= '{' ruleInitialStatement ( (lv_Query_5_0= ruleReportQueryParameters ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:136:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:137:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:137:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:138:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getQueryKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3());
            		

            			newCompositeNode(grammarAccess.getQueryAccess().getInitialStatementParserRuleCall_4());
            		
            pushFollow(FOLLOW_9);
            ruleInitialStatement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:173:3: ( (lv_Query_5_0= ruleReportQueryParameters ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==17||(LA3_0>=19 && LA3_0<=26)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:174:4: (lv_Query_5_0= ruleReportQueryParameters )
            	    {
            	    // InternalMyDsl.g:174:4: (lv_Query_5_0= ruleReportQueryParameters )
            	    // InternalMyDsl.g:175:5: lv_Query_5_0= ruleReportQueryParameters
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getQueryReportQueryParametersParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_Query_5_0=ruleReportQueryParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Query",
            	    						lv_Query_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReportQueryParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleReport"
    // InternalMyDsl.g:200:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // InternalMyDsl.g:200:47: (iv_ruleReport= ruleReport EOF )
            // InternalMyDsl.g:201:2: iv_ruleReport= ruleReport EOF
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
    // InternalMyDsl.g:207:1: ruleReport returns [EObject current=null] : (otherlv_0= 'report' () ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (otherlv_0= 'report' () ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:214:2: (otherlv_0= 'report' () ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:214:2: (otherlv_0= 'report' () ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:215:3: otherlv_0= 'report' () ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getReportKeyword_0());
            		
            // InternalMyDsl.g:219:3: ()
            // InternalMyDsl.g:220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportAccess().getReportAction_1(),
            					current);
            			

            }

            // InternalMyDsl.g:226:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:227:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:227:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:228:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getReportAccess().getRepoutQueryCrossReference_2_0());
            				

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
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleReportQueryParameters"
    // InternalMyDsl.g:243:1: entryRuleReportQueryParameters returns [EObject current=null] : iv_ruleReportQueryParameters= ruleReportQueryParameters EOF ;
    public final EObject entryRuleReportQueryParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportQueryParameters = null;


        try {
            // InternalMyDsl.g:243:62: (iv_ruleReportQueryParameters= ruleReportQueryParameters EOF )
            // InternalMyDsl.g:244:2: iv_ruleReportQueryParameters= ruleReportQueryParameters EOF
            {
             newCompositeNode(grammarAccess.getReportQueryParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReportQueryParameters=ruleReportQueryParameters();

            state._fsp--;

             current =iv_ruleReportQueryParameters; 
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
    // $ANTLR end "entryRuleReportQueryParameters"


    // $ANTLR start "ruleReportQueryParameters"
    // InternalMyDsl.g:250:1: ruleReportQueryParameters returns [EObject current=null] : (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) ;
    public final EObject ruleReportQueryParameters() throws RecognitionException {
        EObject current = null;

        EObject this_Column_0 = null;

        EObject this_Row_1 = null;

        EObject this_Descendants_2 = null;

        EObject this_Declaration_3 = null;

        EObject this_Reference_4 = null;

        EObject this_Child_5 = null;

        EObject this_Link_6 = null;

        EObject this_ReportParameter_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) )
            // InternalMyDsl.g:257:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            {
            // InternalMyDsl.g:257:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt4=4;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 26:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:258:3: this_Column_0= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getColumnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_0=ruleColumn();

                    state._fsp--;


                    			current = this_Column_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:267:3: this_Row_1= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getRowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_1=ruleRow();

                    state._fsp--;


                    			current = this_Row_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:276:3: this_Descendants_2= ruleDescendants
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getDescendantsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendants_2=ruleDescendants();

                    state._fsp--;


                    			current = this_Descendants_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:285:3: this_Declaration_3= ruleDeclaration
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Declaration_3=ruleDeclaration();

                    state._fsp--;


                    			current = this_Declaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:294:3: this_Reference_4= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_4=ruleReference();

                    state._fsp--;


                    			current = this_Reference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:303:3: this_Child_5= ruleChild
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getChildParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Child_5=ruleChild();

                    state._fsp--;


                    			current = this_Child_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:312:3: this_Link_6= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getLinkParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_6=ruleLink();

                    state._fsp--;


                    			current = this_Link_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:321:3: this_ReportParameter_7= ruleReportParameter
                    {

                    			newCompositeNode(grammarAccess.getReportQueryParametersAccess().getReportParameterParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReportParameter_7=ruleReportParameter();

                    state._fsp--;


                    			current = this_ReportParameter_7;
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
    // $ANTLR end "ruleReportQueryParameters"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalMyDsl.g:333:1: entryRuleInitialStatement returns [String current=null] : iv_ruleInitialStatement= ruleInitialStatement EOF ;
    public final String entryRuleInitialStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitialStatement = null;


        try {
            // InternalMyDsl.g:333:56: (iv_ruleInitialStatement= ruleInitialStatement EOF )
            // InternalMyDsl.g:334:2: iv_ruleInitialStatement= ruleInitialStatement EOF
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
    // InternalMyDsl.g:340:1: ruleInitialStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ;
    public final AntlrDatatypeRuleToken ruleInitialStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:346:2: (kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            // InternalMyDsl.g:347:2: kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

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
    // InternalMyDsl.g:355:1: entryRuleDescendants returns [EObject current=null] : iv_ruleDescendants= ruleDescendants EOF ;
    public final EObject entryRuleDescendants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendants = null;


        try {
            // InternalMyDsl.g:355:52: (iv_ruleDescendants= ruleDescendants EOF )
            // InternalMyDsl.g:356:2: iv_ruleDescendants= ruleDescendants EOF
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
    // InternalMyDsl.g:362:1: ruleDescendants returns [EObject current=null] : (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) ;
    public final EObject ruleDescendants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        EObject lv_dimension_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:368:2: ( (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) )
            // InternalMyDsl.g:369:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            {
            // InternalMyDsl.g:369:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            // InternalMyDsl.g:370:3: otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendantsAccess().getDescendantsKeyword_0());
            		
            // InternalMyDsl.g:374:3: ( (lv_group_1_0= RULE_ID ) )
            // InternalMyDsl.g:375:4: (lv_group_1_0= RULE_ID )
            {
            // InternalMyDsl.g:375:4: (lv_group_1_0= RULE_ID )
            // InternalMyDsl.g:376:5: lv_group_1_0= RULE_ID
            {
            lv_group_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendantsAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:396:3: ( (lv_dimension_3_0= ruleReference ) )
            // InternalMyDsl.g:397:4: (lv_dimension_3_0= ruleReference )
            {
            // InternalMyDsl.g:397:4: (lv_dimension_3_0= ruleReference )
            // InternalMyDsl.g:398:5: lv_dimension_3_0= ruleReference
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
    // InternalMyDsl.g:419:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:419:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:420:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:426:1: ruleDeclaration returns [EObject current=null] : (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DimensionDeclaration_0 = null;

        EObject this_GroupDeclaration_1 = null;

        EObject this_MemberDeclaration_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:432:2: ( (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) )
            // InternalMyDsl.g:433:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            {
            // InternalMyDsl.g:433:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:434:3: this_DimensionDeclaration_0= ruleDimensionDeclaration
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
                    // InternalMyDsl.g:443:3: this_GroupDeclaration_1= ruleGroupDeclaration
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
                    // InternalMyDsl.g:452:3: this_MemberDeclaration_2= ruleMemberDeclaration
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
    // InternalMyDsl.g:464:1: entryRuleDimensionDeclaration returns [EObject current=null] : iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF ;
    public final EObject entryRuleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionDeclaration = null;


        try {
            // InternalMyDsl.g:464:61: (iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF )
            // InternalMyDsl.g:465:2: iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF
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
    // InternalMyDsl.g:471:1: ruleDimensionDeclaration returns [EObject current=null] : (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:477:2: ( (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:478:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:478:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:479:3: otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0());
            		
            // InternalMyDsl.g:483:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:484:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:484:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:485:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:501:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:502:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:502:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:503:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:523:1: entryRuleGroupDeclaration returns [EObject current=null] : iv_ruleGroupDeclaration= ruleGroupDeclaration EOF ;
    public final EObject entryRuleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDeclaration = null;


        try {
            // InternalMyDsl.g:523:57: (iv_ruleGroupDeclaration= ruleGroupDeclaration EOF )
            // InternalMyDsl.g:524:2: iv_ruleGroupDeclaration= ruleGroupDeclaration EOF
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
    // InternalMyDsl.g:530:1: ruleGroupDeclaration returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:536:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:537:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:537:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:538:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:542:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:543:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:543:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:544:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:560:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:561:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:561:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:562:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:582:1: entryRuleMemberDeclaration returns [EObject current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final EObject entryRuleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDeclaration = null;


        try {
            // InternalMyDsl.g:582:58: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // InternalMyDsl.g:583:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
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
    // InternalMyDsl.g:589:1: ruleMemberDeclaration returns [EObject current=null] : (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:596:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:596:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:597:3: otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0());
            		
            // InternalMyDsl.g:601:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:602:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:602:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:603:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:619:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:620:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:620:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:621:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:641:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalMyDsl.g:641:44: (iv_ruleRow= ruleRow EOF )
            // InternalMyDsl.g:642:2: iv_ruleRow= ruleRow EOF
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
    // InternalMyDsl.g:648:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:654:2: ( (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:655:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:655:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:656:3: otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalMyDsl.g:660:3: ()
            // InternalMyDsl.g:661:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:671:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:672:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:672:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:673:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalMyDsl.g:690:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:691:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:695:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:696:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:696:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:697:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:723:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:723:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:724:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalMyDsl.g:730:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:736:2: ( (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:737:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:737:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:738:3: otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:742:3: ()
            // InternalMyDsl.g:743:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:753:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:754:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:754:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:755:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalMyDsl.g:772:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:773:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:777:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:778:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:778:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:779:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:805:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:805:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:806:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:812:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:818:2: ( (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:819:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:819:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            // InternalMyDsl.g:820:3: otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:824:3: ()
            // InternalMyDsl.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:835:3: ( (lv_desc_3_0= ruleReference ) )
            // InternalMyDsl.g:836:4: (lv_desc_3_0= ruleReference )
            {
            // InternalMyDsl.g:836:4: (lv_desc_3_0= ruleReference )
            // InternalMyDsl.g:837:5: lv_desc_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:858:3: ( (lv_lev_5_0= ruleReference ) )
            // InternalMyDsl.g:859:4: (lv_lev_5_0= ruleReference )
            {
            // InternalMyDsl.g:859:4: (lv_lev_5_0= ruleReference )
            // InternalMyDsl.g:860:5: lv_lev_5_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getLevReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:885:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalMyDsl.g:885:46: (iv_ruleChild= ruleChild EOF )
            // InternalMyDsl.g:886:2: iv_ruleChild= ruleChild EOF
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
    // InternalMyDsl.g:892:1: ruleChild returns [EObject current=null] : (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:898:2: ( (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:899:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:899:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:900:3: otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChildAccess().getChildKeyword_0());
            		
            // InternalMyDsl.g:904:3: ()
            // InternalMyDsl.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChildAccess().getChildAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:915:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:916:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:916:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:917:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalMyDsl.g:934:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:935:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getChildAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:939:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:940:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:940:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:941:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReportParameter"
    // InternalMyDsl.g:967:1: entryRuleReportParameter returns [EObject current=null] : iv_ruleReportParameter= ruleReportParameter EOF ;
    public final EObject entryRuleReportParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportParameter = null;


        try {
            // InternalMyDsl.g:967:56: (iv_ruleReportParameter= ruleReportParameter EOF )
            // InternalMyDsl.g:968:2: iv_ruleReportParameter= ruleReportParameter EOF
            {
             newCompositeNode(grammarAccess.getReportParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReportParameter=ruleReportParameter();

            state._fsp--;

             current =iv_ruleReportParameter; 
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
    // $ANTLR end "entryRuleReportParameter"


    // $ANTLR start "ruleReportParameter"
    // InternalMyDsl.g:974:1: ruleReportParameter returns [EObject current=null] : (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) ;
    public final EObject ruleReportParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reparam_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:980:2: ( (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:981:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:981:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            // InternalMyDsl.g:982:3: otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReportParameterAccess().getReportParameterKeyword_0());
            		
            // InternalMyDsl.g:986:3: ()
            // InternalMyDsl.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportParameterAccess().getReportParameterAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getReportParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:997:3: ( (lv_reparam_3_0= ruleStringReference ) )
            // InternalMyDsl.g:998:4: (lv_reparam_3_0= ruleStringReference )
            {
            // InternalMyDsl.g:998:4: (lv_reparam_3_0= ruleStringReference )
            // InternalMyDsl.g:999:5: lv_reparam_3_0= ruleStringReference
            {

            					newCompositeNode(grammarAccess.getReportParameterAccess().getReparamStringReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_reparam_3_0=ruleStringReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReportParameterRule());
            					}
            					set(
            						current,
            						"reparam",
            						lv_reparam_3_0,
            						"org.xtext.example.mydsl.MyDsl.StringReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReportParameterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReportParameter"


    // $ANTLR start "entryRuleReference"
    // InternalMyDsl.g:1024:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMyDsl.g:1024:50: (iv_ruleReference= ruleReference EOF )
            // InternalMyDsl.g:1025:2: iv_ruleReference= ruleReference EOF
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
    // InternalMyDsl.g:1031:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StringReference_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1037:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) )
            // InternalMyDsl.g:1038:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            {
            // InternalMyDsl.g:1038:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1039:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1039:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:1040:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1040:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:1041:5: otherlv_0= RULE_ID
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
                    // InternalMyDsl.g:1053:3: this_StringReference_1= ruleStringReference
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
    // InternalMyDsl.g:1065:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalMyDsl.g:1065:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalMyDsl.g:1066:2: iv_ruleStringReference= ruleStringReference EOF
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
    // InternalMyDsl.g:1072:1: ruleStringReference returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1078:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1079:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1079:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1080:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1080:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1081:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007FA4030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});

}