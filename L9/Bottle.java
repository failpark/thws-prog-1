public class Bottle {
	private String name;
	private String text;
	private int capacity; // in ml
	private int current;

	public Bottle(String name, String text, int capacity) {
		this.name = name;
		this.text = text;
		if (capacity < 0) {
			capacity = 1000;
		}
		this.capacity = capacity;
		this.current = capacity;
	}

	public String get_name() {
		return this.name;
	}

	public String get_text() {
		return this.text;
	}

	public int get_capacity() {
		return this.capacity;
	}

	public int get_current() {
		return this.current;
	}

	public static void print(Bottle bottle) {
		System.out.println(
			"Name: " + bottle.get_name()
			+ "\nText: " + bottle.get_text()
			+ "\nCapacity: " + bottle.get_capacity()
			+ "\nCurrent: " + bottle.get_current()
		);
	}
}
