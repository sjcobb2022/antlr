// Generated from Imp.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, VAR=26, INT=27, WS=28;
	public static final int
		RULE_cmd = 0, RULE_aexp = 1, RULE_bexp = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmd", "aexp", "bexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'skip'", "':='", "';'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'do'", "'od'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'true'", "'false'", 
			"'='", "'<'", "'>'", "'<>'", "'not'", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "VAR", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends CmdContext {
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public AssignmentContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends CmdContext {
		public SkipContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSkip(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends CmdContext {
		public BexpContext condition;
		public CmdContext body;
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public WhileContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends CmdContext {
		public CmdContext first;
		public CmdContext second;
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public SequenceContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSequence(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends CmdContext {
		public BexpContext condition;
		public CmdContext true_;
		public CmdContext false_;
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public IfContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIf(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		return cmd(0);
	}

	private CmdContext cmd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmdContext _localctx = new CmdContext(_ctx, _parentState);
		CmdContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_cmd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				match(T__0);
				}
				break;
			case VAR:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(8);
				match(VAR);
				setState(9);
				match(T__1);
				setState(10);
				aexp(0);
				}
				break;
			case T__3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(T__3);
				setState(12);
				((IfContext)_localctx).condition = bexp();
				setState(13);
				match(T__4);
				setState(14);
				((IfContext)_localctx).true_ = cmd(0);
				setState(15);
				match(T__5);
				setState(16);
				((IfContext)_localctx).false_ = cmd(0);
				setState(17);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__7);
				setState(20);
				((WhileContext)_localctx).condition = bexp();
				setState(21);
				match(T__8);
				setState(22);
				((WhileContext)_localctx).body = cmd(0);
				setState(23);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SequenceContext(new CmdContext(_parentctx, _parentState));
					((SequenceContext)_localctx).first = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_cmd);
					setState(27);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(28);
					match(T__2);
					setState(29);
					((SequenceContext)_localctx).second = cmd(4);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AexpContext extends ParserRuleContext {
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	 
		public AexpContext() { }
		public void copyFrom(AexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends AexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public MultiplicationContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitMultiplication(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends AexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public AdditionContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAddition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends AexpContext {
		public TerminalNode VAR() { return getToken(ImpParser.VAR, 0); }
		public VariableContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends AexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public SubtractionContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSubtraction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketsContext extends AexpContext {
		public AexpContext inner;
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public BracketsContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBrackets(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends AexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public DivisionContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitDivision(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends AexpContext {
		public TerminalNode INT() { return getToken(ImpParser.INT, 0); }
		public AtomContext(AexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAtom(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new AtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(36);
				match(INT);
				}
				break;
			case VAR:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(VAR);
				}
				break;
			case T__10:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__10);
				setState(39);
				((BracketsContext)_localctx).inner = aexp(0);
				setState(40);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new AexpContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(44);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(45);
						match(T__12);
						setState(46);
						((MultiplicationContext)_localctx).right = aexp(5);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new AexpContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(47);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(48);
						match(T__13);
						setState(49);
						((DivisionContext)_localctx).right = aexp(4);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new AexpContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(50);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(51);
						match(T__14);
						setState(52);
						((AdditionContext)_localctx).right = aexp(3);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new AexpContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(53);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(54);
						match(T__15);
						setState(55);
						((SubtractionContext)_localctx).right = aexp(2);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BexpContext extends ParserRuleContext {
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
	 
		public BexpContext() { }
		public void copyFrom(BexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsContext extends BexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public EqualsContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitEquals(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends BexpContext {
		public BexpContext inner;
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public NotContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BexpContext {
		public BexpContext left;
		public BexpContext right;
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public OrContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BexpContext {
		public BexpContext left;
		public BexpContext right;
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public AndContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends BexpContext {
		public TrueContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitTrue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterContext extends BexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public GreaterContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitGreater(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends BexpContext {
		public FalseContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFalse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallerContext extends BexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public SmallerContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSmaller(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InequalityContext extends BexpContext {
		public AexpContext left;
		public AexpContext right;
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public InequalityContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterInequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitInequality(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		BexpContext _localctx = new BexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bexp);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__16);
				}
				break;
			case 2:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				((EqualsContext)_localctx).left = aexp(0);
				setState(64);
				match(T__18);
				setState(65);
				((EqualsContext)_localctx).right = aexp(0);
				}
				break;
			case 4:
				_localctx = new SmallerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				((SmallerContext)_localctx).left = aexp(0);
				setState(68);
				match(T__19);
				setState(69);
				((SmallerContext)_localctx).right = aexp(0);
				}
				break;
			case 5:
				_localctx = new GreaterContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				((GreaterContext)_localctx).left = aexp(0);
				setState(72);
				match(T__20);
				setState(73);
				((GreaterContext)_localctx).right = aexp(0);
				}
				break;
			case 6:
				_localctx = new InequalityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				((InequalityContext)_localctx).left = aexp(0);
				setState(76);
				match(T__21);
				setState(77);
				((InequalityContext)_localctx).right = aexp(0);
				}
				break;
			case 7:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(T__22);
				setState(80);
				((NotContext)_localctx).inner = bexp();
				}
				break;
			case 8:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(T__10);
				setState(82);
				((AndContext)_localctx).left = bexp();
				setState(83);
				match(T__23);
				setState(84);
				((AndContext)_localctx).right = bexp();
				setState(85);
				match(T__11);
				}
				break;
			case 9:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				match(T__10);
				setState(88);
				((OrContext)_localctx).left = bexp();
				setState(89);
				match(T__24);
				setState(90);
				((OrContext)_localctx).right = bexp();
				setState(91);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return cmd_sempred((CmdContext)_localctx, predIndex);
		case 1:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cmd_sempred(CmdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001"+
		"<\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0002"+
		"\u0000\u0002\u0000\u0002\u0003\u0000\u0002\u0004\u0000\u0000n\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004]\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0006\u0000\uffff\uffff\u0000\u0007\u001a\u0005"+
		"\u0001\u0000\u0000\b\t\u0005\u001a\u0000\u0000\t\n\u0005\u0002\u0000\u0000"+
		"\n\u001a\u0003\u0002\u0001\u0000\u000b\f\u0005\u0004\u0000\u0000\f\r\u0003"+
		"\u0004\u0002\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u000f\u0003\u0000"+
		"\u0000\u0000\u000f\u0010\u0005\u0006\u0000\u0000\u0010\u0011\u0003\u0000"+
		"\u0000\u0000\u0011\u0012\u0005\u0007\u0000\u0000\u0012\u001a\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\b\u0000\u0000\u0014\u0015\u0003\u0004\u0002"+
		"\u0000\u0015\u0016\u0005\t\u0000\u0000\u0016\u0017\u0003\u0000\u0000\u0000"+
		"\u0017\u0018\u0005\n\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019"+
		"\u0006\u0001\u0000\u0000\u0000\u0019\b\u0001\u0000\u0000\u0000\u0019\u000b"+
		"\u0001\u0000\u0000\u0000\u0019\u0013\u0001\u0000\u0000\u0000\u001a \u0001"+
		"\u0000\u0000\u0000\u001b\u001c\n\u0003\u0000\u0000\u001c\u001d\u0005\u0003"+
		"\u0000\u0000\u001d\u001f\u0003\u0000\u0000\u0004\u001e\u001b\u0001\u0000"+
		"\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#$\u0006\u0001\uffff\uffff\u0000$+\u0005\u001b\u0000"+
		"\u0000%+\u0005\u001a\u0000\u0000&\'\u0005\u000b\u0000\u0000\'(\u0003\u0002"+
		"\u0001\u0000()\u0005\f\u0000\u0000)+\u0001\u0000\u0000\u0000*#\u0001\u0000"+
		"\u0000\u0000*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000+:\u0001"+
		"\u0000\u0000\u0000,-\n\u0004\u0000\u0000-.\u0005\r\u0000\u0000.9\u0003"+
		"\u0002\u0001\u0005/0\n\u0003\u0000\u000001\u0005\u000e\u0000\u000019\u0003"+
		"\u0002\u0001\u000423\n\u0002\u0000\u000034\u0005\u000f\u0000\u000049\u0003"+
		"\u0002\u0001\u000356\n\u0001\u0000\u000067\u0005\u0010\u0000\u000079\u0003"+
		"\u0002\u0001\u00028,\u0001\u0000\u0000\u00008/\u0001\u0000\u0000\u0000"+
		"82\u0001\u0000\u0000\u000085\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0003\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=^\u0005\u0011\u0000\u0000"+
		">^\u0005\u0012\u0000\u0000?@\u0003\u0002\u0001\u0000@A\u0005\u0013\u0000"+
		"\u0000AB\u0003\u0002\u0001\u0000B^\u0001\u0000\u0000\u0000CD\u0003\u0002"+
		"\u0001\u0000DE\u0005\u0014\u0000\u0000EF\u0003\u0002\u0001\u0000F^\u0001"+
		"\u0000\u0000\u0000GH\u0003\u0002\u0001\u0000HI\u0005\u0015\u0000\u0000"+
		"IJ\u0003\u0002\u0001\u0000J^\u0001\u0000\u0000\u0000KL\u0003\u0002\u0001"+
		"\u0000LM\u0005\u0016\u0000\u0000MN\u0003\u0002\u0001\u0000N^\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0017\u0000\u0000P^\u0003\u0004\u0002\u0000QR\u0005"+
		"\u000b\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0005\u0018\u0000\u0000"+
		"TU\u0003\u0004\u0002\u0000UV\u0005\f\u0000\u0000V^\u0001\u0000\u0000\u0000"+
		"WX\u0005\u000b\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005\u0019\u0000"+
		"\u0000Z[\u0003\u0004\u0002\u0000[\\\u0005\f\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000]=\u0001\u0000\u0000\u0000]>\u0001\u0000\u0000\u0000]?\u0001"+
		"\u0000\u0000\u0000]C\u0001\u0000\u0000\u0000]G\u0001\u0000\u0000\u0000"+
		"]K\u0001\u0000\u0000\u0000]O\u0001\u0000\u0000\u0000]Q\u0001\u0000\u0000"+
		"\u0000]W\u0001\u0000\u0000\u0000^\u0005\u0001\u0000\u0000\u0000\u0006"+
		"\u0019 *8:]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}