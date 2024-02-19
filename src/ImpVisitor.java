// Generated from Imp.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ImpParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ImpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ImpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ImpParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ImpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(ImpParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ImpParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ImpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(ImpParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(ImpParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ImpParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ImpParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(ImpParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(ImpParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(ImpParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmaller(ImpParser.SmallerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(ImpParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequality(ImpParser.InequalityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ImpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ImpParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ImpParser.OrContext ctx);
}