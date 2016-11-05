package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Teszt'", "'{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'", "'='", "'queryMDX'", "'{'", "'}'", "'queryReport'", "'reportToLatex'", "'('", "','", "')'", "'descendants'", "'dim'", "'group'", "'member'", "'row'", "'column'", "'link'", "'child'", "'reportParameter'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuery"
    // InternalMyDsl.g:78:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleQuery EOF )
            // InternalMyDsl.g:80:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalMyDsl.g:87:1: ruleQuery : ( ( rule__Query__Alternatives ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Query__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Query__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Query__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Query__Alternatives )
            {
             before(grammarAccess.getQueryAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Query__Alternatives )
            // InternalMyDsl.g:94:4: rule__Query__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Query__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMDXQuery"
    // InternalMyDsl.g:103:1: entryRuleMDXQuery : ruleMDXQuery EOF ;
    public final void entryRuleMDXQuery() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMDXQuery EOF )
            // InternalMyDsl.g:105:1: ruleMDXQuery EOF
            {
             before(grammarAccess.getMDXQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleMDXQuery();

            state._fsp--;

             after(grammarAccess.getMDXQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMDXQuery"


    // $ANTLR start "ruleMDXQuery"
    // InternalMyDsl.g:112:1: ruleMDXQuery : ( ( rule__MDXQuery__Group__0 ) ) ;
    public final void ruleMDXQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__MDXQuery__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__MDXQuery__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__MDXQuery__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__MDXQuery__Group__0 )
            {
             before(grammarAccess.getMDXQueryAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__MDXQuery__Group__0 )
            // InternalMyDsl.g:119:4: rule__MDXQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMDXQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMDXQuery"


    // $ANTLR start "entryRuleQueryReport"
    // InternalMyDsl.g:128:1: entryRuleQueryReport : ruleQueryReport EOF ;
    public final void entryRuleQueryReport() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleQueryReport EOF )
            // InternalMyDsl.g:130:1: ruleQueryReport EOF
            {
             before(grammarAccess.getQueryReportRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryReport();

            state._fsp--;

             after(grammarAccess.getQueryReportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryReport"


    // $ANTLR start "ruleQueryReport"
    // InternalMyDsl.g:137:1: ruleQueryReport : ( ( rule__QueryReport__Group__0 ) ) ;
    public final void ruleQueryReport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__QueryReport__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__QueryReport__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__QueryReport__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__QueryReport__Group__0 )
            {
             before(grammarAccess.getQueryReportAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__QueryReport__Group__0 )
            // InternalMyDsl.g:144:4: rule__QueryReport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryReportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryReport"


    // $ANTLR start "entryRuleReport"
    // InternalMyDsl.g:153:1: entryRuleReport : ruleReport EOF ;
    public final void entryRuleReport() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleReport EOF )
            // InternalMyDsl.g:155:1: ruleReport EOF
            {
             before(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_1);
            ruleReport();

            state._fsp--;

             after(grammarAccess.getReportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // InternalMyDsl.g:162:1: ruleReport : ( ( rule__Report__Group__0 ) ) ;
    public final void ruleReport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Report__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Report__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Report__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Report__Group__0 )
            {
             before(grammarAccess.getReportAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Report__Group__0 )
            // InternalMyDsl.g:169:4: rule__Report__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Report__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuledatabase"
    // InternalMyDsl.g:178:1: entryRuledatabase : ruledatabase EOF ;
    public final void entryRuledatabase() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruledatabase EOF )
            // InternalMyDsl.g:180:1: ruledatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruledatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledatabase"


    // $ANTLR start "ruledatabase"
    // InternalMyDsl.g:187:1: ruledatabase : ( ( rule__Database__ValueAssignment ) ) ;
    public final void ruledatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Database__ValueAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Database__ValueAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Database__ValueAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__Database__ValueAssignment )
            {
             before(grammarAccess.getDatabaseAccess().getValueAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__Database__ValueAssignment )
            // InternalMyDsl.g:194:4: rule__Database__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Database__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledatabase"


    // $ANTLR start "entryRuleReportQueryParameters"
    // InternalMyDsl.g:203:1: entryRuleReportQueryParameters : ruleReportQueryParameters EOF ;
    public final void entryRuleReportQueryParameters() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleReportQueryParameters EOF )
            // InternalMyDsl.g:205:1: ruleReportQueryParameters EOF
            {
             before(grammarAccess.getReportQueryParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleReportQueryParameters();

            state._fsp--;

             after(grammarAccess.getReportQueryParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReportQueryParameters"


    // $ANTLR start "ruleReportQueryParameters"
    // InternalMyDsl.g:212:1: ruleReportQueryParameters : ( ( rule__ReportQueryParameters__Alternatives ) ) ;
    public final void ruleReportQueryParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ReportQueryParameters__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ReportQueryParameters__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ReportQueryParameters__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__ReportQueryParameters__Alternatives )
            {
             before(grammarAccess.getReportQueryParametersAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__ReportQueryParameters__Alternatives )
            // InternalMyDsl.g:219:4: rule__ReportQueryParameters__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReportQueryParameters__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReportQueryParametersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReportQueryParameters"


    // $ANTLR start "entryRuleMDXQueryParameters"
    // InternalMyDsl.g:228:1: entryRuleMDXQueryParameters : ruleMDXQueryParameters EOF ;
    public final void entryRuleMDXQueryParameters() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMDXQueryParameters EOF )
            // InternalMyDsl.g:230:1: ruleMDXQueryParameters EOF
            {
             before(grammarAccess.getMDXQueryParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleMDXQueryParameters();

            state._fsp--;

             after(grammarAccess.getMDXQueryParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMDXQueryParameters"


    // $ANTLR start "ruleMDXQueryParameters"
    // InternalMyDsl.g:237:1: ruleMDXQueryParameters : ( 'Teszt' ) ;
    public final void ruleMDXQueryParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( 'Teszt' ) )
            // InternalMyDsl.g:242:2: ( 'Teszt' )
            {
            // InternalMyDsl.g:242:2: ( 'Teszt' )
            // InternalMyDsl.g:243:3: 'Teszt'
            {
             before(grammarAccess.getMDXQueryParametersAccess().getTesztKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMDXQueryParametersAccess().getTesztKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMDXQueryParameters"


    // $ANTLR start "entryRuleInitialStatement"
    // InternalMyDsl.g:253:1: entryRuleInitialStatement : ruleInitialStatement EOF ;
    public final void entryRuleInitialStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleInitialStatement EOF )
            // InternalMyDsl.g:255:1: ruleInitialStatement EOF
            {
             before(grammarAccess.getInitialStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialStatement();

            state._fsp--;

             after(grammarAccess.getInitialStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialStatement"


    // $ANTLR start "ruleInitialStatement"
    // InternalMyDsl.g:262:1: ruleInitialStatement : ( '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ) ;
    public final void ruleInitialStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' ) )
            // InternalMyDsl.g:267:2: ( '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            {
            // InternalMyDsl.g:267:2: ( '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}' )
            // InternalMyDsl.g:268:3: '{SUPEMPTYROWS}\\r\\n{DECIMAL 10}\\r\\n{TABDELIMIT}\\r\\n{ROWREPEAT}\\r\\n{SUPBRACKETS}\\r\\n{SUPCOMMAS}\\r\\n{NOINDENTGEN}'
            {
             before(grammarAccess.getInitialStatementAccess().getSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInitialStatementAccess().getSUPEMPTYROWSDECIMAL10TABDELIMITROWREPEATSUPBRACKETSSUPCOMMASNOINDENTGENKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialStatement"


    // $ANTLR start "entryRuleDescendants"
    // InternalMyDsl.g:278:1: entryRuleDescendants : ruleDescendants EOF ;
    public final void entryRuleDescendants() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleDescendants EOF )
            // InternalMyDsl.g:280:1: ruleDescendants EOF
            {
             before(grammarAccess.getDescendantsRule()); 
            pushFollow(FOLLOW_1);
            ruleDescendants();

            state._fsp--;

             after(grammarAccess.getDescendantsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescendants"


    // $ANTLR start "ruleDescendants"
    // InternalMyDsl.g:287:1: ruleDescendants : ( ( rule__Descendants__Group__0 ) ) ;
    public final void ruleDescendants() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Descendants__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Descendants__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Descendants__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Descendants__Group__0 )
            {
             before(grammarAccess.getDescendantsAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Descendants__Group__0 )
            // InternalMyDsl.g:294:4: rule__Descendants__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Descendants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescendantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescendants"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:303:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDeclaration EOF )
            // InternalMyDsl.g:305:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:312:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Declaration__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Declaration__Alternatives )
            // InternalMyDsl.g:319:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDimensionDeclaration"
    // InternalMyDsl.g:328:1: entryRuleDimensionDeclaration : ruleDimensionDeclaration EOF ;
    public final void entryRuleDimensionDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleDimensionDeclaration EOF )
            // InternalMyDsl.g:330:1: ruleDimensionDeclaration EOF
            {
             before(grammarAccess.getDimensionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensionDeclaration();

            state._fsp--;

             after(grammarAccess.getDimensionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimensionDeclaration"


    // $ANTLR start "ruleDimensionDeclaration"
    // InternalMyDsl.g:337:1: ruleDimensionDeclaration : ( ( rule__DimensionDeclaration__Group__0 ) ) ;
    public final void ruleDimensionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__DimensionDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__DimensionDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__DimensionDeclaration__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__DimensionDeclaration__Group__0 )
            {
             before(grammarAccess.getDimensionDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__DimensionDeclaration__Group__0 )
            // InternalMyDsl.g:344:4: rule__DimensionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensionDeclaration"


    // $ANTLR start "entryRuleGroupDeclaration"
    // InternalMyDsl.g:353:1: entryRuleGroupDeclaration : ruleGroupDeclaration EOF ;
    public final void entryRuleGroupDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleGroupDeclaration EOF )
            // InternalMyDsl.g:355:1: ruleGroupDeclaration EOF
            {
             before(grammarAccess.getGroupDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupDeclaration();

            state._fsp--;

             after(grammarAccess.getGroupDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupDeclaration"


    // $ANTLR start "ruleGroupDeclaration"
    // InternalMyDsl.g:362:1: ruleGroupDeclaration : ( ( rule__GroupDeclaration__Group__0 ) ) ;
    public final void ruleGroupDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__GroupDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__GroupDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__GroupDeclaration__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__GroupDeclaration__Group__0 )
            {
             before(grammarAccess.getGroupDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__GroupDeclaration__Group__0 )
            // InternalMyDsl.g:369:4: rule__GroupDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupDeclaration"


    // $ANTLR start "entryRuleMemberDeclaration"
    // InternalMyDsl.g:378:1: entryRuleMemberDeclaration : ruleMemberDeclaration EOF ;
    public final void entryRuleMemberDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMemberDeclaration EOF )
            // InternalMyDsl.g:380:1: ruleMemberDeclaration EOF
            {
             before(grammarAccess.getMemberDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberDeclaration();

            state._fsp--;

             after(grammarAccess.getMemberDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberDeclaration"


    // $ANTLR start "ruleMemberDeclaration"
    // InternalMyDsl.g:387:1: ruleMemberDeclaration : ( ( rule__MemberDeclaration__Group__0 ) ) ;
    public final void ruleMemberDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MemberDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MemberDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MemberDeclaration__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MemberDeclaration__Group__0 )
            {
             before(grammarAccess.getMemberDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MemberDeclaration__Group__0 )
            // InternalMyDsl.g:394:4: rule__MemberDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberDeclaration"


    // $ANTLR start "entryRuleRow"
    // InternalMyDsl.g:403:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleRow EOF )
            // InternalMyDsl.g:405:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalMyDsl.g:412:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Row__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Row__Group__0 )
            // InternalMyDsl.g:419:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:428:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleColumn EOF )
            // InternalMyDsl.g:430:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:437:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Column__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Column__Group__0 )
            // InternalMyDsl.g:444:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:453:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleLink EOF )
            // InternalMyDsl.g:455:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:462:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:469:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleChild"
    // InternalMyDsl.g:478:1: entryRuleChild : ruleChild EOF ;
    public final void entryRuleChild() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleChild EOF )
            // InternalMyDsl.g:480:1: ruleChild EOF
            {
             before(grammarAccess.getChildRule()); 
            pushFollow(FOLLOW_1);
            ruleChild();

            state._fsp--;

             after(grammarAccess.getChildRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalMyDsl.g:487:1: ruleChild : ( ( rule__Child__Group__0 ) ) ;
    public final void ruleChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Child__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Child__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Child__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Child__Group__0 )
            {
             before(grammarAccess.getChildAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Child__Group__0 )
            // InternalMyDsl.g:494:4: rule__Child__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Child__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleReportParameter"
    // InternalMyDsl.g:503:1: entryRuleReportParameter : ruleReportParameter EOF ;
    public final void entryRuleReportParameter() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleReportParameter EOF )
            // InternalMyDsl.g:505:1: ruleReportParameter EOF
            {
             before(grammarAccess.getReportParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleReportParameter();

            state._fsp--;

             after(grammarAccess.getReportParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReportParameter"


    // $ANTLR start "ruleReportParameter"
    // InternalMyDsl.g:512:1: ruleReportParameter : ( ( rule__ReportParameter__Group__0 ) ) ;
    public final void ruleReportParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ReportParameter__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ReportParameter__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ReportParameter__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ReportParameter__Group__0 )
            {
             before(grammarAccess.getReportParameterAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ReportParameter__Group__0 )
            // InternalMyDsl.g:519:4: rule__ReportParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReportParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReportParameter"


    // $ANTLR start "entryRuleReference"
    // InternalMyDsl.g:528:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleReference EOF )
            // InternalMyDsl.g:530:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalMyDsl.g:537:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Reference__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__Reference__Alternatives )
            // InternalMyDsl.g:544:4: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleStringReference"
    // InternalMyDsl.g:553:1: entryRuleStringReference : ruleStringReference EOF ;
    public final void entryRuleStringReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleStringReference EOF )
            // InternalMyDsl.g:555:1: ruleStringReference EOF
            {
             before(grammarAccess.getStringReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleStringReference();

            state._fsp--;

             after(grammarAccess.getStringReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringReference"


    // $ANTLR start "ruleStringReference"
    // InternalMyDsl.g:562:1: ruleStringReference : ( ( rule__StringReference__ValueAssignment ) ) ;
    public final void ruleStringReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__StringReference__ValueAssignment ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__StringReference__ValueAssignment ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__StringReference__ValueAssignment ) )
            // InternalMyDsl.g:568:3: ( rule__StringReference__ValueAssignment )
            {
             before(grammarAccess.getStringReferenceAccess().getValueAssignment()); 
            // InternalMyDsl.g:569:3: ( rule__StringReference__ValueAssignment )
            // InternalMyDsl.g:569:4: rule__StringReference__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringReference__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringReferenceAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringReference"


    // $ANTLR start "rule__Query__Alternatives"
    // InternalMyDsl.g:577:1: rule__Query__Alternatives : ( ( ruleQueryReport ) | ( ruleMDXQuery ) );
    public final void rule__Query__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ruleQueryReport ) | ( ruleMDXQuery ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==17) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==14) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:582:2: ( ruleQueryReport )
                    {
                    // InternalMyDsl.g:582:2: ( ruleQueryReport )
                    // InternalMyDsl.g:583:3: ruleQueryReport
                    {
                     before(grammarAccess.getQueryAccess().getQueryReportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryReport();

                    state._fsp--;

                     after(grammarAccess.getQueryAccess().getQueryReportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:588:2: ( ruleMDXQuery )
                    {
                    // InternalMyDsl.g:588:2: ( ruleMDXQuery )
                    // InternalMyDsl.g:589:3: ruleMDXQuery
                    {
                     before(grammarAccess.getQueryAccess().getMDXQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMDXQuery();

                    state._fsp--;

                     after(grammarAccess.getQueryAccess().getMDXQueryParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives"


    // $ANTLR start "rule__ReportQueryParameters__Alternatives"
    // InternalMyDsl.g:598:1: rule__ReportQueryParameters__Alternatives : ( ( ruleColumn ) | ( ruleRow ) | ( ruleDescendants ) | ( ruleDeclaration ) | ( ruleReference ) | ( ruleChild ) | ( ruleLink ) | ( ruleReportParameter ) );
    public final void rule__ReportQueryParameters__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( ruleColumn ) | ( ruleRow ) | ( ruleDescendants ) | ( ruleDeclaration ) | ( ruleReference ) | ( ruleChild ) | ( ruleLink ) | ( ruleReportParameter ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
            case 24:
            case 25:
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
            case 29:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 30:
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
                    // InternalMyDsl.g:603:2: ( ruleColumn )
                    {
                    // InternalMyDsl.g:603:2: ( ruleColumn )
                    // InternalMyDsl.g:604:3: ruleColumn
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:609:2: ( ruleRow )
                    {
                    // InternalMyDsl.g:609:2: ( ruleRow )
                    // InternalMyDsl.g:610:3: ruleRow
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getRowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRow();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getRowParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:615:2: ( ruleDescendants )
                    {
                    // InternalMyDsl.g:615:2: ( ruleDescendants )
                    // InternalMyDsl.g:616:3: ruleDescendants
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getDescendantsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDescendants();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getDescendantsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:621:2: ( ruleDeclaration )
                    {
                    // InternalMyDsl.g:621:2: ( ruleDeclaration )
                    // InternalMyDsl.g:622:3: ruleDeclaration
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaration();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:627:2: ( ruleReference )
                    {
                    // InternalMyDsl.g:627:2: ( ruleReference )
                    // InternalMyDsl.g:628:3: ruleReference
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getReferenceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:633:2: ( ruleChild )
                    {
                    // InternalMyDsl.g:633:2: ( ruleChild )
                    // InternalMyDsl.g:634:3: ruleChild
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getChildParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleChild();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getChildParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:639:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:639:2: ( ruleLink )
                    // InternalMyDsl.g:640:3: ruleLink
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getLinkParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getLinkParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:645:2: ( ruleReportParameter )
                    {
                    // InternalMyDsl.g:645:2: ( ruleReportParameter )
                    // InternalMyDsl.g:646:3: ruleReportParameter
                    {
                     before(grammarAccess.getReportQueryParametersAccess().getReportParameterParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleReportParameter();

                    state._fsp--;

                     after(grammarAccess.getReportQueryParametersAccess().getReportParameterParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportQueryParameters__Alternatives"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalMyDsl.g:655:1: rule__Declaration__Alternatives : ( ( ruleDimensionDeclaration ) | ( ruleGroupDeclaration ) | ( ruleMemberDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( ruleDimensionDeclaration ) | ( ruleGroupDeclaration ) | ( ruleMemberDeclaration ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
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
                    // InternalMyDsl.g:660:2: ( ruleDimensionDeclaration )
                    {
                    // InternalMyDsl.g:660:2: ( ruleDimensionDeclaration )
                    // InternalMyDsl.g:661:3: ruleDimensionDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getDimensionDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDimensionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDimensionDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:666:2: ( ruleGroupDeclaration )
                    {
                    // InternalMyDsl.g:666:2: ( ruleGroupDeclaration )
                    // InternalMyDsl.g:667:3: ruleGroupDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getGroupDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroupDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getGroupDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:672:2: ( ruleMemberDeclaration )
                    {
                    // InternalMyDsl.g:672:2: ( ruleMemberDeclaration )
                    // InternalMyDsl.g:673:3: ruleMemberDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getMemberDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMemberDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getMemberDeclarationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalMyDsl.g:682:1: rule__Reference__Alternatives : ( ( ( rule__Reference__ReferredAssignment_0 ) ) | ( ruleStringReference ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( ( rule__Reference__ReferredAssignment_0 ) ) | ( ruleStringReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:687:2: ( ( rule__Reference__ReferredAssignment_0 ) )
                    {
                    // InternalMyDsl.g:687:2: ( ( rule__Reference__ReferredAssignment_0 ) )
                    // InternalMyDsl.g:688:3: ( rule__Reference__ReferredAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getReferredAssignment_0()); 
                    // InternalMyDsl.g:689:3: ( rule__Reference__ReferredAssignment_0 )
                    // InternalMyDsl.g:689:4: rule__Reference__ReferredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__ReferredAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getReferredAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:693:2: ( ruleStringReference )
                    {
                    // InternalMyDsl.g:693:2: ( ruleStringReference )
                    // InternalMyDsl.g:694:3: ruleStringReference
                    {
                     before(grammarAccess.getReferenceAccess().getStringReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringReference();

                    state._fsp--;

                     after(grammarAccess.getReferenceAccess().getStringReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:703:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:708:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:715:1: rule__Model__Group__0__Impl : ( ( rule__Model__QueriesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ( rule__Model__QueriesAssignment_0 )* ) )
            // InternalMyDsl.g:720:1: ( ( rule__Model__QueriesAssignment_0 )* )
            {
            // InternalMyDsl.g:720:1: ( ( rule__Model__QueriesAssignment_0 )* )
            // InternalMyDsl.g:721:2: ( rule__Model__QueriesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getQueriesAssignment_0()); 
            // InternalMyDsl.g:722:2: ( rule__Model__QueriesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:722:3: rule__Model__QueriesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__QueriesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQueriesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:730:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:735:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:741:1: rule__Model__Group__1__Impl : ( ( rule__Model__ReportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( ( rule__Model__ReportsAssignment_1 )* ) )
            // InternalMyDsl.g:746:1: ( ( rule__Model__ReportsAssignment_1 )* )
            {
            // InternalMyDsl.g:746:1: ( ( rule__Model__ReportsAssignment_1 )* )
            // InternalMyDsl.g:747:2: ( rule__Model__ReportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getReportsAssignment_1()); 
            // InternalMyDsl.g:748:2: ( rule__Model__ReportsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:748:3: rule__Model__ReportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ReportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getReportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__MDXQuery__Group__0"
    // InternalMyDsl.g:757:1: rule__MDXQuery__Group__0 : rule__MDXQuery__Group__0__Impl rule__MDXQuery__Group__1 ;
    public final void rule__MDXQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__MDXQuery__Group__0__Impl rule__MDXQuery__Group__1 )
            // InternalMyDsl.g:762:2: rule__MDXQuery__Group__0__Impl rule__MDXQuery__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MDXQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__0"


    // $ANTLR start "rule__MDXQuery__Group__0__Impl"
    // InternalMyDsl.g:769:1: rule__MDXQuery__Group__0__Impl : ( ( rule__MDXQuery__NameAssignment_0 ) ) ;
    public final void rule__MDXQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( ( rule__MDXQuery__NameAssignment_0 ) ) )
            // InternalMyDsl.g:774:1: ( ( rule__MDXQuery__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:774:1: ( ( rule__MDXQuery__NameAssignment_0 ) )
            // InternalMyDsl.g:775:2: ( rule__MDXQuery__NameAssignment_0 )
            {
             before(grammarAccess.getMDXQueryAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:776:2: ( rule__MDXQuery__NameAssignment_0 )
            // InternalMyDsl.g:776:3: rule__MDXQuery__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MDXQuery__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMDXQueryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__0__Impl"


    // $ANTLR start "rule__MDXQuery__Group__1"
    // InternalMyDsl.g:784:1: rule__MDXQuery__Group__1 : rule__MDXQuery__Group__1__Impl rule__MDXQuery__Group__2 ;
    public final void rule__MDXQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__MDXQuery__Group__1__Impl rule__MDXQuery__Group__2 )
            // InternalMyDsl.g:789:2: rule__MDXQuery__Group__1__Impl rule__MDXQuery__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MDXQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__1"


    // $ANTLR start "rule__MDXQuery__Group__1__Impl"
    // InternalMyDsl.g:796:1: rule__MDXQuery__Group__1__Impl : ( '=' ) ;
    public final void rule__MDXQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( '=' ) )
            // InternalMyDsl.g:801:1: ( '=' )
            {
            // InternalMyDsl.g:801:1: ( '=' )
            // InternalMyDsl.g:802:2: '='
            {
             before(grammarAccess.getMDXQueryAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMDXQueryAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__1__Impl"


    // $ANTLR start "rule__MDXQuery__Group__2"
    // InternalMyDsl.g:811:1: rule__MDXQuery__Group__2 : rule__MDXQuery__Group__2__Impl rule__MDXQuery__Group__3 ;
    public final void rule__MDXQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__MDXQuery__Group__2__Impl rule__MDXQuery__Group__3 )
            // InternalMyDsl.g:816:2: rule__MDXQuery__Group__2__Impl rule__MDXQuery__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MDXQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__2"


    // $ANTLR start "rule__MDXQuery__Group__2__Impl"
    // InternalMyDsl.g:823:1: rule__MDXQuery__Group__2__Impl : ( 'queryMDX' ) ;
    public final void rule__MDXQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( 'queryMDX' ) )
            // InternalMyDsl.g:828:1: ( 'queryMDX' )
            {
            // InternalMyDsl.g:828:1: ( 'queryMDX' )
            // InternalMyDsl.g:829:2: 'queryMDX'
            {
             before(grammarAccess.getMDXQueryAccess().getQueryMDXKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMDXQueryAccess().getQueryMDXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__2__Impl"


    // $ANTLR start "rule__MDXQuery__Group__3"
    // InternalMyDsl.g:838:1: rule__MDXQuery__Group__3 : rule__MDXQuery__Group__3__Impl rule__MDXQuery__Group__4 ;
    public final void rule__MDXQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__MDXQuery__Group__3__Impl rule__MDXQuery__Group__4 )
            // InternalMyDsl.g:843:2: rule__MDXQuery__Group__3__Impl rule__MDXQuery__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MDXQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__3"


    // $ANTLR start "rule__MDXQuery__Group__3__Impl"
    // InternalMyDsl.g:850:1: rule__MDXQuery__Group__3__Impl : ( '{' ) ;
    public final void rule__MDXQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( '{' ) )
            // InternalMyDsl.g:855:1: ( '{' )
            {
            // InternalMyDsl.g:855:1: ( '{' )
            // InternalMyDsl.g:856:2: '{'
            {
             before(grammarAccess.getMDXQueryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMDXQueryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__3__Impl"


    // $ANTLR start "rule__MDXQuery__Group__4"
    // InternalMyDsl.g:865:1: rule__MDXQuery__Group__4 : rule__MDXQuery__Group__4__Impl rule__MDXQuery__Group__5 ;
    public final void rule__MDXQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__MDXQuery__Group__4__Impl rule__MDXQuery__Group__5 )
            // InternalMyDsl.g:870:2: rule__MDXQuery__Group__4__Impl rule__MDXQuery__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MDXQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__4"


    // $ANTLR start "rule__MDXQuery__Group__4__Impl"
    // InternalMyDsl.g:877:1: rule__MDXQuery__Group__4__Impl : ( ( rule__MDXQuery__QueryMDXAssignment_4 )* ) ;
    public final void rule__MDXQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__MDXQuery__QueryMDXAssignment_4 )* ) )
            // InternalMyDsl.g:882:1: ( ( rule__MDXQuery__QueryMDXAssignment_4 )* )
            {
            // InternalMyDsl.g:882:1: ( ( rule__MDXQuery__QueryMDXAssignment_4 )* )
            // InternalMyDsl.g:883:2: ( rule__MDXQuery__QueryMDXAssignment_4 )*
            {
             before(grammarAccess.getMDXQueryAccess().getQueryMDXAssignment_4()); 
            // InternalMyDsl.g:884:2: ( rule__MDXQuery__QueryMDXAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:884:3: rule__MDXQuery__QueryMDXAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MDXQuery__QueryMDXAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMDXQueryAccess().getQueryMDXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__4__Impl"


    // $ANTLR start "rule__MDXQuery__Group__5"
    // InternalMyDsl.g:892:1: rule__MDXQuery__Group__5 : rule__MDXQuery__Group__5__Impl ;
    public final void rule__MDXQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__MDXQuery__Group__5__Impl )
            // InternalMyDsl.g:897:2: rule__MDXQuery__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MDXQuery__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__5"


    // $ANTLR start "rule__MDXQuery__Group__5__Impl"
    // InternalMyDsl.g:903:1: rule__MDXQuery__Group__5__Impl : ( '}' ) ;
    public final void rule__MDXQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( '}' ) )
            // InternalMyDsl.g:908:1: ( '}' )
            {
            // InternalMyDsl.g:908:1: ( '}' )
            // InternalMyDsl.g:909:2: '}'
            {
             before(grammarAccess.getMDXQueryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMDXQueryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__Group__5__Impl"


    // $ANTLR start "rule__QueryReport__Group__0"
    // InternalMyDsl.g:919:1: rule__QueryReport__Group__0 : rule__QueryReport__Group__0__Impl rule__QueryReport__Group__1 ;
    public final void rule__QueryReport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__QueryReport__Group__0__Impl rule__QueryReport__Group__1 )
            // InternalMyDsl.g:924:2: rule__QueryReport__Group__0__Impl rule__QueryReport__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QueryReport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__0"


    // $ANTLR start "rule__QueryReport__Group__0__Impl"
    // InternalMyDsl.g:931:1: rule__QueryReport__Group__0__Impl : ( ( rule__QueryReport__NameAssignment_0 ) ) ;
    public final void rule__QueryReport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ( rule__QueryReport__NameAssignment_0 ) ) )
            // InternalMyDsl.g:936:1: ( ( rule__QueryReport__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:936:1: ( ( rule__QueryReport__NameAssignment_0 ) )
            // InternalMyDsl.g:937:2: ( rule__QueryReport__NameAssignment_0 )
            {
             before(grammarAccess.getQueryReportAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:938:2: ( rule__QueryReport__NameAssignment_0 )
            // InternalMyDsl.g:938:3: rule__QueryReport__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryReport__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryReportAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__0__Impl"


    // $ANTLR start "rule__QueryReport__Group__1"
    // InternalMyDsl.g:946:1: rule__QueryReport__Group__1 : rule__QueryReport__Group__1__Impl rule__QueryReport__Group__2 ;
    public final void rule__QueryReport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__QueryReport__Group__1__Impl rule__QueryReport__Group__2 )
            // InternalMyDsl.g:951:2: rule__QueryReport__Group__1__Impl rule__QueryReport__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__QueryReport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__1"


    // $ANTLR start "rule__QueryReport__Group__1__Impl"
    // InternalMyDsl.g:958:1: rule__QueryReport__Group__1__Impl : ( '=' ) ;
    public final void rule__QueryReport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( '=' ) )
            // InternalMyDsl.g:963:1: ( '=' )
            {
            // InternalMyDsl.g:963:1: ( '=' )
            // InternalMyDsl.g:964:2: '='
            {
             before(grammarAccess.getQueryReportAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQueryReportAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__1__Impl"


    // $ANTLR start "rule__QueryReport__Group__2"
    // InternalMyDsl.g:973:1: rule__QueryReport__Group__2 : rule__QueryReport__Group__2__Impl rule__QueryReport__Group__3 ;
    public final void rule__QueryReport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__QueryReport__Group__2__Impl rule__QueryReport__Group__3 )
            // InternalMyDsl.g:978:2: rule__QueryReport__Group__2__Impl rule__QueryReport__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__QueryReport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__2"


    // $ANTLR start "rule__QueryReport__Group__2__Impl"
    // InternalMyDsl.g:985:1: rule__QueryReport__Group__2__Impl : ( 'queryReport' ) ;
    public final void rule__QueryReport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( 'queryReport' ) )
            // InternalMyDsl.g:990:1: ( 'queryReport' )
            {
            // InternalMyDsl.g:990:1: ( 'queryReport' )
            // InternalMyDsl.g:991:2: 'queryReport'
            {
             before(grammarAccess.getQueryReportAccess().getQueryReportKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQueryReportAccess().getQueryReportKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__2__Impl"


    // $ANTLR start "rule__QueryReport__Group__3"
    // InternalMyDsl.g:1000:1: rule__QueryReport__Group__3 : rule__QueryReport__Group__3__Impl rule__QueryReport__Group__4 ;
    public final void rule__QueryReport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__QueryReport__Group__3__Impl rule__QueryReport__Group__4 )
            // InternalMyDsl.g:1005:2: rule__QueryReport__Group__3__Impl rule__QueryReport__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__QueryReport__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__3"


    // $ANTLR start "rule__QueryReport__Group__3__Impl"
    // InternalMyDsl.g:1012:1: rule__QueryReport__Group__3__Impl : ( '{' ) ;
    public final void rule__QueryReport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( '{' ) )
            // InternalMyDsl.g:1017:1: ( '{' )
            {
            // InternalMyDsl.g:1017:1: ( '{' )
            // InternalMyDsl.g:1018:2: '{'
            {
             before(grammarAccess.getQueryReportAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryReportAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__3__Impl"


    // $ANTLR start "rule__QueryReport__Group__4"
    // InternalMyDsl.g:1027:1: rule__QueryReport__Group__4 : rule__QueryReport__Group__4__Impl rule__QueryReport__Group__5 ;
    public final void rule__QueryReport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__QueryReport__Group__4__Impl rule__QueryReport__Group__5 )
            // InternalMyDsl.g:1032:2: rule__QueryReport__Group__4__Impl rule__QueryReport__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__QueryReport__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__4"


    // $ANTLR start "rule__QueryReport__Group__4__Impl"
    // InternalMyDsl.g:1039:1: rule__QueryReport__Group__4__Impl : ( ruleInitialStatement ) ;
    public final void rule__QueryReport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( ( ruleInitialStatement ) )
            // InternalMyDsl.g:1044:1: ( ruleInitialStatement )
            {
            // InternalMyDsl.g:1044:1: ( ruleInitialStatement )
            // InternalMyDsl.g:1045:2: ruleInitialStatement
            {
             before(grammarAccess.getQueryReportAccess().getInitialStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleInitialStatement();

            state._fsp--;

             after(grammarAccess.getQueryReportAccess().getInitialStatementParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__4__Impl"


    // $ANTLR start "rule__QueryReport__Group__5"
    // InternalMyDsl.g:1054:1: rule__QueryReport__Group__5 : rule__QueryReport__Group__5__Impl rule__QueryReport__Group__6 ;
    public final void rule__QueryReport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__QueryReport__Group__5__Impl rule__QueryReport__Group__6 )
            // InternalMyDsl.g:1059:2: rule__QueryReport__Group__5__Impl rule__QueryReport__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__QueryReport__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__5"


    // $ANTLR start "rule__QueryReport__Group__5__Impl"
    // InternalMyDsl.g:1066:1: rule__QueryReport__Group__5__Impl : ( ( rule__QueryReport__QueryReportAssignment_5 )* ) ;
    public final void rule__QueryReport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ( rule__QueryReport__QueryReportAssignment_5 )* ) )
            // InternalMyDsl.g:1071:1: ( ( rule__QueryReport__QueryReportAssignment_5 )* )
            {
            // InternalMyDsl.g:1071:1: ( ( rule__QueryReport__QueryReportAssignment_5 )* )
            // InternalMyDsl.g:1072:2: ( rule__QueryReport__QueryReportAssignment_5 )*
            {
             before(grammarAccess.getQueryReportAccess().getQueryReportAssignment_5()); 
            // InternalMyDsl.g:1073:2: ( rule__QueryReport__QueryReportAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||(LA8_0>=22 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1073:3: rule__QueryReport__QueryReportAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QueryReport__QueryReportAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQueryReportAccess().getQueryReportAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__5__Impl"


    // $ANTLR start "rule__QueryReport__Group__6"
    // InternalMyDsl.g:1081:1: rule__QueryReport__Group__6 : rule__QueryReport__Group__6__Impl ;
    public final void rule__QueryReport__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__QueryReport__Group__6__Impl )
            // InternalMyDsl.g:1086:2: rule__QueryReport__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryReport__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__6"


    // $ANTLR start "rule__QueryReport__Group__6__Impl"
    // InternalMyDsl.g:1092:1: rule__QueryReport__Group__6__Impl : ( '}' ) ;
    public final void rule__QueryReport__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( '}' ) )
            // InternalMyDsl.g:1097:1: ( '}' )
            {
            // InternalMyDsl.g:1097:1: ( '}' )
            // InternalMyDsl.g:1098:2: '}'
            {
             before(grammarAccess.getQueryReportAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQueryReportAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__Group__6__Impl"


    // $ANTLR start "rule__Report__Group__0"
    // InternalMyDsl.g:1108:1: rule__Report__Group__0 : rule__Report__Group__0__Impl rule__Report__Group__1 ;
    public final void rule__Report__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Report__Group__0__Impl rule__Report__Group__1 )
            // InternalMyDsl.g:1113:2: rule__Report__Group__0__Impl rule__Report__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Report__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__0"


    // $ANTLR start "rule__Report__Group__0__Impl"
    // InternalMyDsl.g:1120:1: rule__Report__Group__0__Impl : ( 'reportToLatex' ) ;
    public final void rule__Report__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( 'reportToLatex' ) )
            // InternalMyDsl.g:1125:1: ( 'reportToLatex' )
            {
            // InternalMyDsl.g:1125:1: ( 'reportToLatex' )
            // InternalMyDsl.g:1126:2: 'reportToLatex'
            {
             before(grammarAccess.getReportAccess().getReportToLatexKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReportAccess().getReportToLatexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__0__Impl"


    // $ANTLR start "rule__Report__Group__1"
    // InternalMyDsl.g:1135:1: rule__Report__Group__1 : rule__Report__Group__1__Impl rule__Report__Group__2 ;
    public final void rule__Report__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Report__Group__1__Impl rule__Report__Group__2 )
            // InternalMyDsl.g:1140:2: rule__Report__Group__1__Impl rule__Report__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Report__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__1"


    // $ANTLR start "rule__Report__Group__1__Impl"
    // InternalMyDsl.g:1147:1: rule__Report__Group__1__Impl : ( '(' ) ;
    public final void rule__Report__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( '(' ) )
            // InternalMyDsl.g:1152:1: ( '(' )
            {
            // InternalMyDsl.g:1152:1: ( '(' )
            // InternalMyDsl.g:1153:2: '('
            {
             before(grammarAccess.getReportAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReportAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__1__Impl"


    // $ANTLR start "rule__Report__Group__2"
    // InternalMyDsl.g:1162:1: rule__Report__Group__2 : rule__Report__Group__2__Impl rule__Report__Group__3 ;
    public final void rule__Report__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Report__Group__2__Impl rule__Report__Group__3 )
            // InternalMyDsl.g:1167:2: rule__Report__Group__2__Impl rule__Report__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Report__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__2"


    // $ANTLR start "rule__Report__Group__2__Impl"
    // InternalMyDsl.g:1174:1: rule__Report__Group__2__Impl : ( () ) ;
    public final void rule__Report__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( () ) )
            // InternalMyDsl.g:1179:1: ( () )
            {
            // InternalMyDsl.g:1179:1: ( () )
            // InternalMyDsl.g:1180:2: ()
            {
             before(grammarAccess.getReportAccess().getReportAction_2()); 
            // InternalMyDsl.g:1181:2: ()
            // InternalMyDsl.g:1181:3: 
            {
            }

             after(grammarAccess.getReportAccess().getReportAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__2__Impl"


    // $ANTLR start "rule__Report__Group__3"
    // InternalMyDsl.g:1189:1: rule__Report__Group__3 : rule__Report__Group__3__Impl rule__Report__Group__4 ;
    public final void rule__Report__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Report__Group__3__Impl rule__Report__Group__4 )
            // InternalMyDsl.g:1194:2: rule__Report__Group__3__Impl rule__Report__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Report__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__3"


    // $ANTLR start "rule__Report__Group__3__Impl"
    // InternalMyDsl.g:1201:1: rule__Report__Group__3__Impl : ( ( rule__Report__RepoutAssignment_3 ) ) ;
    public final void rule__Report__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( ( rule__Report__RepoutAssignment_3 ) ) )
            // InternalMyDsl.g:1206:1: ( ( rule__Report__RepoutAssignment_3 ) )
            {
            // InternalMyDsl.g:1206:1: ( ( rule__Report__RepoutAssignment_3 ) )
            // InternalMyDsl.g:1207:2: ( rule__Report__RepoutAssignment_3 )
            {
             before(grammarAccess.getReportAccess().getRepoutAssignment_3()); 
            // InternalMyDsl.g:1208:2: ( rule__Report__RepoutAssignment_3 )
            // InternalMyDsl.g:1208:3: rule__Report__RepoutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Report__RepoutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReportAccess().getRepoutAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__3__Impl"


    // $ANTLR start "rule__Report__Group__4"
    // InternalMyDsl.g:1216:1: rule__Report__Group__4 : rule__Report__Group__4__Impl rule__Report__Group__5 ;
    public final void rule__Report__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__Report__Group__4__Impl rule__Report__Group__5 )
            // InternalMyDsl.g:1221:2: rule__Report__Group__4__Impl rule__Report__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Report__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__4"


    // $ANTLR start "rule__Report__Group__4__Impl"
    // InternalMyDsl.g:1228:1: rule__Report__Group__4__Impl : ( ',' ) ;
    public final void rule__Report__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ',' ) )
            // InternalMyDsl.g:1233:1: ( ',' )
            {
            // InternalMyDsl.g:1233:1: ( ',' )
            // InternalMyDsl.g:1234:2: ','
            {
             before(grammarAccess.getReportAccess().getCommaKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReportAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__4__Impl"


    // $ANTLR start "rule__Report__Group__5"
    // InternalMyDsl.g:1243:1: rule__Report__Group__5 : rule__Report__Group__5__Impl rule__Report__Group__6 ;
    public final void rule__Report__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__Report__Group__5__Impl rule__Report__Group__6 )
            // InternalMyDsl.g:1248:2: rule__Report__Group__5__Impl rule__Report__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Report__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Report__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__5"


    // $ANTLR start "rule__Report__Group__5__Impl"
    // InternalMyDsl.g:1255:1: rule__Report__Group__5__Impl : ( ( rule__Report__FromAssignment_5 ) ) ;
    public final void rule__Report__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( ( rule__Report__FromAssignment_5 ) ) )
            // InternalMyDsl.g:1260:1: ( ( rule__Report__FromAssignment_5 ) )
            {
            // InternalMyDsl.g:1260:1: ( ( rule__Report__FromAssignment_5 ) )
            // InternalMyDsl.g:1261:2: ( rule__Report__FromAssignment_5 )
            {
             before(grammarAccess.getReportAccess().getFromAssignment_5()); 
            // InternalMyDsl.g:1262:2: ( rule__Report__FromAssignment_5 )
            // InternalMyDsl.g:1262:3: rule__Report__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Report__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReportAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__5__Impl"


    // $ANTLR start "rule__Report__Group__6"
    // InternalMyDsl.g:1270:1: rule__Report__Group__6 : rule__Report__Group__6__Impl ;
    public final void rule__Report__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__Report__Group__6__Impl )
            // InternalMyDsl.g:1275:2: rule__Report__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Report__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__6"


    // $ANTLR start "rule__Report__Group__6__Impl"
    // InternalMyDsl.g:1281:1: rule__Report__Group__6__Impl : ( ')' ) ;
    public final void rule__Report__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( ')' ) )
            // InternalMyDsl.g:1286:1: ( ')' )
            {
            // InternalMyDsl.g:1286:1: ( ')' )
            // InternalMyDsl.g:1287:2: ')'
            {
             before(grammarAccess.getReportAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReportAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__Group__6__Impl"


    // $ANTLR start "rule__Descendants__Group__0"
    // InternalMyDsl.g:1297:1: rule__Descendants__Group__0 : rule__Descendants__Group__0__Impl rule__Descendants__Group__1 ;
    public final void rule__Descendants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Descendants__Group__0__Impl rule__Descendants__Group__1 )
            // InternalMyDsl.g:1302:2: rule__Descendants__Group__0__Impl rule__Descendants__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Descendants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__0"


    // $ANTLR start "rule__Descendants__Group__0__Impl"
    // InternalMyDsl.g:1309:1: rule__Descendants__Group__0__Impl : ( 'descendants' ) ;
    public final void rule__Descendants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( 'descendants' ) )
            // InternalMyDsl.g:1314:1: ( 'descendants' )
            {
            // InternalMyDsl.g:1314:1: ( 'descendants' )
            // InternalMyDsl.g:1315:2: 'descendants'
            {
             before(grammarAccess.getDescendantsAccess().getDescendantsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDescendantsAccess().getDescendantsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__0__Impl"


    // $ANTLR start "rule__Descendants__Group__1"
    // InternalMyDsl.g:1324:1: rule__Descendants__Group__1 : rule__Descendants__Group__1__Impl rule__Descendants__Group__2 ;
    public final void rule__Descendants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Descendants__Group__1__Impl rule__Descendants__Group__2 )
            // InternalMyDsl.g:1329:2: rule__Descendants__Group__1__Impl rule__Descendants__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Descendants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__1"


    // $ANTLR start "rule__Descendants__Group__1__Impl"
    // InternalMyDsl.g:1336:1: rule__Descendants__Group__1__Impl : ( ( rule__Descendants__GroupAssignment_1 ) ) ;
    public final void rule__Descendants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__Descendants__GroupAssignment_1 ) ) )
            // InternalMyDsl.g:1341:1: ( ( rule__Descendants__GroupAssignment_1 ) )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__Descendants__GroupAssignment_1 ) )
            // InternalMyDsl.g:1342:2: ( rule__Descendants__GroupAssignment_1 )
            {
             before(grammarAccess.getDescendantsAccess().getGroupAssignment_1()); 
            // InternalMyDsl.g:1343:2: ( rule__Descendants__GroupAssignment_1 )
            // InternalMyDsl.g:1343:3: rule__Descendants__GroupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Descendants__GroupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescendantsAccess().getGroupAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__1__Impl"


    // $ANTLR start "rule__Descendants__Group__2"
    // InternalMyDsl.g:1351:1: rule__Descendants__Group__2 : rule__Descendants__Group__2__Impl rule__Descendants__Group__3 ;
    public final void rule__Descendants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Descendants__Group__2__Impl rule__Descendants__Group__3 )
            // InternalMyDsl.g:1356:2: rule__Descendants__Group__2__Impl rule__Descendants__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Descendants__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendants__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__2"


    // $ANTLR start "rule__Descendants__Group__2__Impl"
    // InternalMyDsl.g:1363:1: rule__Descendants__Group__2__Impl : ( ',' ) ;
    public final void rule__Descendants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ',' ) )
            // InternalMyDsl.g:1368:1: ( ',' )
            {
            // InternalMyDsl.g:1368:1: ( ',' )
            // InternalMyDsl.g:1369:2: ','
            {
             before(grammarAccess.getDescendantsAccess().getCommaKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDescendantsAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__2__Impl"


    // $ANTLR start "rule__Descendants__Group__3"
    // InternalMyDsl.g:1378:1: rule__Descendants__Group__3 : rule__Descendants__Group__3__Impl ;
    public final void rule__Descendants__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Descendants__Group__3__Impl )
            // InternalMyDsl.g:1383:2: rule__Descendants__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Descendants__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__3"


    // $ANTLR start "rule__Descendants__Group__3__Impl"
    // InternalMyDsl.g:1389:1: rule__Descendants__Group__3__Impl : ( ( rule__Descendants__DimensionAssignment_3 ) ) ;
    public final void rule__Descendants__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( ( ( rule__Descendants__DimensionAssignment_3 ) ) )
            // InternalMyDsl.g:1394:1: ( ( rule__Descendants__DimensionAssignment_3 ) )
            {
            // InternalMyDsl.g:1394:1: ( ( rule__Descendants__DimensionAssignment_3 ) )
            // InternalMyDsl.g:1395:2: ( rule__Descendants__DimensionAssignment_3 )
            {
             before(grammarAccess.getDescendantsAccess().getDimensionAssignment_3()); 
            // InternalMyDsl.g:1396:2: ( rule__Descendants__DimensionAssignment_3 )
            // InternalMyDsl.g:1396:3: rule__Descendants__DimensionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Descendants__DimensionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDescendantsAccess().getDimensionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__Group__3__Impl"


    // $ANTLR start "rule__DimensionDeclaration__Group__0"
    // InternalMyDsl.g:1405:1: rule__DimensionDeclaration__Group__0 : rule__DimensionDeclaration__Group__0__Impl rule__DimensionDeclaration__Group__1 ;
    public final void rule__DimensionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__DimensionDeclaration__Group__0__Impl rule__DimensionDeclaration__Group__1 )
            // InternalMyDsl.g:1410:2: rule__DimensionDeclaration__Group__0__Impl rule__DimensionDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DimensionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__0"


    // $ANTLR start "rule__DimensionDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1417:1: rule__DimensionDeclaration__Group__0__Impl : ( 'dim' ) ;
    public final void rule__DimensionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( 'dim' ) )
            // InternalMyDsl.g:1422:1: ( 'dim' )
            {
            // InternalMyDsl.g:1422:1: ( 'dim' )
            // InternalMyDsl.g:1423:2: 'dim'
            {
             before(grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDimensionDeclarationAccess().getDimKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DimensionDeclaration__Group__1"
    // InternalMyDsl.g:1432:1: rule__DimensionDeclaration__Group__1 : rule__DimensionDeclaration__Group__1__Impl rule__DimensionDeclaration__Group__2 ;
    public final void rule__DimensionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__DimensionDeclaration__Group__1__Impl rule__DimensionDeclaration__Group__2 )
            // InternalMyDsl.g:1437:2: rule__DimensionDeclaration__Group__1__Impl rule__DimensionDeclaration__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DimensionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__1"


    // $ANTLR start "rule__DimensionDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1444:1: rule__DimensionDeclaration__Group__1__Impl : ( ( rule__DimensionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DimensionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( ( rule__DimensionDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1449:1: ( ( rule__DimensionDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1449:1: ( ( rule__DimensionDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:1450:2: ( rule__DimensionDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getDimensionDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1451:2: ( rule__DimensionDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:1451:3: rule__DimensionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DimensionDeclaration__Group__2"
    // InternalMyDsl.g:1459:1: rule__DimensionDeclaration__Group__2 : rule__DimensionDeclaration__Group__2__Impl ;
    public final void rule__DimensionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__DimensionDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1464:2: rule__DimensionDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__2"


    // $ANTLR start "rule__DimensionDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1470:1: rule__DimensionDeclaration__Group__2__Impl : ( ( rule__DimensionDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__DimensionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( ( ( rule__DimensionDeclaration__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1475:1: ( ( rule__DimensionDeclaration__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1475:1: ( ( rule__DimensionDeclaration__ValueAssignment_2 ) )
            // InternalMyDsl.g:1476:2: ( rule__DimensionDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getDimensionDeclarationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1477:2: ( rule__DimensionDeclaration__ValueAssignment_2 )
            // InternalMyDsl.g:1477:3: rule__DimensionDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DimensionDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDimensionDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__GroupDeclaration__Group__0"
    // InternalMyDsl.g:1486:1: rule__GroupDeclaration__Group__0 : rule__GroupDeclaration__Group__0__Impl rule__GroupDeclaration__Group__1 ;
    public final void rule__GroupDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__GroupDeclaration__Group__0__Impl rule__GroupDeclaration__Group__1 )
            // InternalMyDsl.g:1491:2: rule__GroupDeclaration__Group__0__Impl rule__GroupDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GroupDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__0"


    // $ANTLR start "rule__GroupDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1498:1: rule__GroupDeclaration__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( 'group' ) )
            // InternalMyDsl.g:1503:1: ( 'group' )
            {
            // InternalMyDsl.g:1503:1: ( 'group' )
            // InternalMyDsl.g:1504:2: 'group'
            {
             before(grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGroupDeclarationAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__0__Impl"


    // $ANTLR start "rule__GroupDeclaration__Group__1"
    // InternalMyDsl.g:1513:1: rule__GroupDeclaration__Group__1 : rule__GroupDeclaration__Group__1__Impl rule__GroupDeclaration__Group__2 ;
    public final void rule__GroupDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__GroupDeclaration__Group__1__Impl rule__GroupDeclaration__Group__2 )
            // InternalMyDsl.g:1518:2: rule__GroupDeclaration__Group__1__Impl rule__GroupDeclaration__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__GroupDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__1"


    // $ANTLR start "rule__GroupDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1525:1: rule__GroupDeclaration__Group__1__Impl : ( ( rule__GroupDeclaration__NameAssignment_1 ) ) ;
    public final void rule__GroupDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( ( rule__GroupDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1530:1: ( ( rule__GroupDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1530:1: ( ( rule__GroupDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:1531:2: ( rule__GroupDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getGroupDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1532:2: ( rule__GroupDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:1532:3: rule__GroupDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__1__Impl"


    // $ANTLR start "rule__GroupDeclaration__Group__2"
    // InternalMyDsl.g:1540:1: rule__GroupDeclaration__Group__2 : rule__GroupDeclaration__Group__2__Impl ;
    public final void rule__GroupDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__GroupDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1545:2: rule__GroupDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__2"


    // $ANTLR start "rule__GroupDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1551:1: rule__GroupDeclaration__Group__2__Impl : ( ( rule__GroupDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__GroupDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ( rule__GroupDeclaration__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1556:1: ( ( rule__GroupDeclaration__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1556:1: ( ( rule__GroupDeclaration__ValueAssignment_2 ) )
            // InternalMyDsl.g:1557:2: ( rule__GroupDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getGroupDeclarationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1558:2: ( rule__GroupDeclaration__ValueAssignment_2 )
            // InternalMyDsl.g:1558:3: rule__GroupDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__Group__2__Impl"


    // $ANTLR start "rule__MemberDeclaration__Group__0"
    // InternalMyDsl.g:1567:1: rule__MemberDeclaration__Group__0 : rule__MemberDeclaration__Group__0__Impl rule__MemberDeclaration__Group__1 ;
    public final void rule__MemberDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__MemberDeclaration__Group__0__Impl rule__MemberDeclaration__Group__1 )
            // InternalMyDsl.g:1572:2: rule__MemberDeclaration__Group__0__Impl rule__MemberDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MemberDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__0"


    // $ANTLR start "rule__MemberDeclaration__Group__0__Impl"
    // InternalMyDsl.g:1579:1: rule__MemberDeclaration__Group__0__Impl : ( 'member' ) ;
    public final void rule__MemberDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( 'member' ) )
            // InternalMyDsl.g:1584:1: ( 'member' )
            {
            // InternalMyDsl.g:1584:1: ( 'member' )
            // InternalMyDsl.g:1585:2: 'member'
            {
             before(grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMemberDeclarationAccess().getMemberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MemberDeclaration__Group__1"
    // InternalMyDsl.g:1594:1: rule__MemberDeclaration__Group__1 : rule__MemberDeclaration__Group__1__Impl rule__MemberDeclaration__Group__2 ;
    public final void rule__MemberDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__MemberDeclaration__Group__1__Impl rule__MemberDeclaration__Group__2 )
            // InternalMyDsl.g:1599:2: rule__MemberDeclaration__Group__1__Impl rule__MemberDeclaration__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__MemberDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__1"


    // $ANTLR start "rule__MemberDeclaration__Group__1__Impl"
    // InternalMyDsl.g:1606:1: rule__MemberDeclaration__Group__1__Impl : ( ( rule__MemberDeclaration__NameAssignment_1 ) ) ;
    public final void rule__MemberDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( rule__MemberDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1611:1: ( ( rule__MemberDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1611:1: ( ( rule__MemberDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:1612:2: ( rule__MemberDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getMemberDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1613:2: ( rule__MemberDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:1613:3: rule__MemberDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MemberDeclaration__Group__2"
    // InternalMyDsl.g:1621:1: rule__MemberDeclaration__Group__2 : rule__MemberDeclaration__Group__2__Impl ;
    public final void rule__MemberDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__MemberDeclaration__Group__2__Impl )
            // InternalMyDsl.g:1626:2: rule__MemberDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__2"


    // $ANTLR start "rule__MemberDeclaration__Group__2__Impl"
    // InternalMyDsl.g:1632:1: rule__MemberDeclaration__Group__2__Impl : ( ( rule__MemberDeclaration__ValueAssignment_2 ) ) ;
    public final void rule__MemberDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ( rule__MemberDeclaration__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1637:1: ( ( rule__MemberDeclaration__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1637:1: ( ( rule__MemberDeclaration__ValueAssignment_2 ) )
            // InternalMyDsl.g:1638:2: ( rule__MemberDeclaration__ValueAssignment_2 )
            {
             before(grammarAccess.getMemberDeclarationAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1639:2: ( rule__MemberDeclaration__ValueAssignment_2 )
            // InternalMyDsl.g:1639:3: rule__MemberDeclaration__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MemberDeclaration__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberDeclarationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalMyDsl.g:1648:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalMyDsl.g:1653:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalMyDsl.g:1660:1: rule__Row__Group__0__Impl : ( 'row' ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( 'row' ) )
            // InternalMyDsl.g:1665:1: ( 'row' )
            {
            // InternalMyDsl.g:1665:1: ( 'row' )
            // InternalMyDsl.g:1666:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalMyDsl.g:1675:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalMyDsl.g:1680:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalMyDsl.g:1687:1: rule__Row__Group__1__Impl : ( () ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( () ) )
            // InternalMyDsl.g:1692:1: ( () )
            {
            // InternalMyDsl.g:1692:1: ( () )
            // InternalMyDsl.g:1693:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_1()); 
            // InternalMyDsl.g:1694:2: ()
            // InternalMyDsl.g:1694:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalMyDsl.g:1702:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalMyDsl.g:1707:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalMyDsl.g:1714:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( '{' ) )
            // InternalMyDsl.g:1719:1: ( '{' )
            {
            // InternalMyDsl.g:1719:1: ( '{' )
            // InternalMyDsl.g:1720:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalMyDsl.g:1729:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalMyDsl.g:1734:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Row__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalMyDsl.g:1741:1: rule__Row__Group__3__Impl : ( ( rule__Row__DimensionsAssignment_3 ) ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__Row__DimensionsAssignment_3 ) ) )
            // InternalMyDsl.g:1746:1: ( ( rule__Row__DimensionsAssignment_3 ) )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__Row__DimensionsAssignment_3 ) )
            // InternalMyDsl.g:1747:2: ( rule__Row__DimensionsAssignment_3 )
            {
             before(grammarAccess.getRowAccess().getDimensionsAssignment_3()); 
            // InternalMyDsl.g:1748:2: ( rule__Row__DimensionsAssignment_3 )
            // InternalMyDsl.g:1748:3: rule__Row__DimensionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Row__DimensionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getDimensionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // InternalMyDsl.g:1756:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // InternalMyDsl.g:1761:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Row__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // InternalMyDsl.g:1768:1: rule__Row__Group__4__Impl : ( ( rule__Row__Group_4__0 )* ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( ( rule__Row__Group_4__0 )* ) )
            // InternalMyDsl.g:1773:1: ( ( rule__Row__Group_4__0 )* )
            {
            // InternalMyDsl.g:1773:1: ( ( rule__Row__Group_4__0 )* )
            // InternalMyDsl.g:1774:2: ( rule__Row__Group_4__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_4()); 
            // InternalMyDsl.g:1775:2: ( rule__Row__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1775:3: rule__Row__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Row__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Row__Group__5"
    // InternalMyDsl.g:1783:1: rule__Row__Group__5 : rule__Row__Group__5__Impl ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Row__Group__5__Impl )
            // InternalMyDsl.g:1788:2: rule__Row__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5"


    // $ANTLR start "rule__Row__Group__5__Impl"
    // InternalMyDsl.g:1794:1: rule__Row__Group__5__Impl : ( '}' ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( '}' ) )
            // InternalMyDsl.g:1799:1: ( '}' )
            {
            // InternalMyDsl.g:1799:1: ( '}' )
            // InternalMyDsl.g:1800:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5__Impl"


    // $ANTLR start "rule__Row__Group_4__0"
    // InternalMyDsl.g:1810:1: rule__Row__Group_4__0 : rule__Row__Group_4__0__Impl rule__Row__Group_4__1 ;
    public final void rule__Row__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Row__Group_4__0__Impl rule__Row__Group_4__1 )
            // InternalMyDsl.g:1815:2: rule__Row__Group_4__0__Impl rule__Row__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Row__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__0"


    // $ANTLR start "rule__Row__Group_4__0__Impl"
    // InternalMyDsl.g:1822:1: rule__Row__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ',' ) )
            // InternalMyDsl.g:1827:1: ( ',' )
            {
            // InternalMyDsl.g:1827:1: ( ',' )
            // InternalMyDsl.g:1828:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__0__Impl"


    // $ANTLR start "rule__Row__Group_4__1"
    // InternalMyDsl.g:1837:1: rule__Row__Group_4__1 : rule__Row__Group_4__1__Impl ;
    public final void rule__Row__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Row__Group_4__1__Impl )
            // InternalMyDsl.g:1842:2: rule__Row__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__1"


    // $ANTLR start "rule__Row__Group_4__1__Impl"
    // InternalMyDsl.g:1848:1: rule__Row__Group_4__1__Impl : ( ( rule__Row__DimensionsAssignment_4_1 ) ) ;
    public final void rule__Row__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ( rule__Row__DimensionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1853:1: ( ( rule__Row__DimensionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1853:1: ( ( rule__Row__DimensionsAssignment_4_1 ) )
            // InternalMyDsl.g:1854:2: ( rule__Row__DimensionsAssignment_4_1 )
            {
             before(grammarAccess.getRowAccess().getDimensionsAssignment_4_1()); 
            // InternalMyDsl.g:1855:2: ( rule__Row__DimensionsAssignment_4_1 )
            // InternalMyDsl.g:1855:3: rule__Row__DimensionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__DimensionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getDimensionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMyDsl.g:1864:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMyDsl.g:1869:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalMyDsl.g:1876:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( 'column' ) )
            // InternalMyDsl.g:1881:1: ( 'column' )
            {
            // InternalMyDsl.g:1881:1: ( 'column' )
            // InternalMyDsl.g:1882:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalMyDsl.g:1891:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMyDsl.g:1896:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalMyDsl.g:1903:1: rule__Column__Group__1__Impl : ( () ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( () ) )
            // InternalMyDsl.g:1908:1: ( () )
            {
            // InternalMyDsl.g:1908:1: ( () )
            // InternalMyDsl.g:1909:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_1()); 
            // InternalMyDsl.g:1910:2: ()
            // InternalMyDsl.g:1910:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalMyDsl.g:1918:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalMyDsl.g:1923:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalMyDsl.g:1930:1: rule__Column__Group__2__Impl : ( '{' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( '{' ) )
            // InternalMyDsl.g:1935:1: ( '{' )
            {
            // InternalMyDsl.g:1935:1: ( '{' )
            // InternalMyDsl.g:1936:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalMyDsl.g:1945:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalMyDsl.g:1950:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalMyDsl.g:1957:1: rule__Column__Group__3__Impl : ( ( rule__Column__DimensionsAssignment_3 ) ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ( rule__Column__DimensionsAssignment_3 ) ) )
            // InternalMyDsl.g:1962:1: ( ( rule__Column__DimensionsAssignment_3 ) )
            {
            // InternalMyDsl.g:1962:1: ( ( rule__Column__DimensionsAssignment_3 ) )
            // InternalMyDsl.g:1963:2: ( rule__Column__DimensionsAssignment_3 )
            {
             before(grammarAccess.getColumnAccess().getDimensionsAssignment_3()); 
            // InternalMyDsl.g:1964:2: ( rule__Column__DimensionsAssignment_3 )
            // InternalMyDsl.g:1964:3: rule__Column__DimensionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__DimensionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDimensionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalMyDsl.g:1972:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalMyDsl.g:1977:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalMyDsl.g:1984:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )* ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ( rule__Column__Group_4__0 )* ) )
            // InternalMyDsl.g:1989:1: ( ( rule__Column__Group_4__0 )* )
            {
            // InternalMyDsl.g:1989:1: ( ( rule__Column__Group_4__0 )* )
            // InternalMyDsl.g:1990:2: ( rule__Column__Group_4__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalMyDsl.g:1991:2: ( rule__Column__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1991:3: rule__Column__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Column__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalMyDsl.g:1999:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__Column__Group__5__Impl )
            // InternalMyDsl.g:2004:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalMyDsl.g:2010:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( '}' ) )
            // InternalMyDsl.g:2015:1: ( '}' )
            {
            // InternalMyDsl.g:2015:1: ( '}' )
            // InternalMyDsl.g:2016:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalMyDsl.g:2026:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalMyDsl.g:2031:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalMyDsl.g:2038:1: rule__Column__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( ',' ) )
            // InternalMyDsl.g:2043:1: ( ',' )
            {
            // InternalMyDsl.g:2043:1: ( ',' )
            // InternalMyDsl.g:2044:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalMyDsl.g:2053:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__Column__Group_4__1__Impl )
            // InternalMyDsl.g:2058:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalMyDsl.g:2064:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__DimensionsAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ( rule__Column__DimensionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2069:1: ( ( rule__Column__DimensionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2069:1: ( ( rule__Column__DimensionsAssignment_4_1 ) )
            // InternalMyDsl.g:2070:2: ( rule__Column__DimensionsAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getDimensionsAssignment_4_1()); 
            // InternalMyDsl.g:2071:2: ( rule__Column__DimensionsAssignment_4_1 )
            // InternalMyDsl.g:2071:3: rule__Column__DimensionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__DimensionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDimensionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:2080:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:2085:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:2092:1: rule__Link__Group__0__Impl : ( 'link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( 'link' ) )
            // InternalMyDsl.g:2097:1: ( 'link' )
            {
            // InternalMyDsl.g:2097:1: ( 'link' )
            // InternalMyDsl.g:2098:2: 'link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:2107:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:2112:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:2119:1: rule__Link__Group__1__Impl : ( () ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( () ) )
            // InternalMyDsl.g:2124:1: ( () )
            {
            // InternalMyDsl.g:2124:1: ( () )
            // InternalMyDsl.g:2125:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_1()); 
            // InternalMyDsl.g:2126:2: ()
            // InternalMyDsl.g:2126:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:2134:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:2139:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:2146:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( '{' ) )
            // InternalMyDsl.g:2151:1: ( '{' )
            {
            // InternalMyDsl.g:2151:1: ( '{' )
            // InternalMyDsl.g:2152:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:2161:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:2166:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:2173:1: rule__Link__Group__3__Impl : ( ( rule__Link__DescAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( ( rule__Link__DescAssignment_3 ) ) )
            // InternalMyDsl.g:2178:1: ( ( rule__Link__DescAssignment_3 ) )
            {
            // InternalMyDsl.g:2178:1: ( ( rule__Link__DescAssignment_3 ) )
            // InternalMyDsl.g:2179:2: ( rule__Link__DescAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getDescAssignment_3()); 
            // InternalMyDsl.g:2180:2: ( rule__Link__DescAssignment_3 )
            // InternalMyDsl.g:2180:3: rule__Link__DescAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Link__DescAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getDescAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalMyDsl.g:2188:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:2193:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalMyDsl.g:2200:1: rule__Link__Group__4__Impl : ( ',' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ',' ) )
            // InternalMyDsl.g:2205:1: ( ',' )
            {
            // InternalMyDsl.g:2205:1: ( ',' )
            // InternalMyDsl.g:2206:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalMyDsl.g:2215:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalMyDsl.g:2220:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalMyDsl.g:2227:1: rule__Link__Group__5__Impl : ( ( rule__Link__LevAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( ( rule__Link__LevAssignment_5 ) ) )
            // InternalMyDsl.g:2232:1: ( ( rule__Link__LevAssignment_5 ) )
            {
            // InternalMyDsl.g:2232:1: ( ( rule__Link__LevAssignment_5 ) )
            // InternalMyDsl.g:2233:2: ( rule__Link__LevAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getLevAssignment_5()); 
            // InternalMyDsl.g:2234:2: ( rule__Link__LevAssignment_5 )
            // InternalMyDsl.g:2234:3: rule__Link__LevAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__LevAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLevAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalMyDsl.g:2242:1: rule__Link__Group__6 : rule__Link__Group__6__Impl ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Link__Group__6__Impl )
            // InternalMyDsl.g:2247:2: rule__Link__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalMyDsl.g:2253:1: rule__Link__Group__6__Impl : ( '}' ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( '}' ) )
            // InternalMyDsl.g:2258:1: ( '}' )
            {
            // InternalMyDsl.g:2258:1: ( '}' )
            // InternalMyDsl.g:2259:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Child__Group__0"
    // InternalMyDsl.g:2269:1: rule__Child__Group__0 : rule__Child__Group__0__Impl rule__Child__Group__1 ;
    public final void rule__Child__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__Child__Group__0__Impl rule__Child__Group__1 )
            // InternalMyDsl.g:2274:2: rule__Child__Group__0__Impl rule__Child__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Child__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__0"


    // $ANTLR start "rule__Child__Group__0__Impl"
    // InternalMyDsl.g:2281:1: rule__Child__Group__0__Impl : ( 'child' ) ;
    public final void rule__Child__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( 'child' ) )
            // InternalMyDsl.g:2286:1: ( 'child' )
            {
            // InternalMyDsl.g:2286:1: ( 'child' )
            // InternalMyDsl.g:2287:2: 'child'
            {
             before(grammarAccess.getChildAccess().getChildKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getChildKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__0__Impl"


    // $ANTLR start "rule__Child__Group__1"
    // InternalMyDsl.g:2296:1: rule__Child__Group__1 : rule__Child__Group__1__Impl rule__Child__Group__2 ;
    public final void rule__Child__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__Child__Group__1__Impl rule__Child__Group__2 )
            // InternalMyDsl.g:2301:2: rule__Child__Group__1__Impl rule__Child__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Child__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__1"


    // $ANTLR start "rule__Child__Group__1__Impl"
    // InternalMyDsl.g:2308:1: rule__Child__Group__1__Impl : ( () ) ;
    public final void rule__Child__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( () ) )
            // InternalMyDsl.g:2313:1: ( () )
            {
            // InternalMyDsl.g:2313:1: ( () )
            // InternalMyDsl.g:2314:2: ()
            {
             before(grammarAccess.getChildAccess().getChildAction_1()); 
            // InternalMyDsl.g:2315:2: ()
            // InternalMyDsl.g:2315:3: 
            {
            }

             after(grammarAccess.getChildAccess().getChildAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__1__Impl"


    // $ANTLR start "rule__Child__Group__2"
    // InternalMyDsl.g:2323:1: rule__Child__Group__2 : rule__Child__Group__2__Impl rule__Child__Group__3 ;
    public final void rule__Child__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__Child__Group__2__Impl rule__Child__Group__3 )
            // InternalMyDsl.g:2328:2: rule__Child__Group__2__Impl rule__Child__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Child__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__2"


    // $ANTLR start "rule__Child__Group__2__Impl"
    // InternalMyDsl.g:2335:1: rule__Child__Group__2__Impl : ( '{' ) ;
    public final void rule__Child__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( '{' ) )
            // InternalMyDsl.g:2340:1: ( '{' )
            {
            // InternalMyDsl.g:2340:1: ( '{' )
            // InternalMyDsl.g:2341:2: '{'
            {
             before(grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__2__Impl"


    // $ANTLR start "rule__Child__Group__3"
    // InternalMyDsl.g:2350:1: rule__Child__Group__3 : rule__Child__Group__3__Impl rule__Child__Group__4 ;
    public final void rule__Child__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__Child__Group__3__Impl rule__Child__Group__4 )
            // InternalMyDsl.g:2355:2: rule__Child__Group__3__Impl rule__Child__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Child__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__3"


    // $ANTLR start "rule__Child__Group__3__Impl"
    // InternalMyDsl.g:2362:1: rule__Child__Group__3__Impl : ( ( rule__Child__DimensionsAssignment_3 ) ) ;
    public final void rule__Child__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__Child__DimensionsAssignment_3 ) ) )
            // InternalMyDsl.g:2367:1: ( ( rule__Child__DimensionsAssignment_3 ) )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__Child__DimensionsAssignment_3 ) )
            // InternalMyDsl.g:2368:2: ( rule__Child__DimensionsAssignment_3 )
            {
             before(grammarAccess.getChildAccess().getDimensionsAssignment_3()); 
            // InternalMyDsl.g:2369:2: ( rule__Child__DimensionsAssignment_3 )
            // InternalMyDsl.g:2369:3: rule__Child__DimensionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Child__DimensionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getDimensionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__3__Impl"


    // $ANTLR start "rule__Child__Group__4"
    // InternalMyDsl.g:2377:1: rule__Child__Group__4 : rule__Child__Group__4__Impl rule__Child__Group__5 ;
    public final void rule__Child__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__Child__Group__4__Impl rule__Child__Group__5 )
            // InternalMyDsl.g:2382:2: rule__Child__Group__4__Impl rule__Child__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Child__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__4"


    // $ANTLR start "rule__Child__Group__4__Impl"
    // InternalMyDsl.g:2389:1: rule__Child__Group__4__Impl : ( ( rule__Child__Group_4__0 )* ) ;
    public final void rule__Child__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ( rule__Child__Group_4__0 )* ) )
            // InternalMyDsl.g:2394:1: ( ( rule__Child__Group_4__0 )* )
            {
            // InternalMyDsl.g:2394:1: ( ( rule__Child__Group_4__0 )* )
            // InternalMyDsl.g:2395:2: ( rule__Child__Group_4__0 )*
            {
             before(grammarAccess.getChildAccess().getGroup_4()); 
            // InternalMyDsl.g:2396:2: ( rule__Child__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2396:3: rule__Child__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Child__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChildAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__4__Impl"


    // $ANTLR start "rule__Child__Group__5"
    // InternalMyDsl.g:2404:1: rule__Child__Group__5 : rule__Child__Group__5__Impl ;
    public final void rule__Child__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__Child__Group__5__Impl )
            // InternalMyDsl.g:2409:2: rule__Child__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Child__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__5"


    // $ANTLR start "rule__Child__Group__5__Impl"
    // InternalMyDsl.g:2415:1: rule__Child__Group__5__Impl : ( '}' ) ;
    public final void rule__Child__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( '}' ) )
            // InternalMyDsl.g:2420:1: ( '}' )
            {
            // InternalMyDsl.g:2420:1: ( '}' )
            // InternalMyDsl.g:2421:2: '}'
            {
             before(grammarAccess.getChildAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group__5__Impl"


    // $ANTLR start "rule__Child__Group_4__0"
    // InternalMyDsl.g:2431:1: rule__Child__Group_4__0 : rule__Child__Group_4__0__Impl rule__Child__Group_4__1 ;
    public final void rule__Child__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__Child__Group_4__0__Impl rule__Child__Group_4__1 )
            // InternalMyDsl.g:2436:2: rule__Child__Group_4__0__Impl rule__Child__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Child__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Child__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group_4__0"


    // $ANTLR start "rule__Child__Group_4__0__Impl"
    // InternalMyDsl.g:2443:1: rule__Child__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Child__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ',' ) )
            // InternalMyDsl.g:2448:1: ( ',' )
            {
            // InternalMyDsl.g:2448:1: ( ',' )
            // InternalMyDsl.g:2449:2: ','
            {
             before(grammarAccess.getChildAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChildAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group_4__0__Impl"


    // $ANTLR start "rule__Child__Group_4__1"
    // InternalMyDsl.g:2458:1: rule__Child__Group_4__1 : rule__Child__Group_4__1__Impl ;
    public final void rule__Child__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__Child__Group_4__1__Impl )
            // InternalMyDsl.g:2463:2: rule__Child__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Child__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group_4__1"


    // $ANTLR start "rule__Child__Group_4__1__Impl"
    // InternalMyDsl.g:2469:1: rule__Child__Group_4__1__Impl : ( ( rule__Child__DimensionsAssignment_4_1 ) ) ;
    public final void rule__Child__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__Child__DimensionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__Child__DimensionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__Child__DimensionsAssignment_4_1 ) )
            // InternalMyDsl.g:2475:2: ( rule__Child__DimensionsAssignment_4_1 )
            {
             before(grammarAccess.getChildAccess().getDimensionsAssignment_4_1()); 
            // InternalMyDsl.g:2476:2: ( rule__Child__DimensionsAssignment_4_1 )
            // InternalMyDsl.g:2476:3: rule__Child__DimensionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Child__DimensionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChildAccess().getDimensionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__Group_4__1__Impl"


    // $ANTLR start "rule__ReportParameter__Group__0"
    // InternalMyDsl.g:2485:1: rule__ReportParameter__Group__0 : rule__ReportParameter__Group__0__Impl rule__ReportParameter__Group__1 ;
    public final void rule__ReportParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__ReportParameter__Group__0__Impl rule__ReportParameter__Group__1 )
            // InternalMyDsl.g:2490:2: rule__ReportParameter__Group__0__Impl rule__ReportParameter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ReportParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__0"


    // $ANTLR start "rule__ReportParameter__Group__0__Impl"
    // InternalMyDsl.g:2497:1: rule__ReportParameter__Group__0__Impl : ( 'reportParameter' ) ;
    public final void rule__ReportParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( 'reportParameter' ) )
            // InternalMyDsl.g:2502:1: ( 'reportParameter' )
            {
            // InternalMyDsl.g:2502:1: ( 'reportParameter' )
            // InternalMyDsl.g:2503:2: 'reportParameter'
            {
             before(grammarAccess.getReportParameterAccess().getReportParameterKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReportParameterAccess().getReportParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__0__Impl"


    // $ANTLR start "rule__ReportParameter__Group__1"
    // InternalMyDsl.g:2512:1: rule__ReportParameter__Group__1 : rule__ReportParameter__Group__1__Impl rule__ReportParameter__Group__2 ;
    public final void rule__ReportParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__ReportParameter__Group__1__Impl rule__ReportParameter__Group__2 )
            // InternalMyDsl.g:2517:2: rule__ReportParameter__Group__1__Impl rule__ReportParameter__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ReportParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__1"


    // $ANTLR start "rule__ReportParameter__Group__1__Impl"
    // InternalMyDsl.g:2524:1: rule__ReportParameter__Group__1__Impl : ( () ) ;
    public final void rule__ReportParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( ( () ) )
            // InternalMyDsl.g:2529:1: ( () )
            {
            // InternalMyDsl.g:2529:1: ( () )
            // InternalMyDsl.g:2530:2: ()
            {
             before(grammarAccess.getReportParameterAccess().getReportParameterAction_1()); 
            // InternalMyDsl.g:2531:2: ()
            // InternalMyDsl.g:2531:3: 
            {
            }

             after(grammarAccess.getReportParameterAccess().getReportParameterAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__1__Impl"


    // $ANTLR start "rule__ReportParameter__Group__2"
    // InternalMyDsl.g:2539:1: rule__ReportParameter__Group__2 : rule__ReportParameter__Group__2__Impl rule__ReportParameter__Group__3 ;
    public final void rule__ReportParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__ReportParameter__Group__2__Impl rule__ReportParameter__Group__3 )
            // InternalMyDsl.g:2544:2: rule__ReportParameter__Group__2__Impl rule__ReportParameter__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ReportParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__2"


    // $ANTLR start "rule__ReportParameter__Group__2__Impl"
    // InternalMyDsl.g:2551:1: rule__ReportParameter__Group__2__Impl : ( '{' ) ;
    public final void rule__ReportParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( '{' ) )
            // InternalMyDsl.g:2556:1: ( '{' )
            {
            // InternalMyDsl.g:2556:1: ( '{' )
            // InternalMyDsl.g:2557:2: '{'
            {
             before(grammarAccess.getReportParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReportParameterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__2__Impl"


    // $ANTLR start "rule__ReportParameter__Group__3"
    // InternalMyDsl.g:2566:1: rule__ReportParameter__Group__3 : rule__ReportParameter__Group__3__Impl rule__ReportParameter__Group__4 ;
    public final void rule__ReportParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__ReportParameter__Group__3__Impl rule__ReportParameter__Group__4 )
            // InternalMyDsl.g:2571:2: rule__ReportParameter__Group__3__Impl rule__ReportParameter__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ReportParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__3"


    // $ANTLR start "rule__ReportParameter__Group__3__Impl"
    // InternalMyDsl.g:2578:1: rule__ReportParameter__Group__3__Impl : ( ( rule__ReportParameter__ReparamAssignment_3 ) ) ;
    public final void rule__ReportParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( ( rule__ReportParameter__ReparamAssignment_3 ) ) )
            // InternalMyDsl.g:2583:1: ( ( rule__ReportParameter__ReparamAssignment_3 ) )
            {
            // InternalMyDsl.g:2583:1: ( ( rule__ReportParameter__ReparamAssignment_3 ) )
            // InternalMyDsl.g:2584:2: ( rule__ReportParameter__ReparamAssignment_3 )
            {
             before(grammarAccess.getReportParameterAccess().getReparamAssignment_3()); 
            // InternalMyDsl.g:2585:2: ( rule__ReportParameter__ReparamAssignment_3 )
            // InternalMyDsl.g:2585:3: rule__ReportParameter__ReparamAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ReportParameter__ReparamAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReportParameterAccess().getReparamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__3__Impl"


    // $ANTLR start "rule__ReportParameter__Group__4"
    // InternalMyDsl.g:2593:1: rule__ReportParameter__Group__4 : rule__ReportParameter__Group__4__Impl ;
    public final void rule__ReportParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__ReportParameter__Group__4__Impl )
            // InternalMyDsl.g:2598:2: rule__ReportParameter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReportParameter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__4"


    // $ANTLR start "rule__ReportParameter__Group__4__Impl"
    // InternalMyDsl.g:2604:1: rule__ReportParameter__Group__4__Impl : ( '}' ) ;
    public final void rule__ReportParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( '}' ) )
            // InternalMyDsl.g:2609:1: ( '}' )
            {
            // InternalMyDsl.g:2609:1: ( '}' )
            // InternalMyDsl.g:2610:2: '}'
            {
             before(grammarAccess.getReportParameterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReportParameterAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__Group__4__Impl"


    // $ANTLR start "rule__Model__QueriesAssignment_0"
    // InternalMyDsl.g:2620:1: rule__Model__QueriesAssignment_0 : ( ruleQuery ) ;
    public final void rule__Model__QueriesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( ( ruleQuery ) )
            // InternalMyDsl.g:2625:2: ( ruleQuery )
            {
            // InternalMyDsl.g:2625:2: ( ruleQuery )
            // InternalMyDsl.g:2626:3: ruleQuery
            {
             before(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QueriesAssignment_0"


    // $ANTLR start "rule__Model__ReportsAssignment_1"
    // InternalMyDsl.g:2635:1: rule__Model__ReportsAssignment_1 : ( ruleReport ) ;
    public final void rule__Model__ReportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2639:1: ( ( ruleReport ) )
            // InternalMyDsl.g:2640:2: ( ruleReport )
            {
            // InternalMyDsl.g:2640:2: ( ruleReport )
            // InternalMyDsl.g:2641:3: ruleReport
            {
             before(grammarAccess.getModelAccess().getReportsReportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getReportsReportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ReportsAssignment_1"


    // $ANTLR start "rule__MDXQuery__NameAssignment_0"
    // InternalMyDsl.g:2650:1: rule__MDXQuery__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MDXQuery__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2655:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2655:2: ( RULE_ID )
            // InternalMyDsl.g:2656:3: RULE_ID
            {
             before(grammarAccess.getMDXQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMDXQueryAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__NameAssignment_0"


    // $ANTLR start "rule__MDXQuery__QueryMDXAssignment_4"
    // InternalMyDsl.g:2665:1: rule__MDXQuery__QueryMDXAssignment_4 : ( ruleMDXQueryParameters ) ;
    public final void rule__MDXQuery__QueryMDXAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( ruleMDXQueryParameters ) )
            // InternalMyDsl.g:2670:2: ( ruleMDXQueryParameters )
            {
            // InternalMyDsl.g:2670:2: ( ruleMDXQueryParameters )
            // InternalMyDsl.g:2671:3: ruleMDXQueryParameters
            {
             before(grammarAccess.getMDXQueryAccess().getQueryMDXMDXQueryParametersParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMDXQueryParameters();

            state._fsp--;

             after(grammarAccess.getMDXQueryAccess().getQueryMDXMDXQueryParametersParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MDXQuery__QueryMDXAssignment_4"


    // $ANTLR start "rule__QueryReport__NameAssignment_0"
    // InternalMyDsl.g:2680:1: rule__QueryReport__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__QueryReport__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2685:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2685:2: ( RULE_ID )
            // InternalMyDsl.g:2686:3: RULE_ID
            {
             before(grammarAccess.getQueryReportAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryReportAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__NameAssignment_0"


    // $ANTLR start "rule__QueryReport__QueryReportAssignment_5"
    // InternalMyDsl.g:2695:1: rule__QueryReport__QueryReportAssignment_5 : ( ruleReportQueryParameters ) ;
    public final void rule__QueryReport__QueryReportAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( ( ruleReportQueryParameters ) )
            // InternalMyDsl.g:2700:2: ( ruleReportQueryParameters )
            {
            // InternalMyDsl.g:2700:2: ( ruleReportQueryParameters )
            // InternalMyDsl.g:2701:3: ruleReportQueryParameters
            {
             before(grammarAccess.getQueryReportAccess().getQueryReportReportQueryParametersParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReportQueryParameters();

            state._fsp--;

             after(grammarAccess.getQueryReportAccess().getQueryReportReportQueryParametersParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryReport__QueryReportAssignment_5"


    // $ANTLR start "rule__Report__RepoutAssignment_3"
    // InternalMyDsl.g:2710:1: rule__Report__RepoutAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Report__RepoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2714:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2715:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2715:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2716:3: ( RULE_ID )
            {
             before(grammarAccess.getReportAccess().getRepoutQueryCrossReference_3_0()); 
            // InternalMyDsl.g:2717:3: ( RULE_ID )
            // InternalMyDsl.g:2718:4: RULE_ID
            {
             before(grammarAccess.getReportAccess().getRepoutQueryIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReportAccess().getRepoutQueryIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReportAccess().getRepoutQueryCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__RepoutAssignment_3"


    // $ANTLR start "rule__Report__FromAssignment_5"
    // InternalMyDsl.g:2729:1: rule__Report__FromAssignment_5 : ( ruledatabase ) ;
    public final void rule__Report__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( ( ruledatabase ) )
            // InternalMyDsl.g:2734:2: ( ruledatabase )
            {
            // InternalMyDsl.g:2734:2: ( ruledatabase )
            // InternalMyDsl.g:2735:3: ruledatabase
            {
             before(grammarAccess.getReportAccess().getFromDatabaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruledatabase();

            state._fsp--;

             after(grammarAccess.getReportAccess().getFromDatabaseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Report__FromAssignment_5"


    // $ANTLR start "rule__Database__ValueAssignment"
    // InternalMyDsl.g:2744:1: rule__Database__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Database__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2749:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2749:2: ( RULE_STRING )
            // InternalMyDsl.g:2750:3: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__ValueAssignment"


    // $ANTLR start "rule__Descendants__GroupAssignment_1"
    // InternalMyDsl.g:2759:1: rule__Descendants__GroupAssignment_1 : ( RULE_ID ) ;
    public final void rule__Descendants__GroupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2764:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2764:2: ( RULE_ID )
            // InternalMyDsl.g:2765:3: RULE_ID
            {
             before(grammarAccess.getDescendantsAccess().getGroupIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDescendantsAccess().getGroupIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__GroupAssignment_1"


    // $ANTLR start "rule__Descendants__DimensionAssignment_3"
    // InternalMyDsl.g:2774:1: rule__Descendants__DimensionAssignment_3 : ( ruleReference ) ;
    public final void rule__Descendants__DimensionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2779:2: ( ruleReference )
            {
            // InternalMyDsl.g:2779:2: ( ruleReference )
            // InternalMyDsl.g:2780:3: ruleReference
            {
             before(grammarAccess.getDescendantsAccess().getDimensionReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getDescendantsAccess().getDimensionReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendants__DimensionAssignment_3"


    // $ANTLR start "rule__DimensionDeclaration__NameAssignment_1"
    // InternalMyDsl.g:2789:1: rule__DimensionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DimensionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2794:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2794:2: ( RULE_ID )
            // InternalMyDsl.g:2795:3: RULE_ID
            {
             before(grammarAccess.getDimensionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__NameAssignment_1"


    // $ANTLR start "rule__DimensionDeclaration__ValueAssignment_2"
    // InternalMyDsl.g:2804:1: rule__DimensionDeclaration__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DimensionDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2809:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2809:2: ( RULE_STRING )
            // InternalMyDsl.g:2810:3: RULE_STRING
            {
             before(grammarAccess.getDimensionDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDimensionDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__GroupDeclaration__NameAssignment_1"
    // InternalMyDsl.g:2819:1: rule__GroupDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GroupDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2824:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2824:2: ( RULE_ID )
            // InternalMyDsl.g:2825:3: RULE_ID
            {
             before(grammarAccess.getGroupDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__NameAssignment_1"


    // $ANTLR start "rule__GroupDeclaration__ValueAssignment_2"
    // InternalMyDsl.g:2834:1: rule__GroupDeclaration__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GroupDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2839:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2839:2: ( RULE_STRING )
            // InternalMyDsl.g:2840:3: RULE_STRING
            {
             before(grammarAccess.getGroupDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__MemberDeclaration__NameAssignment_1"
    // InternalMyDsl.g:2849:1: rule__MemberDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MemberDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2853:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2854:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2854:2: ( RULE_ID )
            // InternalMyDsl.g:2855:3: RULE_ID
            {
             before(grammarAccess.getMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__NameAssignment_1"


    // $ANTLR start "rule__MemberDeclaration__ValueAssignment_2"
    // InternalMyDsl.g:2864:1: rule__MemberDeclaration__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MemberDeclaration__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2868:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2869:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2869:2: ( RULE_STRING )
            // InternalMyDsl.g:2870:3: RULE_STRING
            {
             before(grammarAccess.getMemberDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMemberDeclarationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberDeclaration__ValueAssignment_2"


    // $ANTLR start "rule__Row__DimensionsAssignment_3"
    // InternalMyDsl.g:2879:1: rule__Row__DimensionsAssignment_3 : ( ruleReference ) ;
    public final void rule__Row__DimensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2883:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2884:2: ( ruleReference )
            {
            // InternalMyDsl.g:2884:2: ( ruleReference )
            // InternalMyDsl.g:2885:3: ruleReference
            {
             before(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__DimensionsAssignment_3"


    // $ANTLR start "rule__Row__DimensionsAssignment_4_1"
    // InternalMyDsl.g:2894:1: rule__Row__DimensionsAssignment_4_1 : ( ruleReference ) ;
    public final void rule__Row__DimensionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2899:2: ( ruleReference )
            {
            // InternalMyDsl.g:2899:2: ( ruleReference )
            // InternalMyDsl.g:2900:3: ruleReference
            {
             before(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getRowAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__DimensionsAssignment_4_1"


    // $ANTLR start "rule__Column__DimensionsAssignment_3"
    // InternalMyDsl.g:2909:1: rule__Column__DimensionsAssignment_3 : ( ruleReference ) ;
    public final void rule__Column__DimensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2913:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2914:2: ( ruleReference )
            {
            // InternalMyDsl.g:2914:2: ( ruleReference )
            // InternalMyDsl.g:2915:3: ruleReference
            {
             before(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__DimensionsAssignment_3"


    // $ANTLR start "rule__Column__DimensionsAssignment_4_1"
    // InternalMyDsl.g:2924:1: rule__Column__DimensionsAssignment_4_1 : ( ruleReference ) ;
    public final void rule__Column__DimensionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2928:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2929:2: ( ruleReference )
            {
            // InternalMyDsl.g:2929:2: ( ruleReference )
            // InternalMyDsl.g:2930:3: ruleReference
            {
             before(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__DimensionsAssignment_4_1"


    // $ANTLR start "rule__Link__DescAssignment_3"
    // InternalMyDsl.g:2939:1: rule__Link__DescAssignment_3 : ( ruleReference ) ;
    public final void rule__Link__DescAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2944:2: ( ruleReference )
            {
            // InternalMyDsl.g:2944:2: ( ruleReference )
            // InternalMyDsl.g:2945:3: ruleReference
            {
             before(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getDescReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__DescAssignment_3"


    // $ANTLR start "rule__Link__LevAssignment_5"
    // InternalMyDsl.g:2954:1: rule__Link__LevAssignment_5 : ( ruleReference ) ;
    public final void rule__Link__LevAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2959:2: ( ruleReference )
            {
            // InternalMyDsl.g:2959:2: ( ruleReference )
            // InternalMyDsl.g:2960:3: ruleReference
            {
             before(grammarAccess.getLinkAccess().getLevReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getLevReferenceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LevAssignment_5"


    // $ANTLR start "rule__Child__DimensionsAssignment_3"
    // InternalMyDsl.g:2969:1: rule__Child__DimensionsAssignment_3 : ( ruleReference ) ;
    public final void rule__Child__DimensionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2973:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2974:2: ( ruleReference )
            {
            // InternalMyDsl.g:2974:2: ( ruleReference )
            // InternalMyDsl.g:2975:3: ruleReference
            {
             before(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__DimensionsAssignment_3"


    // $ANTLR start "rule__Child__DimensionsAssignment_4_1"
    // InternalMyDsl.g:2984:1: rule__Child__DimensionsAssignment_4_1 : ( ruleReference ) ;
    public final void rule__Child__DimensionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2988:1: ( ( ruleReference ) )
            // InternalMyDsl.g:2989:2: ( ruleReference )
            {
            // InternalMyDsl.g:2989:2: ( ruleReference )
            // InternalMyDsl.g:2990:3: ruleReference
            {
             before(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getChildAccess().getDimensionsReferenceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Child__DimensionsAssignment_4_1"


    // $ANTLR start "rule__ReportParameter__ReparamAssignment_3"
    // InternalMyDsl.g:2999:1: rule__ReportParameter__ReparamAssignment_3 : ( ruleStringReference ) ;
    public final void rule__ReportParameter__ReparamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3003:1: ( ( ruleStringReference ) )
            // InternalMyDsl.g:3004:2: ( ruleStringReference )
            {
            // InternalMyDsl.g:3004:2: ( ruleStringReference )
            // InternalMyDsl.g:3005:3: ruleStringReference
            {
             before(grammarAccess.getReportParameterAccess().getReparamStringReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringReference();

            state._fsp--;

             after(grammarAccess.getReportParameterAccess().getReparamStringReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReportParameter__ReparamAssignment_3"


    // $ANTLR start "rule__Reference__ReferredAssignment_0"
    // InternalMyDsl.g:3014:1: rule__Reference__ReferredAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ReferredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3019:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3019:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3020:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getReferredDeclarationCrossReference_0_0()); 
            // InternalMyDsl.g:3021:3: ( RULE_ID )
            // InternalMyDsl.g:3022:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getReferredDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getReferredDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferredDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferredAssignment_0"


    // $ANTLR start "rule__StringReference__ValueAssignment"
    // InternalMyDsl.g:3033:1: rule__StringReference__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringReference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3038:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3038:2: ( RULE_STRING )
            // InternalMyDsl.g:3039:3: RULE_STRING
            {
             before(grammarAccess.getStringReferenceAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringReferenceAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringReference__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000007FC10030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000007FC00032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});

}