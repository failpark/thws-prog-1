public class PersonNode {
	PersonNode prev;
	PersonNode next;
	int age;
	String last_name;

	public PersonNode(int age, String last_name) {
		this.age = age;
		this.last_name = last_name;
		this.prev = null;
		this.next = null;
	}

	@Override
	public String toString() {
		return "{ age: " + age + ", last_name: " + last_name + "}";
	}
}
