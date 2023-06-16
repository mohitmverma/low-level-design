package Chess;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }
}


 class Chess {

    ChessBoard chessBoard;
    Player[] player;
    Player currentPlayer;
    List<Move> movesList;
    GameStatus gameStatus;
    boolean playerMove(CellPosition fromPosition, CellPosition toPosition, Piece piece);
    boolean endGame();
    private void changeTurn();

}

 class Player {

    Account account;
    Color color;
    Time timeLeft;

}

 class Time {

    int mins;
    int secs;

}

 enum Color {

    BLACK, WHITE;

}

 class Account {

    String username;
    String password;

    String name;
    String email;
    String phone;
}

 enum GameStatus {

    ACTIVE, PAUSED, FORTFEIGHT, BLACK_WIN, WHITE_WIN;
}

 class ChessBoard {

    List<List<Cell>>> board;

     void resetBoard();
     void updateBoard(Move move);
}

 class Cell {

    Color color;
    Piece piece;
    CellPosition position;
}

 class CellPosition {

    Character ch;
    int i;
}

 class Move {

    Player turn;
    Piece piece;
    Piece killedPiece;
    CellPosition startPosition;
    CellPosition endPosition;

}

 abstract class Piece {

    Color color;

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition);
     boolean validate(CellPosition fromPosition, CellPosition toPosition);
}

 class Knight extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition);
     boolean validate(CellPosition fromPosition, CellPosition toPosition);

}

class Bishop extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition);
     boolean validate(CellPosition fromPosition, CellPosition toPosition);

}

 class rook extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition);
     boolean validate(CellPosition fromPosition, CellPosition toPosition);

}

 class King extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition);
     boolean validate(CellPosition fromPosition, CellPosition toPosition);

}

 class Queen extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition);
     List<CellPosition> possibleMoves(CellPosition fromPosition){};
     boolean validate(CellPosition fromPosition, CellPosition toPosition){};

}

class Pawn extends Piece {

     boolean move(CellPosition fromPosition, CellPosition toPosition){};
     List<CellPosition> possibleMoves(CellPosition fromPosition){};
     boolean validate(CellPosition fromPosition, CellPosition toPosition){};

}