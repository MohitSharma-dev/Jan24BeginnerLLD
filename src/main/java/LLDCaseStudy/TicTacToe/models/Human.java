package LLDCaseStudy.TicTacToe.models;

import java.util.Scanner;

public class Human extends Player {
    private int level;
    private Scanner scanner = new Scanner(System.in);

    public Human(String name, Symbol symbol, PlayerType type, int level) {
        super(name, symbol, type);
        this.level = level;
    }

    @Override
    public Move makeMove() {
        System.out.println("Please enter the row in which you would like to make a move");
        int row = scanner.nextInt();
        System.out.println("Please enter the column in which you would like to make a move");
        int column = scanner.nextInt();

        return new Move(new Cell(row , column) , this);
    }
}
