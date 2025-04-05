package LLDCaseStudy.TicTacToe.strategies;

import LLDCaseStudy.TicTacToe.models.*;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        // find first cell which is empty and just play there
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if(board.getBoard().get(i).get(j).getCellState() == CellState.EMPTY){
                    return new Move(new Cell(i, j), player);
                }
            }
        }
        return null;
    }
}
