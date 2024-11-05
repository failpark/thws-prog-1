import java.util.Scanner;

public class U4_prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime or not");
		int prime = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= prime; i++) {
			System.out.println("Is " + i + " a prime number? " + is_prime(i));
		}
	}

	private static boolean is_prime(int n) {
		// Corner case
		if (n <= 1) {
			return false;
		}

		// for (int i = 2; i < n; i++) {
		// for (int i = 2; i <= n / 2; i++) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}