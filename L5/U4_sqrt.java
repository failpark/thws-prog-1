import java.util.InputMismatchException;
import java.util.Scanner;

public class U4_sqrt {
	public static void main(String[] args) {
		System.out.print("Enter a number for an estimate of its square root: ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		if (num < 0) throw new InputMismatchException("Input must be positive and defined in R");
		double guess = 1;

		for(int i = 1; i < 100000; i++){
			guess = ((num / guess) + guess) / 2;
		}
		System.out.println(guess);
	}
}