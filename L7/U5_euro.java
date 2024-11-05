public class U5_euro {
	public static void main(String[] args) {
		int found = 0;
		for (int i = 0; i < 10_000; i++) {
			boolean[] desk = desk();
			if (!desk[0] && !desk[1] && desk[2]) {
				found++;
			}
		}
		System.out.println((double) found / 10_000.0);
	}

	private static boolean[] desk() {
		if (Math.random() < 0.5) {
			boolean[] desk = new boolean[3];
			int random = (int) (Math.random() * 3);
			desk[random] = true;
			return desk;
		} else {
			return new boolean[3];
		}
	}
}
