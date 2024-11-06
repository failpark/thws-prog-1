import java.util.Scanner;

public class U3_uppercase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input chars: ");
		char[] in = input.nextLine().toCharArray();
		input.close();
		System.out.println(uppercase(in));
	}

	private static char[] uppercase(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int)arr[i];
			if (tmp >= 97 && tmp <= 122) {
				tmp -= 32;
				arr[i] = (char)tmp;
			}
		}
		return arr;
	}
}
