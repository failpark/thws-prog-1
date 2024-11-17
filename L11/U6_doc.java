public class U6_doc {
	public char[][] document;

	public int count_chars() {
		int counter = 0;
		for (int i = 0; i < document.length; i++) {
			for (int j = 0; j < document[i].length; j++) {
				if (document[i][j] != ' ') {
					counter++;
				}
			}
		}
		return counter;
	}

	public char[][] get_doc() {
		return this.document;
	}

	public boolean switch_rows(int row_1, int row_2) {
		if (!is_in_bounds(row_1) || !is_in_bounds(row_2)) {
			return false;
		}
		char[] tmp = document[row_1];
		document[row_1] = document[row_2];
		document[row_2] = tmp;
		return true;
	}

	private boolean is_in_bounds(int row) {
		return 0 <= row && row < document.length;
	}

	public void insert_doc(char[][] doc, int start_row) {
		if (!is_in_bounds(start_row)) {
			throw new RuntimeException("Invalid row position");
		}
		// we just assume that they want us to extend the document
		char[][] new_doc = new char[doc.length + this.document.length][];
		for (int i = 0; i < new_doc.length; i++) {
			if (i < start_row) {
				new_doc[i] = this.document[i];
			} else if (start_row <= i && i < (doc.length + start_row)) {
				new_doc[i] = doc[i - start_row];
			} else {
				new_doc[i] = this.document[i - doc.length - start_row];
			}
		}
		this.document = new_doc;
	}
}
