public class U2_tictactoe {
	public static void main() {
		boolean[][][] matrix = gen_3d_board();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(to_string(matrix[i]));
		}
	}

	private static boolean[][][] gen_3d_board() {
		boolean[][][] board = new boolean[3][][];
		for (int i = 0; i < board.length; i++) {
			board[i] = gen_board();
		}
		return board;
	}

	private static boolean[][] gen_board() {
		boolean[][] board = new boolean[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = (int)(Math.random() + 0.5) == 1;
			}
		}
		return board;
	}

	public static String to_string(boolean[][] board) {
		String out = "";
		int row_length = board[0].length;
		for (int i = 0; i < board.length; i++) {
			out += row_partition(board[i].length);
			out += "\n";
			out += build_row(board[i]);
			out += "\n";
		}
		out += row_partition(row_length);
		out += "\n";
		return out;
	}

	// hate cluttering the code with that longass function call
	// I ~~could~~ statically import it at the top with
	// import static java.lang.System.out
	// and use out.println
	// but then I wouldn't be able to trash java now would I
	// P.S. this was written before I just passed Strings around
	// with only a few calls. But since I'm still salty with java this
	// function and comments will stay
	public static void println(String out) {
		System.out.println(out);
	}

	private static String row_partition(int board_length) {
		String out = "";
		for (int i = 0; i < board_length; i++) {
			// 3 dashes for the width of the field plus one for the left most border
			//      | - 
			out += "----";
		}
		// additional one for the last border
		out += "-";
		return out;
	}

	private static String build_row(boolean[] row) {
		String out = "";
		for (int i = 0; i < row.length; i++) {
			out += "| " + get_symbol(row[i]) + " ";
		}
		// last border is right
		out += "|";
		return out;
	}

	private static String get_symbol(boolean val) {
		return val ? "x" : "o";
	}
}
