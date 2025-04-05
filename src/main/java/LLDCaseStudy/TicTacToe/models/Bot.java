package LLDCaseStudy.TicTacToe.models;

import LLDCaseStudy.TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Symbol symbol, PlayerType type, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, type);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove() {
        return BotPlayingStrategyFactory
                .getBotPlayingStrategy(botDifficultyLevel)
                .makeMove(getGame().getBoard() , this);
    }
}
