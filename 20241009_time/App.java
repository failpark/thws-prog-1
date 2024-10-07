import java.time.LocalTime;

public class App {
	public static void main(String[] args) {
		// d) init with current time
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();

		// a) seconds since midnight
		int total_seconds = hour * 3600 + min * 60 + sec;
		System.out.println("Seconds since midnight: " + total_seconds);

		// b) seconds remaining in the day
		//                       s    m    h
		int remaining_seconds = 60 * 60 * 24 - total_seconds;
		System.out.println("Seconds remaining in the day: " + remaining_seconds);

		// c) percentage of the day that has passed
		double percentage = (double) ((float)total_seconds / (60 * 60 * 24) * 100);
		System.out.println("Percentage of the day that has passed: " + percentage + "%");
	}
}