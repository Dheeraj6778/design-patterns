public class Cell {
    private Pieces piece;
    Cell(){
        piece=Pieces.$;
    }
    public void setValue(Pieces piece) {
        this.piece = piece;
    }
    public Pieces getPiece(){
        return piece;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(piece);
        sb.append(" ");
        return sb.toString();
    }
}
