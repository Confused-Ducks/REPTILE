package antlr;// Generated from C:/Users/charl/OneDrive/Documents/GitHub/p4/src\Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(GrammarParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(GrammarParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(GrammarParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cmdStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStmt(GrammarParser.CmdStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#iterativeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeStmt(GrammarParser.IterativeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#controlStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStmt(GrammarParser.ControlStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#playerDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerDcl(GrammarParser.PlayerDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(GrammarParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#levelDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelDcl(GrammarParser.LevelDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#levels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevels(GrammarParser.LevelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(GrammarParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#placement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlacement(GrammarParser.PlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#place}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(GrammarParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#entityDcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDcl(GrammarParser.EntityDclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#entities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntities(GrammarParser.EntitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#enemy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemy(GrammarParser.EnemyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(GrammarParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(GrammarParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBterm(GrammarParser.BtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#baexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaexpr(GrammarParser.BaexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#baterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaterm(GrammarParser.BatermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#bfactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBfactor(GrammarParser.BfactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondexpr(GrammarParser.CondexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(GrammarParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#logoprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogoprt(GrammarParser.LogoprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#reloprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReloprt(GrammarParser.ReloprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#asoprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsoprt(GrammarParser.AsoprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#mmdoprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmdoprt(GrammarParser.MmdoprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rspnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRspnd(GrammarParser.RspndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(GrammarParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#gameLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameLoop(GrammarParser.GameLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(GrammarParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tileXY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTileXY(GrammarParser.TileXYContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#levelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelName(GrammarParser.LevelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#gate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate(GrammarParser.GateContext ctx);
}