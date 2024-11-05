import java.util.Scanner;

public class U3_tree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Breite des Baumes: ");
		int width = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < width; i++) {
			print_spaces(width - i);
			print_stars(i + 1);
			System.out.println();
		}
	}

	private static void print_spaces(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}
	}

	private static void print_stars(int stars) {
		for (int i = 0; i < stars; i++) {
			System.out.print("* ");
		}
	}
}
