public class Student {
	private String first_name;
	private String last_name;
	private String id;

	public Student(String first_name, String last_name, String id) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
	}

	public String get_id() {
		return this.id;
	}

	public String get_name() {
		return this.first_name + " " + this.last_name;
	}
}
