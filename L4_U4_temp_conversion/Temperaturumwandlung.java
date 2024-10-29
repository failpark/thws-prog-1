public class Temperaturumwandlung {
	public static void main(String[] args) {
		System.out.println("Fahrenheit\tCelsius");
		for (int i = 0; i <= 300; i++) {
			float celsius_f = fahrenheit_to_celsius(i);
			float celsius_round = round(celsius_f * 100f) / 100f;
			String celsius = "" + celsius_round;
			// String celsius = String.format("%.2f", celsius_f);
			System.out.println(i + "\t\t" + celsius);
			// System.out.printf(i + "\t\t%.2f\n", celsius_f);
		}
	}

	private static float fahrenheit_to_celsius(float fahrenheit) {
		return (fahrenheit - 32) * 5.0f / 9.0f;
	}

	private static float round(float value) {
		value = value + 0.5f;
		value = (int) value;
		return value;
	}
}