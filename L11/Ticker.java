public class Ticker {
	private char[] news_buffer;

	public Ticker(int size) {
		if (size <= 0) {
			size = 200;
		}
		this.news_buffer = new char[size];
		this.reset_news(' ');
	}

	public int get_size() {
		return this.news_buffer.length;
	}

	public void set_news(char[] news) {
		for (int i = 0; i < this.news_buffer.length; i++) {
			if (i < news.length) {
				this.news_buffer[i] = news[i];
			} else {
				this.news_buffer[i] = '+';
			}
		}
	}

	public char[] get_news() {
		return this.news_buffer;
	}

	public void reset_news(char symbol) {
		for (int i = 0; i < this.news_buffer.length; i++) {
			this.news_buffer[i] = symbol;
		}
	}

	public void reset_news() {
		this.reset_news('+');
	}

	public void rotate_news(int distance) {
		if (distance <= 0) {
			return;
		}
		char[] buff = new char[this.get_size()];
		for (int i = distance; i < this.news_buffer.length; i++) {
			buff[i - distance] = this.news_buffer[i];
		}
		for (int i = 0; i < distance; i++) {
			buff[this.news_buffer.length - distance + i] = this.news_buffer[i];
		}
		this.news_buffer = buff;
	}
}
