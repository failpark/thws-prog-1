import java.util.Scanner;

public class App {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		int seconds = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= seconds; i += 5) {
		// for (int i = 0; i <= seconds; i++) {
			System.out.println("At " + i + " seconds, the object has fallen " + distance_fallen(i) + " meters.");
			Thread.sleep(1000);
		}
	}

	private static double distance_fallen(int seconds) {
		double distance = 0.5 * 9.80665 * square(seconds);
		return distance;
	}

	private static int square(int number) {
		return number * number;
	}
}