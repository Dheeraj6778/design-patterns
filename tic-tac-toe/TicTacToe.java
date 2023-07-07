import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private Player1 player1;
    private Player2 player2;
    public TicTacToe(){
        board=new Board();
        player1=new Player1(board);
        player2=new Player2(board);
    }
    public void playGame(){

        int flag=1;
        boolean gameComplete=false;
        board.displayBoard();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter quit to quit");;
            String command=scanner.nextLine();
            if(command.equalsIgnoreCase("quit"))
                break;
            else{
                int x,y;
                String play=(flag==1?"Player 1":"Player 2");
                System.out.println("Enter the position "+play);
                while (true){
                    String pos=scanner.nextLine();
                    String[] arr=pos.split(",");
//                x= scanner.nextInt();
//                y= scanner.nextInt();
                    x=Integer.parseInt(arr[0]);
                    y=Integer.parseInt(arr[1]);
                    if(board.isValidPosition(x,y))
                        break;
                    System.out.println("Enter a valid position");
                }

                //scanner.nextLine();
                if(flag==1){
                    //player 1
                    player1.placePiece(x,y);
                }
                else{
                    player2.placePiece(x,y);
                }
                board.displayBoard();
                if(board.isGameComplete()){
                    gameComplete=true;
                    break;
                }
                flag*=-1;
            }
        }
        if(gameComplete){
            if(flag==1)
                System.out.println("player 1 won the game");
            else
                System.out.println("player 2 won the game");
        }
        else
            System.out.println("It is a draw");
        scanner.close();
    }
}
