package LLDCaseStudy.TicTacToe.strategies;

import LLDCaseStudy.TicTacToe.models.Board;
import LLDCaseStudy.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Move move, Board board);
}
