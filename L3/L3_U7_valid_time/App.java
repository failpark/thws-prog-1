import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Please input 3 numbers seperated by a space: ");
		Scanner scanner = new Scanner(System.in);
		String nums = scanner.nextLine();
		scanner.close();
		String[] array_strings = nums.split(" ");
		if (array_strings.length != 3) {
			System.out.println("Please input 3 numbers seperated by a space.");
			System.exit(1);
		}
		ArrayList<Integer> array_nums = new ArrayList<Integer>();
		try {
			for (String num : array_strings) {
				array_nums.add(Integer.parseInt(num));
			}
		} catch (NumberFormatException e) {
			System.out.println("It has to be 3 NUMBERS");
			System.exit(1);
		}

		if (!(array_nums.get(0) >= 0 && array_nums.get(0) < 24)) {
			System.out.println("The first number has to be between 0 and 23");
			System.exit(1);
		}
		for (int i = 1; i < 3; i++) {
			if (!(array_nums.get(i) >= 0 && array_nums.get(i) < 60)) {
				System.out.println("The second and third number has to be between 0 and 59");
				System.exit(1);
			}
		}
		System.out.println("Yay! Your time '" + format_for_out(array_nums.get(0)) + ":" + format_for_out(array_nums.get(1)) + ":" + format_for_out(array_nums.get(2)) + "' is valid.");
	}

	private static String format_for_out(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return Integer.toString(num);
	}
}