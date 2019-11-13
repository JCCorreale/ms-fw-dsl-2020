package it.unibo.jcc.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibo.jcc.xtext.services.SimpleAgentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleAgentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_VARID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Agent'", "'ip'", "'-mqtt'", "'System'", "'{'", "'}'", "'.'", "'Behavior'", "'planner'", "'init'", "'onGoalReached'", "'onSuspended'", "'onResumed'", "'ExternalBehavior'", "'context'", "'action'", "','", "'onEffect'", "'('", "')'", "'retry'", "'when'", "'replan'", "'setGoal'", "'Curmove'", "'CurGoal'", "'mqttBroker'", "':'", "'Event'", "'Signal'", "'Token'", "'Dispatch'", "'Request'", "'Invitation'", "'Context'", "'['", "'host='", "'port='", "']'", "'if'", "'ifSolved'", "'else'", "'printCurrentMessage'", "'println'", "'solve'", "'forward'", "'-m'", "'emit'", "'delay'", "'delayVar'", "'delayVarRef'", "'delaySol'", "'onMsg'", "'run'", "'myself'", "'machineExec'", "'$'", "'#'", "'@'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_VARID=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSimpleAgentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleAgentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleAgentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleAgent.g"; }



     	private SimpleAgentGrammarAccess grammarAccess;

        public InternalSimpleAgentParser(TokenStream input, SimpleAgentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SimpleAgent";
       	}

       	@Override
       	protected SimpleAgentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSimpleAgent"
    // InternalSimpleAgent.g:64:1: entryRuleSimpleAgent returns [EObject current=null] : iv_ruleSimpleAgent= ruleSimpleAgent EOF ;
    public final EObject entryRuleSimpleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAgent = null;


        try {
            // InternalSimpleAgent.g:64:52: (iv_ruleSimpleAgent= ruleSimpleAgent EOF )
            // InternalSimpleAgent.g:65:2: iv_ruleSimpleAgent= ruleSimpleAgent EOF
            {
             newCompositeNode(grammarAccess.getSimpleAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAgent=ruleSimpleAgent();

            state._fsp--;

             current =iv_ruleSimpleAgent; 
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
    // $ANTLR end "entryRuleSimpleAgent"


    // $ANTLR start "ruleSimpleAgent"
    // InternalSimpleAgent.g:71:1: ruleSimpleAgent returns [EObject current=null] : (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? otherlv_5= 'System' otherlv_6= '{' ( (lv_system_7_0= ruleQActorSystemSpec ) ) otherlv_8= '}' ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+ ) ;
    public final EObject ruleSimpleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_mqtt_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ip_3_0 = null;

        EObject lv_system_7_0 = null;

        EObject lv_behaviors_9_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:77:2: ( (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? otherlv_5= 'System' otherlv_6= '{' ( (lv_system_7_0= ruleQActorSystemSpec ) ) otherlv_8= '}' ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+ ) )
            // InternalSimpleAgent.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? otherlv_5= 'System' otherlv_6= '{' ( (lv_system_7_0= ruleQActorSystemSpec ) ) otherlv_8= '}' ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+ )
            {
            // InternalSimpleAgent.g:78:2: (otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? otherlv_5= 'System' otherlv_6= '{' ( (lv_system_7_0= ruleQActorSystemSpec ) ) otherlv_8= '}' ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+ )
            // InternalSimpleAgent.g:79:3: otherlv_0= 'Agent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? otherlv_5= 'System' otherlv_6= '{' ( (lv_system_7_0= ruleQActorSystemSpec ) ) otherlv_8= '}' ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleAgentAccess().getAgentKeyword_0());
            		
            // InternalSimpleAgent.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleAgentAccess().getIpKeyword_2());
            		
            // InternalSimpleAgent.g:105:3: ( (lv_ip_3_0= ruleComponentIP ) )
            // InternalSimpleAgent.g:106:4: (lv_ip_3_0= ruleComponentIP )
            {
            // InternalSimpleAgent.g:106:4: (lv_ip_3_0= ruleComponentIP )
            // InternalSimpleAgent.g:107:5: lv_ip_3_0= ruleComponentIP
            {

            					newCompositeNode(grammarAccess.getSimpleAgentAccess().getIpComponentIPParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_ip_3_0=ruleComponentIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleAgentRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.ComponentIP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleAgent.g:124:3: ( (lv_mqtt_4_0= '-mqtt' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimpleAgent.g:125:4: (lv_mqtt_4_0= '-mqtt' )
                    {
                    // InternalSimpleAgent.g:125:4: (lv_mqtt_4_0= '-mqtt' )
                    // InternalSimpleAgent.g:126:5: lv_mqtt_4_0= '-mqtt'
                    {
                    lv_mqtt_4_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_mqtt_4_0, grammarAccess.getSimpleAgentAccess().getMqttMqttKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleAgentRule());
                    					}
                    					setWithLastConsumed(current, "mqtt", lv_mqtt_4_0, "-mqtt");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleAgentAccess().getSystemKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleAgentAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSimpleAgent.g:146:3: ( (lv_system_7_0= ruleQActorSystemSpec ) )
            // InternalSimpleAgent.g:147:4: (lv_system_7_0= ruleQActorSystemSpec )
            {
            // InternalSimpleAgent.g:147:4: (lv_system_7_0= ruleQActorSystemSpec )
            // InternalSimpleAgent.g:148:5: lv_system_7_0= ruleQActorSystemSpec
            {

            					newCompositeNode(grammarAccess.getSimpleAgentAccess().getSystemQActorSystemSpecParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_system_7_0=ruleQActorSystemSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleAgentRule());
            					}
            					set(
            						current,
            						"system",
            						lv_system_7_0,
            						"it.unibo.jcc.xtext.SimpleAgent.QActorSystemSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getSimpleAgentAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalSimpleAgent.g:169:3: ( (lv_behaviors_9_0= ruleBehaviorDeclaration ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimpleAgent.g:170:4: (lv_behaviors_9_0= ruleBehaviorDeclaration )
            	    {
            	    // InternalSimpleAgent.g:170:4: (lv_behaviors_9_0= ruleBehaviorDeclaration )
            	    // InternalSimpleAgent.g:171:5: lv_behaviors_9_0= ruleBehaviorDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleAgentAccess().getBehaviorsBehaviorDeclarationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_behaviors_9_0=ruleBehaviorDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleAgentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviors",
            	    						lv_behaviors_9_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.BehaviorDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleSimpleAgent"


    // $ANTLR start "entryRuleQActorSystemSpec"
    // InternalSimpleAgent.g:192:1: entryRuleQActorSystemSpec returns [EObject current=null] : iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF ;
    public final EObject entryRuleQActorSystemSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQActorSystemSpec = null;


        try {
            // InternalSimpleAgent.g:192:57: (iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF )
            // InternalSimpleAgent.g:193:2: iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF
            {
             newCompositeNode(grammarAccess.getQActorSystemSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQActorSystemSpec=ruleQActorSystemSpec();

            state._fsp--;

             current =iv_ruleQActorSystemSpec; 
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
    // $ANTLR end "entryRuleQActorSystemSpec"


    // $ANTLR start "ruleQActorSystemSpec"
    // InternalSimpleAgent.g:199:1: ruleQActorSystemSpec returns [EObject current=null] : ( () ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ) ;
    public final EObject ruleQActorSystemSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_mqttBroker_1_0 = null;

        EObject lv_message_2_0 = null;

        EObject lv_context_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:205:2: ( ( () ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ) )
            // InternalSimpleAgent.g:206:2: ( () ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* )
            {
            // InternalSimpleAgent.g:206:2: ( () ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* )
            // InternalSimpleAgent.g:207:3: () ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )*
            {
            // InternalSimpleAgent.g:207:3: ()
            // InternalSimpleAgent.g:208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQActorSystemSpecAccess().getQActorSystemSpecAction_0(),
            					current);
            			

            }

            // InternalSimpleAgent.g:214:3: ( (lv_mqttBroker_1_0= ruleBrokerSpec ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSimpleAgent.g:215:4: (lv_mqttBroker_1_0= ruleBrokerSpec )
                    {
                    // InternalSimpleAgent.g:215:4: (lv_mqttBroker_1_0= ruleBrokerSpec )
                    // InternalSimpleAgent.g:216:5: lv_mqttBroker_1_0= ruleBrokerSpec
                    {

                    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getMqttBrokerBrokerSpecParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_mqttBroker_1_0=ruleBrokerSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
                    					}
                    					set(
                    						current,
                    						"mqttBroker",
                    						lv_mqttBroker_1_0,
                    						"it.unibo.jcc.xtext.SimpleAgent.BrokerSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimpleAgent.g:233:3: ( (lv_message_2_0= ruleMessage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=40 && LA4_0<=45)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimpleAgent.g:234:4: (lv_message_2_0= ruleMessage )
            	    {
            	    // InternalSimpleAgent.g:234:4: (lv_message_2_0= ruleMessage )
            	    // InternalSimpleAgent.g:235:5: lv_message_2_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getMessageMessageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_message_2_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"message",
            	    						lv_message_2_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSimpleAgent.g:252:3: ( (lv_context_3_0= ruleContext ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleAgent.g:253:4: (lv_context_3_0= ruleContext )
            	    {
            	    // InternalSimpleAgent.g:253:4: (lv_context_3_0= ruleContext )
            	    // InternalSimpleAgent.g:254:5: lv_context_3_0= ruleContext
            	    {

            	    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getContextContextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_context_3_0=ruleContext();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"context",
            	    						lv_context_3_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.Context");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleQActorSystemSpec"


    // $ANTLR start "entryRuleBehaviorDeclaration"
    // InternalSimpleAgent.g:275:1: entryRuleBehaviorDeclaration returns [EObject current=null] : iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF ;
    public final EObject entryRuleBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDeclaration = null;


        try {
            // InternalSimpleAgent.g:275:60: (iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF )
            // InternalSimpleAgent.g:276:2: iv_ruleBehaviorDeclaration= ruleBehaviorDeclaration EOF
            {
             newCompositeNode(grammarAccess.getBehaviorDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorDeclaration=ruleBehaviorDeclaration();

            state._fsp--;

             current =iv_ruleBehaviorDeclaration; 
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
    // $ANTLR end "entryRuleBehaviorDeclaration"


    // $ANTLR start "ruleBehaviorDeclaration"
    // InternalSimpleAgent.g:282:1: ruleBehaviorDeclaration returns [EObject current=null] : (this_Behavior_0= ruleBehavior | this_BehaviorExternal_1= ruleBehaviorExternal ) ;
    public final EObject ruleBehaviorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Behavior_0 = null;

        EObject this_BehaviorExternal_1 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:288:2: ( (this_Behavior_0= ruleBehavior | this_BehaviorExternal_1= ruleBehaviorExternal ) )
            // InternalSimpleAgent.g:289:2: (this_Behavior_0= ruleBehavior | this_BehaviorExternal_1= ruleBehaviorExternal )
            {
            // InternalSimpleAgent.g:289:2: (this_Behavior_0= ruleBehavior | this_BehaviorExternal_1= ruleBehaviorExternal )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleAgent.g:290:3: this_Behavior_0= ruleBehavior
                    {

                    			newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getBehaviorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Behavior_0=ruleBehavior();

                    state._fsp--;


                    			current = this_Behavior_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:299:3: this_BehaviorExternal_1= ruleBehaviorExternal
                    {

                    			newCompositeNode(grammarAccess.getBehaviorDeclarationAccess().getBehaviorExternalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BehaviorExternal_1=ruleBehaviorExternal();

                    state._fsp--;


                    			current = this_BehaviorExternal_1;
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
    // $ANTLR end "ruleBehaviorDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSimpleAgent.g:311:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSimpleAgent.g:311:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSimpleAgent.g:312:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSimpleAgent.g:318:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:324:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSimpleAgent.g:325:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSimpleAgent.g:325:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSimpleAgent.g:326:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSimpleAgent.g:333:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleAgent.g:334:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleBehavior"
    // InternalSimpleAgent.g:351:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalSimpleAgent.g:351:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalSimpleAgent.g:352:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalSimpleAgent.g:358:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'planner' ( (lv_planner_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_start_5_0= ruleAnyAction ) )? (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )? ( (lv_actions_10_0= ruleAction ) )* (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )? (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )? (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_planner_3_0 = null;

        EObject lv_start_5_0 = null;

        EObject lv_init_8_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_onGoalReached_13_0 = null;

        EObject lv_onSuspended_17_0 = null;

        EObject lv_onResumed_21_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:364:2: ( (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'planner' ( (lv_planner_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_start_5_0= ruleAnyAction ) )? (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )? ( (lv_actions_10_0= ruleAction ) )* (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )? (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )? (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalSimpleAgent.g:365:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'planner' ( (lv_planner_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_start_5_0= ruleAnyAction ) )? (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )? ( (lv_actions_10_0= ruleAction ) )* (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )? (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )? (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalSimpleAgent.g:365:2: (otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'planner' ( (lv_planner_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_start_5_0= ruleAnyAction ) )? (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )? ( (lv_actions_10_0= ruleAction ) )* (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )? (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )? (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )? otherlv_23= '}' )
            // InternalSimpleAgent.g:366:3: otherlv_0= 'Behavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'planner' ( (lv_planner_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_start_5_0= ruleAnyAction ) )? (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )? ( (lv_actions_10_0= ruleAction ) )* (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )? (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )? (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
            		
            // InternalSimpleAgent.g:370:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:371:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:371:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:372:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getPlannerKeyword_2());
            		
            // InternalSimpleAgent.g:392:3: ( (lv_planner_3_0= ruleQualifiedName ) )
            // InternalSimpleAgent.g:393:4: (lv_planner_3_0= ruleQualifiedName )
            {
            // InternalSimpleAgent.g:393:4: (lv_planner_3_0= ruleQualifiedName )
            // InternalSimpleAgent.g:394:5: lv_planner_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getBehaviorAccess().getPlannerQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_planner_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            					}
            					set(
            						current,
            						"planner",
            						lv_planner_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSimpleAgent.g:415:3: ( (lv_start_5_0= ruleAnyAction ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleAgent.g:416:4: (lv_start_5_0= ruleAnyAction )
                    {
                    // InternalSimpleAgent.g:416:4: (lv_start_5_0= ruleAnyAction )
                    // InternalSimpleAgent.g:417:5: lv_start_5_0= ruleAnyAction
                    {

                    					newCompositeNode(grammarAccess.getBehaviorAccess().getStartAnyActionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_start_5_0=ruleAnyAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    					}
                    					set(
                    						current,
                    						"start",
                    						lv_start_5_0,
                    						"it.unibo.jcc.xtext.SimpleAgent.AnyAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimpleAgent.g:434:3: (otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleAgent.g:435:4: otherlv_6= 'init' otherlv_7= '{' ( (lv_init_8_0= ruleActionBody ) ) otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getInitKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSimpleAgent.g:443:4: ( (lv_init_8_0= ruleActionBody ) )
                    // InternalSimpleAgent.g:444:5: (lv_init_8_0= ruleActionBody )
                    {
                    // InternalSimpleAgent.g:444:5: (lv_init_8_0= ruleActionBody )
                    // InternalSimpleAgent.g:445:6: lv_init_8_0= ruleActionBody
                    {

                    						newCompositeNode(grammarAccess.getBehaviorAccess().getInitActionBodyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_init_8_0=ruleActionBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_8_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalSimpleAgent.g:467:3: ( (lv_actions_10_0= ruleAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleAgent.g:468:4: (lv_actions_10_0= ruleAction )
            	    {
            	    // InternalSimpleAgent.g:468:4: (lv_actions_10_0= ruleAction )
            	    // InternalSimpleAgent.g:469:5: lv_actions_10_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getActionsActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_actions_10_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_10_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSimpleAgent.g:486:3: (otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleAgent.g:487:4: otherlv_11= 'onGoalReached' otherlv_12= '{' ( (lv_onGoalReached_13_0= ruleActionBody ) ) otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getBehaviorAccess().getOnGoalReachedKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalSimpleAgent.g:495:4: ( (lv_onGoalReached_13_0= ruleActionBody ) )
                    // InternalSimpleAgent.g:496:5: (lv_onGoalReached_13_0= ruleActionBody )
                    {
                    // InternalSimpleAgent.g:496:5: (lv_onGoalReached_13_0= ruleActionBody )
                    // InternalSimpleAgent.g:497:6: lv_onGoalReached_13_0= ruleActionBody
                    {

                    						newCompositeNode(grammarAccess.getBehaviorAccess().getOnGoalReachedActionBodyParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_onGoalReached_13_0=ruleActionBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    						}
                    						set(
                    							current,
                    							"onGoalReached",
                    							lv_onGoalReached_13_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalSimpleAgent.g:519:3: (otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleAgent.g:520:4: otherlv_15= 'onSuspended' otherlv_16= '{' ( (lv_onSuspended_17_0= ruleActionBody ) ) otherlv_18= '}'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getBehaviorAccess().getOnSuspendedKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalSimpleAgent.g:528:4: ( (lv_onSuspended_17_0= ruleActionBody ) )
                    // InternalSimpleAgent.g:529:5: (lv_onSuspended_17_0= ruleActionBody )
                    {
                    // InternalSimpleAgent.g:529:5: (lv_onSuspended_17_0= ruleActionBody )
                    // InternalSimpleAgent.g:530:6: lv_onSuspended_17_0= ruleActionBody
                    {

                    						newCompositeNode(grammarAccess.getBehaviorAccess().getOnSuspendedActionBodyParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_onSuspended_17_0=ruleActionBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    						}
                    						set(
                    							current,
                    							"onSuspended",
                    							lv_onSuspended_17_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,17,FOLLOW_22); 

                    				newLeafNode(otherlv_18, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

            }

            // InternalSimpleAgent.g:552:3: (otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleAgent.g:553:4: otherlv_19= 'onResumed' otherlv_20= '{' ( (lv_onResumed_21_0= ruleActionBody ) ) otherlv_22= '}'
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getBehaviorAccess().getOnResumedKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_20, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalSimpleAgent.g:561:4: ( (lv_onResumed_21_0= ruleActionBody ) )
                    // InternalSimpleAgent.g:562:5: (lv_onResumed_21_0= ruleActionBody )
                    {
                    // InternalSimpleAgent.g:562:5: (lv_onResumed_21_0= ruleActionBody )
                    // InternalSimpleAgent.g:563:6: lv_onResumed_21_0= ruleActionBody
                    {

                    						newCompositeNode(grammarAccess.getBehaviorAccess().getOnResumedActionBodyParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_onResumed_21_0=ruleActionBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    						}
                    						set(
                    							current,
                    							"onResumed",
                    							lv_onResumed_21_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_22, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleBehaviorExternal"
    // InternalSimpleAgent.g:593:1: entryRuleBehaviorExternal returns [EObject current=null] : iv_ruleBehaviorExternal= ruleBehaviorExternal EOF ;
    public final EObject entryRuleBehaviorExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorExternal = null;


        try {
            // InternalSimpleAgent.g:593:57: (iv_ruleBehaviorExternal= ruleBehaviorExternal EOF )
            // InternalSimpleAgent.g:594:2: iv_ruleBehaviorExternal= ruleBehaviorExternal EOF
            {
             newCompositeNode(grammarAccess.getBehaviorExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorExternal=ruleBehaviorExternal();

            state._fsp--;

             current =iv_ruleBehaviorExternal; 
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
    // $ANTLR end "entryRuleBehaviorExternal"


    // $ANTLR start "ruleBehaviorExternal"
    // InternalSimpleAgent.g:600:1: ruleBehaviorExternal returns [EObject current=null] : (otherlv_0= 'ExternalBehavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleBehaviorExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:606:2: ( (otherlv_0= 'ExternalBehavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSimpleAgent.g:607:2: (otherlv_0= 'ExternalBehavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSimpleAgent.g:607:2: (otherlv_0= 'ExternalBehavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) )
            // InternalSimpleAgent.g:608:3: otherlv_0= 'ExternalBehavior' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBehaviorExternalAccess().getExternalBehaviorKeyword_0());
            		
            // InternalSimpleAgent.g:612:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:613:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:613:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:614:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorExternalAccess().getContextKeyword_2());
            		
            // InternalSimpleAgent.g:634:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleAgent.g:635:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleAgent.g:635:4: (otherlv_3= RULE_ID )
            // InternalSimpleAgent.g:636:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBehaviorExternalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getBehaviorExternalAccess().getContextContextCrossReference_3_0());
            				

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
    // $ANTLR end "ruleBehaviorExternal"


    // $ANTLR start "entryRuleAction"
    // InternalSimpleAgent.g:651:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSimpleAgent.g:651:47: (iv_ruleAction= ruleAction EOF )
            // InternalSimpleAgent.g:652:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSimpleAgent.g:658:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actions_1_0= rulePHead ) ) (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )* otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_on_7_0= ruleOnEffect ) )* ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actions_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_on_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:664:2: ( (otherlv_0= 'action' ( (lv_actions_1_0= rulePHead ) ) (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )* otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_on_7_0= ruleOnEffect ) )* ) )
            // InternalSimpleAgent.g:665:2: (otherlv_0= 'action' ( (lv_actions_1_0= rulePHead ) ) (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )* otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_on_7_0= ruleOnEffect ) )* )
            {
            // InternalSimpleAgent.g:665:2: (otherlv_0= 'action' ( (lv_actions_1_0= rulePHead ) ) (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )* otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_on_7_0= ruleOnEffect ) )* )
            // InternalSimpleAgent.g:666:3: otherlv_0= 'action' ( (lv_actions_1_0= rulePHead ) ) (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )* otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_on_7_0= ruleOnEffect ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalSimpleAgent.g:670:3: ( (lv_actions_1_0= rulePHead ) )
            // InternalSimpleAgent.g:671:4: (lv_actions_1_0= rulePHead )
            {
            // InternalSimpleAgent.g:671:4: (lv_actions_1_0= rulePHead )
            // InternalSimpleAgent.g:672:5: lv_actions_1_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionsPHeadParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_actions_1_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleAgent.g:689:3: (otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSimpleAgent.g:690:4: otherlv_2= ',' ( (lv_actions_3_0= rulePHead ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSimpleAgent.g:694:4: ( (lv_actions_3_0= rulePHead ) )
            	    // InternalSimpleAgent.g:695:5: (lv_actions_3_0= rulePHead )
            	    {
            	    // InternalSimpleAgent.g:695:5: (lv_actions_3_0= rulePHead )
            	    // InternalSimpleAgent.g:696:6: lv_actions_3_0= rulePHead
            	    {

            	    						newCompositeNode(grammarAccess.getActionAccess().getActionsPHeadParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_actions_3_0=rulePHead();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_3_0,
            	    							"it.unibo.jcc.xtext.SimpleAgent.PHead");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSimpleAgent.g:718:3: ( (lv_body_5_0= ruleActionBody ) )
            // InternalSimpleAgent.g:719:4: (lv_body_5_0= ruleActionBody )
            {
            // InternalSimpleAgent.g:719:4: (lv_body_5_0= ruleActionBody )
            // InternalSimpleAgent.g:720:5: lv_body_5_0= ruleActionBody
            {

            					newCompositeNode(grammarAccess.getActionAccess().getBodyActionBodyParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_5_0=ruleActionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalSimpleAgent.g:741:3: ( (lv_on_7_0= ruleOnEffect ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSimpleAgent.g:742:4: (lv_on_7_0= ruleOnEffect )
            	    {
            	    // InternalSimpleAgent.g:742:4: (lv_on_7_0= ruleOnEffect )
            	    // InternalSimpleAgent.g:743:5: lv_on_7_0= ruleOnEffect
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getOnOnEffectParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_on_7_0=ruleOnEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"on",
            	    						lv_on_7_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.OnEffect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOnEffect"
    // InternalSimpleAgent.g:764:1: entryRuleOnEffect returns [EObject current=null] : iv_ruleOnEffect= ruleOnEffect EOF ;
    public final EObject entryRuleOnEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnEffect = null;


        try {
            // InternalSimpleAgent.g:764:49: (iv_ruleOnEffect= ruleOnEffect EOF )
            // InternalSimpleAgent.g:765:2: iv_ruleOnEffect= ruleOnEffect EOF
            {
             newCompositeNode(grammarAccess.getOnEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnEffect=ruleOnEffect();

            state._fsp--;

             current =iv_ruleOnEffect; 
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
    // $ANTLR end "entryRuleOnEffect"


    // $ANTLR start "ruleOnEffect"
    // InternalSimpleAgent.g:771:1: ruleOnEffect returns [EObject current=null] : (otherlv_0= 'onEffect' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_compensations_7_0= ruleCompensation ) )* ) ;
    public final EObject ruleOnEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;

        EObject lv_compensations_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:777:2: ( (otherlv_0= 'onEffect' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_compensations_7_0= ruleCompensation ) )* ) )
            // InternalSimpleAgent.g:778:2: (otherlv_0= 'onEffect' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_compensations_7_0= ruleCompensation ) )* )
            {
            // InternalSimpleAgent.g:778:2: (otherlv_0= 'onEffect' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_compensations_7_0= ruleCompensation ) )* )
            // InternalSimpleAgent.g:779:3: otherlv_0= 'onEffect' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleActionBody ) ) otherlv_6= '}' ( (lv_compensations_7_0= ruleCompensation ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getOnEffectAccess().getOnEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOnEffectAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSimpleAgent.g:787:3: ( (otherlv_2= RULE_ID ) )
            // InternalSimpleAgent.g:788:4: (otherlv_2= RULE_ID )
            {
            // InternalSimpleAgent.g:788:4: (otherlv_2= RULE_ID )
            // InternalSimpleAgent.g:789:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getOnEffectAccess().getEffectMessageCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getOnEffectAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getOnEffectAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSimpleAgent.g:808:3: ( (lv_body_5_0= ruleActionBody ) )
            // InternalSimpleAgent.g:809:4: (lv_body_5_0= ruleActionBody )
            {
            // InternalSimpleAgent.g:809:4: (lv_body_5_0= ruleActionBody )
            // InternalSimpleAgent.g:810:5: lv_body_5_0= ruleActionBody
            {

            					newCompositeNode(grammarAccess.getOnEffectAccess().getBodyActionBodyParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_5_0=ruleActionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnEffectRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getOnEffectAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalSimpleAgent.g:831:3: ( (lv_compensations_7_0= ruleCompensation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||(LA16_0>=34 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSimpleAgent.g:832:4: (lv_compensations_7_0= ruleCompensation )
            	    {
            	    // InternalSimpleAgent.g:832:4: (lv_compensations_7_0= ruleCompensation )
            	    // InternalSimpleAgent.g:833:5: lv_compensations_7_0= ruleCompensation
            	    {

            	    					newCompositeNode(grammarAccess.getOnEffectAccess().getCompensationsCompensationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_compensations_7_0=ruleCompensation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOnEffectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compensations",
            	    						lv_compensations_7_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.Compensation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleOnEffect"


    // $ANTLR start "entryRuleCompensation"
    // InternalSimpleAgent.g:854:1: entryRuleCompensation returns [EObject current=null] : iv_ruleCompensation= ruleCompensation EOF ;
    public final EObject entryRuleCompensation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompensation = null;


        try {
            // InternalSimpleAgent.g:854:53: (iv_ruleCompensation= ruleCompensation EOF )
            // InternalSimpleAgent.g:855:2: iv_ruleCompensation= ruleCompensation EOF
            {
             newCompositeNode(grammarAccess.getCompensationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompensation=ruleCompensation();

            state._fsp--;

             current =iv_ruleCompensation; 
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
    // $ANTLR end "entryRuleCompensation"


    // $ANTLR start "ruleCompensation"
    // InternalSimpleAgent.g:861:1: ruleCompensation returns [EObject current=null] : ( ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? ) | ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? ) | ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? ) ) ;
    public final EObject ruleCompensation() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_type_6_0=null;
        Token otherlv_7=null;
        Token lv_condition_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_type_12_0=null;
        Token lv_goal_13_0=null;
        Token otherlv_14=null;
        Token lv_condition_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_body_4_0 = null;

        EObject lv_body_10_0 = null;

        EObject lv_body_17_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:867:2: ( ( ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? ) | ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? ) | ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? ) ) )
            // InternalSimpleAgent.g:868:2: ( ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? ) | ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? ) | ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? ) )
            {
            // InternalSimpleAgent.g:868:2: ( ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? ) | ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? ) | ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 35:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalSimpleAgent.g:869:3: ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? )
                    {
                    // InternalSimpleAgent.g:869:3: ( ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )? )
                    // InternalSimpleAgent.g:870:4: ( (lv_type_0_0= 'retry' ) ) otherlv_1= 'when' ( (lv_condition_2_0= RULE_STRING ) ) (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )?
                    {
                    // InternalSimpleAgent.g:870:4: ( (lv_type_0_0= 'retry' ) )
                    // InternalSimpleAgent.g:871:5: (lv_type_0_0= 'retry' )
                    {
                    // InternalSimpleAgent.g:871:5: (lv_type_0_0= 'retry' )
                    // InternalSimpleAgent.g:872:6: lv_type_0_0= 'retry'
                    {
                    lv_type_0_0=(Token)match(input,32,FOLLOW_30); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getCompensationAccess().getTypeRetryKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "retry");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompensationAccess().getWhenKeyword_0_1());
                    			
                    // InternalSimpleAgent.g:888:4: ( (lv_condition_2_0= RULE_STRING ) )
                    // InternalSimpleAgent.g:889:5: (lv_condition_2_0= RULE_STRING )
                    {
                    // InternalSimpleAgent.g:889:5: (lv_condition_2_0= RULE_STRING )
                    // InternalSimpleAgent.g:890:6: lv_condition_2_0= RULE_STRING
                    {
                    lv_condition_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_condition_2_0, grammarAccess.getCompensationAccess().getConditionSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSimpleAgent.g:906:4: (otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==16) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalSimpleAgent.g:907:5: otherlv_3= '{' ( (lv_body_4_0= ruleActionBody ) ) otherlv_5= '}'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_19); 

                            					newLeafNode(otherlv_3, grammarAccess.getCompensationAccess().getLeftCurlyBracketKeyword_0_3_0());
                            				
                            // InternalSimpleAgent.g:911:5: ( (lv_body_4_0= ruleActionBody ) )
                            // InternalSimpleAgent.g:912:6: (lv_body_4_0= ruleActionBody )
                            {
                            // InternalSimpleAgent.g:912:6: (lv_body_4_0= ruleActionBody )
                            // InternalSimpleAgent.g:913:7: lv_body_4_0= ruleActionBody
                            {

                            							newCompositeNode(grammarAccess.getCompensationAccess().getBodyActionBodyParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_body_4_0=ruleActionBody();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCompensationRule());
                            							}
                            							set(
                            								current,
                            								"body",
                            								lv_body_4_0,
                            								"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getCompensationAccess().getRightCurlyBracketKeyword_0_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:937:3: ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? )
                    {
                    // InternalSimpleAgent.g:937:3: ( ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )? )
                    // InternalSimpleAgent.g:938:4: ( (lv_type_6_0= 'replan' ) ) otherlv_7= 'when' ( (lv_condition_8_0= RULE_STRING ) ) (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )?
                    {
                    // InternalSimpleAgent.g:938:4: ( (lv_type_6_0= 'replan' ) )
                    // InternalSimpleAgent.g:939:5: (lv_type_6_0= 'replan' )
                    {
                    // InternalSimpleAgent.g:939:5: (lv_type_6_0= 'replan' )
                    // InternalSimpleAgent.g:940:6: lv_type_6_0= 'replan'
                    {
                    lv_type_6_0=(Token)match(input,34,FOLLOW_30); 

                    						newLeafNode(lv_type_6_0, grammarAccess.getCompensationAccess().getTypeReplanKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_6_0, "replan");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompensationAccess().getWhenKeyword_1_1());
                    			
                    // InternalSimpleAgent.g:956:4: ( (lv_condition_8_0= RULE_STRING ) )
                    // InternalSimpleAgent.g:957:5: (lv_condition_8_0= RULE_STRING )
                    {
                    // InternalSimpleAgent.g:957:5: (lv_condition_8_0= RULE_STRING )
                    // InternalSimpleAgent.g:958:6: lv_condition_8_0= RULE_STRING
                    {
                    lv_condition_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_condition_8_0, grammarAccess.getCompensationAccess().getConditionSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSimpleAgent.g:974:4: (otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==16) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSimpleAgent.g:975:5: otherlv_9= '{' ( (lv_body_10_0= ruleActionBody ) ) otherlv_11= '}'
                            {
                            otherlv_9=(Token)match(input,16,FOLLOW_19); 

                            					newLeafNode(otherlv_9, grammarAccess.getCompensationAccess().getLeftCurlyBracketKeyword_1_3_0());
                            				
                            // InternalSimpleAgent.g:979:5: ( (lv_body_10_0= ruleActionBody ) )
                            // InternalSimpleAgent.g:980:6: (lv_body_10_0= ruleActionBody )
                            {
                            // InternalSimpleAgent.g:980:6: (lv_body_10_0= ruleActionBody )
                            // InternalSimpleAgent.g:981:7: lv_body_10_0= ruleActionBody
                            {

                            							newCompositeNode(grammarAccess.getCompensationAccess().getBodyActionBodyParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_body_10_0=ruleActionBody();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCompensationRule());
                            							}
                            							set(
                            								current,
                            								"body",
                            								lv_body_10_0,
                            								"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_11=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getCompensationAccess().getRightCurlyBracketKeyword_1_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:1005:3: ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? )
                    {
                    // InternalSimpleAgent.g:1005:3: ( ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )? )
                    // InternalSimpleAgent.g:1006:4: ( (lv_type_12_0= 'setGoal' ) ) ( (lv_goal_13_0= RULE_STRING ) ) otherlv_14= 'when' ( (lv_condition_15_0= RULE_STRING ) ) (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )?
                    {
                    // InternalSimpleAgent.g:1006:4: ( (lv_type_12_0= 'setGoal' ) )
                    // InternalSimpleAgent.g:1007:5: (lv_type_12_0= 'setGoal' )
                    {
                    // InternalSimpleAgent.g:1007:5: (lv_type_12_0= 'setGoal' )
                    // InternalSimpleAgent.g:1008:6: lv_type_12_0= 'setGoal'
                    {
                    lv_type_12_0=(Token)match(input,35,FOLLOW_31); 

                    						newLeafNode(lv_type_12_0, grammarAccess.getCompensationAccess().getTypeSetGoalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_12_0, "setGoal");
                    					

                    }


                    }

                    // InternalSimpleAgent.g:1020:4: ( (lv_goal_13_0= RULE_STRING ) )
                    // InternalSimpleAgent.g:1021:5: (lv_goal_13_0= RULE_STRING )
                    {
                    // InternalSimpleAgent.g:1021:5: (lv_goal_13_0= RULE_STRING )
                    // InternalSimpleAgent.g:1022:6: lv_goal_13_0= RULE_STRING
                    {
                    lv_goal_13_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_goal_13_0, grammarAccess.getCompensationAccess().getGoalSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"goal",
                    							lv_goal_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_14, grammarAccess.getCompensationAccess().getWhenKeyword_2_2());
                    			
                    // InternalSimpleAgent.g:1042:4: ( (lv_condition_15_0= RULE_STRING ) )
                    // InternalSimpleAgent.g:1043:5: (lv_condition_15_0= RULE_STRING )
                    {
                    // InternalSimpleAgent.g:1043:5: (lv_condition_15_0= RULE_STRING )
                    // InternalSimpleAgent.g:1044:6: lv_condition_15_0= RULE_STRING
                    {
                    lv_condition_15_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_condition_15_0, grammarAccess.getCompensationAccess().getConditionSTRINGTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompensationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSimpleAgent.g:1060:4: (otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==16) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalSimpleAgent.g:1061:5: otherlv_16= '{' ( (lv_body_17_0= ruleActionBody ) ) otherlv_18= '}'
                            {
                            otherlv_16=(Token)match(input,16,FOLLOW_19); 

                            					newLeafNode(otherlv_16, grammarAccess.getCompensationAccess().getLeftCurlyBracketKeyword_2_4_0());
                            				
                            // InternalSimpleAgent.g:1065:5: ( (lv_body_17_0= ruleActionBody ) )
                            // InternalSimpleAgent.g:1066:6: (lv_body_17_0= ruleActionBody )
                            {
                            // InternalSimpleAgent.g:1066:6: (lv_body_17_0= ruleActionBody )
                            // InternalSimpleAgent.g:1067:7: lv_body_17_0= ruleActionBody
                            {

                            							newCompositeNode(grammarAccess.getCompensationAccess().getBodyActionBodyParserRuleCall_2_4_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_body_17_0=ruleActionBody();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCompensationRule());
                            							}
                            							set(
                            								current,
                            								"body",
                            								lv_body_17_0,
                            								"it.unibo.jcc.xtext.SimpleAgent.ActionBody");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_18=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_18, grammarAccess.getCompensationAccess().getRightCurlyBracketKeyword_2_4_2());
                            				

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleCompensation"


    // $ANTLR start "entryRuleActionBody"
    // InternalSimpleAgent.g:1094:1: entryRuleActionBody returns [EObject current=null] : iv_ruleActionBody= ruleActionBody EOF ;
    public final EObject entryRuleActionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionBody = null;


        try {
            // InternalSimpleAgent.g:1094:51: (iv_ruleActionBody= ruleActionBody EOF )
            // InternalSimpleAgent.g:1095:2: iv_ruleActionBody= ruleActionBody EOF
            {
             newCompositeNode(grammarAccess.getActionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionBody=ruleActionBody();

            state._fsp--;

             current =iv_ruleActionBody; 
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
    // $ANTLR end "entryRuleActionBody"


    // $ANTLR start "ruleActionBody"
    // InternalSimpleAgent.g:1101:1: ruleActionBody returns [EObject current=null] : ( () ( (lv_instructions_1_0= ruleGuardedStateAction ) )* ) ;
    public final EObject ruleActionBody() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1107:2: ( ( () ( (lv_instructions_1_0= ruleGuardedStateAction ) )* ) )
            // InternalSimpleAgent.g:1108:2: ( () ( (lv_instructions_1_0= ruleGuardedStateAction ) )* )
            {
            // InternalSimpleAgent.g:1108:2: ( () ( (lv_instructions_1_0= ruleGuardedStateAction ) )* )
            // InternalSimpleAgent.g:1109:3: () ( (lv_instructions_1_0= ruleGuardedStateAction ) )*
            {
            // InternalSimpleAgent.g:1109:3: ()
            // InternalSimpleAgent.g:1110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionBodyAccess().getActionBodyAction_0(),
            					current);
            			

            }

            // InternalSimpleAgent.g:1116:3: ( (lv_instructions_1_0= ruleGuardedStateAction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==47||(LA21_0>=51 && LA21_0<=52)||(LA21_0>=54 && LA21_0<=57)||(LA21_0>=59 && LA21_0<=65)||LA21_0==67) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSimpleAgent.g:1117:4: (lv_instructions_1_0= ruleGuardedStateAction )
            	    {
            	    // InternalSimpleAgent.g:1117:4: (lv_instructions_1_0= ruleGuardedStateAction )
            	    // InternalSimpleAgent.g:1118:5: lv_instructions_1_0= ruleGuardedStateAction
            	    {

            	    					newCompositeNode(grammarAccess.getActionBodyAccess().getInstructionsGuardedStateActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_instructions_1_0=ruleGuardedStateAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_1_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.GuardedStateAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleActionBody"


    // $ANTLR start "entryRuleCodeRunArg"
    // InternalSimpleAgent.g:1139:1: entryRuleCodeRunArg returns [EObject current=null] : iv_ruleCodeRunArg= ruleCodeRunArg EOF ;
    public final EObject entryRuleCodeRunArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRunArg = null;


        try {
            // InternalSimpleAgent.g:1139:51: (iv_ruleCodeRunArg= ruleCodeRunArg EOF )
            // InternalSimpleAgent.g:1140:2: iv_ruleCodeRunArg= ruleCodeRunArg EOF
            {
             newCompositeNode(grammarAccess.getCodeRunArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeRunArg=ruleCodeRunArg();

            state._fsp--;

             current =iv_ruleCodeRunArg; 
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
    // $ANTLR end "entryRuleCodeRunArg"


    // $ANTLR start "ruleCodeRunArg"
    // InternalSimpleAgent.g:1146:1: ruleCodeRunArg returns [EObject current=null] : (this_PHead_0= rulePHead | ( () ruleBuiltinVar ) ) ;
    public final EObject ruleCodeRunArg() throws RecognitionException {
        EObject current = null;

        EObject this_PHead_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1152:2: ( (this_PHead_0= rulePHead | ( () ruleBuiltinVar ) ) )
            // InternalSimpleAgent.g:1153:2: (this_PHead_0= rulePHead | ( () ruleBuiltinVar ) )
            {
            // InternalSimpleAgent.g:1153:2: (this_PHead_0= rulePHead | ( () ruleBuiltinVar ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_VARID)||(LA22_0>=68 && LA22_0<=70)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=36 && LA22_0<=37)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSimpleAgent.g:1154:3: this_PHead_0= rulePHead
                    {

                    			newCompositeNode(grammarAccess.getCodeRunArgAccess().getPHeadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PHead_0=rulePHead();

                    state._fsp--;


                    			current = this_PHead_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1163:3: ( () ruleBuiltinVar )
                    {
                    // InternalSimpleAgent.g:1163:3: ( () ruleBuiltinVar )
                    // InternalSimpleAgent.g:1164:4: () ruleBuiltinVar
                    {
                    // InternalSimpleAgent.g:1164:4: ()
                    // InternalSimpleAgent.g:1165:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCodeRunArgAccess().getCodeRunArgAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getCodeRunArgAccess().getBuiltinVarParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBuiltinVar();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleCodeRunArg"


    // $ANTLR start "entryRuleBuiltinVar"
    // InternalSimpleAgent.g:1183:1: entryRuleBuiltinVar returns [String current=null] : iv_ruleBuiltinVar= ruleBuiltinVar EOF ;
    public final String entryRuleBuiltinVar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBuiltinVar = null;


        try {
            // InternalSimpleAgent.g:1183:50: (iv_ruleBuiltinVar= ruleBuiltinVar EOF )
            // InternalSimpleAgent.g:1184:2: iv_ruleBuiltinVar= ruleBuiltinVar EOF
            {
             newCompositeNode(grammarAccess.getBuiltinVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuiltinVar=ruleBuiltinVar();

            state._fsp--;

             current =iv_ruleBuiltinVar.getText(); 
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
    // $ANTLR end "entryRuleBuiltinVar"


    // $ANTLR start "ruleBuiltinVar"
    // InternalSimpleAgent.g:1190:1: ruleBuiltinVar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Curmove' | kw= 'CurGoal' ) ;
    public final AntlrDatatypeRuleToken ruleBuiltinVar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:1196:2: ( (kw= 'Curmove' | kw= 'CurGoal' ) )
            // InternalSimpleAgent.g:1197:2: (kw= 'Curmove' | kw= 'CurGoal' )
            {
            // InternalSimpleAgent.g:1197:2: (kw= 'Curmove' | kw= 'CurGoal' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSimpleAgent.g:1198:3: kw= 'Curmove'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinVarAccess().getCurmoveKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1204:3: kw= 'CurGoal'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBuiltinVarAccess().getCurGoalKeyword_1());
                    		

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
    // $ANTLR end "ruleBuiltinVar"


    // $ANTLR start "entryRuleBrokerSpec"
    // InternalSimpleAgent.g:1213:1: entryRuleBrokerSpec returns [EObject current=null] : iv_ruleBrokerSpec= ruleBrokerSpec EOF ;
    public final EObject entryRuleBrokerSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrokerSpec = null;


        try {
            // InternalSimpleAgent.g:1213:51: (iv_ruleBrokerSpec= ruleBrokerSpec EOF )
            // InternalSimpleAgent.g:1214:2: iv_ruleBrokerSpec= ruleBrokerSpec EOF
            {
             newCompositeNode(grammarAccess.getBrokerSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrokerSpec=ruleBrokerSpec();

            state._fsp--;

             current =iv_ruleBrokerSpec; 
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
    // $ANTLR end "entryRuleBrokerSpec"


    // $ANTLR start "ruleBrokerSpec"
    // InternalSimpleAgent.g:1220:1: ruleBrokerSpec returns [EObject current=null] : (otherlv_0= 'mqttBroker' ( (lv_brokerHost_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_brokerPort_3_0= RULE_INT ) ) ) ;
    public final EObject ruleBrokerSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_brokerHost_1_0=null;
        Token otherlv_2=null;
        Token lv_brokerPort_3_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:1226:2: ( (otherlv_0= 'mqttBroker' ( (lv_brokerHost_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_brokerPort_3_0= RULE_INT ) ) ) )
            // InternalSimpleAgent.g:1227:2: (otherlv_0= 'mqttBroker' ( (lv_brokerHost_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_brokerPort_3_0= RULE_INT ) ) )
            {
            // InternalSimpleAgent.g:1227:2: (otherlv_0= 'mqttBroker' ( (lv_brokerHost_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_brokerPort_3_0= RULE_INT ) ) )
            // InternalSimpleAgent.g:1228:3: otherlv_0= 'mqttBroker' ( (lv_brokerHost_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_brokerPort_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getBrokerSpecAccess().getMqttBrokerKeyword_0());
            		
            // InternalSimpleAgent.g:1232:3: ( (lv_brokerHost_1_0= RULE_STRING ) )
            // InternalSimpleAgent.g:1233:4: (lv_brokerHost_1_0= RULE_STRING )
            {
            // InternalSimpleAgent.g:1233:4: (lv_brokerHost_1_0= RULE_STRING )
            // InternalSimpleAgent.g:1234:5: lv_brokerHost_1_0= RULE_STRING
            {
            lv_brokerHost_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_brokerHost_1_0, grammarAccess.getBrokerSpecAccess().getBrokerHostSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrokerSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"brokerHost",
            						lv_brokerHost_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getBrokerSpecAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1254:3: ( (lv_brokerPort_3_0= RULE_INT ) )
            // InternalSimpleAgent.g:1255:4: (lv_brokerPort_3_0= RULE_INT )
            {
            // InternalSimpleAgent.g:1255:4: (lv_brokerPort_3_0= RULE_INT )
            // InternalSimpleAgent.g:1256:5: lv_brokerPort_3_0= RULE_INT
            {
            lv_brokerPort_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_brokerPort_3_0, grammarAccess.getBrokerSpecAccess().getBrokerPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrokerSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"brokerPort",
            						lv_brokerPort_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleBrokerSpec"


    // $ANTLR start "entryRuleMessage"
    // InternalSimpleAgent.g:1276:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalSimpleAgent.g:1276:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalSimpleAgent.g:1277:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalSimpleAgent.g:1283:1: ruleMessage returns [EObject current=null] : (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_OutOnlyMessage_0 = null;

        EObject this_OutInMessage_1 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1289:2: ( (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage ) )
            // InternalSimpleAgent.g:1290:2: (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage )
            {
            // InternalSimpleAgent.g:1290:2: (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=40 && LA24_0<=43)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=44 && LA24_0<=45)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSimpleAgent.g:1291:3: this_OutOnlyMessage_0= ruleOutOnlyMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getOutOnlyMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutOnlyMessage_0=ruleOutOnlyMessage();

                    state._fsp--;


                    			current = this_OutOnlyMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1300:3: this_OutInMessage_1= ruleOutInMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getOutInMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutInMessage_1=ruleOutInMessage();

                    state._fsp--;


                    			current = this_OutInMessage_1;
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleOutOnlyMessage"
    // InternalSimpleAgent.g:1312:1: entryRuleOutOnlyMessage returns [EObject current=null] : iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF ;
    public final EObject entryRuleOutOnlyMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOnlyMessage = null;


        try {
            // InternalSimpleAgent.g:1312:55: (iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF )
            // InternalSimpleAgent.g:1313:2: iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF
            {
             newCompositeNode(grammarAccess.getOutOnlyMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOnlyMessage=ruleOutOnlyMessage();

            state._fsp--;

             current =iv_ruleOutOnlyMessage; 
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
    // $ANTLR end "entryRuleOutOnlyMessage"


    // $ANTLR start "ruleOutOnlyMessage"
    // InternalSimpleAgent.g:1319:1: ruleOutOnlyMessage returns [EObject current=null] : (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken ) ;
    public final EObject ruleOutOnlyMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Dispatch_0 = null;

        EObject this_Event_1 = null;

        EObject this_Signal_2 = null;

        EObject this_Token_3 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1325:2: ( (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken ) )
            // InternalSimpleAgent.g:1326:2: (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken )
            {
            // InternalSimpleAgent.g:1326:2: (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSimpleAgent.g:1327:3: this_Dispatch_0= ruleDispatch
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getDispatchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dispatch_0=ruleDispatch();

                    state._fsp--;


                    			current = this_Dispatch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1336:3: this_Event_1= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;


                    			current = this_Event_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:1345:3: this_Signal_2= ruleSignal
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getSignalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signal_2=ruleSignal();

                    state._fsp--;


                    			current = this_Signal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleAgent.g:1354:3: this_Token_3= ruleToken
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getTokenParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Token_3=ruleToken();

                    state._fsp--;


                    			current = this_Token_3;
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
    // $ANTLR end "ruleOutOnlyMessage"


    // $ANTLR start "entryRuleOutInMessage"
    // InternalSimpleAgent.g:1366:1: entryRuleOutInMessage returns [EObject current=null] : iv_ruleOutInMessage= ruleOutInMessage EOF ;
    public final EObject entryRuleOutInMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutInMessage = null;


        try {
            // InternalSimpleAgent.g:1366:53: (iv_ruleOutInMessage= ruleOutInMessage EOF )
            // InternalSimpleAgent.g:1367:2: iv_ruleOutInMessage= ruleOutInMessage EOF
            {
             newCompositeNode(grammarAccess.getOutInMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutInMessage=ruleOutInMessage();

            state._fsp--;

             current =iv_ruleOutInMessage; 
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
    // $ANTLR end "entryRuleOutInMessage"


    // $ANTLR start "ruleOutInMessage"
    // InternalSimpleAgent.g:1373:1: ruleOutInMessage returns [EObject current=null] : (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation ) ;
    public final EObject ruleOutInMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Request_0 = null;

        EObject this_Invitation_1 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1379:2: ( (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation ) )
            // InternalSimpleAgent.g:1380:2: (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation )
            {
            // InternalSimpleAgent.g:1380:2: (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            else if ( (LA26_0==45) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSimpleAgent.g:1381:3: this_Request_0= ruleRequest
                    {

                    			newCompositeNode(grammarAccess.getOutInMessageAccess().getRequestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Request_0=ruleRequest();

                    state._fsp--;


                    			current = this_Request_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1390:3: this_Invitation_1= ruleInvitation
                    {

                    			newCompositeNode(grammarAccess.getOutInMessageAccess().getInvitationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Invitation_1=ruleInvitation();

                    state._fsp--;


                    			current = this_Invitation_1;
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
    // $ANTLR end "ruleOutInMessage"


    // $ANTLR start "entryRuleEvent"
    // InternalSimpleAgent.g:1402:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSimpleAgent.g:1402:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSimpleAgent.g:1403:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSimpleAgent.g:1409:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1415:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1416:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1416:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1417:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalSimpleAgent.g:1421:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1422:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1422:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1423:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1443:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1444:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1444:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1445:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getEventAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSignal"
    // InternalSimpleAgent.g:1466:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalSimpleAgent.g:1466:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalSimpleAgent.g:1467:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalSimpleAgent.g:1473:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1479:2: ( (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1480:2: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1480:2: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1481:3: otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalKeyword_0());
            		
            // InternalSimpleAgent.g:1485:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1486:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1486:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1487:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1507:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1508:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1508:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1509:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSignalAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignalRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleToken"
    // InternalSimpleAgent.g:1530:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalSimpleAgent.g:1530:46: (iv_ruleToken= ruleToken EOF )
            // InternalSimpleAgent.g:1531:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalSimpleAgent.g:1537:1: ruleToken returns [EObject current=null] : (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1543:2: ( (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1544:2: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1544:2: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1545:3: otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTokenKeyword_0());
            		
            // InternalSimpleAgent.g:1549:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1550:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1550:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1551:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1571:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1572:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1572:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1573:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getTokenAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleDispatch"
    // InternalSimpleAgent.g:1594:1: entryRuleDispatch returns [EObject current=null] : iv_ruleDispatch= ruleDispatch EOF ;
    public final EObject entryRuleDispatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispatch = null;


        try {
            // InternalSimpleAgent.g:1594:49: (iv_ruleDispatch= ruleDispatch EOF )
            // InternalSimpleAgent.g:1595:2: iv_ruleDispatch= ruleDispatch EOF
            {
             newCompositeNode(grammarAccess.getDispatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDispatch=ruleDispatch();

            state._fsp--;

             current =iv_ruleDispatch; 
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
    // $ANTLR end "entryRuleDispatch"


    // $ANTLR start "ruleDispatch"
    // InternalSimpleAgent.g:1601:1: ruleDispatch returns [EObject current=null] : (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleDispatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1607:2: ( (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1608:2: (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1608:2: (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1609:3: otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDispatchAccess().getDispatchKeyword_0());
            		
            // InternalSimpleAgent.g:1613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1614:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDispatchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDispatchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDispatchAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1635:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1636:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1636:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1637:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getDispatchAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDispatchRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleDispatch"


    // $ANTLR start "entryRuleRequest"
    // InternalSimpleAgent.g:1658:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalSimpleAgent.g:1658:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalSimpleAgent.g:1659:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalSimpleAgent.g:1665:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1671:2: ( (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1672:2: (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1672:2: (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1673:3: otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
            		
            // InternalSimpleAgent.g:1677:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1678:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1678:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1679:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1699:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1700:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1700:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1701:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleInvitation"
    // InternalSimpleAgent.g:1722:1: entryRuleInvitation returns [EObject current=null] : iv_ruleInvitation= ruleInvitation EOF ;
    public final EObject entryRuleInvitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvitation = null;


        try {
            // InternalSimpleAgent.g:1722:51: (iv_ruleInvitation= ruleInvitation EOF )
            // InternalSimpleAgent.g:1723:2: iv_ruleInvitation= ruleInvitation EOF
            {
             newCompositeNode(grammarAccess.getInvitationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvitation=ruleInvitation();

            state._fsp--;

             current =iv_ruleInvitation; 
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
    // $ANTLR end "entryRuleInvitation"


    // $ANTLR start "ruleInvitation"
    // InternalSimpleAgent.g:1729:1: ruleInvitation returns [EObject current=null] : (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleInvitation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1735:2: ( (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:1736:2: (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:1736:2: (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:1737:3: otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInvitationAccess().getInvitationKeyword_0());
            		
            // InternalSimpleAgent.g:1741:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1742:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1742:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1743:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInvitationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvitationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getInvitationAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:1763:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalSimpleAgent.g:1764:4: (lv_msg_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:1764:4: (lv_msg_3_0= rulePHead )
            // InternalSimpleAgent.g:1765:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getInvitationAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvitationRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleInvitation"


    // $ANTLR start "entryRuleContext"
    // InternalSimpleAgent.g:1786:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalSimpleAgent.g:1786:48: (iv_ruleContext= ruleContext EOF )
            // InternalSimpleAgent.g:1787:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalSimpleAgent.g:1793:1: ruleContext returns [EObject current=null] : (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_mqtt_4_0=null;
        EObject lv_ip_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1799:2: ( (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? ) )
            // InternalSimpleAgent.g:1800:2: (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? )
            {
            // InternalSimpleAgent.g:1800:2: (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )? )
            // InternalSimpleAgent.g:1801:3: otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( (lv_mqtt_4_0= '-mqtt' ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalSimpleAgent.g:1805:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimpleAgent.g:1806:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimpleAgent.g:1806:4: (lv_name_1_0= RULE_ID )
            // InternalSimpleAgent.g:1807:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getIpKeyword_2());
            		
            // InternalSimpleAgent.g:1827:3: ( (lv_ip_3_0= ruleComponentIP ) )
            // InternalSimpleAgent.g:1828:4: (lv_ip_3_0= ruleComponentIP )
            {
            // InternalSimpleAgent.g:1828:4: (lv_ip_3_0= ruleComponentIP )
            // InternalSimpleAgent.g:1829:5: lv_ip_3_0= ruleComponentIP
            {

            					newCompositeNode(grammarAccess.getContextAccess().getIpComponentIPParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_ip_3_0=ruleComponentIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.ComponentIP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleAgent.g:1846:3: ( (lv_mqtt_4_0= '-mqtt' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSimpleAgent.g:1847:4: (lv_mqtt_4_0= '-mqtt' )
                    {
                    // InternalSimpleAgent.g:1847:4: (lv_mqtt_4_0= '-mqtt' )
                    // InternalSimpleAgent.g:1848:5: lv_mqtt_4_0= '-mqtt'
                    {
                    lv_mqtt_4_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_mqtt_4_0, grammarAccess.getContextAccess().getMqttMqttKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextRule());
                    					}
                    					setWithLastConsumed(current, "mqtt", true, "-mqtt");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleComponentIP"
    // InternalSimpleAgent.g:1864:1: entryRuleComponentIP returns [EObject current=null] : iv_ruleComponentIP= ruleComponentIP EOF ;
    public final EObject entryRuleComponentIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentIP = null;


        try {
            // InternalSimpleAgent.g:1864:52: (iv_ruleComponentIP= ruleComponentIP EOF )
            // InternalSimpleAgent.g:1865:2: iv_ruleComponentIP= ruleComponentIP EOF
            {
             newCompositeNode(grammarAccess.getComponentIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentIP=ruleComponentIP();

            state._fsp--;

             current =iv_ruleComponentIP; 
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
    // $ANTLR end "entryRuleComponentIP"


    // $ANTLR start "ruleComponentIP"
    // InternalSimpleAgent.g:1871:1: ruleComponentIP returns [EObject current=null] : ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' ) ;
    public final EObject ruleComponentIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_host_3_0=null;
        Token otherlv_4=null;
        Token lv_port_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:1877:2: ( ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            // InternalSimpleAgent.g:1878:2: ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' )
            {
            // InternalSimpleAgent.g:1878:2: ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' )
            // InternalSimpleAgent.g:1879:3: () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']'
            {
            // InternalSimpleAgent.g:1879:3: ()
            // InternalSimpleAgent.g:1880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentIPAccess().getComponentIPAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentIPAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentIPAccess().getHostKeyword_2());
            		
            // InternalSimpleAgent.g:1894:3: ( (lv_host_3_0= RULE_STRING ) )
            // InternalSimpleAgent.g:1895:4: (lv_host_3_0= RULE_STRING )
            {
            // InternalSimpleAgent.g:1895:4: (lv_host_3_0= RULE_STRING )
            // InternalSimpleAgent.g:1896:5: lv_host_3_0= RULE_STRING
            {
            lv_host_3_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_host_3_0, grammarAccess.getComponentIPAccess().getHostSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentIPAccess().getPortKeyword_4());
            		
            // InternalSimpleAgent.g:1916:3: ( (lv_port_5_0= RULE_INT ) )
            // InternalSimpleAgent.g:1917:4: (lv_port_5_0= RULE_INT )
            {
            // InternalSimpleAgent.g:1917:4: (lv_port_5_0= RULE_INT )
            // InternalSimpleAgent.g:1918:5: lv_port_5_0= RULE_INT
            {
            lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_port_5_0, grammarAccess.getComponentIPAccess().getPortINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentIPAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponentIP"


    // $ANTLR start "entryRuleGuardedStateAction"
    // InternalSimpleAgent.g:1942:1: entryRuleGuardedStateAction returns [EObject current=null] : iv_ruleGuardedStateAction= ruleGuardedStateAction EOF ;
    public final EObject entryRuleGuardedStateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardedStateAction = null;


        try {
            // InternalSimpleAgent.g:1942:59: (iv_ruleGuardedStateAction= ruleGuardedStateAction EOF )
            // InternalSimpleAgent.g:1943:2: iv_ruleGuardedStateAction= ruleGuardedStateAction EOF
            {
             newCompositeNode(grammarAccess.getGuardedStateActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardedStateAction=ruleGuardedStateAction();

            state._fsp--;

             current =iv_ruleGuardedStateAction; 
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
    // $ANTLR end "entryRuleGuardedStateAction"


    // $ANTLR start "ruleGuardedStateAction"
    // InternalSimpleAgent.g:1949:1: ruleGuardedStateAction returns [EObject current=null] : ( ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )? ( (lv_action_3_0= ruleStateAction ) ) (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )? ) ;
    public final EObject ruleGuardedStateAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_guard_1_0=null;
        Token lv_solveGuard_2_0=null;
        Token otherlv_4=null;
        EObject lv_action_3_0 = null;

        EObject lv_elseaction_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:1955:2: ( ( ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )? ( (lv_action_3_0= ruleStateAction ) ) (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )? ) )
            // InternalSimpleAgent.g:1956:2: ( ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )? ( (lv_action_3_0= ruleStateAction ) ) (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )? )
            {
            // InternalSimpleAgent.g:1956:2: ( ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )? ( (lv_action_3_0= ruleStateAction ) ) (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )? )
            // InternalSimpleAgent.g:1957:3: ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )? ( (lv_action_3_0= ruleStateAction ) ) (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )?
            {
            // InternalSimpleAgent.g:1957:3: ( (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) ) | ( (lv_solveGuard_2_0= 'ifSolved' ) ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            else if ( (LA28_0==52) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // InternalSimpleAgent.g:1958:4: (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) )
                    {
                    // InternalSimpleAgent.g:1958:4: (otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) ) )
                    // InternalSimpleAgent.g:1959:5: otherlv_0= 'if' ( (lv_guard_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_31); 

                    					newLeafNode(otherlv_0, grammarAccess.getGuardedStateActionAccess().getIfKeyword_0_0_0());
                    				
                    // InternalSimpleAgent.g:1963:5: ( (lv_guard_1_0= RULE_STRING ) )
                    // InternalSimpleAgent.g:1964:6: (lv_guard_1_0= RULE_STRING )
                    {
                    // InternalSimpleAgent.g:1964:6: (lv_guard_1_0= RULE_STRING )
                    // InternalSimpleAgent.g:1965:7: lv_guard_1_0= RULE_STRING
                    {
                    lv_guard_1_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    							newLeafNode(lv_guard_1_0, grammarAccess.getGuardedStateActionAccess().getGuardSTRINGTerminalRuleCall_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGuardedStateActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"guard",
                    								lv_guard_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:1983:4: ( (lv_solveGuard_2_0= 'ifSolved' ) )
                    {
                    // InternalSimpleAgent.g:1983:4: ( (lv_solveGuard_2_0= 'ifSolved' ) )
                    // InternalSimpleAgent.g:1984:5: (lv_solveGuard_2_0= 'ifSolved' )
                    {
                    // InternalSimpleAgent.g:1984:5: (lv_solveGuard_2_0= 'ifSolved' )
                    // InternalSimpleAgent.g:1985:6: lv_solveGuard_2_0= 'ifSolved'
                    {
                    lv_solveGuard_2_0=(Token)match(input,52,FOLLOW_40); 

                    						newLeafNode(lv_solveGuard_2_0, grammarAccess.getGuardedStateActionAccess().getSolveGuardIfSolvedKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuardedStateActionRule());
                    						}
                    						setWithLastConsumed(current, "solveGuard", true, "ifSolved");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleAgent.g:1998:3: ( (lv_action_3_0= ruleStateAction ) )
            // InternalSimpleAgent.g:1999:4: (lv_action_3_0= ruleStateAction )
            {
            // InternalSimpleAgent.g:1999:4: (lv_action_3_0= ruleStateAction )
            // InternalSimpleAgent.g:2000:5: lv_action_3_0= ruleStateAction
            {

            					newCompositeNode(grammarAccess.getGuardedStateActionAccess().getActionStateActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_action_3_0=ruleStateAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardedStateActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.StateAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleAgent.g:2017:3: (otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSimpleAgent.g:2018:4: otherlv_4= 'else' ( (lv_elseaction_5_0= ruleStateAction ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getGuardedStateActionAccess().getElseKeyword_2_0());
                    			
                    // InternalSimpleAgent.g:2022:4: ( (lv_elseaction_5_0= ruleStateAction ) )
                    // InternalSimpleAgent.g:2023:5: (lv_elseaction_5_0= ruleStateAction )
                    {
                    // InternalSimpleAgent.g:2023:5: (lv_elseaction_5_0= ruleStateAction )
                    // InternalSimpleAgent.g:2024:6: lv_elseaction_5_0= ruleStateAction
                    {

                    						newCompositeNode(grammarAccess.getGuardedStateActionAccess().getElseactionStateActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseaction_5_0=ruleStateAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGuardedStateActionRule());
                    						}
                    						set(
                    							current,
                    							"elseaction",
                    							lv_elseaction_5_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.StateAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleGuardedStateAction"


    // $ANTLR start "entryRuleStateAction"
    // InternalSimpleAgent.g:2046:1: entryRuleStateAction returns [EObject current=null] : iv_ruleStateAction= ruleStateAction EOF ;
    public final EObject entryRuleStateAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateAction = null;


        try {
            // InternalSimpleAgent.g:2046:52: (iv_ruleStateAction= ruleStateAction EOF )
            // InternalSimpleAgent.g:2047:2: iv_ruleStateAction= ruleStateAction EOF
            {
             newCompositeNode(grammarAccess.getStateActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateAction=ruleStateAction();

            state._fsp--;

             current =iv_ruleStateAction; 
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
    // $ANTLR end "entryRuleStateAction"


    // $ANTLR start "ruleStateAction"
    // InternalSimpleAgent.g:2053:1: ruleStateAction returns [EObject current=null] : (this_Print_0= rulePrint | this_PrintCurMsg_1= rulePrintCurMsg | this_SolveGoal_2= ruleSolveGoal | this_Forward_3= ruleForward | this_Emit_4= ruleEmit | this_Delay_5= ruleDelay | this_MsgCond_6= ruleMsgCond | this_CodeRun_7= ruleCodeRun | this_AnyAction_8= ruleAnyAction | this_Exec_9= ruleExec ) ;
    public final EObject ruleStateAction() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_PrintCurMsg_1 = null;

        EObject this_SolveGoal_2 = null;

        EObject this_Forward_3 = null;

        EObject this_Emit_4 = null;

        EObject this_Delay_5 = null;

        EObject this_MsgCond_6 = null;

        EObject this_CodeRun_7 = null;

        EObject this_AnyAction_8 = null;

        EObject this_Exec_9 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2059:2: ( (this_Print_0= rulePrint | this_PrintCurMsg_1= rulePrintCurMsg | this_SolveGoal_2= ruleSolveGoal | this_Forward_3= ruleForward | this_Emit_4= ruleEmit | this_Delay_5= ruleDelay | this_MsgCond_6= ruleMsgCond | this_CodeRun_7= ruleCodeRun | this_AnyAction_8= ruleAnyAction | this_Exec_9= ruleExec ) )
            // InternalSimpleAgent.g:2060:2: (this_Print_0= rulePrint | this_PrintCurMsg_1= rulePrintCurMsg | this_SolveGoal_2= ruleSolveGoal | this_Forward_3= ruleForward | this_Emit_4= ruleEmit | this_Delay_5= ruleDelay | this_MsgCond_6= ruleMsgCond | this_CodeRun_7= ruleCodeRun | this_AnyAction_8= ruleAnyAction | this_Exec_9= ruleExec )
            {
            // InternalSimpleAgent.g:2060:2: (this_Print_0= rulePrint | this_PrintCurMsg_1= rulePrintCurMsg | this_SolveGoal_2= ruleSolveGoal | this_Forward_3= ruleForward | this_Emit_4= ruleEmit | this_Delay_5= ruleDelay | this_MsgCond_6= ruleMsgCond | this_CodeRun_7= ruleCodeRun | this_AnyAction_8= ruleAnyAction | this_Exec_9= ruleExec )
            int alt30=10;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt30=1;
                }
                break;
            case 54:
                {
                alt30=2;
                }
                break;
            case 56:
                {
                alt30=3;
                }
                break;
            case 57:
                {
                alt30=4;
                }
                break;
            case 59:
                {
                alt30=5;
                }
                break;
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt30=6;
                }
                break;
            case 64:
                {
                alt30=7;
                }
                break;
            case 65:
                {
                alt30=8;
                }
                break;
            case 47:
                {
                alt30=9;
                }
                break;
            case 67:
                {
                alt30=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalSimpleAgent.g:2061:3: this_Print_0= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getPrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    			current = this_Print_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:2070:3: this_PrintCurMsg_1= rulePrintCurMsg
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getPrintCurMsgParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintCurMsg_1=rulePrintCurMsg();

                    state._fsp--;


                    			current = this_PrintCurMsg_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:2079:3: this_SolveGoal_2= ruleSolveGoal
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getSolveGoalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SolveGoal_2=ruleSolveGoal();

                    state._fsp--;


                    			current = this_SolveGoal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleAgent.g:2088:3: this_Forward_3= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getForwardParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_3=ruleForward();

                    state._fsp--;


                    			current = this_Forward_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSimpleAgent.g:2097:3: this_Emit_4= ruleEmit
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getEmitParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Emit_4=ruleEmit();

                    state._fsp--;


                    			current = this_Emit_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSimpleAgent.g:2106:3: this_Delay_5= ruleDelay
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getDelayParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delay_5=ruleDelay();

                    state._fsp--;


                    			current = this_Delay_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSimpleAgent.g:2115:3: this_MsgCond_6= ruleMsgCond
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getMsgCondParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MsgCond_6=ruleMsgCond();

                    state._fsp--;


                    			current = this_MsgCond_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSimpleAgent.g:2124:3: this_CodeRun_7= ruleCodeRun
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getCodeRunParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeRun_7=ruleCodeRun();

                    state._fsp--;


                    			current = this_CodeRun_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSimpleAgent.g:2133:3: this_AnyAction_8= ruleAnyAction
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getAnyActionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyAction_8=ruleAnyAction();

                    state._fsp--;


                    			current = this_AnyAction_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSimpleAgent.g:2142:3: this_Exec_9= ruleExec
                    {

                    			newCompositeNode(grammarAccess.getStateActionAccess().getExecParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exec_9=ruleExec();

                    state._fsp--;


                    			current = this_Exec_9;
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
    // $ANTLR end "ruleStateAction"


    // $ANTLR start "entryRulePrintCurMsg"
    // InternalSimpleAgent.g:2154:1: entryRulePrintCurMsg returns [EObject current=null] : iv_rulePrintCurMsg= rulePrintCurMsg EOF ;
    public final EObject entryRulePrintCurMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCurMsg = null;


        try {
            // InternalSimpleAgent.g:2154:52: (iv_rulePrintCurMsg= rulePrintCurMsg EOF )
            // InternalSimpleAgent.g:2155:2: iv_rulePrintCurMsg= rulePrintCurMsg EOF
            {
             newCompositeNode(grammarAccess.getPrintCurMsgRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintCurMsg=rulePrintCurMsg();

            state._fsp--;

             current =iv_rulePrintCurMsg; 
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
    // $ANTLR end "entryRulePrintCurMsg"


    // $ANTLR start "rulePrintCurMsg"
    // InternalSimpleAgent.g:2161:1: rulePrintCurMsg returns [EObject current=null] : ( () otherlv_1= 'printCurrentMessage' ) ;
    public final EObject rulePrintCurMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:2167:2: ( ( () otherlv_1= 'printCurrentMessage' ) )
            // InternalSimpleAgent.g:2168:2: ( () otherlv_1= 'printCurrentMessage' )
            {
            // InternalSimpleAgent.g:2168:2: ( () otherlv_1= 'printCurrentMessage' )
            // InternalSimpleAgent.g:2169:3: () otherlv_1= 'printCurrentMessage'
            {
            // InternalSimpleAgent.g:2169:3: ()
            // InternalSimpleAgent.g:2170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintCurMsgAccess().getPrintCurMsgAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintCurMsgAccess().getPrintCurrentMessageKeyword_1());
            		

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
    // $ANTLR end "rulePrintCurMsg"


    // $ANTLR start "entryRulePrint"
    // InternalSimpleAgent.g:2184:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalSimpleAgent.g:2184:46: (iv_rulePrint= rulePrint EOF )
            // InternalSimpleAgent.g:2185:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalSimpleAgent.g:2191:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2197:2: ( ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' ) )
            // InternalSimpleAgent.g:2198:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' )
            {
            // InternalSimpleAgent.g:2198:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' )
            // InternalSimpleAgent.g:2199:3: () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')'
            {
            // InternalSimpleAgent.g:2199:3: ()
            // InternalSimpleAgent.g:2200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintlnKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimpleAgent.g:2214:3: ( (lv_args_3_0= rulePHead ) )
            // InternalSimpleAgent.g:2215:4: (lv_args_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:2215:4: (lv_args_3_0= rulePHead )
            // InternalSimpleAgent.g:2216:5: lv_args_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getArgsPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_args_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleSolveGoal"
    // InternalSimpleAgent.g:2241:1: entryRuleSolveGoal returns [EObject current=null] : iv_ruleSolveGoal= ruleSolveGoal EOF ;
    public final EObject entryRuleSolveGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolveGoal = null;


        try {
            // InternalSimpleAgent.g:2241:50: (iv_ruleSolveGoal= ruleSolveGoal EOF )
            // InternalSimpleAgent.g:2242:2: iv_ruleSolveGoal= ruleSolveGoal EOF
            {
             newCompositeNode(grammarAccess.getSolveGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolveGoal=ruleSolveGoal();

            state._fsp--;

             current =iv_ruleSolveGoal; 
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
    // $ANTLR end "entryRuleSolveGoal"


    // $ANTLR start "ruleSolveGoal"
    // InternalSimpleAgent.g:2248:1: ruleSolveGoal returns [EObject current=null] : ( () otherlv_1= 'solve' otherlv_2= '(' ( (lv_goal_3_0= rulePHead ) ) (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleSolveGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_goal_3_0 = null;

        EObject lv_resVar_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2254:2: ( ( () otherlv_1= 'solve' otherlv_2= '(' ( (lv_goal_3_0= rulePHead ) ) (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )? otherlv_6= ')' ) )
            // InternalSimpleAgent.g:2255:2: ( () otherlv_1= 'solve' otherlv_2= '(' ( (lv_goal_3_0= rulePHead ) ) (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )? otherlv_6= ')' )
            {
            // InternalSimpleAgent.g:2255:2: ( () otherlv_1= 'solve' otherlv_2= '(' ( (lv_goal_3_0= rulePHead ) ) (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )? otherlv_6= ')' )
            // InternalSimpleAgent.g:2256:3: () otherlv_1= 'solve' otherlv_2= '(' ( (lv_goal_3_0= rulePHead ) ) (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )? otherlv_6= ')'
            {
            // InternalSimpleAgent.g:2256:3: ()
            // InternalSimpleAgent.g:2257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSolveGoalAccess().getSolveGoalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSolveGoalAccess().getSolveKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSolveGoalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimpleAgent.g:2271:3: ( (lv_goal_3_0= rulePHead ) )
            // InternalSimpleAgent.g:2272:4: (lv_goal_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:2272:4: (lv_goal_3_0= rulePHead )
            // InternalSimpleAgent.g:2273:5: lv_goal_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSolveGoalAccess().getGoalPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_goal_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolveGoalRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleAgent.g:2290:3: (otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSimpleAgent.g:2291:4: otherlv_4= ',' ( (lv_resVar_5_0= ruleVariable ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getSolveGoalAccess().getCommaKeyword_4_0());
                    			
                    // InternalSimpleAgent.g:2295:4: ( (lv_resVar_5_0= ruleVariable ) )
                    // InternalSimpleAgent.g:2296:5: (lv_resVar_5_0= ruleVariable )
                    {
                    // InternalSimpleAgent.g:2296:5: (lv_resVar_5_0= ruleVariable )
                    // InternalSimpleAgent.g:2297:6: lv_resVar_5_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSolveGoalAccess().getResVarVariableParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_resVar_5_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSolveGoalRule());
                    						}
                    						set(
                    							current,
                    							"resVar",
                    							lv_resVar_5_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSolveGoalAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSolveGoal"


    // $ANTLR start "entryRuleForward"
    // InternalSimpleAgent.g:2323:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalSimpleAgent.g:2323:48: (iv_ruleForward= ruleForward EOF )
            // InternalSimpleAgent.g:2324:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalSimpleAgent.g:2330:1: ruleForward returns [EObject current=null] : (otherlv_0= 'forward' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_val_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2336:2: ( (otherlv_0= 'forward' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:2337:2: (otherlv_0= 'forward' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:2337:2: (otherlv_0= 'forward' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) )
            // InternalSimpleAgent.g:2338:3: otherlv_0= 'forward' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getForwardKeyword_0());
            		
            // InternalSimpleAgent.g:2342:3: ( (otherlv_1= RULE_ID ) )
            // InternalSimpleAgent.g:2343:4: (otherlv_1= RULE_ID )
            {
            // InternalSimpleAgent.g:2343:4: (otherlv_1= RULE_ID )
            // InternalSimpleAgent.g:2344:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getDestBehaviorDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getForwardAccess().getMKeyword_2());
            		
            // InternalSimpleAgent.g:2359:3: ( (otherlv_3= RULE_ID ) )
            // InternalSimpleAgent.g:2360:4: (otherlv_3= RULE_ID )
            {
            // InternalSimpleAgent.g:2360:4: (otherlv_3= RULE_ID )
            // InternalSimpleAgent.g:2361:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getMsgrefMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getForwardAccess().getColonKeyword_4());
            		
            // InternalSimpleAgent.g:2376:3: ( (lv_val_5_0= rulePHead ) )
            // InternalSimpleAgent.g:2377:4: (lv_val_5_0= rulePHead )
            {
            // InternalSimpleAgent.g:2377:4: (lv_val_5_0= rulePHead )
            // InternalSimpleAgent.g:2378:5: lv_val_5_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getValPHeadParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_5_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_5_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleEmit"
    // InternalSimpleAgent.g:2399:1: entryRuleEmit returns [EObject current=null] : iv_ruleEmit= ruleEmit EOF ;
    public final EObject entryRuleEmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmit = null;


        try {
            // InternalSimpleAgent.g:2399:45: (iv_ruleEmit= ruleEmit EOF )
            // InternalSimpleAgent.g:2400:2: iv_ruleEmit= ruleEmit EOF
            {
             newCompositeNode(grammarAccess.getEmitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmit=ruleEmit();

            state._fsp--;

             current =iv_ruleEmit; 
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
    // $ANTLR end "entryRuleEmit"


    // $ANTLR start "ruleEmit"
    // InternalSimpleAgent.g:2406:1: ruleEmit returns [EObject current=null] : (otherlv_0= 'emit' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_val_3_0= rulePHead ) ) ) ;
    public final EObject ruleEmit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2412:2: ( (otherlv_0= 'emit' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_val_3_0= rulePHead ) ) ) )
            // InternalSimpleAgent.g:2413:2: (otherlv_0= 'emit' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_val_3_0= rulePHead ) ) )
            {
            // InternalSimpleAgent.g:2413:2: (otherlv_0= 'emit' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_val_3_0= rulePHead ) ) )
            // InternalSimpleAgent.g:2414:3: otherlv_0= 'emit' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_val_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEmitAccess().getEmitKeyword_0());
            		
            // InternalSimpleAgent.g:2418:3: ( (otherlv_1= RULE_ID ) )
            // InternalSimpleAgent.g:2419:4: (otherlv_1= RULE_ID )
            {
            // InternalSimpleAgent.g:2419:4: (otherlv_1= RULE_ID )
            // InternalSimpleAgent.g:2420:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmitRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_1, grammarAccess.getEmitAccess().getMsgrefEventCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getEmitAccess().getColonKeyword_2());
            		
            // InternalSimpleAgent.g:2435:3: ( (lv_val_3_0= rulePHead ) )
            // InternalSimpleAgent.g:2436:4: (lv_val_3_0= rulePHead )
            {
            // InternalSimpleAgent.g:2436:4: (lv_val_3_0= rulePHead )
            // InternalSimpleAgent.g:2437:5: lv_val_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getEmitAccess().getValPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmitRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
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
    // $ANTLR end "ruleEmit"


    // $ANTLR start "entryRuleDelay"
    // InternalSimpleAgent.g:2458:1: entryRuleDelay returns [EObject current=null] : iv_ruleDelay= ruleDelay EOF ;
    public final EObject entryRuleDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelay = null;


        try {
            // InternalSimpleAgent.g:2458:46: (iv_ruleDelay= ruleDelay EOF )
            // InternalSimpleAgent.g:2459:2: iv_ruleDelay= ruleDelay EOF
            {
             newCompositeNode(grammarAccess.getDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelay=ruleDelay();

            state._fsp--;

             current =iv_ruleDelay; 
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
    // $ANTLR end "entryRuleDelay"


    // $ANTLR start "ruleDelay"
    // InternalSimpleAgent.g:2465:1: ruleDelay returns [EObject current=null] : (this_DelayInt_0= ruleDelayInt | this_DelayVar_1= ruleDelayVar | this_DelayVref_2= ruleDelayVref | this_DelaySol_3= ruleDelaySol ) ;
    public final EObject ruleDelay() throws RecognitionException {
        EObject current = null;

        EObject this_DelayInt_0 = null;

        EObject this_DelayVar_1 = null;

        EObject this_DelayVref_2 = null;

        EObject this_DelaySol_3 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2471:2: ( (this_DelayInt_0= ruleDelayInt | this_DelayVar_1= ruleDelayVar | this_DelayVref_2= ruleDelayVref | this_DelaySol_3= ruleDelaySol ) )
            // InternalSimpleAgent.g:2472:2: (this_DelayInt_0= ruleDelayInt | this_DelayVar_1= ruleDelayVar | this_DelayVref_2= ruleDelayVref | this_DelaySol_3= ruleDelaySol )
            {
            // InternalSimpleAgent.g:2472:2: (this_DelayInt_0= ruleDelayInt | this_DelayVar_1= ruleDelayVar | this_DelayVref_2= ruleDelayVref | this_DelaySol_3= ruleDelaySol )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt32=1;
                }
                break;
            case 61:
                {
                alt32=2;
                }
                break;
            case 62:
                {
                alt32=3;
                }
                break;
            case 63:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSimpleAgent.g:2473:3: this_DelayInt_0= ruleDelayInt
                    {

                    			newCompositeNode(grammarAccess.getDelayAccess().getDelayIntParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayInt_0=ruleDelayInt();

                    state._fsp--;


                    			current = this_DelayInt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:2482:3: this_DelayVar_1= ruleDelayVar
                    {

                    			newCompositeNode(grammarAccess.getDelayAccess().getDelayVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayVar_1=ruleDelayVar();

                    state._fsp--;


                    			current = this_DelayVar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:2491:3: this_DelayVref_2= ruleDelayVref
                    {

                    			newCompositeNode(grammarAccess.getDelayAccess().getDelayVrefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelayVref_2=ruleDelayVref();

                    state._fsp--;


                    			current = this_DelayVref_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleAgent.g:2500:3: this_DelaySol_3= ruleDelaySol
                    {

                    			newCompositeNode(grammarAccess.getDelayAccess().getDelaySolParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DelaySol_3=ruleDelaySol();

                    state._fsp--;


                    			current = this_DelaySol_3;
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
    // $ANTLR end "ruleDelay"


    // $ANTLR start "entryRuleDelayInt"
    // InternalSimpleAgent.g:2512:1: entryRuleDelayInt returns [EObject current=null] : iv_ruleDelayInt= ruleDelayInt EOF ;
    public final EObject entryRuleDelayInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayInt = null;


        try {
            // InternalSimpleAgent.g:2512:49: (iv_ruleDelayInt= ruleDelayInt EOF )
            // InternalSimpleAgent.g:2513:2: iv_ruleDelayInt= ruleDelayInt EOF
            {
             newCompositeNode(grammarAccess.getDelayIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayInt=ruleDelayInt();

            state._fsp--;

             current =iv_ruleDelayInt; 
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
    // $ANTLR end "entryRuleDelayInt"


    // $ANTLR start "ruleDelayInt"
    // InternalSimpleAgent.g:2519:1: ruleDelayInt returns [EObject current=null] : (otherlv_0= 'delay' ( (lv_time_1_0= RULE_INT ) ) ) ;
    public final EObject ruleDelayInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:2525:2: ( (otherlv_0= 'delay' ( (lv_time_1_0= RULE_INT ) ) ) )
            // InternalSimpleAgent.g:2526:2: (otherlv_0= 'delay' ( (lv_time_1_0= RULE_INT ) ) )
            {
            // InternalSimpleAgent.g:2526:2: (otherlv_0= 'delay' ( (lv_time_1_0= RULE_INT ) ) )
            // InternalSimpleAgent.g:2527:3: otherlv_0= 'delay' ( (lv_time_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayIntAccess().getDelayKeyword_0());
            		
            // InternalSimpleAgent.g:2531:3: ( (lv_time_1_0= RULE_INT ) )
            // InternalSimpleAgent.g:2532:4: (lv_time_1_0= RULE_INT )
            {
            // InternalSimpleAgent.g:2532:4: (lv_time_1_0= RULE_INT )
            // InternalSimpleAgent.g:2533:5: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_time_1_0, grammarAccess.getDelayIntAccess().getTimeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelayIntRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleDelayInt"


    // $ANTLR start "entryRuleDelayVar"
    // InternalSimpleAgent.g:2553:1: entryRuleDelayVar returns [EObject current=null] : iv_ruleDelayVar= ruleDelayVar EOF ;
    public final EObject entryRuleDelayVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayVar = null;


        try {
            // InternalSimpleAgent.g:2553:49: (iv_ruleDelayVar= ruleDelayVar EOF )
            // InternalSimpleAgent.g:2554:2: iv_ruleDelayVar= ruleDelayVar EOF
            {
             newCompositeNode(grammarAccess.getDelayVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayVar=ruleDelayVar();

            state._fsp--;

             current =iv_ruleDelayVar; 
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
    // $ANTLR end "entryRuleDelayVar"


    // $ANTLR start "ruleDelayVar"
    // InternalSimpleAgent.g:2560:1: ruleDelayVar returns [EObject current=null] : (otherlv_0= 'delayVar' ( (lv_refvar_1_0= ruleVariable ) ) ) ;
    public final EObject ruleDelayVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_refvar_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2566:2: ( (otherlv_0= 'delayVar' ( (lv_refvar_1_0= ruleVariable ) ) ) )
            // InternalSimpleAgent.g:2567:2: (otherlv_0= 'delayVar' ( (lv_refvar_1_0= ruleVariable ) ) )
            {
            // InternalSimpleAgent.g:2567:2: (otherlv_0= 'delayVar' ( (lv_refvar_1_0= ruleVariable ) ) )
            // InternalSimpleAgent.g:2568:3: otherlv_0= 'delayVar' ( (lv_refvar_1_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayVarAccess().getDelayVarKeyword_0());
            		
            // InternalSimpleAgent.g:2572:3: ( (lv_refvar_1_0= ruleVariable ) )
            // InternalSimpleAgent.g:2573:4: (lv_refvar_1_0= ruleVariable )
            {
            // InternalSimpleAgent.g:2573:4: (lv_refvar_1_0= ruleVariable )
            // InternalSimpleAgent.g:2574:5: lv_refvar_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getDelayVarAccess().getRefvarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_refvar_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayVarRule());
            					}
            					set(
            						current,
            						"refvar",
            						lv_refvar_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.Variable");
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
    // $ANTLR end "ruleDelayVar"


    // $ANTLR start "entryRuleDelayVref"
    // InternalSimpleAgent.g:2595:1: entryRuleDelayVref returns [EObject current=null] : iv_ruleDelayVref= ruleDelayVref EOF ;
    public final EObject entryRuleDelayVref() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayVref = null;


        try {
            // InternalSimpleAgent.g:2595:50: (iv_ruleDelayVref= ruleDelayVref EOF )
            // InternalSimpleAgent.g:2596:2: iv_ruleDelayVref= ruleDelayVref EOF
            {
             newCompositeNode(grammarAccess.getDelayVrefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelayVref=ruleDelayVref();

            state._fsp--;

             current =iv_ruleDelayVref; 
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
    // $ANTLR end "entryRuleDelayVref"


    // $ANTLR start "ruleDelayVref"
    // InternalSimpleAgent.g:2602:1: ruleDelayVref returns [EObject current=null] : (otherlv_0= 'delayVarRef' ( (lv_reftime_1_0= ruleVarRef ) ) ) ;
    public final EObject ruleDelayVref() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reftime_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2608:2: ( (otherlv_0= 'delayVarRef' ( (lv_reftime_1_0= ruleVarRef ) ) ) )
            // InternalSimpleAgent.g:2609:2: (otherlv_0= 'delayVarRef' ( (lv_reftime_1_0= ruleVarRef ) ) )
            {
            // InternalSimpleAgent.g:2609:2: (otherlv_0= 'delayVarRef' ( (lv_reftime_1_0= ruleVarRef ) ) )
            // InternalSimpleAgent.g:2610:3: otherlv_0= 'delayVarRef' ( (lv_reftime_1_0= ruleVarRef ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayVrefAccess().getDelayVarRefKeyword_0());
            		
            // InternalSimpleAgent.g:2614:3: ( (lv_reftime_1_0= ruleVarRef ) )
            // InternalSimpleAgent.g:2615:4: (lv_reftime_1_0= ruleVarRef )
            {
            // InternalSimpleAgent.g:2615:4: (lv_reftime_1_0= ruleVarRef )
            // InternalSimpleAgent.g:2616:5: lv_reftime_1_0= ruleVarRef
            {

            					newCompositeNode(grammarAccess.getDelayVrefAccess().getReftimeVarRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_reftime_1_0=ruleVarRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayVrefRule());
            					}
            					set(
            						current,
            						"reftime",
            						lv_reftime_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VarRef");
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
    // $ANTLR end "ruleDelayVref"


    // $ANTLR start "entryRuleDelaySol"
    // InternalSimpleAgent.g:2637:1: entryRuleDelaySol returns [EObject current=null] : iv_ruleDelaySol= ruleDelaySol EOF ;
    public final EObject entryRuleDelaySol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelaySol = null;


        try {
            // InternalSimpleAgent.g:2637:49: (iv_ruleDelaySol= ruleDelaySol EOF )
            // InternalSimpleAgent.g:2638:2: iv_ruleDelaySol= ruleDelaySol EOF
            {
             newCompositeNode(grammarAccess.getDelaySolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelaySol=ruleDelaySol();

            state._fsp--;

             current =iv_ruleDelaySol; 
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
    // $ANTLR end "entryRuleDelaySol"


    // $ANTLR start "ruleDelaySol"
    // InternalSimpleAgent.g:2644:1: ruleDelaySol returns [EObject current=null] : (otherlv_0= 'delaySol' ( (lv_refsoltime_1_0= ruleVarSolRef ) ) ) ;
    public final EObject ruleDelaySol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_refsoltime_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2650:2: ( (otherlv_0= 'delaySol' ( (lv_refsoltime_1_0= ruleVarSolRef ) ) ) )
            // InternalSimpleAgent.g:2651:2: (otherlv_0= 'delaySol' ( (lv_refsoltime_1_0= ruleVarSolRef ) ) )
            {
            // InternalSimpleAgent.g:2651:2: (otherlv_0= 'delaySol' ( (lv_refsoltime_1_0= ruleVarSolRef ) ) )
            // InternalSimpleAgent.g:2652:3: otherlv_0= 'delaySol' ( (lv_refsoltime_1_0= ruleVarSolRef ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getDelaySolAccess().getDelaySolKeyword_0());
            		
            // InternalSimpleAgent.g:2656:3: ( (lv_refsoltime_1_0= ruleVarSolRef ) )
            // InternalSimpleAgent.g:2657:4: (lv_refsoltime_1_0= ruleVarSolRef )
            {
            // InternalSimpleAgent.g:2657:4: (lv_refsoltime_1_0= ruleVarSolRef )
            // InternalSimpleAgent.g:2658:5: lv_refsoltime_1_0= ruleVarSolRef
            {

            					newCompositeNode(grammarAccess.getDelaySolAccess().getRefsoltimeVarSolRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_refsoltime_1_0=ruleVarSolRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelaySolRule());
            					}
            					set(
            						current,
            						"refsoltime",
            						lv_refsoltime_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VarSolRef");
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
    // $ANTLR end "ruleDelaySol"


    // $ANTLR start "entryRuleMsgCond"
    // InternalSimpleAgent.g:2679:1: entryRuleMsgCond returns [EObject current=null] : iv_ruleMsgCond= ruleMsgCond EOF ;
    public final EObject entryRuleMsgCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgCond = null;


        try {
            // InternalSimpleAgent.g:2679:48: (iv_ruleMsgCond= ruleMsgCond EOF )
            // InternalSimpleAgent.g:2680:2: iv_ruleMsgCond= ruleMsgCond EOF
            {
             newCompositeNode(grammarAccess.getMsgCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMsgCond=ruleMsgCond();

            state._fsp--;

             current =iv_ruleMsgCond; 
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
    // $ANTLR end "entryRuleMsgCond"


    // $ANTLR start "ruleMsgCond"
    // InternalSimpleAgent.g:2686:1: ruleMsgCond returns [EObject current=null] : (otherlv_0= 'onMsg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_actions_7_0= ruleGuardedStateAction ) )* otherlv_8= '}' (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )? ) ;
    public final EObject ruleMsgCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_msg_4_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_ifnot_10_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2692:2: ( (otherlv_0= 'onMsg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_actions_7_0= ruleGuardedStateAction ) )* otherlv_8= '}' (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )? ) )
            // InternalSimpleAgent.g:2693:2: (otherlv_0= 'onMsg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_actions_7_0= ruleGuardedStateAction ) )* otherlv_8= '}' (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )? )
            {
            // InternalSimpleAgent.g:2693:2: (otherlv_0= 'onMsg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_actions_7_0= ruleGuardedStateAction ) )* otherlv_8= '}' (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )? )
            // InternalSimpleAgent.g:2694:3: otherlv_0= 'onMsg' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_actions_7_0= ruleGuardedStateAction ) )* otherlv_8= '}' (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getMsgCondAccess().getOnMsgKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMsgCondAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSimpleAgent.g:2702:3: ( (otherlv_2= RULE_ID ) )
            // InternalSimpleAgent.g:2703:4: (otherlv_2= RULE_ID )
            {
            // InternalSimpleAgent.g:2703:4: (otherlv_2= RULE_ID )
            // InternalSimpleAgent.g:2704:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMsgCondRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_2, grammarAccess.getMsgCondAccess().getMessageMessageCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getMsgCondAccess().getColonKeyword_3());
            		
            // InternalSimpleAgent.g:2719:3: ( (lv_msg_4_0= rulePHead ) )
            // InternalSimpleAgent.g:2720:4: (lv_msg_4_0= rulePHead )
            {
            // InternalSimpleAgent.g:2720:4: (lv_msg_4_0= rulePHead )
            // InternalSimpleAgent.g:2721:5: lv_msg_4_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getMsgCondAccess().getMsgPHeadParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_msg_4_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgCondRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_4_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMsgCondAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getMsgCondAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalSimpleAgent.g:2746:3: ( (lv_actions_7_0= ruleGuardedStateAction ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47||(LA33_0>=51 && LA33_0<=52)||(LA33_0>=54 && LA33_0<=57)||(LA33_0>=59 && LA33_0<=65)||LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSimpleAgent.g:2747:4: (lv_actions_7_0= ruleGuardedStateAction )
            	    {
            	    // InternalSimpleAgent.g:2747:4: (lv_actions_7_0= ruleGuardedStateAction )
            	    // InternalSimpleAgent.g:2748:5: lv_actions_7_0= ruleGuardedStateAction
            	    {

            	    					newCompositeNode(grammarAccess.getMsgCondAccess().getActionsGuardedStateActionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_actions_7_0=ruleGuardedStateAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMsgCondRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_7_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.GuardedStateAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_8, grammarAccess.getMsgCondAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalSimpleAgent.g:2769:3: (otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==16) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalSimpleAgent.g:2770:4: otherlv_9= 'else' ( (lv_ifnot_10_0= ruleNoMsgCond ) )
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getMsgCondAccess().getElseKeyword_9_0());
                    			
                    // InternalSimpleAgent.g:2774:4: ( (lv_ifnot_10_0= ruleNoMsgCond ) )
                    // InternalSimpleAgent.g:2775:5: (lv_ifnot_10_0= ruleNoMsgCond )
                    {
                    // InternalSimpleAgent.g:2775:5: (lv_ifnot_10_0= ruleNoMsgCond )
                    // InternalSimpleAgent.g:2776:6: lv_ifnot_10_0= ruleNoMsgCond
                    {

                    						newCompositeNode(grammarAccess.getMsgCondAccess().getIfnotNoMsgCondParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ifnot_10_0=ruleNoMsgCond();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMsgCondRule());
                    						}
                    						set(
                    							current,
                    							"ifnot",
                    							lv_ifnot_10_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.NoMsgCond");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleMsgCond"


    // $ANTLR start "entryRuleNoMsgCond"
    // InternalSimpleAgent.g:2798:1: entryRuleNoMsgCond returns [EObject current=null] : iv_ruleNoMsgCond= ruleNoMsgCond EOF ;
    public final EObject entryRuleNoMsgCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoMsgCond = null;


        try {
            // InternalSimpleAgent.g:2798:50: (iv_ruleNoMsgCond= ruleNoMsgCond EOF )
            // InternalSimpleAgent.g:2799:2: iv_ruleNoMsgCond= ruleNoMsgCond EOF
            {
             newCompositeNode(grammarAccess.getNoMsgCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoMsgCond=ruleNoMsgCond();

            state._fsp--;

             current =iv_ruleNoMsgCond; 
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
    // $ANTLR end "entryRuleNoMsgCond"


    // $ANTLR start "ruleNoMsgCond"
    // InternalSimpleAgent.g:2805:1: ruleNoMsgCond returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_actions_2_0= ruleGuardedStateAction ) )* otherlv_3= '}' ) ;
    public final EObject ruleNoMsgCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2811:2: ( ( () otherlv_1= '{' ( (lv_actions_2_0= ruleGuardedStateAction ) )* otherlv_3= '}' ) )
            // InternalSimpleAgent.g:2812:2: ( () otherlv_1= '{' ( (lv_actions_2_0= ruleGuardedStateAction ) )* otherlv_3= '}' )
            {
            // InternalSimpleAgent.g:2812:2: ( () otherlv_1= '{' ( (lv_actions_2_0= ruleGuardedStateAction ) )* otherlv_3= '}' )
            // InternalSimpleAgent.g:2813:3: () otherlv_1= '{' ( (lv_actions_2_0= ruleGuardedStateAction ) )* otherlv_3= '}'
            {
            // InternalSimpleAgent.g:2813:3: ()
            // InternalSimpleAgent.g:2814:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoMsgCondAccess().getNoMsgCondAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getNoMsgCondAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSimpleAgent.g:2824:3: ( (lv_actions_2_0= ruleGuardedStateAction ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==47||(LA35_0>=51 && LA35_0<=52)||(LA35_0>=54 && LA35_0<=57)||(LA35_0>=59 && LA35_0<=65)||LA35_0==67) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSimpleAgent.g:2825:4: (lv_actions_2_0= ruleGuardedStateAction )
            	    {
            	    // InternalSimpleAgent.g:2825:4: (lv_actions_2_0= ruleGuardedStateAction )
            	    // InternalSimpleAgent.g:2826:5: lv_actions_2_0= ruleGuardedStateAction
            	    {

            	    					newCompositeNode(grammarAccess.getNoMsgCondAccess().getActionsGuardedStateActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_actions_2_0=ruleGuardedStateAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNoMsgCondRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"it.unibo.jcc.xtext.SimpleAgent.GuardedStateAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNoMsgCondAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNoMsgCond"


    // $ANTLR start "entryRuleAnyAction"
    // InternalSimpleAgent.g:2851:1: entryRuleAnyAction returns [EObject current=null] : iv_ruleAnyAction= ruleAnyAction EOF ;
    public final EObject entryRuleAnyAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyAction = null;


        try {
            // InternalSimpleAgent.g:2851:50: (iv_ruleAnyAction= ruleAnyAction EOF )
            // InternalSimpleAgent.g:2852:2: iv_ruleAnyAction= ruleAnyAction EOF
            {
             newCompositeNode(grammarAccess.getAnyActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyAction=ruleAnyAction();

            state._fsp--;

             current =iv_ruleAnyAction; 
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
    // $ANTLR end "entryRuleAnyAction"


    // $ANTLR start "ruleAnyAction"
    // InternalSimpleAgent.g:2858:1: ruleAnyAction returns [EObject current=null] : (otherlv_0= '[' ( (lv_body_1_0= RULE_STRING ) ) otherlv_2= ']' ) ;
    public final EObject ruleAnyAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:2864:2: ( (otherlv_0= '[' ( (lv_body_1_0= RULE_STRING ) ) otherlv_2= ']' ) )
            // InternalSimpleAgent.g:2865:2: (otherlv_0= '[' ( (lv_body_1_0= RULE_STRING ) ) otherlv_2= ']' )
            {
            // InternalSimpleAgent.g:2865:2: (otherlv_0= '[' ( (lv_body_1_0= RULE_STRING ) ) otherlv_2= ']' )
            // InternalSimpleAgent.g:2866:3: otherlv_0= '[' ( (lv_body_1_0= RULE_STRING ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getAnyActionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSimpleAgent.g:2870:3: ( (lv_body_1_0= RULE_STRING ) )
            // InternalSimpleAgent.g:2871:4: (lv_body_1_0= RULE_STRING )
            {
            // InternalSimpleAgent.g:2871:4: (lv_body_1_0= RULE_STRING )
            // InternalSimpleAgent.g:2872:5: lv_body_1_0= RULE_STRING
            {
            lv_body_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_body_1_0, grammarAccess.getAnyActionAccess().getBodySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnyActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAnyActionAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleAnyAction"


    // $ANTLR start "entryRuleCodeRun"
    // InternalSimpleAgent.g:2896:1: entryRuleCodeRun returns [EObject current=null] : iv_ruleCodeRun= ruleCodeRun EOF ;
    public final EObject entryRuleCodeRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRun = null;


        try {
            // InternalSimpleAgent.g:2896:48: (iv_ruleCodeRun= ruleCodeRun EOF )
            // InternalSimpleAgent.g:2897:2: iv_ruleCodeRun= ruleCodeRun EOF
            {
             newCompositeNode(grammarAccess.getCodeRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeRun=ruleCodeRun();

            state._fsp--;

             current =iv_ruleCodeRun; 
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
    // $ANTLR end "entryRuleCodeRun"


    // $ANTLR start "ruleCodeRun"
    // InternalSimpleAgent.g:2903:1: ruleCodeRun returns [EObject current=null] : (this_CodeRunActor_0= ruleCodeRunActor | this_CodeRunSimple_1= ruleCodeRunSimple ) ;
    public final EObject ruleCodeRun() throws RecognitionException {
        EObject current = null;

        EObject this_CodeRunActor_0 = null;

        EObject this_CodeRunSimple_1 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2909:2: ( (this_CodeRunActor_0= ruleCodeRunActor | this_CodeRunSimple_1= ruleCodeRunSimple ) )
            // InternalSimpleAgent.g:2910:2: (this_CodeRunActor_0= ruleCodeRunActor | this_CodeRunSimple_1= ruleCodeRunSimple )
            {
            // InternalSimpleAgent.g:2910:2: (this_CodeRunActor_0= ruleCodeRunActor | this_CodeRunSimple_1= ruleCodeRunSimple )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalSimpleAgent.g:2911:3: this_CodeRunActor_0= ruleCodeRunActor
                    {

                    			newCompositeNode(grammarAccess.getCodeRunAccess().getCodeRunActorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeRunActor_0=ruleCodeRunActor();

                    state._fsp--;


                    			current = this_CodeRunActor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:2920:3: this_CodeRunSimple_1= ruleCodeRunSimple
                    {

                    			newCompositeNode(grammarAccess.getCodeRunAccess().getCodeRunSimpleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeRunSimple_1=ruleCodeRunSimple();

                    state._fsp--;


                    			current = this_CodeRunSimple_1;
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
    // $ANTLR end "ruleCodeRun"


    // $ANTLR start "entryRuleCodeRunActor"
    // InternalSimpleAgent.g:2932:1: entryRuleCodeRunActor returns [EObject current=null] : iv_ruleCodeRunActor= ruleCodeRunActor EOF ;
    public final EObject entryRuleCodeRunActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRunActor = null;


        try {
            // InternalSimpleAgent.g:2932:53: (iv_ruleCodeRunActor= ruleCodeRunActor EOF )
            // InternalSimpleAgent.g:2933:2: iv_ruleCodeRunActor= ruleCodeRunActor EOF
            {
             newCompositeNode(grammarAccess.getCodeRunActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeRunActor=ruleCodeRunActor();

            state._fsp--;

             current =iv_ruleCodeRunActor; 
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
    // $ANTLR end "entryRuleCodeRunActor"


    // $ANTLR start "ruleCodeRunActor"
    // InternalSimpleAgent.g:2939:1: ruleCodeRunActor returns [EObject current=null] : (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'myself' (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleCodeRunActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_item_1_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:2945:2: ( (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'myself' (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )? otherlv_8= ')' ) )
            // InternalSimpleAgent.g:2946:2: (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'myself' (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )? otherlv_8= ')' )
            {
            // InternalSimpleAgent.g:2946:2: (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'myself' (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )? otherlv_8= ')' )
            // InternalSimpleAgent.g:2947:3: otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' otherlv_3= 'myself' (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeRunActorAccess().getRunKeyword_0());
            		
            // InternalSimpleAgent.g:2951:3: ( (lv_item_1_0= ruleQualifiedName ) )
            // InternalSimpleAgent.g:2952:4: (lv_item_1_0= ruleQualifiedName )
            {
            // InternalSimpleAgent.g:2952:4: (lv_item_1_0= ruleQualifiedName )
            // InternalSimpleAgent.g:2953:5: lv_item_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getCodeRunActorAccess().getItemQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_item_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeRunActorRule());
            					}
            					set(
            						current,
            						"item",
            						lv_item_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeRunActorAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,66,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getCodeRunActorAccess().getMyselfKeyword_3());
            		
            // InternalSimpleAgent.g:2978:3: (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSimpleAgent.g:2979:4: otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )*
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getCodeRunActorAccess().getCommaKeyword_4_0());
                    			
                    // InternalSimpleAgent.g:2983:4: ( (lv_args_5_0= ruleCodeRunArg ) )
                    // InternalSimpleAgent.g:2984:5: (lv_args_5_0= ruleCodeRunArg )
                    {
                    // InternalSimpleAgent.g:2984:5: (lv_args_5_0= ruleCodeRunArg )
                    // InternalSimpleAgent.g:2985:6: lv_args_5_0= ruleCodeRunArg
                    {

                    						newCompositeNode(grammarAccess.getCodeRunActorAccess().getArgsCodeRunArgParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_args_5_0=ruleCodeRunArg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodeRunActorRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_5_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.CodeRunArg");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleAgent.g:3002:4: (otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==28) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalSimpleAgent.g:3003:5: otherlv_6= ',' ( (lv_args_7_0= ruleCodeRunArg ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCodeRunActorAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSimpleAgent.g:3007:5: ( (lv_args_7_0= ruleCodeRunArg ) )
                    	    // InternalSimpleAgent.g:3008:6: (lv_args_7_0= ruleCodeRunArg )
                    	    {
                    	    // InternalSimpleAgent.g:3008:6: (lv_args_7_0= ruleCodeRunArg )
                    	    // InternalSimpleAgent.g:3009:7: lv_args_7_0= ruleCodeRunArg
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodeRunActorAccess().getArgsCodeRunArgParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_args_7_0=ruleCodeRunArg();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodeRunActorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_7_0,
                    	    								"it.unibo.jcc.xtext.SimpleAgent.CodeRunArg");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCodeRunActorAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCodeRunActor"


    // $ANTLR start "entryRuleCodeRunSimple"
    // InternalSimpleAgent.g:3036:1: entryRuleCodeRunSimple returns [EObject current=null] : iv_ruleCodeRunSimple= ruleCodeRunSimple EOF ;
    public final EObject entryRuleCodeRunSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeRunSimple = null;


        try {
            // InternalSimpleAgent.g:3036:54: (iv_ruleCodeRunSimple= ruleCodeRunSimple EOF )
            // InternalSimpleAgent.g:3037:2: iv_ruleCodeRunSimple= ruleCodeRunSimple EOF
            {
             newCompositeNode(grammarAccess.getCodeRunSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeRunSimple=ruleCodeRunSimple();

            state._fsp--;

             current =iv_ruleCodeRunSimple; 
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
    // $ANTLR end "entryRuleCodeRunSimple"


    // $ANTLR start "ruleCodeRunSimple"
    // InternalSimpleAgent.g:3043:1: ruleCodeRunSimple returns [EObject current=null] : (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCodeRunSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_item_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:3049:2: ( (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )? otherlv_6= ')' ) )
            // InternalSimpleAgent.g:3050:2: (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )? otherlv_6= ')' )
            {
            // InternalSimpleAgent.g:3050:2: (otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )? otherlv_6= ')' )
            // InternalSimpleAgent.g:3051:3: otherlv_0= 'run' ( (lv_item_1_0= ruleQualifiedName ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeRunSimpleAccess().getRunKeyword_0());
            		
            // InternalSimpleAgent.g:3055:3: ( (lv_item_1_0= ruleQualifiedName ) )
            // InternalSimpleAgent.g:3056:4: (lv_item_1_0= ruleQualifiedName )
            {
            // InternalSimpleAgent.g:3056:4: (lv_item_1_0= ruleQualifiedName )
            // InternalSimpleAgent.g:3057:5: lv_item_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getCodeRunSimpleAccess().getItemQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_item_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeRunSimpleRule());
            					}
            					set(
            						current,
            						"item",
            						lv_item_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeRunSimpleAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimpleAgent.g:3078:3: ( ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_VARID)||(LA40_0>=36 && LA40_0<=37)||(LA40_0>=68 && LA40_0<=70)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSimpleAgent.g:3079:4: ( (lv_args_3_0= ruleCodeRunArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )*
                    {
                    // InternalSimpleAgent.g:3079:4: ( (lv_args_3_0= ruleCodeRunArg ) )
                    // InternalSimpleAgent.g:3080:5: (lv_args_3_0= ruleCodeRunArg )
                    {
                    // InternalSimpleAgent.g:3080:5: (lv_args_3_0= ruleCodeRunArg )
                    // InternalSimpleAgent.g:3081:6: lv_args_3_0= ruleCodeRunArg
                    {

                    						newCompositeNode(grammarAccess.getCodeRunSimpleAccess().getArgsCodeRunArgParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_args_3_0=ruleCodeRunArg();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCodeRunSimpleRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"it.unibo.jcc.xtext.SimpleAgent.CodeRunArg");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimpleAgent.g:3098:4: (otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==28) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalSimpleAgent.g:3099:5: otherlv_4= ',' ( (lv_args_5_0= ruleCodeRunArg ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_48); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCodeRunSimpleAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSimpleAgent.g:3103:5: ( (lv_args_5_0= ruleCodeRunArg ) )
                    	    // InternalSimpleAgent.g:3104:6: (lv_args_5_0= ruleCodeRunArg )
                    	    {
                    	    // InternalSimpleAgent.g:3104:6: (lv_args_5_0= ruleCodeRunArg )
                    	    // InternalSimpleAgent.g:3105:7: lv_args_5_0= ruleCodeRunArg
                    	    {

                    	    							newCompositeNode(grammarAccess.getCodeRunSimpleAccess().getArgsCodeRunArgParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_args_5_0=ruleCodeRunArg();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCodeRunSimpleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_5_0,
                    	    								"it.unibo.jcc.xtext.SimpleAgent.CodeRunArg");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCodeRunSimpleAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCodeRunSimple"


    // $ANTLR start "entryRuleExec"
    // InternalSimpleAgent.g:3132:1: entryRuleExec returns [EObject current=null] : iv_ruleExec= ruleExec EOF ;
    public final EObject entryRuleExec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExec = null;


        try {
            // InternalSimpleAgent.g:3132:45: (iv_ruleExec= ruleExec EOF )
            // InternalSimpleAgent.g:3133:2: iv_ruleExec= ruleExec EOF
            {
             newCompositeNode(grammarAccess.getExecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExec=ruleExec();

            state._fsp--;

             current =iv_ruleExec; 
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
    // $ANTLR end "entryRuleExec"


    // $ANTLR start "ruleExec"
    // InternalSimpleAgent.g:3139:1: ruleExec returns [EObject current=null] : (otherlv_0= 'machineExec' ( (lv_action_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleExec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_action_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3145:2: ( (otherlv_0= 'machineExec' ( (lv_action_1_0= RULE_STRING ) ) ) )
            // InternalSimpleAgent.g:3146:2: (otherlv_0= 'machineExec' ( (lv_action_1_0= RULE_STRING ) ) )
            {
            // InternalSimpleAgent.g:3146:2: (otherlv_0= 'machineExec' ( (lv_action_1_0= RULE_STRING ) ) )
            // InternalSimpleAgent.g:3147:3: otherlv_0= 'machineExec' ( (lv_action_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getExecAccess().getMachineExecKeyword_0());
            		
            // InternalSimpleAgent.g:3151:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalSimpleAgent.g:3152:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalSimpleAgent.g:3152:4: (lv_action_1_0= RULE_STRING )
            // InternalSimpleAgent.g:3153:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_1_0, grammarAccess.getExecAccess().getActionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_1_0,
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
    // $ANTLR end "ruleExec"


    // $ANTLR start "entryRulePHead"
    // InternalSimpleAgent.g:3173:1: entryRulePHead returns [EObject current=null] : iv_rulePHead= rulePHead EOF ;
    public final EObject entryRulePHead() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHead = null;


        try {
            // InternalSimpleAgent.g:3173:46: (iv_rulePHead= rulePHead EOF )
            // InternalSimpleAgent.g:3174:2: iv_rulePHead= rulePHead EOF
            {
             newCompositeNode(grammarAccess.getPHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePHead=rulePHead();

            state._fsp--;

             current =iv_rulePHead; 
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
    // $ANTLR end "entryRulePHead"


    // $ANTLR start "rulePHead"
    // InternalSimpleAgent.g:3180:1: rulePHead returns [EObject current=null] : (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PStructRef_2= rulePStructRef ) ;
    public final EObject rulePHead() throws RecognitionException {
        EObject current = null;

        EObject this_PAtom_0 = null;

        EObject this_PStruct_1 = null;

        EObject this_PStructRef_2 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:3186:2: ( (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PStructRef_2= rulePStructRef ) )
            // InternalSimpleAgent.g:3187:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PStructRef_2= rulePStructRef )
            {
            // InternalSimpleAgent.g:3187:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PStructRef_2= rulePStructRef )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_VARID:
            case 69:
            case 70:
                {
                alt41=1;
                }
                break;
            case RULE_ID:
                {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==30) ) {
                    alt41=2;
                }
                else if ( (LA41_2==EOF||(LA41_2>=16 && LA41_2<=17)||LA41_2==28||LA41_2==31||(LA41_2>=40 && LA41_2<=47)||(LA41_2>=51 && LA41_2<=57)||(LA41_2>=59 && LA41_2<=65)||LA41_2==67) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA41_3 = input.LA(2);

                if ( (LA41_3==RULE_ID) ) {
                    alt41=3;
                }
                else if ( (LA41_3==RULE_VARID) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalSimpleAgent.g:3188:3: this_PAtom_0= rulePAtom
                    {

                    			newCompositeNode(grammarAccess.getPHeadAccess().getPAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtom_0=rulePAtom();

                    state._fsp--;


                    			current = this_PAtom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:3197:3: this_PStruct_1= rulePStruct
                    {

                    			newCompositeNode(grammarAccess.getPHeadAccess().getPStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PStruct_1=rulePStruct();

                    state._fsp--;


                    			current = this_PStruct_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:3206:3: this_PStructRef_2= rulePStructRef
                    {

                    			newCompositeNode(grammarAccess.getPHeadAccess().getPStructRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PStructRef_2=rulePStructRef();

                    state._fsp--;


                    			current = this_PStructRef_2;
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
    // $ANTLR end "rulePHead"


    // $ANTLR start "entryRulePAtom"
    // InternalSimpleAgent.g:3218:1: entryRulePAtom returns [EObject current=null] : iv_rulePAtom= rulePAtom EOF ;
    public final EObject entryRulePAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtom = null;


        try {
            // InternalSimpleAgent.g:3218:46: (iv_rulePAtom= rulePAtom EOF )
            // InternalSimpleAgent.g:3219:2: iv_rulePAtom= rulePAtom EOF
            {
             newCompositeNode(grammarAccess.getPAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtom=rulePAtom();

            state._fsp--;

             current =iv_rulePAtom; 
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
    // $ANTLR end "entryRulePAtom"


    // $ANTLR start "rulePAtom"
    // InternalSimpleAgent.g:3225:1: rulePAtom returns [EObject current=null] : (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic | this_VarRef_4= ruleVarRef | this_VarSolRef_5= ruleVarSolRef | this_VarRefInStr_6= ruleVarRefInStr ) ;
    public final EObject rulePAtom() throws RecognitionException {
        EObject current = null;

        EObject this_PAtomString_0 = null;

        EObject this_Variable_1 = null;

        EObject this_PAtomNum_2 = null;

        EObject this_PAtomic_3 = null;

        EObject this_VarRef_4 = null;

        EObject this_VarSolRef_5 = null;

        EObject this_VarRefInStr_6 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:3231:2: ( (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic | this_VarRef_4= ruleVarRef | this_VarSolRef_5= ruleVarSolRef | this_VarRefInStr_6= ruleVarRefInStr ) )
            // InternalSimpleAgent.g:3232:2: (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic | this_VarRef_4= ruleVarRef | this_VarSolRef_5= ruleVarSolRef | this_VarRefInStr_6= ruleVarRefInStr )
            {
            // InternalSimpleAgent.g:3232:2: (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic | this_VarRef_4= ruleVarRef | this_VarSolRef_5= ruleVarSolRef | this_VarRefInStr_6= ruleVarRefInStr )
            int alt42=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt42=1;
                }
                break;
            case RULE_VARID:
                {
                alt42=2;
                }
                break;
            case RULE_INT:
                {
                alt42=3;
                }
                break;
            case RULE_ID:
                {
                alt42=4;
                }
                break;
            case 68:
                {
                alt42=5;
                }
                break;
            case 70:
                {
                alt42=6;
                }
                break;
            case 69:
                {
                alt42=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalSimpleAgent.g:3233:3: this_PAtomString_0= rulePAtomString
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomString_0=rulePAtomString();

                    state._fsp--;


                    			current = this_PAtomString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleAgent.g:3242:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleAgent.g:3251:3: this_PAtomNum_2= rulePAtomNum
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomNumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomNum_2=rulePAtomNum();

                    state._fsp--;


                    			current = this_PAtomNum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleAgent.g:3260:3: this_PAtomic_3= rulePAtomic
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomicParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomic_3=rulePAtomic();

                    state._fsp--;


                    			current = this_PAtomic_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSimpleAgent.g:3269:3: this_VarRef_4= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getVarRefParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_4=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSimpleAgent.g:3278:3: this_VarSolRef_5= ruleVarSolRef
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getVarSolRefParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarSolRef_5=ruleVarSolRef();

                    state._fsp--;


                    			current = this_VarSolRef_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSimpleAgent.g:3287:3: this_VarRefInStr_6= ruleVarRefInStr
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getVarRefInStrParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRefInStr_6=ruleVarRefInStr();

                    state._fsp--;


                    			current = this_VarRefInStr_6;
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
    // $ANTLR end "rulePAtom"


    // $ANTLR start "entryRulePAtomString"
    // InternalSimpleAgent.g:3299:1: entryRulePAtomString returns [EObject current=null] : iv_rulePAtomString= rulePAtomString EOF ;
    public final EObject entryRulePAtomString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomString = null;


        try {
            // InternalSimpleAgent.g:3299:52: (iv_rulePAtomString= rulePAtomString EOF )
            // InternalSimpleAgent.g:3300:2: iv_rulePAtomString= rulePAtomString EOF
            {
             newCompositeNode(grammarAccess.getPAtomStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomString=rulePAtomString();

            state._fsp--;

             current =iv_rulePAtomString; 
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
    // $ANTLR end "entryRulePAtomString"


    // $ANTLR start "rulePAtomString"
    // InternalSimpleAgent.g:3306:1: rulePAtomString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject rulePAtomString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3312:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalSimpleAgent.g:3313:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalSimpleAgent.g:3313:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalSimpleAgent.g:3314:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalSimpleAgent.g:3314:3: (lv_val_0_0= RULE_STRING )
            // InternalSimpleAgent.g:3315:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomStringAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
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
    // $ANTLR end "rulePAtomString"


    // $ANTLR start "entryRulePAtomic"
    // InternalSimpleAgent.g:3334:1: entryRulePAtomic returns [EObject current=null] : iv_rulePAtomic= rulePAtomic EOF ;
    public final EObject entryRulePAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomic = null;


        try {
            // InternalSimpleAgent.g:3334:48: (iv_rulePAtomic= rulePAtomic EOF )
            // InternalSimpleAgent.g:3335:2: iv_rulePAtomic= rulePAtomic EOF
            {
             newCompositeNode(grammarAccess.getPAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomic=rulePAtomic();

            state._fsp--;

             current =iv_rulePAtomic; 
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
    // $ANTLR end "entryRulePAtomic"


    // $ANTLR start "rulePAtomic"
    // InternalSimpleAgent.g:3341:1: rulePAtomic returns [EObject current=null] : ( (lv_val_0_0= RULE_ID ) ) ;
    public final EObject rulePAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3347:2: ( ( (lv_val_0_0= RULE_ID ) ) )
            // InternalSimpleAgent.g:3348:2: ( (lv_val_0_0= RULE_ID ) )
            {
            // InternalSimpleAgent.g:3348:2: ( (lv_val_0_0= RULE_ID ) )
            // InternalSimpleAgent.g:3349:3: (lv_val_0_0= RULE_ID )
            {
            // InternalSimpleAgent.g:3349:3: (lv_val_0_0= RULE_ID )
            // InternalSimpleAgent.g:3350:4: lv_val_0_0= RULE_ID
            {
            lv_val_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomicAccess().getValIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomicRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePAtomic"


    // $ANTLR start "entryRulePAtomNum"
    // InternalSimpleAgent.g:3369:1: entryRulePAtomNum returns [EObject current=null] : iv_rulePAtomNum= rulePAtomNum EOF ;
    public final EObject entryRulePAtomNum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomNum = null;


        try {
            // InternalSimpleAgent.g:3369:49: (iv_rulePAtomNum= rulePAtomNum EOF )
            // InternalSimpleAgent.g:3370:2: iv_rulePAtomNum= rulePAtomNum EOF
            {
             newCompositeNode(grammarAccess.getPAtomNumRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomNum=rulePAtomNum();

            state._fsp--;

             current =iv_rulePAtomNum; 
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
    // $ANTLR end "entryRulePAtomNum"


    // $ANTLR start "rulePAtomNum"
    // InternalSimpleAgent.g:3376:1: rulePAtomNum returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject rulePAtomNum() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3382:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalSimpleAgent.g:3383:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalSimpleAgent.g:3383:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalSimpleAgent.g:3384:3: (lv_val_0_0= RULE_INT )
            {
            // InternalSimpleAgent.g:3384:3: (lv_val_0_0= RULE_INT )
            // InternalSimpleAgent.g:3385:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomNumAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "rulePAtomNum"


    // $ANTLR start "entryRulePStructRef"
    // InternalSimpleAgent.g:3404:1: entryRulePStructRef returns [EObject current=null] : iv_rulePStructRef= rulePStructRef EOF ;
    public final EObject entryRulePStructRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePStructRef = null;


        try {
            // InternalSimpleAgent.g:3404:51: (iv_rulePStructRef= rulePStructRef EOF )
            // InternalSimpleAgent.g:3405:2: iv_rulePStructRef= rulePStructRef EOF
            {
             newCompositeNode(grammarAccess.getPStructRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePStructRef=rulePStructRef();

            state._fsp--;

             current =iv_rulePStructRef; 
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
    // $ANTLR end "entryRulePStructRef"


    // $ANTLR start "rulePStructRef"
    // InternalSimpleAgent.g:3411:1: rulePStructRef returns [EObject current=null] : (otherlv_0= '$' ( (lv_struct_1_0= rulePStruct ) ) ) ;
    public final EObject rulePStructRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_struct_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:3417:2: ( (otherlv_0= '$' ( (lv_struct_1_0= rulePStruct ) ) ) )
            // InternalSimpleAgent.g:3418:2: (otherlv_0= '$' ( (lv_struct_1_0= rulePStruct ) ) )
            {
            // InternalSimpleAgent.g:3418:2: (otherlv_0= '$' ( (lv_struct_1_0= rulePStruct ) ) )
            // InternalSimpleAgent.g:3419:3: otherlv_0= '$' ( (lv_struct_1_0= rulePStruct ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPStructRefAccess().getDollarSignKeyword_0());
            		
            // InternalSimpleAgent.g:3423:3: ( (lv_struct_1_0= rulePStruct ) )
            // InternalSimpleAgent.g:3424:4: (lv_struct_1_0= rulePStruct )
            {
            // InternalSimpleAgent.g:3424:4: (lv_struct_1_0= rulePStruct )
            // InternalSimpleAgent.g:3425:5: lv_struct_1_0= rulePStruct
            {

            					newCompositeNode(grammarAccess.getPStructRefAccess().getStructPStructParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_struct_1_0=rulePStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPStructRefRule());
            					}
            					set(
            						current,
            						"struct",
            						lv_struct_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.PStruct");
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
    // $ANTLR end "rulePStructRef"


    // $ANTLR start "entryRulePStruct"
    // InternalSimpleAgent.g:3446:1: entryRulePStruct returns [EObject current=null] : iv_rulePStruct= rulePStruct EOF ;
    public final EObject entryRulePStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePStruct = null;


        try {
            // InternalSimpleAgent.g:3446:48: (iv_rulePStruct= rulePStruct EOF )
            // InternalSimpleAgent.g:3447:2: iv_rulePStruct= rulePStruct EOF
            {
             newCompositeNode(grammarAccess.getPStructRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePStruct=rulePStruct();

            state._fsp--;

             current =iv_rulePStruct; 
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
    // $ANTLR end "entryRulePStruct"


    // $ANTLR start "rulePStruct"
    // InternalSimpleAgent.g:3453:1: rulePStruct returns [EObject current=null] : ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePHead ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePStruct() throws RecognitionException {
        EObject current = null;

        Token lv_functor_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_msgArg_2_0 = null;

        EObject lv_msgArg_4_0 = null;



        	enterRule();

        try {
            // InternalSimpleAgent.g:3459:2: ( ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePHead ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )* otherlv_5= ')' ) )
            // InternalSimpleAgent.g:3460:2: ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePHead ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )* otherlv_5= ')' )
            {
            // InternalSimpleAgent.g:3460:2: ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePHead ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )* otherlv_5= ')' )
            // InternalSimpleAgent.g:3461:3: ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePHead ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )* otherlv_5= ')'
            {
            // InternalSimpleAgent.g:3461:3: ( (lv_functor_0_0= RULE_ID ) )
            // InternalSimpleAgent.g:3462:4: (lv_functor_0_0= RULE_ID )
            {
            // InternalSimpleAgent.g:3462:4: (lv_functor_0_0= RULE_ID )
            // InternalSimpleAgent.g:3463:5: lv_functor_0_0= RULE_ID
            {
            lv_functor_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_functor_0_0, grammarAccess.getPStructAccess().getFunctorIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getPStructAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSimpleAgent.g:3483:3: ( (lv_msgArg_2_0= rulePHead ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_VARID)||(LA43_0>=68 && LA43_0<=70)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSimpleAgent.g:3484:4: (lv_msgArg_2_0= rulePHead )
                    {
                    // InternalSimpleAgent.g:3484:4: (lv_msgArg_2_0= rulePHead )
                    // InternalSimpleAgent.g:3485:5: lv_msgArg_2_0= rulePHead
                    {

                    					newCompositeNode(grammarAccess.getPStructAccess().getMsgArgPHeadParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_msgArg_2_0=rulePHead();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPStructRule());
                    					}
                    					add(
                    						current,
                    						"msgArg",
                    						lv_msgArg_2_0,
                    						"it.unibo.jcc.xtext.SimpleAgent.PHead");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimpleAgent.g:3502:3: (otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==28) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSimpleAgent.g:3503:4: otherlv_3= ',' ( (lv_msgArg_4_0= rulePHead ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_24); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPStructAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSimpleAgent.g:3507:4: ( (lv_msgArg_4_0= rulePHead ) )
            	    // InternalSimpleAgent.g:3508:5: (lv_msgArg_4_0= rulePHead )
            	    {
            	    // InternalSimpleAgent.g:3508:5: (lv_msgArg_4_0= rulePHead )
            	    // InternalSimpleAgent.g:3509:6: lv_msgArg_4_0= rulePHead
            	    {

            	    						newCompositeNode(grammarAccess.getPStructAccess().getMsgArgPHeadParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_msgArg_4_0=rulePHead();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPStructRule());
            	    						}
            	    						add(
            	    							current,
            	    							"msgArg",
            	    							lv_msgArg_4_0,
            	    							"it.unibo.jcc.xtext.SimpleAgent.PHead");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPStructAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePStruct"


    // $ANTLR start "entryRuleVariable"
    // InternalSimpleAgent.g:3535:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSimpleAgent.g:3535:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSimpleAgent.g:3536:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSimpleAgent.g:3542:1: ruleVariable returns [EObject current=null] : ( () ( (lv_varName_1_0= RULE_VARID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3548:2: ( ( () ( (lv_varName_1_0= RULE_VARID ) ) ) )
            // InternalSimpleAgent.g:3549:2: ( () ( (lv_varName_1_0= RULE_VARID ) ) )
            {
            // InternalSimpleAgent.g:3549:2: ( () ( (lv_varName_1_0= RULE_VARID ) ) )
            // InternalSimpleAgent.g:3550:3: () ( (lv_varName_1_0= RULE_VARID ) )
            {
            // InternalSimpleAgent.g:3550:3: ()
            // InternalSimpleAgent.g:3551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalSimpleAgent.g:3557:3: ( (lv_varName_1_0= RULE_VARID ) )
            // InternalSimpleAgent.g:3558:4: (lv_varName_1_0= RULE_VARID )
            {
            // InternalSimpleAgent.g:3558:4: (lv_varName_1_0= RULE_VARID )
            // InternalSimpleAgent.g:3559:5: lv_varName_1_0= RULE_VARID
            {
            lv_varName_1_0=(Token)match(input,RULE_VARID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVariableAccess().getVarNameVARIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VARID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarRef"
    // InternalSimpleAgent.g:3579:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalSimpleAgent.g:3579:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalSimpleAgent.g:3580:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalSimpleAgent.g:3586:1: ruleVarRef returns [EObject current=null] : (otherlv_0= '$' ( (lv_varName_1_0= RULE_VARID ) ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3592:2: ( (otherlv_0= '$' ( (lv_varName_1_0= RULE_VARID ) ) ) )
            // InternalSimpleAgent.g:3593:2: (otherlv_0= '$' ( (lv_varName_1_0= RULE_VARID ) ) )
            {
            // InternalSimpleAgent.g:3593:2: (otherlv_0= '$' ( (lv_varName_1_0= RULE_VARID ) ) )
            // InternalSimpleAgent.g:3594:3: otherlv_0= '$' ( (lv_varName_1_0= RULE_VARID ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getDollarSignKeyword_0());
            		
            // InternalSimpleAgent.g:3598:3: ( (lv_varName_1_0= RULE_VARID ) )
            // InternalSimpleAgent.g:3599:4: (lv_varName_1_0= RULE_VARID )
            {
            // InternalSimpleAgent.g:3599:4: (lv_varName_1_0= RULE_VARID )
            // InternalSimpleAgent.g:3600:5: lv_varName_1_0= RULE_VARID
            {
            lv_varName_1_0=(Token)match(input,RULE_VARID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVarRefAccess().getVarNameVARIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VARID");
            				

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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleVarRefInStr"
    // InternalSimpleAgent.g:3620:1: entryRuleVarRefInStr returns [EObject current=null] : iv_ruleVarRefInStr= ruleVarRefInStr EOF ;
    public final EObject entryRuleVarRefInStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRefInStr = null;


        try {
            // InternalSimpleAgent.g:3620:52: (iv_ruleVarRefInStr= ruleVarRefInStr EOF )
            // InternalSimpleAgent.g:3621:2: iv_ruleVarRefInStr= ruleVarRefInStr EOF
            {
             newCompositeNode(grammarAccess.getVarRefInStrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRefInStr=ruleVarRefInStr();

            state._fsp--;

             current =iv_ruleVarRefInStr; 
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
    // $ANTLR end "entryRuleVarRefInStr"


    // $ANTLR start "ruleVarRefInStr"
    // InternalSimpleAgent.g:3627:1: ruleVarRefInStr returns [EObject current=null] : (otherlv_0= '#' ( (lv_varName_1_0= RULE_VARID ) ) ) ;
    public final EObject ruleVarRefInStr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3633:2: ( (otherlv_0= '#' ( (lv_varName_1_0= RULE_VARID ) ) ) )
            // InternalSimpleAgent.g:3634:2: (otherlv_0= '#' ( (lv_varName_1_0= RULE_VARID ) ) )
            {
            // InternalSimpleAgent.g:3634:2: (otherlv_0= '#' ( (lv_varName_1_0= RULE_VARID ) ) )
            // InternalSimpleAgent.g:3635:3: otherlv_0= '#' ( (lv_varName_1_0= RULE_VARID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getVarRefInStrAccess().getNumberSignKeyword_0());
            		
            // InternalSimpleAgent.g:3639:3: ( (lv_varName_1_0= RULE_VARID ) )
            // InternalSimpleAgent.g:3640:4: (lv_varName_1_0= RULE_VARID )
            {
            // InternalSimpleAgent.g:3640:4: (lv_varName_1_0= RULE_VARID )
            // InternalSimpleAgent.g:3641:5: lv_varName_1_0= RULE_VARID
            {
            lv_varName_1_0=(Token)match(input,RULE_VARID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVarRefInStrAccess().getVarNameVARIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRefInStrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VARID");
            				

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
    // $ANTLR end "ruleVarRefInStr"


    // $ANTLR start "entryRuleVarSolRef"
    // InternalSimpleAgent.g:3661:1: entryRuleVarSolRef returns [EObject current=null] : iv_ruleVarSolRef= ruleVarSolRef EOF ;
    public final EObject entryRuleVarSolRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarSolRef = null;


        try {
            // InternalSimpleAgent.g:3661:50: (iv_ruleVarSolRef= ruleVarSolRef EOF )
            // InternalSimpleAgent.g:3662:2: iv_ruleVarSolRef= ruleVarSolRef EOF
            {
             newCompositeNode(grammarAccess.getVarSolRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarSolRef=ruleVarSolRef();

            state._fsp--;

             current =iv_ruleVarSolRef; 
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
    // $ANTLR end "entryRuleVarSolRef"


    // $ANTLR start "ruleVarSolRef"
    // InternalSimpleAgent.g:3668:1: ruleVarSolRef returns [EObject current=null] : (otherlv_0= '@' ( (lv_varName_1_0= RULE_VARID ) ) ) ;
    public final EObject ruleVarSolRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalSimpleAgent.g:3674:2: ( (otherlv_0= '@' ( (lv_varName_1_0= RULE_VARID ) ) ) )
            // InternalSimpleAgent.g:3675:2: (otherlv_0= '@' ( (lv_varName_1_0= RULE_VARID ) ) )
            {
            // InternalSimpleAgent.g:3675:2: (otherlv_0= '@' ( (lv_varName_1_0= RULE_VARID ) ) )
            // InternalSimpleAgent.g:3676:3: otherlv_0= '@' ( (lv_varName_1_0= RULE_VARID ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getVarSolRefAccess().getCommercialAtKeyword_0());
            		
            // InternalSimpleAgent.g:3680:3: ( (lv_varName_1_0= RULE_VARID ) )
            // InternalSimpleAgent.g:3681:4: (lv_varName_1_0= RULE_VARID )
            {
            // InternalSimpleAgent.g:3681:4: (lv_varName_1_0= RULE_VARID )
            // InternalSimpleAgent.g:3682:5: lv_varName_1_0= RULE_VARID
            {
            lv_varName_1_0=(Token)match(input,RULE_VARID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVarSolRefAccess().getVarNameVARIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarSolRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"it.unibo.jcc.xtext.SimpleAgent.VARID");
            				

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
    // $ANTLR end "ruleVarSolRef"

    // Delegated rules


    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\101\1\4\1\22\2\4\1\22\2\uffff";
    static final String dfa_3s = "\1\101\1\4\1\36\1\4\1\106\1\36\2\uffff";
    static final String dfa_4s = "\6\uffff\1\2\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\13\uffff\1\4",
            "\1\5",
            "\4\6\27\uffff\1\6\4\uffff\2\6\34\uffff\1\7\1\uffff\3\6",
            "\1\3\13\uffff\1\4",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2910:2: (this_CodeRunActor_0= ruleCodeRunActor | this_CodeRunSimple_1= ruleCodeRunSimple )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00007F4000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00007F0000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800009E20000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000009E20000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFBD8800000020000L,0x000000000000000BL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000009C20000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000000F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000D00000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xFBD8800000000002L,0x000000000000000BL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFBD8800000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000030000000F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000030800000F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000900000F0L,0x0000000000000070L});

}