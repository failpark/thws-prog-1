public class App {
	public static void main(String[] args) {
		System.out.println(get_string(throw_die()));
	}

	public static int throw_die() {
		return (int) (Math.random() * 6) + 1;
	}

	public static String get_string(int die) {
		switch (die) {
			case 1:
				return "Eins gewürfelt!";
			case 2:
				return "Zwei gewürfelt!";
			case 3:
				return "Drei gewürfelt!";
			case 4:
				return "Vier gewürfelt!";
			case 5:
				return "Fünf gewürfelt!";
			case 6:
				return "Sechs gewürfelt!";
			default:
				return "Undefinierte Zahl gewürfelt!";
		}
	}
}