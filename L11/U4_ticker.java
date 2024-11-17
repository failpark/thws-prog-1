public class U4_ticker {
	public static void main() {
		Ticker ticker = new Ticker(45);
		ticker.set_news("Wettervorhersage: Schee in Wuerzburg".toCharArray());
		System.out.println(ticker.get_news());
		ticker.rotate_news(6);
		System.out.println(ticker.get_news());
	}
}
