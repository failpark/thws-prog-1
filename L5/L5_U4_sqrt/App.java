import java.util.Scanner;

public class App {
	static int counter = 0;
	static int orig_x = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		scanner.close();
		orig_x = x;
		// double out_recursion = root_iter(1.0, x);
		// System.out.println("Result: " + out_recursion);
		double out_loop = root_loop(1.0, x);
		print(out_loop);
	}

	private static double root_loop(double guess, double x) {
		counter = 0;
		do {
			counter(guess);
			guess = improve(guess, x);
		} while (!good_enough(guess, x));
		return guess;
	}

	private static void counter(double guess) {
		counter++;
		if (counter == 10 || counter == 100 || counter == 1000 || counter == 10_000) {
			print(guess);
		}
		if (counter > 20_000) {
			System.err.println("Stopped at:" + counter);
			System.err.println("With guess:" + guess);
			System.exit(1);
		}
	}

	private static void print(double guess) {
			System.out.println("Counter:\t" + counter); 
			System.out.println("Guess:\t\t" + guess); 
			System.out.println("Math:\t\t" + Math.sqrt(orig_x)); 
	}

	private static double root_iter(double guess, double x) {
		counter(guess);
		if (good_enough(guess, x)) {
			return guess;
		} else {
			return root_iter(improve(guess, x), x);
		}
	}

	private static double sqrt(double a) {
		return a * a;
	}

	private static double mean(double guess, double x) {
		return (guess + x) / 2.0;
	}

	private static double improve(double guess, double x) {
		return mean(guess, x/guess);
	}

	private static boolean good_enough(double guess, double x) {
		// We can't ues Math.abs ...
		double tmp = sqrt(guess) - x;
		if (tmp < 0) {
			tmp = -tmp;
		}

		return tmp < 0.0000000001;
	}
}