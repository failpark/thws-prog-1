public class U6_lotto {
	public static void main(String[] args) {
		System.out.print(format_array(min_sort(lotto())));
	}

	private static String format_array(int[] arr) {
		String out = "arr: \n";
		for (int i = 0; i < arr.length; i++) {
			out += "[" + i + "] = " + arr[i] + "\n";
		}
		return out;
	}

	private static int[] min_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// this is the index of the current minimum we found
			int idx = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}

	private static int[] lotto() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 49) + 1;
			while (contains(lotto, num)) {
				num = (int) (Math.random() * 49) + 1;
			}
			lotto[i] = num;
		}
		return lotto;
	}

	private static boolean contains(int[] arr, int num) {
		for (int i : arr) {
			if (i == num) {
				return true;
			}
		}
		return false;
	}
}
