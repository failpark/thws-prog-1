import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String line = scanner.nextLine();
		scanner.close();
		if (line.length() != 1) {
			System.out.println("Input should be exactly 1 character");
			System.exit(1);
		}
		// get ascii value of character with casting
		int c = line.charAt(0);
		// upper
		// hex
		// octal
		// binary
		if (c >= 65 && c <= 90) System.out.println("Uppercase letter");
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) System.out.println("Hexadecimal digit");
		if (c >= 48 && c <= 55) System.out.println("Octal digit");
		if (c == 48 || c == 49) System.out.println("Binary digit");
	}
}