import java.util.Scanner;

public class U1_round {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		System.out.print("How many decimal places do you want to round to? ");
		int decimal_places = input.nextInt();
		input.close();
		System.out.println(round_helper(num, decimal_places));
	}

	private static double round(double num) {
		num += 0.5;
		return (int) num;
	}

	private static double round_helper(double num, int decimal_places) {
		int dec = 1;
		for (int i = 0; i < decimal_places; i++) {
			dec *= 10;
		}
		return round(num * dec) / dec;
	}
}