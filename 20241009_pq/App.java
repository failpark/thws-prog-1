public class App {
	public static void main(String[] args) {
		float p = 3;
		float q = 1;

		// We're not allowed to use Math.pow()
		// we should use (p/2) * (p/2) instead of Math.pow(p/2, 2)
		double under_root = Math.pow(p/2, 2) - q;

		if (under_root < 0) {
			System.out.println("the value under the root is negative");
			System.exit(1);
		}

		double x1 = q/2 + Math.sqrt(under_root);
		double x2 = q/2 - Math.sqrt(under_root);

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}
}