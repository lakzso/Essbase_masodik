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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'queryMDX'", "'{'", "'SELECT'", "'['", "'].'", "'On'", "'Rows'", "'Columns'", "'}'", "'queryReport'", "'reportToLatex'", "'('", "','", "')'", "'{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'", "'descendants'", "'dim'", "'group'", "'member'", "'row'", "'column'", "'link'", "'child'", "'reportParameter'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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

                if ( (LA2_0==22) ) {
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
    // InternalMyDsl.g:128:1: ruleQuery returns [EObject current=null] : (this_QueryReport_0= ruleQueryReport | this_QueryMDX_1= ruleQueryMDX ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject this_QueryReport_0 = null;

        EObject this_QueryMDX_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (this_QueryReport_0= ruleQueryReport | this_QueryMDX_1= ruleQueryMDX ) )
            // InternalMyDsl.g:135:2: (this_QueryReport_0= ruleQueryReport | this_QueryMDX_1= ruleQueryMDX )
            {
            // InternalMyDsl.g:135:2: (this_QueryReport_0= ruleQueryReport | this_QueryMDX_1= ruleQueryMDX )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==21) ) {
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
                    // InternalMyDsl.g:145:3: this_QueryMDX_1= ruleQueryMDX
                    {

                    			newCompositeNode(grammarAccess.getQueryAccess().getQueryMDXParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryMDX_1=ruleQueryMDX();

                    state._fsp--;


                    			current = this_QueryMDX_1;
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


    // $ANTLR start "entryRuledatabase"
    // InternalMyDsl.g:157:1: entryRuledatabase returns [EObject current=null] : iv_ruledatabase= ruledatabase EOF ;
    public final EObject entryRuledatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledatabase = null;


        try {
            // InternalMyDsl.g:157:49: (iv_ruledatabase= ruledatabase EOF )
            // InternalMyDsl.g:158:2: iv_ruledatabase= ruledatabase EOF
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
    // InternalMyDsl.g:164:1: ruledatabase returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruledatabase() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:170:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:171:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:171:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:172:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:172:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:173:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleMDXFunction"
    // InternalMyDsl.g:192:1: entryRuleMDXFunction returns [EObject current=null] : iv_ruleMDXFunction= ruleMDXFunction EOF ;
    public final EObject entryRuleMDXFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDXFunction = null;


        try {
            // InternalMyDsl.g:192:52: (iv_ruleMDXFunction= ruleMDXFunction EOF )
            // InternalMyDsl.g:193:2: iv_ruleMDXFunction= ruleMDXFunction EOF
            {
             newCompositeNode(grammarAccess.getMDXFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDXFunction=ruleMDXFunction();

            state._fsp--;

             current =iv_ruleMDXFunction; 
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
    // $ANTLR end "entryRuleMDXFunction"


    // $ANTLR start "ruleMDXFunction"
    // InternalMyDsl.g:199:1: ruleMDXFunction returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleMDXFunction() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:206:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:206:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:207:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:207:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:208:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMDXFunctionAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMDXFunctionRule());
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
    // $ANTLR end "ruleMDXFunction"


    // $ANTLR start "entryRuleQueryMDX"
    // InternalMyDsl.g:227:1: entryRuleQueryMDX returns [EObject current=null] : iv_ruleQueryMDX= ruleQueryMDX EOF ;
    public final EObject entryRuleQueryMDX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryMDX = null;


        try {
            // InternalMyDsl.g:227:49: (iv_ruleQueryMDX= ruleQueryMDX EOF )
            // InternalMyDsl.g:228:2: iv_ruleQueryMDX= ruleQueryMDX EOF
            {
             newCompositeNode(grammarAccess.getQueryMDXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryMDX=ruleQueryMDX();

            state._fsp--;

             current =iv_ruleQueryMDX; 
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
    // $ANTLR end "entryRuleQueryMDX"


    // $ANTLR start "ruleQueryMDX"
    // InternalMyDsl.g:234:1: ruleQueryMDX returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' otherlv_4= 'SELECT' otherlv_5= '[' ( (lv_r_6_0= ruleMDXRows ) ) otherlv_7= '].' ( (lv_fr_8_0= ruleMDXFunction ) ) otherlv_9= 'On' otherlv_10= 'Rows' otherlv_11= '[' ( (lv_c_12_0= ruleMDXCOlumns ) ) otherlv_13= '].' ( (lv_fc_14_0= ruleMDXFunction ) ) otherlv_15= 'On' otherlv_16= 'Columns' otherlv_17= '}' ) ;
    public final EObject ruleQueryMDX() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_r_6_0 = null;

        EObject lv_fr_8_0 = null;

        EObject lv_c_12_0 = null;

        EObject lv_fc_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' otherlv_4= 'SELECT' otherlv_5= '[' ( (lv_r_6_0= ruleMDXRows ) ) otherlv_7= '].' ( (lv_fr_8_0= ruleMDXFunction ) ) otherlv_9= 'On' otherlv_10= 'Rows' otherlv_11= '[' ( (lv_c_12_0= ruleMDXCOlumns ) ) otherlv_13= '].' ( (lv_fc_14_0= ruleMDXFunction ) ) otherlv_15= 'On' otherlv_16= 'Columns' otherlv_17= '}' ) )
            // InternalMyDsl.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' otherlv_4= 'SELECT' otherlv_5= '[' ( (lv_r_6_0= ruleMDXRows ) ) otherlv_7= '].' ( (lv_fr_8_0= ruleMDXFunction ) ) otherlv_9= 'On' otherlv_10= 'Rows' otherlv_11= '[' ( (lv_c_12_0= ruleMDXCOlumns ) ) otherlv_13= '].' ( (lv_fc_14_0= ruleMDXFunction ) ) otherlv_15= 'On' otherlv_16= 'Columns' otherlv_17= '}' )
            {
            // InternalMyDsl.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' otherlv_4= 'SELECT' otherlv_5= '[' ( (lv_r_6_0= ruleMDXRows ) ) otherlv_7= '].' ( (lv_fr_8_0= ruleMDXFunction ) ) otherlv_9= 'On' otherlv_10= 'Rows' otherlv_11= '[' ( (lv_c_12_0= ruleMDXCOlumns ) ) otherlv_13= '].' ( (lv_fc_14_0= ruleMDXFunction ) ) otherlv_15= 'On' otherlv_16= 'Columns' otherlv_17= '}' )
            // InternalMyDsl.g:242:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryMDX' otherlv_3= '{' otherlv_4= 'SELECT' otherlv_5= '[' ( (lv_r_6_0= ruleMDXRows ) ) otherlv_7= '].' ( (lv_fr_8_0= ruleMDXFunction ) ) otherlv_9= 'On' otherlv_10= 'Rows' otherlv_11= '[' ( (lv_c_12_0= ruleMDXCOlumns ) ) otherlv_13= '].' ( (lv_fc_14_0= ruleMDXFunction ) ) otherlv_15= 'On' otherlv_16= 'Columns' otherlv_17= '}'
            {
            // InternalMyDsl.g:242:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:243:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:243:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:244:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryMDXAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryMDXRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryMDXAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryMDXAccess().getQueryMDXKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryMDXAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryMDXAccess().getSELECTKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getQueryMDXAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMyDsl.g:280:3: ( (lv_r_6_0= ruleMDXRows ) )
            // InternalMyDsl.g:281:4: (lv_r_6_0= ruleMDXRows )
            {
            // InternalMyDsl.g:281:4: (lv_r_6_0= ruleMDXRows )
            // InternalMyDsl.g:282:5: lv_r_6_0= ruleMDXRows
            {

            					newCompositeNode(grammarAccess.getQueryMDXAccess().getRMDXRowsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_r_6_0=ruleMDXRows();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryMDXRule());
            					}
            					set(
            						current,
            						"r",
            						lv_r_6_0,
            						"org.xtext.example.mydsl.MyDsl.MDXRows");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryMDXAccess().getRightSquareBracketFullStopKeyword_7());
            		
            // InternalMyDsl.g:303:3: ( (lv_fr_8_0= ruleMDXFunction ) )
            // InternalMyDsl.g:304:4: (lv_fr_8_0= ruleMDXFunction )
            {
            // InternalMyDsl.g:304:4: (lv_fr_8_0= ruleMDXFunction )
            // InternalMyDsl.g:305:5: lv_fr_8_0= ruleMDXFunction
            {

            					newCompositeNode(grammarAccess.getQueryMDXAccess().getFrMDXFunctionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_fr_8_0=ruleMDXFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryMDXRule());
            					}
            					set(
            						current,
            						"fr",
            						lv_fr_8_0,
            						"org.xtext.example.mydsl.MyDsl.MDXFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getQueryMDXAccess().getOnKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getQueryMDXAccess().getRowsKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getQueryMDXAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalMyDsl.g:334:3: ( (lv_c_12_0= ruleMDXCOlumns ) )
            // InternalMyDsl.g:335:4: (lv_c_12_0= ruleMDXCOlumns )
            {
            // InternalMyDsl.g:335:4: (lv_c_12_0= ruleMDXCOlumns )
            // InternalMyDsl.g:336:5: lv_c_12_0= ruleMDXCOlumns
            {

            					newCompositeNode(grammarAccess.getQueryMDXAccess().getCMDXCOlumnsParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_c_12_0=ruleMDXCOlumns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryMDXRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_12_0,
            						"org.xtext.example.mydsl.MyDsl.MDXCOlumns");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getQueryMDXAccess().getRightSquareBracketFullStopKeyword_13());
            		
            // InternalMyDsl.g:357:3: ( (lv_fc_14_0= ruleMDXFunction ) )
            // InternalMyDsl.g:358:4: (lv_fc_14_0= ruleMDXFunction )
            {
            // InternalMyDsl.g:358:4: (lv_fc_14_0= ruleMDXFunction )
            // InternalMyDsl.g:359:5: lv_fc_14_0= ruleMDXFunction
            {

            					newCompositeNode(grammarAccess.getQueryMDXAccess().getFcMDXFunctionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_12);
            lv_fc_14_0=ruleMDXFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryMDXRule());
            					}
            					set(
            						current,
            						"fc",
            						lv_fc_14_0,
            						"org.xtext.example.mydsl.MyDsl.MDXFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getQueryMDXAccess().getOnKeyword_15());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getQueryMDXAccess().getColumnsKeyword_16());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getQueryMDXAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleQueryMDX"


    // $ANTLR start "entryRuleMDXRows"
    // InternalMyDsl.g:392:1: entryRuleMDXRows returns [EObject current=null] : iv_ruleMDXRows= ruleMDXRows EOF ;
    public final EObject entryRuleMDXRows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDXRows = null;


        try {
            // InternalMyDsl.g:392:48: (iv_ruleMDXRows= ruleMDXRows EOF )
            // InternalMyDsl.g:393:2: iv_ruleMDXRows= ruleMDXRows EOF
            {
             newCompositeNode(grammarAccess.getMDXRowsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDXRows=ruleMDXRows();

            state._fsp--;

             current =iv_ruleMDXRows; 
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
    // $ANTLR end "entryRuleMDXRows"


    // $ANTLR start "ruleMDXRows"
    // InternalMyDsl.g:399:1: ruleMDXRows returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleMDXRows() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:405:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:406:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:406:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:407:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:407:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:408:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMDXRowsAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMDXRowsRule());
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
    // $ANTLR end "ruleMDXRows"


    // $ANTLR start "entryRuleMDXCOlumns"
    // InternalMyDsl.g:427:1: entryRuleMDXCOlumns returns [EObject current=null] : iv_ruleMDXCOlumns= ruleMDXCOlumns EOF ;
    public final EObject entryRuleMDXCOlumns() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMDXCOlumns = null;


        try {
            // InternalMyDsl.g:427:51: (iv_ruleMDXCOlumns= ruleMDXCOlumns EOF )
            // InternalMyDsl.g:428:2: iv_ruleMDXCOlumns= ruleMDXCOlumns EOF
            {
             newCompositeNode(grammarAccess.getMDXCOlumnsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMDXCOlumns=ruleMDXCOlumns();

            state._fsp--;

             current =iv_ruleMDXCOlumns; 
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
    // $ANTLR end "entryRuleMDXCOlumns"


    // $ANTLR start "ruleMDXCOlumns"
    // InternalMyDsl.g:434:1: ruleMDXCOlumns returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleMDXCOlumns() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:440:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:441:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:441:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:442:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:442:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:443:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMDXCOlumnsAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMDXCOlumnsRule());
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
    // $ANTLR end "ruleMDXCOlumns"


    // $ANTLR start "entryRuleQueryReport"
    // InternalMyDsl.g:462:1: entryRuleQueryReport returns [EObject current=null] : iv_ruleQueryReport= ruleQueryReport EOF ;
    public final EObject entryRuleQueryReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryReport = null;


        try {
            // InternalMyDsl.g:462:52: (iv_ruleQueryReport= ruleQueryReport EOF )
            // InternalMyDsl.g:463:2: iv_ruleQueryReport= ruleQueryReport EOF
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
    // InternalMyDsl.g:469:1: ruleQueryReport returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:475:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:476:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}' )
            // InternalMyDsl.g:477:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= 'queryReport' otherlv_3= '{' ruleInitialStatement ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )* otherlv_6= '}'
            {
            // InternalMyDsl.g:477:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:478:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:478:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:479:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryReportAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryReportAccess().getQueryReportKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryReportAccess().getLeftCurlyBracketKeyword_3());
            		

            			newCompositeNode(grammarAccess.getQueryReportAccess().getInitialStatementParserRuleCall_4());
            		
            pushFollow(FOLLOW_18);
            ruleInitialStatement();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:514:3: ( (lv_QueryReport_5_0= ruleReportQueryParameters ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||(LA4_0>=27 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:515:4: (lv_QueryReport_5_0= ruleReportQueryParameters )
            	    {
            	    // InternalMyDsl.g:515:4: (lv_QueryReport_5_0= ruleReportQueryParameters )
            	    // InternalMyDsl.g:516:5: lv_QueryReport_5_0= ruleReportQueryParameters
            	    {

            	    					newCompositeNode(grammarAccess.getQueryReportAccess().getQueryReportReportQueryParametersParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:541:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // InternalMyDsl.g:541:47: (iv_ruleReport= ruleReport EOF )
            // InternalMyDsl.g:542:2: iv_ruleReport= ruleReport EOF
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
    // InternalMyDsl.g:548:1: ruleReport returns [EObject current=null] : (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' ) ;
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
            // InternalMyDsl.g:554:2: ( (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:555:2: (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:555:2: (otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')' )
            // InternalMyDsl.g:556:3: otherlv_0= 'reportToLatex' otherlv_1= '(' () ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_from_5_0= ruledatabase ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getReportToLatexKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReportAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:564:3: ()
            // InternalMyDsl.g:565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportAccess().getReportAction_2(),
            					current);
            			

            }

            // InternalMyDsl.g:571:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:572:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:572:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:573:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_3, grammarAccess.getReportAccess().getRepoutQueryCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getReportAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:588:3: ( (lv_from_5_0= ruledatabase ) )
            // InternalMyDsl.g:589:4: (lv_from_5_0= ruledatabase )
            {
            // InternalMyDsl.g:589:4: (lv_from_5_0= ruledatabase )
            // InternalMyDsl.g:590:5: lv_from_5_0= ruledatabase
            {

            					newCompositeNode(grammarAccess.getReportAccess().getFromDatabaseParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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


    // $ANTLR start "entryRuleReportQueryParameters"
    // InternalMyDsl.g:615:1: entryRuleReportQueryParameters returns [EObject current=null] : iv_ruleReportQueryParameters= ruleReportQueryParameters EOF ;
    public final EObject entryRuleReportQueryParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportQueryParameters = null;


        try {
            // InternalMyDsl.g:615:62: (iv_ruleReportQueryParameters= ruleReportQueryParameters EOF )
            // InternalMyDsl.g:616:2: iv_ruleReportQueryParameters= ruleReportQueryParameters EOF
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
    // InternalMyDsl.g:622:1: ruleReportQueryParameters returns [EObject current=null] : (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) ;
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
            // InternalMyDsl.g:628:2: ( (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter ) )
            // InternalMyDsl.g:629:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            {
            // InternalMyDsl.g:629:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow | this_Descendants_2= ruleDescendants | this_Declaration_3= ruleDeclaration | this_Reference_4= ruleReference | this_Child_5= ruleChild | this_Link_6= ruleLink | this_ReportParameter_7= ruleReportParameter )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt5=4;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            case 33:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:630:3: this_Column_0= ruleColumn
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
                    // InternalMyDsl.g:639:3: this_Row_1= ruleRow
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
                    // InternalMyDsl.g:648:3: this_Descendants_2= ruleDescendants
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
                    // InternalMyDsl.g:657:3: this_Declaration_3= ruleDeclaration
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
                    // InternalMyDsl.g:666:3: this_Reference_4= ruleReference
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
                    // InternalMyDsl.g:675:3: this_Child_5= ruleChild
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
                    // InternalMyDsl.g:684:3: this_Link_6= ruleLink
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
                    // InternalMyDsl.g:693:3: this_ReportParameter_7= ruleReportParameter
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
    // InternalMyDsl.g:705:1: entryRuleInitialStatement returns [String current=null] : iv_ruleInitialStatement= ruleInitialStatement EOF ;
    public final String entryRuleInitialStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitialStatement = null;


        try {
            // InternalMyDsl.g:705:56: (iv_ruleInitialStatement= ruleInitialStatement EOF )
            // InternalMyDsl.g:706:2: iv_ruleInitialStatement= ruleInitialStatement EOF
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
    // InternalMyDsl.g:712:1: ruleInitialStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ;
    public final AntlrDatatypeRuleToken ruleInitialStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:718:2: (kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            // InternalMyDsl.g:719:2: kw= '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:727:1: entryRuleDescendants returns [EObject current=null] : iv_ruleDescendants= ruleDescendants EOF ;
    public final EObject entryRuleDescendants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendants = null;


        try {
            // InternalMyDsl.g:727:52: (iv_ruleDescendants= ruleDescendants EOF )
            // InternalMyDsl.g:728:2: iv_ruleDescendants= ruleDescendants EOF
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
    // InternalMyDsl.g:734:1: ruleDescendants returns [EObject current=null] : (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) ;
    public final EObject ruleDescendants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_group_1_0=null;
        Token otherlv_2=null;
        EObject lv_dimension_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:740:2: ( (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) ) )
            // InternalMyDsl.g:741:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            {
            // InternalMyDsl.g:741:2: (otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) ) )
            // InternalMyDsl.g:742:3: otherlv_0= 'descendants' ( (lv_group_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_dimension_3_0= ruleReference ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendantsAccess().getDescendantsKeyword_0());
            		
            // InternalMyDsl.g:746:3: ( (lv_group_1_0= RULE_ID ) )
            // InternalMyDsl.g:747:4: (lv_group_1_0= RULE_ID )
            {
            // InternalMyDsl.g:747:4: (lv_group_1_0= RULE_ID )
            // InternalMyDsl.g:748:5: lv_group_1_0= RULE_ID
            {
            lv_group_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendantsAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:768:3: ( (lv_dimension_3_0= ruleReference ) )
            // InternalMyDsl.g:769:4: (lv_dimension_3_0= ruleReference )
            {
            // InternalMyDsl.g:769:4: (lv_dimension_3_0= ruleReference )
            // InternalMyDsl.g:770:5: lv_dimension_3_0= ruleReference
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
    // InternalMyDsl.g:791:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:791:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:792:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:798:1: ruleDeclaration returns [EObject current=null] : (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_DimensionDeclaration_0 = null;

        EObject this_GroupDeclaration_1 = null;

        EObject this_MemberDeclaration_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:804:2: ( (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration ) )
            // InternalMyDsl.g:805:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            {
            // InternalMyDsl.g:805:2: (this_DimensionDeclaration_0= ruleDimensionDeclaration | this_GroupDeclaration_1= ruleGroupDeclaration | this_MemberDeclaration_2= ruleMemberDeclaration )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:806:3: this_DimensionDeclaration_0= ruleDimensionDeclaration
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
                    // InternalMyDsl.g:815:3: this_GroupDeclaration_1= ruleGroupDeclaration
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
                    // InternalMyDsl.g:824:3: this_MemberDeclaration_2= ruleMemberDeclaration
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
    // InternalMyDsl.g:836:1: entryRuleDimensionDeclaration returns [EObject current=null] : iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF ;
    public final EObject entryRuleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionDeclaration = null;


        try {
            // InternalMyDsl.g:836:61: (iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF )
            // InternalMyDsl.g:837:2: iv_ruleDimensionDeclaration= ruleDimensionDeclaration EOF
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
    // InternalMyDsl.g:843:1: ruleDimensionDeclaration returns [EObject current=null] : (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDimensionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyDsl.g:850:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyDsl.g:850:2: (otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalMyDsl.g:851:3: otherlv_0= 'dim' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0());
            		
            // InternalMyDsl.g:855:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:856:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:856:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:857:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalMyDsl.g:873:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:874:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:874:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:875:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionDeclarationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDimensionDeclarationAccess().getValueDimensionCrossReference_2_0());
            				

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
    // InternalMyDsl.g:890:1: entryRuleGroupDeclaration returns [EObject current=null] : iv_ruleGroupDeclaration= ruleGroupDeclaration EOF ;
    public final EObject entryRuleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDeclaration = null;


        try {
            // InternalMyDsl.g:890:57: (iv_ruleGroupDeclaration= ruleGroupDeclaration EOF )
            // InternalMyDsl.g:891:2: iv_ruleGroupDeclaration= ruleGroupDeclaration EOF
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
    // InternalMyDsl.g:897:1: ruleGroupDeclaration returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGroupDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:903:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:904:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:904:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:905:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:909:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:910:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:910:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:911:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalMyDsl.g:927:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:928:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:928:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:929:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:949:1: entryRuleMemberDeclaration returns [EObject current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final EObject entryRuleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberDeclaration = null;


        try {
            // InternalMyDsl.g:949:58: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // InternalMyDsl.g:950:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
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
    // InternalMyDsl.g:956:1: ruleMemberDeclaration returns [EObject current=null] : (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMemberDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:962:2: ( (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:963:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:963:2: (otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:964:3: otherlv_0= 'member' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0());
            		
            // InternalMyDsl.g:968:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:969:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:969:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:970:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalMyDsl.g:986:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:987:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:987:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:988:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:1008:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalMyDsl.g:1008:44: (iv_ruleRow= ruleRow EOF )
            // InternalMyDsl.g:1009:2: iv_ruleRow= ruleRow EOF
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
    // InternalMyDsl.g:1015:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1021:2: ( (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1022:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1022:2: (otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1023:3: otherlv_0= 'row' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalMyDsl.g:1027:3: ()
            // InternalMyDsl.g:1028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1038:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:1039:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:1039:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:1040:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1057:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1058:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1062:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:1063:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:1063:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:1064:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop7;
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
    // InternalMyDsl.g:1090:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:1090:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:1091:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalMyDsl.g:1097:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1103:2: ( (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1104:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1104:2: (otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1105:3: otherlv_0= 'column' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:1109:3: ()
            // InternalMyDsl.g:1110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1120:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:1121:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:1121:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:1122:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1139:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1140:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1144:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:1145:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:1145:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:1146:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop8;
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
    // InternalMyDsl.g:1172:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:1172:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:1173:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:1179:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1185:2: ( (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1186:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1186:2: (otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1187:3: otherlv_0= 'link' () otherlv_2= '{' ( (lv_desc_3_0= ruleReference ) ) otherlv_4= ',' ( (lv_lev_5_0= ruleReference ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:1191:3: ()
            // InternalMyDsl.g:1192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1202:3: ( (lv_desc_3_0= ruleReference ) )
            // InternalMyDsl.g:1203:4: (lv_desc_3_0= ruleReference )
            {
            // InternalMyDsl.g:1203:4: (lv_desc_3_0= ruleReference )
            // InternalMyDsl.g:1204:5: lv_desc_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1225:3: ( (lv_lev_5_0= ruleReference ) )
            // InternalMyDsl.g:1226:4: (lv_lev_5_0= ruleReference )
            {
            // InternalMyDsl.g:1226:4: (lv_lev_5_0= ruleReference )
            // InternalMyDsl.g:1227:5: lv_lev_5_0= ruleReference
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
    // InternalMyDsl.g:1252:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalMyDsl.g:1252:46: (iv_ruleChild= ruleChild EOF )
            // InternalMyDsl.g:1253:2: iv_ruleChild= ruleChild EOF
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
    // InternalMyDsl.g:1259:1: ruleChild returns [EObject current=null] : (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1265:2: ( (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1266:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1266:2: (otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1267:3: otherlv_0= 'child' () otherlv_2= '{' ( (lv_dimensions_3_0= ruleReference ) ) (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChildAccess().getChildKeyword_0());
            		
            // InternalMyDsl.g:1271:3: ()
            // InternalMyDsl.g:1272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChildAccess().getChildAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1282:3: ( (lv_dimensions_3_0= ruleReference ) )
            // InternalMyDsl.g:1283:4: (lv_dimensions_3_0= ruleReference )
            {
            // InternalMyDsl.g:1283:4: (lv_dimensions_3_0= ruleReference )
            // InternalMyDsl.g:1284:5: lv_dimensions_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1301:3: (otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1302:4: otherlv_4= ',' ( (lv_dimensions_5_0= ruleReference ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getChildAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1306:4: ( (lv_dimensions_5_0= ruleReference ) )
            	    // InternalMyDsl.g:1307:5: (lv_dimensions_5_0= ruleReference )
            	    {
            	    // InternalMyDsl.g:1307:5: (lv_dimensions_5_0= ruleReference )
            	    // InternalMyDsl.g:1308:6: lv_dimensions_5_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop9;
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


    // $ANTLR start "entryRuleReportParameter"
    // InternalMyDsl.g:1334:1: entryRuleReportParameter returns [EObject current=null] : iv_ruleReportParameter= ruleReportParameter EOF ;
    public final EObject entryRuleReportParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReportParameter = null;


        try {
            // InternalMyDsl.g:1334:56: (iv_ruleReportParameter= ruleReportParameter EOF )
            // InternalMyDsl.g:1335:2: iv_ruleReportParameter= ruleReportParameter EOF
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
    // InternalMyDsl.g:1341:1: ruleReportParameter returns [EObject current=null] : (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) ;
    public final EObject ruleReportParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reparam_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1347:2: ( (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1348:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1348:2: (otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1349:3: otherlv_0= 'reportParameter' () otherlv_2= '{' ( (lv_reparam_3_0= ruleStringReference ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReportParameterAccess().getReportParameterKeyword_0());
            		
            // InternalMyDsl.g:1353:3: ()
            // InternalMyDsl.g:1354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReportParameterAccess().getReportParameterAction_1(),
            					current);
            			

            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getReportParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1364:3: ( (lv_reparam_3_0= ruleStringReference ) )
            // InternalMyDsl.g:1365:4: (lv_reparam_3_0= ruleStringReference )
            {
            // InternalMyDsl.g:1365:4: (lv_reparam_3_0= ruleStringReference )
            // InternalMyDsl.g:1366:5: lv_reparam_3_0= ruleStringReference
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:1391:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalMyDsl.g:1391:50: (iv_ruleReference= ruleReference EOF )
            // InternalMyDsl.g:1392:2: iv_ruleReference= ruleReference EOF
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
    // InternalMyDsl.g:1398:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StringReference_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1404:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference ) )
            // InternalMyDsl.g:1405:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            {
            // InternalMyDsl.g:1405:2: ( ( (otherlv_0= RULE_ID ) ) | this_StringReference_1= ruleStringReference )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1406:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1406:3: ( (otherlv_0= RULE_ID ) )
                    // InternalMyDsl.g:1407:4: (otherlv_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1407:4: (otherlv_0= RULE_ID )
                    // InternalMyDsl.g:1408:5: otherlv_0= RULE_ID
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
                    // InternalMyDsl.g:1420:3: this_StringReference_1= ruleStringReference
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
    // InternalMyDsl.g:1432:1: entryRuleStringReference returns [EObject current=null] : iv_ruleStringReference= ruleStringReference EOF ;
    public final EObject entryRuleStringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringReference = null;


        try {
            // InternalMyDsl.g:1432:56: (iv_ruleStringReference= ruleStringReference EOF )
            // InternalMyDsl.g:1433:2: iv_ruleStringReference= ruleStringReference EOF
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
    // InternalMyDsl.g:1439:1: ruleStringReference returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringReference() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1445:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1446:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1446:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1447:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1447:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:1448:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FF8100030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001100000L});

}