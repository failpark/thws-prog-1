
public class U5_car {
	public static void main(String[] args) {
		car[] cars = new car[3];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = car.get_car();
			System.out.println(cars[i] + "\n\n\n");
		}
		car biggest_car = biggest_displacement(cars);
		System.out.println("Biggest Car:");
		System.out.println(biggest_car);
	}

	private static car biggest_displacement(car[] cars) {
		car biggest_car = cars[0];
		for (int i = 1; i < cars.length; i++) {
			if (cars[i].displacement > biggest_car.displacement) {
				biggest_car = cars[i];
			}
		}
		return biggest_car;
	}
}
