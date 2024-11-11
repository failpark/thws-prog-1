public class U3_room {
	public static void main() {
		Room pool_1 = new Room("I.2.1", 40);
		Room pool_2 = new Room("I.2.15", 20);

		assert pool_1.get_occupied() == false;
		assert pool_2.get_occupied() == false;

		pool_1.set_occupied(true);

		assert pool_1.get_occupied() == false;
		assert pool_2.get_occupied() == false;
	}
}
