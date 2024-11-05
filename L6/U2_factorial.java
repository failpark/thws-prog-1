import java.util.Scanner;

public class U2_factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fakultät von: ");
		int x = scanner.nextInt();
		scanner.close();
		System.out.println(factorial(x));
	}

	private static long factorial(int x) {
		if (x > 20) {
			throw new RuntimeException("Die gewählte Zahl ist zu groß");
		}
		long factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}
		return factorial;
	}
}