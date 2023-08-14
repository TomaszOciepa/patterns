package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChessPiece whiteKing = new WhiteKing("White King");
        ChessPiece whitePawn = new WhitePiece("White Pawn");
        ChessPiece blackQueen = new BlackQueen("Black Queen");
        ChessPiece blackPawn = new BlackPiece("Black Pawn");


        System.out.println(whiteKing.getColor()==whitePawn.getColor());
        System.out.println(blackQueen.getColor()==blackPawn.getColor());
        System.out.println(blackPawn.getColor().toString());
    }
}
