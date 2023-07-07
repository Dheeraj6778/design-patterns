import java.util.ArrayList;
import java.util.HashSet;

public class Board {
    private ArrayList<ArrayList<Cell>> board;
    public Board(){
        board=new ArrayList<>();
        for(int i=0;i<3;i++)
            board.add(new ArrayList<>());
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++)
                board.get(i).add(new Cell());
        }
    }
    public Cell getCell(int x,int y){
        return board.get(x).get(y);
    }
    public void displayBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(getCell(i,j).toString());
            System.out.println("");
        }
    }
    public boolean isValidPosition(int x,int y){
        if(x>=0 && x<3 && y>=0 && y<3 && board.get(x).get(y).getPiece()==Pieces.$)
            return true;
        return false;
    }
    private boolean check(int r, int c){
        //check for the row
        HashSet <Pieces> set=new HashSet<>();
        for(int i=0;i<3;i++)
            set.add(board.get(r).get(i).getPiece());
        if(set.size()==1 && set.contains(Pieces.$)==false)
            return true;
        HashSet<Pieces> set1=new HashSet<>();
        //check for the col
        for(int i=0;i<3;i++){
            set1.add(board.get(i).get(c).getPiece());
        }
        if(set1.size()==1 && set1.contains(Pieces.$)==false)
            return true;
        //now check for diagonals
        HashSet<Pieces> set2=new HashSet<>();
        for(int i=0;i<3;i++)
            set2.add(board.get(i).get(i).getPiece());
        if(set2.size()==1 && set2.contains(Pieces.$)==false)
            return true;
        //now check for the other diagonal
        HashSet<Pieces> set3=new HashSet<>();
        for(int i=0;i<3;i++)
            set3.add(board.get(i).get(3-i-1).getPiece());
        if(set3.size()==1 && set3.contains(Pieces.$)==false)
            return true;
        return false;
    }
    public boolean isGameComplete(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(check(i,j))
                    return true;
            }
        }
        return false;
    }

}
