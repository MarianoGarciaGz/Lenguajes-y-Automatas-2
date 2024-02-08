// $ANTLR 3.5.2 .\\main.g 2024-02-07 11:26:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mainParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS"
	};
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public mainParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public mainParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return mainParser.tokenNames; }
	@Override public String getGrammarFileName() { return ".\\main.g"; }



	// $ANTLR start "init"
	// .\\main.g:12:1: init : ( id )* ;
	public final void init() throws RecognitionException {
		try {
			// .\\main.g:12:5: ( ( id )* )
			// .\\main.g:12:7: ( id )*
			{
			// .\\main.g:12:7: ( id )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// .\\main.g:12:7: id
					{
					pushFollow(FOLLOW_id_in_init27);
					id();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "init"



	// $ANTLR start "id"
	// .\\main.g:13:1: id : ID ;
	public final void id() throws RecognitionException {
		try {
			// .\\main.g:13:4: ( ID )
			// .\\main.g:13:6: ID
			{
			match(input,ID,FOLLOW_ID_in_id35); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "id"

	// Delegated rules



	public static final BitSet FOLLOW_id_in_init27 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ID_in_id35 = new BitSet(new long[]{0x0000000000000002L});
}
