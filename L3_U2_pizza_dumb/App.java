import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	static class Pizza {
		private int size;
		private float prize;
		private double area;
		private double prize_per_area;

		public Pizza(int size, int prize) {
			this.size = size;
			this.prize = prize;
		}

		public double get_area() {
			if (this.area != 0.0) {
				return this.area;
			}
			this.area = Math.PI * ((size / 2.0f) * (size / 2.0f));
			return this.area;
		}

		public double get_prize_per_area() {
			if (this.prize_per_area != 0.0) {
				return this.prize_per_area;
			}
			this.prize_per_area = prize / get_area();
			this.prize_per_area = round(this.prize_per_area * 10_000.0) / 100.0;
			return this.prize_per_area;
		}

		private static double round(double value) {
			value = value + 0.5;
			value = (int) value;
			return value;
		}
	}

	public static void main(String[] args) {
		File file = new File("input.txt");
		Pizza pizza_1;
		Pizza pizza_2;
		try {
			Scanner scanner = new Scanner(file);
			pizza_1 = new Pizza(scanner.nextInt(), scanner.nextInt());
			pizza_2 = new Pizza(scanner.nextInt(), scanner.nextInt());
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
			return;
		}
		double pizza_1_prize = pizza_1.get_prize_per_area();
		double pizza_2_prize = pizza_2.get_prize_per_area();
		int better_pizza = pizza_1_prize < pizza_2_prize ? 0 : 1;
		// sinze we memoize the values we can just "compute" them again
		if (pizza_1_prize != pizza_2_prize) {
			print_pizzas(better_pizza, pizza_1, pizza_2);
		} else {
			System.out.println("Both pizzas have the same prize per area: " + pizza_1_prize + " cent/cm²");
		}
	}

	private static void print_pizzas(int num_winner, Pizza winner, Pizza loser) {
		String out = "Pizza " + (num_winner + 1) + " is better since it has a prize per area of: " + winner.get_prize_per_area() + " cent/cm² instead of " + loser.get_prize_per_area() + " cent/cm²";
		System.out.println(out);
	}
}
