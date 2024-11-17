public class U6_test {
	public static void main() {
		U6_doc doc = new U6_doc();
		char[][] test = new char[4][];
		int start = 97;
		for (int i = 0; i < test.length; i++) {
			test[i] = new char[]{
				(char)start++,
				(char)start++,
				(char)start++,
				(char)start++,
			};
		}
		// force a copy-by-value
		doc.document = test.clone();
		print(doc.document);
		doc.switch_rows(0, 2);
		print(doc.document);
		doc.document = test;
		doc.insert_doc(test, 3);
		print(doc.document);
	}

	private static void print(char[][] doc) {
		for (int i = 0; i < doc.length; i++) {
			System.out.println(doc[i]);
		}
		System.out.println("-----------------");
	}
}
