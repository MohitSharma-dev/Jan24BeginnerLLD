package LLDCaseStudy.TicTacToe;

import LLDCaseStudy.TicTacToe.controller.GameController;
import LLDCaseStudy.TicTacToe.models.*;
import LLDCaseStudy.TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    // we will use this for Game Interaction
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new Human("Mohit" , new Symbol('X') , PlayerType.HUMAN , 1));
        players.add(new Bot("Botty", new Symbol('O'), PlayerType.BOT , BotDifficultyLevel.EASY));
        Game game = gameController.startGame(
                3,
                players,
                List.of(new RowWinningStrategy())
        );

//        gameController.displayBoard(game);
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
            System.out.println("Do you want to Undo ? [Y/N]");
            String userInput = scanner.nextLine();
            if(userInput.equals("Y")){
                gameController.undo(game);
            }
        }

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("We have a winner : " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in DRAW!");
        }
    }
}

// Homework :
    // Try to complete the code
    // Creating constructors
    // Completing the functionalities