package TicTacToe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());
    }
}
