package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		//imprimir pe�as da partida, fun��o
		
		UI.printBoard(chessMatch.getPieces());

	}

}
