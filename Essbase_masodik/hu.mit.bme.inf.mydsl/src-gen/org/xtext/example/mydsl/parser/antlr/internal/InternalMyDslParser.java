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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'queryMDX'", "'{'", "'}'", "'queryReport'", "'reportToLatex'", "'('", "','", "')'", "'Teszt'", "'{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'", "'descendants'", "'dim'", "'group'", "'member'", "'row'", "'column'", "'link'", "'child'", "'reportParameter'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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

                if ( (LA2_0==16) ) {
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
    // InternalMyDsl.g:128:1: ruleQuery returns [EObject current=null] : (this_QueryReport_0= ruleQueryReport | this_MDXQuery_1= ruleMDXQuery ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject this_QueryReport_0 = null;

        EObject this_MDXQuery_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (this_QueryReport_0= ruleQueryReport | this_MDXQuery_1= ruleMDXQuery ) )
            // InternalMyDsl.g:135:2: (this_QueryReport_0= ruleQueryReport | this_MDXQuery_1= ruleMDXQuery )
            {
            // InternalMyDsl.g:135:2: (this_QueryReport_0= ruleQueryReport | this_MDXQuery_1= ruleMDXQuery )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==15) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==12) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:136:3: this_QueryReport_0= ruleQueryReport
                    {

                    			newCompositeNode(grammarAccess.getQueryAccess().getQueryReportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryReport_0=ruleQueryReport();

                    state._fsp--;


                    			current = this_QueryReport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:145:3: this_MDXQuery_1= ruleMDXQuery
                    {

                    			newCompositeNode(grammarAccess.getQueryAccess().getMDXQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MDXQuery_1=ruleMDXQuery();

                    state._fsp--;


                    			current = this_MDXQuery_1;
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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMDXQuery"
    // InternalMyDsl.g:157:1: entryRuleMDXQuery returns [EObject current=null] : iv_ruleMDXQuery= ruleMDXQuery EOF ;
    public final EObject entryRuleMDXQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDXQuery = null;


        try {
            // InternalMyDsl.g:157:49: (iv_ruleMDXQuery= ruleMDXQuery EOF )
            // InternalMyDsl.g:158:2: iv_ruleMDXQuery= ruleMDXQuery EOF
            {
             newCompositeNode(grammarAccess.getMDXQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDXQuery=ruleMDXQuery();

            state._fsp--;

             current =iv_ruleMDXQuery; 
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
    // $ANTLR end "entryRuleMDXQuery"


    // $ANTLR start "ruleMDXQuery"
    // InternalMyDsl.g:164:1: ruleMDXQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )* otherlv_5= '}' ) ;
    public final EObject ruleMDXQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_QueryMDX_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:170:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )* otherlv_5= '}' )
            // InternalMyDsl.g:172:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:172:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:173:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:173:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:174:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMDXQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMDXQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMDXQueryAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMDXQueryAccess().getQueryMDXKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMDXQueryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:202:3: ( (lv_QueryMDX_4_0= ruleMDXQueryParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:203:4: (lv_QueryMDX_4_0= ruleMDXQueryParameters )
            	    {
            	    // InternalMyDsl.g:203:4: (lv_QueryMDX_4_0= ruleMDXQueryParameters )
            	    // InternalMyDsl.g:204:5: lv_QueryMDX_4_0= ruleMDXQueryParameters
            	    {

            	    					newCompositeNode(grammarAccess.getMDXQueryAccess().getQueryMDXMDXQueryParametersParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_QueryMDX_4_0=ruleMDXQueryParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMDXQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"QueryMDX",
            	    						lv_QueryMDX_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.MDXQueryParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMDXQueryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMDXQuery"


    // $ANTLR start "entryRuleQueryReport"
    // InternalMyDsl.g:229:1: entryRuleQueryReport returns [EObject current=null] : iv_ruleQueryReport= ruleQueryReport EOF ;
    public final EObject entryRuleQueryReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryReport = null;


        try {
            // InternalMyDsl.g:229:52: (iv_ruleQueryReport= ruleQueryReport EOF )
            // InternalMyDsl.g:230:2: iv_ruleQueryReport= ruleQueryReport EOF
            {
             newCompositeNode(grammarAccess.getQueryReportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryReport=ruleQueryReport();

            state._fsp--;

             current =iv_ruleQueryReport; 
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
    // $ANTLR end "entryRuleQueryReport"


    // $ANTLR start "ruleQueryReport"
    // InternalMyDsl.g:236:1: ruleQueryReport returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) ;
    public final EObject ruleQueryReport() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_QueryReport_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:242:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            // InternalMyDsl.g:244:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:244:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:245:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:245:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:246:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryReportAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryReportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryReportAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryReportAccess().getQueryReportKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryReportAccess().getLeftCurlyBracketKeyword_3());
            		

            			newCompositeNode(grammarAccess.getQueryReportAccess().getInitialStatementParserRuleCall_4());
            		
            pushFollow(FOLLOW_11);
            ruleInitialStatement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:281:3: ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=22 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:282:4: (lv_QueryReport_5_0= ruleReportQueryParameters )
            	    {
            	    // InternalMyDsl.g:282:4: (lv_QueryReport_5_0= ruleReportQueryParameters )
            	    // InternalMyDsl.g:283:5: lv_QueryReport_5_0= ruleReportQueryParameters
            	    {

            	    					newCompositeNode(grammarAccess.getQueryReportAccess().getQueryReportReportQueryParametersParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_QueryReport_5_0=ruleReportQueryParameters();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueryReportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"QueryReport",
            	    						lv_QueryReport_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.ReportQueryParameters");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryReportAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleQueryReport"


    // $ANTLR start "entryRuleReport"
    // InternalMyDsl.g:308:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // InternalMyDsl.g:308:47: (iv_ruleReport= ruleReport EOF )
            // InternalMyDsl.g:309:2: iv_ruleReport= ruleReport EOF
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
    // InternalMyDsl.g:315:1: ruleReport returns [EObject current=null] : (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' ) ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_from_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:321:2: ( (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:322:2: (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:322:2: (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' )
            // InternalMyDsl.g:323:3: otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getReportToLatexKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getReportAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:331:3: ()
            // InternalMyDsl.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportAccess().getReportAction_2(),
            					current);
            			

            }

            // InternalMyDsl.g:338:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:339:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:339:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:340:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_3, grammarAccess.getReportAccess().getRepoutQueryCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getReportAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:355:3: ( (lv_from_5_0= ruledatabase ) )
            // InternalMyDsl.g:356:4: (lv_from_5_0= ruledatabase )
            {
            // InternalMyDsl.g:356:4: (lv_from_5_0= ruledatabase )
            // InternalMyDsl.g:357:5: lv_from_5_0= ruledatabase
            {

            					newCompositeNode(grammarAccess.getReportAccess().getFromDatabaseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_from_5_0=ruledatabase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReportRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_5_0,
            						"org.xtext.example.mydsl.MyDsl.database");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReportAccess().getRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuledatabase"
    // InternalMyDsl.g:382:1: entryRuledatabase returns [EObject current=null] : iv_ruledatabase= ruledatabase EOF ;
    public final EObject entryRuledatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledatabase = null;


        try {
            // InternalMyDsl.g:382:49: (iv_ruledatabase= ruledatabase EOF )
            // InternalMyDsl.g:383:2: iv_ruledatabase= ruledatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledatabase=ruledatabase();

            state._fsp--;

             current =iv_ruledatabase; 
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
    // $ANTLR end "entryRuledatabase"


    // $ANTLR start "ruledatabase"
    // InternalMyDsl.g:389:1: ruledatabase returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruledatabase() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:395:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:396:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:396:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:397:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:397:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:398:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDatabaseAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDatabaseRule());
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
    // $ANTLR end "ruledatabase"


    // $ANTLR start "entryRuleReportQueryParameters"
    // InternalMyDsl.g:417:1: entryRuleReportQueryParameters returns [EObject current=null] : iv_ruleReportQueryParameters= ruleReportQueryParameters EOF ;
    public final EObject entryRuleReportQueryParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportQueryParameters = null;


        try {
            // InternalMyDsl.g:417:62: (iv_ruleReportQueryParameters= ruleReportQueryParameters EOF )
            // InternalMyDsl.g:418:2: iv_ruleReportQueryParameters= ruleReportQueryParameters EOF
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
    // InternalMyDsl.g:424:1: ruleReportQueryParameters returns [EObject current=null] : (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) ;
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
            // InternalMyDsl.g:430:2: ( (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) )
            // InternalMyDsl.g:431:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            {
            // InternalMyDsl.g:431:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            case 30:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:432:3: this_Column_0= ruleColumn
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
                    // InternalMyDsl.g:441:3: this_Row_1= ruleRow
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
                    // InternalMyDsl.g:450:3: this_Descendants_2= ruleDescendants
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
                    // InternalMyDsl.g:459:3: this_Declaration_3= ruleDeclaration
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
                    // InternalMyDsl.g:468:3: this_Reference_4= ruleReference
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
                    // InternalMyDsl.g:477:3: this_Child_5= ruleChild
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
                    // InternalMyDsl.g:486:3: this_Link_6= ruleLink
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
                    // InternalMyDsl.g:495:3: this_ReportParameter_7= ruleReportParameter
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


    // $ANTLR start "entryRuleMDXQueryParameters"
    // InternalMyDsl.g:507:1: entryRuleMDXQueryParameters returns [String current=null] : iv_ruleMDXQueryParameters= ruleMDXQueryParameters EOF ;
    public final String entryRuleMDXQueryParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMDXQueryParameters = null;


        try {
            // InternalMyDsl.g:507:58: (iv_ruleMDXQueryParameters= ruleMDXQueryParameters EOF )
            // InternalMyDsl.g:508:2: iv_ruleMDXQueryParameters= ruleMDXQueryParameters EOF
            {
             newCompositeNode(grammarAccess.getMDXQueryParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDXQueryParameters=ruleMDXQueryParameters();

            state._fsp--;

             current =iv_ruleMDXQueryParameters.getText(); 
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
    // $ANTLR end "entryRuleMDXQueryParameters"


    // $ANTLR start "ruleMDXQueryParameters"
    // InternalMyDsl.g:514:1: ruleMDXQueryParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Teszt' ;
    public final AntlrDatatypeRuleToken ruleMDXQueryParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:520:2: (kw= 'Teszt' )
            // InternalMyDsl.g:521:2: kw= 'Teszt'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMDXQueryParametersAccess().getTesztKeyword());
            	

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
    // $ANTLR end "ruleMDXQueryParameters"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalMyDsl.g:529:1: entryRuleInitialStatement returns [String current=null] : iv_ruleInitialStatement= ruleInitialStatement EOF ;
    public final String entryRuleInitialStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitialStatement = null;


        try {
            // InternalMyDsl.g:529:56: (iv_ruleInitialStatement= ruleInitialStatement EOF )
            // InternalMyDsl.g:530:2: iv_ruleInitialStatement= ruleInitialStatement EOF
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
    // InternalMyDsl.g:536:1: ruleInitialStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ;
    public final AntlrDatatypeRuleToken ruleInitialStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:542:2: (kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            // InternalMyDsl.g:543:2: kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalMyDsl.g:551:1: entryRuleDescendants returns [EObject current=null] : iv_ruleDescendants= ruleDescendants EOF ;
    public final EObject entryRuleDescendants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendants = null;


        try {
            // InternalMyDsl.g:551:52: (iv_ruleDescendants= ruleDescendants EOF )
            // InternalMyDsl.g:552:2: iv_ruleDescendants= ruleDescendants EOF
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
    // InternalMyDsl.g:558:1: ruleDescendants returns [EObject current=null] : (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) ;
    public final EObject ruleDescendants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        EObject lv_dimension_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) )
            // InternalMyDsl.g:565:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            {
            // InternalMyDsl.g:565:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            // InternalMyDsl.g:566:3: otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendantsAccess().getDescendantsKeyword_0());
            		
            // InternalMyDsl.g:570:3: ( (lv_group_1_0= RULE_ID ) )
            // InternalMyDsl.g:571:4: (lv_group_1_0= RULE_ID )
            {
            // InternalMyDsl.g:571:4: (lv_group_1_0= RULE_ID )
            // InternalMyDsl.g:572:5: lv_group_1_0= RULE_ID
            {
            lv_group_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendantsAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:592:3: ( (lv_dimension_3_0= ruleReference ) )
            // InternalMyDsl.g:593:4: (lv_dimension_3_0= ruleReference )
            {
            // InternalMyDsl.g:593:4: (lv_dimension_3_0= ruleReference )
            // InternalMyDsl.g:594:5: lv_dimension_3_0= ruleReference
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
    // InternalMyDsl.g:615:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:615:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:616:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:622:1: ruleDeclaration returns [EObject current=null] : (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DimensionDeclaration_0 = null;

        EObject this_GroupDeclaration_1 = null;

        EObject this_MemberDeclaration_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:628:2: ( (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) )
            // InternalMyDsl.g:629:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            {
            // InternalMyDsl.g:629:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:630:3: this_DimensionDeclaration_0= ruleDimensionDeclaration
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
                    // InternalMyDsl.g:639:3: this_GroupDeclaration_1= ruleGroupDeclaration
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
                    // InternalMyDsl.g:648:3: this_MemberDeclaration_2= ruleMemberDeclaration
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
    // InternalMyDsl.g:660:1: entryRuleDimensionDeclaration returns [EObject current=null] : iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF ;
    public final EObject entryRuleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionDeclaration = null;


        try {
            // InternalMyDsl.g:660:61: (iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF )
            // InternalMyDsl.g:661:2: iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF
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
    // InternalMyDsl.g:667:1: ruleDimensionDeclaration returns [EObject current=null] : (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:673:2: ( (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:674:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:674:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:675:3: otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0());
            		
            // InternalMyDsl.g:679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:680:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalMyDsl.g:697:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:698:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:698:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:699:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:719:1: entryRuleGroupDeclaration returns [EObject current=null] : iv_ruleGroupDeclaration= ruleGroupDeclaration EOF ;
    public final EObject entryRuleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDeclaration = null;


        try {
            // InternalMyDsl.g:719:57: (iv_ruleGroupDeclaration= ruleGroupDeclaration EOF )
            // InternalMyDsl.g:720:2: iv_ruleGroupDeclaration= ruleGroupDeclaration EOF
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
    // InternalMyDsl.g:726:1: ruleGroupDeclaration returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:732:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:733:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:733:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:734:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:738:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:739:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:739:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:740:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalMyDsl.g:756:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:757:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:757:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:758:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:778:1: entryRuleMemberDeclaration returns [EObject current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final EObject entryRuleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDeclaration = null;


        try {
            // InternalMyDsl.g:778:58: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // InternalMyDsl.g:779:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
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
    // InternalMyDsl.g:785:1: ruleMemberDeclaration returns [EObject current=null] : (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:791:2: ( (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:792:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:792:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:793:3: otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0());
            		
            // InternalMyDsl.g:797:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:798:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:798:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:799:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalMyDsl.g:815:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:816:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:816:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:817:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:837:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalMyDsl.g:837:44: (iv_ruleRow= ruleRow EOF )
            // InternalMyDsl.g:838:2: iv_ruleRow= ruleRow EOF
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
    // InternalMyDsl.g:844:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:850:2: ( (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:851:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:851:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:852:3: otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalMyDsl.g:856:3: ()
            // InternalMyDsl.g:857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:867:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:868:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:868:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:869:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:886:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:887:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:891:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:892:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:892:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:893:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop8;
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
    // InternalMyDsl.g:919:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:919:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:920:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalMyDsl.g:926:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:932:2: ( (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:933:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:933:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:934:3: otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:938:3: ()
            // InternalMyDsl.g:939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:949:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:950:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:950:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:951:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:968:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:969:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:973:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:974:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:974:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:975:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop9;
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
    // InternalMyDsl.g:1001:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:1001:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:1002:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:1008:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1014:2: ( (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1015:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1015:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1016:3: otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:1020:3: ()
            // InternalMyDsl.g:1021:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1031:3: ( (lv_desc_3_0= ruleReference ) )
            // InternalMyDsl.g:1032:4: (lv_desc_3_0= ruleReference )
            {
            // InternalMyDsl.g:1032:4: (lv_desc_3_0= ruleReference )
            // InternalMyDsl.g:1033:5: lv_desc_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1054:3: ( (lv_lev_5_0= ruleReference ) )
            // InternalMyDsl.g:1055:4: (lv_lev_5_0= ruleReference )
            {
            // InternalMyDsl.g:1055:4: (lv_lev_5_0= ruleReference )
            // InternalMyDsl.g:1056:5: lv_lev_5_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getLevReferenceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1081:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalMyDsl.g:1081:46: (iv_ruleChild= ruleChild EOF )
            // InternalMyDsl.g:1082:2: iv_ruleChild= ruleChild EOF
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
    // InternalMyDsl.g:1088:1: ruleChild returns [EObject current=null] : (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1094:2: ( (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1095:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1095:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1096:3: otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChildAccess().getChildKeyword_0());
            		
            // InternalMyDsl.g:1100:3: ()
            // InternalMyDsl.g:1101:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChildAccess().getChildAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1111:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:1112:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:1112:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:1113:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:1130:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1131:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getChildAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1135:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:1136:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:1136:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:1137:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop10;
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
    // InternalMyDsl.g:1163:1: entryRuleReportParameter returns [EObject current=null] : iv_ruleReportParameter= ruleReportParameter EOF ;
    public final EObject entryRuleReportParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportParameter = null;


        try {
            // InternalMyDsl.g:1163:56: (iv_ruleReportParameter= ruleReportParameter EOF )
            // InternalMyDsl.g:1164:2: iv_ruleReportParameter= ruleReportParameter EOF
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
    // InternalMyDsl.g:1170:1: ruleReportParameter returns [EObject current=null] : (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) ;
    public final EObject ruleReportParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reparam_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1176:2: ( (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1177:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1177:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1178:3: otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReportParameterAccess().getReportParameterKeyword_0());
            		
            // InternalMyDsl.g:1182:3: ()
            // InternalMyDsl.g:1183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportParameterAccess().getReportParameterAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getReportParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1193:3: ( (lv_reparam_3_0= ruleStringReference ) )
            // InternalMyDsl.g:1194:4: (lv_reparam_3_0= ruleStringReference )
            {
            // InternalMyDsl.g:1194:4: (lv_reparam_3_0= ruleStringReference )
            // InternalMyDsl.g:1195:5: lv_reparam_3_0= ruleStringReference
            {

            					newCompositeNode(grammarAccess.getReportParameterAccess().getReparamStringReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1220:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMyDsl.g:1220:50: (iv_ruleReference= ruleReference EOF )
            // InternalMyDsl.g:1221:2: iv_ruleReference= ruleReference EOF
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
    // InternalMyDsl.g:1227:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StringReference_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1233:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) )
            // InternalMyDsl.g:1234:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            {
            // InternalMyDsl.g:1234:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1235:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1235:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:1236:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1236:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:1237:5: otherlv_0= RULE_ID
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
                    // InternalMyDsl.g:1249:3: this_StringReference_1= ruleStringReference
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
    // InternalMyDsl.g:1261:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalMyDsl.g:1261:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalMyDsl.g:1262:2: iv_ruleStringReference= ruleStringReference EOF
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
    // InternalMyDsl.g:1268:1: ruleStringReference returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1274:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1275:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1275:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1276:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1276:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1277:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000007FC04030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});

}