import java.util.Calendar;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a year: ");
		int year = scanner.nextInt();
		scanner.close();
		System.out.println(String.format("%s is %sa leap year", year, cal_leap_year(year) ? "" : "not "));
		System.out.println(String.format("%s is %sa leap year", year, leap_year(year) ? "" : "not "));
	}

	private static boolean cal_leap_year(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
	}

	private static boolean leap_year(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 100 != 0) {
			return true;
		} else if (year % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
}