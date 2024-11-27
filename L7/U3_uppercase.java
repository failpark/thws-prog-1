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
			// Solution if you know the ASCII values by heart
			// (in the test)
			// https://www.ascii-code.net/
			int tmp = (int)arr[i];
			if (tmp >= 97 && tmp <= 122) {
				tmp -= 32;
				arr[i] = (char)tmp;
			}
			// Solution if you don't
			// if (arr[i] >= 'a' && arr[i] <= 'z') {
				/*
				'a' gets autocastet to int
				       97  -  65
				          32
				       'b' - 'B'
				       'z' - 'Z'
				*/
				// arr[i] -= 'a' - 'A';
			// }
		}
		return arr;
	}
}
