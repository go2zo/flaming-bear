package org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAppliedStereotypePropertyLexer extends Lexer {

	public static final int RULE_ID = 6;

	public static final int T__29 = 29;

	public static final int T__28 = 28;

	public static final int T__27 = 27;

	public static final int T__26 = 26;

	public static final int T__25 = 25;

	public static final int T__24 = 24;

	public static final int T__23 = 23;

	public static final int T__22 = 22;

	public static final int RULE_ANY_OTHER = 11;

	public static final int T__21 = 21;

	public static final int T__20 = 20;

	public static final int EOF = -1;

	public static final int T__93 = 93;

	public static final int T__19 = 19;

	public static final int T__94 = 94;

	public static final int T__91 = 91;

	public static final int T__92 = 92;

	public static final int T__16 = 16;

	public static final int T__90 = 90;

	public static final int T__15 = 15;

	public static final int T__18 = 18;

	public static final int T__17 = 17;

	public static final int T__12 = 12;

	public static final int T__14 = 14;

	public static final int T__13 = 13;

	public static final int T__99 = 99;

	public static final int T__98 = 98;

	public static final int RULE_INTEGERVALUE = 7;

	public static final int T__97 = 97;

	public static final int T__96 = 96;

	public static final int T__95 = 95;

	public static final int T__80 = 80;

	public static final int T__81 = 81;

	public static final int T__82 = 82;

	public static final int T__83 = 83;

	public static final int T__85 = 85;

	public static final int T__84 = 84;

	public static final int T__87 = 87;

	public static final int T__86 = 86;

	public static final int T__89 = 89;

	public static final int T__88 = 88;

	public static final int RULE_ML_COMMENT = 4;

	public static final int RULE_STRING = 8;

	public static final int T__71 = 71;

	public static final int T__72 = 72;

	public static final int T__70 = 70;

	public static final int T__76 = 76;

	public static final int T__75 = 75;

	public static final int T__74 = 74;

	public static final int T__73 = 73;

	public static final int T__79 = 79;

	public static final int T__78 = 78;

	public static final int T__77 = 77;

	public static final int T__68 = 68;

	public static final int T__69 = 69;

	public static final int T__66 = 66;

	public static final int T__67 = 67;

	public static final int T__64 = 64;

	public static final int T__65 = 65;

	public static final int T__62 = 62;

	public static final int T__63 = 63;

	public static final int T__61 = 61;

	public static final int T__60 = 60;

	public static final int T__55 = 55;

	public static final int T__56 = 56;

	public static final int T__57 = 57;

	public static final int T__58 = 58;

	public static final int T__51 = 51;

	public static final int T__52 = 52;

	public static final int T__53 = 53;

	public static final int T__54 = 54;

	public static final int T__107 = 107;

	public static final int T__108 = 108;

	public static final int T__109 = 109;

	public static final int T__103 = 103;

	public static final int T__59 = 59;

	public static final int T__104 = 104;

	public static final int T__105 = 105;

	public static final int T__106 = 106;

	public static final int RULE_INT = 9;

	public static final int T__50 = 50;

	public static final int T__42 = 42;

	public static final int T__43 = 43;

	public static final int T__40 = 40;

	public static final int T__41 = 41;

	public static final int T__46 = 46;

	public static final int T__47 = 47;

	public static final int T__44 = 44;

	public static final int T__45 = 45;

	public static final int T__48 = 48;

	public static final int T__49 = 49;

	public static final int T__102 = 102;

	public static final int T__101 = 101;

	public static final int T__100 = 100;

	public static final int RULE_SL_COMMENT = 5;

	public static final int T__30 = 30;

	public static final int T__31 = 31;

	public static final int T__32 = 32;

	public static final int T__33 = 33;

	public static final int T__34 = 34;

	public static final int T__35 = 35;

	public static final int T__36 = 36;

	public static final int T__37 = 37;

	public static final int T__38 = 38;

	public static final int T__39 = 39;

	public static final int RULE_WS = 10;

	// delegates
	// delegators

	public InternalAppliedStereotypePropertyLexer() {
		;
	}

	public InternalAppliedStereotypePropertyLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalAppliedStereotypePropertyLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String getGrammarFileName() {
		return "../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g";
	}

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:11:7: ( '++' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:11:9: '++'
			{
				match("++");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:12:7: ( '--' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:12:9: '--'
			{
				match("--");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:13:7: ( '==' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:13:9: '=='
			{
				match("==");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:14:7: ( '!=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:14:9: '!='
			{
				match("!=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:15:7: ( 'instanceof' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:15:9: 'instanceof'
			{
				match("instanceof");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:16:7: ( 'hastype' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:16:9: 'hastype'
			{
				match("hastype");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:17:7: ( '<' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:17:9: '<'
			{
				match('<');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18:7: ( '>' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18:9: '>'
			{
				match('>');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:19:7: ( '<=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:19:9: '<='
			{
				match("<=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:20:7: ( '>=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:20:9: '>='
			{
				match(">=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:21:7: ( '<<' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:21:9: '<<'
			{
				match("<<");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:22:7: ( '>>' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:22:9: '>>'
			{
				match(">>");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:23:7: ( '>>>' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:23:9: '>>>'
			{
				match(">>>");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:24:7: ( '+' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:24:9: '+'
			{
				match('+');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:25:7: ( '-' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:25:9: '-'
			{
				match('-');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:26:7: ( '*' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:26:9: '*'
			{
				match('*');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:27:7: ( '/' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:27:9: '/'
			{
				match('/');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:28:7: ( '%' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:28:9: '%'
			{
				match('%');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:29:7: ( '!' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:29:9: '!'
			{
				match('!');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:30:7: ( '$' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:30:9: '$'
			{
				match('$');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:31:7: ( '~' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:31:9: '~'
			{
				match('~');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:32:7: ( 'true' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:32:9: 'true'
			{
				match("true");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:33:7: ( 'false' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:33:9: 'false'
			{
				match("false");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:34:7: ( 'createLink' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:34:9: 'createLink'
			{
				match("createLink");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:35:7: ( 'destroyLink' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:35:9: 'destroyLink'
			{
				match("destroyLink");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:36:7: ( 'clearAssoc' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:36:9: 'clearAssoc'
			{
				match("clearAssoc");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:37:7: ( 'select' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:37:9: 'select'
			{
				match("select");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:38:7: ( 'reject' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:38:9: 'reject'
			{
				match("reject");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:39:7: ( 'collect' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:39:9: 'collect'
			{
				match("collect");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:40:7: ( 'iterate' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:40:9: 'iterate'
			{
				match("iterate");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:41:7: ( 'forAll' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:41:9: 'forAll'
			{
				match("forAll");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:42:7: ( 'exists' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:42:9: 'exists'
			{
				match("exists");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:43:7: ( 'one' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:43:9: 'one'
			{
				match("one");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:44:7: ( 'isolated' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:44:9: 'isolated'
			{
				match("isolated");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:45:7: ( 'determined' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:45:9: 'determined'
			{
				match("determined");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:46:7: ( 'assured' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:46:9: 'assured'
			{
				match("assured");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:47:7: ( 'parallel' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:47:9: 'parallel'
			{
				match("parallel");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:48:7: ( '=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:48:9: '='
			{
				match('=');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:49:7: ( '+=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:49:9: '+='
			{
				match("+=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:50:7: ( '-=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:50:9: '-='
			{
				match("-=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:51:7: ( '*=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:51:9: '*='
			{
				match("*=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:52:7: ( '%=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:52:9: '%='
			{
				match("%=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:53:7: ( '/=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:53:9: '/='
			{
				match("/=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:54:7: ( '&=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:54:9: '&='
			{
				match("&=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:55:7: ( '|=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:55:9: '|='
			{
				match("|=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:56:7: ( '^=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:56:9: '^='
			{
				match("^=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:57:7: ( '<<=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:57:9: '<<='
			{
				match("<<=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:58:7: ( '>>=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:58:9: '>>='
			{
				match(">>=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:59:7: ( '>>>=' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:59:9: '>>>='
			{
				match(">>>=");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:60:7: ( '::' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:60:9: '::'
			{
				match("::");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:61:7: ( ',' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:61:9: ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:62:7: ( '=>' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:62:9: '=>'
			{
				match("=>");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:63:7: ( '(' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:63:9: '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:64:7: ( ')' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:64:9: ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:65:7: ( '?' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:65:9: '?'
			{
				match('?');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:66:7: ( ':' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:66:9: ':'
			{
				match(':');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:67:7: ( '||' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:67:9: '||'
			{
				match("||");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:68:7: ( '&&' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:68:9: '&&'
			{
				match("&&");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:69:7: ( '|' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:69:9: '|'
			{
				match('|');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:70:7: ( '^' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:70:9: '^'
			{
				match('^');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:71:7: ( '&' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:71:9: '&'
			{
				match('&');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:72:7: ( '.' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:72:9: '.'
			{
				match('.');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:73:7: ( '[' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:73:9: '['
			{
				match('[');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:74:7: ( ']' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:74:9: ']'
			{
				match(']');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:75:7: ( '->' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:75:9: '->'
			{
				match("->");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:76:7: ( 'reduce' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:76:9: 'reduce'
			{
				match("reduce");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:77:7: ( 'isUnique' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:77:9: 'isUnique'
			{
				match("isUnique");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:78:7: ( 'null' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:78:9: 'null'
			{
				match("null");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:79:7: ( 'this' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:79:9: 'this'
			{
				match("this");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:80:7: ( 'super' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:80:9: 'super'
			{
				match("super");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:81:7: ( 'new' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:81:9: 'new'
			{
				match("new");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:82:7: ( '{' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:82:9: '{'
			{
				match('{');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:83:7: ( '}' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:83:9: '}'
			{
				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:84:7: ( '..' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:84:9: '..'
			{
				match("..");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:85:7: ( 'allInstances' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:85:9: 'allInstances'
			{
				match("allInstances");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:86:7: ( '/*@' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:86:9: '/*@'
			{
				match("/*@");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:87:7: ( 'inline' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:87:9: 'inline'
			{
				match("inline");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:88:7: ( '*/' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:88:9: '*/'
			{
				match("*/");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:89:7: ( '//@' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:89:9: '//@'
			{
				match("//@");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:90:7: ( ';' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:90:9: ';'
			{
				match(';');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:91:7: ( 'let' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:91:9: 'let'
			{
				match("let");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:92:7: ( 'if' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:92:9: 'if'
			{
				match("if");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:93:7: ( 'else' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:93:9: 'else'
			{
				match("else");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:94:7: ( 'or' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:94:9: 'or'
			{
				match("or");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:95:7: ( 'switch' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:95:9: 'switch'
			{
				match("switch");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:96:7: ( 'case' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:96:9: 'case'
			{
				match("case");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:97:7: ( 'default' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:97:9: 'default'
			{
				match("default");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:98:7: ( 'while' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:98:9: 'while'
			{
				match("while");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:99:8: ( 'do' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:99:10: 'do'
			{
				match("do");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:100:8: ( 'for' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:100:10: 'for'
			{
				match("for");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:101:8: ( 'in' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:101:10: 'in'
			{
				match("in");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:102:8: ( 'break' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:102:10: 'break'
			{
				match("break");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:103:8: ( 'return' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:103:10: 'return'
			{
				match("return");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:104:8: ( 'accept' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:104:10: 'accept'
			{
				match("accept");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:105:8: ( 'classify' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:105:10: 'classify'
			{
				match("classify");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:106:8: ( 'from' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:106:10: 'from'
			{
				match("from");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:107:8: ( 'to' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:107:10: 'to'
			{
				match("to");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:108:8: ( 'ordered' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:108:10: 'ordered'
			{
				match("ordered");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "T__109"

	// $ANTLR start "RULE_INTEGERVALUE"
	public final void mRULE_INTEGERVALUE() throws RecognitionException {
		try {
			int _type = RULE_INTEGERVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:19: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
				int alt13 = 4;
				int LA13_0 = input.LA(1);

				if((LA13_0 == '0')) {
					switch(input.LA(2)) {
					case 'B':
					case 'b':
					{
						alt13 = 2;
					}
						break;
					case 'X':
					case 'x':
					{
						alt13 = 3;
					}
						break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '_':
					{
						alt13 = 4;
					}
						break;
					default:
						alt13 = 1;
					}

				} else if(((LA13_0 >= '1' && LA13_0 <= '9'))) {
					alt13 = 1;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 13, 0, input);

					throw nvae;
				}
				switch(alt13) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if((LA3_0 == '0')) {
						alt3 = 1;
					} else if(((LA3_0 >= '1' && LA3_0 <= '9'))) {
						alt3 = 2;
					} else {
						NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

						throw nvae;
					}
					switch(alt3) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:23: '0'
					{
						match('0');

					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:27: '1' .. '9' ( ( '_' )? '0' .. '9' )*
					{
						matchRange('1', '9');
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:36: ( ( '_' )? '0' .. '9' )*
						loop2: do {
							int alt2 = 2;
							int LA2_0 = input.LA(1);

							if(((LA2_0 >= '0' && LA2_0 <= '9') || LA2_0 == '_')) {
								alt2 = 1;
							}


							switch(alt2) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:37: ( '_' )? '0' .. '9'
							{
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:37: ( '_' )?
								int alt1 = 2;
								int LA1_0 = input.LA(1);

								if((LA1_0 == '_')) {
									alt1 = 1;
								}
								switch(alt1) {
								case 1:
								// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:37: '_'
								{
									match('_');

								}
									break;

								}

								matchRange('0', '9');

							}
								break;

							default:
								break loop2;
							}
						} while(true);


					}
						break;

					}


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:54: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:54: ( '0b' | '0B' )
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if((LA4_0 == '0')) {
						int LA4_1 = input.LA(2);

						if((LA4_1 == 'b')) {
							alt4 = 1;
						} else if((LA4_1 == 'B')) {
							alt4 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException("", 4, 1, input);

							throw nvae;
						}
					} else {
						NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

						throw nvae;
					}
					switch(alt4) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:55: '0b'
					{
						match("0b");


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:60: '0B'
					{
						match("0B");


					}
						break;

					}

					matchRange('0', '1');
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:75: ( ( '_' )? '0' .. '1' )*
					loop6: do {
						int alt6 = 2;
						int LA6_0 = input.LA(1);

						if(((LA6_0 >= '0' && LA6_0 <= '1') || LA6_0 == '_')) {
							alt6 = 1;
						}


						switch(alt6) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:76: ( '_' )? '0' .. '1'
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:76: ( '_' )?
							int alt5 = 2;
							int LA5_0 = input.LA(1);

							if((LA5_0 == '_')) {
								alt5 = 1;
							}
							switch(alt5) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:76: '_'
							{
								match('_');

							}
								break;

							}

							matchRange('0', '1');

						}
							break;

						default:
							break loop6;
						}
					} while(true);


				}
					break;
				case 3:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:92: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:92: ( '0x' | '0X' )
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if((LA7_0 == '0')) {
						int LA7_1 = input.LA(2);

						if((LA7_1 == 'x')) {
							alt7 = 1;
						} else if((LA7_1 == 'X')) {
							alt7 = 2;
						} else {
							NoViableAltException nvae = new NoViableAltException("", 7, 1, input);

							throw nvae;
						}
					} else {
						NoViableAltException nvae = new NoViableAltException("", 7, 0, input);

						throw nvae;
					}
					switch(alt7) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:93: '0x'
					{
						match("0x");


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:98: '0X'
					{
						match("0X");


					}
						break;

					}

					if((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F') || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						recover(mse);
						throw mse;
					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:133: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
					loop9: do {
						int alt9 = 2;
						int LA9_0 = input.LA(1);

						if(((LA9_0 >= '0' && LA9_0 <= '9') || (LA9_0 >= 'A' && LA9_0 <= 'F') || LA9_0 == '_' || (LA9_0 >= 'a' && LA9_0 <= 'f'))) {
							alt9 = 1;
						}


						switch(alt9) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:134: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:134: ( '_' )?
							int alt8 = 2;
							int LA8_0 = input.LA(1);

							if((LA8_0 == '_')) {
								alt8 = 1;
							}
							switch(alt8) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:134: '_'
							{
								match('_');

							}
								break;

							}

							if((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F') || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
								input.consume();

							} else {
								MismatchedSetException mse = new MismatchedSetException(null, input);
								recover(mse);
								throw mse;
							}


						}
							break;

						default:
							break loop9;
						}
					} while(true);


				}
					break;
				case 4:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:170: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
				{
					match('0');
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:174: ( '_' )?
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if((LA10_0 == '_')) {
						alt10 = 1;
					}
					switch(alt10) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:174: '_'
					{
						match('_');

					}
						break;

					}

					matchRange('0', '7');
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:188: ( ( '_' )? '0' .. '7' )*
					loop12: do {
						int alt12 = 2;
						int LA12_0 = input.LA(1);

						if(((LA12_0 >= '0' && LA12_0 <= '7') || LA12_0 == '_')) {
							alt12 = 1;
						}


						switch(alt12) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:189: ( '_' )? '0' .. '7'
						{
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:189: ( '_' )?
							int alt11 = 2;
							int LA11_0 = input.LA(1);

							if((LA11_0 == '_')) {
								alt11 = 1;
							}
							switch(alt11) {
							case 1:
							// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18813:189: '_'
							{
								match('_');

							}
								break;

							}

							matchRange('0', '7');

						}
							break;

						default:
							break loop12;
						}
					} while(true);


				}
					break;

				}


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_INTEGERVALUE"

	// $ANTLR start "RULE_ID"
	public final void mRULE_ID() throws RecognitionException {
		try {
			int _type = RULE_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
				int alt16 = 2;
				int LA16_0 = input.LA(1);

				if(((LA16_0 >= 'A' && LA16_0 <= 'Z') || LA16_0 == '_' || (LA16_0 >= 'a' && LA16_0 <= 'z'))) {
					alt16 = 1;
				} else if((LA16_0 == '\'')) {
					alt16 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 16, 0, input);

					throw nvae;
				}
				switch(alt16) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
				{
					if((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(null, input);
						recover(mse);
						throw mse;
					}

					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
					loop14: do {
						int alt14 = 2;
						int LA14_0 = input.LA(1);

						if(((LA14_0 >= '0' && LA14_0 <= '9') || (LA14_0 >= 'A' && LA14_0 <= 'Z') || LA14_0 == '_' || (LA14_0 >= 'a' && LA14_0 <= 'z'))) {
							alt14 = 1;
						}


						switch(alt14) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:
						{
							if((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
								input.consume();

							} else {
								MismatchedSetException mse = new MismatchedSetException(null, input);
								recover(mse);
								throw mse;
							}


						}
							break;

						default:
							break loop14;
						}
					} while(true);


				}
					break;
				case 2:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:70: '\\'' ( options {greedy=false; } : . )* '\\''
				{
					match('\'');
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:75: ( options {greedy=false; } : . )*
					loop15: do {
						int alt15 = 2;
						int LA15_0 = input.LA(1);

						if((LA15_0 == '\'')) {
							alt15 = 2;
						} else if(((LA15_0 >= '\u0000' && LA15_0 <= '&') || (LA15_0 >= '(' && LA15_0 <= '\uFFFF'))) {
							alt15 = 1;
						}


						switch(alt15) {
						case 1:
						// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18815:103: .
						{
							matchAny();

						}
							break;

						default:
							break loop15;
						}
					} while(true);

					match('\'');

				}
					break;

				}


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_ID"

	// $ANTLR start "RULE_STRING"
	public final void mRULE_STRING() throws RecognitionException {
		try {
			int _type = RULE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18817:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18817:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
			{
				match('\"');
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18817:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
				loop17: do {
					int alt17 = 3;
					int LA17_0 = input.LA(1);

					if((LA17_0 == '\\')) {
						alt17 = 1;
					} else if(((LA17_0 >= '\u0000' && LA17_0 <= '!') || (LA17_0 >= '#' && LA17_0 <= '[') || (LA17_0 >= ']' && LA17_0 <= '\uFFFF'))) {
						alt17 = 2;
					}


					switch(alt17) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18817:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
					{
						match('\\');
						if(input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'b' || input.LA(1) == 'f' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}


					}
						break;
					case 2:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18817:61: ~ ( ( '\\\\' | '\"' ) )
					{
						if((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '[') || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}


					}
						break;

					default:
						break loop17;
					}
				} while(true);

				match('\"');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_STRING"

	// $ANTLR start "RULE_ML_COMMENT"
	public final void mRULE_ML_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18819:17: ( '/*' ~ ( '@' ) ( options {greedy=false; } : . )* '*/' )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18819:19: '/*' ~ ( '@' ) ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				if((input.LA(1) >= '\u0000' && input.LA(1) <= '?') || (input.LA(1) >= 'A' && input.LA(1) <= '\uFFFF')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(null, input);
					recover(mse);
					throw mse;
				}

				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18819:31: ( options {greedy=false; } : . )*
				loop18: do {
					int alt18 = 2;
					int LA18_0 = input.LA(1);

					if((LA18_0 == '*')) {
						int LA18_1 = input.LA(2);

						if((LA18_1 == '/')) {
							alt18 = 2;
						} else if(((LA18_1 >= '\u0000' && LA18_1 <= '.') || (LA18_1 >= '0' && LA18_1 <= '\uFFFF'))) {
							alt18 = 1;
						}


					} else if(((LA18_0 >= '\u0000' && LA18_0 <= ')') || (LA18_0 >= '+' && LA18_0 <= '\uFFFF'))) {
						alt18 = 1;
					}


					switch(alt18) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18819:59: .
					{
						matchAny();

					}
						break;

					default:
						break loop18;
					}
				} while(true);

				match("*/");


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_ML_COMMENT"

	// $ANTLR start "RULE_SL_COMMENT"
	public final void mRULE_SL_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:17: ( '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )? )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:19: '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )?
			{
				match("//");

				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:24: (~ ( ( '\\n' | '\\r' | '@' ) ) )*
				loop19: do {
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if(((LA19_0 >= '\u0000' && LA19_0 <= '\t') || (LA19_0 >= '\u000B' && LA19_0 <= '\f') || (LA19_0 >= '\u000E' && LA19_0 <= '?') || (LA19_0 >= 'A' && LA19_0 <= '\uFFFF'))) {
						alt19 = 1;
					}


					switch(alt19) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:24: ~ ( ( '\\n' | '\\r' | '@' ) )
					{
						if((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f') || (input.LA(1) >= '\u000E' && input.LA(1) <= '?') || (input.LA(1) >= 'A' && input.LA(1) <= '\uFFFF')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}


					}
						break;

					default:
						break loop19;
					}
				} while(true);

				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:44: ( ( '\\r' )? '\\n' )?
				int alt21 = 2;
				int LA21_0 = input.LA(1);

				if((LA21_0 == '\n' || LA21_0 == '\r')) {
					alt21 = 1;
				}
				switch(alt21) {
				case 1:
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:45: ( '\\r' )? '\\n'
				{
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:45: ( '\\r' )?
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if((LA20_0 == '\r')) {
						alt20 = 1;
					}
					switch(alt20) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18821:45: '\\r'
					{
						match('\r');

					}
						break;

					}

					match('\n');

				}
					break;

				}


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_SL_COMMENT"

	// $ANTLR start "RULE_INT"
	public final void mRULE_INT() throws RecognitionException {
		try {
			int _type = RULE_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18823:10: ( ( '0' .. '9' )+ )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18823:12: ( '0' .. '9' )+
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18823:12: ( '0' .. '9' )+
				int cnt22 = 0;
				loop22: do {
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if(((LA22_0 >= '0' && LA22_0 <= '9'))) {
						alt22 = 1;
					}


					switch(alt22) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18823:13: '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if(cnt22 >= 1)
							break loop22;
						EarlyExitException eee = new EarlyExitException(22, input);
						throw eee;
					}
					cnt22++;
				} while(true);


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_INT"

	// $ANTLR start "RULE_WS"
	public final void mRULE_WS() throws RecognitionException {
		try {
			int _type = RULE_WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18825:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
				// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
				int cnt23 = 0;
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);

					if(((LA23_0 >= '\t' && LA23_0 <= '\n') || LA23_0 == '\r' || LA23_0 == ' ')) {
						alt23 = 1;
					}


					switch(alt23) {
					case 1:
					// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:
					{
						if((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(null, input);
							recover(mse);
							throw mse;
						}


					}
						break;

					default:
						if(cnt23 >= 1)
							break loop23;
						EarlyExitException eee = new EarlyExitException(23, input);
						throw eee;
					}
					cnt23++;
				} while(true);


			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_WS"

	// $ANTLR start "RULE_ANY_OTHER"
	public final void mRULE_ANY_OTHER() throws RecognitionException {
		try {
			int _type = RULE_ANY_OTHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18827:16: ( . )
			// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:18827:18: .
			{
				matchAny();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RULE_ANY_OTHER"

	public void mTokens() throws RecognitionException {
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_INTEGERVALUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_WS | RULE_ANY_OTHER )
		int alt24 = 106;
		alt24 = dfa24.predict(input);
		switch(alt24) {
		case 1:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:10: T__12
		{
			mT__12();

		}
			break;
		case 2:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:16: T__13
		{
			mT__13();

		}
			break;
		case 3:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:22: T__14
		{
			mT__14();

		}
			break;
		case 4:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:28: T__15
		{
			mT__15();

		}
			break;
		case 5:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:34: T__16
		{
			mT__16();

		}
			break;
		case 6:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:40: T__17
		{
			mT__17();

		}
			break;
		case 7:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:46: T__18
		{
			mT__18();

		}
			break;
		case 8:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:52: T__19
		{
			mT__19();

		}
			break;
		case 9:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:58: T__20
		{
			mT__20();

		}
			break;
		case 10:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:64: T__21
		{
			mT__21();

		}
			break;
		case 11:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:70: T__22
		{
			mT__22();

		}
			break;
		case 12:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:76: T__23
		{
			mT__23();

		}
			break;
		case 13:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:82: T__24
		{
			mT__24();

		}
			break;
		case 14:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:88: T__25
		{
			mT__25();

		}
			break;
		case 15:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:94: T__26
		{
			mT__26();

		}
			break;
		case 16:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:100: T__27
		{
			mT__27();

		}
			break;
		case 17:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:106: T__28
		{
			mT__28();

		}
			break;
		case 18:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:112: T__29
		{
			mT__29();

		}
			break;
		case 19:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:118: T__30
		{
			mT__30();

		}
			break;
		case 20:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:124: T__31
		{
			mT__31();

		}
			break;
		case 21:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:130: T__32
		{
			mT__32();

		}
			break;
		case 22:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:136: T__33
		{
			mT__33();

		}
			break;
		case 23:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:142: T__34
		{
			mT__34();

		}
			break;
		case 24:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:148: T__35
		{
			mT__35();

		}
			break;
		case 25:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:154: T__36
		{
			mT__36();

		}
			break;
		case 26:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:160: T__37
		{
			mT__37();

		}
			break;
		case 27:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:166: T__38
		{
			mT__38();

		}
			break;
		case 28:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:172: T__39
		{
			mT__39();

		}
			break;
		case 29:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:178: T__40
		{
			mT__40();

		}
			break;
		case 30:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:184: T__41
		{
			mT__41();

		}
			break;
		case 31:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:190: T__42
		{
			mT__42();

		}
			break;
		case 32:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:196: T__43
		{
			mT__43();

		}
			break;
		case 33:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:202: T__44
		{
			mT__44();

		}
			break;
		case 34:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:208: T__45
		{
			mT__45();

		}
			break;
		case 35:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:214: T__46
		{
			mT__46();

		}
			break;
		case 36:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:220: T__47
		{
			mT__47();

		}
			break;
		case 37:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:226: T__48
		{
			mT__48();

		}
			break;
		case 38:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:232: T__49
		{
			mT__49();

		}
			break;
		case 39:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:238: T__50
		{
			mT__50();

		}
			break;
		case 40:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:244: T__51
		{
			mT__51();

		}
			break;
		case 41:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:250: T__52
		{
			mT__52();

		}
			break;
		case 42:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:256: T__53
		{
			mT__53();

		}
			break;
		case 43:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:262: T__54
		{
			mT__54();

		}
			break;
		case 44:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:268: T__55
		{
			mT__55();

		}
			break;
		case 45:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:274: T__56
		{
			mT__56();

		}
			break;
		case 46:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:280: T__57
		{
			mT__57();

		}
			break;
		case 47:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:286: T__58
		{
			mT__58();

		}
			break;
		case 48:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:292: T__59
		{
			mT__59();

		}
			break;
		case 49:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:298: T__60
		{
			mT__60();

		}
			break;
		case 50:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:304: T__61
		{
			mT__61();

		}
			break;
		case 51:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:310: T__62
		{
			mT__62();

		}
			break;
		case 52:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:316: T__63
		{
			mT__63();

		}
			break;
		case 53:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:322: T__64
		{
			mT__64();

		}
			break;
		case 54:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:328: T__65
		{
			mT__65();

		}
			break;
		case 55:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:334: T__66
		{
			mT__66();

		}
			break;
		case 56:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:340: T__67
		{
			mT__67();

		}
			break;
		case 57:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:346: T__68
		{
			mT__68();

		}
			break;
		case 58:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:352: T__69
		{
			mT__69();

		}
			break;
		case 59:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:358: T__70
		{
			mT__70();

		}
			break;
		case 60:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:364: T__71
		{
			mT__71();

		}
			break;
		case 61:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:370: T__72
		{
			mT__72();

		}
			break;
		case 62:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:376: T__73
		{
			mT__73();

		}
			break;
		case 63:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:382: T__74
		{
			mT__74();

		}
			break;
		case 64:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:388: T__75
		{
			mT__75();

		}
			break;
		case 65:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:394: T__76
		{
			mT__76();

		}
			break;
		case 66:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:400: T__77
		{
			mT__77();

		}
			break;
		case 67:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:406: T__78
		{
			mT__78();

		}
			break;
		case 68:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:412: T__79
		{
			mT__79();

		}
			break;
		case 69:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:418: T__80
		{
			mT__80();

		}
			break;
		case 70:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:424: T__81
		{
			mT__81();

		}
			break;
		case 71:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:430: T__82
		{
			mT__82();

		}
			break;
		case 72:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:436: T__83
		{
			mT__83();

		}
			break;
		case 73:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:442: T__84
		{
			mT__84();

		}
			break;
		case 74:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:448: T__85
		{
			mT__85();

		}
			break;
		case 75:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:454: T__86
		{
			mT__86();

		}
			break;
		case 76:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:460: T__87
		{
			mT__87();

		}
			break;
		case 77:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:466: T__88
		{
			mT__88();

		}
			break;
		case 78:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:472: T__89
		{
			mT__89();

		}
			break;
		case 79:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:478: T__90
		{
			mT__90();

		}
			break;
		case 80:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:484: T__91
		{
			mT__91();

		}
			break;
		case 81:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:490: T__92
		{
			mT__92();

		}
			break;
		case 82:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:496: T__93
		{
			mT__93();

		}
			break;
		case 83:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:502: T__94
		{
			mT__94();

		}
			break;
		case 84:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:508: T__95
		{
			mT__95();

		}
			break;
		case 85:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:514: T__96
		{
			mT__96();

		}
			break;
		case 86:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:520: T__97
		{
			mT__97();

		}
			break;
		case 87:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:526: T__98
		{
			mT__98();

		}
			break;
		case 88:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:532: T__99
		{
			mT__99();

		}
			break;
		case 89:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:538: T__100
		{
			mT__100();

		}
			break;
		case 90:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:545: T__101
		{
			mT__101();

		}
			break;
		case 91:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:552: T__102
		{
			mT__102();

		}
			break;
		case 92:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:559: T__103
		{
			mT__103();

		}
			break;
		case 93:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:566: T__104
		{
			mT__104();

		}
			break;
		case 94:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:573: T__105
		{
			mT__105();

		}
			break;
		case 95:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:580: T__106
		{
			mT__106();

		}
			break;
		case 96:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:587: T__107
		{
			mT__107();

		}
			break;
		case 97:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:594: T__108
		{
			mT__108();

		}
			break;
		case 98:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:601: T__109
		{
			mT__109();

		}
			break;
		case 99:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:608: RULE_INTEGERVALUE
		{
			mRULE_INTEGERVALUE();

		}
			break;
		case 100:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:626: RULE_ID
		{
			mRULE_ID();

		}
			break;
		case 101:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:634: RULE_STRING
		{
			mRULE_STRING();

		}
			break;
		case 102:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:646: RULE_ML_COMMENT
		{
			mRULE_ML_COMMENT();

		}
			break;
		case 103:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:662: RULE_SL_COMMENT
		{
			mRULE_SL_COMMENT();

		}
			break;
		case 104:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:678: RULE_INT
		{
			mRULE_INT();

		}
			break;
		case 105:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:687: RULE_WS
		{
			mRULE_WS();

		}
			break;
		case 106:
		// ../org.eclipse.papyrus.uml.textedit.stereotypeproperty.xtext.ui/src-gen/org/eclipse/papyrus/uml/textedit/stereotypeproperty/xtext/ui/contentassist/antlr/internal/InternalAppliedStereotypeProperty.g:1:695: RULE_ANY_OTHER
		{
			mRULE_ANY_OTHER();

		}
			break;

		}

	}


	protected DFA24 dfa24 = new DFA24(this);

	static final String DFA24_eotS = "\1\uffff\1\63\1\67\1\72\1\74\2\101\1\105\1\110\1\113\1\117\1\121" + "\2\uffff\12\101\1\156\1\161\1\163\1\165\4\uffff\1\173\2\uffff\1" + "\101\3\uffff\3\101\2\u0086\1\uffff\2\60\16\uffff\1\u008e\2\101\1" + "\u0092\1\uffff\1\101\1\uffff\1\u0095\2\uffff\1\u0098\6\uffff\1\u009c" + "\5\uffff\2\101\1\u009f\10\101\1\u00ab\7\101\1\u00b6\4\101\22\uffff" + "\2\101\3\uffff\3\101\1\uffff\1\u0086\1\uffff\1\u0086\2\uffff\2\101" + "\1\uffff\3\101\1\uffff\1\101\2\uffff\1\u00c8\6\uffff\2\101\1\uffff" + "\1\101\1\u00cd\11\101\1\uffff\10\101\1\u00df\1\101\1\uffff\5\101" + "\1\u00e6\1\u00e7\2\101\1\u0086\6\101\2\uffff\1\u00f0\1\u00f1\2\101" + "\1\uffff\1\u00f4\4\101\1\u00f9\12\101\1\u0104\1\uffff\5\101\1\u010a" + "\2\uffff\10\101\2\uffff\1\u0113\1\101\1\uffff\4\101\1\uffff\4\101" + "\1\u011d\5\101\1\uffff\5\101\1\uffff\1\u0128\1\u0129\1\101\1\u012b" + "\4\101\1\uffff\1\u0130\7\101\1\u0138\1\uffff\1\u0139\1\u013a\1\u013b" + "\1\u013c\1\u013d\3\101\1\u0141\1\101\2\uffff\1\101\1\uffff\1\u0144" + "\2\101\1\u0147\1\uffff\3\101\1\u014b\2\101\1\u014e\6\uffff\1\u014f" + "\1\u0150\1\101\1\uffff\2\101\1\uffff\1\u0154\1\u0155\1\uffff\2\101" + "\1\u0158\1\uffff\2\101\3\uffff\1\101\1\u015c\1\101\2\uffff\2\101" + "\1\uffff\3\101\1\uffff\1\u0163\1\u0164\1\u0165\1\101\1\u0167\1\101" + "\3\uffff\1\u0169\1\uffff\1\101\1\uffff\1\u016b\1\uffff";

	static final String DFA24_eofS = "\u016c\uffff";

	static final String DFA24_minS = "\1\0\1\53\1\55\2\75\1\146\1\141\1\74\1\75\1\57\1\52\1\75\2\uffff" + "\1\150\2\141\3\145\1\154\1\156\1\143\1\141\1\46\2\75\1\72\4\uffff" + "\1\56\2\uffff\1\145\3\uffff\1\145\1\150\1\162\2\60\1\uffff\2\0\16" + "\uffff\1\60\1\145\1\125\1\60\1\uffff\1\163\1\uffff\1\75\2\uffff" + "\1\75\5\uffff\1\0\1\100\5\uffff\1\165\1\151\1\60\1\154\1\162\1\157" + "\1\145\1\141\1\154\1\163\1\146\1\60\1\154\1\160\1\151\1\144\1\151" + "\1\163\1\145\1\60\1\163\1\154\1\143\1\162\22\uffff\1\154\1\167\3" + "\uffff\1\164\1\151\1\145\1\uffff\1\60\1\uffff\1\60\2\uffff\1\164" + "\1\151\1\uffff\1\162\1\154\1\156\1\uffff\1\164\2\uffff\1\75\6\uffff" + "\1\145\1\163\1\uffff\1\163\1\60\1\155\2\141\1\163\1\154\1\145\1" + "\164\1\145\1\141\1\uffff\2\145\1\164\1\145\2\165\1\163\1\145\1\60" + "\1\145\1\uffff\1\165\1\111\1\145\1\141\1\154\2\60\1\154\1\141\1" + "\60\1\141\1\156\2\141\1\151\1\171\2\uffff\2\60\1\145\1\154\1\uffff" + "\1\60\1\164\1\162\1\163\1\145\1\60\2\162\1\165\1\143\1\162\3\143" + "\1\162\1\164\1\60\1\uffff\2\162\1\156\1\160\1\154\1\60\2\uffff\1" + "\145\1\153\1\156\1\145\2\164\1\161\1\160\2\uffff\1\60\1\154\1\uffff" + "\1\145\1\101\1\151\1\143\1\uffff\1\157\1\155\1\154\1\164\1\60\1" + "\150\1\164\1\145\1\156\1\163\1\uffff\2\145\1\163\1\164\1\154\1\uffff" + "\2\60\1\143\1\60\2\145\1\165\1\145\1\uffff\1\60\1\114\1\163\1\146" + "\1\164\1\171\1\151\1\164\1\60\1\uffff\5\60\2\144\1\164\1\60\1\145" + "\2\uffff\1\145\1\uffff\1\60\1\144\1\145\1\60\1\uffff\1\151\1\163" + "\1\171\1\60\1\114\1\156\1\60\6\uffff\2\60\1\141\1\uffff\1\154\1" + "\157\1\uffff\2\60\1\uffff\1\156\1\157\1\60\1\uffff\1\151\1\145\3" + "\uffff\1\156\1\60\1\146\2\uffff\1\153\1\143\1\uffff\1\156\1\144" + "\1\143\1\uffff\3\60\1\153\1\60\1\145\3\uffff\1\60\1\uffff\1\163" + "\1\uffff\1\60\1\uffff";

	static final String DFA24_maxS = "\1\uffff\1\75\2\76\1\75\1\164\1\141\1\75\1\76\3\75\2\uffff\3\162" + "\1\157\1\167\1\145\1\170\1\162\1\163\1\141\1\75\1\174\1\75\1\72" + "\4\uffff\1\56\2\uffff\1\165\3\uffff\1\145\1\150\1\162\2\71\1\uffff" + "\2\uffff\16\uffff\1\172\1\145\1\157\1\172\1\uffff\1\163\1\uffff" + "\1\75\2\uffff\1\76\5\uffff\1\uffff\1\100\5\uffff\1\165\1\151\1\172" + "\1\154\1\162\1\157\2\145\1\154\1\163\1\164\1\172\1\154\1\160\1\151" + "\1\164\1\151\1\163\1\145\1\172\1\163\1\154\1\143\1\162\22\uffff" + "\1\154\1\167\3\uffff\1\164\1\151\1\145\1\uffff\1\71\1\uffff\1\71" + "\2\uffff\1\164\1\151\1\uffff\1\162\1\154\1\156\1\uffff\1\164\2\uffff" + "\1\75\6\uffff\1\145\1\163\1\uffff\1\163\1\172\1\155\2\141\1\163" + "\1\154\1\145\1\164\1\145\1\141\1\uffff\2\145\1\164\1\145\2\165\1" + "\163\1\145\1\172\1\145\1\uffff\1\165\1\111\1\145\1\141\1\154\2\172" + "\1\154\1\141\1\71\1\141\1\156\2\141\1\151\1\171\2\uffff\2\172\1" + "\145\1\154\1\uffff\1\172\1\164\1\162\1\163\1\145\1\172\2\162\1\165" + "\1\143\1\162\3\143\1\162\1\164\1\172\1\uffff\2\162\1\156\1\160\1" + "\154\1\172\2\uffff\1\145\1\153\1\156\1\145\2\164\1\161\1\160\2\uffff" + "\1\172\1\154\1\uffff\1\145\1\101\1\151\1\143\1\uffff\1\157\1\155" + "\1\154\1\164\1\172\1\150\1\164\1\145\1\156\1\163\1\uffff\2\145\1" + "\163\1\164\1\154\1\uffff\2\172\1\143\1\172\2\145\1\165\1\145\1\uffff" + "\1\172\1\114\1\163\1\146\1\164\1\171\1\151\1\164\1\172\1\uffff\5" + "\172\2\144\1\164\1\172\1\145\2\uffff\1\145\1\uffff\1\172\1\144\1" + "\145\1\172\1\uffff\1\151\1\163\1\171\1\172\1\114\1\156\1\172\6\uffff" + "\2\172\1\141\1\uffff\1\154\1\157\1\uffff\2\172\1\uffff\1\156\1\157" + "\1\172\1\uffff\1\151\1\145\3\uffff\1\156\1\172\1\146\2\uffff\1\153" + "\1\143\1\uffff\1\156\1\144\1\143\1\uffff\3\172\1\153\1\172\1\145" + "\3\uffff\1\172\1\uffff\1\163\1\uffff\1\172\1\uffff";

	static final String DFA24_acceptS = "\14\uffff\1\24\1\25\16\uffff\1\63\1\65\1\66\1\67\1\uffff\1\77\1" + "\100\1\uffff\1\110\1\111\1\120\5\uffff\1\144\2\uffff\1\151\1\152" + "\1\1\1\47\1\16\1\2\1\50\1\101\1\17\1\3\1\64\1\46\1\4\1\23\4\uffff" + "\1\144\1\uffff\1\11\1\uffff\1\7\1\12\1\uffff\1\10\1\51\1\116\1\20" + "\1\53\2\uffff\1\21\1\52\1\22\1\24\1\25\30\uffff\1\54\1\72\1\75\1" + "\55\1\71\1\73\1\56\1\74\1\62\1\70\1\63\1\65\1\66\1\67\1\112\1\76" + "\1\77\1\100\2\uffff\1\110\1\111\1\120\3\uffff\1\143\1\uffff\1\150" + "\1\uffff\1\145\1\151\2\uffff\1\133\3\uffff\1\122\1\uffff\1\57\1" + "\13\1\uffff\1\60\1\14\1\114\1\146\1\117\1\147\2\uffff\1\141\13\uffff" + "\1\131\12\uffff\1\124\20\uffff\1\61\1\15\4\uffff\1\132\21\uffff" + "\1\41\6\uffff\1\107\1\121\10\uffff\1\26\1\105\2\uffff\1\140\4\uffff" + "\1\126\12\uffff\1\123\5\uffff\1\104\10\uffff\1\27\11\uffff\1\106" + "\12\uffff\1\130\1\134\1\uffff\1\115\4\uffff\1\37\7\uffff\1\33\1" + "\125\1\34\1\102\1\135\1\40\3\uffff\1\136\2\uffff\1\36\2\uffff\1" + "\6\3\uffff\1\35\2\uffff\1\127\1\142\1\44\3\uffff\1\42\1\103\2\uffff" + "\1\137\3\uffff\1\45\6\uffff\1\5\1\30\1\32\1\uffff\1\43\1\uffff\1" + "\31\1\uffff\1\113";

	static final String DFA24_specialS = "\1\2\54\uffff\1\1\1\3\36\uffff\1\0\u011e\uffff}>";

	static final String[] DFA24_transitionS = { "\11\60\2\57\2\60\1\57\22\60\1\57\1\4\1\56\1\60\1\14\1\13\1" + "\30\1\55\1\35\1\36\1\11\1\1\1\34\1\2\1\40\1\12\1\52\11\53\1" + "\33\1\46\1\7\1\3\1\10\1\37\1\60\32\54\1\41\1\60\1\42\1\32\1" + "\54\1\60\1\26\1\51\1\20\1\21\1\24\1\17\1\54\1\6\1\5\2\54\1\47" + "\1\54\1\43\1\25\1\27\1\54\1\23\1\22\1\16\2\54\1\50\3\54\1\44" + "\1\31\1\45\1\15\uff81\60", "\1\61\21\uffff\1\62", "\1\64\17\uffff\1\65\1\66", "\1\70\1\71", "\1\73", "\1\100\7\uffff\1\75\4\uffff\1\77\1\76", "\1\102", "\1\104\1\103", "\1\106\1\107", "\1\112\15\uffff\1\111", "\1\115\4\uffff\1\116\15\uffff\1\114", "\1\120", "", "", "\1\125\6\uffff\1\126\2\uffff\1\124", "\1\127\15\uffff\1\130\2\uffff\1\131", "\1\135\12\uffff\1\133\2\uffff\1\134\2\uffff\1\132", "\1\136\11\uffff\1\137", "\1\140\17\uffff\1\141\1\uffff\1\142", "\1\143", "\1\145\13\uffff\1\144", "\1\146\3\uffff\1\147", "\1\152\10\uffff\1\151\6\uffff\1\150", "\1\153", "\1\155\26\uffff\1\154", "\1\157\76\uffff\1\160", "\1\162", "\1\164", "", "", "", "", "\1\172", "", "", "\1\177\17\uffff\1\176", "", "", "", "\1\u0083", "\1\u0084", "\1\u0085", "\10\u0087\2\u0088", "\12\u0089", "", "\0\101", "\0\u008a", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\u008d" + "\6\101\1\u008c\7\101", "\1\u008f", "\1\u0091\31\uffff\1\u0090", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u0093", "", "\1\u0094", "", "", "\1\u0097\1\u0096", "", "", "", "", "", "\100\u009a\1\u0099\uffbf\u009a", "\1\u009b", "", "", "", "", "", "\1\u009d", "\1\u009e", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00a0", "\1\u00a1", "\1\u00a2", "\1\u00a3", "\1\u00a5\3\uffff\1\u00a4", "\1\u00a6", "\1\u00a7", "\1\u00aa\14\uffff\1\u00a8\1\u00a9", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00ac", "\1\u00ad", "\1\u00ae", "\1\u00b0\5\uffff\1\u00af\11\uffff\1\u00b1", "\1\u00b2", "\1\u00b3", "\1\u00b4", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\3\101\1\u00b5" + "\26\101", "\1\u00b7", "\1\u00b8", "\1\u00b9", "\1\u00ba", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "\1\u00bb", "\1\u00bc", "", "", "", "\1\u00bd", "\1\u00be", "\1\u00bf", "", "\10\u00c0\2\u0088", "", "\12\u0089", "", "", "\1\u00c1", "\1\u00c2", "", "\1\u00c3", "\1\u00c4", "\1\u00c5", "", "\1\u00c6", "", "", "\1\u00c7", "", "", "", "", "", "", "\1\u00c9", "\1\u00ca", "", "\1\u00cb", "\12\101\7\uffff\1\u00cc\31\101\4\uffff\1\101\1\uffff\32\101", "\1\u00ce", "\1\u00cf", "\1\u00d0", "\1\u00d1", "\1\u00d2", "\1\u00d3", "\1\u00d4", "\1\u00d5", "\1\u00d6", "", "\1\u00d7", "\1\u00d8", "\1\u00d9", "\1\u00da", "\1\u00db", "\1\u00dc", "\1\u00dd", "\1\u00de", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00e0", "", "\1\u00e1", "\1\u00e2", "\1\u00e3", "\1\u00e4", "\1\u00e5", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00e8", "\1\u00e9", "\10\u00c0\2\u0088", "\1\u00ea", "\1\u00eb", "\1\u00ec", "\1\u00ed", "\1\u00ee", "\1\u00ef", "", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00f2", "\1\u00f3", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00f5", "\1\u00f6", "\1\u00f7", "\1\u00f8", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u00fa", "\1\u00fb", "\1\u00fc", "\1\u00fd", "\1\u00fe", "\1\u00ff", "\1\u0100", "\1\u0101", "\1\u0102", "\1\u0103", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u0105", "\1\u0106", "\1\u0107", "\1\u0108", "\1\u0109", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "", "\1\u010b", "\1\u010c", "\1\u010d", "\1\u010e", "\1\u010f", "\1\u0110", "\1\u0111", "\1\u0112", "", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0114", "", "\1\u0115", "\1\u0116", "\1\u0117", "\1\u0118", "", "\1\u0119", "\1\u011a", "\1\u011b", "\1\u011c", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u011e", "\1\u011f", "\1\u0120", "\1\u0121", "\1\u0122", "", "\1\u0123", "\1\u0124", "\1\u0125", "\1\u0126", "\1\u0127", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u012a", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u012c", "\1\u012d", "\1\u012e", "\1\u012f", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0131", "\1\u0132", "\1\u0133", "\1\u0134", "\1\u0135", "\1\u0136", "\1\u0137", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u013e", "\1\u013f", "\1\u0140", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0142", "", "", "\1\u0143", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0145", "\1\u0146", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u0148", "\1\u0149", "\1\u014a", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u014c", "\1\u014d", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "", "", "", "", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0151", "", "\1\u0152", "\1\u0153", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u0156", "\1\u0157", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u0159", "\1\u015a", "", "", "", "\1\u015b", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u015d", "", "", "\1\u015e", "\1\u015f", "", "\1\u0160", "\1\u0161", "\1\u0162", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0166", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "\1\u0168", "", "", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "", "\1\u016a", "", "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101", "" };

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);

	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);

	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);

	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);

	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);

	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);

	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for(int i = 0; i < numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}

		public String getDescription() {
			return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | RULE_INTEGERVALUE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_WS | RULE_ANY_OTHER );";
		}

		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch(s) {
			case 0:
				int LA24_77 = input.LA(1);

				s = -1;
				if((LA24_77 == '@')) {
					s = 153;
				}

				else if(((LA24_77 >= '\u0000' && LA24_77 <= '?') || (LA24_77 >= 'A' && LA24_77 <= '\uFFFF'))) {
					s = 154;
				}

				if(s >= 0)
					return s;
				break;
			case 1:
				int LA24_45 = input.LA(1);

				s = -1;
				if(((LA24_45 >= '\u0000' && LA24_45 <= '\uFFFF'))) {
					s = 65;
				}

				else
					s = 48;

				if(s >= 0)
					return s;
				break;
			case 2:
				int LA24_0 = input.LA(1);

				s = -1;
				if((LA24_0 == '+')) {
					s = 1;
				}

				else if((LA24_0 == '-')) {
					s = 2;
				}

				else if((LA24_0 == '=')) {
					s = 3;
				}

				else if((LA24_0 == '!')) {
					s = 4;
				}

				else if((LA24_0 == 'i')) {
					s = 5;
				}

				else if((LA24_0 == 'h')) {
					s = 6;
				}

				else if((LA24_0 == '<')) {
					s = 7;
				}

				else if((LA24_0 == '>')) {
					s = 8;
				}

				else if((LA24_0 == '*')) {
					s = 9;
				}

				else if((LA24_0 == '/')) {
					s = 10;
				}

				else if((LA24_0 == '%')) {
					s = 11;
				}

				else if((LA24_0 == '$')) {
					s = 12;
				}

				else if((LA24_0 == '~')) {
					s = 13;
				}

				else if((LA24_0 == 't')) {
					s = 14;
				}

				else if((LA24_0 == 'f')) {
					s = 15;
				}

				else if((LA24_0 == 'c')) {
					s = 16;
				}

				else if((LA24_0 == 'd')) {
					s = 17;
				}

				else if((LA24_0 == 's')) {
					s = 18;
				}

				else if((LA24_0 == 'r')) {
					s = 19;
				}

				else if((LA24_0 == 'e')) {
					s = 20;
				}

				else if((LA24_0 == 'o')) {
					s = 21;
				}

				else if((LA24_0 == 'a')) {
					s = 22;
				}

				else if((LA24_0 == 'p')) {
					s = 23;
				}

				else if((LA24_0 == '&')) {
					s = 24;
				}

				else if((LA24_0 == '|')) {
					s = 25;
				}

				else if((LA24_0 == '^')) {
					s = 26;
				}

				else if((LA24_0 == ':')) {
					s = 27;
				}

				else if((LA24_0 == ',')) {
					s = 28;
				}

				else if((LA24_0 == '(')) {
					s = 29;
				}

				else if((LA24_0 == ')')) {
					s = 30;
				}

				else if((LA24_0 == '?')) {
					s = 31;
				}

				else if((LA24_0 == '.')) {
					s = 32;
				}

				else if((LA24_0 == '[')) {
					s = 33;
				}

				else if((LA24_0 == ']')) {
					s = 34;
				}

				else if((LA24_0 == 'n')) {
					s = 35;
				}

				else if((LA24_0 == '{')) {
					s = 36;
				}

				else if((LA24_0 == '}')) {
					s = 37;
				}

				else if((LA24_0 == ';')) {
					s = 38;
				}

				else if((LA24_0 == 'l')) {
					s = 39;
				}

				else if((LA24_0 == 'w')) {
					s = 40;
				}

				else if((LA24_0 == 'b')) {
					s = 41;
				}

				else if((LA24_0 == '0')) {
					s = 42;
				}

				else if(((LA24_0 >= '1' && LA24_0 <= '9'))) {
					s = 43;
				}

				else if(((LA24_0 >= 'A' && LA24_0 <= 'Z') || LA24_0 == '_' || LA24_0 == 'g' || (LA24_0 >= 'j' && LA24_0 <= 'k') || LA24_0 == 'm' || LA24_0 == 'q' || (LA24_0 >= 'u' && LA24_0 <= 'v') || (LA24_0 >= 'x' && LA24_0 <= 'z'))) {
					s = 44;
				}

				else if((LA24_0 == '\'')) {
					s = 45;
				}

				else if((LA24_0 == '\"')) {
					s = 46;
				}

				else if(((LA24_0 >= '\t' && LA24_0 <= '\n') || LA24_0 == '\r' || LA24_0 == ' ')) {
					s = 47;
				}

				else if(((LA24_0 >= '\u0000' && LA24_0 <= '\b') || (LA24_0 >= '\u000B' && LA24_0 <= '\f') || (LA24_0 >= '\u000E' && LA24_0 <= '\u001F') || LA24_0 == '#' || LA24_0 == '@' || LA24_0 == '\\' || LA24_0 == '`' || (LA24_0 >= '\u007F' && LA24_0 <= '\uFFFF'))) {
					s = 48;
				}

				if(s >= 0)
					return s;
				break;
			case 3:
				int LA24_46 = input.LA(1);

				s = -1;
				if(((LA24_46 >= '\u0000' && LA24_46 <= '\uFFFF'))) {
					s = 138;
				}

				else
					s = 48;

				if(s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(getDescription(), 24, _s, input);
			error(nvae);
			throw nvae;
		}
	}


}
