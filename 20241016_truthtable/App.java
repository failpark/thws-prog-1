import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two chars (t & f) separated by space: ");
		String chars = scanner.nextLine();
		scanner.close();
		String[] charArray = chars.split(" ");
		if (charArray.length != 2) {
			String msg = "Please enter two chars separated by space.";
			throw new RuntimeException(msg);
			// System.out.println("Please enter two chars separated by space.");
			// return;
		}
		char first = charArray[0].charAt(0);
		char second = charArray[1].charAt(0);
		if (!is_valid(first) || !is_valid(second)) {
			String msg = "Please enter valid chars (t & f).";
			throw new RuntimeException(msg);
			// System.out.println("Please enter valid chars (t & f).");
			// return;
		}
		int first_i = (first == 't') ? 2 : 0;
		int second_i = (second == 't') ? 1 : 0;
		System.out.println("The result is: " + (first_i + second_i));
	}

	private static boolean is_valid(char input) {
		return (input == 't' || input == 'f');
	}
}