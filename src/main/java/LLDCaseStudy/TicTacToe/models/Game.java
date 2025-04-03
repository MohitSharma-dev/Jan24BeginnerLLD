package LLDCaseStudy.TicTacToe.models;

import LLDCaseStudy.TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private GameState gameState;
}

// Take 10 mins : And complete all of the models with proper attributes