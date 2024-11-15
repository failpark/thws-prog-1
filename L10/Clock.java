public class Clock {
	private int h;
	private int m;
	private int s;

	public Clock(int h, int m, int s) {
		if (!is_valid(h, m, s)) {
			h = 12;
			m = s = 0;
		}
		this.h = h;
		this.m = m;
		this.s = s;
	}

	private static boolean is_valid(int h, int m, int s) {
		return is_valid_h(h) && is_valid_m(m) && is_valid_m(s);
	}

	private static boolean is_valid_h(int h) {
		return 0 <= h && h < 24;
	}

	private static boolean is_valid_m(int m) {
		return 0 <= m && m < 60;
	}

	public int get_h() { return this.h; }
	public int get_min() { return this.m; }
	public int get_sec() { return this.s; }
	public void set_clock(int h, int m, int s) {
		if (!is_valid(h, m, s)) {
			System.err.println("Invalid time provided");
		}
	}

	public void next_sec() {
		this.s += 1;
		if (this.s == 60) {
			this.s = 0;
			this.next_min();
		}
	}

	private void next_min() {
		this.m += 1;
		if (this.m == 60) {
			this.m = 0;
			this.next_h();
		}
	}

	private void next_h() {
		this.h += 1;
		if (this.h == 24) {
			this.h = 0;
		}
	}
}
