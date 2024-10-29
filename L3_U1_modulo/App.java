import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int number = scanner.nextInt();
		scanner.close();
		int result = number % 7;
		if (result == 0) {
			System.out.println("The number is divisible by 7");
		} else {
			System.out.println("The number is not divisible by 7");
		}

		/*
		 * b.1)
		 * Unterschied zwischen modulus und rest.
		 * Java, C, PHP, JS benutzt die symetrische Variante und das vorzeichen vom Operanten wird beibbehalten
		 * Python, Ruby, Perl beispielsweise benutzt die mathematische variante.
		 * https://de.wikipedia.org/wiki/Division_mit_Rest#Modulo
		 * https://stackoverflow.com/a/5385053
		 * 
		 * ==> Das vorzeichen bleibt gleich also negativ
		 * 
		 * b.2)
		 * https://stackoverflow.com/a/2947077
		 * https://docs.oracle.com/javase/specs/jls/se23/html/jls-15.html#jls-15.17.3
		 * 
		 * -> durch rundungsungenauigkeit ist das ergebnis nicht sinnvoll
		 */
	}
}