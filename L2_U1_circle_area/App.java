public class App {
	public static void main(String[] args) {
		int r = 10;
		// if we can't use Math.PI, we could use 3.1415
		// if we can't use Math.pow, we could use r * r
		// it's just more readable and easier to understand this way
		double kreis_flaeche = Math.PI * Math.pow(r, 2);
		double kreis_umfang = 2 * Math.PI * r;

		System.out.println("Kreisfläche: " + kreis_flaeche);
		System.out.println("Kreisumfang: " + kreis_umfang);

		// same here with Math.PI and Math.pow as above
		double kugel_volumen = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);

		System.out.println("Kugelvolumen: " + kugel_volumen);
	}
}