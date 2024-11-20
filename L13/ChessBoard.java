public class ChessBoard {
	boolean[][] board = new boolean[8][8];

	public static void main(String[] args) {
		ChessBoard c = new ChessBoard();
		c.set_rook(3, 5);
		System.out.println(c);
	}

	public void set_rook(int x, int y) {
		boolean[][] new_board = new boolean[8][8];
		this.board = mark_y(mark_x(new_board, x), y);
	}

	private boolean[][] mark_x(boolean[][] board, int x) {
		for (int y = 0; y < board[x].length; y++) {
			board[x][y] = true;
		}
		return board;
	}

	private boolean[][] mark_y(boolean[][] board, int y) {
		for (int x = 0; x < board.length; x++) {
			board[x][y] = true;
		}
		return board;
	}

	@Override
	public String toString() {
		String out = "";
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				if (board[x][y]) {
					out += "x ";
				} else {
					out += "o ";
				}
			}
			out += "\n";
		}
		return out;
	}
}
