public class App {
	public static void main(String[] args) throws InterruptedException {
		int k = 1;
		double sum = 0;
		while (true) {
			double temp = 1 / Math.pow(k, sum);
			// Thread.sleep(300);
			if (temp < 0.00001) {
				break;
			}
			System.out.println(temp);
			sum += temp;
			k++;
		}
		System.out.println(6.0 * sum);
		// Auswirkung des Faktors 6 auf die Reihe: Aktuell wird der Faktor nur auf die Summe der Reihe angewendet.
		// Der Faktor 6 müsste auf jedes Element der Reihe angewendet werden wenn er in der Reihe steht
	}
}