import java.util.Scanner;

public class U1_hangman {
	private static int tries = 15;
	private static boolean finish = false;
	public static void main(String[] args) {
		String[] dictionary = new String[] {
			"Zephyr", "Lantern", "Harmony", "Cascade", "Velvet", "Orbit", "Whisker", "Echo", "Quicksand", "Mirage", "Ember", "Twilight", "Nimbus", "Flicker", "Mosaic", "Driftwood", "Galaxy", "Solstice", "Meadow", "Quiver"
		};
		char[] word = dictionary[(int)(Math.random() * dictionary.length)].toLowerCase().toCharArray();
		// we only have this many tries
		char[] input = new char[tries];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gesucht ist: " + String.valueOf(build_try(input, word)));
		for (int i = 0; i < tries; i++) {
			input[i] = scanner.nextLine().charAt(0);
			System.out.println((i + 1) + ". Versuch: " + String.valueOf(build_try(input, word)));
			if (finish) {
				System.out.println("Final solution after " + (i + 1) + " tries: " + String.valueOf(build_try(input, word)));
				break;
			};
		}
		scanner.close();
	}

	private static char[] build_try(char[] input, char[] word) {
		char[] out = new char[word.length];
		boolean input_missing = false;
		for (int i = 0; i < word.length; i++) {
			if (contains(word[i], input)) {
				out[i] = word[i];
			} else {
				input_missing = true;
				out[i] = '_';
			}
		}
		if (!input_missing) finish = true;
		return out;
	}

	private static boolean contains(char needle, char[] haystack) {
		for (int i = 0; i < haystack.length; i++) {
			if (needle == haystack[i]) return true;
		}
		return false;
	}
}