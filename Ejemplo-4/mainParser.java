// $ANTLR 3.5.2 .\\main.g 2024-02-08 11:52:06
 // imports que se queiran incluir 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mainParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS"
	};
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int INT=5;
	public static final int WS=6;

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

	 // datos miembro que se quieran incluir en el parser



	// $ANTLR start "init"
	// .\\main.g:8:1: init : ( id | entero )* ;
	public final void init() throws RecognitionException {
		try {
			// .\\main.g:8:6: ( ( id | entero )* )
			// .\\main.g:8:8: ( id | entero )*
			{
			// .\\main.g:8:8: ( id | entero )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}
				else if ( (LA1_0==INT) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// .\\main.g:8:9: id
					{
					pushFollow(FOLLOW_id_in_init21);
					id();
					state._fsp--;

					}
					break;
				case 2 :
					// .\\main.g:8:12: entero
					{
					pushFollow(FOLLOW_entero_in_init23);
					entero();
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
	// .\\main.g:9:1: id : ID ;
	public final void id() throws RecognitionException {
		Token ID1=null;

		try {
			// .\\main.g:9:5: ( ID )
			// .\\main.g:9:7: ID
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_id33); 
			System.out.println("Reconocido Identificador "+(ID1!=null?ID1.getText():null));
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



	// $ANTLR start "entero"
	// .\\main.g:10:1: entero : INT ;
	public final void entero() throws RecognitionException {
		Token INT2=null;

		try {
			// .\\main.g:10:8: ( INT )
			// .\\main.g:10:10: INT
			{
			INT2=(Token)match(input,INT,FOLLOW_INT_in_entero43); 
			System.out.println("Reconocido Entero "+(INT2!=null?INT2.getText():null));
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
	// $ANTLR end "entero"

	// Delegated rules



	public static final BitSet FOLLOW_id_in_init21 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_entero_in_init23 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_ID_in_id33 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_entero43 = new BitSet(new long[]{0x0000000000000002L});
}
