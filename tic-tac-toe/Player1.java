public class Player1 implements Player{
    private Pieces piece;
    private Board board;
    public Player1(Board board){
        piece=Pieces.X;
        this.board=board;
    }
    public void placePiece(int x,int y){
        Cell cell=board.getCell(x,y);
        cell.setValue(piece);
    }
}
