package l17;

public enum ChessPiece {
    EMPTY("_",-1),KING_WHITE("♔",100), KING_BLACK("♚",100), QUEEN_WHITE("♕",9), QUEEN_BLACK("♛",9), ELEPHANT_WHITE("♗",3.5), ELEPHANT_BLACK("♝",3.5), LADYA_WHITE("♖",5), LADYA_BLACK("♜",5), KON_WHITE("♘",3), KON_BLACK("♞",3), PESHKA_WHITE("♙",1), PESHKA_BLACK("♟",1);
    private String figure;
    private double cennost;
    private ChessPiece(String figure, double cennost){
        this.figure = figure;
        this.cennost = cennost;
    }

    @Override
    public String toString() {
        return figure;
    }
}
