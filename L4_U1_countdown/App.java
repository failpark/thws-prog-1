import java.util.concurrent.TimeUnit;

public class App {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 15; i >= 0; i--) {
			System.out.println("Seconds remaining: " + i);
			// Thread.sleep(1000);
			// Using this for better readability
			// This calls Thread.sleep internally after validation
			TimeUnit.SECONDS.sleep(1);
		}
	}
}