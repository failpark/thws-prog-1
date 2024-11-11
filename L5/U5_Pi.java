import java.util.Scanner;

public class U5_Pi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mit wie vielen Rechtecken soll PI angenähert werden?");
		int rectangles = scanner.nextInt();
		scanner.close();

		double pi = 0;
		double x = 1;

		for (int i = 1; i <= rectangles; i++) {
			// * 4, weil wir mit den Rechtecken nur ein Viertel eines Kreises annähern
			pi += (1.0 / rectangles) * x * 4;

			// x ergibt sich immer aus dem Satz des Pythagoras vom Dreieck dessen Hypotenuse der Radius (1) ist, der bis zur oberen linken Ecke des i-ten Rechtecks zeigt
			x = Math.sqrt(1 - sq(i * (1.0 / rectangles)));
		}

		System.out.println("Angenähert:\t" + pi);
		System.out.println("Math.PI:\t" + Math.PI);
		System.out.println("Delta:\t\t" + (pi - Math.PI));
	}

	private static double sq(double x) {
		return x * x;
	}
}