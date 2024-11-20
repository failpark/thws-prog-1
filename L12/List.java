public class List {
	private PersonNode start_node;

	public void insert(PersonNode item) {
		// clean item
		item.prev = null;
		item.next = null;

		if (start_node == null) {
			start_node = item;
			return;
		}

		PersonNode iter = start_node;
		// check edgecase first
		if (item.age < start_node.age) {
			item.next = start_node;
			start_node.prev = item;
			start_node = item;
			return;
		}

		while(iter.next != null) {
			if (item.age < iter.age) {
				insert_item(iter.prev, item, iter);
				return;
			}
			iter = iter.next;
		}
		if (item.age < iter.age) {
			insert_item(iter.prev, item, iter);
		} else {
			iter.next = item;
			item.prev = iter;
		}
	}

	private static void insert_item(PersonNode prev, PersonNode item, PersonNode next) { 
		// status quo is
		// prev.next = next
		// next.prev = prev

		// at this point next.prev and item.prev point to prev
		item.prev = prev;
		// cut pointer from prev.next to next
		prev.next = item;
		// set item of next.prev = prev to our current item
		next.prev = item;
		// up until this point we have
		// prev <-> item <- next
		item.next = next;
	}

	public PersonNode find(String needle) {
		PersonNode iter = this.start_node;
		while (iter.next != null) {
			if (iter.last_name == needle) {
				return iter;
			}
			iter = iter.next;
		}
		return null;
	}

	public void print_list() {
		PersonNode iter = start_node;
		while (iter != null) {
			System.out.println(iter);
			if (iter.next != null) {
				System.out.println("⤵️");
			}
			iter = iter.next;
		}
	}

	public void print_list_rev() {
		PersonNode iter = start_node;
		// we can't access the last element directly
		// so we have to traverse the whole list to the end
		// and then we can go back up
		while (iter.next != null) {
			iter = iter.next;
		}
		// now we know that iter is our last element;
		while (iter != null) {
			System.out.println(iter);
			if (iter.prev != null) {
				System.out.println("⤵️");
			}
			iter = iter.prev;
		}
	}
}
