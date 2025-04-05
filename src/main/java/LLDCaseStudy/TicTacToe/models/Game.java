package LLDCaseStudy.TicTacToe.models;

import LLDCaseStudy.TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private GameState gameState;

    public Game(int size,List<Player> players, List<WinningStrategy> winningStrategies) {
        // using size, please create the board
        board = new Board(size);
        setPlayers(players);
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void displayBoard(){
        board.display();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
        for (Player player : players) {
            player.setGame(this);
        }
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            return false;
        }

        return board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public void updateGameStateAfterMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(move.getPlayer().getSymbol());

        move.setCell(cellToChange);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

    }

    public boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(move,board)){
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw(){
        return moves.size() == board.getSize() * board.getSize();
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s turn. Please be ready with your move!");

        Move move = currentPlayer.makeMove();
        if(!validateMove(move)){
            System.out.println("Invalid Move! Please try again!");
            return;
        }

        updateGameStateAfterMove(move);

        // check if there is a winnner after the move
        if(checkWinner(move)){
            winner = move.getPlayer();
            gameState = GameState.SUCCESS;
        } else if (checkDraw()){
            gameState = GameState.DRAW;
        }
    }

    public void undo(){
        if(moves.size() == 0){
            System.out.println("There are no moves to undo!");
            return;
        }

        Move lastMove = moves.get(moves.size()-1);
        moves.remove(moves.size()-1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex--;
        // (a -  b)  % n = (a - b + n)%n
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(lastMove,board);
        }

        setGameState(GameState.IN_PROGRESS);
        setWinner(null);
    }
}

// Take 10 mins : And complete all of the models with proper attributes