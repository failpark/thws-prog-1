public class U2_clock {
	public static void main() {
		Clock[] weltuhr = gen_clocks();
		count_up(weltuhr);
	}

	private static Clock[] gen_clocks() {
		Clock[] clocks = new Clock[24];
		for (int i = 0; i < clocks.length; i++) {
			clocks[i] = new Clock(i, 23, 7);
		}
		return clocks;
	}

	private static void count_up(Clock[] clocks) {
		for (int i = 0; i < clocks.length; i++) {
			clocks[i].next_sec();
		}
	}
}
