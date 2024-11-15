public class Room {
	private String name;
	private int size;
	private boolean occupied = false;
	private Student[] students;

	public Room(String name, int size) {
		this.name = name;
		this.size = size;
		this.students = new Student[size];
	}

	public void print_students() {
		for (Student student: students) {
			if (student == null) {
				continue;
			}
			System.out.println(student.get_name() + ":\t\t" + student.get_id());
		}
	}

	public void enter_room(Student student) {
		// we just don't let the student enter
		// we SHOULD probably somehow tell the program that
		// but thats not in the exercise so I won't do that :)
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] == null) {
				this.students[i] = student;
				break;
			}
		}
	}

	public void enter_room(Student[] students) {
		for (Student student : students) {
			this.enter_room(student);
		}
	}

	public Student[] kick_everyone_out() {
		Student[] out = this.students;
		this.students = new Student[this.size];
		return out;
	}

	public void leave_room(Student student) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].get_id() == student.get_id()) {
				this.students[i] = null;
			}
		}
	}

	public void leave_room(Student[] students){
		for (Student student : students) {
			this.leave_room(student);
		}
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
