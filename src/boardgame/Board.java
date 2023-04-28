package boardgame;
/*
 * Classe tabuleiro
 */
public class Board {
	//Linhas
	private int rows;
	//Colunas
	private int columns;
	//Matriz de peças
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Método do tipo Piece
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//Sobrecarga do método Piece
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	

}
