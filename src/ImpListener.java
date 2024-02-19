// Generated from Imp.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImpParser}.
 */
public interface ImpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ImpParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ImpParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ImpParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Skip}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ImpParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ImpParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ImpParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ImpParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ImpParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterIf(ImpParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link ImpParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitIf(ImpParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(ImpParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(ImpParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAddition(ImpParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAddition(ImpParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ImpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ImpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(ImpParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(ImpParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(ImpParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(ImpParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterDivision(ImpParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitDivision(ImpParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ImpParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link ImpParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ImpParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(ImpParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(ImpParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(ImpParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(ImpParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterEquals(ImpParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitEquals(ImpParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(ImpParser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(ImpParser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterGreater(ImpParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitGreater(ImpParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterInequality(ImpParser.InequalityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inequality}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitInequality(ImpParser.InequalityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterNot(ImpParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitNot(ImpParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ImpParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ImpParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterOr(ImpParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ImpParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitOr(ImpParser.OrContext ctx);
}