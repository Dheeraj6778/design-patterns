public class Player2 implements Player{
    private Pieces piece;
    private Board board;
    public Player2(Board board){
        piece=Pieces.O;
        this.board=board;
    }
    public void placePiece(int x,int y){
        Cell cell=board.getCell(x,y);
        cell.setValue(piece);
    }
}
