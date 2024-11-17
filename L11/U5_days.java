import java.util.Scanner;

public class U5_days {
	public static void main() {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Please input a valid month: ");
				System.out.println(tageImMonat(input.nextLine()));
				break;
			} catch (RuntimeException e) {
				System.err.println(e.getMessage());
			}
		}
		input.close();
	}

	public static int tageImMonat(String monat) {
		return switch (monat) {
			case "Februar" -> 28;
			case "April", "Juni", "September", "November" -> 30;
			case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
			default -> throw new RuntimeException("falscher Monat");
		};
	}
}
