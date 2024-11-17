import java.util.Random;

public class U1_max {
	private static Random rand = new Random();
	public static void main() {
		double[][] matrix = gen_random(3, 6);
		print(matrix);
		print(zeilenMaxima(matrix), false);
	}

	public static double[] zeilenMaxima(double[][] matrix) {
		double[] out = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			out[i] = get_max(matrix[i]);
		}
		return out;
	}

	public static double get_max(double[] row) {
		// WHY THE FUCK is this the min value
		// and not Double.MIN_VALUE
		// https://stackoverflow.com/questions/3884793/why-is-double-min-value-in-not-negative
		double max = -Double.MAX_VALUE;
		// double max = 0.0;
		for (int i = 0; i < row.length; i++) {
			if (max < row[i]) max = row[i];
		}
		return max;
	}

	private static double get_random(){
		double min = -10_000;
		double max = 10_000;
		return rand.nextDouble(min, max);
		// return Math.random() * max;
	}

	private static boolean fill_array() {
		return (int)(Math.random() + 0.5) == 1;
	}

	private static double[][] gen_random(int i_depth, int j_depth) {
		double[][] matrix = new double[i_depth][j_depth];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (fill_array()) {
					matrix[i][j] = round(get_random());
				}
			}
		}
		return matrix;
	}

	private static double round(double x) {
		return (int)((x * 10_000.0d) + 0.5) / 10_000.0d;
	}

	private static void print(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("[" + i + "] => ");
			print(matrix[i]);
		}
	}

	private static void print(double[] row) {
		print(row, true);
	}

	private static void print(double[] row, boolean indent) {
		for (int i = 0; i < row.length; i++) {
			String tab = indent ? "\t" : "";
			System.out.println(tab + "[" + i + "] => " + row[i] + ",");
		}
	}
}