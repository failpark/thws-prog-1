public class U3_calc {
	public static void main(String[] args) {
		int result = 0;
		switch (args[args.length - 1]) {
			case "+":
				result = add(args);
				break;
			case "-":
				result = sub(args);
				break;
			default:
				throw new RuntimeException("Invalid Syntax");
		}
		System.out.println(result);
	}

	private static int add(String[] args) {
		int num = Integer.valueOf(args[0]);
		for (int i = 1; i < (args.length - 1); i++) {
			num += Integer.valueOf(args[i]);
		}
		return num;
	}

	private static int sub(String[] args) {
		int num = Integer.valueOf(args[0]);
		for (int i = 1; i < (args.length - 1); i++) {
			num -= Integer.valueOf(args[i]);
		}
		return num;
	}
}
