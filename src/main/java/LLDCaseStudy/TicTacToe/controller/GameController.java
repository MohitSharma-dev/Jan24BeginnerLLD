package LLDCaseStudy.TicTacToe.controller;

import LLDCaseStudy.TicTacToe.models.Game;
import LLDCaseStudy.TicTacToe.models.GameState;
import LLDCaseStudy.TicTacToe.models.Player;
import LLDCaseStudy.TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        // create the Game object : Builder
        return new Game(
                size,
                players,
                winningStrategies
        );
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }

}
// use cases :
    // 1. startGame
    // 2. makeMove
    // 3. checkState
    // 4. getWinner
    // 5. displayBoard
    // 6. Undo