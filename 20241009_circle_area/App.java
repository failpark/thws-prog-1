public class App {
	public static void main(String[] args) {
		int r = 10;
		double kreis_flaeche = Math.PI * Math.pow(r, 2);
		double kreis_umfang = 2 * Math.PI * r;

		System.out.println("Kreisfläche: " + kreis_flaeche);
		System.out.println("Kreisumfang: " + kreis_umfang);

		double kugel_volumen = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);

		System.out.println("Kugelvolumen: " + kugel_volumen);
	}
}