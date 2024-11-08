public class car {
	public String color;
	public String brand;
	public float displacement;
	private static String[] colors = new String[] {"Crimson", "Teal", "Amber", "Slate Blue", "Olive", "Coral", "Mint Green", "Lavender", "Peach", "Turquoise"};
	private static String[] brands = new String[] {"Toyota", "Ford", "Honda", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Nissan", "Volkswagen", "Hyundai"};

	public car(String color, String brand, float displacement) {
		this.color = color;
		this.brand = brand;
		this.displacement = displacement;
	}

	public static car get_car() {
		float displacement = round(Math.random() * 10_000) / 100.0f;
		return new car(get_random(colors), get_random(brands), displacement);
	}

	private static int round(double num) {
		num += 0.5;
		return (int) num;
	}

	private static String get_random(String[] arr) {
		return colors[(int)(Math.random() * colors.length)];
	}

	@Override
	public String toString() {
		return "Car-Color: " + this.color + "\nCar-Displacement: " + this.displacement + "\nCar-Brand: " + this.brand;
	}
}
