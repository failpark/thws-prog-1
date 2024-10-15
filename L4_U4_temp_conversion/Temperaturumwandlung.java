public class Temperaturumwandlung {
	public static void main(String[] args) {
		System.out.println("Fahrenheit\tCelsius");
		for (int i = 0; i <= 300; i++) {
			float celsius_f = fahrenheit_to_celsius(i);
			float celsius_round = Math.round(celsius_f * 100f) / 100f;
			String celsius = "" + celsius_round;
			// String celsius = String.format("%.2f", celsius_f);
			System.out.println(i + "\t\t" + celsius);
			// System.out.printf(i + "\t\t%.2f\n", celsius_f);
		}
	}

	private static float fahrenheit_to_celsius(float fahrenheit) {
		// Why does 5/9 * (fahrenheit - 32) not work?
		// What is the difference?
		return (fahrenheit - 32) * 5 / 9;
	}
}