public class Car {
	public String color;
	public String brand;
	public int displacement;
	public static int production_counter = 0;
	private static String[] colors = new String[] {"Crimson", "Teal", "Amber", "Slate Blue", "Olive", "Coral", "Mint Green", "Lavender", "Peach", "Turquoise"};
	private static String[] brands = new String[] {"Toyota", "Ford", "Honda", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Nissan", "Volkswagen", "Hyundai"};

	public Car(String color, String brand, int displacement) {
		this.color = color;
		this.brand = brand;
		if (displacement < 0) {displacement = 1600;}
		this.displacement = displacement;
		Car.production_counter++;
	}

	public void setHubraum(int ccm) {
		if (ccm < 0) {
			return;
		}

		this.displacement = ccm;
	}

	public static Car get_car() {
		int displacement = (int)(Math.random() * 1_000) ;
		return new Car(get_random(colors), get_random(brands), displacement);
	}

	private static String get_random(String[] arr) {
		return colors[(int)(Math.random() * colors.length)];
	}

	@Override
	public String toString() {
		return "Car-Color: " + this.color + "\nCar-Displacement: " + this.displacement + "\nCar-Brand: " + this.brand;
	}
}
