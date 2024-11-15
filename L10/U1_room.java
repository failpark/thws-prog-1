public class U1_room {
	public static void main() {
		String[] first_names = {"Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah", "Ivan", "Julia"};
		String[] last_names = {"Smith", "Johnson", "Brown", "Williams", "Jones", "Garcia", "Miller", "Davis", "Martinez", "Lopez"};
		Room room = new Room("I.2.1", 20);
		for (int i = 10; i < 30; i++) {
			Student student = new Student(
				first_names[(int)(Math.random() * 10)],
				last_names[(int)(Math.random() * 10)],
				"51240" + i
			);
			room.enter_room(student);
		}
		room.print_students();
		room.kick_everyone_out();
		room.print_students();
	}
}
