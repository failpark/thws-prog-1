import java.util.Scanner;

public class U5_recursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		int base = input.nextInt();
		System.out.print("Exponent: ");
		int exponent = input.nextInt();
		input.close();
		System.out.println(pow(base, exponent));
	}

	private static int pow(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * pow(base, exponent - 1);
		}
	}
}
