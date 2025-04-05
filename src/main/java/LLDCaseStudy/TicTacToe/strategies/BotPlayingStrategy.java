package LLDCaseStudy.TicTacToe.strategies;

import LLDCaseStudy.TicTacToe.models.Board;
import LLDCaseStudy.TicTacToe.models.Move;
import LLDCaseStudy.TicTacToe.models.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
