import java.util.Locale;
import java.util.Scanner;

public class U2_arithmetic_mean {
	public static void main(String[] args) {
		// Locale.setDefault(Locale.GERMANY);
		// Scanner input = new Scanner(System.in);
		// System.out.print("Anzahl der einzulesended Werte: ");
		// int count_values = input.nextInt();
		// if (count_values < 0) System.exit(1);
		// float[] values = new float[count_values];
		// for (int i = 0; i < count_values; i++) {
			// System.out.print((i + 1) + ". Wert:\t");
			// float val = input.nextFloat();
			// if (val < 0) System.exit(1);
			// values[i] = val;
		// }
		// input.close();
		float[] values = new float[] {3.14f, 2.67f, 6.71f, 1.45f, 5.23f};
		System.out.println("Min:\t\t\t" + min(values));
		System.out.println("Max:\t\t\t" + max(values));
		System.out.println("Arithmetisches Mittel\t" + std_deviation(values));
	}

	private static float min(float[] arr) {
		float min = arr[0];
		for (float val:arr) {
			if (val < min) {
				min = val;
			}
		}
		return min;
	}

	private static float max(float[] arr) {
		float max = arr[0];
		for (float val:arr) {
			if (max < val) {
				max = val;
			}
		}
		return max;
	}

	private static float mean(float[] arr) {
		float sum = 0;
		for(float val: arr) {
			sum += val;
		}
		// return sum / arr.length;
		return (1.0f / arr.length) * sum;
	}

	private static double std_deviation(float[] arr) {
		float sum = 0;
		float mean = mean(arr);
		for (float val : arr) {
			sum += sqr(val - mean);
		}
		// return Math.sqrt(sum / arr.length);
		return Math.sqrt((1.0f / arr.length) * sum);
	}

	private static float sqr(float i) {
		return i * i;
	}
}
