import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	static class Pizza {
		int size;
		int prize;
		double area;
		double prize_per_area;

		public Pizza(int size, int prize) {
			this.size = size;
			this.prize = prize;
		}

		public double get_area() {
			if (this.area != 0.0) {
				return this.area;
			}
			this.area = Math.PI * Math.pow((size / 2), 2);
			return this.area;
		}

		public double get_prize_per_area() {
			if (this.prize_per_area != 0.0) {
				return this.prize_per_area;
			}
			this.prize_per_area = prize / get_area();
			this.prize_per_area = Math.round(this.prize_per_area * 10000.0) / 100.0;
			return this.prize_per_area;
		}

		@Override
		public String toString() {
			return "Pizza [size=" + size + ", prize=" + prize + "]";
		}
	}

	public static void main(String[] args) {
		File file = new File("input.txt");
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				Pizza pizza = new Pizza(scanner.nextInt(), scanner.nextInt());
				pizzas.add(pizza);
				// Assignment says to read only 2 pizzas
				if (pizzas.size() == 2) {
					break;
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println(Arrays.toString(pizzas.toArray()));
		double pizza_1 = pizzas.get(0).get_prize_per_area();
		double pizza_2 = pizzas.get(1).get_prize_per_area();
		int better_pizza = pizza_1 < pizza_2 ? 0 : 1;
		int worse_pizza = pizza_1 > pizza_2 ? 0 : 1;
		// sinze we memoize the values we can just "compute" them again
		if (pizza_1 != pizza_2) {
			String out = String.format("Pizza %s is better sinze it has a prize per area of: %s cent/cm² instead of %s cent/cm²", (better_pizza + 1), pizzas.get(better_pizza).get_prize_per_area(), pizzas.get(worse_pizza).get_prize_per_area());
			System.out.println(out);
		} else {
			System.out.println("Both pizzas have the same prize per area: " + pizza_1 + " cent/cm²");
		}
	}
}
