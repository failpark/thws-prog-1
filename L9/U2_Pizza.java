public class U2_Pizza {
	public static void main(String[] args) {
		String[] names = {"Margherita", "Pepperoni", "BBQ Chicken", "Hawaiian", "Veggie"};
		Pizza[] pizzas = new Pizza[names.length];
		for (int i = 0; i < names.length; i++) {
			pizzas[i] = gen_pizza(names[i], get_random_int(7));
			print_best_ratio(pizzas[i]);
			System.out.print("\n\n\n");
		}
	}

	private static void print_best_ratio(Pizza pizza) {
		System.out.println(pizza);
		System.out.println("Pizza: " + pizza.name + " has " + pizza.options.length + " different sizes.\nThe best one costs "
			+ pizza.get_best_value().get_prize() + " and has the following diameter: " + pizza.get_best_value().get_diameter()
		);
	}

	private static Pizza gen_pizza(String name, int sizes) {
		PrizeDiam[] options = new PrizeDiam[sizes];
		for (int i = 0; i < options.length; i++) {
			options[i] = gen_PrizeDiam();
		}
		return new Pizza(name, options);
	}

	private static PrizeDiam gen_PrizeDiam() {
		return new PrizeDiam(get_random(200), get_random(50));
	}

	private static float get_random(int upper) {
		return ((int)(Math.random() * (upper * 100))) / 100.0f;
	}

	private static int get_random_int(int upper) {
		return (int)(Math.random() * upper) + 1;
	}
}
