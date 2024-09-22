package l17;
// TODO
public class ChessBoard {
    private ChessPiece[][] map = new ChessPiece[8][8];
    public void ChessPiece(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                map[8][8] = ChessPiece.EMPTY;
            }
        }
    }
}
