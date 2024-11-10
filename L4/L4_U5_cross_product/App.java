import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		while (true) {
			System.out.print("Geben Sie bitte eine Zahl ein: ");
			input = scanner.nextLine();
			if (is_valid(input)) {
				break;
			}
			System.out.println("FEHLER – Zahl ist ungueltig.");
		}
		scanner.close();
		// could use a for loop with input.length & call charAt(i) instead of split
		String[] nums_str = input.split("");
		ArrayList<Integer> digits = new ArrayList<>();
		for (int i = 0; i < nums_str.length; i++) {
			digits.add(Integer.parseInt(nums_str[i]));
		}
		int product = 1;
		for (int digit : digits) {
			product *= digit;
		}
		System.out.println("Das Querprodukt der Zahl " + input + " betraegt " + product);
	}

	private static boolean is_valid(String n) {
		try {
			int input = Integer.parseInt(n);
			return (input >= 1 && input <= 1_000_000);
		} catch (NumberFormatException e) {
			return false;
		}
	}
}