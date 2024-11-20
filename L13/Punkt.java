public class Punkt {
	int a;
	int b;
	int c;

	public double calc_distance() {
		int x = sqr(a) + sqr(b) + sqr(c);
		return Math.sqrt(x);
	}

	private static int sqr(int x) {
		return x * x;
	}

	@Override
	public String toString() {
		return "a=" + a +", b=" + b + ", c=" + c;
	}
}