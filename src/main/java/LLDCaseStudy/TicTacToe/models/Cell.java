package LLDCaseStudy.TicTacToe.models;

public class Cell {
    private int row;
    private int col;
    private Player player;
    private Symbol symbol;
    private CellState cellState;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.symbol = null;
        this.cellState = CellState.EMPTY;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void display(){
        if(cellState == CellState.EMPTY){
            System.out.print("| - |");
        }
        else if (cellState == CellState.FILLED){
            System.out.print("| " + symbol.getSym() + " |");
        }
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
