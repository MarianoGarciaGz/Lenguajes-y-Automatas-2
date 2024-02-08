// Generated from c:/Users/maria/Development/Java/Lenguajes-y-Automatas-2/Ejemplo-3/main.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(mainParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(mainParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(mainParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(mainParser.IdContext ctx);
}