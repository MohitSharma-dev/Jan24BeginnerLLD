package LLDCaseStudy.TicTacToe.models;

public abstract class Player {
    private String name;
    private PlayerType type;
    private Symbol symbol;
    private Game game;

    public Player(String name, Symbol symbol, PlayerType type) {
        this.name = name;
        this.symbol = symbol;
        this.type = type;
        this.game = null;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }

    public abstract Move makeMove();
}
