// $ANTLR 3.5.2 .\\main.g 2024-02-08 11:28:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mainLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int WS=5;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mainLexer() {} 
	public mainLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mainLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return ".\\main.g"; }

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\main.g:15:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )* )
			// .\\main.g:15:11: ( 'a' .. 'z' | 'A' .. 'Z' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )*
			{
			if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// .\\main.g:15:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='-'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\main.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// .\\main.g:16:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// .\\main.g:16:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// .\\main.g:16:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// .\\main.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// .\\main.g:1:8: ( ID | WS )
		int alt3=2;
		int LA3_0 = input.LA(1);
		if ( (LA3_0=='-'||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
			alt3=1;
		}
		else if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
			alt3=2;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}

		switch (alt3) {
			case 1 :
				// .\\main.g:1:10: ID
				{
				mID(); 

				}
				break;
			case 2 :
				// .\\main.g:1:13: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
