public class U2_list {
	public static void main(String[] args) {
		String[] last_names = new String[] {"Müller", "Bauer", "Schreiner", "Fischer", "Schneider"};
		List list = new List();
		for (int i = 0; i < last_names.length; i++) {
			PersonNode item = new PersonNode(rand(), last_names[i]);
			list.insert(item);
		}
		list.print_list();
		System.out.println("---------");
		list.print_list_rev();
	}

	private static int rand() {
		return (int)(Math.random() * 100);
	}
}
