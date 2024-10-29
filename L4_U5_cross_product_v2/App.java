import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print("Geben Sie bitte eine Zahl ein: ");
			try {
				input = scanner.nextInt();
				if (input >= 1 && input <= 1_000_000) {
					break;
				}
			} catch (Exception e) {
				// do nothing
				// fall through to the next line
			}
			System.out.println("FEHLER – Zahl ist ungueltig.");
		}
		scanner.close();
		String str_input = "" + input;
		int product = 1;
		for (int i = 0; i < str_input.length(); i++) {
			int curr_factor = input % 10;
			input = input / 10;
			product *= curr_factor;
		}
		System.out.println("Das Querprodukt der Zahl " + str_input + " ist: " + product);
	}
}