import java.util.Scanner;

public class U4_blang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("write a word");
		String word = input.nextLine();
		input.close();
		System.out.println(bgame(word));
	}

	private static String bgame(String word) {
		char[] old_word = word.toCharArray();
		char[] new_word = new char[old_word.length + (count_vowels(old_word) * 2)];
		// we need a seperate index since old and new will differ
		int index = 0;
		for (int i = 0; i < old_word.length; i++) {
			if (is_vowel(old_word[i])) {
				new_word[index] = old_word[i];
				new_word[index + 1] = 'b';
				new_word[index + 2] = old_word[i];
				index += 3;
			} else {
				new_word[index] = old_word[i];
				index += 1;
			}
		}
		return String.valueOf(new_word);
	}

	private static int count_vowels(char[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (is_vowel(arr[i])) count ++;
		}
		return count;
	}

	private static boolean is_vowel(char val) {
		switch (val) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default:
				return false;
		}
	}
}
