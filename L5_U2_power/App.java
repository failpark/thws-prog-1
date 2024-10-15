import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base number: ");
		double b = scanner.nextDouble();
		System.out.print("Enter the exponent:");
		int n = scanner.nextInt();
		scanner.close();
		double result = get_power(b, n);
		System.out.println("The result is: " + result);
	}

	private static double get_power(double b, int n) {
		double value = 1;
		// we don't need to check for n == 0 since we skip the loop
		int counter = n;
		if (counter < 0) {
			counter = -counter;
		}
		for (int i = 1; i <= counter; i++) {
			value = value * b;
		}
		if (n < 0) {
			value = 1/value;
		}
		return value;
	}
}