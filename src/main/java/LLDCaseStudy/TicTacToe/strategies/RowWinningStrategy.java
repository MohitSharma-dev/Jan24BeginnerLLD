package LLDCaseStudy.TicTacToe.strategies;

import LLDCaseStudy.TicTacToe.models.Board;
import LLDCaseStudy.TicTacToe.models.Cell;
import LLDCaseStudy.TicTacToe.models.Move;
import LLDCaseStudy.TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    private HashMap<Integer , HashMap<Character , Integer>> rowCounts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        Cell cell = move.getCell();
        int row = cell.getRow();
        // check if information about the row is present or not
        if(!rowCounts.containsKey(row)){
            rowCounts.put(row, new HashMap<>());
        }
        HashMap<Character , Integer> counts = rowCounts.get(row);

        // check if freq of symbol is present or not
        if(!counts.containsKey(cell.getSymbol())){
            counts.put(cell.getSymbol().getSym(), 0);
        }
        // increase the frequency
        counts.put(cell.getSymbol().getSym(), counts.get(cell.getSymbol().getSym()) + 1);

        if(counts.get(cell.getSymbol().getSym()) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move, Board board) {
        int row = move.getCell().getRow();
        Character ch = move.getPlayer().getSymbol().getSym();

        rowCounts.get(row).put(ch, rowCounts.get(row).get(ch) - 1);
    }
}
// please try it out : O(1)
// Integer , Symbol : Freq