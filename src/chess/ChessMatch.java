package chess;

import boardgame.Board;

/*
 * Esta classe vai ser o coração do jogo de xadrez,
 * pois é nela que irão conter as regras do jogo
 */
public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		//Importante saber que é essa classe "ChessMatch" que deve
		//saber o tamanho do tabuleiro, por isso ela que passa
		//os argumentos abaixo "Board(8, 8);"

		board = new Board(8, 8);
	}
	
	//O método à seguir vai ter que retornar uma matriz de peças de xadrez
	//correspondendentes à "essa partida"
	public ChessPiece[][] getPieces() {
		//Criando uma variável auxiliar
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

}
