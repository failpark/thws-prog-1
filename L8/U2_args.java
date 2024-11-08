public class U2_args {
	public static void main(String[] args) {
		if (args.length != 2) {
			throw new RuntimeException("Please provide exactly 2 ints as arguments");
		}

		int result = Integer.valueOf(args[0]) * Integer.valueOf(args[1]);
		System.out.println(result);
	}
}
