import java.util.Scanner;

public class Tree {
	Node root;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// we have to label the loop in order to break out of it in the switch
		int input;
		Tree tree = new Tree();
		loop: while (true) {
			print_menu();
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				System.err.println("Only numbers please");
				scanner.nextLine();
				continue;
			}
			// https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
			// 👀 what the actual...
			// we need to consume the \n with this:
			scanner.nextLine();
			switch (input) {
				case 1:
					tree.print_insert(scanner);
					break;
				case 2:
					tree.print_search(scanner);
					break;
				case 3:
					System.out.println("Nothing to do");
					break;
				case 4:
					System.out.println("Exiting...");
					break loop;
				default:
					System.out.println("Wrong input");
					break;
			}
			tree.print();
		}
		scanner.close();
	}

	public static void print_menu() {
		System.out.println("Menü:\n(1) Einfügen\n(2) Suche\n(3) Löschen\n(4) Exit");
	}

	public void print_search(Scanner scanner) {
		System.out.println("Please input a word to search:");
		String word = scanner.nextLine();
		String match = this.search(word);
		if (match == null) {
			System.out.println("Could not find word");
		} else {
			System.out.println("The definition for the word is: ");
			System.out.println(match);
		}
	}

	public void print_insert(Scanner scanner) {
		System.out.println("Please input a word to insert:");
		String word = scanner.nextLine();
		System.out.println("Please enter a definition:");
		String definition = scanner.nextLine();
		Node node = new Node();
		node.word = word;
		node.definition = definition;
		insert(node);
	}

	public void insert(Node node) {
		if (root == null) {
			root = node;
		} else {
			insert(root, node);
		}
	}

	private void insert(Node tmp, Node node) {
		if (node.word.compareTo(tmp.word) < 0) {
			if (tmp.left == null) {
				tmp.left = node;
			} else {
				insert(tmp.left, node);
			}
		} else {
			if (tmp.right == null) {
				tmp.right = node;
			} else {
				insert(tmp.right, node);
			}
		}
	}

	public void print() {
		print(root);
	}

	private void print(Node node) {
		if (node.left != null) print(node.left);
		System.out.println(node.word);
		if (node.right != null) print(node.right);
	}

	public String search(String word) {
		return search(word, root);
	}

	public String search(String word, Node node) {
		if (node == null) {
			return null;
		}
		if (node.word.equals(word)) {
			return node.definition;
		}
		if (node.word.compareTo(word) < 0) {
			return search(word, node.left);
		} else {
			return search(word, node.right);
		}
	}

	public void delete(Node node, Node predicessor) {
		if (node.left == null && node.right == null) {
			node = null;
			return;
		}

		// cool beans just replace node with node.left
		if (node.left != null && node.right == null) {
			// get which side we are on
			if (predicessor.left == node) {
				predicessor.left = node.left;
			} else {
				predicessor.right = node.left;
			}
		} else if (node.right != null && node.left == null) {
			if (predicessor.left == node) {
				predicessor.left = node.right;
			} else {
				predicessor.right = node.right;
			}
		} else {
			// ULTRA cool beans :)
			// now traverse till we find the nearest null? AND resort
			// this is def. a problem for future daniel ...
		}
		node = null;
	}
}
