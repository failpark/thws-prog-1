import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Matrikelnummer: ");
		String matrikelnummer = scanner.nextLine();
		scanner.close();
		if (matrikelnummer.length() != 7) {
			System.out.println("Matrikelnummer muss 7-stellig sein.");
			return;
		}
		// Alternative falls substring nicht erlaubt:
		// char beginning = matrikelnummer.charAt(0);
		// char second = matrikelnummer.charAt(1);
		// if (beginning != '5'
			// && (second != '1'
				// || second != '0')
		// ) {
			// System.out.println("Matrikelnummer muss mit 50, 51 oder 61 beginnen.");
			// System.exit(1);
		// }
		// if (beginning != '6'
			// && second != '1'
		// ) {
			// System.out.println("Matrikelnummer muss mit 50, 51 oder 61 beginnen.");
			// System.exit(1);
		// }
		String beginning = matrikelnummer.substring(0, 2);
		switch (beginning) {
			case "50":
			case "51":
			case "61":
				break;
			default:
				System.out.println("Matrikelnummer muss mit 50, 51 oder 61 beginnen.");
				System.exit(1);
		}
		// for (int i = 2; i < 7; i++) {
			// if (matrikelnummer.charAt(i) < '0' || matrikelnummer.charAt(i) > '9') {
				// System.out.println("Matrikelnummer darf nur aus Zahlen bestehen.");
				// return;
			// }
		// }
		// Check if the rest of the string is a number
		// just parse and catch the error?
		try {
			Integer.parseInt(matrikelnummer);
			System.out.println("Matrikelnummer ist korrekt.");
		} catch (NumberFormatException e) {
			System.out.println("Matrikelnummer darf nur aus Zahlen bestehen.");
		}
	}
}