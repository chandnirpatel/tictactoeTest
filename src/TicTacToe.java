
public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;

    public TicTacToe(Board board, Player player1, Player player2) {

        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        board.display();
        turn(player1);
        turn(player2);
    }

    private void turn(Player player) {
        int move = player.getMove("Please enter a number between 1 and 9:");
        board.updateBoardValue(move, player.getSymbol());
        board.display();
    }

}
