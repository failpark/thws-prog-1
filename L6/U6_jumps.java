import java.util.Scanner;

public class U6_jumps {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Distanz: ");
		int dist = scanner.nextInt();
		System.out.println("Sprungweite: ");
		int jump_1 = scanner.nextInt();
		System.out.println("Sprungweite: ");
		int jump_2 = scanner.nextInt();
		scanner.close();

		// for simplicity we want jump_1 to be the smaller jump_2
		if (jump_1 > jump_2) {
			int temp = jump_1;
			jump_1 = jump_2;
			jump_2 = temp;
		}

		System.out.println(count(dist, jump_1, jump_2));
	}

	private static int count(int dist, int jump_1, int jump_2) {
		if (dist == 0) return 1;
		if (dist < 0) return 0;
		return count(dist - jump_1, jump_1, jump_2) + count(dist - jump_2, jump_1, jump_2);
	}
}
