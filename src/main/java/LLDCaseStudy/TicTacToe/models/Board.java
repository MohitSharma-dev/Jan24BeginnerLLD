package LLDCaseStudy.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size){
        this.size = size;
        this.board = new ArrayList<>();
        // populate the board with empty cells
        for(int i = 0; i < size; i++){
            board.add(new ArrayList<>());
            for(int j = 0; j < size; j++){
                board.get(i).add(new Cell(i , j));
            }
        }
    }

    public void display(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                board.get(i).get(j).display();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
