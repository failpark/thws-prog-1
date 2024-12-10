public class U4_bottle {
	public static void main(String[] args) {
		Bottle a = new Bottle("PROG 1", "SoSe23", 750);
		Bottle b = new Bottle("PROG 1", "SoSe23", -1);

		Bottle.print(a);
		System.out.println("----");
		Bottle.print(b);
	}
}
