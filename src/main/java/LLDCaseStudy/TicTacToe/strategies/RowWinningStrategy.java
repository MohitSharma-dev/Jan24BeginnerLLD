package LLDCaseStudy.TicTacToe.strategies;

import LLDCaseStudy.TicTacToe.models.Board;
import LLDCaseStudy.TicTacToe.models.Cell;
import LLDCaseStudy.TicTacToe.models.Move;
import LLDCaseStudy.TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private HashMap<Integer , HashMap<Symbol , Integer>> rowCounts;
    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();
        // check if information about the row is present or not
        if(!rowCounts.containsKey(row)){
            rowCounts.put(row, new HashMap<>());
        }
        HashMap<Symbol , Integer> counts = rowCounts.get(row);

        // check if freq of symbol is present or not
        if(!counts.containsKey(cell.getSymbol())){
            counts.put(cell.getSymbol(), 0);
        }
        // increase the frequency
        counts.put(cell.getSymbol(), counts.get(cell.getSymbol()) + 1);

        if(counts.get(cell.getSymbol()) == board.getSize()){
            return true;
        }
        return false;
    }
}
// please try it out : O(1)
// Integer , Symbol : Freq