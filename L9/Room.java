public class Room {
	private String name;
	private int size;
	private boolean occupied = false;

	public Room(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String get_name() {
		return this.name;
	}

	public int get_size() {
		return this.size;
	}

	public boolean get_occupied() {
		return this.occupied;
	}

	public void set_occupied(boolean occupied) {
		this.occupied = occupied;
	}
}
