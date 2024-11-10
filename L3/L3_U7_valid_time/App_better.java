import java.util.Scanner;

public class App_better {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter hours:");
		int hours = scanner.nextInt();
		System.out.println("Please enter minutes:");
		int minutes = scanner.nextInt();
		System.out.println("Please enter seconds:");
		int seconds = scanner.nextInt();
		scanner.close();
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
			System.out.println("Invalid time");
			System.exit(1);
		}
		System.out.println("Yay! Your time '" + format_for_out(hours) + ":" + format_for_out(minutes) + ":" + format_for_out(seconds) + "' is valid.");
	}
	
	private static String format_for_out(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return Integer.toString(num);
	}
}
