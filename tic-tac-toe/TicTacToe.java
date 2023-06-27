import Model.Board;
import Model.Player;
import Model.PlayingPieceO;
import Model.PlayingPieceX;

import java.util.*;
public class TicTacToe {
    ArrayList<Player> players;
    Board gameBoard;
    public int flag;
    public void initializeGame(){
        this.players=new ArrayList<Player>();
        PlayingPieceX playingPieceX=new PlayingPieceX();
        PlayingPieceO playingPieceO=new PlayingPieceO();
        Player player1=new Player();
        player1.playingPiece=playingPieceX;
        Player player2=new Player();
        player2.playingPiece=playingPieceO;
        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);
        this.flag=1;
    }
    public String startGame(){
        boolean gameOver=false;
        while (gameOver){
            Player playerToPlay= players.get(flag-1);
        }
        return "";
    }

}
